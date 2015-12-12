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

package org.blisswisdom.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PetitionLocalService}.
 *
 * @author Danny
 * @see PetitionLocalService
 * @generated
 */
public class PetitionLocalServiceWrapper implements PetitionLocalService,
	ServiceWrapper<PetitionLocalService> {
	public PetitionLocalServiceWrapper(
		PetitionLocalService petitionLocalService) {
		_petitionLocalService = petitionLocalService;
	}

	/**
	* Adds the petition to the database. Also notifies the appropriate model listeners.
	*
	* @param petition the petition
	* @return the petition that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.Petition addPetition(
		org.blisswisdom.model.Petition petition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.addPetition(petition);
	}

	/**
	* Creates a new petition with the primary key. Does not add the petition to the database.
	*
	* @param petitionId the primary key for the new petition
	* @return the new petition
	*/
	@Override
	public org.blisswisdom.model.Petition createPetition(long petitionId) {
		return _petitionLocalService.createPetition(petitionId);
	}

	/**
	* Deletes the petition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param petitionId the primary key of the petition
	* @return the petition that was removed
	* @throws PortalException if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.Petition deletePetition(long petitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.deletePetition(petitionId);
	}

	/**
	* Deletes the petition from the database. Also notifies the appropriate model listeners.
	*
	* @param petition the petition
	* @return the petition that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.Petition deletePetition(
		org.blisswisdom.model.Petition petition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.deletePetition(petition);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _petitionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public org.blisswisdom.model.Petition fetchPetition(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.fetchPetition(petitionId);
	}

	/**
	* Returns the petition with the matching UUID and company.
	*
	* @param uuid the petition's UUID
	* @param companyId the primary key of the company
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.Petition fetchPetitionByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.fetchPetitionByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the petition matching the UUID and group.
	*
	* @param uuid the petition's UUID
	* @param groupId the primary key of the group
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.Petition fetchPetitionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.fetchPetitionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the petition with the primary key.
	*
	* @param petitionId the primary key of the petition
	* @return the petition
	* @throws PortalException if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.Petition getPetition(long petitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.getPetition(petitionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the petition with the matching UUID and company.
	*
	* @param uuid the petition's UUID
	* @param companyId the primary key of the company
	* @return the matching petition
	* @throws PortalException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.Petition getPetitionByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.getPetitionByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the petition matching the UUID and group.
	*
	* @param uuid the petition's UUID
	* @param groupId the primary key of the group
	* @return the matching petition
	* @throws PortalException if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.Petition getPetitionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.getPetitionByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<org.blisswisdom.model.Petition> getPetitions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.getPetitions(start, end);
	}

	/**
	* Returns the number of petitions.
	*
	* @return the number of petitions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPetitionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.getPetitionsCount();
	}

	/**
	* Updates the petition in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param petition the petition
	* @return the petition that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.Petition updatePetition(
		org.blisswisdom.model.Petition petition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.updatePetition(petition);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _petitionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_petitionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _petitionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.blisswisdom.model.Petition addPetition(long companyId,
		long groupId, long userId, java.lang.String userName,
		java.util.Date createDate, java.util.Date modifiedDate,
		java.lang.String petitionNumber, java.util.Date publishDate,
		java.lang.String signUnit, java.lang.String signer,
		java.lang.String designee, java.lang.String plusSign,
		java.lang.String subject, java.lang.String explanation,
		java.lang.String comments, java.lang.String commentsByMonk,
		java.lang.String commentsByManagement, java.lang.String commentsByCEO,
		java.lang.String commentsByAides,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.addPetition(companyId, groupId, userId,
			userName, createDate, modifiedDate, petitionNumber, publishDate,
			signUnit, signer, designee, plusSign, subject, explanation,
			comments, commentsByMonk, commentsByManagement, commentsByCEO,
			commentsByAides, serviceContext);
	}

	@Override
	public org.blisswisdom.model.Petition updatePetition(long petitionId,
		java.lang.String petitionNumber, java.util.Date publishDate,
		java.lang.String signUnit, java.lang.String signer,
		java.lang.String designee, java.lang.String plusSign,
		java.lang.String subject, java.lang.String explanation,
		java.lang.String comments, java.lang.String commentsByMonk,
		java.lang.String commentsByManagement, java.lang.String commentsByCEO,
		java.lang.String commentsByAides,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.updatePetition(petitionId, petitionNumber,
			publishDate, signUnit, signer, designee, plusSign, subject,
			explanation, comments, commentsByMonk, commentsByManagement,
			commentsByCEO, commentsByAides, serviceContext);
	}

	@Override
	public void removePetitionBatch(long[] petitionIds) {
		_petitionLocalService.removePetitionBatch(petitionIds);
	}

	/**
	* Kaleo workflow updateStatus;
	*/
	@Override
	public org.blisswisdom.model.Petition updateStatus(long userId,
		long resourcePrimKey, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException {
		return _petitionLocalService.updateStatus(userId, resourcePrimKey,
			status, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PetitionLocalService getWrappedPetitionLocalService() {
		return _petitionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPetitionLocalService(
		PetitionLocalService petitionLocalService) {
		_petitionLocalService = petitionLocalService;
	}

	@Override
	public PetitionLocalService getWrappedService() {
		return _petitionLocalService;
	}

	@Override
	public void setWrappedService(PetitionLocalService petitionLocalService) {
		_petitionLocalService = petitionLocalService;
	}

	private PetitionLocalService _petitionLocalService;
}