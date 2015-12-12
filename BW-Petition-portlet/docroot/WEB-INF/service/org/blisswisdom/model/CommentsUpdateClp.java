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

import org.blisswisdom.service.ClpSerializer;
import org.blisswisdom.service.CommentsUpdateLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Danny
 */
public class CommentsUpdateClp extends BaseModelImpl<CommentsUpdate>
	implements CommentsUpdate {
	public CommentsUpdateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return CommentsUpdate.class;
	}

	@Override
	public String getModelClassName() {
		return CommentsUpdate.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _commentsUpdateId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCommentsUpdateId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _commentsUpdateId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("commentsUpdateId", getCommentsUpdateId());
		attributes.put("petitionId", getPetitionId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("commentsType", getCommentsType());
		attributes.put("commentsContent", getCommentsContent());
		attributes.put("updateTime", getUpdateTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long commentsUpdateId = (Long)attributes.get("commentsUpdateId");

		if (commentsUpdateId != null) {
			setCommentsUpdateId(commentsUpdateId);
		}

		Long petitionId = (Long)attributes.get("petitionId");

		if (petitionId != null) {
			setPetitionId(petitionId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String commentsType = (String)attributes.get("commentsType");

		if (commentsType != null) {
			setCommentsType(commentsType);
		}

		String commentsContent = (String)attributes.get("commentsContent");

		if (commentsContent != null) {
			setCommentsContent(commentsContent);
		}

		Date updateTime = (Date)attributes.get("updateTime");

		if (updateTime != null) {
			setUpdateTime(updateTime);
		}
	}

	@Override
	public long getCommentsUpdateId() {
		return _commentsUpdateId;
	}

	@Override
	public void setCommentsUpdateId(long commentsUpdateId) {
		_commentsUpdateId = commentsUpdateId;

		if (_commentsUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _commentsUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setCommentsUpdateId",
						long.class);

				method.invoke(_commentsUpdateRemoteModel, commentsUpdateId);
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

		if (_commentsUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _commentsUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setPetitionId", long.class);

				method.invoke(_commentsUpdateRemoteModel, petitionId);
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

		if (_commentsUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _commentsUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_commentsUpdateRemoteModel, userId);
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
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_commentsUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _commentsUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_commentsUpdateRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommentsType() {
		return _commentsType;
	}

	@Override
	public void setCommentsType(String commentsType) {
		_commentsType = commentsType;

		if (_commentsUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _commentsUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setCommentsType", String.class);

				method.invoke(_commentsUpdateRemoteModel, commentsType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommentsContent() {
		return _commentsContent;
	}

	@Override
	public void setCommentsContent(String commentsContent) {
		_commentsContent = commentsContent;

		if (_commentsUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _commentsUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setCommentsContent",
						String.class);

				method.invoke(_commentsUpdateRemoteModel, commentsContent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getUpdateTime() {
		return _updateTime;
	}

	@Override
	public void setUpdateTime(Date updateTime) {
		_updateTime = updateTime;

		if (_commentsUpdateRemoteModel != null) {
			try {
				Class<?> clazz = _commentsUpdateRemoteModel.getClass();

				Method method = clazz.getMethod("setUpdateTime", Date.class);

				method.invoke(_commentsUpdateRemoteModel, updateTime);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCommentsUpdateRemoteModel() {
		return _commentsUpdateRemoteModel;
	}

	public void setCommentsUpdateRemoteModel(
		BaseModel<?> commentsUpdateRemoteModel) {
		_commentsUpdateRemoteModel = commentsUpdateRemoteModel;
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

		Class<?> remoteModelClass = _commentsUpdateRemoteModel.getClass();

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

		Object returnValue = method.invoke(_commentsUpdateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CommentsUpdateLocalServiceUtil.addCommentsUpdate(this);
		}
		else {
			CommentsUpdateLocalServiceUtil.updateCommentsUpdate(this);
		}
	}

	@Override
	public CommentsUpdate toEscapedModel() {
		return (CommentsUpdate)ProxyUtil.newProxyInstance(CommentsUpdate.class.getClassLoader(),
			new Class[] { CommentsUpdate.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CommentsUpdateClp clone = new CommentsUpdateClp();

		clone.setCommentsUpdateId(getCommentsUpdateId());
		clone.setPetitionId(getPetitionId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCommentsType(getCommentsType());
		clone.setCommentsContent(getCommentsContent());
		clone.setUpdateTime(getUpdateTime());

		return clone;
	}

	@Override
	public int compareTo(CommentsUpdate commentsUpdate) {
		int value = 0;

		if (getCommentsUpdateId() < commentsUpdate.getCommentsUpdateId()) {
			value = -1;
		}
		else if (getCommentsUpdateId() > commentsUpdate.getCommentsUpdateId()) {
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

		if (!(obj instanceof CommentsUpdateClp)) {
			return false;
		}

		CommentsUpdateClp commentsUpdate = (CommentsUpdateClp)obj;

		long primaryKey = commentsUpdate.getPrimaryKey();

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
		StringBundler sb = new StringBundler(15);

		sb.append("{commentsUpdateId=");
		sb.append(getCommentsUpdateId());
		sb.append(", petitionId=");
		sb.append(getPetitionId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", commentsType=");
		sb.append(getCommentsType());
		sb.append(", commentsContent=");
		sb.append(getCommentsContent());
		sb.append(", updateTime=");
		sb.append(getUpdateTime());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("org.blisswisdom.model.CommentsUpdate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>commentsUpdateId</column-name><column-value><![CDATA[");
		sb.append(getCommentsUpdateId());
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
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commentsType</column-name><column-value><![CDATA[");
		sb.append(getCommentsType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commentsContent</column-name><column-value><![CDATA[");
		sb.append(getCommentsContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>updateTime</column-name><column-value><![CDATA[");
		sb.append(getUpdateTime());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _commentsUpdateId;
	private long _petitionId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private String _commentsType;
	private String _commentsContent;
	private Date _updateTime;
	private BaseModel<?> _commentsUpdateRemoteModel;
	private Class<?> _clpSerializerClass = org.blisswisdom.service.ClpSerializer.class;
}