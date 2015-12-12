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

package org.blisswisdom.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.blisswisdom.model.Attachment;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Attachment in entity cache.
 *
 * @author Danny
 * @see Attachment
 * @generated
 */
public class AttachmentCacheModel implements CacheModel<Attachment>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{attachmentId=");
		sb.append(attachmentId);
		sb.append(", petitionId=");
		sb.append(petitionId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", attachmentEntryId=");
		sb.append(attachmentEntryId);
		sb.append(", attachmentName=");
		sb.append(attachmentName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Attachment toEntityModel() {
		AttachmentImpl attachmentImpl = new AttachmentImpl();

		attachmentImpl.setAttachmentId(attachmentId);
		attachmentImpl.setPetitionId(petitionId);
		attachmentImpl.setUserId(userId);
		attachmentImpl.setAttachmentEntryId(attachmentEntryId);

		if (attachmentName == null) {
			attachmentImpl.setAttachmentName(StringPool.BLANK);
		}
		else {
			attachmentImpl.setAttachmentName(attachmentName);
		}

		attachmentImpl.resetOriginalValues();

		return attachmentImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		attachmentId = objectInput.readLong();
		petitionId = objectInput.readLong();
		userId = objectInput.readLong();
		attachmentEntryId = objectInput.readLong();
		attachmentName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(attachmentId);
		objectOutput.writeLong(petitionId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(attachmentEntryId);

		if (attachmentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(attachmentName);
		}
	}

	public long attachmentId;
	public long petitionId;
	public long userId;
	public long attachmentEntryId;
	public String attachmentName;
}