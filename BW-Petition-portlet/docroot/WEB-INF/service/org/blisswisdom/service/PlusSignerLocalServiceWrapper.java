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
 * Provides a wrapper for {@link PlusSignerLocalService}.
 *
 * @author Danny
 * @see PlusSignerLocalService
 * @generated
 */
public class PlusSignerLocalServiceWrapper implements PlusSignerLocalService,
	ServiceWrapper<PlusSignerLocalService> {
	public PlusSignerLocalServiceWrapper(
		PlusSignerLocalService plusSignerLocalService) {
		_plusSignerLocalService = plusSignerLocalService;
	}

	/**
	* Adds the plus signer to the database. Also notifies the appropriate model listeners.
	*
	* @param plusSigner the plus signer
	* @return the plus signer that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.PlusSigner addPlusSigner(
		org.blisswisdom.model.PlusSigner plusSigner)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.addPlusSigner(plusSigner);
	}

	/**
	* Creates a new plus signer with the primary key. Does not add the plus signer to the database.
	*
	* @param plusSignerId the primary key for the new plus signer
	* @return the new plus signer
	*/
	@Override
	public org.blisswisdom.model.PlusSigner createPlusSigner(long plusSignerId) {
		return _plusSignerLocalService.createPlusSigner(plusSignerId);
	}

	/**
	* Deletes the plus signer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param plusSignerId the primary key of the plus signer
	* @return the plus signer that was removed
	* @throws PortalException if a plus signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.PlusSigner deletePlusSigner(long plusSignerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.deletePlusSigner(plusSignerId);
	}

	/**
	* Deletes the plus signer from the database. Also notifies the appropriate model listeners.
	*
	* @param plusSigner the plus signer
	* @return the plus signer that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.PlusSigner deletePlusSigner(
		org.blisswisdom.model.PlusSigner plusSigner)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.deletePlusSigner(plusSigner);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _plusSignerLocalService.dynamicQuery();
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
		return _plusSignerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _plusSignerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _plusSignerLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _plusSignerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _plusSignerLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.blisswisdom.model.PlusSigner fetchPlusSigner(long plusSignerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.fetchPlusSigner(plusSignerId);
	}

	/**
	* Returns the plus signer with the primary key.
	*
	* @param plusSignerId the primary key of the plus signer
	* @return the plus signer
	* @throws PortalException if a plus signer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.PlusSigner getPlusSigner(long plusSignerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.getPlusSigner(plusSignerId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<org.blisswisdom.model.PlusSigner> getPlusSigners(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.getPlusSigners(start, end);
	}

	/**
	* Returns the number of plus signers.
	*
	* @return the number of plus signers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPlusSignersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.getPlusSignersCount();
	}

	/**
	* Updates the plus signer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param plusSigner the plus signer
	* @return the plus signer that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.PlusSigner updatePlusSigner(
		org.blisswisdom.model.PlusSigner plusSigner)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.updatePlusSigner(plusSigner);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _plusSignerLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_plusSignerLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _plusSignerLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public org.blisswisdom.model.PlusSigner addPlusSigner(long petitionId,
		long userId, java.lang.String userName, long signerId,
		java.lang.String signerName, java.lang.String signerType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.addPlusSigner(petitionId, userId,
			userName, signerId, signerName, signerType);
	}

	@Override
	public void removeByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_plusSignerLocalService.removeByPetitionId(petitionId);
	}

	@Override
	public java.util.List<org.blisswisdom.model.PlusSigner> findByP_S(
		long petitionId, java.lang.String signerType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _plusSignerLocalService.findByP_S(petitionId, signerType);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PlusSignerLocalService getWrappedPlusSignerLocalService() {
		return _plusSignerLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPlusSignerLocalService(
		PlusSignerLocalService plusSignerLocalService) {
		_plusSignerLocalService = plusSignerLocalService;
	}

	@Override
	public PlusSignerLocalService getWrappedService() {
		return _plusSignerLocalService;
	}

	@Override
	public void setWrappedService(PlusSignerLocalService plusSignerLocalService) {
		_plusSignerLocalService = plusSignerLocalService;
	}

	private PlusSignerLocalService _plusSignerLocalService;
}