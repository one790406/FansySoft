/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.blisswisdom.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.PortletPreferences;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;


public class ConfigurationActionImpl extends DefaultConfigurationAction {

	@Override
	public void processAction(
			PortletConfig portletConfig, ActionRequest actionRequest,
			ActionResponse actionResponse)
		throws Exception {

		String portletResource = ParamUtil.getString(
				actionRequest, "portletResource");
		
		PortletPreferences preferences =
				PortletPreferencesFactoryUtil.getPortletSetup(
					actionRequest, portletResource);

		String bwAidesRoleId = ParamUtil.getString(actionRequest, "bwAidesRoleId");
		String bwAidesChiefRoleId = ParamUtil.getString(actionRequest, "bwAidesChiefRoleId");
		String bwCEORoleId = ParamUtil.getString(actionRequest, "bwCEORoleId");
		String bwGuruRoleId = ParamUtil.getString(actionRequest, "bwGuruRoleId");
		String bwManagementRoleId = ParamUtil.getString(actionRequest, "bwManagementRoleId");
		String bwMonkRoleId = ParamUtil.getString(actionRequest, "bwMonkRoleId");
		String bwSecretariatRoleId = ParamUtil.getString(actionRequest, "bwSecretariatRoleId");
		
		bwAidesRoleId = String.valueOf(GetterUtil.getLong(bwAidesRoleId));
		bwAidesChiefRoleId = String.valueOf(GetterUtil.getLong(bwAidesChiefRoleId));
		bwCEORoleId = String.valueOf(GetterUtil.getLong(bwCEORoleId));
		bwGuruRoleId = String.valueOf(GetterUtil.getLong(bwGuruRoleId));
		bwManagementRoleId = String.valueOf(GetterUtil.getLong(bwManagementRoleId));
		bwMonkRoleId = String.valueOf(GetterUtil.getLong(bwMonkRoleId));
		bwSecretariatRoleId = String.valueOf(GetterUtil.getLong(bwSecretariatRoleId));
		
		preferences.setValue("bwAidesRoleId", bwAidesRoleId);
		preferences.setValue("bwAidesChiefRoleId", bwAidesChiefRoleId);
		preferences.setValue("bwCEORoleId", bwCEORoleId);
		preferences.setValue("bwGuruRoleId", bwGuruRoleId);
		preferences.setValue("bwManagementRoleId", bwManagementRoleId);
		preferences.setValue("bwMonkRoleId", bwMonkRoleId);
		preferences.setValue("bwSecretariatRoleId", bwSecretariatRoleId);
		
		preferences.store();

		super.processAction(portletConfig, actionRequest, actionResponse);
	}
	
}




