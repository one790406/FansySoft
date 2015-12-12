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
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.blisswisdom.service.ClpSerializer;
import org.blisswisdom.service.PetitionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Danny
 */
public class PetitionClp extends BaseModelImpl<Petition> implements Petition {
	public PetitionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Petition.class;
	}

	@Override
	public String getModelClassName() {
		return Petition.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _petitionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPetitionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _petitionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("petitionId", getPetitionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("petitionNumber", getPetitionNumber());
		attributes.put("publishDate", getPublishDate());
		attributes.put("signUnit", getSignUnit());
		attributes.put("signer", getSigner());
		attributes.put("designee", getDesignee());
		attributes.put("plusSign", getPlusSign());
		attributes.put("subject", getSubject());
		attributes.put("explanation", getExplanation());
		attributes.put("comments", getComments());
		attributes.put("commentsByMonk", getCommentsByMonk());
		attributes.put("commentsByManagement", getCommentsByManagement());
		attributes.put("commentsByCEO", getCommentsByCEO());
		attributes.put("commentsByAides", getCommentsByAides());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long petitionId = (Long)attributes.get("petitionId");

		if (petitionId != null) {
			setPetitionId(petitionId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String petitionNumber = (String)attributes.get("petitionNumber");

		if (petitionNumber != null) {
			setPetitionNumber(petitionNumber);
		}

		Date publishDate = (Date)attributes.get("publishDate");

		if (publishDate != null) {
			setPublishDate(publishDate);
		}

		String signUnit = (String)attributes.get("signUnit");

		if (signUnit != null) {
			setSignUnit(signUnit);
		}

		String signer = (String)attributes.get("signer");

		if (signer != null) {
			setSigner(signer);
		}

		String designee = (String)attributes.get("designee");

		if (designee != null) {
			setDesignee(designee);
		}

		String plusSign = (String)attributes.get("plusSign");

		if (plusSign != null) {
			setPlusSign(plusSign);
		}

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		String explanation = (String)attributes.get("explanation");

		if (explanation != null) {
			setExplanation(explanation);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		String commentsByMonk = (String)attributes.get("commentsByMonk");

		if (commentsByMonk != null) {
			setCommentsByMonk(commentsByMonk);
		}

		String commentsByManagement = (String)attributes.get(
				"commentsByManagement");

		if (commentsByManagement != null) {
			setCommentsByManagement(commentsByManagement);
		}

		String commentsByCEO = (String)attributes.get("commentsByCEO");

		if (commentsByCEO != null) {
			setCommentsByCEO(commentsByCEO);
		}

		String commentsByAides = (String)attributes.get("commentsByAides");

		if (commentsByAides != null) {
			setCommentsByAides(commentsByAides);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_petitionRemoteModel, uuid);
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

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setPetitionId", long.class);

				method.invoke(_petitionRemoteModel, petitionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_petitionRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_petitionRemoteModel, groupId);
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

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_petitionRemoteModel, userId);
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

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_petitionRemoteModel, userName);
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

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_petitionRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_petitionRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPetitionNumber() {
		return _petitionNumber;
	}

	@Override
	public void setPetitionNumber(String petitionNumber) {
		_petitionNumber = petitionNumber;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setPetitionNumber",
						String.class);

				method.invoke(_petitionRemoteModel, petitionNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getPublishDate() {
		return _publishDate;
	}

	@Override
	public void setPublishDate(Date publishDate) {
		_publishDate = publishDate;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setPublishDate", Date.class);

				method.invoke(_petitionRemoteModel, publishDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSignUnit() {
		return _signUnit;
	}

	@Override
	public void setSignUnit(String signUnit) {
		_signUnit = signUnit;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setSignUnit", String.class);

				method.invoke(_petitionRemoteModel, signUnit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSigner() {
		return _signer;
	}

	@Override
	public void setSigner(String signer) {
		_signer = signer;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setSigner", String.class);

				method.invoke(_petitionRemoteModel, signer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDesignee() {
		return _designee;
	}

	@Override
	public void setDesignee(String designee) {
		_designee = designee;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setDesignee", String.class);

				method.invoke(_petitionRemoteModel, designee);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlusSign() {
		return _plusSign;
	}

	@Override
	public void setPlusSign(String plusSign) {
		_plusSign = plusSign;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setPlusSign", String.class);

				method.invoke(_petitionRemoteModel, plusSign);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubject() {
		return _subject;
	}

	@Override
	public void setSubject(String subject) {
		_subject = subject;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setSubject", String.class);

				method.invoke(_petitionRemoteModel, subject);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getExplanation() {
		return _explanation;
	}

	@Override
	public void setExplanation(String explanation) {
		_explanation = explanation;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setExplanation", String.class);

				method.invoke(_petitionRemoteModel, explanation);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getComments() {
		return _comments;
	}

	@Override
	public void setComments(String comments) {
		_comments = comments;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setComments", String.class);

				method.invoke(_petitionRemoteModel, comments);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommentsByMonk() {
		return _commentsByMonk;
	}

	@Override
	public void setCommentsByMonk(String commentsByMonk) {
		_commentsByMonk = commentsByMonk;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setCommentsByMonk",
						String.class);

				method.invoke(_petitionRemoteModel, commentsByMonk);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommentsByManagement() {
		return _commentsByManagement;
	}

	@Override
	public void setCommentsByManagement(String commentsByManagement) {
		_commentsByManagement = commentsByManagement;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setCommentsByManagement",
						String.class);

				method.invoke(_petitionRemoteModel, commentsByManagement);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommentsByCEO() {
		return _commentsByCEO;
	}

	@Override
	public void setCommentsByCEO(String commentsByCEO) {
		_commentsByCEO = commentsByCEO;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setCommentsByCEO", String.class);

				method.invoke(_petitionRemoteModel, commentsByCEO);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCommentsByAides() {
		return _commentsByAides;
	}

	@Override
	public void setCommentsByAides(String commentsByAides) {
		_commentsByAides = commentsByAides;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setCommentsByAides",
						String.class);

				method.invoke(_petitionRemoteModel, commentsByAides);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", int.class);

				method.invoke(_petitionRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusByUserId", long.class);

				method.invoke(_petitionRemoteModel, statusByUserId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatusByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
			_statusByUserUuid);
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_statusByUserUuid = statusByUserUuid;
	}

	@Override
	public String getStatusByUserName() {
		return _statusByUserName;
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusByUserName",
						String.class);

				method.invoke(_petitionRemoteModel, statusByUserName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;

		if (_petitionRemoteModel != null) {
			try {
				Class<?> clazz = _petitionRemoteModel.getClass();

				Method method = clazz.getMethod("setStatusDate", Date.class);

				method.invoke(_petitionRemoteModel, statusDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Petition.class.getName()));
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved}
	 */
	@Override
	public boolean getApproved() {
		return isApproved();
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public BaseModel<?> getPetitionRemoteModel() {
		return _petitionRemoteModel;
	}

	public void setPetitionRemoteModel(BaseModel<?> petitionRemoteModel) {
		_petitionRemoteModel = petitionRemoteModel;
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

		Class<?> remoteModelClass = _petitionRemoteModel.getClass();

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

		Object returnValue = method.invoke(_petitionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			PetitionLocalServiceUtil.addPetition(this);
		}
		else {
			PetitionLocalServiceUtil.updatePetition(this);
		}
	}

	@Override
	public Petition toEscapedModel() {
		return (Petition)ProxyUtil.newProxyInstance(Petition.class.getClassLoader(),
			new Class[] { Petition.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		PetitionClp clone = new PetitionClp();

		clone.setUuid(getUuid());
		clone.setPetitionId(getPetitionId());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setPetitionNumber(getPetitionNumber());
		clone.setPublishDate(getPublishDate());
		clone.setSignUnit(getSignUnit());
		clone.setSigner(getSigner());
		clone.setDesignee(getDesignee());
		clone.setPlusSign(getPlusSign());
		clone.setSubject(getSubject());
		clone.setExplanation(getExplanation());
		clone.setComments(getComments());
		clone.setCommentsByMonk(getCommentsByMonk());
		clone.setCommentsByManagement(getCommentsByManagement());
		clone.setCommentsByCEO(getCommentsByCEO());
		clone.setCommentsByAides(getCommentsByAides());
		clone.setStatus(getStatus());
		clone.setStatusByUserId(getStatusByUserId());
		clone.setStatusByUserName(getStatusByUserName());
		clone.setStatusDate(getStatusDate());

		return clone;
	}

	@Override
	public int compareTo(Petition petition) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), petition.getCreateDate());

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

		if (!(obj instanceof PetitionClp)) {
			return false;
		}

		PetitionClp petition = (PetitionClp)obj;

		long primaryKey = petition.getPrimaryKey();

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
		StringBundler sb = new StringBundler(51);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", petitionId=");
		sb.append(getPetitionId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", petitionNumber=");
		sb.append(getPetitionNumber());
		sb.append(", publishDate=");
		sb.append(getPublishDate());
		sb.append(", signUnit=");
		sb.append(getSignUnit());
		sb.append(", signer=");
		sb.append(getSigner());
		sb.append(", designee=");
		sb.append(getDesignee());
		sb.append(", plusSign=");
		sb.append(getPlusSign());
		sb.append(", subject=");
		sb.append(getSubject());
		sb.append(", explanation=");
		sb.append(getExplanation());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append(", commentsByMonk=");
		sb.append(getCommentsByMonk());
		sb.append(", commentsByManagement=");
		sb.append(getCommentsByManagement());
		sb.append(", commentsByCEO=");
		sb.append(getCommentsByCEO());
		sb.append(", commentsByAides=");
		sb.append(getCommentsByAides());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusByUserName=");
		sb.append(getStatusByUserName());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("org.blisswisdom.model.Petition");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>petitionId</column-name><column-value><![CDATA[");
		sb.append(getPetitionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
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
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>petitionNumber</column-name><column-value><![CDATA[");
		sb.append(getPetitionNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>publishDate</column-name><column-value><![CDATA[");
		sb.append(getPublishDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signUnit</column-name><column-value><![CDATA[");
		sb.append(getSignUnit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>signer</column-name><column-value><![CDATA[");
		sb.append(getSigner());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>designee</column-name><column-value><![CDATA[");
		sb.append(getDesignee());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>plusSign</column-name><column-value><![CDATA[");
		sb.append(getPlusSign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subject</column-name><column-value><![CDATA[");
		sb.append(getSubject());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>explanation</column-name><column-value><![CDATA[");
		sb.append(getExplanation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commentsByMonk</column-name><column-value><![CDATA[");
		sb.append(getCommentsByMonk());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commentsByManagement</column-name><column-value><![CDATA[");
		sb.append(getCommentsByManagement());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commentsByCEO</column-name><column-value><![CDATA[");
		sb.append(getCommentsByCEO());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>commentsByAides</column-name><column-value><![CDATA[");
		sb.append(getCommentsByAides());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _petitionId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _petitionNumber;
	private Date _publishDate;
	private String _signUnit;
	private String _signer;
	private String _designee;
	private String _plusSign;
	private String _subject;
	private String _explanation;
	private String _comments;
	private String _commentsByMonk;
	private String _commentsByManagement;
	private String _commentsByCEO;
	private String _commentsByAides;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private String _statusByUserName;
	private Date _statusDate;
	private BaseModel<?> _petitionRemoteModel;
	private Class<?> _clpSerializerClass = org.blisswisdom.service.ClpSerializer.class;
}