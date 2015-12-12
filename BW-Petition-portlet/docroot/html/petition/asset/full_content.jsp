<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/html/init.jsp"%>

<style type="text/css">
.petition-form table {
	border-collapse: collapse;
	margin-bottom: 15px;
	width: 90%;
}

.petition-form table td, .petition-form table th {
	padding: 5px;
	border: 1px solid #fff;
	border-width: 0 1px 1px 0;
}

.petition-form tbody th {
	text-align: center;
	background: rgba(212, 173, 145, 0.5);
}

.petition-form tbody td {
	background: rgba(212, 173, 145, 0.3);
}

.petition-form tbody tr:hover td {
	background: rgba(212, 173, 145, 0.4);;
}

.petition-form .control-group {
	margin-bottom: 0px !important;
}
</style>

<%
	Petition petition = (Petition) request.getAttribute(WebKeys.PETITION);
%>

測試full_content
<br>
<hr>

<aui:form action="" method="post" name="fm" cssClass="petition-form">

	<table>
		<tr>
			<th colspan="1" rowspan="7">簽</th>
			<th colspan="1">文號</th>
			<td colspan="3"><%=petition.getPetitionNumber()%></td>
		</tr>
		<tr>
			<th colspan="1">發文日期</th>
			<td colspan="3"><%=petition.getPublishDate()%></td>
		</tr>
		<tr>
			<th colspan="1">簽辦單位</th>
			<td colspan="3"><%=petition.getSignUnit()%></td>
		</tr>
		<tr>
			<th colspan="1">簽辦人</th>
			<td colspan="3"><%=petition.getSigner()%></td>
		</tr>
		<tr>
			<th colspan="1">受文者</th>
			<td colspan="3"><%=petition.getDesignee()%></td>
		</tr>
		<tr>
			<th colspan="1">附加檔案</th>
			<td colspan="3"><aui:input name="aa" label="" /></td>
		</tr>
		<tr>
			<th colspan="1">加簽對象</th>
			<td colspan="3"><%=petition.getPlusSign()%></td>
		</tr>
		<tr>
			<th colspan="1">主旨</th>
			<td colspan="3"><%=petition.getSubject()%></td>
		</tr>
		<tr>
			<th colspan="1">說明</th>
			<td colspan="3"><%=petition.getExplanation().replaceAll("\n", "<br>")%></td>
		</tr>
		<tr>
			<td colspan="5"><aui:field-wrapper label="批示意見:">
					<%=petition.getComments().replaceAll("\n", "<br>")%>
				</aui:field-wrapper></td>
		</tr>
		<tr>
			<td colspan="5"><aui:field-wrapper label="和尚會簽意見:">
					<%=petition.getCommentsByMonk().replaceAll("\n", "<br>")%>
				</aui:field-wrapper></td>
		</tr>
		<tr>
			<td colspan="5"><aui:field-wrapper label="經管會委員簽核意見:">
					<%=petition.getCommentsByManagement().replaceAll("\n", "<br>")%>
				</aui:field-wrapper></td>
		</tr>
		<tr>
			<td colspan="5"><aui:field-wrapper label="執行長會簽意見:">
					<%=petition.getCommentsByCEO().replaceAll("\n", "<br>")%>
				</aui:field-wrapper></td>
		</tr>
		<tr>
			<td colspan="5"><aui:field-wrapper label="幕僚單位會簽意見:">
					<%=petition.getCommentsByAides().replaceAll("\n", "<br>")%>
				</aui:field-wrapper></td>
		</tr>
	</table>

</aui:form>


<br>

<aui:script>
	Liferay.provide(window, '<portlet:namespace />renderNews', function(URL) {
		var topWindow = Liferay.Util.getTop();
		topWindow.location.href = URL;
	});
</aui:script>
	

