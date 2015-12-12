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

package org.blisswisdom.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.blisswisdom.service.AttachmentLocalServiceUtil;
import org.blisswisdom.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Danny
 */
public class AttachmentClp extends BaseModelImpl<Attachment>
	implements Attachment {
	public AttachmentClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Attachment.class;
	}

	@Override
	public String getModelClassName() {
		return Attachment.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _attachmentId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAttachmentId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _attachmentId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attachmentId", getAttachmentId());
		attributes.put("petitionId", getPetitionId());
		attributes.put("userId", getUserId());
		attributes.put("attachmentEntryId", getAttachmentEntryId());
		attributes.put("attachmentName", getAttachmentName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attachmentId = (Long)attributes.get("attachmentId");

		if (attachmentId != null) {
			setAttachmentId(attachmentId);
		}

		Long petitionId = (Long)attributes.get("petitionId");

		if (petitionId != null) {
			setPetitionId(petitionId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long attachmentEntryId = (Long)attributes.get("attachmentEntryId");

		if (attachmentEntryId != null) {
			setAttachmentEntryId(attachmentEntryId);
		}

		String attachmentName = (String)attributes.get("attachmentName");

		if (attachmentName != null) {
			setAttachmentName(attachmentName);
		}
	}

	@Override
	public long getAttachmentId() {
		return _attachmentId;
	}

	@Override
	public void setAttachmentId(long attachmentId) {
		_attachmentId = attachmentId;

		if (_attachmentRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachmentId", long.class);

				method.invoke(_attachmentRemoteModel, attachmentId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPetitionId() {
		return _petitionId;
	}

	@Override
	public void setPetitionId(long petitionId) {
		_petitionId = petitionId;

		if (_attachmentRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setPetitionId", long.class);

				method.invoke(_attachmentRemoteModel, petitionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_attachmentRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_attachmentRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getAttachmentEntryId() {
		return _attachmentEntryId;
	}

	@Override
	public void setAttachmentEntryId(long attachmentEntryId) {
		_attachmentEntryId = attachmentEntryId;

		if (_attachmentRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachmentEntryId",
						long.class);

				method.invoke(_attachmentRemoteModel, attachmentEntryId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAttachmentName() {
		return _attachmentName;
	}

	@Override
	public void setAttachmentName(String attachmentName) {
		_attachmentName = attachmentName;

		if (_attachmentRemoteModel != null) {
			try {
				Class<?> clazz = _attachmentRemoteModel.getClass();

				Method method = clazz.getMethod("setAttachmentName",
						String.class);

				method.invoke(_attachmentRemoteModel, attachmentName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAttachmentRemoteModel() {
		return _attachmentRemoteModel;
	}

	public void setAttachmentRemoteModel(BaseModel<?> attachmentRemoteModel) {
		_attachmentRemoteModel = attachmentRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _attachmentRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_attachmentRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AttachmentLocalServiceUtil.addAttachment(this);
		}
		else {
			AttachmentLocalServiceUtil.updateAttachment(this);
		}
	}

	@Override
	public Attachment toEscapedModel() {
		return (Attachment)ProxyUtil.newProxyInstance(Attachment.class.getClassLoader(),
			new Class[] { Attachment.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AttachmentClp clone = new AttachmentClp();

		clone.setAttachmentId(getAttachmentId());
		clone.setPetitionId(getPetitionId());
		clone.setUserId(getUserId());
		clone.setAttachmentEntryId(getAttachmentEntryId());
		clone.setAttachmentName(getAttachmentName());

		return clone;
	}

	@Override
	public int compareTo(Attachment attachment) {
		int value = 0;

		if (getAttachmentId() < attachment.getAttachmentId()) {
			value = -1;
		}
		else if (getAttachmentId() > attachment.getAttachmentId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttachmentClp)) {
			return false;
		}

		AttachmentClp attachment = (AttachmentClp)obj;

		long primaryKey = attachment.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{attachmentId=");
		sb.append(getAttachmentId());
		sb.append(", petitionId=");
		sb.append(getPetitionId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", attachmentEntryId=");
		sb.append(getAttachmentEntryId());
		sb.append(", attachmentName=");
		sb.append(getAttachmentName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("org.blisswisdom.model.Attachment");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>attachmentId</column-name><column-value><![CDATA[");
		sb.append(getAttachmentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>petitionId</column-name><column-value><![CDATA[");
		sb.append(getPetitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachmentEntryId</column-name><column-value><![CDATA[");
		sb.append(getAttachmentEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>attachmentName</column-name><column-value><![CDATA[");
		sb.append(getAttachmentName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _attachmentId;
	private long _petitionId;
	private long _userId;
	private String _userUuid;
	private long _attachmentEntryId;
	private String _attachmentName;
	private BaseModel<?> _attachmentRemoteModel;
	private Class<?> _clpSerializerClass = org.blisswisdom.service.ClpSerializer.class;
}