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

import org.blisswisdom.model.CommentsUpdate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CommentsUpdate in entity cache.
 *
 * @author Danny
 * @see CommentsUpdate
 * @generated
 */
public class CommentsUpdateCacheModel implements CacheModel<CommentsUpdate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{commentsUpdateId=");
		sb.append(commentsUpdateId);
		sb.append(", petitionId=");
		sb.append(petitionId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", commentsType=");
		sb.append(commentsType);
		sb.append(", commentsContent=");
		sb.append(commentsContent);
		sb.append(", updateTime=");
		sb.append(updateTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CommentsUpdate toEntityModel() {
		CommentsUpdateImpl commentsUpdateImpl = new CommentsUpdateImpl();

		commentsUpdateImpl.setCommentsUpdateId(commentsUpdateId);
		commentsUpdateImpl.setPetitionId(petitionId);
		commentsUpdateImpl.setUserId(userId);

		if (userName == null) {
			commentsUpdateImpl.setUserName(StringPool.BLANK);
		}
		else {
			commentsUpdateImpl.setUserName(userName);
		}

		if (commentsType == null) {
			commentsUpdateImpl.setCommentsType(StringPool.BLANK);
		}
		else {
			commentsUpdateImpl.setCommentsType(commentsType);
		}

		if (commentsContent == null) {
			commentsUpdateImpl.setCommentsContent(StringPool.BLANK);
		}
		else {
			commentsUpdateImpl.setCommentsContent(commentsContent);
		}

		if (updateTime == Long.MIN_VALUE) {
			commentsUpdateImpl.setUpdateTime(null);
		}
		else {
			commentsUpdateImpl.setUpdateTime(new Date(updateTime));
		}

		commentsUpdateImpl.resetOriginalValues();

		return commentsUpdateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		commentsUpdateId = objectInput.readLong();
		petitionId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		commentsType = objectInput.readUTF();
		commentsContent = objectInput.readUTF();
		updateTime = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(commentsUpdateId);
		objectOutput.writeLong(petitionId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (commentsType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commentsType);
		}

		if (commentsContent == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commentsContent);
		}

		objectOutput.writeLong(updateTime);
	}

	public long commentsUpdateId;
	public long petitionId;
	public long userId;
	public String userName;
	public String commentsType;
	public String commentsContent;
	public long updateTime;
}