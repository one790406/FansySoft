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

import org.blisswisdom.model.Petition;

/**
 * The persistence interface for the petition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danny
 * @see PetitionPersistenceImpl
 * @see PetitionUtil
 * @generated
 */
public interface PetitionPersistence extends BasePersistence<Petition> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PetitionUtil} to access the petition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the petitions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.Petition> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.blisswisdom.model.Petition> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.blisswisdom.model.Petition> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first petition in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching petition
	* @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Returns the first petition in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last petition in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching petition
	* @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Returns the last petition in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.blisswisdom.model.Petition[] findByUuid_PrevAndNext(
		long petitionId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Removes all the petitions where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of petitions where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the petition where uuid = &#63; and groupId = &#63; or throws a {@link org.blisswisdom.NoSuchPetitionException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching petition
	* @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Returns the petition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition fetchByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the petition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the petition where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the petition that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Returns the number of petitions where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the petitions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.Petition> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.blisswisdom.model.Petition> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.blisswisdom.model.Petition> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.blisswisdom.model.Petition findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Returns the first petition in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.blisswisdom.model.Petition findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Returns the last petition in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public org.blisswisdom.model.Petition[] findByUuid_C_PrevAndNext(
		long petitionId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Removes all the petitions where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of petitions where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the petition where petitionNumber = &#63; or throws a {@link org.blisswisdom.NoSuchPetitionException} if it could not be found.
	*
	* @param petitionNumber the petition number
	* @return the matching petition
	* @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition findByPetitionNumber(
		java.lang.String petitionNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Returns the petition where petitionNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param petitionNumber the petition number
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition fetchByPetitionNumber(
		java.lang.String petitionNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the petition where petitionNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param petitionNumber the petition number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition fetchByPetitionNumber(
		java.lang.String petitionNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the petition where petitionNumber = &#63; from the database.
	*
	* @param petitionNumber the petition number
	* @return the petition that was removed
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition removeByPetitionNumber(
		java.lang.String petitionNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Returns the number of petitions where petitionNumber = &#63;.
	*
	* @param petitionNumber the petition number
	* @return the number of matching petitions
	* @throws SystemException if a system exception occurred
	*/
	public int countByPetitionNumber(java.lang.String petitionNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the petition in the entity cache if it is enabled.
	*
	* @param petition the petition
	*/
	public void cacheResult(org.blisswisdom.model.Petition petition);

	/**
	* Caches the petitions in the entity cache if it is enabled.
	*
	* @param petitions the petitions
	*/
	public void cacheResult(
		java.util.List<org.blisswisdom.model.Petition> petitions);

	/**
	* Creates a new petition with the primary key. Does not add the petition to the database.
	*
	* @param petitionId the primary key for the new petition
	* @return the new petition
	*/
	public org.blisswisdom.model.Petition create(long petitionId);

	/**
	* Removes the petition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param petitionId the primary key of the petition
	* @return the petition that was removed
	* @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition remove(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	public org.blisswisdom.model.Petition updateImpl(
		org.blisswisdom.model.Petition petition)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the petition with the primary key or throws a {@link org.blisswisdom.NoSuchPetitionException} if it could not be found.
	*
	* @param petitionId the primary key of the petition
	* @return the petition
	* @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition findByPrimaryKey(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPetitionException;

	/**
	* Returns the petition with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param petitionId the primary key of the petition
	* @return the petition, or <code>null</code> if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.Petition fetchByPrimaryKey(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the petitions.
	*
	* @return the petitions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.Petition> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.blisswisdom.model.Petition> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<org.blisswisdom.model.Petition> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the petitions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of petitions.
	*
	* @return the number of petitions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}