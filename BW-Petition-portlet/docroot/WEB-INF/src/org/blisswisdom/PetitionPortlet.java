package org.blisswisdom;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.blisswisdom.model.Petition;
import org.blisswisdom.service.AttachmentLocalServiceUtil;
import org.blisswisdom.service.CommentsUpdateLocalServiceUtil;
import org.blisswisdom.service.PetitionLocalServiceUtil;
import org.blisswisdom.service.PlusSignerLocalServiceUtil;
import org.blisswisdom.util.Constants;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.model.CompanyConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.store.DLStoreUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class PetitionPortlet
 */
public class PetitionPortlet extends MVCPortlet {

	public void addPetition(ActionRequest actionRequest,
			ActionResponse actionResponse) throws SystemException,
			PortalException {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		UploadPortletRequest uploadRequest = PortalUtil
				.getUploadPortletRequest(actionRequest);

		ThemeDisplay themeDisplay = (ThemeDisplay) uploadRequest
				.getAttribute(WebKeys.THEME_DISPLAY);

		long companyId = themeDisplay.getCompanyId();
		long groupId = themeDisplay.getScopeGroupId();
		long userId = themeDisplay.getUser().getUserId();
		String userName = themeDisplay.getUser().getFullName();
		Date now = new Date();
		Date createDate = now;
		Date modifiedDate = now;

		String petitionNumber = ParamUtil.getString(uploadRequest,
				"petitionNumber");
		Date publishDate = ParamUtil.getDate(uploadRequest, "publishDate",
				dateFormat, null);
		String signUnit = ParamUtil.getString(uploadRequest, "signUnit");
		String signer = ParamUtil.getString(uploadRequest, "signer");
		String designee = ParamUtil.getString(uploadRequest, "designee");
		String plusSign = ParamUtil.getString(uploadRequest, "plusSign");
		String subject = ParamUtil.getString(uploadRequest, "subject");
		String explanation = ParamUtil.getString(uploadRequest, "explanation");

		String comments = ParamUtil.getString(uploadRequest, "comments");
		String commentsByMonk = ParamUtil.getString(uploadRequest,
				"commentsByMonk");
		String commentsByManagement = ParamUtil.getString(uploadRequest,
				"commentsByManagement");
		String commentsByCEO = ParamUtil.getString(uploadRequest,
				"commentsByCEO");
		String commentsByAides = ParamUtil.getString(uploadRequest,
				"commentsByAides");

		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				Petition.class.getName(), uploadRequest);

		Petition petition = PetitionLocalServiceUtil.addPetition(companyId,
				groupId, userId, userName, createDate, modifiedDate,
				petitionNumber, publishDate, signUnit, signer, designee,
				plusSign, subject, explanation, comments, commentsByMonk,
				commentsByManagement, commentsByCEO, commentsByAides,
				serviceContext);

		//上傳檔案;
		uploadAttachFile(uploadRequest, petition.getPetitionId(), userId,
				serviceContext);
		
		String wbCEOUsersId = ParamUtil.getString(uploadRequest,
				"wbCEOUsersId");
		String wbManagementUsersId = ParamUtil.getString(uploadRequest,
				"wbManagementUsersId");

		//寫入加簽對象-執行長userIds;
		int ceoPlusCount = addPlusSigner(wbCEOUsersId, petition.getPetitionId(), userId, userName, Constants.PLUS_SIGNER_TYPE_CEO);
		
		//寫入加簽對象-經管會userIds;
		int managementPlusCount = addPlusSigner(wbManagementUsersId, petition.getPetitionId(), userId, userName, Constants.PLUS_SIGNER_TYPE_MANAGEMENT);
		
		//開啟流程;
		startWorkflow(uploadRequest, petition, serviceContext, ceoPlusCount, managementPlusCount);

