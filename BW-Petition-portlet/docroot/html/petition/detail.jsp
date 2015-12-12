<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<%@include file="/html/init.jsp" %>

<%
	String redirect =ParamUtil.getString(request, "redirect");
	long petitionId =ParamUtil.getLong(request, "petitionId");
	
	Petition petition = PetitionLocalServiceUtil.getPetition(petitionId);
	String psCEOUserNames = "執行長: " + CommonUtil.getPlusSignerNames(petitionId, Constants.PLUS_SIGNER_TYPE_CEO);
	String psManagementUserNames = "經管會: " + CommonUtil.getPlusSignerNames(petitionId, Constants.PLUS_SIGNER_TYPE_MANAGEMENT);

%>

<liferay-ui:header title="檢視詳細呈文內容" backURL="<%=redirect %>" />

<aui:form action="" method="post" name="fm" cssClass="petition-form">

	<table>
		<tr>
			<th colspan="1" rowspan="7">簽</th>
			<th colspan="1">文號</th>
			<td colspan="3"><%=petition.getPetitionNumber() %></td>
		</tr>
		<tr>
			<th colspan="1">發文日期</th>
			<td colspan="3"><%=dateFormat.format(petition.getPublishDate()) %></td>
		</tr>
		<tr>
			<th colspan="1">簽辦單位</th>
			<td colspan="3"><%=petition.getSignUnit() %></td>
		</tr>
		<tr>
			<th colspan="1">簽辦人</th>
			<td colspan="3"><%=petition.getSigner() %></td>
		</tr>
		<tr>
			<th colspan="1">受文者</th>
			<td colspan="3"><%=petition.getDesignee() %></td>
		</tr>
		<tr>
			<th colspan="1">附加檔案</th>
			<td colspan="3">
				<liferay-util:include page="/html/petition/attachments.jsp" 
					servletContext="<%=this.getServletContext() %>" />
			</td>
		</tr>
		<tr>
			<th colspan="1">加簽對象</th>
			<td colspan="3">
					<%=psCEOUserNames%>
				<br>
					<%=psManagementUserNames%>
			</td>
		</tr>
		<tr>
			<th colspan="1">主旨</th>
			<td colspan="3"><%=petition.getSubject() %></td>
		</tr>
		<tr>
			<th colspan="1">說明</th>
			<td colspan="3"><%=petition.getExplanation().replaceAll("\n", "<br>") %></td>
		</tr>
		<tr>
			<td colspan="5"><aui:field-wrapper label="批示意見:">
				<div class="text-content" id="<portlet:namespace/>comments">
					<%
						List<CommentsUpdate> commentsUpdates = CommentsUpdateLocalServiceUtil.findByP_C(petitionId, Constants.COMMENTS);
						for(CommentsUpdate commentsUpdate : commentsUpdates){
					%>
						<div>
							<%=commentsUpdate.getCommentsContent().replaceAll("\n", "<br>")%>
							<span class="pull-right"><%=CommonUtil.getStringBySign(commentsUpdate.getUserName(), commentsUpdate.getUpdateTime())%></span>
						</div>
						<hr>
					<%
						}
					%>
				</div>
				</aui:field-wrapper></td>
		</tr>
		
		<tr>
			<td colspan="5"><aui:field-wrapper label="秘書會簽意見:">
				<div class="text-content" id="<portlet:namespace/>commentsBySecretariat">
					<%
						List<CommentsUpdate> commentsUpdates = CommentsUpdateLocalServiceUtil.findByP_C(petitionId, Constants.COMMENTS_BY_SECRETARIAT);
						for(CommentsUpdate commentsUpdate : commentsUpdates){
					%>
						<div>
							<%=commentsUpdate.getCommentsContent().replaceAll("\n", "<br>")%>
							<span class="pull-right"><%=CommonUtil.getStringBySign(commentsUpdate.getUserName(), commentsUpdate.getUpdateTime())%></span>
						</div>
						<hr>
					<%
						}
					%>
				</div>
				</aui:field-wrapper></td>
		</tr>
		<%--
		<tr>
			<td colspan="5"><aui:field-wrapper label="和尚會簽意見:">
				<div class="text-content" id="<portlet:namespace/>commentsByMonk">
					<%
						List<CommentsUpdate> commentsUpdates = CommentsUpdateLocalServiceUtil.findByP_C(petitionId, Constants.COMMENTS_BY_MONK);
						for(CommentsUpdate commentsUpdate : commentsUpdates){
					%>
						<div>
							<%=commentsUpdate.getCommentsContent().replaceAll("\n", "<br>")%>
							<span class="pull-right"><%=CommonUtil.getStringBySign(commentsUpdate.getUserName(), commentsUpdate.getUpdateTime())%></span>
						</div>
						<hr>
					<%
						}
					%>
				</div>
				</aui:field-wrapper></td>
		</tr>
		 --%>
		 
		<tr>
			<td colspan="5"><aui:field-wrapper label="經管會委員簽核意見:">
				<div class="text-content" id="<portlet:namespace/>commentsByManagement">
					<%
						List<CommentsUpdate> commentsUpdates = CommentsUpdateLocalServiceUtil.findByP_C(petitionId, Constants.COMMENTS_BY_MANAGEMENT);
						for(CommentsUpdate commentsUpdate : commentsUpdates){
					%>
						<div>
							<%=commentsUpdate.getCommentsContent().replaceAll("\n", "<br>")%>
							<span class="pull-right"><%=CommonUtil.getStringBySign(commentsUpdate.getUserName(), commentsUpdate.getUpdateTime())%></span>
						</div>
						<hr>
					<%
						}
					%>
				</div>
				</aui:field-wrapper></td>
		</tr>
		<tr>
			<td colspan="5"><aui:field-wrapper label="執行長會簽意見:">
				<div class="text-content" id="<portlet:namespace/>commentsByCEO">
					<%
						List<CommentsUpdate> commentsUpdates = CommentsUpdateLocalServiceUtil.findByP_C(petitionId, Constants.COMMENTS_BY_CEO);
						for(CommentsUpdate commentsUpdate : commentsUpdates){
					%>
						<div>
							<%=commentsUpdate.getCommentsContent().replaceAll("\n", "<br>")%>
							<span class="pull-right"><%=CommonUtil.getStringBySign(commentsUpdate.getUserName(), commentsUpdate.getUpdateTime())%></span>
						</div>
						<hr>
					<%
						}
					%>
				</div>
				</aui:field-wrapper></td>
		</tr>
		<tr>
			<td colspan="5"><aui:field-wrapper label="幕僚單位會簽意見:">
				<div class="text-content" id="<portlet:namespace/>commentsByAides">
					<%
						List<CommentsUpdate> commentsUpdates = CommentsUpdateLocalServiceUtil.findByP_C(petitionId, Constants.COMMENTS_BY_AIDES);
						for(CommentsUpdate commentsUpdate : commentsUpdates){
					%>
						<div>
							<%=commentsUpdate.getCommentsContent().replaceAll("\n", "<br>")%>
							<span class="pull-right"><%=CommonUtil.getStringBySign(commentsUpdate.getUserName(), commentsUpdate.getUpdateTime())%></span>
						</div>
						<hr>
					<%
						}
					%>
				</div>
				</aui:field-wrapper></td>
		</tr>
	</table>
	
	<aui:button-row>
		<aui:button type="cancel" value="返回" href="<%=redirect %>"/>
	</aui:button-row>

</aui:form>



