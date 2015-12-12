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
 * This class is a wrapper for {@link CommentsUpdate}.
 * </p>
 *
 * @author Danny
 * @see CommentsUpdate
 * @generated
 */
public class CommentsUpdateWrapper implements CommentsUpdate,
	ModelWrapper<CommentsUpdate> {
	public CommentsUpdateWrapper(CommentsUpdate commentsUpdate) {
		_commentsUpdate = commentsUpdate;
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

	/**
	* Returns the primary key of this comments update.
	*
	* @return the primary key of this comments update
	*/
	@Override
	public long getPrimaryKey() {
		return _commentsUpdate.getPrimaryKey();
	}

	/**
	* Sets the primary key of this comments update.
	*
	* @param primaryKey the primary key of this comments update
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_commentsUpdate.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the comments update ID of this comments update.
	*
	* @return the comments update ID of this comments update
	*/
	@Override
	public long getCommentsUpdateId() {
		return _commentsUpdate.getCommentsUpdateId();
	}

	/**
	* Sets the comments update ID of this comments update.
	*
	* @param commentsUpdateId the comments update ID of this comments update
	*/
	@Override
	public void setCommentsUpdateId(long commentsUpdateId) {
		_commentsUpdate.setCommentsUpdateId(commentsUpdateId);
	}

	/**
	* Returns the petition ID of this comments update.
	*
	* @return the petition ID of this comments update
	*/
	@Override
	public long getPetitionId() {
		return _commentsUpdate.getPetitionId();
	}

	/**
	* Sets the petition ID of this comments update.
	*
	* @param petitionId the petition ID of this comments update
	*/
	@Override
	public void setPetitionId(long petitionId) {
		_commentsUpdate.setPetitionId(petitionId);
	}

	/**
	* Returns the user ID of this comments update.
	*
	* @return the user ID of this comments update
	*/
	@Override
	public long getUserId() {
		return _commentsUpdate.getUserId();
	}

	/**
	* Sets the user ID of this comments update.
	*
	* @param userId the user ID of this comments update
	*/
	@Override
	public void setUserId(long userId) {
		_commentsUpdate.setUserId(userId);
	}

	/**
	* Returns the user uuid of this comments update.
	*
	* @return the user uuid of this comments update
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdate.getUserUuid();
	}

	/**
	* Sets the user uuid of this comments update.
	*
	* @param userUuid the user uuid of this comments update
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_commentsUpdate.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this comments update.
	*
	* @return the user name of this comments update
	*/
	@Override
	public java.lang.String getUserName() {
		return _commentsUpdate.getUserName();
	}

	/**
	* Sets the user name of this comments update.
	*
	* @param userName the user name of this comments update
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_commentsUpdate.setUserName(userName);
	}

	/**
	* Returns the comments type of this comments update.
	*
	* @return the comments type of this comments update
	*/
	@Override
	public java.lang.String getCommentsType() {
		return _commentsUpdate.getCommentsType();
	}

	/**
	* Sets the comments type of this comments update.
	*
	* @param commentsType the comments type of this comments update
	*/
	@Override
	public void setCommentsType(java.lang.String commentsType) {
		_commentsUpdate.setCommentsType(commentsType);
	}

	/**
	* Returns the comments content of this comments update.
	*
	* @return the comments content of this comments update
	*/
	@Override
	public java.lang.String getCommentsContent() {
		return _commentsUpdate.getCommentsContent();
	}

	/**
	* Sets the comments content of this comments update.
	*
	* @param commentsContent the comments content of this comments update
	*/
	@Override
	public void setCommentsContent(java.lang.String commentsContent) {
		_commentsUpdate.setCommentsContent(commentsContent);
	}

	/**
	* Returns the update time of this comments update.
	*
	* @return the update time of this comments update
	*/
	@Override
	public java.util.Date getUpdateTime() {
		return _commentsUpdate.getUpdateTime();
	}

	/**
	* Sets the update time of this comments update.
	*
	* @param updateTime the update time of this comments update
	*/
	@Override
	public void setUpdateTime(java.util.Date updateTime) {
		_commentsUpdate.setUpdateTime(updateTime);
	}

	@Override
	public boolean isNew() {
		return _commentsUpdate.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_commentsUpdate.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _commentsUpdate.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_commentsUpdate.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _commentsUpdate.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _commentsUpdate.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_commentsUpdate.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _commentsUpdate.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_commentsUpdate.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_commentsUpdate.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_commentsUpdate.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CommentsUpdateWrapper((CommentsUpdate)_commentsUpdate.clone());
	}

	@Override
	public int compareTo(org.blisswisdom.model.CommentsUpdate commentsUpdate) {
		return _commentsUpdate.compareTo(commentsUpdate);
	}

	@Override
	public int hashCode() {
		return _commentsUpdate.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<org.blisswisdom.model.CommentsUpdate> toCacheModel() {
		return _commentsUpdate.toCacheModel();
	}

	@Override
	public org.blisswisdom.model.CommentsUpdate toEscapedModel() {
		return new CommentsUpdateWrapper(_commentsUpdate.toEscapedModel());
	}

	@Override
	public org.blisswisdom.model.CommentsUpdate toUnescapedModel() {
		return new CommentsUpdateWrapper(_commentsUpdate.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _commentsUpdate.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _commentsUpdate.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_commentsUpdate.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CommentsUpdateWrapper)) {
			return false;
		}

		CommentsUpdateWrapper commentsUpdateWrapper = (CommentsUpdateWrapper)obj;

		if (Validator.equals(_commentsUpdate,
					commentsUpdateWrapper._commentsUpdate)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public CommentsUpdate getWrappedCommentsUpdate() {
		return _commentsUpdate;
	}

	@Override
	public CommentsUpdate getWrappedModel() {
		return _commentsUpdate;
	}

	@Override
	public void resetOriginalValues() {
		_commentsUpdate.resetOriginalValues();
	}

	private CommentsUpdate _commentsUpdate;
}