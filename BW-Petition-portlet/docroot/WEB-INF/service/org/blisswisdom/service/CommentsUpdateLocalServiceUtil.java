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
 * Provides the local service utility for CommentsUpdate. This utility wraps
 * {@link org.blisswisdom.service.impl.CommentsUpdateLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Danny
 * @see CommentsUpdateLocalService
 * @see org.blisswisdom.service.base.CommentsUpdateLocalServiceBaseImpl
 * @see org.blisswisdom.service.impl.CommentsUpdateLocalServiceImpl
 * @generated
 */
public class CommentsUpdateLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link org.blisswisdom.service.impl.CommentsUpdateLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the comments update to the database. Also notifies the appropriate model listeners.
	*
	* @param commentsUpdate the comments update
	* @return the comments update that was added
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate addCommentsUpdate(
		org.blisswisdom.model.CommentsUpdate commentsUpdate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addCommentsUpdate(commentsUpdate);
	}

	/**
	* Creates a new comments update with the primary key. Does not add the comments update to the database.
	*
	* @param commentsUpdateId the primary key for the new comments update
	* @return the new comments update
	*/
	public static org.blisswisdom.model.CommentsUpdate createCommentsUpdate(
		long commentsUpdateId) {
		return getService().createCommentsUpdate(commentsUpdateId);
	}

	/**
	* Deletes the comments update with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param commentsUpdateId the primary key of the comments update
	* @return the comments update that was removed
	* @throws PortalException if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate deleteCommentsUpdate(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCommentsUpdate(commentsUpdateId);
	}

	/**
	* Deletes the comments update from the database. Also notifies the appropriate model listeners.
	*
	* @param commentsUpdate the comments update
	* @return the comments update that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate deleteCommentsUpdate(
		org.blisswisdom.model.CommentsUpdate commentsUpdate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteCommentsUpdate(commentsUpdate);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static org.blisswisdom.model.CommentsUpdate fetchCommentsUpdate(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchCommentsUpdate(commentsUpdateId);
	}

	/**
	* Returns the comments update with the primary key.
	*
	* @param commentsUpdateId the primary key of the comments update
	* @return the comments update
	* @throws PortalException if a comments update with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate getCommentsUpdate(
		long commentsUpdateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getCommentsUpdate(commentsUpdateId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<org.blisswisdom.model.CommentsUpdate> getCommentsUpdates(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCommentsUpdates(start, end);
	}

	/**
	* Returns the number of comments updates.
	*
	* @return the number of comments updates
	* @throws SystemException if a system exception occurred
	*/
	public static int getCommentsUpdatesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCommentsUpdatesCount();
	}

	/**
	* Updates the comments update in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param commentsUpdate the comments update
	* @return the comments update that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static org.blisswisdom.model.CommentsUpdate updateCommentsUpdate(
		org.blisswisdom.model.CommentsUpdate commentsUpdate)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateCommentsUpdate(commentsUpdate);
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

	public static boolean addOneComments(long petitionId, long userId,
		java.lang.String userName, java.lang.String commentsType,
		java.lang.String commentsContent) {
		return getService()
				   .addOneComments(petitionId, userId, userName, commentsType,
			commentsContent);
	}

	public static java.util.List<org.blisswisdom.model.CommentsUpdate> findByP_C(
		long petitionId, java.lang.String commentsType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByP_C(petitionId, commentsType);
	}

	public static void removeByPetitionId(long petitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().removeByPetitionId(petitionId);
	}

	public static void clearService() {
		_service = null;
	}

	public static CommentsUpdateLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					CommentsUpdateLocalService.class.getName());

			if (invokableLocalService instanceof CommentsUpdateLocalService) {
				_service = (CommentsUpdateLocalService)invokableLocalService;
			}
			else {
				_service = new CommentsUpdateLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(CommentsUpdateLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(CommentsUpdateLocalService service) {
	}

	private static CommentsUpdateLocalService _service;
}