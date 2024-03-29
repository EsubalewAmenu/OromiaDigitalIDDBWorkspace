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
 * Provides a wrapper for {@link ServicesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ServicesLocalService
 * @generated
 */
@ProviderType
public class ServicesLocalServiceWrapper implements ServicesLocalService,
	ServiceWrapper<ServicesLocalService> {
	public ServicesLocalServiceWrapper(
		ServicesLocalService servicesLocalService) {
		_servicesLocalService = servicesLocalService;
	}

	/**
	* Adds the services to the database. Also notifies the appropriate model listeners.
	*
	* @param services the services
	* @return the services that was added
	*/
	@Override
	public IdentificationDatabase.model.Services addServices(
		IdentificationDatabase.model.Services services) {
		return _servicesLocalService.addServices(services);
	}

	/**
	* Creates a new services with the primary key. Does not add the services to the database.
	*
	* @param id the primary key for the new services
	* @return the new services
	*/
	@Override
	public IdentificationDatabase.model.Services createServices(long id) {
		return _servicesLocalService.createServices(id);
	}

	/**
	* Deletes the services from the database. Also notifies the appropriate model listeners.
	*
	* @param services the services
	* @return the services that was removed
	*/
	@Override
	public IdentificationDatabase.model.Services deleteServices(
		IdentificationDatabase.model.Services services) {
		return _servicesLocalService.deleteServices(services);
	}

	/**
	* Deletes the services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the services
	* @return the services that was removed
	* @throws PortalException if a services with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.Services deleteServices(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _servicesLocalService.deleteServices(id);
	}

	@Override
	public IdentificationDatabase.model.Services fetchServices(long id) {
		return _servicesLocalService.fetchServices(id);
	}

	/**
	* Returns the services with the primary key.
	*
	* @param id the primary key of the services
	* @return the services
	* @throws PortalException if a services with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.Services getServices(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _servicesLocalService.getServices(id);
	}

	/**
	* Updates the services in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param services the services
	* @return the services that was updated
	*/
	@Override
	public IdentificationDatabase.model.Services updateServices(
		IdentificationDatabase.model.Services services) {
		return _servicesLocalService.updateServices(services);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _servicesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _servicesLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _servicesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _servicesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _servicesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of serviceses.
	*
	* @return the number of serviceses
	*/
	@Override
	public int getServicesesCount() {
		return _servicesLocalService.getServicesesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _servicesLocalService.getOSGiServiceIdentifier();
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
		return _servicesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _servicesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _servicesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of serviceses
	*/
	@Override
	public java.util.List<IdentificationDatabase.model.Services> getServiceses(
		int start, int end) {
		return _servicesLocalService.getServiceses(start, end);
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
		return _servicesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _servicesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ServicesLocalService getWrappedService() {
		return _servicesLocalService;
	}

	@Override
	public void setWrappedService(ServicesLocalService servicesLocalService) {
		_servicesLocalService = servicesLocalService;
	}

	private ServicesLocalService _servicesLocalService;
}