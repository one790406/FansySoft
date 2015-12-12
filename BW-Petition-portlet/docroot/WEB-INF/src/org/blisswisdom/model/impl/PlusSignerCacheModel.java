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

import org.blisswisdom.model.PlusSigner;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PlusSigner in entity cache.
 *
 * @author Danny
 * @see PlusSigner
 * @generated
 */
public class PlusSignerCacheModel implements CacheModel<PlusSigner>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{plusSignerId=");
		sb.append(plusSignerId);
		sb.append(", petitionId=");
		sb.append(petitionId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", signerId=");
		sb.append(signerId);
		sb.append(", signerName=");
		sb.append(signerName);
		sb.append(", signerType=");
		sb.append(signerType);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PlusSigner toEntityModel() {
		PlusSignerImpl plusSignerImpl = new PlusSignerImpl();

		plusSignerImpl.setPlusSignerId(plusSignerId);
		plusSignerImpl.setPetitionId(petitionId);
		plusSignerImpl.setUserId(userId);

		if (userName == null) {
			plusSignerImpl.setUserName(StringPool.BLANK);
		}
		else {
			plusSignerImpl.setUserName(userName);
		}

		plusSignerImpl.setSignerId(signerId);

		if (signerName == null) {
			plusSignerImpl.setSignerName(StringPool.BLANK);
		}
		else {
			plusSignerImpl.setSignerName(signerName);
		}

		if (signerType == null) {
			plusSignerImpl.setSignerType(StringPool.BLANK);
		}
		else {
			plusSignerImpl.setSignerType(signerType);
		}

		if (createDate == Long.MIN_VALUE) {
			plusSignerImpl.setCreateDate(null);
		}
		else {
			plusSignerImpl.setCreateDate(new Date(createDate));
		}

		plusSignerImpl.resetOriginalValues();

		return plusSignerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		plusSignerId = objectInput.readLong();
		petitionId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		signerId = objectInput.readLong();
		signerName = objectInput.readUTF();
		signerType = objectInput.readUTF();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(plusSignerId);
		objectOutput.writeLong(petitionId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(signerId);

		if (signerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signerName);
		}

		if (signerType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signerType);
		}

		objectOutput.writeLong(createDate);
	}

	public long plusSignerId;
	public long petitionId;
	public long userId;
	public String userName;
	public long signerId;
	public String signerName;
	public String signerType;
	public long createDate;
}