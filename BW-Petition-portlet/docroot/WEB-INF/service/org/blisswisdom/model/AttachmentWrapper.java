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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Attachment}.
 * </p>
 *
 * @author Danny
 * @see Attachment
 * @generated
 */
public class AttachmentWrapper implements Attachment, ModelWrapper<Attachment> {
	public AttachmentWrapper(Attachment attachment) {
		_attachment = attachment;
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

	/**
	* Returns the primary key of this attachment.
	*
	* @return the primary key of this attachment
	*/
	@Override
	public long getPrimaryKey() {
		return _attachment.getPrimaryKey();
	}

	/**
	* Sets the primary key of this attachment.
	*
	* @param primaryKey the primary key of this attachment
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_attachment.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the attachment ID of this attachment.
	*
	* @return the attachment ID of this attachment
	*/
	@Override
	public long getAttachmentId() {
		return _attachment.getAttachmentId();
	}

	/**
	* Sets the attachment ID of this attachment.
	*
	* @param attachmentId the attachment ID of this attachment
	*/
	@Override
	public void setAttachmentId(long attachmentId) {
		_attachment.setAttachmentId(attachmentId);
	}

	/**
	* Returns the petition ID of this attachment.
	*
	* @return the petition ID of this attachment
	*/
	@Override
	public long getPetitionId() {
		return _attachment.getPetitionId();
	}

	/**
	* Sets the petition ID of this attachment.
	*
	* @param petitionId the petition ID of this attachment
	*/
	@Override
	public void setPetitionId(long petitionId) {
		_attachment.setPetitionId(petitionId);
	}

	/**
	* Returns the user ID of this attachment.
	*
	* @return the user ID of this attachment
	*/
	@Override
	public long getUserId() {
		return _attachment.getUserId();
	}

	/**
	* Sets the user ID of this attachment.
	*
	* @param userId the user ID of this attachment
	*/
	@Override
	public void setUserId(long userId) {
		_attachment.setUserId(userId);
	}

	/**
	* Returns the user uuid of this attachment.
	*
	* @return the user uuid of this attachment
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _attachment.getUserUuid();
	}

	/**
	* Sets the user uuid of this attachment.
	*
	* @param userUuid the user uuid of this attachment
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_attachment.setUserUuid(userUuid);
	}

	/**
	* Returns the attachment entry ID of this attachment.
	*
	* @return the attachment entry ID of this attachment
	*/
	@Override
	public long getAttachmentEntryId() {
		return _attachment.getAttachmentEntryId();
	}

	/**
	* Sets the attachment entry ID of this attachment.
	*
	* @param attachmentEntryId the attachment entry ID of this attachment
	*/
	@Override
	public void setAttachmentEntryId(long attachmentEntryId) {
		_attachment.setAttachmentEntryId(attachmentEntryId);
	}

	/**
	* Returns the attachment name of this attachment.
	*
	* @return the attachment name of this attachment
	*/
	@Override
	public java.lang.String getAttachmentName() {
		return _attachment.getAttachmentName();
	}

	/**
	* Sets the attachment name of this attachment.
	*
	* @param attachmentName the attachment name of this attachment
	*/
	@Override
	public void setAttachmentName(java.lang.String attachmentName) {
		_attachment.setAttachmentName(attachmentName);
	}

	@Override
	public boolean isNew() {
		return _attachment.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_attachment.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _attachment.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_attachment.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _attachment.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _attachment.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_attachment.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _attachment.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_attachment.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_attachment.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_attachment.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AttachmentWrapper((Attachment)_attachment.clone());
	}

	@Override
	public int compareTo(org.blisswisdom.model.Attachment attachment) {
		return _attachment.compareTo(attachment);
	}

	@Override
	public int hashCode() {
		return _attachment.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.blisswisdom.model.Attachment> toCacheModel() {
		return _attachment.toCacheModel();
	}

	@Override
	public org.blisswisdom.model.Attachment toEscapedModel() {
		return new AttachmentWrapper(_attachment.toEscapedModel());
	}

	@Override
	public org.blisswisdom.model.Attachment toUnescapedModel() {
		return new AttachmentWrapper(_attachment.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _attachment.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _attachment.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_attachment.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttachmentWrapper)) {
			return false;
		}

		AttachmentWrapper attachmentWrapper = (AttachmentWrapper)obj;

		if (Validator.equals(_attachment, attachmentWrapper._attachment)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Attachment getWrappedAttachment() {
		return _attachment;
	}

	@Override
	public Attachment getWrappedModel() {
		return _attachment;
	}

	@Override
	public void resetOriginalValues() {
		_attachment.resetOriginalValues();
	}

	private Attachment _attachment;
}