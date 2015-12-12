<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/html/init.jsp" %>

<%--

<%
List<Role> roles = RoleLocalServiceUtil.getTypeRoles(RoleConstants.TYPE_REGULAR);

pageContext.setAttribute("bwAidesRoleId", bwAidesRoleId);
pageContext.setAttribute("bwAidesChiefRoleId", bwAidesChiefRoleId);
pageContext.setAttribute("bwCEORoleId", bwCEORoleId);
pageContext.setAttribute("bwGuruRoleId", bwGuruRoleId);
pageContext.setAttribute("bwManagementRoleId", bwManagementRoleId);
pageContext.setAttribute("bwMonkRoleId", bwMonkRoleId);
pageContext.setAttribute("bwSecretariatRoleId", bwSecretariatRoleId);

renderRequest.setAttribute("roles", roles);
%>

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<aui:form action="<%=configurationURL%>" method="post">

<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

<aui:fieldset label="角色定義">

	<aui:select name="bwAidesRoleId" label="角色-幕僚單位" id="bwAidesRoleId" inlineLabel="left">
	    <c:forEach items="${roles}" var="role">
	        <aui:option value="${role.roleId}" label="${role.name} (${role.title})" selected="${bwAidesRoleId == role.roleId}"/>
	    </c:forEach>
	</aui:select>
	
	<aui:select name="bwAidesChiefRoleId" label="角色-幕僚長" id="bwAidesChiefRoleId" inlineLabel="left">
	    <c:forEach items="${roles}" var="role">
	        <aui:option value="${role.roleId}" label="${role.name} (${role.title})" selected="${bwAidesChiefRoleId == role.roleId}"/>
	    </c:forEach>
	</aui:select>
	
	<aui:select name="bwCEORoleId" label="角色-執行長" id="bwCEORoleId" inlineLabel="left">
	    <c:forEach items="${roles}" var="role">
	        <aui:option value="${role.roleId}" label="${role.name} (${role.title})" selected="${bwCEORoleId == role.roleId}"/>
	    </c:forEach>
	</aui:select>
	
	<aui:select name="bwGuruRoleId" label="角色-上師" id="bwGuruRoleId" inlineLabel="left">
	    <c:forEach items="${roles}" var="role">
	        <aui:option value="${role.roleId}" label="${role.name} (${role.title})" selected="${bwGuruRoleId == role.roleId}"/>
	    </c:forEach>
	</aui:select>
	
	<aui:select name="bwManagementRoleId" label="角色-經管會委員" id="bwManagementRoleId" inlineLabel="left">
	    <c:forEach items="${roles}" var="role">
	        <aui:option value="${role.roleId}" label="${role.name} (${role.title})" selected="${bwManagementRoleId == role.roleId}"/>
	    </c:forEach>
	</aui:select>
	
	<aui:select name="bwMonkRoleId" label="角色-和尚" id="bwMonkRoleId" inlineLabel="left">
	    <c:forEach items="${roles}" var="role">
	        <aui:option value="${role.roleId}" label="${role.name} (${role.title})" selected="${bwMonkRoleId == role.roleId}"/>
	    </c:forEach>
	</aui:select>
	
	<aui:select name="bwSecretariatRoleId" label="角色-秘書處" id="bwSecretariatRoleId" inlineLabel="left">
	    <c:forEach items="${roles}" var="role">
	        <aui:option value="${role.roleId}" label="${role.name} (${role.title})" selected="${bwSecretariatRoleId == role.roleId}"/>
	    </c:forEach>
	</aui:select>

	<aui:button type="submit" />

</aui:fieldset>

</aui:form>



--%>




