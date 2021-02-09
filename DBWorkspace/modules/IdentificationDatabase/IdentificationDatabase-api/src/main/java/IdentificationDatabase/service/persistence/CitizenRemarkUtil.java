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

import IdentificationDatabase.model.CitizenRemark;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the citizen remark service. This utility wraps {@link IdentificationDatabase.service.persistence.impl.CitizenRemarkPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitizenRemarkPersistence
 * @see IdentificationDatabase.service.persistence.impl.CitizenRemarkPersistenceImpl
 * @generated
 */
@ProviderType
public class CitizenRemarkUtil {
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
	public static void clearCache(CitizenRemark citizenRemark) {
		getPersistence().clearCache(citizenRemark);
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
	public static List<CitizenRemark> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CitizenRemark> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CitizenRemark> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CitizenRemark> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CitizenRemark update(CitizenRemark citizenRemark) {
		return getPersistence().update(citizenRemark);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CitizenRemark update(CitizenRemark citizenRemark,
		ServiceContext serviceContext) {
		return getPersistence().update(citizenRemark, serviceContext);
	}

	/**
	* Returns all the citizen remarks where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the matching citizen remarks
	*/
	public static List<CitizenRemark> findBycitizenId(long citizenId) {
		return getPersistence().findBycitizenId(citizenId);
	}

	/**
	* Returns a range of all the citizen remarks where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of citizen remarks
	* @param end the upper bound of the range of citizen remarks (not inclusive)
	* @return the range of matching citizen remarks
	*/
	public static List<CitizenRemark> findBycitizenId(long citizenId,
		int start, int end) {
		return getPersistence().findBycitizenId(citizenId, start, end);
	}

	/**
	* Returns an ordered range of all the citizen remarks where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of citizen remarks
	* @param end the upper bound of the range of citizen remarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizen remarks
	*/
	public static List<CitizenRemark> findBycitizenId(long citizenId,
		int start, int end, OrderByComparator<CitizenRemark> orderByComparator) {
		return getPersistence()
				   .findBycitizenId(citizenId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen remarks where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of citizen remarks
	* @param end the upper bound of the range of citizen remarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching citizen remarks
	*/
	public static List<CitizenRemark> findBycitizenId(long citizenId,
		int start, int end, OrderByComparator<CitizenRemark> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycitizenId(citizenId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first citizen remark in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen remark
	* @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	*/
	public static CitizenRemark findBycitizenId_First(long citizenId,
		OrderByComparator<CitizenRemark> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenRemarkException {
		return getPersistence()
				   .findBycitizenId_First(citizenId, orderByComparator);
	}

	/**
	* Returns the first citizen remark in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	*/
	public static CitizenRemark fetchBycitizenId_First(long citizenId,
		OrderByComparator<CitizenRemark> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenId_First(citizenId, orderByComparator);
	}

	/**
	* Returns the last citizen remark in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen remark
	* @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	*/
	public static CitizenRemark findBycitizenId_Last(long citizenId,
		OrderByComparator<CitizenRemark> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenRemarkException {
		return getPersistence()
				   .findBycitizenId_Last(citizenId, orderByComparator);
	}

	/**
	* Returns the last citizen remark in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	*/
	public static CitizenRemark fetchBycitizenId_Last(long citizenId,
		OrderByComparator<CitizenRemark> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenId_Last(citizenId, orderByComparator);
	}

	/**
	* Returns the citizen remarks before and after the current citizen remark in the ordered set where citizenId = &#63;.
	*
	* @param id the primary key of the current citizen remark
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen remark
	* @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	*/
	public static CitizenRemark[] findBycitizenId_PrevAndNext(long id,
		long citizenId, OrderByComparator<CitizenRemark> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenRemarkException {
		return getPersistence()
				   .findBycitizenId_PrevAndNext(id, citizenId, orderByComparator);
	}

	/**
	* Removes all the citizen remarks where citizenId = &#63; from the database.
	*
	* @param citizenId the citizen ID
	*/
	public static void removeBycitizenId(long citizenId) {
		getPersistence().removeBycitizenId(citizenId);
	}

	/**
	* Returns the number of citizen remarks where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the number of matching citizen remarks
	*/
	public static int countBycitizenId(long citizenId) {
		return getPersistence().countBycitizenId(citizenId);
	}

	/**
	* Returns all the citizen remarks where id = &#63;.
	*
	* @param id the ID
	* @return the matching citizen remarks
	*/
	public static List<CitizenRemark> findByid(long id) {
		return getPersistence().findByid(id);
	}

	/**
	* Returns a range of all the citizen remarks where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of citizen remarks
	* @param end the upper bound of the range of citizen remarks (not inclusive)
	* @return the range of matching citizen remarks
	*/
	public static List<CitizenRemark> findByid(long id, int start, int end) {
		return getPersistence().findByid(id, start, end);
	}

	/**
	* Returns an ordered range of all the citizen remarks where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of citizen remarks
	* @param end the upper bound of the range of citizen remarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizen remarks
	*/
	public static List<CitizenRemark> findByid(long id, int start, int end,
		OrderByComparator<CitizenRemark> orderByComparator) {
		return getPersistence().findByid(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen remarks where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of citizen remarks
	* @param end the upper bound of the range of citizen remarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching citizen remarks
	*/
	public static List<CitizenRemark> findByid(long id, int start, int end,
		OrderByComparator<CitizenRemark> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByid(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first citizen remark in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen remark
	* @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	*/
	public static CitizenRemark findByid_First(long id,
		OrderByComparator<CitizenRemark> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenRemarkException {
		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	* Returns the first citizen remark in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	*/
	public static CitizenRemark fetchByid_First(long id,
		OrderByComparator<CitizenRemark> orderByComparator) {
		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	* Returns the last citizen remark in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen remark
	* @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	*/
	public static CitizenRemark findByid_Last(long id,
		OrderByComparator<CitizenRemark> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenRemarkException {
		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	* Returns the last citizen remark in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	*/
	public static CitizenRemark fetchByid_Last(long id,
		OrderByComparator<CitizenRemark> orderByComparator) {
		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	* Removes all the citizen remarks where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	* Returns the number of citizen remarks where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching citizen remarks
	*/
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	* Caches the citizen remark in the entity cache if it is enabled.
	*
	* @param citizenRemark the citizen remark
	*/
	public static void cacheResult(CitizenRemark citizenRemark) {
		getPersistence().cacheResult(citizenRemark);
	}

	/**
	* Caches the citizen remarks in the entity cache if it is enabled.
	*
	* @param citizenRemarks the citizen remarks
	*/
	public static void cacheResult(List<CitizenRemark> citizenRemarks) {
		getPersistence().cacheResult(citizenRemarks);
	}

	/**
	* Creates a new citizen remark with the primary key. Does not add the citizen remark to the database.
	*
	* @param id the primary key for the new citizen remark
	* @return the new citizen remark
	*/
	public static CitizenRemark create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the citizen remark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the citizen remark
	* @return the citizen remark that was removed
	* @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	*/
	public static CitizenRemark remove(long id)
		throws IdentificationDatabase.exception.NoSuchCitizenRemarkException {
		return getPersistence().remove(id);
	}

	public static CitizenRemark updateImpl(CitizenRemark citizenRemark) {
		return getPersistence().updateImpl(citizenRemark);
	}

	/**
	* Returns the citizen remark with the primary key or throws a {@link NoSuchCitizenRemarkException} if it could not be found.
	*
	* @param id the primary key of the citizen remark
	* @return the citizen remark
	* @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	*/
	public static CitizenRemark findByPrimaryKey(long id)
		throws IdentificationDatabase.exception.NoSuchCitizenRemarkException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the citizen remark with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the citizen remark
	* @return the citizen remark, or <code>null</code> if a citizen remark with the primary key could not be found
	*/
	public static CitizenRemark fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, CitizenRemark> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the citizen remarks.
	*
	* @return the citizen remarks
	*/
	public static List<CitizenRemark> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the citizen remarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizen remarks
	* @param end the upper bound of the range of citizen remarks (not inclusive)
	* @return the range of citizen remarks
	*/
	public static List<CitizenRemark> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the citizen remarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizen remarks
	* @param end the upper bound of the range of citizen remarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of citizen remarks
	*/
	public static List<CitizenRemark> findAll(int start, int end,
		OrderByComparator<CitizenRemark> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen remarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizen remarks
	* @param end the upper bound of the range of citizen remarks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of citizen remarks
	*/
	public static List<CitizenRemark> findAll(int start, int end,
		OrderByComparator<CitizenRemark> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the citizen remarks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of citizen remarks.
	*
	* @return the number of citizen remarks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CitizenRemarkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CitizenRemarkPersistence, CitizenRemarkPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CitizenRemarkPersistence.class);
}