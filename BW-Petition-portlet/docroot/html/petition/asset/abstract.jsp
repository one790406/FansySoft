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

.petition-form .text-content {
	margin-left: 35px;
}
</style>

<%
	Petition petition = (Petition) request.getAttribute(WebKeys.PETITION);
	long petitionId = petition.getPetitionId();
	String portletId = Constants.PORTLET_ID;
	long groupId = petition.getGroupId();
	long petitionPlid = PortalUtil.getPlidFromPortletId(groupId, portletId);
	
	String psCEOUserNames = "執行長: " + CommonUtil.getPlusSignerNames(petitionId, Constants.PLUS_SIGNER_TYPE_CEO);
	String psManagementUserNames = "經管會: " + CommonUtil.getPlusSignerNames(petitionId, Constants.PLUS_SIGNER_TYPE_MANAGEMENT);
%>

<aui:form action="" method="post" name="fm" cssClass="petition-form">

	<table>
		<tr>
			<th colspan="1" rowspan="7">簽</th>
			<th colspan="1">文號</th>
			<td colspan="3"><%=petition.getPetitionNumber()%></td>
		</tr>
		<tr>
			<th colspan="1">發文日期</th>
			<td colspan="3"><%=dateFormat.format(petition.getPublishDate())%></td>
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
			<td colspan="3">
				<liferay-util:include page="/html/petition/attachments.jsp" 
						servletContext="<%=this.getServletContext() %>" >
					<liferay-util:param name="petitionId" value="<%=String.valueOf(petition.getPetitionId()) %>" />
				</liferay-util:include>
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
			<td colspan="3"><%=petition.getSubject()%></td>
		</tr>
		<tr>
			<th colspan="1">說明</th>
			<td colspan="3"><%=petition.getExplanation().replaceAll("\n", "<br>")%></td>
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
				<c:if test="<%=isGuruUser %>">
					<liferay-ui:icon image="edit" label="true" message="填寫意見"
						url="javascript:;" cssClass="pull-right"
						onClick='<%="event.preventDefault(); " + renderResponse.getNamespace() + "popupCommentsDialog(\'comments\');"%>'/>
				</c:if>
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
				<c:if test="<%=isSecretariatUser %>">
					<liferay-ui:icon image="edit" label="true" message="填寫意見"
						url="javascript:;" cssClass="pull-right"
						onClick='<%="event.preventDefault(); " + renderResponse.getNamespace() + "popupCommentsDialog(\'commentsBySecretariat\');"%>'/>
				</c:if>
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
				<c:if test="<%=isMonkUser %>">
					<liferay-ui:icon image="edit" label="true" message="填寫意見"
						url="javascript:;" cssClass="pull-right"
						onClick='<%="event.preventDefault(); " + renderResponse.getNamespace() + "popupCommentsDialog(\'commentsByMonk\');"%>'/>
				</c:if>
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
				<c:if test="<%=isManagementUser %>">
					<liferay-ui:icon image="edit" label="true" message="填寫意見"
						url="javascript:;" cssClass="pull-right"
						onClick='<%="event.preventDefault(); " + renderResponse.getNamespace() + "popupCommentsDialog(\'commentsByManagement\');"%>'/>
				</c:if>
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
				<c:if test="<%=isCEOUser %>">
					<liferay-ui:icon image="edit" label="true" message="填寫意見"
						url="javascript:;" cssClass="pull-right"
						onClick='<%="event.preventDefault(); " + renderResponse.getNamespace() + "popupCommentsDialog(\'commentsByCEO\');"%>'/>
				</c:if>
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
				<c:if test="<%=isAidesUser %>">
					<liferay-ui:icon image="edit" label="true" message="填寫意見"
						url="javascript:;" cssClass="pull-right"
						onClick='<%="event.preventDefault(); " + renderResponse.getNamespace() + "popupCommentsDialog(\'commentsByAides\');"%>'/>
				</c:if>
				</aui:field-wrapper></td>
		</tr>
	</table>

