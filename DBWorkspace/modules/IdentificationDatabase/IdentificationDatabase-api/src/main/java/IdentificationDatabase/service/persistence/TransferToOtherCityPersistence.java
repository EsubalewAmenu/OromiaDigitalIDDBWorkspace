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

import IdentificationDatabase.exception.NoSuchTransferToOtherCityException;

import IdentificationDatabase.model.TransferToOtherCity;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the transfer to other city service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.persistence.impl.TransferToOtherCityPersistenceImpl
 * @see TransferToOtherCityUtil
 * @generated
 */
@ProviderType
public interface TransferToOtherCityPersistence extends BasePersistence<TransferToOtherCity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TransferToOtherCityUtil} to access the transfer to other city persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the transfer to other cities where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the matching transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findBycitizenId(long citizenId);

	/**
	* Returns a range of all the transfer to other cities where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of transfer to other cities
	* @param end the upper bound of the range of transfer to other cities (not inclusive)
	* @return the range of matching transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findBycitizenId(long citizenId,
		int start, int end);

	/**
	* Returns an ordered range of all the transfer to other cities where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of transfer to other cities
	* @param end the upper bound of the range of transfer to other cities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findBycitizenId(long citizenId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator);

	/**
	* Returns an ordered range of all the transfer to other cities where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of transfer to other cities
	* @param end the upper bound of the range of transfer to other cities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findBycitizenId(long citizenId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first transfer to other city in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching transfer to other city
	* @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	*/
	public TransferToOtherCity findBycitizenId_First(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator)
		throws NoSuchTransferToOtherCityException;

	/**
	* Returns the first transfer to other city in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	*/
	public TransferToOtherCity fetchBycitizenId_First(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator);

	/**
	* Returns the last transfer to other city in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching transfer to other city
	* @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	*/
	public TransferToOtherCity findBycitizenId_Last(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator)
		throws NoSuchTransferToOtherCityException;

	/**
	* Returns the last transfer to other city in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	*/
	public TransferToOtherCity fetchBycitizenId_Last(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator);

	/**
	* Returns the transfer to other cities before and after the current transfer to other city in the ordered set where citizenId = &#63;.
	*
	* @param id the primary key of the current transfer to other city
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next transfer to other city
	* @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	*/
	public TransferToOtherCity[] findBycitizenId_PrevAndNext(long id,
		long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator)
		throws NoSuchTransferToOtherCityException;

	/**
	* Removes all the transfer to other cities where citizenId = &#63; from the database.
	*
	* @param citizenId the citizen ID
	*/
	public void removeBycitizenId(long citizenId);

	/**
	* Returns the number of transfer to other cities where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the number of matching transfer to other cities
	*/
	public int countBycitizenId(long citizenId);

	/**
	* Returns all the transfer to other cities where id = &#63;.
	*
	* @param id the ID
	* @return the matching transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findByid(long id);

	/**
	* Returns a range of all the transfer to other cities where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of transfer to other cities
	* @param end the upper bound of the range of transfer to other cities (not inclusive)
	* @return the range of matching transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findByid(long id, int start,
		int end);

	/**
	* Returns an ordered range of all the transfer to other cities where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of transfer to other cities
	* @param end the upper bound of the range of transfer to other cities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findByid(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator);

	/**
	* Returns an ordered range of all the transfer to other cities where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of transfer to other cities
	* @param end the upper bound of the range of transfer to other cities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findByid(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first transfer to other city in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching transfer to other city
	* @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	*/
	public TransferToOtherCity findByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator)
		throws NoSuchTransferToOtherCityException;

	/**
	* Returns the first transfer to other city in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	*/
	public TransferToOtherCity fetchByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator);

	/**
	* Returns the last transfer to other city in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching transfer to other city
	* @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	*/
	public TransferToOtherCity findByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator)
		throws NoSuchTransferToOtherCityException;

	/**
	* Returns the last transfer to other city in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	*/
	public TransferToOtherCity fetchByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator);

	/**
	* Removes all the transfer to other cities where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByid(long id);

	/**
	* Returns the number of transfer to other cities where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching transfer to other cities
	*/
	public int countByid(long id);

	/**
	* Caches the transfer to other city in the entity cache if it is enabled.
	*
	* @param transferToOtherCity the transfer to other city
	*/
	public void cacheResult(TransferToOtherCity transferToOtherCity);

	/**
	* Caches the transfer to other cities in the entity cache if it is enabled.
	*
	* @param transferToOtherCities the transfer to other cities
	*/
	public void cacheResult(
		java.util.List<TransferToOtherCity> transferToOtherCities);

	/**
	* Creates a new transfer to other city with the primary key. Does not add the transfer to other city to the database.
	*
	* @param id the primary key for the new transfer to other city
	* @return the new transfer to other city
	*/
	public TransferToOtherCity create(long id);

	/**
	* Removes the transfer to other city with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the transfer to other city
	* @return the transfer to other city that was removed
	* @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	*/
	public TransferToOtherCity remove(long id)
		throws NoSuchTransferToOtherCityException;

	public TransferToOtherCity updateImpl(
		TransferToOtherCity transferToOtherCity);

	/**
	* Returns the transfer to other city with the primary key or throws a {@link NoSuchTransferToOtherCityException} if it could not be found.
	*
	* @param id the primary key of the transfer to other city
	* @return the transfer to other city
	* @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	*/
	public TransferToOtherCity findByPrimaryKey(long id)
		throws NoSuchTransferToOtherCityException;

	/**
	* Returns the transfer to other city with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the transfer to other city
	* @return the transfer to other city, or <code>null</code> if a transfer to other city with the primary key could not be found
	*/
	public TransferToOtherCity fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, TransferToOtherCity> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the transfer to other cities.
	*
	* @return the transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findAll();

	/**
	* Returns a range of all the transfer to other cities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of transfer to other cities
	* @param end the upper bound of the range of transfer to other cities (not inclusive)
	* @return the range of transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findAll(int start, int end);

	/**
	* Returns an ordered range of all the transfer to other cities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of transfer to other cities
	* @param end the upper bound of the range of transfer to other cities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator);

	/**
	* Returns an ordered range of all the transfer to other cities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of transfer to other cities
	* @param end the upper bound of the range of transfer to other cities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of transfer to other cities
	*/
	public java.util.List<TransferToOtherCity> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TransferToOtherCity> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the transfer to other cities from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of transfer to other cities.
	*
	* @return the number of transfer to other cities
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}