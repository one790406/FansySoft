<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<%
	long petitionId = ParamUtil.getLong(request, "petitionId");
	Petition petition = PetitionLocalServiceUtil.getPetition(petitionId);
	String portletId = Constants.PORTLET_ID;
	long groupId = petition.getGroupId();
	long petitionPlid = PortalUtil.getPlidFromPortletId(groupId, portletId);
	String dirPath = Constants.BW_DL_STORE_DIR_NAME + StringPool.SLASH ;
	
	List<Attachment> petitionFiles = AttachmentLocalServiceUtil.findByPetitionId(petitionId);

	if(petitionFiles.size() > 0 ){
		for(int i = 0 ; i < petitionFiles.size() ; i++){
			
			long fileId = petitionFiles.get(i).getAttachmentEntryId();
			String fileName = petitionFiles.get(i).getAttachmentName();

// 			PortletURL existsAttachURL = PortletURLFactoryUtil.create(request, "petition_WAR_BWPetitionportlet", plid, PortletRequest.RESOURCE_PHASE);
// 			ResourceURL existsAttachURL = renderResponse.createResourceURL();
// 			existsAttachURL.setResourceID("serveDownloadAttachment");
// 			existsAttachURL.setParameter("companyId", String.valueOf(company.getCompanyId()));
// 			existsAttachURL.setParameter("fileId", String.valueOf(fileId));
			
%> 
		<liferay-ui:icon
			image="clip"
			label="<%= true %>"
			method="get"
			message='<%= fileName + 
						" (" + TextFormatter.formatKB(DLStoreUtil.getFileSize(
								company.getCompanyId(), CompanyConstants.SYSTEM, dirPath + fileId ), locale) + "k)" %>'
			url="javascript:;" 
			onClick='<%=renderResponse.getNamespace() + "createResourceURL("+ fileId +")" %>' />
		<br>
<%
		}
	} else {
		out.print("--無附件");
	}
%>


<aui:script use="aui-base,liferay-portlet-url">
Liferay.provide(window, '<portlet:namespace />createResourceURL', function(fileId){
        var resourceURL = Liferay.PortletURL.createResourceURL();
        resourceURL.setResourceId('serveDownloadAttachment');
        resourceURL.setPortletId("<%=portletId %>");
        resourceURL.setPlid('<%=petitionPlid %>');
        resourceURL.setParameter("companyId", '<%=String.valueOf(company.getCompanyId())%>' );
        resourceURL.setParameter("fileId", fileId);
		location.href = resourceURL.toString();	
});


</aui:script>




