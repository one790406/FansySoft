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
 * Provides a wrapper for {@link CommentsUpdateLocalService}.
 *
 * @author Danny
 * @see CommentsUpdateLocalService
 * @generated
 */
public class CommentsUpdateLocalServiceWrapper
	implements CommentsUpdateLocalService,
		ServiceWrapper<CommentsUpdateLocalService> {
	public CommentsUpdateLocalServiceWrapper(
		CommentsUpdateLocalService commentsUpdateLocalService) {
		_commentsUpdateLocalService = commentsUpdateLocalService;
	}

	/**
	* Adds the comments update to the database. Also notifies the appropriate model listeners.
	*
	* @param commentsUpdate the comments update
	* @return the comments update that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.CommentsUpdate addCommentsUpdate(
		org.blisswisdom.model.CommentsUpdate commentsUpdate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdateLocalService.addCommentsUpdate(commentsUpdate);
	}

	/**
	* Creates a new comments update with the primary key. Does not add the comments update to the database.
	*
	* @param commentsUpdateId the primary key for the new comments update
	* @return the new comments update
	*/
	@Override
	public org.blisswisdom.model.CommentsUpdate createCommentsUpdate(
		long commentsUpdateId) {
		return _commentsUpdateLocalService.createCommentsUpdate(commentsUpdateId);
	}

	/**
	* Deletes the comments update with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commentsUpdateId the primary key of the comments update
	* @return the comments update that was removed
	* @throws PortalException if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.CommentsUpdate deleteCommentsUpdate(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdateLocalService.deleteCommentsUpdate(commentsUpdateId);
	}

	/**
	* Deletes the comments update from the database. Also notifies the appropriate model listeners.
	*
	* @param commentsUpdate the comments update
	* @return the comments update that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.CommentsUpdate deleteCommentsUpdate(
		org.blisswisdom.model.CommentsUpdate commentsUpdate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdateLocalService.deleteCommentsUpdate(commentsUpdate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _commentsUpdateLocalService.dynamicQuery();
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
		return _commentsUpdateLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _commentsUpdateLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _commentsUpdateLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _commentsUpdateLocalService.dynamicQueryCount(dynamicQuery);
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
		return _commentsUpdateLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public org.blisswisdom.model.CommentsUpdate fetchCommentsUpdate(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdateLocalService.fetchCommentsUpdate(commentsUpdateId);
	}

	/**
	* Returns the comments update with the primary key.
	*
	* @param commentsUpdateId the primary key of the comments update
	* @return the comments update
	* @throws PortalException if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.CommentsUpdate getCommentsUpdate(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdateLocalService.getCommentsUpdate(commentsUpdateId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdateLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<org.blisswisdom.model.CommentsUpdate> getCommentsUpdates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdateLocalService.getCommentsUpdates(start, end);
	}

	/**
	* Returns the number of comments updates.
	*
	* @return the number of comments updates
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getCommentsUpdatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdateLocalService.getCommentsUpdatesCount();
	}

	/**
	* Updates the comments update in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param commentsUpdate the comments update
	* @return the comments update that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public org.blisswisdom.model.CommentsUpdate updateCommentsUpdate(
		org.blisswisdom.model.CommentsUpdate commentsUpdate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdateLocalService.updateCommentsUpdate(commentsUpdate);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _commentsUpdateLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_commentsUpdateLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _commentsUpdateLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public boolean addOneComments(long petitionId, long userId,
		java.lang.String userName, java.lang.String commentsType,
		java.lang.String commentsContent) {
		return _commentsUpdateLocalService.addOneComments(petitionId, userId,
			userName, commentsType, commentsContent);
	}

	@Override
	public java.util.List<org.blisswisdom.model.CommentsUpdate> findByP_C(
		long petitionId, java.lang.String commentsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _commentsUpdateLocalService.findByP_C(petitionId, commentsType);
	}

	@Override
	public void removeByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_commentsUpdateLocalService.removeByPetitionId(petitionId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public CommentsUpdateLocalService getWrappedCommentsUpdateLocalService() {
		return _commentsUpdateLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedCommentsUpdateLocalService(
		CommentsUpdateLocalService commentsUpdateLocalService) {
		_commentsUpdateLocalService = commentsUpdateLocalService;
	}

	@Override
	public CommentsUpdateLocalService getWrappedService() {
		return _commentsUpdateLocalService;
	}

	@Override
	public void setWrappedService(
		CommentsUpdateLocalService commentsUpdateLocalService) {
		_commentsUpdateLocalService = commentsUpdateLocalService;
	}

	private CommentsUpdateLocalService _commentsUpdateLocalService;
}