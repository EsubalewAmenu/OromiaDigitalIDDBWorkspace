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

import IdentificationDatabase.model.TransferToOtherCity;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the transfer to other city service. This utility wraps {@link IdentificationDatabase.service.persistence.impl.TransferToOtherCityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TransferToOtherCityPersistence
 * @see IdentificationDatabase.service.persistence.impl.TransferToOtherCityPersistenceImpl
 * @generated
 */
@ProviderType
public class TransferToOtherCityUtil {
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
	public static void clearCache(TransferToOtherCity transferToOtherCity) {
		getPersistence().clearCache(transferToOtherCity);
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
	public static List<TransferToOtherCity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TransferToOtherCity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TransferToOtherCity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TransferToOtherCity update(
		TransferToOtherCity transferToOtherCity) {
		return getPersistence().update(transferToOtherCity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TransferToOtherCity update(
		TransferToOtherCity transferToOtherCity, ServiceContext serviceContext) {
		return getPersistence().update(transferToOtherCity, serviceContext);
	}

	/**
	* Returns all the transfer to other cities where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the matching transfer to other cities
	*/
	public static List<TransferToOtherCity> findBycitizenId(long citizenId) {
		return getPersistence().findBycitizenId(citizenId);
	}

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
	public static List<TransferToOtherCity> findBycitizenId(long citizenId,
		int start, int end) {
		return getPersistence().findBycitizenId(citizenId, start, end);
	}

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
	public static List<TransferToOtherCity> findBycitizenId(long citizenId,
		int start, int end,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		return getPersistence()
				   .findBycitizenId(citizenId, start, end, orderByComparator);
	}

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
	public static List<TransferToOtherCity> findBycitizenId(long citizenId,
		int start, int end,
		OrderByComparator<TransferToOtherCity> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycitizenId(citizenId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first transfer to other city in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching transfer to other city
	* @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	*/
	public static TransferToOtherCity findBycitizenId_First(long citizenId,
		OrderByComparator<TransferToOtherCity> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchTransferToOtherCityException {
		return getPersistence()
				   .findBycitizenId_First(citizenId, orderByComparator);
	}

	/**
	* Returns the first transfer to other city in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	*/
	public static TransferToOtherCity fetchBycitizenId_First(long citizenId,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenId_First(citizenId, orderByComparator);
	}

	/**
	* Returns the last transfer to other city in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching transfer to other city
	* @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	*/
	public static TransferToOtherCity findBycitizenId_Last(long citizenId,
		OrderByComparator<TransferToOtherCity> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchTransferToOtherCityException {
		return getPersistence()
				   .findBycitizenId_Last(citizenId, orderByComparator);
	}

	/**
	* Returns the last transfer to other city in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	*/
	public static TransferToOtherCity fetchBycitizenId_Last(long citizenId,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenId_Last(citizenId, orderByComparator);
	}

	/**
	* Returns the transfer to other cities before and after the current transfer to other city in the ordered set where citizenId = &#63;.
	*
	* @param id the primary key of the current transfer to other city
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next transfer to other city
	* @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	*/
	public static TransferToOtherCity[] findBycitizenId_PrevAndNext(long id,
		long citizenId, OrderByComparator<TransferToOtherCity> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchTransferToOtherCityException {
		return getPersistence()
				   .findBycitizenId_PrevAndNext(id, citizenId, orderByComparator);
	}

	/**
	* Removes all the transfer to other cities where citizenId = &#63; from the database.
	*
	* @param citizenId the citizen ID
	*/
	public static void removeBycitizenId(long citizenId) {
		getPersistence().removeBycitizenId(citizenId);
	}

	/**
	* Returns the number of transfer to other cities where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the number of matching transfer to other cities
	*/
	public static int countBycitizenId(long citizenId) {
		return getPersistence().countBycitizenId(citizenId);
	}

	/**
	* Returns all the transfer to other cities where id = &#63;.
	*
	* @param id the ID
	* @return the matching transfer to other cities
	*/
	public static List<TransferToOtherCity> findByid(long id) {
		return getPersistence().findByid(id);
	}

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
	public static List<TransferToOtherCity> findByid(long id, int start, int end) {
		return getPersistence().findByid(id, start, end);
	}

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
	public static List<TransferToOtherCity> findByid(long id, int start,
		int end, OrderByComparator<TransferToOtherCity> orderByComparator) {
		return getPersistence().findByid(id, start, end, orderByComparator);
	}

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
	public static List<TransferToOtherCity> findByid(long id, int start,
		int end, OrderByComparator<TransferToOtherCity> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByid(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first transfer to other city in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching transfer to other city
	* @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	*/
	public static TransferToOtherCity findByid_First(long id,
		OrderByComparator<TransferToOtherCity> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchTransferToOtherCityException {
		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	* Returns the first transfer to other city in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	*/
	public static TransferToOtherCity fetchByid_First(long id,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	* Returns the last transfer to other city in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching transfer to other city
	* @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	*/
	public static TransferToOtherCity findByid_Last(long id,
		OrderByComparator<TransferToOtherCity> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchTransferToOtherCityException {
		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	* Returns the last transfer to other city in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	*/
	public static TransferToOtherCity fetchByid_Last(long id,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	* Removes all the transfer to other cities where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	* Returns the number of transfer to other cities where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching transfer to other cities
	*/
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	* Caches the transfer to other city in the entity cache if it is enabled.
	*
	* @param transferToOtherCity the transfer to other city
	*/
	public static void cacheResult(TransferToOtherCity transferToOtherCity) {
		getPersistence().cacheResult(transferToOtherCity);
	}

	/**
	* Caches the transfer to other cities in the entity cache if it is enabled.
	*
	* @param transferToOtherCities the transfer to other cities
	*/
	public static void cacheResult(
		List<TransferToOtherCity> transferToOtherCities) {
		getPersistence().cacheResult(transferToOtherCities);
	}

	/**
	* Creates a new transfer to other city with the primary key. Does not add the transfer to other city to the database.
	*
	* @param id the primary key for the new transfer to other city
	* @return the new transfer to other city
	*/
	public static TransferToOtherCity create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the transfer to other city with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the transfer to other city
	* @return the transfer to other city that was removed
	* @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	*/
	public static TransferToOtherCity remove(long id)
		throws IdentificationDatabase.exception.NoSuchTransferToOtherCityException {
		return getPersistence().remove(id);
	}

	public static TransferToOtherCity updateImpl(
		TransferToOtherCity transferToOtherCity) {
		return getPersistence().updateImpl(transferToOtherCity);
	}

	/**
	* Returns the transfer to other city with the primary key or throws a {@link NoSuchTransferToOtherCityException} if it could not be found.
	*
	* @param id the primary key of the transfer to other city
	* @return the transfer to other city
	* @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	*/
	public static TransferToOtherCity findByPrimaryKey(long id)
		throws IdentificationDatabase.exception.NoSuchTransferToOtherCityException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the transfer to other city with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the transfer to other city
	* @return the transfer to other city, or <code>null</code> if a transfer to other city with the primary key could not be found
	*/
	public static TransferToOtherCity fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, TransferToOtherCity> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the transfer to other cities.
	*
	* @return the transfer to other cities
	*/
	public static List<TransferToOtherCity> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<TransferToOtherCity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<TransferToOtherCity> findAll(int start, int end,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<TransferToOtherCity> findAll(int start, int end,
		OrderByComparator<TransferToOtherCity> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the transfer to other cities from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of transfer to other cities.
	*
	* @return the number of transfer to other cities
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static TransferToOtherCityPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TransferToOtherCityPersistence, TransferToOtherCityPersistence> _serviceTracker =
		ServiceTrackerFactory.open(TransferToOtherCityPersistence.class);
}