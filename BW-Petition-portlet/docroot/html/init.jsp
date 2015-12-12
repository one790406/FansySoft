<%@page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@taglib uri="http://liferay.com/tld/util" prefix="liferay-util" %>
<%@taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>





<%@page import="com.liferay.portal.kernel.bean.BeanParamUtil" %>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.dao.orm.Criterion"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.dao.search.RowChecker"%>
<%@page import="com.liferay.portal.kernel.exception.PortalException"%>
<%@page import="com.liferay.portal.kernel.json.JSONArray"%>
<%@page import="com.liferay.portal.kernel.json.JSONFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.json.JSONObject"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil" %>
<%@page import="com.liferay.portal.kernel.language.UnicodeLanguageUtil" %>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry" %>
<%@page import="com.liferay.portal.kernel.repository.model.Folder" %>
<%@page import="com.liferay.portal.kernel.repository.model.FileVersion" %>
<%@page import="com.liferay.portal.kernel.portlet.DynamicRenderRequest" %>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionErrors"%>
<%@page import="com.liferay.portal.kernel.servlet.SessionMessages"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.portal.kernel.util.FastDateFormatFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="com.liferay.portal.kernel.util.ArrayUtil"%>
<%@page import="com.liferay.portal.kernel.util.TimeZoneUtil"%>
<%@page import="com.liferay.portal.kernel.util.DateUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringUtil" %>
<%@page import="com.liferay.portal.kernel.util.SetUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool" %>
<%@page import="com.liferay.portal.kernel.util.PrefsParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.PropertiesParamUtil" %>
<%@page import="com.liferay.portal.kernel.util.PropertiesUtil" %>
<%@page import="com.liferay.portal.kernel.util.Validator" %>
<%@page import="com.liferay.portal.kernel.util.OrderByComparator"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="com.liferay.portal.kernel.util.Http.Options" %>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.util.PrefsPropsUtil" %>
<%@page import="com.liferay.portal.kernel.util.StringPool" %>
<%@page import="com.liferay.portal.kernel.util.PropsKeys" %>
<%@page import="com.liferay.portal.kernel.util.Time" %>
<%@page import="com.liferay.portal.kernel.util.MimeTypesUtil" %>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@page import="com.liferay.portal.kernel.util.KeyValuePair"%>
<%@page import="com.liferay.portal.kernel.util.TextFormatter"%>

<%@page import="com.liferay.portal.service.RoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.UserGroupRoleLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.GroupLocalServiceUtil"%>
<%@page import="com.liferay.portal.service.TicketLocalServiceUtil" %>
<%@page import="com.liferay.portal.service.ServiceContext" %>
<%@page import="com.liferay.portal.service.TeamLocalServiceUtil" %>
<%@page import="com.liferay.portal.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.model.*" %>
<%@page import="com.liferay.portal.model.CompanyConstants"%>
<%@page import="com.liferay.portal.util.PortalUtil" %>
<%@page import="com.liferay.portal.util.PortletKeys"%>
<%@page import="com.liferay.portal.NoSuchUserException"%>


<%@page import="com.liferay.portlet.bookmarks.NoSuchFolderException"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntryConstants" %>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFolderConstants"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntryType" %>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileVersion" %>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntryMetadata" %>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry" %>
<%@page import="com.liferay.portlet.documentlibrary.store.DLStoreUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryTypeServiceUtil" %>
<%@page import="com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil" %>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryTypeLocalServiceUtil" %>
<%@page import="com.liferay.portlet.documentlibrary.service.DLFileEntryMetadataLocalServiceUtil" %>
<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil" %>

<%@page import="com.liferay.portlet.dynamicdatamapping.model.DDMStructure" %>
<%@page import="com.liferay.portlet.dynamicdatamapping.storage.Fields" %>
<%@page import="com.liferay.portlet.dynamicdatamapping.storage.StorageEngineUtil" %>
<%@page import="com.liferay.portlet.dynamicdatamapping.util.DDMXSDUtil" %>
<%@page import="com.liferay.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portlet.PortletURLUtil"%>
<%@page import="com.liferay.portlet.PortalPreferences" %>
<%@page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>




<%@page import="javax.portlet.MimeResponse" %>
<%@page import="javax.portlet.PortletConfig" %>
<%@page import="javax.portlet.PortletContext" %>
<%@page import="javax.portlet.PortletException" %>
<%@page import="javax.portlet.PortletMode" %>
<%@page import="javax.portlet.PortletPreferences" %>
<%@page import="javax.portlet.PortletRequest" %>
<%@page import="javax.portlet.PortletResponse" %>
<%@page import="javax.portlet.PortletURL" %>
<%@page import="javax.portlet.ResourceURL" %>
<%@page import="javax.portlet.UnavailableException" %>
<%@page import="javax.portlet.ValidatorException" %>
<%@page import="javax.portlet.WindowState" %>

<%@page import="java.net.InetAddress" %>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.Format"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.TimeZone"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List" %>
<%@page import="java.util.Set" %>
<%@page import="java.util.Random" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Locale"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.LinkedHashMap"%>

