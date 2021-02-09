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

package IdentificationDatabase.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Kebeles. This utility wraps
 * {@link IdentificationDatabase.service.impl.KebelesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see KebelesLocalService
 * @see IdentificationDatabase.service.base.KebelesLocalServiceBaseImpl
 * @see IdentificationDatabase.service.impl.KebelesLocalServiceImpl
 * @generated
 */
@ProviderType
public class KebelesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link IdentificationDatabase.service.impl.KebelesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the kebeles to the database. Also notifies the appropriate model listeners.
	*
	* @param kebeles the kebeles
	* @return the kebeles that was added
	*/
	public static IdentificationDatabase.model.Kebeles addKebeles(
		IdentificationDatabase.model.Kebeles kebeles) {
		return getService().addKebeles(kebeles);
	}

	/**
	* Creates a new kebeles with the primary key. Does not add the kebeles to the database.
	*
	* @param id the primary key for the new kebeles
	* @return the new kebeles
	*/
	public static IdentificationDatabase.model.Kebeles createKebeles(long id) {
		return getService().createKebeles(id);
	}

	/**
	* Deletes the kebeles from the database. Also notifies the appropriate model listeners.
	*
	* @param kebeles the kebeles
	* @return the kebeles that was removed
	*/
	public static IdentificationDatabase.model.Kebeles deleteKebeles(
		IdentificationDatabase.model.Kebeles kebeles) {
		return getService().deleteKebeles(kebeles);
	}

	/**
	* Deletes the kebeles with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kebeles
	* @return the kebeles that was removed
	* @throws PortalException if a kebeles with the primary key could not be found
	*/
	public static IdentificationDatabase.model.Kebeles deleteKebeles(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteKebeles(id);
	}

	public static IdentificationDatabase.model.Kebeles fetchKebeles(long id) {
		return getService().fetchKebeles(id);
	}

	/**
	* Returns the kebeles with the primary key.
	*
	* @param id the primary key of the kebeles
	* @return the kebeles
	* @throws PortalException if a kebeles with the primary key could not be found
	*/
	public static IdentificationDatabase.model.Kebeles getKebeles(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getKebeles(id);
	}

	/**
	* Updates the kebeles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kebeles the kebeles
	* @return the kebeles that was updated
	*/
	public static IdentificationDatabase.model.Kebeles updateKebeles(
		IdentificationDatabase.model.Kebeles kebeles) {
		return getService().updateKebeles(kebeles);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of kebeleses.
	*
	* @return the number of kebeleses
	*/
	public static int getKebelesesCount() {
		return getService().getKebelesesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<IdentificationDatabase.model.Kebeles> getKebeleByAm(
		java.lang.String kebele_AM)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKebeleByAm(kebele_AM);
	}

	public static java.util.List<IdentificationDatabase.model.Kebeles> getKebeleByOr(
		java.lang.String kebele_OR)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKebeleByOr(kebele_OR);
	}

	public static java.util.List<IdentificationDatabase.model.Kebeles> getKebeleByPrinterName(
		java.lang.String printerName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKebeleByPrinterName(printerName);
	}

	public static java.util.List<IdentificationDatabase.model.Kebeles> getKebeleBySubcityAm(
		java.lang.String Subcity_AM)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKebeleBySubcityAm(Subcity_AM);
	}

	public static java.util.List<IdentificationDatabase.model.Kebeles> getKebeleBySubcityOr(
		java.lang.String Subcity_OR)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKebeleBySubcityOr(Subcity_OR);
	}

	public static java.util.List<IdentificationDatabase.model.Kebeles> getKebeleForId(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getKebeleForId(id);
	}

	/**
	* Returns a range of all the kebeleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @return the range of kebeleses
	*/
	public static java.util.List<IdentificationDatabase.model.Kebeles> getKebeleses(
		int start, int end) {
		return getService().getKebeleses(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static KebelesLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<KebelesLocalService, KebelesLocalService> _serviceTracker =
		ServiceTrackerFactory.open(KebelesLocalService.class);
}