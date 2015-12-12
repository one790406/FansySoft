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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import org.blisswisdom.model.Attachment;

import java.util.List;

/**
 * The persistence utility for the attachment service. This utility wraps {@link AttachmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danny
 * @see AttachmentPersistence
 * @see AttachmentPersistenceImpl
 * @generated
 */
public class AttachmentUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Attachment attachment) {
		getPersistence().clearCache(attachment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Attachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Attachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Attachment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Attachment update(Attachment attachment)
		throws SystemException {
		return getPersistence().update(attachment);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Attachment update(Attachment attachment,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(attachment, serviceContext);
	}

	/**
	* Returns all the attachments where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @return the matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Attachment> findByPetitionId(
		long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPetitionId(petitionId);
	}

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
	public static java.util.List<org.blisswisdom.model.Attachment> findByPetitionId(
		long petitionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPetitionId(petitionId, start, end);
	}

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
	public static java.util.List<org.blisswisdom.model.Attachment> findByPetitionId(
		long petitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPetitionId(petitionId, start, end, orderByComparator);
	}

	/**
	* Returns the first attachment in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment
	* @throws org.blisswisdom.NoSuchAttachmentException if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment findByPetitionId_First(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException {
		return getPersistence()
				   .findByPetitionId_First(petitionId, orderByComparator);
	}

	/**
	* Returns the first attachment in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment fetchByPetitionId_First(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPetitionId_First(petitionId, orderByComparator);
	}

	/**
	* Returns the last attachment in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment
	* @throws org.blisswisdom.NoSuchAttachmentException if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment findByPetitionId_Last(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException {
		return getPersistence()
				   .findByPetitionId_Last(petitionId, orderByComparator);
	}

	/**
	* Returns the last attachment in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment fetchByPetitionId_Last(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPetitionId_Last(petitionId, orderByComparator);
	}

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
	public static org.blisswisdom.model.Attachment[] findByPetitionId_PrevAndNext(
		long attachmentId, long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException {
		return getPersistence()
				   .findByPetitionId_PrevAndNext(attachmentId, petitionId,
			orderByComparator);
	}

	/**
	* Removes all the attachments where petitionId = &#63; from the database.
	*
	* @param petitionId the petition ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPetitionId(petitionId);
	}

	/**
	* Returns the number of attachments where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @return the number of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPetitionId(petitionId);
	}

	/**
	* Returns the attachment where attachmentEntryId = &#63; or throws a {@link org.blisswisdom.NoSuchAttachmentException} if it could not be found.
	*
	* @param attachmentEntryId the attachment entry ID
	* @return the matching attachment
	* @throws org.blisswisdom.NoSuchAttachmentException if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment findByAttachmentEntryId(
		long attachmentEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException {
		return getPersistence().findByAttachmentEntryId(attachmentEntryId);
	}

	/**
	* Returns the attachment where attachmentEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param attachmentEntryId the attachment entry ID
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment fetchByAttachmentEntryId(
		long attachmentEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByAttachmentEntryId(attachmentEntryId);
	}

	/**
	* Returns the attachment where attachmentEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param attachmentEntryId the attachment entry ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching attachment, or <code>null</code> if a matching attachment could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment fetchByAttachmentEntryId(
		long attachmentEntryId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByAttachmentEntryId(attachmentEntryId,
			retrieveFromCache);
	}

	/**
	* Removes the attachment where attachmentEntryId = &#63; from the database.
	*
	* @param attachmentEntryId the attachment entry ID
	* @return the attachment that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment removeByAttachmentEntryId(
		long attachmentEntryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException {
		return getPersistence().removeByAttachmentEntryId(attachmentEntryId);
	}

	/**
	* Returns the number of attachments where attachmentEntryId = &#63;.
	*
	* @param attachmentEntryId the attachment entry ID
	* @return the number of matching attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int countByAttachmentEntryId(long attachmentEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByAttachmentEntryId(attachmentEntryId);
	}

	/**
	* Caches the attachment in the entity cache if it is enabled.
	*
	* @param attachment the attachment
	*/
	public static void cacheResult(org.blisswisdom.model.Attachment attachment) {
		getPersistence().cacheResult(attachment);
	}

	/**
	* Caches the attachments in the entity cache if it is enabled.
	*
	* @param attachments the attachments
	*/
	public static void cacheResult(
		java.util.List<org.blisswisdom.model.Attachment> attachments) {
		getPersistence().cacheResult(attachments);
	}

	/**
	* Creates a new attachment with the primary key. Does not add the attachment to the database.
	*
	* @param attachmentId the primary key for the new attachment
	* @return the new attachment
	*/
	public static org.blisswisdom.model.Attachment create(long attachmentId) {
		return getPersistence().create(attachmentId);
	}

	/**
	* Removes the attachment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment that was removed
	* @throws org.blisswisdom.NoSuchAttachmentException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment remove(long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException {
		return getPersistence().remove(attachmentId);
	}

	public static org.blisswisdom.model.Attachment updateImpl(
		org.blisswisdom.model.Attachment attachment)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(attachment);
	}

	/**
	* Returns the attachment with the primary key or throws a {@link org.blisswisdom.NoSuchAttachmentException} if it could not be found.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment
	* @throws org.blisswisdom.NoSuchAttachmentException if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment findByPrimaryKey(
		long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchAttachmentException {
		return getPersistence().findByPrimaryKey(attachmentId);
	}

	/**
	* Returns the attachment with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param attachmentId the primary key of the attachment
	* @return the attachment, or <code>null</code> if a attachment with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Attachment fetchByPrimaryKey(
		long attachmentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(attachmentId);
	}

	/**
	* Returns all the attachments.
	*
	* @return the attachments
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Attachment> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.blisswisdom.model.Attachment> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.blisswisdom.model.Attachment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the attachments from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of attachments.
	*
	* @return the number of attachments
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AttachmentPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AttachmentPersistence)PortletBeanLocatorUtil.locate(org.blisswisdom.service.ClpSerializer.getServletContextName(),
					AttachmentPersistence.class.getName());

			ReferenceRegistry.registerReference(AttachmentUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AttachmentPersistence persistence) {
	}

	private static AttachmentPersistence _persistence;
}