<%@page import="org.blisswisdom.util.Constants"%>
<%@page import="org.blisswisdom.util.WebKeys"%>
<%@page import="org.blisswisdom.util.CommonUtil"%>
<%@page import="org.blisswisdom.model.Petition"%>
<%@page import="org.blisswisdom.model.Attachment"%>
<%@page import="org.blisswisdom.model.CommentsUpdate"%>
<%@page import="org.blisswisdom.model.PlusSigner"%>
<%@page import="org.blisswisdom.service.PetitionLocalServiceUtil"%>
<%@page import="org.blisswisdom.service.AttachmentLocalServiceUtil"%>
<%@page import="org.blisswisdom.service.CommentsUpdateLocalServiceUtil"%>
<%@page import="org.blisswisdom.service.PlusSignerLocalServiceUtil"%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%



DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
WindowState windowState = renderRequest.getWindowState();
PortletMode portletMode = renderRequest.getPortletMode();

//PortletURL currentURLObj = PortletURLUtil.getCurrent(renderRequest,renderResponse);
PortletURL currentURLObj = PortletURLUtil.getCurrent(liferayPortletRequest,liferayPortletResponse);
String currentURL = currentURLObj.toString();


//在我的工作任務portlet裡面 會抓不到這些值;
//Petition config;
long bwAidesRoleId = GetterUtil.getLong(portletPreferences.getValue("bwAidesRoleId", ""));
long bwAidesChiefRoleId = GetterUtil.getLong(portletPreferences.getValue("bwAidesChiefRoleId", ""));
long bwCEORoleId = GetterUtil.getLong(portletPreferences.getValue("bwCEORoleId", ""));
long bwGuruRoleId = GetterUtil.getLong(portletPreferences.getValue("bwGuruRoleId", ""));
long bwManagementRoleId = GetterUtil.getLong(portletPreferences.getValue("bwManagementRoleId", ""));
//long bwMonkRoleId = GetterUtil.getLong(portletPreferences.getValue("bwMonkRoleId", ""));
long bwSecretariatRoleId = GetterUtil.getLong(portletPreferences.getValue("bwSecretariatRoleId", ""));


// if(portletName.equals(PortletKeys.MY_WORKFLOW_TASKS)){
// 	System.out.println("portletName: " + portletName);
Role bwAidesRole = null;
Role bwAidesChiefRole = null;
Role bwCEORole = null;
Role bwGuruRole = null;
Role bwManagementRole = null;
Role bwSecretariatRole = null;
	try{
		bwAidesRole = RoleLocalServiceUtil.getRole(company.getCompanyId(), Constants.ROLE_BW_AIDES);
	}catch(Exception e){
	}
	try{
		bwAidesChiefRole = RoleLocalServiceUtil.getRole(company.getCompanyId(), Constants.ROLE_BW_AIDES_CHIEF);
	}catch(Exception e){
	}
	try{
		bwCEORole = RoleLocalServiceUtil.getRole(company.getCompanyId(), Constants.ROLE_BW_CEO);
	}catch(Exception e){
	}
	try{
		bwGuruRole = RoleLocalServiceUtil.getRole(company.getCompanyId(), Constants.ROLE_BW_GURU);
	}catch(Exception e){
	}
	try{
		bwManagementRole = RoleLocalServiceUtil.getRole(company.getCompanyId(), Constants.ROLE_BW_MANAGEMENT);
	}catch(Exception e){
	}
	try{
		bwSecretariatRole = RoleLocalServiceUtil.getRole(company.getCompanyId(), Constants.ROLE_BW_SECRETARIAT);
	}catch(Exception e){
	}
	
	bwAidesRoleId 			= Validator.isNotNull(bwAidesRole) ? bwAidesRole.getRoleId() : 0 ;
	bwAidesChiefRoleId 		= Validator.isNotNull(bwAidesChiefRole) ? bwAidesChiefRole.getRoleId() : 0;
	bwCEORoleId 			= Validator.isNotNull(bwCEORole) ? bwCEORole.getRoleId() : 0;
	bwGuruRoleId 			= Validator.isNotNull(bwGuruRole) ? bwGuruRole.getRoleId() : 0;
	bwManagementRoleId 		= Validator.isNotNull(bwManagementRole) ? bwManagementRole.getRoleId() : 0;
//	bwMonkRoleId 			= bwMonkRole.getRoleId();
	bwSecretariatRoleId 	= Validator.isNotNull(bwSecretariatRole) ? bwSecretariatRole.getRoleId() : 0;
// }




boolean isCEOUser = RoleLocalServiceUtil.hasUserRole(user.getUserId(), bwCEORoleId);
boolean isManagementUser = RoleLocalServiceUtil.hasUserRole(user.getUserId(), bwManagementRoleId);

boolean isAidesUser = RoleLocalServiceUtil.hasUserRole(user.getUserId(), bwAidesRoleId);
boolean isAidesChiefUser = RoleLocalServiceUtil.hasUserRole(user.getUserId(), bwAidesChiefRoleId);
boolean isGuruUser = RoleLocalServiceUtil.hasUserRole(user.getUserId(), bwGuruRoleId);
//boolean isMonkUser = RoleLocalServiceUtil.hasUserRole(user.getUserId(), bwMonkRoleId);
boolean isSecretariatUser = RoleLocalServiceUtil.hasUserRole(user.getUserId(), bwSecretariatRoleId);




%>










