<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
	
	
<%@include file="/html/init.jsp" %>

<%
	String redirect =ParamUtil.getString(request, "redirect");

	String signUnit = "某某單位";
	String designee = "";
	boolean isCEOorAdmin = false;
	if(isCEOUser || permissionChecker.isOmniadmin()){
		isCEOorAdmin = true;
		designee = "經管會";
	}else if(isManagementUser){
		designee = "上師";
	}
%>

<portlet:actionURL var="addPetitionURL" name="addPetition">
</portlet:actionURL>

<liferay-ui:header title="發起簽文" backURL="<%=redirect %>"/>

<aui:form action="<%=addPetitionURL.toString() %>" method="post" name="fm" cssClass="petition-form" enctype="multipart/form-data">

	<aui:input type="hidden" name="wbCEOUsersId" />
	<aui:input type="hidden" name="wbManagementUsersId" />
	
	<aui:input type="hidden" name="bwAidesRoleId" value="<%=String.valueOf(bwAidesRoleId) %>"/>
	<aui:input type="hidden" name="bwAidesChiefRoleId" value="<%=String.valueOf(bwAidesChiefRoleId) %>"/>
	<aui:input type="hidden" name="bwCEORoleId" value="<%=String.valueOf(bwCEORoleId) %>"/>
	<aui:input type="hidden" name="bwGuruRoleId" value="<%=String.valueOf(bwGuruRoleId) %>"/>
	<aui:input type="hidden" name="bwManagementRoleId" value="<%=String.valueOf(bwManagementRoleId) %>"/>
<%-- 	<aui:input type="hidden" name="bwMonkRoleId" value="<%=String.valueOf(bwMonkRoleId) %>"/> --%>
	<aui:input type="hidden" name="bwSecretariatRoleId" value="<%=String.valueOf(bwSecretariatRoleId) %>"/>


	<table>
		<tr>
			<th colspan="1" rowspan="7">簽</th>
			<th colspan="1">文號</th>
			<td colspan="3"><aui:input name="petitionNumber" label="" /></td>
		</tr>
		<tr>
			<th colspan="1">發文日期</th>
			<td colspan="3"><aui:input name="publishDate" type="date" label="" value="<%=dateFormat.format(new Date()) %>" /></td>
		</tr>
		<tr>
			<th colspan="1">簽辦單位</th>
			<td colspan="3"><aui:input name="signUnit" label="" value="<%=signUnit %>" /></td>
		</tr>
		<tr>
			<th colspan="1">簽辦人</th>
			<td colspan="3"><aui:input name="signer" label="" value="<%=user.getFullName() %>"/></td>
		</tr>
		<tr>
			<th colspan="1">受文者</th>
			<td colspan="3"><aui:input name="designee" label="" value="<%=designee %>"/></td>
		</tr>
		<tr>
			<th colspan="1">附加檔案</th>
			<td colspan="3"><aui:input type="file" name="attachFile" label="" /></td>
		</tr>
		
		<c:if test="<%=isCEOorAdmin == false %>">
			<tr>
				<th colspan="1">加簽對象</th>
				<td colspan="3">
					<div id="<portlet:namespace />plusSignByCEO"></div>
					<div id="<portlet:namespace />plusSignByManagement"></div>
				
					<liferay-ui:icon label="true" image="edit" message="選擇" url="javascript:;"
						onClick='<%="event.preventDefault(); " + renderResponse.getNamespace() + "popupPlugSignDialog();"%>'/>
				</td>
			</tr>
		</c:if>
		
		<tr>
			<th colspan="1">主旨</th>
			<td colspan="4"><aui:input name="subject" label="" style="width:500px;" /></td>
		</tr>
		<tr>
			<th colspan="1">說明</th>
			<td colspan="4"><aui:input type="textarea" label="" name="explanation" rows="3" style="width:500px;" /></td>
		</tr>
		<tr>
			<td colspan="5">
				<aui:input type="textarea" label="批示意見" name="comments" rows="3" style="width:500px;" disabled="true" />
			</td>
		</tr>
		<tr>
			<td colspan="5">
				<aui:input type="textarea" label="秘書會簽意見" name="commentsByMonk" rows="3" style="width:500px;" disabled="true" />
			</td>
		</tr>
		<%--
		<tr>
			<td colspan="5">
				<aui:input type="textarea" label="和尚會簽意見" name="commentsByMonk" rows="3" style="width:500px;" disabled="true" />
			</td>
		</tr>
		 --%>
		<tr>
			<td colspan="5">
				<aui:input type="textarea" label="經管會委員簽核意見" name="commentsByManagement" rows="3" style="width:500px;" disabled="true" />
			</td>
		</tr>
		<tr>
			<td colspan="5">
				<aui:input type="textarea" label="執行長會簽意見" name="commentsByCEO" rows="3" style="width:500px;" disabled="true" />
			</td>
		</tr>
		<tr>
			<td colspan="5">
				<aui:input type="textarea" label="幕僚單位會簽意見" name="commentsByAides" rows="3" style="width:500px;" disabled="true" />
			</td>
		</tr>
	</table>
	
	<aui:button-row>
		<aui:button type="submit" value="送出" />
		<aui:button type="cancel" value="取消" href="<%=redirect %>"/>
	</aui:button-row>

