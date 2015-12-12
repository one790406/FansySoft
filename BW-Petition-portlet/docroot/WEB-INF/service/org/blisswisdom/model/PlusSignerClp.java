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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.blisswisdom.service.ClpSerializer;
import org.blisswisdom.service.PlusSignerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Danny
 */
public class PlusSignerClp extends BaseModelImpl<PlusSigner>
	implements PlusSigner {
	public PlusSignerClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return PlusSigner.class;
	}

	@Override
	public String getModelClassName() {
		return PlusSigner.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _plusSignerId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPlusSignerId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _plusSignerId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("plusSignerId", getPlusSignerId());
		attributes.put("petitionId", getPetitionId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("signerId", getSignerId());
		attributes.put("signerName", getSignerName());
		attributes.put("signerType", getSignerType());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long plusSignerId = (Long)attributes.get("plusSignerId");

		if (plusSignerId != null) {
			setPlusSignerId(plusSignerId);
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

		Long signerId = (Long)attributes.get("signerId");

		if (signerId != null) {
			setSignerId(signerId);
		}

		String signerName = (String)attributes.get("signerName");

		if (signerName != null) {
			setSignerName(signerName);
		}

		String signerType = (String)attributes.get("signerType");

		if (signerType != null) {
			setSignerType(signerType);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	@Override
	public long getPlusSignerId() {
		return _plusSignerId;
	}

	@Override
	public void setPlusSignerId(long plusSignerId) {
		_plusSignerId = plusSignerId;

		if (_plusSignerRemoteModel != null) {
			try {
				Class<?> clazz = _plusSignerRemoteModel.getClass();

				Method method = clazz.getMethod("setPlusSignerId", long.class);

				method.invoke(_plusSignerRemoteModel, plusSignerId);
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

		if (_plusSignerRemoteModel != null) {
			try {
				Class<?> clazz = _plusSignerRemoteModel.getClass();

				Method method = clazz.getMethod("setPetitionId", long.class);

				method.invoke(_plusSignerRemoteModel, petitionId);
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

		if (_plusSignerRemoteModel != null) {
			try {
				Class<?> clazz = _plusSignerRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_plusSignerRemoteModel, userId);
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

		if (_plusSignerRemoteModel != null) {
			try {
				Class<?> clazz = _plusSignerRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_plusSignerRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSignerId() {
		return _signerId;
	}

	@Override
	public void setSignerId(long signerId) {
		_signerId = signerId;

		if (_plusSignerRemoteModel != null) {
			try {
				Class<?> clazz = _plusSignerRemoteModel.getClass();

				Method method = clazz.getMethod("setSignerId", long.class);

				method.invoke(_plusSignerRemoteModel, signerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignerName() {
		return _signerName;
	}

	@Override
	public void setSignerName(String signerName) {
		_signerName = signerName;

		if (_plusSignerRemoteModel != null) {
			try {
				Class<?> clazz = _plusSignerRemoteModel.getClass();

				Method method = clazz.getMethod("setSignerName", String.class);

				method.invoke(_plusSignerRemoteModel, signerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignerType() {
		return _signerType;
	}

	@Override
	public void setSignerType(String signerType) {
		_signerType = signerType;

		if (_plusSignerRemoteModel != null) {
			try {
				Class<?> clazz = _plusSignerRemoteModel.getClass();

				Method method = clazz.getMethod("setSignerType", String.class);

				method.invoke(_plusSignerRemoteModel, signerType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_plusSignerRemoteModel != null) {
			try {
				Class<?> clazz = _plusSignerRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_plusSignerRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getPlusSignerRemoteModel() {
		return _plusSignerRemoteModel;
	}

	public void setPlusSignerRemoteModel(BaseModel<?> plusSignerRemoteModel) {
		_plusSignerRemoteModel = plusSignerRemoteModel;
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

		Class<?> remoteModelClass = _plusSignerRemoteModel.getClass();

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

		Object returnValue = method.invoke(_plusSignerRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PlusSignerLocalServiceUtil.addPlusSigner(this);
		}
		else {
			PlusSignerLocalServiceUtil.updatePlusSigner(this);
		}
	}

	@Override
	public PlusSigner toEscapedModel() {
		return (PlusSigner)ProxyUtil.newProxyInstance(PlusSigner.class.getClassLoader(),
			new Class[] { PlusSigner.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PlusSignerClp clone = new PlusSignerClp();

		clone.setPlusSignerId(getPlusSignerId());
		clone.setPetitionId(getPetitionId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setSignerId(getSignerId());
		clone.setSignerName(getSignerName());
		clone.setSignerType(getSignerType());
		clone.setCreateDate(getCreateDate());

		return clone;
	}

	@Override
	public int compareTo(PlusSigner plusSigner) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), plusSigner.getCreateDate());

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

		if (!(obj instanceof PlusSignerClp)) {
			return false;
		}

		PlusSignerClp plusSigner = (PlusSignerClp)obj;

		long primaryKey = plusSigner.getPrimaryKey();

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
		StringBundler sb = new StringBundler(17);

		sb.append("{plusSignerId=");
		sb.append(getPlusSignerId());
		sb.append(", petitionId=");
		sb.append(getPetitionId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", signerId=");
		sb.append(getSignerId());
		sb.append(", signerName=");
		sb.append(getSignerName());
		sb.append(", signerType=");
		sb.append(getSignerType());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("org.blisswisdom.model.PlusSigner");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>plusSignerId</column-name><column-value><![CDATA[");
		sb.append(getPlusSignerId());
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
			"<column><column-name>signerId</column-name><column-value><![CDATA[");
		sb.append(getSignerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signerName</column-name><column-value><![CDATA[");
		sb.append(getSignerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signerType</column-name><column-value><![CDATA[");
		sb.append(getSignerType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _plusSignerId;
	private long _petitionId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private long _signerId;
	private String _signerName;
	private String _signerType;
	private Date _createDate;
	private BaseModel<?> _plusSignerRemoteModel;
	private Class<?> _clpSerializerClass = org.blisswisdom.service.ClpSerializer.class;
}