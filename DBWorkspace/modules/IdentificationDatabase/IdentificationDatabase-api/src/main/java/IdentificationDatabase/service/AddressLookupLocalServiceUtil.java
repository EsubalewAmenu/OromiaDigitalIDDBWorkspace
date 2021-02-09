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
 * Provides the local service utility for AddressLookup. This utility wraps
 * {@link IdentificationDatabase.service.impl.AddressLookupLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AddressLookupLocalService
 * @see IdentificationDatabase.service.base.AddressLookupLocalServiceBaseImpl
 * @see IdentificationDatabase.service.impl.AddressLookupLocalServiceImpl
 * @generated
 */
@ProviderType
public class AddressLookupLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link IdentificationDatabase.service.impl.AddressLookupLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the address lookup to the database. Also notifies the appropriate model listeners.
	*
	* @param addressLookup the address lookup
	* @return the address lookup that was added
	*/
	public static IdentificationDatabase.model.AddressLookup addAddressLookup(
		IdentificationDatabase.model.AddressLookup addressLookup) {
		return getService().addAddressLookup(addressLookup);
	}

	/**
	* Creates a new address lookup with the primary key. Does not add the address lookup to the database.
	*
	* @param id the primary key for the new address lookup
	* @return the new address lookup
	*/
	public static IdentificationDatabase.model.AddressLookup createAddressLookup(
		long id) {
		return getService().createAddressLookup(id);
	}

	/**
	* Deletes the address lookup from the database. Also notifies the appropriate model listeners.
	*
	* @param addressLookup the address lookup
	* @return the address lookup that was removed
	*/
	public static IdentificationDatabase.model.AddressLookup deleteAddressLookup(
		IdentificationDatabase.model.AddressLookup addressLookup) {
		return getService().deleteAddressLookup(addressLookup);
	}

	/**
	* Deletes the address lookup with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the address lookup
	* @return the address lookup that was removed
	* @throws PortalException if a address lookup with the primary key could not be found
	*/
	public static IdentificationDatabase.model.AddressLookup deleteAddressLookup(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAddressLookup(id);
	}

	public static IdentificationDatabase.model.AddressLookup fetchAddressLookup(
		long id) {
		return getService().fetchAddressLookup(id);
	}

	/**
	* Returns the address lookup with the primary key.
	*
	* @param id the primary key of the address lookup
	* @return the address lookup
	* @throws PortalException if a address lookup with the primary key could not be found
	*/
	public static IdentificationDatabase.model.AddressLookup getAddressLookup(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAddressLookup(id);
	}

	/**
	* Updates the address lookup in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param addressLookup the address lookup
	* @return the address lookup that was updated
	*/
	public static IdentificationDatabase.model.AddressLookup updateAddressLookup(
		IdentificationDatabase.model.AddressLookup addressLookup) {
		return getService().updateAddressLookup(addressLookup);
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
	* Returns the number of address lookups.
	*
	* @return the number of address lookups
	*/
	public static int getAddressLookupsCount() {
		return getService().getAddressLookupsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the address lookups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of address lookups
	* @param end the upper bound of the range of address lookups (not inclusive)
	* @return the range of address lookups
	*/
	public static java.util.List<IdentificationDatabase.model.AddressLookup> getAddressLookups(
		int start, int end) {
		return getService().getAddressLookups(start, end);
	}

	public static java.util.List<IdentificationDatabase.model.AddressLookup> getAddressesForStatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getAddressesForStatus(status);
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

	public static AddressLookupLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AddressLookupLocalService, AddressLookupLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AddressLookupLocalService.class);
}