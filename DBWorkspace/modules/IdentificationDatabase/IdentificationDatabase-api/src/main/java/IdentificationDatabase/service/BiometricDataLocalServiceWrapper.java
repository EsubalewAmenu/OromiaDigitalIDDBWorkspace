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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BiometricDataLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BiometricDataLocalService
 * @generated
 */
@ProviderType
public class BiometricDataLocalServiceWrapper
	implements BiometricDataLocalService,
		ServiceWrapper<BiometricDataLocalService> {
	public BiometricDataLocalServiceWrapper(
		BiometricDataLocalService biometricDataLocalService) {
		_biometricDataLocalService = biometricDataLocalService;
	}

	/**
	* Adds the biometric data to the database. Also notifies the appropriate model listeners.
	*
	* @param biometricData the biometric data
	* @return the biometric data that was added
	*/
	@Override
	public IdentificationDatabase.model.BiometricData addBiometricData(
		IdentificationDatabase.model.BiometricData biometricData) {
		return _biometricDataLocalService.addBiometricData(biometricData);
	}

	/**
	* Creates a new biometric data with the primary key. Does not add the biometric data to the database.
	*
	* @param id the primary key for the new biometric data
	* @return the new biometric data
	*/
	@Override
	public IdentificationDatabase.model.BiometricData createBiometricData(
		long id) {
		return _biometricDataLocalService.createBiometricData(id);
	}

	/**
	* Deletes the biometric data from the database. Also notifies the appropriate model listeners.
	*
	* @param biometricData the biometric data
	* @return the biometric data that was removed
	*/
	@Override
	public IdentificationDatabase.model.BiometricData deleteBiometricData(
		IdentificationDatabase.model.BiometricData biometricData) {
		return _biometricDataLocalService.deleteBiometricData(biometricData);
	}

	/**
	* Deletes the biometric data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the biometric data
	* @return the biometric data that was removed
	* @throws PortalException if a biometric data with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.BiometricData deleteBiometricData(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _biometricDataLocalService.deleteBiometricData(id);
	}

	@Override
	public IdentificationDatabase.model.BiometricData fetchBiometricData(
		long id) {
		return _biometricDataLocalService.fetchBiometricData(id);
	}

	/**
	* Returns the biometric data with the primary key.
	*
	* @param id the primary key of the biometric data
	* @return the biometric data
	* @throws PortalException if a biometric data with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.BiometricData getBiometricData(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _biometricDataLocalService.getBiometricData(id);
	}

	/**
	* Updates the biometric data in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param biometricData the biometric data
	* @return the biometric data that was updated
	*/
	@Override
	public IdentificationDatabase.model.BiometricData updateBiometricData(
		IdentificationDatabase.model.BiometricData biometricData) {
		return _biometricDataLocalService.updateBiometricData(biometricData);
	}

	@Override
	public IdentificationDatabase.model.BiometricDataFingerPrintBlobModel getFingerPrintBlobModel(
		java.io.Serializable primaryKey) {
		return _biometricDataLocalService.getFingerPrintBlobModel(primaryKey);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _biometricDataLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _biometricDataLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _biometricDataLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _biometricDataLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _biometricDataLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of biometric datas.
	*
	* @return the number of biometric datas
	*/
	@Override
	public int getBiometricDatasCount() {
		return _biometricDataLocalService.getBiometricDatasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _biometricDataLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _biometricDataLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _biometricDataLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _biometricDataLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
	@Override
	public java.util.List<IdentificationDatabase.model.BiometricData> getBiometricDatas(
		int start, int end) {
		return _biometricDataLocalService.getBiometricDatas(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _biometricDataLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _biometricDataLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public BiometricDataLocalService getWrappedService() {
		return _biometricDataLocalService;
	}

	@Override
	public void setWrappedService(
		BiometricDataLocalService biometricDataLocalService) {
		_biometricDataLocalService = biometricDataLocalService;
	}

	private BiometricDataLocalService _biometricDataLocalService;
}