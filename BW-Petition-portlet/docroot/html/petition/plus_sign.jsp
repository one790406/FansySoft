<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp"%>

<%
	List<User> wbCEOUsers = UserLocalServiceUtil.getRoleUsers(bwCEORoleId);
	List<User> wbManagementUsers = UserLocalServiceUtil.getRoleUsers(bwManagementRoleId);
	
	//movebox;
	List<KeyValuePair> wbCEOUsersLeft = new ArrayList<KeyValuePair>();
	List<KeyValuePair> wbCEOUsersRight = new ArrayList<KeyValuePair>();
	
	List<KeyValuePair> wbManagementUsersLeft = new ArrayList<KeyValuePair>();
	List<KeyValuePair> wbManagementUsersRight = new ArrayList<KeyValuePair>();
	
	for(User wbCEOUser : wbCEOUsers)
		wbCEOUsersLeft.add(new KeyValuePair(String.valueOf(wbCEOUser.getUserId()), wbCEOUser.getFullName()));
	
	for(User wbManagementUser : wbManagementUsers)
		wbManagementUsersLeft.add(new KeyValuePair(String.valueOf(wbManagementUser.getUserId()), wbManagementUser.getFullName()));
%>

<aui:layout>
	<aui:column columnWidth="50" first="true">
	
		<aui:fieldset label="執行長">
			<liferay-ui:input-move-boxes
					leftTitle="可選的使用者"
					leftBoxName="wbCEOUsersLeft"
					leftList="<%=wbCEOUsersLeft%>" 				
					rightTitle="已選取的使用者" 
					rightList="<%=wbCEOUsersRight%>"
					rightBoxName="wbCEOUsersRight" />
		</aui:fieldset>
	</aui:column>
	
	<aui:column columnWidth="50" last="true">
		
		<aui:fieldset label="經管會">
			<liferay-ui:input-move-boxes
					leftTitle="可選的使用者"
					leftBoxName="wbManagementUsersLeft"
					leftList="<%=wbManagementUsersLeft%>" 				
					rightTitle="已選取的使用者" 
					rightList="<%=wbManagementUsersRight%>"
					rightBoxName="wbManagementUsersRight" />
		</aui:fieldset>
	</aui:column>

</aui:layout>




