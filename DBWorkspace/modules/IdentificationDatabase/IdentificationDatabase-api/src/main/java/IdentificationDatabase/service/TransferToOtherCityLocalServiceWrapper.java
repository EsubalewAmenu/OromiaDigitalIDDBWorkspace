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
 * Provides a wrapper for {@link TransferToOtherCityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TransferToOtherCityLocalService
 * @generated
 */
@ProviderType
public class TransferToOtherCityLocalServiceWrapper
	implements TransferToOtherCityLocalService,
		ServiceWrapper<TransferToOtherCityLocalService> {
	public TransferToOtherCityLocalServiceWrapper(
		TransferToOtherCityLocalService transferToOtherCityLocalService) {
		_transferToOtherCityLocalService = transferToOtherCityLocalService;
	}

	/**
	* Adds the transfer to other city to the database. Also notifies the appropriate model listeners.
	*
	* @param transferToOtherCity the transfer to other city
	* @return the transfer to other city that was added
	*/
	@Override
	public IdentificationDatabase.model.TransferToOtherCity addTransferToOtherCity(
		IdentificationDatabase.model.TransferToOtherCity transferToOtherCity) {
		return _transferToOtherCityLocalService.addTransferToOtherCity(transferToOtherCity);
	}

	/**
	* Creates a new transfer to other city with the primary key. Does not add the transfer to other city to the database.
	*
	* @param id the primary key for the new transfer to other city
	* @return the new transfer to other city
	*/
	@Override
	public IdentificationDatabase.model.TransferToOtherCity createTransferToOtherCity(
		long id) {
		return _transferToOtherCityLocalService.createTransferToOtherCity(id);
	}

	/**
	* Deletes the transfer to other city from the database. Also notifies the appropriate model listeners.
	*
	* @param transferToOtherCity the transfer to other city
	* @return the transfer to other city that was removed
	*/
	@Override
	public IdentificationDatabase.model.TransferToOtherCity deleteTransferToOtherCity(
		IdentificationDatabase.model.TransferToOtherCity transferToOtherCity) {
		return _transferToOtherCityLocalService.deleteTransferToOtherCity(transferToOtherCity);
	}

	/**
	* Deletes the transfer to other city with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the transfer to other city
	* @return the transfer to other city that was removed
	* @throws PortalException if a transfer to other city with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.TransferToOtherCity deleteTransferToOtherCity(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _transferToOtherCityLocalService.deleteTransferToOtherCity(id);
	}

	@Override
	public IdentificationDatabase.model.TransferToOtherCity fetchTransferToOtherCity(
		long id) {
		return _transferToOtherCityLocalService.fetchTransferToOtherCity(id);
	}

	/**
	* Returns the transfer to other city with the primary key.
	*
	* @param id the primary key of the transfer to other city
	* @return the transfer to other city
	* @throws PortalException if a transfer to other city with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.TransferToOtherCity getTransferToOtherCity(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _transferToOtherCityLocalService.getTransferToOtherCity(id);
	}

	/**
	* Updates the transfer to other city in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param transferToOtherCity the transfer to other city
	* @return the transfer to other city that was updated
	*/
	@Override
	public IdentificationDatabase.model.TransferToOtherCity updateTransferToOtherCity(
		IdentificationDatabase.model.TransferToOtherCity transferToOtherCity) {
		return _transferToOtherCityLocalService.updateTransferToOtherCity(transferToOtherCity);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _transferToOtherCityLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _transferToOtherCityLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _transferToOtherCityLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _transferToOtherCityLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _transferToOtherCityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of transfer to other cities.
	*
	* @return the number of transfer to other cities
	*/
	@Override
	public int getTransferToOtherCitiesCount() {
		return _transferToOtherCityLocalService.getTransferToOtherCitiesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _transferToOtherCityLocalService.getOSGiServiceIdentifier();
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
		return _transferToOtherCityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _transferToOtherCityLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _transferToOtherCityLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the transfer to other cities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of transfer to other cities
	* @param end the upper bound of the range of transfer to other cities (not inclusive)
	* @return the range of transfer to other cities
	*/
	@Override
	public java.util.List<IdentificationDatabase.model.TransferToOtherCity> getTransferToOtherCities(
		int start, int end) {
		return _transferToOtherCityLocalService.getTransferToOtherCities(start,
			end);
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
		return _transferToOtherCityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _transferToOtherCityLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public TransferToOtherCityLocalService getWrappedService() {
		return _transferToOtherCityLocalService;
	}

	@Override
	public void setWrappedService(
		TransferToOtherCityLocalService transferToOtherCityLocalService) {
		_transferToOtherCityLocalService = transferToOtherCityLocalService;
	}

	private TransferToOtherCityLocalService _transferToOtherCityLocalService;
}