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

import java.util.List;

import org.blisswisdom.NoSuchAttachmentException;
import org.blisswisdom.model.Attachment;
import org.blisswisdom.service.base.AttachmentLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the attachment local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.blisswisdom.service.AttachmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Danny
 * @see org.blisswisdom.service.base.AttachmentLocalServiceBaseImpl
 * @see org.blisswisdom.service.AttachmentLocalServiceUtil
 */
public class AttachmentLocalServiceImpl extends AttachmentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * org.blisswisdom.service.AttachmentLocalServiceUtil} to access the
	 * attachment local service.
	 */

	public Attachment addAttachment(long petitionId, long userId,
			long attachmentEntryId, String attachmentName)
			throws SystemException {

		Attachment attachment = attachmentPersistence
				.create(counterLocalService.increment());

		attachment.setPetitionId(petitionId);
		attachment.setUserId(userId);
		attachment.setAttachmentEntryId(attachmentEntryId);
		attachment.setAttachmentName(attachmentName);

		return super.addAttachment(attachment);
	}

	public Attachment findByAttachmentEntryId(long attachmentEntryId)
			throws NoSuchAttachmentException, SystemException {

		return attachmentPersistence.findByAttachmentEntryId(attachmentEntryId);
	}

	public List<Attachment> findByPetitionId(long petitionId)
			throws SystemException {

		return attachmentPersistence.findByPetitionId(petitionId);
	}

}
