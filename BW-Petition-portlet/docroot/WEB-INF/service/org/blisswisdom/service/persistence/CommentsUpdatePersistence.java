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

import org.blisswisdom.model.CommentsUpdate;

/**
 * The persistence interface for the comments update service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danny
 * @see CommentsUpdatePersistenceImpl
 * @see CommentsUpdateUtil
 * @generated
 */
public interface CommentsUpdatePersistence extends BasePersistence<CommentsUpdate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CommentsUpdateUtil} to access the comments update persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the comments updates where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @return the matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.CommentsUpdate> findByPetitionId(
		long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the comments updates where petitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param petitionId the petition ID
	* @param start the lower bound of the range of comments updates
	* @param end the upper bound of the range of comments updates (not inclusive)
	* @return the range of matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.CommentsUpdate> findByPetitionId(
		long petitionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the comments updates where petitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param petitionId the petition ID
	* @param start the lower bound of the range of comments updates
	* @param end the upper bound of the range of comments updates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.CommentsUpdate> findByPetitionId(
		long petitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first comments update in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching comments update
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate findByPetitionId_First(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException;

	/**
	* Returns the first comments update in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching comments update, or <code>null</code> if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate fetchByPetitionId_First(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last comments update in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching comments update
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate findByPetitionId_Last(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException;

	/**
	* Returns the last comments update in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching comments update, or <code>null</code> if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate fetchByPetitionId_Last(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the comments updates before and after the current comments update in the ordered set where petitionId = &#63;.
	*
	* @param commentsUpdateId the primary key of the current comments update
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next comments update
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate[] findByPetitionId_PrevAndNext(
		long commentsUpdateId, long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException;

	/**
	* Removes all the comments updates where petitionId = &#63; from the database.
	*
	* @param petitionId the petition ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of comments updates where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @return the number of matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public int countByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the comments updates where petitionId = &#63; and commentsType = &#63;.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @return the matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.CommentsUpdate> findByP_C(
		long petitionId, java.lang.String commentsType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the comments updates where petitionId = &#63; and commentsType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @param start the lower bound of the range of comments updates
	* @param end the upper bound of the range of comments updates (not inclusive)
	* @return the range of matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.CommentsUpdate> findByP_C(
		long petitionId, java.lang.String commentsType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the comments updates where petitionId = &#63; and commentsType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @param start the lower bound of the range of comments updates
	* @param end the upper bound of the range of comments updates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.CommentsUpdate> findByP_C(
		long petitionId, java.lang.String commentsType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching comments update
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate findByP_C_First(
		long petitionId, java.lang.String commentsType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException;

	/**
	* Returns the first comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching comments update, or <code>null</code> if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate fetchByP_C_First(
		long petitionId, java.lang.String commentsType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching comments update
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate findByP_C_Last(
		long petitionId, java.lang.String commentsType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException;

	/**
	* Returns the last comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching comments update, or <code>null</code> if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate fetchByP_C_Last(
		long petitionId, java.lang.String commentsType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the comments updates before and after the current comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	*
	* @param commentsUpdateId the primary key of the current comments update
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next comments update
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate[] findByP_C_PrevAndNext(
		long commentsUpdateId, long petitionId, java.lang.String commentsType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException;

	/**
	* Removes all the comments updates where petitionId = &#63; and commentsType = &#63; from the database.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_C(long petitionId, java.lang.String commentsType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of comments updates where petitionId = &#63; and commentsType = &#63;.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @return the number of matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_C(long petitionId, java.lang.String commentsType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the comments update in the entity cache if it is enabled.
	*
	* @param commentsUpdate the comments update
	*/
	public void cacheResult(org.blisswisdom.model.CommentsUpdate commentsUpdate);

	/**
	* Caches the comments updates in the entity cache if it is enabled.
	*
	* @param commentsUpdates the comments updates
	*/
	public void cacheResult(
		java.util.List<org.blisswisdom.model.CommentsUpdate> commentsUpdates);

	/**
	* Creates a new comments update with the primary key. Does not add the comments update to the database.
	*
	* @param commentsUpdateId the primary key for the new comments update
	* @return the new comments update
	*/
	public org.blisswisdom.model.CommentsUpdate create(long commentsUpdateId);

	/**
	* Removes the comments update with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commentsUpdateId the primary key of the comments update
	* @return the comments update that was removed
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate remove(long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException;

	public org.blisswisdom.model.CommentsUpdate updateImpl(
		org.blisswisdom.model.CommentsUpdate commentsUpdate)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the comments update with the primary key or throws a {@link org.blisswisdom.NoSuchCommentsUpdateException} if it could not be found.
	*
	* @param commentsUpdateId the primary key of the comments update
	* @return the comments update
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate findByPrimaryKey(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException;

	/**
	* Returns the comments update with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param commentsUpdateId the primary key of the comments update
	* @return the comments update, or <code>null</code> if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.CommentsUpdate fetchByPrimaryKey(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the comments updates.
	*
	* @return the comments updates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.CommentsUpdate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the comments updates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of comments updates
	* @param end the upper bound of the range of comments updates (not inclusive)
	* @return the range of comments updates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.CommentsUpdate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the comments updates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of comments updates
	* @param end the upper bound of the range of comments updates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of comments updates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.CommentsUpdate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the comments updates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of comments updates.
	*
	* @return the number of comments updates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}