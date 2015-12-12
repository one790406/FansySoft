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

import org.blisswisdom.model.Petition;

import java.util.List;

/**
 * The persistence utility for the petition service. This utility wraps {@link PetitionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danny
 * @see PetitionPersistence
 * @see PetitionPersistenceImpl
 * @generated
 */
public class PetitionUtil {
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
	public static void clearCache(Petition petition) {
		getPersistence().clearCache(petition);
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
	public static List<Petition> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Petition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Petition> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Petition update(Petition petition) throws SystemException {
		return getPersistence().update(petition);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Petition update(Petition petition,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(petition, serviceContext);
	}

	/**
	* Returns all the petitions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Petition> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the petitions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of petitions
	* @param end the upper bound of the range of petitions (not inclusive)
	* @return the range of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Petition> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the petitions where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of petitions
	* @param end the upper bound of the range of petitions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Petition> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first petition in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching petition
	* @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first petition in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last petition in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching petition
	* @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last petition in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the petitions before and after the current petition in the ordered set where uuid = &#63;.
	*
	* @param petitionId the primary key of the current petition
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next petition
	* @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition[] findByUuid_PrevAndNext(
		long petitionId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence()
				   .findByUuid_PrevAndNext(petitionId, uuid, orderByComparator);
	}

	/**
	* Removes all the petitions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of petitions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the petition where uuid = &#63; and groupId = &#63; or throws a {@link org.blisswisdom.NoSuchPetitionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching petition
	* @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the petition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the petition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the petition where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the petition that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of petitions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the petitions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Petition> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the petitions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of petitions
	* @param end the upper bound of the range of petitions (not inclusive)
	* @return the range of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Petition> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the petitions where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of petitions
	* @param end the upper bound of the range of petitions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Petition> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first petition in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching petition
	* @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first petition in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last petition in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching petition
	* @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last petition in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the petitions before and after the current petition in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param petitionId the primary key of the current petition
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next petition
	* @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition[] findByUuid_C_PrevAndNext(
		long petitionId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(petitionId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the petitions where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of petitions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns the petition where petitionNumber = &#63; or throws a {@link org.blisswisdom.NoSuchPetitionException} if it could not be found.
	*
	* @param petitionNumber the petition number
	* @return the matching petition
	* @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition findByPetitionNumber(
		java.lang.String petitionNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence().findByPetitionNumber(petitionNumber);
	}

	/**
	* Returns the petition where petitionNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param petitionNumber the petition number
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchByPetitionNumber(
		java.lang.String petitionNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPetitionNumber(petitionNumber);
	}

	/**
	* Returns the petition where petitionNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param petitionNumber the petition number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchByPetitionNumber(
		java.lang.String petitionNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByPetitionNumber(petitionNumber, retrieveFromCache);
	}

	/**
	* Removes the petition where petitionNumber = &#63; from the database.
	*
	* @param petitionNumber the petition number
	* @return the petition that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition removeByPetitionNumber(
		java.lang.String petitionNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence().removeByPetitionNumber(petitionNumber);
	}

	/**
	* Returns the number of petitions where petitionNumber = &#63;.
	*
	* @param petitionNumber the petition number
	* @return the number of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public static int countByPetitionNumber(java.lang.String petitionNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByPetitionNumber(petitionNumber);
	}

	/**
	* Caches the petition in the entity cache if it is enabled.
	*
	* @param petition the petition
	*/
	public static void cacheResult(org.blisswisdom.model.Petition petition) {
		getPersistence().cacheResult(petition);
	}

	/**
	* Caches the petitions in the entity cache if it is enabled.
	*
	* @param petitions the petitions
	*/
	public static void cacheResult(
		java.util.List<org.blisswisdom.model.Petition> petitions) {
		getPersistence().cacheResult(petitions);
	}

	/**
	* Creates a new petition with the primary key. Does not add the petition to the database.
	*
	* @param petitionId the primary key for the new petition
	* @return the new petition
	*/
	public static org.blisswisdom.model.Petition create(long petitionId) {
		return getPersistence().create(petitionId);
	}

	/**
	* Removes the petition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param petitionId the primary key of the petition
	* @return the petition that was removed
	* @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition remove(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence().remove(petitionId);
	}

	public static org.blisswisdom.model.Petition updateImpl(
		org.blisswisdom.model.Petition petition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(petition);
	}

	/**
	* Returns the petition with the primary key or throws a {@link org.blisswisdom.NoSuchPetitionException} if it could not be found.
	*
	* @param petitionId the primary key of the petition
	* @return the petition
	* @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition findByPrimaryKey(
		long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException {
		return getPersistence().findByPrimaryKey(petitionId);
	}

	/**
	* Returns the petition with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param petitionId the primary key of the petition
	* @return the petition, or <code>null</code> if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchByPrimaryKey(
		long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(petitionId);
	}

	/**
	* Returns all the petitions.
	*
	* @return the petitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Petition> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the petitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of petitions
	* @param end the upper bound of the range of petitions (not inclusive)
	* @return the range of petitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Petition> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the petitions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of petitions
	* @param end the upper bound of the range of petitions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of petitions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<org.blisswisdom.model.Petition> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the petitions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of petitions.
	*
	* @return the number of petitions
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static PetitionPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PetitionPersistence)PortletBeanLocatorUtil.locate(org.blisswisdom.service.ClpSerializer.getServletContextName(),
					PetitionPersistence.class.getName());

			ReferenceRegistry.registerReference(PetitionUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PetitionPersistence persistence) {
	}

	private static PetitionPersistence _persistence;
}