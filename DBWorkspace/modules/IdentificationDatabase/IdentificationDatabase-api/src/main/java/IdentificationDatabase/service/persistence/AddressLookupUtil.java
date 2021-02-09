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

package IdentificationDatabase.service.persistence;

import IdentificationDatabase.model.AddressLookup;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the address lookup service. This utility wraps {@link IdentificationDatabase.service.persistence.impl.AddressLookupPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressLookupPersistence
 * @see IdentificationDatabase.service.persistence.impl.AddressLookupPersistenceImpl
 * @generated
 */
@ProviderType
public class AddressLookupUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AddressLookup addressLookup) {
		getPersistence().clearCache(addressLookup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AddressLookup> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AddressLookup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AddressLookup> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AddressLookup> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AddressLookup update(AddressLookup addressLookup) {
		return getPersistence().update(addressLookup);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AddressLookup update(AddressLookup addressLookup,
		ServiceContext serviceContext) {
		return getPersistence().update(addressLookup, serviceContext);
	}

	/**
	* Returns all the address lookups where status = &#63;.
	*
	* @param status the status
	* @return the matching address lookups
	*/
	public static List<AddressLookup> findBystatus(int status) {
		return getPersistence().findBystatus(status);
	}

	/**
	* Returns a range of all the address lookups where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of address lookups
	* @param end the upper bound of the range of address lookups (not inclusive)
	* @return the range of matching address lookups
	*/
	public static List<AddressLookup> findBystatus(int status, int start,
		int end) {
		return getPersistence().findBystatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the address lookups where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of address lookups
	* @param end the upper bound of the range of address lookups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching address lookups
	*/
	public static List<AddressLookup> findBystatus(int status, int start,
		int end, OrderByComparator<AddressLookup> orderByComparator) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the address lookups where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of address lookups
	* @param end the upper bound of the range of address lookups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching address lookups
	*/
	public static List<AddressLookup> findBystatus(int status, int start,
		int end, OrderByComparator<AddressLookup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first address lookup in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching address lookup
	* @throws NoSuchAddressLookupException if a matching address lookup could not be found
	*/
	public static AddressLookup findBystatus_First(int status,
		OrderByComparator<AddressLookup> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchAddressLookupException {
		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the first address lookup in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching address lookup, or <code>null</code> if a matching address lookup could not be found
	*/
	public static AddressLookup fetchBystatus_First(int status,
		OrderByComparator<AddressLookup> orderByComparator) {
		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the last address lookup in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching address lookup
	* @throws NoSuchAddressLookupException if a matching address lookup could not be found
	*/
	public static AddressLookup findBystatus_Last(int status,
		OrderByComparator<AddressLookup> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchAddressLookupException {
		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last address lookup in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching address lookup, or <code>null</code> if a matching address lookup could not be found
	*/
	public static AddressLookup fetchBystatus_Last(int status,
		OrderByComparator<AddressLookup> orderByComparator) {
		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the address lookups before and after the current address lookup in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current address lookup
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next address lookup
	* @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	*/
	public static AddressLookup[] findBystatus_PrevAndNext(long id, int status,
		OrderByComparator<AddressLookup> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchAddressLookupException {
		return getPersistence()
				   .findBystatus_PrevAndNext(id, status, orderByComparator);
	}

	/**
	* Removes all the address lookups where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeBystatus(int status) {
		getPersistence().removeBystatus(status);
	}

	/**
	* Returns the number of address lookups where status = &#63;.
	*
	* @param status the status
	* @return the number of matching address lookups
	*/
	public static int countBystatus(int status) {
		return getPersistence().countBystatus(status);
	}

	/**
	* Caches the address lookup in the entity cache if it is enabled.
	*
	* @param addressLookup the address lookup
	*/
	public static void cacheResult(AddressLookup addressLookup) {
		getPersistence().cacheResult(addressLookup);
	}

	/**
	* Caches the address lookups in the entity cache if it is enabled.
	*
	* @param addressLookups the address lookups
	*/
	public static void cacheResult(List<AddressLookup> addressLookups) {
		getPersistence().cacheResult(addressLookups);
	}

	/**
	* Creates a new address lookup with the primary key. Does not add the address lookup to the database.
	*
	* @param id the primary key for the new address lookup
	* @return the new address lookup
	*/
	public static AddressLookup create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the address lookup with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the address lookup
	* @return the address lookup that was removed
	* @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	*/
	public static AddressLookup remove(long id)
		throws IdentificationDatabase.exception.NoSuchAddressLookupException {
		return getPersistence().remove(id);
	}

	public static AddressLookup updateImpl(AddressLookup addressLookup) {
		return getPersistence().updateImpl(addressLookup);
	}

	/**
	* Returns the address lookup with the primary key or throws a {@link NoSuchAddressLookupException} if it could not be found.
	*
	* @param id the primary key of the address lookup
	* @return the address lookup
	* @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	*/
	public static AddressLookup findByPrimaryKey(long id)
		throws IdentificationDatabase.exception.NoSuchAddressLookupException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the address lookup with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the address lookup
	* @return the address lookup, or <code>null</code> if a address lookup with the primary key could not be found
	*/
	public static AddressLookup fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, AddressLookup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the address lookups.
	*
	* @return the address lookups
	*/
	public static List<AddressLookup> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the address lookups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of address lookups
	* @param end the upper bound of the range of address lookups (not inclusive)
	* @return the range of address lookups
	*/
	public static List<AddressLookup> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the address lookups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of address lookups
	* @param end the upper bound of the range of address lookups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of address lookups
	*/
	public static List<AddressLookup> findAll(int start, int end,
		OrderByComparator<AddressLookup> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the address lookups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of address lookups
	* @param end the upper bound of the range of address lookups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of address lookups
	*/
	public static List<AddressLookup> findAll(int start, int end,
		OrderByComparator<AddressLookup> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the address lookups from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of address lookups.
	*
	* @return the number of address lookups
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AddressLookupPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AddressLookupPersistence, AddressLookupPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AddressLookupPersistence.class);
}