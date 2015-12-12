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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Petition. This utility wraps
 * {@link org.blisswisdom.service.impl.PetitionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Danny
 * @see PetitionLocalService
 * @see org.blisswisdom.service.base.PetitionLocalServiceBaseImpl
 * @see org.blisswisdom.service.impl.PetitionLocalServiceImpl
 * @generated
 */
public class PetitionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.blisswisdom.service.impl.PetitionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the petition to the database. Also notifies the appropriate model listeners.
	*
	* @param petition the petition
	* @return the petition that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition addPetition(
		org.blisswisdom.model.Petition petition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addPetition(petition);
	}

	/**
	* Creates a new petition with the primary key. Does not add the petition to the database.
	*
	* @param petitionId the primary key for the new petition
	* @return the new petition
	*/
	public static org.blisswisdom.model.Petition createPetition(long petitionId) {
		return getService().createPetition(petitionId);
	}

	/**
	* Deletes the petition with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param petitionId the primary key of the petition
	* @return the petition that was removed
	* @throws PortalException if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition deletePetition(long petitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePetition(petitionId);
	}

	/**
	* Deletes the petition from the database. Also notifies the appropriate model listeners.
	*
	* @param petition the petition
	* @return the petition that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition deletePetition(
		org.blisswisdom.model.Petition petition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deletePetition(petition);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static org.blisswisdom.model.Petition fetchPetition(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPetition(petitionId);
	}

	/**
	* Returns the petition with the matching UUID and company.
	*
	* @param uuid the petition's UUID
	* @param companyId the primary key of the company
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchPetitionByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPetitionByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the petition matching the UUID and group.
	*
	* @param uuid the petition's UUID
	* @param groupId the primary key of the group
	* @return the matching petition, or <code>null</code> if a matching petition could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition fetchPetitionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchPetitionByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the petition with the primary key.
	*
	* @param petitionId the primary key of the petition
	* @return the petition
	* @throws PortalException if a petition with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition getPetition(long petitionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPetition(petitionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static org.blisswisdom.model.Petition getPetitionByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPetitionByUuidAndCompanyId(uuid, companyId);
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
	public static org.blisswisdom.model.Petition getPetitionByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPetitionByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<org.blisswisdom.model.Petition> getPetitions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPetitions(start, end);
	}

	/**
	* Returns the number of petitions.
	*
	* @return the number of petitions
	* @throws SystemException if a system exception occurred
	*/
	public static int getPetitionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getPetitionsCount();
	}

	/**
	* Updates the petition in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param petition the petition
	* @return the petition that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.Petition updatePetition(
		org.blisswisdom.model.Petition petition)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updatePetition(petition);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static org.blisswisdom.model.Petition addPetition(long companyId,
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
		return getService()
				   .addPetition(companyId, groupId, userId, userName,
			createDate, modifiedDate, petitionNumber, publishDate, signUnit,
			signer, designee, plusSign, subject, explanation, comments,
			commentsByMonk, commentsByManagement, commentsByCEO,
			commentsByAides, serviceContext);
	}

	public static org.blisswisdom.model.Petition updatePetition(
		long petitionId, java.lang.String petitionNumber,
		java.util.Date publishDate, java.lang.String signUnit,
		java.lang.String signer, java.lang.String designee,
		java.lang.String plusSign, java.lang.String subject,
		java.lang.String explanation, java.lang.String comments,
		java.lang.String commentsByMonk, java.lang.String commentsByManagement,
		java.lang.String commentsByCEO, java.lang.String commentsByAides,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updatePetition(petitionId, petitionNumber, publishDate,
			signUnit, signer, designee, plusSign, subject, explanation,
			comments, commentsByMonk, commentsByManagement, commentsByCEO,
			commentsByAides, serviceContext);
	}

	public static void removePetitionBatch(long[] petitionIds) {
		getService().removePetitionBatch(petitionIds);
	}

	/**
	* Kaleo workflow updateStatus;
	*/
	public static org.blisswisdom.model.Petition updateStatus(long userId,
		long resourcePrimKey, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.NoSuchUserException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateStatus(userId, resourcePrimKey, status, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static PetitionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					PetitionLocalService.class.getName());

			if (invokableLocalService instanceof PetitionLocalService) {
				_service = (PetitionLocalService)invokableLocalService;
			}
			else {
				_service = new PetitionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(PetitionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(PetitionLocalService service) {
	}

	private static PetitionLocalService _service;
}