</aui:form>


<br>
<%--
<aui:script>
	Liferay.provide(window, '<portlet:namespace />renderNews', function(URL) {
		var topWindow = Liferay.Util.getTop();
		topWindow.location.href = URL;
	});
</aui:script>
 --%>

 
<aui:script use="aui-base,aui-io-request,liferay-util-window,liferay-portlet-url">
Liferay.provide(
	window,
	'<portlet:namespace />popupCommentsDialog',
	function(commentsId) {
		var commentsField = A.Node.create('<div/>');
		var commentsTextArea = A.Node.create("<textarea rows='5' cols='40' id='<portlet:namespace />dialog_comments'></textarea>");
		commentsTextArea.set('placeholder', '請填寫意見');
		commentsTextArea.setStyle('width', '350px');
		commentsTextArea.appendTo(commentsField);
		
		var dialog = Liferay.Util.Window.getWindow({
			id: '<portlet:namespace/>dialog',
	      	title: '填寫會簽意見',
	      	cache: false,
		    dialog: {
		        bodyContent: commentsTextArea,
		        centered : true,
		        height : 300,
		        width : 500,
		        resizable : true,
		        modal : true,
		        destroyOnClose: true,
		        toolbars: {
		            footer: [{
				        label: '確定',
				        id: 'saveButton',
				        on: {
					        click: function() {
				            	var comments = A.one('#<portlet:namespace/>dialog_comments');
				              	var comments_val = comments.val();
				              	
				              	var dialog = Liferay.Util.Window.getById('<portlet:namespace/>dialog');
				        		dialog.destroy();
				        		<portlet:namespace/>fillComments(comments_val, commentsId);
					        }
			            }
		            },{
				        label: '取消',
				        id: 'cancelButton',
				        on: {
					        click: function() {
				              	var dialog = Liferay.Util.Window.getById('<portlet:namespace/>dialog');
				        		dialog.hide();
							}
						}
				    }]
		        }
		    }
		});
});


Liferay.provide(window, '<portlet:namespace/>fillComments', function(commentsText, commentsType) {
		
		<portlet:namespace/>updateComments(commentsText, commentsType);
		
		//取得意見內容;
		commentsText = commentsText.replace(new RegExp('\n', 'g'), '<br>');

		//取得某個意見區塊;
		var div_commentsType = A.one('#<portlet:namespace/>' + commentsType);

		//創建放一則意見的文字DIV, 依附到意見區塊;
		var div_commentsText = A.Node.create("<div />");
		div_commentsText.html(commentsText);
		div_commentsText.appendTo(div_commentsType);
		
		//創建水平線, 依附到意見區塊;
		var div_commentsHR = A.Node.create("<hr />");
		div_commentsHR.appendTo(div_commentsType);
		
		//創建時間, 依附到意見文字DIV;
		var signBy = '<%=CommonUtil.getStringBySign(user.getFullName(), new Date()) %>';
		var updateCommentsTime = A.Node.create("<span class='pull-right'/>");
		updateCommentsTime.html(signBy);
		updateCommentsTime.appendTo(div_commentsText);
	}
);

Liferay.provide(window, '<portlet:namespace/>updateComments', function(commentsText, commentsId) {
	
	var resourceURL = Liferay.PortletURL.createResourceURL();
    resourceURL.setResourceId('serveUpdateComments');
    resourceURL.setPortletId('<%=portletId %>');
    resourceURL.setPlid('<%=petitionPlid%>');
    resourceURL.setParameter("petitionId", '<%=String.valueOf(petitionId)%>' );
    resourceURL.setParameter("commentsType", commentsId);
    resourceURL.setParameter("commentsContent", commentsText);
	
	A.io.request( resourceURL.toString(), {
		dataType: 'json',
		data: { <portlet:namespace/>tempParam: 'tempParam' },
		after: {
			success: function(e, id, obj) {
				var data = this.get('responseData');
				alert(data.updateMessage);
			}
		}
	});
	
});

</aui:script>








	

