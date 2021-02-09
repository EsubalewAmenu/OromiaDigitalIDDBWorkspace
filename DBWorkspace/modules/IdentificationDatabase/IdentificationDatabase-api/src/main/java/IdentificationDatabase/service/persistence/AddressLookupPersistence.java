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

import IdentificationDatabase.exception.NoSuchAddressLookupException;

import IdentificationDatabase.model.AddressLookup;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the address lookup service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.persistence.impl.AddressLookupPersistenceImpl
 * @see AddressLookupUtil
 * @generated
 */
@ProviderType
public interface AddressLookupPersistence extends BasePersistence<AddressLookup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AddressLookupUtil} to access the address lookup persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the address lookups where status = &#63;.
	*
	* @param status the status
	* @return the matching address lookups
	*/
	public java.util.List<AddressLookup> findBystatus(int status);

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
	public java.util.List<AddressLookup> findBystatus(int status, int start,
		int end);

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
	public java.util.List<AddressLookup> findBystatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddressLookup> orderByComparator);

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
	public java.util.List<AddressLookup> findBystatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddressLookup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first address lookup in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching address lookup
	* @throws NoSuchAddressLookupException if a matching address lookup could not be found
	*/
	public AddressLookup findBystatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AddressLookup> orderByComparator)
		throws NoSuchAddressLookupException;

	/**
	* Returns the first address lookup in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching address lookup, or <code>null</code> if a matching address lookup could not be found
	*/
	public AddressLookup fetchBystatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AddressLookup> orderByComparator);

	/**
	* Returns the last address lookup in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching address lookup
	* @throws NoSuchAddressLookupException if a matching address lookup could not be found
	*/
	public AddressLookup findBystatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AddressLookup> orderByComparator)
		throws NoSuchAddressLookupException;

	/**
	* Returns the last address lookup in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching address lookup, or <code>null</code> if a matching address lookup could not be found
	*/
	public AddressLookup fetchBystatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<AddressLookup> orderByComparator);

	/**
	* Returns the address lookups before and after the current address lookup in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current address lookup
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next address lookup
	* @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	*/
	public AddressLookup[] findBystatus_PrevAndNext(long id, int status,
		com.liferay.portal.kernel.util.OrderByComparator<AddressLookup> orderByComparator)
		throws NoSuchAddressLookupException;

	/**
	* Removes all the address lookups where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeBystatus(int status);

	/**
	* Returns the number of address lookups where status = &#63;.
	*
	* @param status the status
	* @return the number of matching address lookups
	*/
	public int countBystatus(int status);

	/**
	* Caches the address lookup in the entity cache if it is enabled.
	*
	* @param addressLookup the address lookup
	*/
	public void cacheResult(AddressLookup addressLookup);

	/**
	* Caches the address lookups in the entity cache if it is enabled.
	*
	* @param addressLookups the address lookups
	*/
	public void cacheResult(java.util.List<AddressLookup> addressLookups);

	/**
	* Creates a new address lookup with the primary key. Does not add the address lookup to the database.
	*
	* @param id the primary key for the new address lookup
	* @return the new address lookup
	*/
	public AddressLookup create(long id);

	/**
	* Removes the address lookup with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the address lookup
	* @return the address lookup that was removed
	* @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	*/
	public AddressLookup remove(long id) throws NoSuchAddressLookupException;

	public AddressLookup updateImpl(AddressLookup addressLookup);

	/**
	* Returns the address lookup with the primary key or throws a {@link NoSuchAddressLookupException} if it could not be found.
	*
	* @param id the primary key of the address lookup
	* @return the address lookup
	* @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	*/
	public AddressLookup findByPrimaryKey(long id)
		throws NoSuchAddressLookupException;

	/**
	* Returns the address lookup with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the address lookup
	* @return the address lookup, or <code>null</code> if a address lookup with the primary key could not be found
	*/
	public AddressLookup fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, AddressLookup> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the address lookups.
	*
	* @return the address lookups
	*/
	public java.util.List<AddressLookup> findAll();

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
	public java.util.List<AddressLookup> findAll(int start, int end);

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
	public java.util.List<AddressLookup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddressLookup> orderByComparator);

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
	public java.util.List<AddressLookup> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AddressLookup> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the address lookups from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of address lookups.
	*
	* @return the number of address lookups
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}