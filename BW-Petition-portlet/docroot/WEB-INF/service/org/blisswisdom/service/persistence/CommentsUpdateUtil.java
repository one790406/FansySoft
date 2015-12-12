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

import org.blisswisdom.model.CommentsUpdate;

import java.util.List;

/**
 * The persistence utility for the comments update service. This utility wraps {@link CommentsUpdatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danny
 * @see CommentsUpdatePersistence
 * @see CommentsUpdatePersistenceImpl
 * @generated
 */
public class CommentsUpdateUtil {
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
	public static void clearCache(CommentsUpdate commentsUpdate) {
		getPersistence().clearCache(commentsUpdate);
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
	public static List<CommentsUpdate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CommentsUpdate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CommentsUpdate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static CommentsUpdate update(CommentsUpdate commentsUpdate)
		throws SystemException {
		return getPersistence().update(commentsUpdate);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static CommentsUpdate update(CommentsUpdate commentsUpdate,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(commentsUpdate, serviceContext);
	}

	/**
	* Returns all the comments updates where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @return the matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.CommentsUpdate> findByPetitionId(
		long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPetitionId(petitionId);
	}

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
	public static java.util.List<org.blisswisdom.model.CommentsUpdate> findByPetitionId(
		long petitionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPetitionId(petitionId, start, end);
	}

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
	public static java.util.List<org.blisswisdom.model.CommentsUpdate> findByPetitionId(
		long petitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByPetitionId(petitionId, start, end, orderByComparator);
	}

	/**
	* Returns the first comments update in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching comments update
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate findByPetitionId_First(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException {
		return getPersistence()
				   .findByPetitionId_First(petitionId, orderByComparator);
	}

	/**
	* Returns the first comments update in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching comments update, or <code>null</code> if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate fetchByPetitionId_First(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPetitionId_First(petitionId, orderByComparator);
	}

	/**
	* Returns the last comments update in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching comments update
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate findByPetitionId_Last(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException {
		return getPersistence()
				   .findByPetitionId_Last(petitionId, orderByComparator);
	}

	/**
	* Returns the last comments update in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching comments update, or <code>null</code> if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate fetchByPetitionId_Last(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPetitionId_Last(petitionId, orderByComparator);
	}

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
	public static org.blisswisdom.model.CommentsUpdate[] findByPetitionId_PrevAndNext(
		long commentsUpdateId, long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException {
		return getPersistence()
				   .findByPetitionId_PrevAndNext(commentsUpdateId, petitionId,
			orderByComparator);
	}

	/**
	* Removes all the comments updates where petitionId = &#63; from the database.
	*
	* @param petitionId the petition ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByPetitionId(petitionId);
	}

	/**
	* Returns the number of comments updates where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @return the number of matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPetitionId(petitionId);
	}

	/**
	* Returns all the comments updates where petitionId = &#63; and commentsType = &#63;.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @return the matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.CommentsUpdate> findByP_C(
		long petitionId, java.lang.String commentsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_C(petitionId, commentsType);
	}

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
	public static java.util.List<org.blisswisdom.model.CommentsUpdate> findByP_C(
		long petitionId, java.lang.String commentsType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByP_C(petitionId, commentsType, start, end);
	}

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
	public static java.util.List<org.blisswisdom.model.CommentsUpdate> findByP_C(
		long petitionId, java.lang.String commentsType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByP_C(petitionId, commentsType, start, end,
			orderByComparator);
	}

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
	public static org.blisswisdom.model.CommentsUpdate findByP_C_First(
		long petitionId, java.lang.String commentsType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException {
		return getPersistence()
				   .findByP_C_First(petitionId, commentsType, orderByComparator);
	}

	/**
	* Returns the first comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching comments update, or <code>null</code> if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate fetchByP_C_First(
		long petitionId, java.lang.String commentsType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByP_C_First(petitionId, commentsType, orderByComparator);
	}

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
	public static org.blisswisdom.model.CommentsUpdate findByP_C_Last(
		long petitionId, java.lang.String commentsType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException {
		return getPersistence()
				   .findByP_C_Last(petitionId, commentsType, orderByComparator);
	}

	/**
	* Returns the last comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching comments update, or <code>null</code> if a matching comments update could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate fetchByP_C_Last(
		long petitionId, java.lang.String commentsType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByP_C_Last(petitionId, commentsType, orderByComparator);
	}

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
	public static org.blisswisdom.model.CommentsUpdate[] findByP_C_PrevAndNext(
		long commentsUpdateId, long petitionId, java.lang.String commentsType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException {
		return getPersistence()
				   .findByP_C_PrevAndNext(commentsUpdateId, petitionId,
			commentsType, orderByComparator);
	}

	/**
	* Removes all the comments updates where petitionId = &#63; and commentsType = &#63; from the database.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByP_C(long petitionId,
		java.lang.String commentsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByP_C(petitionId, commentsType);
	}

	/**
	* Returns the number of comments updates where petitionId = &#63; and commentsType = &#63;.
	*
	* @param petitionId the petition ID
	* @param commentsType the comments type
	* @return the number of matching comments updates
	* @throws SystemException if a system exception occurred
	*/
	public static int countByP_C(long petitionId, java.lang.String commentsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByP_C(petitionId, commentsType);
	}

	/**
	* Caches the comments update in the entity cache if it is enabled.
	*
	* @param commentsUpdate the comments update
	*/
	public static void cacheResult(
		org.blisswisdom.model.CommentsUpdate commentsUpdate) {
		getPersistence().cacheResult(commentsUpdate);
	}

	/**
	* Caches the comments updates in the entity cache if it is enabled.
	*
	* @param commentsUpdates the comments updates
	*/
	public static void cacheResult(
		java.util.List<org.blisswisdom.model.CommentsUpdate> commentsUpdates) {
		getPersistence().cacheResult(commentsUpdates);
	}

	/**
	* Creates a new comments update with the primary key. Does not add the comments update to the database.
	*
	* @param commentsUpdateId the primary key for the new comments update
	* @return the new comments update
	*/
	public static org.blisswisdom.model.CommentsUpdate create(
		long commentsUpdateId) {
		return getPersistence().create(commentsUpdateId);
	}

	/**
	* Removes the comments update with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commentsUpdateId the primary key of the comments update
	* @return the comments update that was removed
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate remove(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException {
		return getPersistence().remove(commentsUpdateId);
	}

	public static org.blisswisdom.model.CommentsUpdate updateImpl(
		org.blisswisdom.model.CommentsUpdate commentsUpdate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(commentsUpdate);
	}

	/**
	* Returns the comments update with the primary key or throws a {@link org.blisswisdom.NoSuchCommentsUpdateException} if it could not be found.
	*
	* @param commentsUpdateId the primary key of the comments update
	* @return the comments update
	* @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate findByPrimaryKey(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchCommentsUpdateException {
		return getPersistence().findByPrimaryKey(commentsUpdateId);
	}

	/**
	* Returns the comments update with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param commentsUpdateId the primary key of the comments update
	* @return the comments update, or <code>null</code> if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate fetchByPrimaryKey(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(commentsUpdateId);
	}

	/**
	* Returns all the comments updates.
	*
	* @return the comments updates
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.CommentsUpdate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<org.blisswisdom.model.CommentsUpdate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<org.blisswisdom.model.CommentsUpdate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the comments updates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of comments updates.
	*
	* @return the number of comments updates
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CommentsUpdatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CommentsUpdatePersistence)PortletBeanLocatorUtil.locate(org.blisswisdom.service.ClpSerializer.getServletContextName(),
					CommentsUpdatePersistence.class.getName());

			ReferenceRegistry.registerReference(CommentsUpdateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(CommentsUpdatePersistence persistence) {
	}

	private static CommentsUpdatePersistence _persistence;
}