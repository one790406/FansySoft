<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<%@include file="/html/init.jsp" %>

<%
	PortletURL iteratorURL = renderResponse.createRenderURL();
%>

<portlet:renderURL var="addURL">
	<portlet:param name="jspPage" value="/html/petition/add.jsp"/>
	<portlet:param name="redirect" value="<%=currentURL %>"/>
</portlet:renderURL>

<liferay-portlet:actionURL name="deletePetitionBatch" var="deletePetitionBatchURL">
</liferay-portlet:actionURL>

<aui:nav-bar>
	<aui:nav>
		<aui:nav-item href="<%=addURL%>" label="發起簽文" title="發起簽文" name="addButton" />
	</aui:nav>
	
	<%--
	<aui:nav-bar-search cssClass="pull-right">
		<div class="form-search">
			
			<liferay-ui:input-search autoFocus="<%= windowState.equals(WindowState.MAXIMIZED) %>" id="keywords" name="keywords" 
				placeholder='<%=LanguageUtil.get(locale, "keywords")%>' />
		</div>
	</aui:nav-bar-search>
	 --%>
</aui:nav-bar>


<aui:form action="<%=deletePetitionBatchURL %>" method="post" name="fm" 
	onSubmit='<%="event.preventDefault();" + renderResponse.getNamespace() + "deletePetitionBatch();"%>'>

<aui:button type="submit" value="刪除" cssClass="btn-danger" />
	
<aui:input type="hidden" name="petitionIds" />

<liferay-ui:search-container emptyResultsMessage="找不到任何簽文。" delta="20" iteratorURL="<%=iteratorURL %>" rowChecker="<%=new RowChecker(renderResponse) %>">
<liferay-ui:search-container-results
	results="<%=PetitionLocalServiceUtil.getPetitions(searchContainer.getStart(), searchContainer.getEnd()) %>" 
	total="<%=PetitionLocalServiceUtil.getPetitionsCount() %>" />

<liferay-ui:search-container-row className="org.blisswisdom.model.Petition" modelVar="petition" keyProperty="petitionId" escapedModel="true">
	<%
		PortletURL viewURL = renderResponse.createRenderURL();
		viewURL.setParameter("petitionId", String.valueOf(petition.getPetitionId()));
		viewURL.setParameter("redirect", currentURL);
		viewURL.setParameter("jspPage", "/html/petition/detail.jsp");
	%>
	
<liferay-ui:search-container-column-text property="petitionNumber" name="文號" href="<%=viewURL.toString() %>"/>
<liferay-ui:search-container-column-text name="發文日期" value="<%=dateFormat.format(petition.getPublishDate()) %>"/>
<liferay-ui:search-container-column-text property="subject" name="subject" />
<liferay-ui:search-container-column-text property="signUnit"  name="簽辦單位" />
<liferay-ui:search-container-column-text property="signer" name="簽辦人" />
<liferay-ui:search-container-column-text property="designee" name="受文者" />
<liferay-ui:search-container-column-text name="status">
	<aui:workflow-status showIcon="<%= false %>" showLabel="<%= false %>" status="<%= petition.getStatus() %>" />	
</liferay-ui:search-container-column-text>

</liferay-ui:search-container-row>

<liferay-ui:search-iterator/>
</liferay-ui:search-container>


<%-- <liferay-ui:icon-delete label="true" message="刪除"
 	url='<%="javascript:" + renderResponse.getNamespace() +"deletePetitionBatch();" %>' /> --%>

</aui:form>


<aui:script use="aui-base" >
Liferay.provide(
		window,
		'<portlet:namespace/>deletePetitionBatch',
		function() {
			
			if (confirm("確定要刪除嗎?")) {
				var petitionIds = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fm, '<portlet:namespace />allRowIds');
				document.<portlet:namespace />fm.<portlet:namespace />petitionIds.value = petitionIds;
				submitForm(document.<portlet:namespace />fm);
			}			
		},
		['liferay-util-list-fields']
);
</aui:script>


