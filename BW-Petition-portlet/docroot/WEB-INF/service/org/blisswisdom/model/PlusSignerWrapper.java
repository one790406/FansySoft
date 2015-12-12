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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PlusSigner}.
 * </p>
 *
 * @author Danny
 * @see PlusSigner
 * @generated
 */
public class PlusSignerWrapper implements PlusSigner, ModelWrapper<PlusSigner> {
	public PlusSignerWrapper(PlusSigner plusSigner) {
		_plusSigner = plusSigner;
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

	/**
	* Returns the primary key of this plus signer.
	*
	* @return the primary key of this plus signer
	*/
	@Override
	public long getPrimaryKey() {
		return _plusSigner.getPrimaryKey();
	}

	/**
	* Sets the primary key of this plus signer.
	*
	* @param primaryKey the primary key of this plus signer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_plusSigner.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the plus signer ID of this plus signer.
	*
	* @return the plus signer ID of this plus signer
	*/
	@Override
	public long getPlusSignerId() {
		return _plusSigner.getPlusSignerId();
	}

	/**
	* Sets the plus signer ID of this plus signer.
	*
	* @param plusSignerId the plus signer ID of this plus signer
	*/
	@Override
	public void setPlusSignerId(long plusSignerId) {
		_plusSigner.setPlusSignerId(plusSignerId);
	}

	/**
	* Returns the petition ID of this plus signer.
	*
	* @return the petition ID of this plus signer
	*/
	@Override
	public long getPetitionId() {
		return _plusSigner.getPetitionId();
	}

	/**
	* Sets the petition ID of this plus signer.
	*
	* @param petitionId the petition ID of this plus signer
	*/
	@Override
	public void setPetitionId(long petitionId) {
		_plusSigner.setPetitionId(petitionId);
	}

	/**
	* Returns the user ID of this plus signer.
	*
	* @return the user ID of this plus signer
	*/
	@Override
	public long getUserId() {
		return _plusSigner.getUserId();
	}

	/**
	* Sets the user ID of this plus signer.
	*
	* @param userId the user ID of this plus signer
	*/
	@Override
	public void setUserId(long userId) {
		_plusSigner.setUserId(userId);
	}

	/**
	* Returns the user uuid of this plus signer.
	*
	* @return the user uuid of this plus signer
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _plusSigner.getUserUuid();
	}

	/**
	* Sets the user uuid of this plus signer.
	*
	* @param userUuid the user uuid of this plus signer
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_plusSigner.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this plus signer.
	*
	* @return the user name of this plus signer
	*/
	@Override
	public java.lang.String getUserName() {
		return _plusSigner.getUserName();
	}

	/**
	* Sets the user name of this plus signer.
	*
	* @param userName the user name of this plus signer
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_plusSigner.setUserName(userName);
	}

	/**
	* Returns the signer ID of this plus signer.
	*
	* @return the signer ID of this plus signer
	*/
	@Override
	public long getSignerId() {
		return _plusSigner.getSignerId();
	}

	/**
	* Sets the signer ID of this plus signer.
	*
	* @param signerId the signer ID of this plus signer
	*/
	@Override
	public void setSignerId(long signerId) {
		_plusSigner.setSignerId(signerId);
	}

	/**
	* Returns the signer name of this plus signer.
	*
	* @return the signer name of this plus signer
	*/
	@Override
	public java.lang.String getSignerName() {
		return _plusSigner.getSignerName();
	}

	/**
	* Sets the signer name of this plus signer.
	*
	* @param signerName the signer name of this plus signer
	*/
	@Override
	public void setSignerName(java.lang.String signerName) {
		_plusSigner.setSignerName(signerName);
	}

	/**
	* Returns the signer type of this plus signer.
	*
	* @return the signer type of this plus signer
	*/
	@Override
	public java.lang.String getSignerType() {
		return _plusSigner.getSignerType();
	}

	/**
	* Sets the signer type of this plus signer.
	*
	* @param signerType the signer type of this plus signer
	*/
	@Override
	public void setSignerType(java.lang.String signerType) {
		_plusSigner.setSignerType(signerType);
	}

	/**
	* Returns the create date of this plus signer.
	*
	* @return the create date of this plus signer
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _plusSigner.getCreateDate();
	}

	/**
	* Sets the create date of this plus signer.
	*
	* @param createDate the create date of this plus signer
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_plusSigner.setCreateDate(createDate);
	}

	@Override
	public boolean isNew() {
		return _plusSigner.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_plusSigner.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _plusSigner.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_plusSigner.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _plusSigner.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _plusSigner.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_plusSigner.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _plusSigner.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_plusSigner.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_plusSigner.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_plusSigner.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PlusSignerWrapper((PlusSigner)_plusSigner.clone());
	}

	@Override
	public int compareTo(org.blisswisdom.model.PlusSigner plusSigner) {
		return _plusSigner.compareTo(plusSigner);
	}

	@Override
	public int hashCode() {
		return _plusSigner.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.blisswisdom.model.PlusSigner> toCacheModel() {
		return _plusSigner.toCacheModel();
	}

	@Override
	public org.blisswisdom.model.PlusSigner toEscapedModel() {
		return new PlusSignerWrapper(_plusSigner.toEscapedModel());
	}

	@Override
	public org.blisswisdom.model.PlusSigner toUnescapedModel() {
		return new PlusSignerWrapper(_plusSigner.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _plusSigner.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _plusSigner.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_plusSigner.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PlusSignerWrapper)) {
			return false;
		}

		PlusSignerWrapper plusSignerWrapper = (PlusSignerWrapper)obj;

		if (Validator.equals(_plusSigner, plusSignerWrapper._plusSigner)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PlusSigner getWrappedPlusSigner() {
		return _plusSigner;
	}

	@Override
	public PlusSigner getWrappedModel() {
		return _plusSigner;
	}

	@Override
	public void resetOriginalValues() {
		_plusSigner.resetOriginalValues();
	}

	private PlusSigner _plusSigner;
}