</aui:form>



<portlet:renderURL var="plugSignDialogURL" windowState="<%=LiferayWindowState.POP_UP.toString() %>">
	<portlet:param name="jspPage" value="/html/petition/plus_sign.jsp"/>
</portlet:renderURL>

<aui:script use="aui-base,liferay-util-window,aui-io-plugin-deprecated">

var popUpWindow = null;

Liferay.provide(
	window,
	'<portlet:namespace />popupPlugSignDialog',
	function() {
		
		if(popUpWindow){
			popUpWindow.show();
		}else{
			
			popUpWindow = Liferay.Util.Window.getWindow({
				id: '<portlet:namespace/>dialog',
			    dialog: {
			    	constrain2view: true,
			        centered : true,
			        height : 500,
			        width : 1000,
			        resizable : true,
			        modal : true,
			        destroyOnClose: true,
			        toolbars: {
			            footer: [{
					        label: '確定',
					        id: 'saveButton',
					        on: {
						        click: function() {
					              	var wbCEOUsersRight = A.one('#<portlet:namespace/>wbCEOUsersRight');
					              	var wbManagementUsersRight = A.one('#<portlet:namespace/>wbManagementUsersRight');
					              	
					              	<portlet:namespace />getUserIdResults(wbCEOUsersRight, wbManagementUsersRight);

					              	popUpWindow.hide();
	// 				              	popUpWindow.destroy();
						        }
				            }
			            },{
					        label: '取消',
					        id: 'cancelButton',
					        on: {
						        click: function() {
					              	popUpWindow.hide();
	// 				              	popUpWindow.destroy();
								}
							}
					    }]
			        }
			    }
			}).plug(
				A.Plugin.IO, {
					autoLoad: false
				}
			).render();
			//popUpWindow.show();
			popUpWindow.titleNode.html("加簽對象");
			popUpWindow.io.set('uri','<%=plugSignDialogURL%>');
			popUpWindow.io.start();
		}
});



Liferay.provide(
	window,
	'<portlet:namespace />getUserIdResults',
	function(wbCEOUsersRight, wbManagementUsersRight) {
		
      	var plusSignByCEO = A.one('#<portlet:namespace/>plusSignByCEO');
      	var plusSignByManagement = A.one('#<portlet:namespace/>plusSignByManagement');

      	var wbCEOUsersId = Liferay.Util.listSelect(wbCEOUsersRight);
      	var wbManagementUsersId = Liferay.Util.listSelect(wbManagementUsersRight);
      	
      	A.one('#<portlet:namespace/>wbCEOUsersId').val(wbCEOUsersId);
      	A.one('#<portlet:namespace/>wbManagementUsersId').val(wbManagementUsersId);
      	
      	var wbCEOUsersText = listTextSelect(wbCEOUsersRight);
      	var wbManagementUsersText = listTextSelect(wbManagementUsersRight);
      	
      	if(wbCEOUsersText != '')
      		plusSignByCEO.html('執行長: ' + wbCEOUsersText);
      	if(wbManagementUsersText != '')
      		plusSignByManagement.html('經管會: ' + wbManagementUsersText);

	},
['liferay-util-list-fields']
);


</aui:script>












