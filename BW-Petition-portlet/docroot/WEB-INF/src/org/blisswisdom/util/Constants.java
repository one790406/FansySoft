package org.blisswisdom.util;

public class Constants implements com.liferay.portal.kernel.util.Constants {
	
	//一般角色;
	public final static String ROLE_BW_AIDES 			= "BW_Aides";		//幕僚單位;
	public final static String ROLE_BW_AIDES_CHIEF 		= "BW_AidesChief";	//幕僚長;
	public final static String ROLE_BW_CEO 				= "BW_CEO";			//執行長;
	public final static String ROLE_BW_GURU 			= "BW_Guru";		//上師;
	public final static String ROLE_BW_MANAGEMENT 		= "BW_Management";	//經管會;
	public final static String ROLE_BW_MONK 			= "BW_Monk";		//和尚;
	public final static String ROLE_BW_SECRETARIAT		= "BW_Secretariat";	//秘書處;
	
	
	//會簽意見欄位區分;
	public final static String COMMENTS					= "comments";				//批示意見;
	public final static String COMMENTS_BY_SECRETARIAT  = "commentsBySecretariat";	//秘書會簽;
//	public final static String COMMENTS_BY_MONK			= "commentsByMonk";			//和尚會簽;
	public final static String COMMENTS_BY_MANAGEMENT	= "commentsByManagement";	//經管會會簽;
	public final static String COMMENTS_BY_CEO			= "commentsByCEO";			//執行長會簽;
	public final static String COMMENTS_BY_AIDES		= "commentsByAides";		//幕僚單位會簽;
	
	
	//加簽對象型態;
	public final static String PLUS_SIGNER_TYPE_CEO				= "CEO";		//執行長;
	public final static String PLUS_SIGNER_TYPE_MANAGEMENT		= "Management";	//經管會;

	
	
	//Other;
	public final static String PORTLET_ID				= "petition_WAR_BWPetitionportlet";	//portletId;
	public final static String BW_DL_STORE_DIR_NAME		= "blisswisdom";

}
