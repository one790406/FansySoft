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

import org.blisswisdom.model.PlusSigner;

/**
 * The persistence interface for the plus signer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danny
 * @see PlusSignerPersistenceImpl
 * @see PlusSignerUtil
 * @generated
 */
public interface PlusSignerPersistence extends BasePersistence<PlusSigner> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PlusSignerUtil} to access the plus signer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the plus signers where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @return the matching plus signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.PlusSigner> findByPetitionId(
		long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the plus signers where petitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param petitionId the petition ID
	* @param start the lower bound of the range of plus signers
	* @param end the upper bound of the range of plus signers (not inclusive)
	* @return the range of matching plus signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.PlusSigner> findByPetitionId(
		long petitionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the plus signers where petitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param petitionId the petition ID
	* @param start the lower bound of the range of plus signers
	* @param end the upper bound of the range of plus signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching plus signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.PlusSigner> findByPetitionId(
		long petitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first plus signer in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching plus signer
	* @throws org.blisswisdom.NoSuchPlusSignerException if a matching plus signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner findByPetitionId_First(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPlusSignerException;

	/**
	* Returns the first plus signer in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching plus signer, or <code>null</code> if a matching plus signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner fetchByPetitionId_First(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last plus signer in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching plus signer
	* @throws org.blisswisdom.NoSuchPlusSignerException if a matching plus signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner findByPetitionId_Last(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPlusSignerException;

	/**
	* Returns the last plus signer in the ordered set where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching plus signer, or <code>null</code> if a matching plus signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner fetchByPetitionId_Last(
		long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the plus signers before and after the current plus signer in the ordered set where petitionId = &#63;.
	*
	* @param plusSignerId the primary key of the current plus signer
	* @param petitionId the petition ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next plus signer
	* @throws org.blisswisdom.NoSuchPlusSignerException if a plus signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner[] findByPetitionId_PrevAndNext(
		long plusSignerId, long petitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPlusSignerException;

	/**
	* Removes all the plus signers where petitionId = &#63; from the database.
	*
	* @param petitionId the petition ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of plus signers where petitionId = &#63;.
	*
	* @param petitionId the petition ID
	* @return the number of matching plus signers
	* @throws SystemException if a system exception occurred
	*/
	public int countByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the plus signers where petitionId = &#63; and signerType = &#63;.
	*
	* @param petitionId the petition ID
	* @param signerType the signer type
	* @return the matching plus signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.PlusSigner> findByP_S(
		long petitionId, java.lang.String signerType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the plus signers where petitionId = &#63; and signerType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param petitionId the petition ID
	* @param signerType the signer type
	* @param start the lower bound of the range of plus signers
	* @param end the upper bound of the range of plus signers (not inclusive)
	* @return the range of matching plus signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.PlusSigner> findByP_S(
		long petitionId, java.lang.String signerType, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the plus signers where petitionId = &#63; and signerType = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param petitionId the petition ID
	* @param signerType the signer type
	* @param start the lower bound of the range of plus signers
	* @param end the upper bound of the range of plus signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching plus signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.PlusSigner> findByP_S(
		long petitionId, java.lang.String signerType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first plus signer in the ordered set where petitionId = &#63; and signerType = &#63;.
	*
	* @param petitionId the petition ID
	* @param signerType the signer type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching plus signer
	* @throws org.blisswisdom.NoSuchPlusSignerException if a matching plus signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner findByP_S_First(long petitionId,
		java.lang.String signerType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPlusSignerException;

	/**
	* Returns the first plus signer in the ordered set where petitionId = &#63; and signerType = &#63;.
	*
	* @param petitionId the petition ID
	* @param signerType the signer type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching plus signer, or <code>null</code> if a matching plus signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner fetchByP_S_First(long petitionId,
		java.lang.String signerType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last plus signer in the ordered set where petitionId = &#63; and signerType = &#63;.
	*
	* @param petitionId the petition ID
	* @param signerType the signer type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching plus signer
	* @throws org.blisswisdom.NoSuchPlusSignerException if a matching plus signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner findByP_S_Last(long petitionId,
		java.lang.String signerType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPlusSignerException;

	/**
	* Returns the last plus signer in the ordered set where petitionId = &#63; and signerType = &#63;.
	*
	* @param petitionId the petition ID
	* @param signerType the signer type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching plus signer, or <code>null</code> if a matching plus signer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner fetchByP_S_Last(long petitionId,
		java.lang.String signerType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the plus signers before and after the current plus signer in the ordered set where petitionId = &#63; and signerType = &#63;.
	*
	* @param plusSignerId the primary key of the current plus signer
	* @param petitionId the petition ID
	* @param signerType the signer type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next plus signer
	* @throws org.blisswisdom.NoSuchPlusSignerException if a plus signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner[] findByP_S_PrevAndNext(
		long plusSignerId, long petitionId, java.lang.String signerType,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPlusSignerException;

	/**
	* Removes all the plus signers where petitionId = &#63; and signerType = &#63; from the database.
	*
	* @param petitionId the petition ID
	* @param signerType the signer type
	* @throws SystemException if a system exception occurred
	*/
	public void removeByP_S(long petitionId, java.lang.String signerType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of plus signers where petitionId = &#63; and signerType = &#63;.
	*
	* @param petitionId the petition ID
	* @param signerType the signer type
	* @return the number of matching plus signers
	* @throws SystemException if a system exception occurred
	*/
	public int countByP_S(long petitionId, java.lang.String signerType)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the plus signer in the entity cache if it is enabled.
	*
	* @param plusSigner the plus signer
	*/
	public void cacheResult(org.blisswisdom.model.PlusSigner plusSigner);

	/**
	* Caches the plus signers in the entity cache if it is enabled.
	*
	* @param plusSigners the plus signers
	*/
	public void cacheResult(
		java.util.List<org.blisswisdom.model.PlusSigner> plusSigners);

	/**
	* Creates a new plus signer with the primary key. Does not add the plus signer to the database.
	*
	* @param plusSignerId the primary key for the new plus signer
	* @return the new plus signer
	*/
	public org.blisswisdom.model.PlusSigner create(long plusSignerId);

	/**
	* Removes the plus signer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param plusSignerId the primary key of the plus signer
	* @return the plus signer that was removed
	* @throws org.blisswisdom.NoSuchPlusSignerException if a plus signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner remove(long plusSignerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPlusSignerException;

	public org.blisswisdom.model.PlusSigner updateImpl(
		org.blisswisdom.model.PlusSigner plusSigner)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the plus signer with the primary key or throws a {@link org.blisswisdom.NoSuchPlusSignerException} if it could not be found.
	*
	* @param plusSignerId the primary key of the plus signer
	* @return the plus signer
	* @throws org.blisswisdom.NoSuchPlusSignerException if a plus signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner findByPrimaryKey(long plusSignerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			org.blisswisdom.NoSuchPlusSignerException;

	/**
	* Returns the plus signer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param plusSignerId the primary key of the plus signer
	* @return the plus signer, or <code>null</code> if a plus signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public org.blisswisdom.model.PlusSigner fetchByPrimaryKey(long plusSignerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the plus signers.
	*
	* @return the plus signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.PlusSigner> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the plus signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of plus signers
	* @param end the upper bound of the range of plus signers (not inclusive)
	* @return the range of plus signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.PlusSigner> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the plus signers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of plus signers
	* @param end the upper bound of the range of plus signers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of plus signers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<org.blisswisdom.model.PlusSigner> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the plus signers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of plus signers.
	*
	* @return the number of plus signers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}