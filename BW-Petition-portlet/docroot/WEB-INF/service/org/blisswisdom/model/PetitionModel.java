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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Petition service. Represents a row in the &quot;bw_Petition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.blisswisdom.model.impl.PetitionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.blisswisdom.model.impl.PetitionImpl}.
 * </p>
 *
 * @author Danny
 * @see Petition
 * @see org.blisswisdom.model.impl.PetitionImpl
 * @see org.blisswisdom.model.impl.PetitionModelImpl
 * @generated
 */
public interface PetitionModel extends BaseModel<Petition>, StagedGroupedModel,
	WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a petition model instance should use the {@link Petition} interface instead.
	 */

	/**
	 * Returns the primary key of this petition.
	 *
	 * @return the primary key of this petition
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this petition.
	 *
	 * @param primaryKey the primary key of this petition
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this petition.
	 *
	 * @return the uuid of this petition
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this petition.
	 *
	 * @param uuid the uuid of this petition
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the petition ID of this petition.
	 *
	 * @return the petition ID of this petition
	 */
	public long getPetitionId();

	/**
	 * Sets the petition ID of this petition.
	 *
	 * @param petitionId the petition ID of this petition
	 */
	public void setPetitionId(long petitionId);

	/**
	 * Returns the company ID of this petition.
	 *
	 * @return the company ID of this petition
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this petition.
	 *
	 * @param companyId the company ID of this petition
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this petition.
	 *
	 * @return the group ID of this petition
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this petition.
	 *
	 * @param groupId the group ID of this petition
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this petition.
	 *
	 * @return the user ID of this petition
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this petition.
	 *
	 * @param userId the user ID of this petition
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this petition.
	 *
	 * @return the user uuid of this petition
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this petition.
	 *
	 * @param userUuid the user uuid of this petition
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this petition.
	 *
	 * @return the user name of this petition
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this petition.
	 *
	 * @param userName the user name of this petition
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this petition.
	 *
	 * @return the create date of this petition
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this petition.
	 *
	 * @param createDate the create date of this petition
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this petition.
	 *
	 * @return the modified date of this petition
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this petition.
	 *
	 * @param modifiedDate the modified date of this petition
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the petition number of this petition.
	 *
	 * @return the petition number of this petition
	 */
	@AutoEscape
	public String getPetitionNumber();

	/**
	 * Sets the petition number of this petition.
	 *
	 * @param petitionNumber the petition number of this petition
	 */
	public void setPetitionNumber(String petitionNumber);

	/**
	 * Returns the publish date of this petition.
	 *
	 * @return the publish date of this petition
	 */
	public Date getPublishDate();

	/**
	 * Sets the publish date of this petition.
	 *
	 * @param publishDate the publish date of this petition
	 */
	public void setPublishDate(Date publishDate);

	/**
	 * Returns the sign unit of this petition.
	 *
	 * @return the sign unit of this petition
	 */
	@AutoEscape
	public String getSignUnit();

	/**
	 * Sets the sign unit of this petition.
	 *
	 * @param signUnit the sign unit of this petition
	 */
	public void setSignUnit(String signUnit);

	/**
	 * Returns the signer of this petition.
	 *
	 * @return the signer of this petition
	 */
	@AutoEscape
	public String getSigner();

	/**
	 * Sets the signer of this petition.
	 *
	 * @param signer the signer of this petition
	 */
	public void setSigner(String signer);

	/**
	 * Returns the designee of this petition.
	 *
	 * @return the designee of this petition
	 */
	@AutoEscape
	public String getDesignee();

	/**
	 * Sets the designee of this petition.
	 *
	 * @param designee the designee of this petition
	 */
	public void setDesignee(String designee);

	/**
	 * Returns the plus sign of this petition.
	 *
	 * @return the plus sign of this petition
	 */
	@AutoEscape
	public String getPlusSign();

	/**
	 * Sets the plus sign of this petition.
	 *
	 * @param plusSign the plus sign of this petition
	 */
	public void setPlusSign(String plusSign);

	/**
	 * Returns the subject of this petition.
	 *
	 * @return the subject of this petition
	 */
	@AutoEscape
	public String getSubject();

	/**
	 * Sets the subject of this petition.
	 *
	 * @param subject the subject of this petition
	 */
	public void setSubject(String subject);

	/**
	 * Returns the explanation of this petition.
	 *
	 * @return the explanation of this petition
	 */
	@AutoEscape
	public String getExplanation();

	/**
	 * Sets the explanation of this petition.
	 *
	 * @param explanation the explanation of this petition
	 */
	public void setExplanation(String explanation);

	/**
	 * Returns the comments of this petition.
	 *
	 * @return the comments of this petition
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this petition.
	 *
	 * @param comments the comments of this petition
	 */
	public void setComments(String comments);

	/**
	 * Returns the comments by monk of this petition.
	 *
	 * @return the comments by monk of this petition
	 */
	@AutoEscape
	public String getCommentsByMonk();

	/**
	 * Sets the comments by monk of this petition.
	 *
	 * @param commentsByMonk the comments by monk of this petition
	 */
	public void setCommentsByMonk(String commentsByMonk);

	/**
	 * Returns the comments by management of this petition.
	 *
	 * @return the comments by management of this petition
	 */
	@AutoEscape
	public String getCommentsByManagement();

	/**
	 * Sets the comments by management of this petition.
	 *
	 * @param commentsByManagement the comments by management of this petition
	 */
	public void setCommentsByManagement(String commentsByManagement);

	/**
	 * Returns the comments by c e o of this petition.
	 *
	 * @return the comments by c e o of this petition
	 */
	@AutoEscape
	public String getCommentsByCEO();

	/**
	 * Sets the comments by c e o of this petition.
	 *
	 * @param commentsByCEO the comments by c e o of this petition
	 */
	public void setCommentsByCEO(String commentsByCEO);

	/**
	 * Returns the comments by aides of this petition.
	 *
	 * @return the comments by aides of this petition
	 */
	@AutoEscape
	public String getCommentsByAides();

	/**
	 * Sets the comments by aides of this petition.
	 *
	 * @param commentsByAides the comments by aides of this petition
	 */
	public void setCommentsByAides(String commentsByAides);

	/**
	 * Returns the status of this petition.
	 *
	 * @return the status of this petition
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this petition.
	 *
	 * @param status the status of this petition
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this petition.
	 *
	 * @return the status by user ID of this petition
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this petition.
	 *
	 * @param statusByUserId the status by user ID of this petition
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this petition.
	 *
	 * @return the status by user uuid of this petition
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this petition.
	 *
	 * @param statusByUserUuid the status by user uuid of this petition
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this petition.
	 *
	 * @return the status by user name of this petition
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this petition.
	 *
	 * @param statusByUserName the status by user name of this petition
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this petition.
	 *
	 * @return the status date of this petition
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this petition.
	 *
	 * @param statusDate the status date of this petition
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	 */
	@Override
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this petition is approved.
	 *
	 * @return <code>true</code> if this petition is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this petition is denied.
	 *
	 * @return <code>true</code> if this petition is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this petition is a draft.
	 *
	 * @return <code>true</code> if this petition is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this petition is expired.
	 *
	 * @return <code>true</code> if this petition is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this petition is inactive.
	 *
	 * @return <code>true</code> if this petition is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this petition is incomplete.
	 *
	 * @return <code>true</code> if this petition is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this petition is pending.
	 *
	 * @return <code>true</code> if this petition is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this petition is scheduled.
	 *
	 * @return <code>true</code> if this petition is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Petition petition);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Petition> toCacheModel();

	@Override
	public Petition toEscapedModel();

	@Override
	public Petition toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}