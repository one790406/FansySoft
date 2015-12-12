/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package org.blisswisdom.service.impl;

import java.util.Date;
import java.util.List;

import org.blisswisdom.model.CommentsUpdate;
import org.blisswisdom.service.base.CommentsUpdateLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * The implementation of the comments update local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.blisswisdom.service.CommentsUpdateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Danny
 * @see org.blisswisdom.service.base.CommentsUpdateLocalServiceBaseImpl
 * @see org.blisswisdom.service.CommentsUpdateLocalServiceUtil
 */
public class CommentsUpdateLocalServiceImpl extends
		CommentsUpdateLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * org.blisswisdom.service.CommentsUpdateLocalServiceUtil} to access the
	 * comments update local service.
	 */

	public boolean addOneComments(long petitionId, long userId,
			String userName, String commentsType, String commentsContent) {

		try {
			CommentsUpdate commentsUpdate = commentsUpdatePersistence
					.create(counterLocalService.increment());

			commentsUpdate.setPetitionId(petitionId);
			commentsUpdate.setUserId(userId);
			commentsUpdate.setUserName(userName);
			commentsUpdate.setCommentsContent(commentsContent);
			commentsUpdate.setCommentsType(commentsType);
			commentsUpdate.setUpdateTime(new Date());

			super.updateCommentsUpdate(commentsUpdate);
		} catch (Exception e) {
			_log.warn(e.getMessage());
			return false;
		}

		return true;
	}

	public List<CommentsUpdate> findByP_C(long petitionId, String commentsType)
			throws SystemException {
		
		return commentsUpdatePersistence.findByP_C(petitionId, commentsType);
	}

	public void removeByPetitionId(long petitionId) throws SystemException {
			
		commentsUpdatePersistence.removeByPetitionId(petitionId);
	}

	private final static Log _log = LogFactoryUtil
			.getLog(CommentsUpdateLocalServiceImpl.class);

}