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
 * Provides the local service utility for BiometricData. This utility wraps
 * {@link IdentificationDatabase.service.impl.BiometricDataLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BiometricDataLocalService
 * @see IdentificationDatabase.service.base.BiometricDataLocalServiceBaseImpl
 * @see IdentificationDatabase.service.impl.BiometricDataLocalServiceImpl
 * @generated
 */
@ProviderType
public class BiometricDataLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link IdentificationDatabase.service.impl.BiometricDataLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the biometric data to the database. Also notifies the appropriate model listeners.
	*
	* @param biometricData the biometric data
	* @return the biometric data that was added
	*/
	public static IdentificationDatabase.model.BiometricData addBiometricData(
		IdentificationDatabase.model.BiometricData biometricData) {
		return getService().addBiometricData(biometricData);
	}

	/**
	* Creates a new biometric data with the primary key. Does not add the biometric data to the database.
	*
	* @param id the primary key for the new biometric data
	* @return the new biometric data
	*/
	public static IdentificationDatabase.model.BiometricData createBiometricData(
		long id) {
		return getService().createBiometricData(id);
	}

	/**
	* Deletes the biometric data from the database. Also notifies the appropriate model listeners.
	*
	* @param biometricData the biometric data
	* @return the biometric data that was removed
	*/
	public static IdentificationDatabase.model.BiometricData deleteBiometricData(
		IdentificationDatabase.model.BiometricData biometricData) {
		return getService().deleteBiometricData(biometricData);
	}

	/**
	* Deletes the biometric data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the biometric data
	* @return the biometric data that was removed
	* @throws PortalException if a biometric data with the primary key could not be found
	*/
	public static IdentificationDatabase.model.BiometricData deleteBiometricData(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteBiometricData(id);
	}

	public static IdentificationDatabase.model.BiometricData fetchBiometricData(
		long id) {
		return getService().fetchBiometricData(id);
	}

	/**
	* Returns the biometric data with the primary key.
	*
	* @param id the primary key of the biometric data
	* @return the biometric data
	* @throws PortalException if a biometric data with the primary key could not be found
	*/
	public static IdentificationDatabase.model.BiometricData getBiometricData(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getBiometricData(id);
	}

	/**
	* Updates the biometric data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param biometricData the biometric data
	* @return the biometric data that was updated
	*/
	public static IdentificationDatabase.model.BiometricData updateBiometricData(
		IdentificationDatabase.model.BiometricData biometricData) {
		return getService().updateBiometricData(biometricData);
	}

	public static IdentificationDatabase.model.BiometricDataFingerPrintBlobModel getFingerPrintBlobModel(
		java.io.Serializable primaryKey) {
		return getService().getFingerPrintBlobModel(primaryKey);
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
	* Returns the number of biometric datas.
	*
	* @return the number of biometric datas
	*/
	public static int getBiometricDatasCount() {
		return getService().getBiometricDatasCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the biometric datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @return the range of biometric datas
	*/
	public static java.util.List<IdentificationDatabase.model.BiometricData> getBiometricDatas(
		int start, int end) {
		return getService().getBiometricDatas(start, end);
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

	public static BiometricDataLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BiometricDataLocalService, BiometricDataLocalService> _serviceTracker =
		ServiceTrackerFactory.open(BiometricDataLocalService.class);
}