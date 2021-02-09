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

import IdentificationDatabase.model.PrintedHistory;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the printed history service. This utility wraps {@link IdentificationDatabase.service.persistence.impl.PrintedHistoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PrintedHistoryPersistence
 * @see IdentificationDatabase.service.persistence.impl.PrintedHistoryPersistenceImpl
 * @generated
 */
@ProviderType
public class PrintedHistoryUtil {
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
	public static void clearCache(PrintedHistory printedHistory) {
		getPersistence().clearCache(printedHistory);
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
	public static List<PrintedHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PrintedHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PrintedHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PrintedHistory> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PrintedHistory update(PrintedHistory printedHistory) {
		return getPersistence().update(printedHistory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PrintedHistory update(PrintedHistory printedHistory,
		ServiceContext serviceContext) {
		return getPersistence().update(printedHistory, serviceContext);
	}

	/**
	* Returns all the printed histories where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the matching printed histories
	*/
	public static List<PrintedHistory> findBycitizenId(long citizenId) {
		return getPersistence().findBycitizenId(citizenId);
	}

	/**
	* Returns a range of all the printed histories where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @return the range of matching printed histories
	*/
	public static List<PrintedHistory> findBycitizenId(long citizenId,
		int start, int end) {
		return getPersistence().findBycitizenId(citizenId, start, end);
	}

	/**
	* Returns an ordered range of all the printed histories where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching printed histories
	*/
	public static List<PrintedHistory> findBycitizenId(long citizenId,
		int start, int end, OrderByComparator<PrintedHistory> orderByComparator) {
		return getPersistence()
				   .findBycitizenId(citizenId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the printed histories where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching printed histories
	*/
	public static List<PrintedHistory> findBycitizenId(long citizenId,
		int start, int end,
		OrderByComparator<PrintedHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycitizenId(citizenId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first printed history in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching printed history
	* @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	*/
	public static PrintedHistory findBycitizenId_First(long citizenId,
		OrderByComparator<PrintedHistory> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchPrintedHistoryException {
		return getPersistence()
				   .findBycitizenId_First(citizenId, orderByComparator);
	}

	/**
	* Returns the first printed history in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching printed history, or <code>null</code> if a matching printed history could not be found
	*/
	public static PrintedHistory fetchBycitizenId_First(long citizenId,
		OrderByComparator<PrintedHistory> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenId_First(citizenId, orderByComparator);
	}

	/**
	* Returns the last printed history in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching printed history
	* @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	*/
	public static PrintedHistory findBycitizenId_Last(long citizenId,
		OrderByComparator<PrintedHistory> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchPrintedHistoryException {
		return getPersistence()
				   .findBycitizenId_Last(citizenId, orderByComparator);
	}

	/**
	* Returns the last printed history in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching printed history, or <code>null</code> if a matching printed history could not be found
	*/
	public static PrintedHistory fetchBycitizenId_Last(long citizenId,
		OrderByComparator<PrintedHistory> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenId_Last(citizenId, orderByComparator);
	}

	/**
	* Returns the printed histories before and after the current printed history in the ordered set where citizenId = &#63;.
	*
	* @param id the primary key of the current printed history
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next printed history
	* @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	*/
	public static PrintedHistory[] findBycitizenId_PrevAndNext(long id,
		long citizenId, OrderByComparator<PrintedHistory> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchPrintedHistoryException {
		return getPersistence()
				   .findBycitizenId_PrevAndNext(id, citizenId, orderByComparator);
	}

	/**
	* Removes all the printed histories where citizenId = &#63; from the database.
	*
	* @param citizenId the citizen ID
	*/
	public static void removeBycitizenId(long citizenId) {
		getPersistence().removeBycitizenId(citizenId);
	}

	/**
	* Returns the number of printed histories where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the number of matching printed histories
	*/
	public static int countBycitizenId(long citizenId) {
		return getPersistence().countBycitizenId(citizenId);
	}

	/**
	* Returns all the printed histories where id = &#63;.
	*
	* @param id the ID
	* @return the matching printed histories
	*/
	public static List<PrintedHistory> findByid(long id) {
		return getPersistence().findByid(id);
	}

	/**
	* Returns a range of all the printed histories where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @return the range of matching printed histories
	*/
	public static List<PrintedHistory> findByid(long id, int start, int end) {
		return getPersistence().findByid(id, start, end);
	}

	/**
	* Returns an ordered range of all the printed histories where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching printed histories
	*/
	public static List<PrintedHistory> findByid(long id, int start, int end,
		OrderByComparator<PrintedHistory> orderByComparator) {
		return getPersistence().findByid(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the printed histories where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching printed histories
	*/
	public static List<PrintedHistory> findByid(long id, int start, int end,
		OrderByComparator<PrintedHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByid(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first printed history in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching printed history
	* @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	*/
	public static PrintedHistory findByid_First(long id,
		OrderByComparator<PrintedHistory> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchPrintedHistoryException {
		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	* Returns the first printed history in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching printed history, or <code>null</code> if a matching printed history could not be found
	*/
	public static PrintedHistory fetchByid_First(long id,
		OrderByComparator<PrintedHistory> orderByComparator) {
		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	* Returns the last printed history in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching printed history
	* @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	*/
	public static PrintedHistory findByid_Last(long id,
		OrderByComparator<PrintedHistory> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchPrintedHistoryException {
		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	* Returns the last printed history in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching printed history, or <code>null</code> if a matching printed history could not be found
	*/
	public static PrintedHistory fetchByid_Last(long id,
		OrderByComparator<PrintedHistory> orderByComparator) {
		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	* Removes all the printed histories where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	* Returns the number of printed histories where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching printed histories
	*/
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	* Caches the printed history in the entity cache if it is enabled.
	*
	* @param printedHistory the printed history
	*/
	public static void cacheResult(PrintedHistory printedHistory) {
		getPersistence().cacheResult(printedHistory);
	}

	/**
	* Caches the printed histories in the entity cache if it is enabled.
	*
	* @param printedHistories the printed histories
	*/
	public static void cacheResult(List<PrintedHistory> printedHistories) {
		getPersistence().cacheResult(printedHistories);
	}

	/**
	* Creates a new printed history with the primary key. Does not add the printed history to the database.
	*
	* @param id the primary key for the new printed history
	* @return the new printed history
	*/
	public static PrintedHistory create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the printed history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the printed history
	* @return the printed history that was removed
	* @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	*/
	public static PrintedHistory remove(long id)
		throws IdentificationDatabase.exception.NoSuchPrintedHistoryException {
		return getPersistence().remove(id);
	}

	public static PrintedHistory updateImpl(PrintedHistory printedHistory) {
		return getPersistence().updateImpl(printedHistory);
	}

	/**
	* Returns the printed history with the primary key or throws a {@link NoSuchPrintedHistoryException} if it could not be found.
	*
	* @param id the primary key of the printed history
	* @return the printed history
	* @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	*/
	public static PrintedHistory findByPrimaryKey(long id)
		throws IdentificationDatabase.exception.NoSuchPrintedHistoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the printed history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the printed history
	* @return the printed history, or <code>null</code> if a printed history with the primary key could not be found
	*/
	public static PrintedHistory fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, PrintedHistory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the printed histories.
	*
	* @return the printed histories
	*/
	public static List<PrintedHistory> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the printed histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @return the range of printed histories
	*/
	public static List<PrintedHistory> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the printed histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of printed histories
	*/
	public static List<PrintedHistory> findAll(int start, int end,
		OrderByComparator<PrintedHistory> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the printed histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of printed histories
	*/
	public static List<PrintedHistory> findAll(int start, int end,
		OrderByComparator<PrintedHistory> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the printed histories from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of printed histories.
	*
	* @return the number of printed histories
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static PrintedHistoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PrintedHistoryPersistence, PrintedHistoryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(PrintedHistoryPersistence.class);
}