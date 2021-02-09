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

import IdentificationDatabase.model.CitizenFingerprintMatcher;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the citizen fingerprint matcher service. This utility wraps {@link IdentificationDatabase.service.persistence.impl.CitizenFingerprintMatcherPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitizenFingerprintMatcherPersistence
 * @see IdentificationDatabase.service.persistence.impl.CitizenFingerprintMatcherPersistenceImpl
 * @generated
 */
@ProviderType
public class CitizenFingerprintMatcherUtil {
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
	public static void clearCache(
		CitizenFingerprintMatcher citizenFingerprintMatcher) {
		getPersistence().clearCache(citizenFingerprintMatcher);
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
	public static List<CitizenFingerprintMatcher> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CitizenFingerprintMatcher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CitizenFingerprintMatcher> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CitizenFingerprintMatcher update(
		CitizenFingerprintMatcher citizenFingerprintMatcher) {
		return getPersistence().update(citizenFingerprintMatcher);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CitizenFingerprintMatcher update(
		CitizenFingerprintMatcher citizenFingerprintMatcher,
		ServiceContext serviceContext) {
		return getPersistence().update(citizenFingerprintMatcher, serviceContext);
	}

	/**
	* Returns all the citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @return the matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status) {
		return getPersistence().findBycitizen_status(citizenId, status);
	}

	/**
	* Returns a range of all the citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @return the range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status, int start, int end) {
		return getPersistence()
				   .findBycitizen_status(citizenId, status, start, end);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .findBycitizen_status(citizenId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycitizen_status(citizenId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findBycitizen_status_First(
		long citizenId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findBycitizen_status_First(citizenId, status,
			orderByComparator);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchBycitizen_status_First(
		long citizenId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .fetchBycitizen_status_First(citizenId, status,
			orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findBycitizen_status_Last(
		long citizenId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findBycitizen_status_Last(citizenId, status,
			orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchBycitizen_status_Last(
		long citizenId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .fetchBycitizen_status_Last(citizenId, status,
			orderByComparator);
	}

	/**
	* Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	*
	* @param id the primary key of the current citizen fingerprint matcher
	* @param citizenId the citizen ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static CitizenFingerprintMatcher[] findBycitizen_status_PrevAndNext(
		long id, long citizenId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findBycitizen_status_PrevAndNext(id, citizenId, status,
			orderByComparator);
	}

	/**
	* Removes all the citizen fingerprint matchers where citizenId = &#63; and status = &#63; from the database.
	*
	* @param citizenId the citizen ID
	* @param status the status
	*/
	public static void removeBycitizen_status(long citizenId, int status) {
		getPersistence().removeBycitizen_status(citizenId, status);
	}

	/**
	* Returns the number of citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @return the number of matching citizen fingerprint matchers
	*/
	public static int countBycitizen_status(long citizenId, int status) {
		return getPersistence().countBycitizen_status(citizenId, status);
	}

	/**
	* Returns all the citizen fingerprint matchers where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByuserid_status(
		long userId, int status) {
		return getPersistence().findByuserid_status(userId, status);
	}

	/**
	* Returns a range of all the citizen fingerprint matchers where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @return the range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByuserid_status(
		long userId, int status, int start, int end) {
		return getPersistence().findByuserid_status(userId, status, start, end);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByuserid_status(
		long userId, int status, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .findByuserid_status(userId, status, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByuserid_status(
		long userId, int status, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByuserid_status(userId, status, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findByuserid_status_First(
		long userId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findByuserid_status_First(userId, status, orderByComparator);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchByuserid_status_First(
		long userId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .fetchByuserid_status_First(userId, status, orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findByuserid_status_Last(
		long userId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findByuserid_status_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchByuserid_status_Last(
		long userId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .fetchByuserid_status_Last(userId, status, orderByComparator);
	}

	/**
	* Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param id the primary key of the current citizen fingerprint matcher
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static CitizenFingerprintMatcher[] findByuserid_status_PrevAndNext(
		long id, long userId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findByuserid_status_PrevAndNext(id, userId, status,
			orderByComparator);
	}

	/**
	* Removes all the citizen fingerprint matchers where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public static void removeByuserid_status(long userId, int status) {
		getPersistence().removeByuserid_status(userId, status);
	}

	/**
	* Returns the number of citizen fingerprint matchers where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching citizen fingerprint matchers
	*/
	public static int countByuserid_status(long userId, int status) {
		return getPersistence().countByuserid_status(userId, status);
	}

	/**
	* Returns all the citizen fingerprint matchers where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizenId(
		long citizenId) {
		return getPersistence().findBycitizenId(citizenId);
	}

	/**
	* Returns a range of all the citizen fingerprint matchers where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @return the range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizenId(
		long citizenId, int start, int end) {
		return getPersistence().findBycitizenId(citizenId, start, end);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizenId(
		long citizenId, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .findBycitizenId(citizenId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizenId(
		long citizenId, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycitizenId(citizenId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findBycitizenId_First(
		long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findBycitizenId_First(citizenId, orderByComparator);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchBycitizenId_First(
		long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenId_First(citizenId, orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findBycitizenId_Last(
		long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findBycitizenId_Last(citizenId, orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchBycitizenId_Last(
		long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenId_Last(citizenId, orderByComparator);
	}

	/**
	* Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	*
	* @param id the primary key of the current citizen fingerprint matcher
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static CitizenFingerprintMatcher[] findBycitizenId_PrevAndNext(
		long id, long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findBycitizenId_PrevAndNext(id, citizenId, orderByComparator);
	}

	/**
	* Removes all the citizen fingerprint matchers where citizenId = &#63; from the database.
	*
	* @param citizenId the citizen ID
	*/
	public static void removeBycitizenId(long citizenId) {
		getPersistence().removeBycitizenId(citizenId);
	}

	/**
	* Returns the number of citizen fingerprint matchers where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the number of matching citizen fingerprint matchers
	*/
	public static int countBycitizenId(long citizenId) {
		return getPersistence().countBycitizenId(citizenId);
	}

	/**
	* Returns all the citizen fingerprint matchers where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @return the matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond) {
		return getPersistence().findBycitizenIdSecond(citizenIdSecond);
	}

	/**
	* Returns a range of all the citizen fingerprint matchers where citizenIdSecond = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenIdSecond the citizen ID second
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @return the range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond, int start, int end) {
		return getPersistence()
				   .findBycitizenIdSecond(citizenIdSecond, start, end);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where citizenIdSecond = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenIdSecond the citizen ID second
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .findBycitizenIdSecond(citizenIdSecond, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where citizenIdSecond = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenIdSecond the citizen ID second
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycitizenIdSecond(citizenIdSecond, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findBycitizenIdSecond_First(
		long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findBycitizenIdSecond_First(citizenIdSecond,
			orderByComparator);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchBycitizenIdSecond_First(
		long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenIdSecond_First(citizenIdSecond,
			orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findBycitizenIdSecond_Last(
		long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findBycitizenIdSecond_Last(citizenIdSecond,
			orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchBycitizenIdSecond_Last(
		long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .fetchBycitizenIdSecond_Last(citizenIdSecond,
			orderByComparator);
	}

	/**
	* Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	*
	* @param id the primary key of the current citizen fingerprint matcher
	* @param citizenIdSecond the citizen ID second
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static CitizenFingerprintMatcher[] findBycitizenIdSecond_PrevAndNext(
		long id, long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findBycitizenIdSecond_PrevAndNext(id, citizenIdSecond,
			orderByComparator);
	}

	/**
	* Removes all the citizen fingerprint matchers where citizenIdSecond = &#63; from the database.
	*
	* @param citizenIdSecond the citizen ID second
	*/
	public static void removeBycitizenIdSecond(long citizenIdSecond) {
		getPersistence().removeBycitizenIdSecond(citizenIdSecond);
	}

	/**
	* Returns the number of citizen fingerprint matchers where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @return the number of matching citizen fingerprint matchers
	*/
	public static int countBycitizenIdSecond(long citizenIdSecond) {
		return getPersistence().countBycitizenIdSecond(citizenIdSecond);
	}

	/**
	* Returns all the citizen fingerprint matchers where status = &#63;.
	*
	* @param status the status
	* @return the matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBystatus(int status) {
		return getPersistence().findBystatus(status);
	}

	/**
	* Returns a range of all the citizen fingerprint matchers where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @return the range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBystatus(int status,
		int start, int end) {
		return getPersistence().findBystatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBystatus(int status,
		int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findBystatus(int status,
		int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findBystatus_First(int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchBystatus_First(int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findBystatus_Last(int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchBystatus_Last(int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current citizen fingerprint matcher
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static CitizenFingerprintMatcher[] findBystatus_PrevAndNext(
		long id, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findBystatus_PrevAndNext(id, status, orderByComparator);
	}

	/**
	* Removes all the citizen fingerprint matchers where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeBystatus(int status) {
		getPersistence().removeBystatus(status);
	}

	/**
	* Returns the number of citizen fingerprint matchers where status = &#63;.
	*
	* @param status the status
	* @return the number of matching citizen fingerprint matchers
	*/
	public static int countBystatus(int status) {
		return getPersistence().countBystatus(status);
	}

	/**
	* Returns all the citizen fingerprint matchers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByuserId(long userId) {
		return getPersistence().findByuserId(userId);
	}

	/**
	* Returns a range of all the citizen fingerprint matchers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @return the range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByuserId(long userId,
		int start, int end) {
		return getPersistence().findByuserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByuserId(long userId,
		int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence()
				   .findByuserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByuserId(long userId,
		int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByuserId(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findByuserId_First(long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence().findByuserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchByuserId_First(long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence().fetchByuserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findByuserId_Last(long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence().findByuserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchByuserId_Last(long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence().fetchByuserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current citizen fingerprint matcher
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static CitizenFingerprintMatcher[] findByuserId_PrevAndNext(
		long id, long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence()
				   .findByuserId_PrevAndNext(id, userId, orderByComparator);
	}

	/**
	* Removes all the citizen fingerprint matchers where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByuserId(long userId) {
		getPersistence().removeByuserId(userId);
	}

	/**
	* Returns the number of citizen fingerprint matchers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching citizen fingerprint matchers
	*/
	public static int countByuserId(long userId) {
		return getPersistence().countByuserId(userId);
	}

	/**
	* Returns all the citizen fingerprint matchers where id = &#63;.
	*
	* @param id the ID
	* @return the matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByid(long id) {
		return getPersistence().findByid(id);
	}

	/**
	* Returns a range of all the citizen fingerprint matchers where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @return the range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByid(long id, int start,
		int end) {
		return getPersistence().findByid(id, start, end);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByid(long id, int start,
		int end, OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence().findByid(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findByid(long id, int start,
		int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByid(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findByid_First(long id,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchByid_First(long id,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher findByid_Last(long id,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public static CitizenFingerprintMatcher fetchByid_Last(long id,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	* Removes all the citizen fingerprint matchers where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	* Returns the number of citizen fingerprint matchers where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching citizen fingerprint matchers
	*/
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	* Caches the citizen fingerprint matcher in the entity cache if it is enabled.
	*
	* @param citizenFingerprintMatcher the citizen fingerprint matcher
	*/
	public static void cacheResult(
		CitizenFingerprintMatcher citizenFingerprintMatcher) {
		getPersistence().cacheResult(citizenFingerprintMatcher);
	}

	/**
	* Caches the citizen fingerprint matchers in the entity cache if it is enabled.
	*
	* @param citizenFingerprintMatchers the citizen fingerprint matchers
	*/
	public static void cacheResult(
		List<CitizenFingerprintMatcher> citizenFingerprintMatchers) {
		getPersistence().cacheResult(citizenFingerprintMatchers);
	}

	/**
	* Creates a new citizen fingerprint matcher with the primary key. Does not add the citizen fingerprint matcher to the database.
	*
	* @param id the primary key for the new citizen fingerprint matcher
	* @return the new citizen fingerprint matcher
	*/
	public static CitizenFingerprintMatcher create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the citizen fingerprint matcher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the citizen fingerprint matcher
	* @return the citizen fingerprint matcher that was removed
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static CitizenFingerprintMatcher remove(long id)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence().remove(id);
	}

	public static CitizenFingerprintMatcher updateImpl(
		CitizenFingerprintMatcher citizenFingerprintMatcher) {
		return getPersistence().updateImpl(citizenFingerprintMatcher);
	}

	/**
	* Returns the citizen fingerprint matcher with the primary key or throws a {@link NoSuchCitizenFingerprintMatcherException} if it could not be found.
	*
	* @param id the primary key of the citizen fingerprint matcher
	* @return the citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static CitizenFingerprintMatcher findByPrimaryKey(long id)
		throws IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the citizen fingerprint matcher with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the citizen fingerprint matcher
	* @return the citizen fingerprint matcher, or <code>null</code> if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static CitizenFingerprintMatcher fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, CitizenFingerprintMatcher> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the citizen fingerprint matchers.
	*
	* @return the citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the citizen fingerprint matchers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @return the range of citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findAll(int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the citizen fingerprint matchers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of citizen fingerprint matchers
	*/
	public static List<CitizenFingerprintMatcher> findAll(int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the citizen fingerprint matchers from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of citizen fingerprint matchers.
	*
	* @return the number of citizen fingerprint matchers
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CitizenFingerprintMatcherPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CitizenFingerprintMatcherPersistence, CitizenFingerprintMatcherPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CitizenFingerprintMatcherPersistence.class);
}