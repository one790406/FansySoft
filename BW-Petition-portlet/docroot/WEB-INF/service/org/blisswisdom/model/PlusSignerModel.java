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
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PlusSigner service. Represents a row in the &quot;bw_PlusSigner&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.blisswisdom.model.impl.PlusSignerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.blisswisdom.model.impl.PlusSignerImpl}.
 * </p>
 *
 * @author Danny
 * @see PlusSigner
 * @see org.blisswisdom.model.impl.PlusSignerImpl
 * @see org.blisswisdom.model.impl.PlusSignerModelImpl
 * @generated
 */
public interface PlusSignerModel extends BaseModel<PlusSigner> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a plus signer model instance should use the {@link PlusSigner} interface instead.
	 */

	/**
	 * Returns the primary key of this plus signer.
	 *
	 * @return the primary key of this plus signer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this plus signer.
	 *
	 * @param primaryKey the primary key of this plus signer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the plus signer ID of this plus signer.
	 *
	 * @return the plus signer ID of this plus signer
	 */
	public long getPlusSignerId();

	/**
	 * Sets the plus signer ID of this plus signer.
	 *
	 * @param plusSignerId the plus signer ID of this plus signer
	 */
	public void setPlusSignerId(long plusSignerId);

	/**
	 * Returns the petition ID of this plus signer.
	 *
	 * @return the petition ID of this plus signer
	 */
	public long getPetitionId();

	/**
	 * Sets the petition ID of this plus signer.
	 *
	 * @param petitionId the petition ID of this plus signer
	 */
	public void setPetitionId(long petitionId);

	/**
	 * Returns the user ID of this plus signer.
	 *
	 * @return the user ID of this plus signer
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this plus signer.
	 *
	 * @param userId the user ID of this plus signer
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this plus signer.
	 *
	 * @return the user uuid of this plus signer
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this plus signer.
	 *
	 * @param userUuid the user uuid of this plus signer
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this plus signer.
	 *
	 * @return the user name of this plus signer
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this plus signer.
	 *
	 * @param userName the user name of this plus signer
	 */
	public void setUserName(String userName);

	/**
	 * Returns the signer ID of this plus signer.
	 *
	 * @return the signer ID of this plus signer
	 */
	public long getSignerId();

	/**
	 * Sets the signer ID of this plus signer.
	 *
	 * @param signerId the signer ID of this plus signer
	 */
	public void setSignerId(long signerId);

	/**
	 * Returns the signer name of this plus signer.
	 *
	 * @return the signer name of this plus signer
	 */
	@AutoEscape
	public String getSignerName();

	/**
	 * Sets the signer name of this plus signer.
	 *
	 * @param signerName the signer name of this plus signer
	 */
	public void setSignerName(String signerName);

	/**
	 * Returns the signer type of this plus signer.
	 *
	 * @return the signer type of this plus signer
	 */
	@AutoEscape
	public String getSignerType();

	/**
	 * Sets the signer type of this plus signer.
	 *
	 * @param signerType the signer type of this plus signer
	 */
	public void setSignerType(String signerType);

	/**
	 * Returns the create date of this plus signer.
	 *
	 * @return the create date of this plus signer
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this plus signer.
	 *
	 * @param createDate the create date of this plus signer
	 */
	public void setCreateDate(Date createDate);

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
	public int compareTo(PlusSigner plusSigner);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PlusSigner> toCacheModel();

	@Override
	public PlusSigner toEscapedModel();

	@Override
	public PlusSigner toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}