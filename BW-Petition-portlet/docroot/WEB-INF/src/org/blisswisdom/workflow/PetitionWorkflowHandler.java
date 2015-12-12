package org.blisswisdom.workflow;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import org.blisswisdom.model.Petition;
import org.blisswisdom.service.PetitionLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.ServiceContext;

public class PetitionWorkflowHandler extends BaseWorkflowHandler {

	
	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public String getType(Locale locale) {
		return LanguageUtil.get(locale, "model.resource." + CLASS_NAME);
	}

	@Override
	public Object updateStatus(int status, Map<String, Serializable> workflowContext)
			throws PortalException, SystemException {
		
		long userId = GetterUtil.getLong((String) workflowContext
				.get(WorkflowConstants.CONTEXT_USER_ID));
		long resourcePrimKey = GetterUtil.getLong((String) workflowContext
				.get(WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));
		ServiceContext serviceContext = (ServiceContext) workflowContext
				.get("serviceContext");
		
		_log.info("handler updateStatus");
		
		return PetitionLocalServiceUtil.updateStatus(userId, resourcePrimKey,
				status, serviceContext);
	}
 
	public static final String CLASS_NAME = Petition.class.getName();
	private final static Log _log = LogFactoryUtil.getLog(PetitionWorkflowHandler.class);

}
