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

package org.blisswisdom.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import org.blisswisdom.model.Attachment;

/**
 * The persistence interface for the attachment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danny
 * @see AttachmentPersistenceImpl
 * @see AttachmentUtil
 * @generated
 */
public interface AttachmentPersistence extends BasePersistence<Attachment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttachmentUtil} to access the attachment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the attachments where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @return the matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.Attachment> findByPetitionId(
		long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the attachments where petitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param petitionId the petition ID
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @return the range of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.Attachment> findByPetitionId(
		long petitionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the attachments where petitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param petitionId the petition ID
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.Attachment> findByPetitionId(
		long petitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first attachment in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment
	* @throws org.blisswisdom.NoSuchAttachmentException if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment findByPetitionId_First(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException;

	/**
	* Returns the first attachment in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment fetchByPetitionId_First(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last attachment in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment
	* @throws org.blisswisdom.NoSuchAttachmentException if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment findByPetitionId_Last(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException;

	/**
	* Returns the last attachment in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment fetchByPetitionId_Last(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the attachments before and after the current attachment in the ordered set where petitionId = &#63;.
	*
	* @param attachmentId the primary key of the current attachment
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next attachment
	* @throws org.blisswisdom.NoSuchAttachmentException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment[] findByPetitionId_PrevAndNext(
		long attachmentId, long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException;

	/**
	* Removes all the attachments where petitionId = &#63; from the database.
	*
	* @param petitionId the petition ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of attachments where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @return the number of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the attachment where attachmentEntryId = &#63; or throws a {@link org.blisswisdom.NoSuchAttachmentException} if it could not be found.
	*
	* @param attachmentEntryId the attachment entry ID
	* @return the matching attachment
	* @throws org.blisswisdom.NoSuchAttachmentException if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment findByAttachmentEntryId(
		long attachmentEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException;

	/**
	* Returns the attachment where attachmentEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param attachmentEntryId the attachment entry ID
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment fetchByAttachmentEntryId(
		long attachmentEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the attachment where attachmentEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param attachmentEntryId the attachment entry ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment fetchByAttachmentEntryId(
		long attachmentEntryId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the attachment where attachmentEntryId = &#63; from the database.
	*
	* @param attachmentEntryId the attachment entry ID
	* @return the attachment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment removeByAttachmentEntryId(
		long attachmentEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException;

	/**
	* Returns the number of attachments where attachmentEntryId = &#63;.
	*
	* @param attachmentEntryId the attachment entry ID
	* @return the number of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countByAttachmentEntryId(long attachmentEntryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the attachment in the entity cache if it is enabled.
	*
	* @param attachment the attachment
	*/
	public void cacheResult(org.blisswisdom.model.Attachment attachment);

	/**
	* Caches the attachments in the entity cache if it is enabled.
	*
	* @param attachments the attachments
	*/
	public void cacheResult(
		java.util.List<org.blisswisdom.model.Attachment> attachments);

	/**
	* Creates a new attachment with the primary key. Does not add the attachment to the database.
	*
	* @param attachmentId the primary key for the new attachment
	* @return the new attachment
	*/
	public org.blisswisdom.model.Attachment create(long attachmentId);

	/**
	* Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment that was removed
	* @throws org.blisswisdom.NoSuchAttachmentException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment remove(long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException;

	public org.blisswisdom.model.Attachment updateImpl(
		org.blisswisdom.model.Attachment attachment)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the attachment with the primary key or throws a {@link org.blisswisdom.NoSuchAttachmentException} if it could not be found.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment
	* @throws org.blisswisdom.NoSuchAttachmentException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment findByPrimaryKey(long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException;

	/**
	* Returns the attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Attachment fetchByPrimaryKey(long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the attachments.
	*
	* @return the attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.Attachment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @return the range of attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.Attachment> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the attachments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.AttachmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attachments
	* @param end the upper bound of the range of attachments (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of attachments
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.Attachment> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the attachments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of attachments.
	*
	* @return the number of attachments
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}