		_log.info("addPetition");

	}

	public void deletePetitionBatch(ActionRequest actionRequest,
			ActionResponse actionResponse) {

		long[] petitionIds = ParamUtil.getLongValues(actionRequest,
				"petitionIds", new long[] {});
		PetitionLocalServiceUtil.removePetitionBatch(petitionIds);
	}
	

	private void uploadAttachFile(UploadRequest uploadRequest, long petitionId,
			long userId, ServiceContext serviceContext) throws PortalException,
			SystemException {

		String dirName = Constants.BW_DL_STORE_DIR_NAME;

		if (!DLStoreUtil.hasDirectory(serviceContext.getCompanyId(),
				CompanyConstants.SYSTEM, dirName)) {
			DLStoreUtil.addDirectory(serviceContext.getCompanyId(),
					CompanyConstants.SYSTEM, dirName);
		}

		long attachmentEntryId = CounterLocalServiceUtil.increment();
		File file = uploadRequest.getFile("attachFile");
		String attachmentName = uploadRequest.getFileName("attachFile");

		if(Validator.isNotNull(file) && !Validator.isBlank(attachmentName)){
			
			DLStoreUtil.addFile(serviceContext.getCompanyId(),
					CompanyConstants.SYSTEM, dirName + StringPool.SLASH
							+ attachmentEntryId, file);
	
			AttachmentLocalServiceUtil.addAttachment(petitionId, userId,
					attachmentEntryId, attachmentName);
		}
	}
	
	
	private int addPlusSigner(String wbUsersId, long petitionId,
			long userId, String userName, String plusSignerType){
		
		long[] wbUserIds = StringUtil.split(wbUsersId, StringPool.COMMA, 0L);
		int count = 0;
		for (long wbUserId : wbUserIds) {
			try{
				User wbUser = UserLocalServiceUtil.getUser(wbUserId);
				PlusSignerLocalServiceUtil.addPlusSigner(petitionId,
						wbUserId, userName, userId, wbUser.getFullName(),
						plusSignerType);
				count++;
			}catch(Exception e){
				_log.warn(e);
			}
		}
		return count;
	}
	
	private void startWorkflow(UploadPortletRequest uploadRequest,
			Petition petition, ServiceContext serviceContext, int ceoPlusCount,
			int managementPlusCount) throws PortalException, SystemException {
		
		long bwAidesRoleId = ParamUtil.getLong(uploadRequest, "bwAidesRoleId");
		long bwAidesChiefRoleId = ParamUtil.getLong(uploadRequest, "bwAidesChiefRoleId");
		long bwCEORoleId = ParamUtil.getLong(uploadRequest, "bwCEORoleId");
		long bwGuruRoleId = ParamUtil.getLong(uploadRequest, "bwGuruRoleId");
		long bwManagementRoleId = ParamUtil.getLong(uploadRequest, "bwManagementRoleId");
		long bwMonkRoleId = ParamUtil.getLong(uploadRequest, "bwMonkRoleId");
		long bwSecretariatRoleId = ParamUtil.getLong(uploadRequest, "bwSecretariatRoleId");
		
		serviceContext.setAttribute("bwAidesRoleId", bwAidesRoleId);
		serviceContext.setAttribute("bwAidesChiefRoleId", bwAidesChiefRoleId);
		serviceContext.setAttribute("bwCEORoleId", bwCEORoleId);
		serviceContext.setAttribute("bwGuruRoleId", bwGuruRoleId);
		serviceContext.setAttribute("bwManagementRoleId", bwManagementRoleId);
		serviceContext.setAttribute("bwMonkRoleId", bwMonkRoleId);
		serviceContext.setAttribute("bwSecretariatRoleId", bwSecretariatRoleId);
		
		serviceContext.setAttribute("ceoPlusCount", ceoPlusCount);
		serviceContext.setAttribute("managementPlusCount", managementPlusCount);
		serviceContext.setAttribute("petition", petition);
		
		WorkflowHandlerRegistryUtil.startWorkflowInstance(
				petition.getCompanyId(), petition.getGroupId(),
				petition.getUserId(), Petition.class.getName(),
				petition.getPetitionId(), petition, serviceContext);
	}
	
	
	
/**
 * 		resource phase
 * */
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException {

		String resourceID = resourceRequest.getResourceID();
		try {
			if (resourceID.equals("serveDownloadAttachment")) {
				serveDownloadAttachment(resourceRequest, resourceResponse);
			} else if (resourceID.equals("serveUpdateComments")) {
				serveUpdateComments(resourceRequest, resourceResponse);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void serveDownloadAttachment(ResourceRequest request,
			ResourceResponse response) throws IOException {

		HttpServletRequest httpRequest = PortalUtil
				.getHttpServletRequest(request);
		HttpServletResponse httpResponse = PortalUtil
				.getHttpServletResponse(response);
		String dirName = Constants.BW_DL_STORE_DIR_NAME;
		long fileId = ParamUtil.getLong(request, "fileId");
		long companyId = ParamUtil.getLong(request, "companyId");

		InputStream inputStream = null;
		try {
			inputStream = DLStoreUtil.getFileAsStream(companyId,
					CompanyConstants.SYSTEM, dirName + StringPool.SLASH
							+ fileId);
			long contentLength = DLStoreUtil.getFileSize(companyId,
					CompanyConstants.SYSTEM, dirName + StringPool.SLASH
							+ fileId);

			String fileRealName = AttachmentLocalServiceUtil
					.findByAttachmentEntryId(fileId).getAttachmentName();
			
			String contentType = MimeTypesUtil.getContentType(fileRealName);

			ServletResponseUtil.sendFile(httpRequest, httpResponse,
					fileRealName, inputStream, contentLength, contentType);

		} catch (Exception e) {

		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}

	private void serveUpdateComments(ResourceRequest request,
			ResourceResponse response) throws IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		long userId = themeDisplay.getUserId();
		String userName = themeDisplay.getUser().getFullName();

		long petitionId = ParamUtil.getLong(request, "petitionId");
		String commentsType = ParamUtil.getString(request, "commentsType");
		String commentsContent = ParamUtil
				.getString(request, "commentsContent");

		boolean isUpdateSuccess = false;

		if (!Validator.isBlank(commentsType) || !Validator.isBlank(commentsContent)) {
			isUpdateSuccess = CommentsUpdateLocalServiceUtil.addOneComments(petitionId, userId,
					userName, commentsType, commentsContent);
		}

		String updateMessage = isUpdateSuccess ? "更新成功" : "更新失敗";

		response.setContentType("text/javascript");
		PrintWriter writer = response.getWriter();
		try {
			JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
			jsonObject.put("updateMessage", updateMessage);
			writer.write(jsonObject.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private final static Log _log = LogFactoryUtil
			.getLog(PetitionPortlet.class);
}
