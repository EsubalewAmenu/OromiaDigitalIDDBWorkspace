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

import IdentificationDatabase.model.BiometricData;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the biometric data service. This utility wraps {@link IdentificationDatabase.service.persistence.impl.BiometricDataPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BiometricDataPersistence
 * @see IdentificationDatabase.service.persistence.impl.BiometricDataPersistenceImpl
 * @generated
 */
@ProviderType
public class BiometricDataUtil {
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
	public static void clearCache(BiometricData biometricData) {
		getPersistence().clearCache(biometricData);
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
	public static List<BiometricData> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<BiometricData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<BiometricData> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<BiometricData> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static BiometricData update(BiometricData biometricData) {
		return getPersistence().update(biometricData);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static BiometricData update(BiometricData biometricData,
		ServiceContext serviceContext) {
		return getPersistence().update(biometricData, serviceContext);
	}

	/**
	* Returns all the biometric datas where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the matching biometric datas
	*/
	public static List<BiometricData> findBycitizenId(long citizenId) {
		return getPersistence().findBycitizenId(citizenId);
	}

	/**
	* Returns a range of all the biometric datas where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @return the range of matching biometric datas
	*/
	public static List<BiometricData> findBycitizenId(long citizenId,
		int start, int end) {
		return getPersistence().findBycitizenId(citizenId, start, end);
	}

	/**
	* Returns an ordered range of all the biometric datas where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching biometric datas
	*/
	public static List<BiometricData> findBycitizenId(long citizenId,
		int start, int end, OrderByComparator<BiometricData> orderByComparator) {
		return getPersistence()
				   .findBycitizenId(citizenId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the biometric datas where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching biometric datas
	*/
	public static List<BiometricData> findBycitizenId(long citizenId,
		int start, int end, OrderByComparator<BiometricData> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycitizenId(citizenId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first biometric data in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching biometric data
	* @throws NoSuchBiometricDataException if a matching biometric data could not be found
	*/
	public static BiometricData findBycitizenId_First(long citizenId,
		OrderByComparator<BiometricData> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchBiometricDataException {
		return getPersistence()
				   .findBycitizenId_First(citizenId, orderByComparator);
	}

	/**
	* Returns the first biometric data in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching biometric data, or <code>null</code> if a matching biometric data could not be found
	*/
	public static BiometricData fetchBycitizenId_First(long citizenId,
		OrderByComparator<BiometricData> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenId_First(citizenId, orderByComparator);
	}

	/**
	* Returns the last biometric data in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching biometric data
	* @throws NoSuchBiometricDataException if a matching biometric data could not be found
	*/
	public static BiometricData findBycitizenId_Last(long citizenId,
		OrderByComparator<BiometricData> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchBiometricDataException {
		return getPersistence()
				   .findBycitizenId_Last(citizenId, orderByComparator);
	}

	/**
	* Returns the last biometric data in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching biometric data, or <code>null</code> if a matching biometric data could not be found
	*/
	public static BiometricData fetchBycitizenId_Last(long citizenId,
		OrderByComparator<BiometricData> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenId_Last(citizenId, orderByComparator);
	}

	/**
	* Returns the biometric datas before and after the current biometric data in the ordered set where citizenId = &#63;.
	*
	* @param id the primary key of the current biometric data
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next biometric data
	* @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	*/
	public static BiometricData[] findBycitizenId_PrevAndNext(long id,
		long citizenId, OrderByComparator<BiometricData> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchBiometricDataException {
		return getPersistence()
				   .findBycitizenId_PrevAndNext(id, citizenId, orderByComparator);
	}

	/**
	* Removes all the biometric datas where citizenId = &#63; from the database.
	*
	* @param citizenId the citizen ID
	*/
	public static void removeBycitizenId(long citizenId) {
		getPersistence().removeBycitizenId(citizenId);
	}

	/**
	* Returns the number of biometric datas where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the number of matching biometric datas
	*/
	public static int countBycitizenId(long citizenId) {
		return getPersistence().countBycitizenId(citizenId);
	}

	/**
	* Caches the biometric data in the entity cache if it is enabled.
	*
	* @param biometricData the biometric data
	*/
	public static void cacheResult(BiometricData biometricData) {
		getPersistence().cacheResult(biometricData);
	}

	/**
	* Caches the biometric datas in the entity cache if it is enabled.
	*
	* @param biometricDatas the biometric datas
	*/
	public static void cacheResult(List<BiometricData> biometricDatas) {
		getPersistence().cacheResult(biometricDatas);
	}

	/**
	* Creates a new biometric data with the primary key. Does not add the biometric data to the database.
	*
	* @param id the primary key for the new biometric data
	* @return the new biometric data
	*/
	public static BiometricData create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the biometric data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the biometric data
	* @return the biometric data that was removed
	* @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	*/
	public static BiometricData remove(long id)
		throws IdentificationDatabase.exception.NoSuchBiometricDataException {
		return getPersistence().remove(id);
	}

	public static BiometricData updateImpl(BiometricData biometricData) {
		return getPersistence().updateImpl(biometricData);
	}

	/**
	* Returns the biometric data with the primary key or throws a {@link NoSuchBiometricDataException} if it could not be found.
	*
	* @param id the primary key of the biometric data
	* @return the biometric data
	* @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	*/
	public static BiometricData findByPrimaryKey(long id)
		throws IdentificationDatabase.exception.NoSuchBiometricDataException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the biometric data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the biometric data
	* @return the biometric data, or <code>null</code> if a biometric data with the primary key could not be found
	*/
	public static BiometricData fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, BiometricData> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the biometric datas.
	*
	* @return the biometric datas
	*/
	public static List<BiometricData> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the biometric datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @return the range of biometric datas
	*/
	public static List<BiometricData> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the biometric datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of biometric datas
	*/
	public static List<BiometricData> findAll(int start, int end,
		OrderByComparator<BiometricData> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the biometric datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of biometric datas
	*/
	public static List<BiometricData> findAll(int start, int end,
		OrderByComparator<BiometricData> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the biometric datas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of biometric datas.
	*
	* @return the number of biometric datas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static BiometricDataPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<BiometricDataPersistence, BiometricDataPersistence> _serviceTracker =
		ServiceTrackerFactory.open(BiometricDataPersistence.class);
}