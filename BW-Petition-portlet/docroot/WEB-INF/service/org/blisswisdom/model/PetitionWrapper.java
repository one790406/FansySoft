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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Petition}.
 * </p>
 *
 * @author Danny
 * @see Petition
 * @generated
 */
public class PetitionWrapper implements Petition, ModelWrapper<Petition> {
	public PetitionWrapper(Petition petition) {
		_petition = petition;
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

	/**
	* Returns the primary key of this petition.
	*
	* @return the primary key of this petition
	*/
	@Override
	public long getPrimaryKey() {
		return _petition.getPrimaryKey();
	}

	/**
	* Sets the primary key of this petition.
	*
	* @param primaryKey the primary key of this petition
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_petition.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this petition.
	*
	* @return the uuid of this petition
	*/
	@Override
	public java.lang.String getUuid() {
		return _petition.getUuid();
	}

	/**
	* Sets the uuid of this petition.
	*
	* @param uuid the uuid of this petition
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_petition.setUuid(uuid);
	}

	/**
	* Returns the petition ID of this petition.
	*
	* @return the petition ID of this petition
	*/
	@Override
	public long getPetitionId() {
		return _petition.getPetitionId();
	}

	/**
	* Sets the petition ID of this petition.
	*
	* @param petitionId the petition ID of this petition
	*/
	@Override
	public void setPetitionId(long petitionId) {
		_petition.setPetitionId(petitionId);
	}

	/**
	* Returns the company ID of this petition.
	*
	* @return the company ID of this petition
	*/
	@Override
	public long getCompanyId() {
		return _petition.getCompanyId();
	}

	/**
	* Sets the company ID of this petition.
	*
	* @param companyId the company ID of this petition
	*/
	@Override
	public void setCompanyId(long companyId) {
		_petition.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this petition.
	*
	* @return the group ID of this petition
	*/
	@Override
	public long getGroupId() {
		return _petition.getGroupId();
	}

	/**
	* Sets the group ID of this petition.
	*
	* @param groupId the group ID of this petition
	*/
	@Override
	public void setGroupId(long groupId) {
		_petition.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this petition.
	*
	* @return the user ID of this petition
	*/
	@Override
	public long getUserId() {
		return _petition.getUserId();
	}

	/**
	* Sets the user ID of this petition.
	*
	* @param userId the user ID of this petition
	*/
	@Override
	public void setUserId(long userId) {
		_petition.setUserId(userId);
	}

	/**
	* Returns the user uuid of this petition.
	*
	* @return the user uuid of this petition
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petition.getUserUuid();
	}

	/**
	* Sets the user uuid of this petition.
	*
	* @param userUuid the user uuid of this petition
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_petition.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this petition.
	*
	* @return the user name of this petition
	*/
	@Override
	public java.lang.String getUserName() {
		return _petition.getUserName();
	}

	/**
	* Sets the user name of this petition.
	*
	* @param userName the user name of this petition
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_petition.setUserName(userName);
	}

	/**
	* Returns the create date of this petition.
	*
	* @return the create date of this petition
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _petition.getCreateDate();
	}

	/**
	* Sets the create date of this petition.
	*
	* @param createDate the create date of this petition
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_petition.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this petition.
	*
	* @return the modified date of this petition
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _petition.getModifiedDate();
	}

	/**
	* Sets the modified date of this petition.
	*
	* @param modifiedDate the modified date of this petition
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_petition.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the petition number of this petition.
	*
	* @return the petition number of this petition
	*/
	@Override
	public java.lang.String getPetitionNumber() {
		return _petition.getPetitionNumber();
	}

	/**
	* Sets the petition number of this petition.
	*
	* @param petitionNumber the petition number of this petition
	*/
	@Override
	public void setPetitionNumber(java.lang.String petitionNumber) {
		_petition.setPetitionNumber(petitionNumber);
	}

	/**
	* Returns the publish date of this petition.
	*
	* @return the publish date of this petition
	*/
	@Override
	public java.util.Date getPublishDate() {
		return _petition.getPublishDate();
	}

	/**
	* Sets the publish date of this petition.
	*
	* @param publishDate the publish date of this petition
	*/
	@Override
	public void setPublishDate(java.util.Date publishDate) {
		_petition.setPublishDate(publishDate);
	}

	/**
	* Returns the sign unit of this petition.
	*
	* @return the sign unit of this petition
	*/
	@Override
	public java.lang.String getSignUnit() {
		return _petition.getSignUnit();
	}

	/**
	* Sets the sign unit of this petition.
	*
	* @param signUnit the sign unit of this petition
	*/
	@Override
	public void setSignUnit(java.lang.String signUnit) {
		_petition.setSignUnit(signUnit);
	}

	/**
	* Returns the signer of this petition.
	*
	* @return the signer of this petition
	*/
	@Override
	public java.lang.String getSigner() {
		return _petition.getSigner();
	}

	/**
	* Sets the signer of this petition.
	*
	* @param signer the signer of this petition
	*/
	@Override
	public void setSigner(java.lang.String signer) {
		_petition.setSigner(signer);
	}

	/**
	* Returns the designee of this petition.
	*
	* @return the designee of this petition
	*/
	@Override
	public java.lang.String getDesignee() {
		return _petition.getDesignee();
	}

	/**
	* Sets the designee of this petition.
	*
	* @param designee the designee of this petition
	*/
	@Override
	public void setDesignee(java.lang.String designee) {
		_petition.setDesignee(designee);
	}

	/**
	* Returns the plus sign of this petition.
	*
	* @return the plus sign of this petition
	*/
	@Override
	public java.lang.String getPlusSign() {
		return _petition.getPlusSign();
	}

	/**
	* Sets the plus sign of this petition.
	*
	* @param plusSign the plus sign of this petition
	*/
	@Override
	public void setPlusSign(java.lang.String plusSign) {
		_petition.setPlusSign(plusSign);
	}

	/**
	* Returns the subject of this petition.
	*
	* @return the subject of this petition
	*/
	@Override
	public java.lang.String getSubject() {
		return _petition.getSubject();
	}

	/**
	* Sets the subject of this petition.
	*
	* @param subject the subject of this petition
	*/
	@Override
	public void setSubject(java.lang.String subject) {
		_petition.setSubject(subject);
	}

	/**
	* Returns the explanation of this petition.
	*
	* @return the explanation of this petition
	*/
	@Override
	public java.lang.String getExplanation() {
		return _petition.getExplanation();
	}

	/**
	* Sets the explanation of this petition.
	*
	* @param explanation the explanation of this petition
	*/
	@Override
	public void setExplanation(java.lang.String explanation) {
		_petition.setExplanation(explanation);
	}

	/**
	* Returns the comments of this petition.
	*
	* @return the comments of this petition
	*/
	@Override
	public java.lang.String getComments() {
		return _petition.getComments();
	}

	/**
	* Sets the comments of this petition.
	*
	* @param comments the comments of this petition
	*/
	@Override
	public void setComments(java.lang.String comments) {
		_petition.setComments(comments);
	}

	/**
	* Returns the comments by monk of this petition.
	*
	* @return the comments by monk of this petition
	*/
	@Override
	public java.lang.String getCommentsByMonk() {
		return _petition.getCommentsByMonk();
	}

	/**
	* Sets the comments by monk of this petition.
	*
	* @param commentsByMonk the comments by monk of this petition
	*/
	@Override
	public void setCommentsByMonk(java.lang.String commentsByMonk) {
		_petition.setCommentsByMonk(commentsByMonk);
	}

	/**
	* Returns the comments by management of this petition.
	*
	* @return the comments by management of this petition
	*/
	@Override
	public java.lang.String getCommentsByManagement() {
		return _petition.getCommentsByManagement();
	}

	/**
	* Sets the comments by management of this petition.
	*
	* @param commentsByManagement the comments by management of this petition
	*/
	@Override
	public void setCommentsByManagement(java.lang.String commentsByManagement) {
		_petition.setCommentsByManagement(commentsByManagement);
	}

	/**
	* Returns the comments by c e o of this petition.
	*
	* @return the comments by c e o of this petition
	*/
	@Override
	public java.lang.String getCommentsByCEO() {
		return _petition.getCommentsByCEO();
	}

	/**
	* Sets the comments by c e o of this petition.
	*
	* @param commentsByCEO the comments by c e o of this petition
	*/
	@Override
	public void setCommentsByCEO(java.lang.String commentsByCEO) {
		_petition.setCommentsByCEO(commentsByCEO);
	}

	/**
	* Returns the comments by aides of this petition.
	*
	* @return the comments by aides of this petition
	*/
	@Override
	public java.lang.String getCommentsByAides() {
		return _petition.getCommentsByAides();
	}

	/**
	* Sets the comments by aides of this petition.
	*
	* @param commentsByAides the comments by aides of this petition
	*/
	@Override
	public void setCommentsByAides(java.lang.String commentsByAides) {
		_petition.setCommentsByAides(commentsByAides);
	}

	/**
	* Returns the status of this petition.
	*
	* @return the status of this petition
	*/
	@Override
	public int getStatus() {
		return _petition.getStatus();
	}

	/**
	* Sets the status of this petition.
	*
	* @param status the status of this petition
	*/
	@Override
	public void setStatus(int status) {
		_petition.setStatus(status);
	}

	/**
	* Returns the status by user ID of this petition.
	*
	* @return the status by user ID of this petition
	*/
	@Override
	public long getStatusByUserId() {
		return _petition.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this petition.
	*
	* @param statusByUserId the status by user ID of this petition
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_petition.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this petition.
	*
	* @return the status by user uuid of this petition
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petition.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this petition.
	*
	* @param statusByUserUuid the status by user uuid of this petition
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_petition.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status by user name of this petition.
	*
	* @return the status by user name of this petition
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _petition.getStatusByUserName();
	}

	/**
	* Sets the status by user name of this petition.
	*
	* @param statusByUserName the status by user name of this petition
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_petition.setStatusByUserName(statusByUserName);
	}

	/**
	* Returns the status date of this petition.
	*
	* @return the status date of this petition
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _petition.getStatusDate();
	}

	/**
	* Sets the status date of this petition.
	*
	* @param statusDate the status date of this petition
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_petition.setStatusDate(statusDate);
	}

	/**
	* @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	*/
	@Override
	public boolean getApproved() {
		return _petition.getApproved();
	}

	/**
	* Returns <code>true</code> if this petition is approved.
	*
	* @return <code>true</code> if this petition is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _petition.isApproved();
	}

	/**
	* Returns <code>true</code> if this petition is denied.
	*
	* @return <code>true</code> if this petition is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _petition.isDenied();
	}

	/**
	* Returns <code>true</code> if this petition is a draft.
	*
	* @return <code>true</code> if this petition is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _petition.isDraft();
	}

	/**
	* Returns <code>true</code> if this petition is expired.
	*
	* @return <code>true</code> if this petition is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _petition.isExpired();
	}

	/**
	* Returns <code>true</code> if this petition is inactive.
	*
	* @return <code>true</code> if this petition is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _petition.isInactive();
	}

	/**
	* Returns <code>true</code> if this petition is incomplete.
	*
	* @return <code>true</code> if this petition is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _petition.isIncomplete();
	}

	/**
	* Returns <code>true</code> if this petition is pending.
	*
	* @return <code>true</code> if this petition is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _petition.isPending();
	}

	/**
	* Returns <code>true</code> if this petition is scheduled.
	*
	* @return <code>true</code> if this petition is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _petition.isScheduled();
	}

	@Override
	public boolean isNew() {
		return _petition.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_petition.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _petition.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_petition.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _petition.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _petition.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_petition.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _petition.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_petition.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_petition.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_petition.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PetitionWrapper((Petition)_petition.clone());
	}

	@Override
	public int compareTo(org.blisswisdom.model.Petition petition) {
		return _petition.compareTo(petition);
	}

	@Override
	public int hashCode() {
		return _petition.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.blisswisdom.model.Petition> toCacheModel() {
		return _petition.toCacheModel();
	}

	@Override
	public org.blisswisdom.model.Petition toEscapedModel() {
		return new PetitionWrapper(_petition.toEscapedModel());
	}

	@Override
	public org.blisswisdom.model.Petition toUnescapedModel() {
		return new PetitionWrapper(_petition.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _petition.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _petition.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_petition.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PetitionWrapper)) {
			return false;
		}

		PetitionWrapper petitionWrapper = (PetitionWrapper)obj;

		if (Validator.equals(_petition, petitionWrapper._petition)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _petition.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Petition getWrappedPetition() {
		return _petition;
	}

	@Override
	public Petition getWrappedModel() {
		return _petition;
	}

	@Override
	public void resetOriginalValues() {
		_petition.resetOriginalValues();
	}

	private Petition _petition;
}