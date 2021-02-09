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

import IdentificationDatabase.model.RegistrationCitizen;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.Date;
import java.util.List;

/**
 * The persistence utility for the registration citizen service. This utility wraps {@link IdentificationDatabase.service.persistence.impl.RegistrationCitizenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationCitizenPersistence
 * @see IdentificationDatabase.service.persistence.impl.RegistrationCitizenPersistenceImpl
 * @generated
 */
@ProviderType
public class RegistrationCitizenUtil {
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
	public static void clearCache(RegistrationCitizen registrationCitizen) {
		getPersistence().clearCache(registrationCitizen);
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
	public static List<RegistrationCitizen> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RegistrationCitizen> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RegistrationCitizen> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RegistrationCitizen update(
		RegistrationCitizen registrationCitizen) {
		return getPersistence().update(registrationCitizen);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RegistrationCitizen update(
		RegistrationCitizen registrationCitizen, ServiceContext serviceContext) {
		return getPersistence().update(registrationCitizen, serviceContext);
	}

	/**
	* Returns all the registration citizens where status = &#63;.
	*
	* @param status the status
	* @return the matching registration citizens
	*/
	public static List<RegistrationCitizen> findBystatus(int status) {
		return getPersistence().findBystatus(status);
	}

	/**
	* Returns a range of all the registration citizens where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findBystatus(int status, int start,
		int end) {
		return getPersistence().findBystatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findBystatus(int status, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findBystatus(int status, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first registration citizen in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findBystatus_First(int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the first registration citizen in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchBystatus_First(int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findBystatus_Last(int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchBystatus_Last(int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen[] findBystatus_PrevAndNext(long id,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findBystatus_PrevAndNext(id, status, orderByComparator);
	}

	/**
	* Removes all the registration citizens where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeBystatus(int status) {
		getPersistence().removeBystatus(status);
	}

	/**
	* Returns the number of registration citizens where status = &#63;.
	*
	* @param status the status
	* @return the number of matching registration citizens
	*/
	public static int countBystatus(int status) {
		return getPersistence().countBystatus(status);
	}

	/**
	* Returns all the registration citizens where code = &#63;.
	*
	* @param code the code
	* @return the matching registration citizens
	*/
	public static List<RegistrationCitizen> findBycode(java.lang.String code) {
		return getPersistence().findBycode(code);
	}

	/**
	* Returns a range of all the registration citizens where code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findBycode(java.lang.String code,
		int start, int end) {
		return getPersistence().findBycode(code, start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens where code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findBycode(java.lang.String code,
		int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence().findBycode(code, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens where code = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param code the code
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findBycode(java.lang.String code,
		int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycode(code, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first registration citizen in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findBycode_First(java.lang.String code,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence().findBycode_First(code, orderByComparator);
	}

	/**
	* Returns the first registration citizen in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchBycode_First(java.lang.String code,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence().fetchBycode_First(code, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findBycode_Last(java.lang.String code,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence().findBycode_Last(code, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchBycode_Last(java.lang.String code,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence().fetchBycode_Last(code, orderByComparator);
	}

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where code = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen[] findBycode_PrevAndNext(long id,
		java.lang.String code,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findBycode_PrevAndNext(id, code, orderByComparator);
	}

	/**
	* Removes all the registration citizens where code = &#63; from the database.
	*
	* @param code the code
	*/
	public static void removeBycode(java.lang.String code) {
		getPersistence().removeBycode(code);
	}

	/**
	* Returns the number of registration citizens where code = &#63;.
	*
	* @param code the code
	* @return the number of matching registration citizens
	*/
	public static int countBycode(java.lang.String code) {
		return getPersistence().countBycode(code);
	}

	/**
	* Returns all the registration citizens where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @return the matching registration citizens
	*/
	public static List<RegistrationCitizen> findByreciptNo(
		java.lang.String reciptNo) {
		return getPersistence().findByreciptNo(reciptNo);
	}

	/**
	* Returns a range of all the registration citizens where reciptNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param reciptNo the recipt no
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByreciptNo(
		java.lang.String reciptNo, int start, int end) {
		return getPersistence().findByreciptNo(reciptNo, start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens where reciptNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param reciptNo the recipt no
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByreciptNo(
		java.lang.String reciptNo, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .findByreciptNo(reciptNo, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens where reciptNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param reciptNo the recipt no
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByreciptNo(
		java.lang.String reciptNo, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByreciptNo(reciptNo, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first registration citizen in the ordered set where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByreciptNo_First(
		java.lang.String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence().findByreciptNo_First(reciptNo, orderByComparator);
	}

	/**
	* Returns the first registration citizen in the ordered set where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByreciptNo_First(
		java.lang.String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByreciptNo_First(reciptNo, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByreciptNo_Last(
		java.lang.String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence().findByreciptNo_Last(reciptNo, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByreciptNo_Last(
		java.lang.String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence().fetchByreciptNo_Last(reciptNo, orderByComparator);
	}

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where reciptNo = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param reciptNo the recipt no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen[] findByreciptNo_PrevAndNext(long id,
		java.lang.String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByreciptNo_PrevAndNext(id, reciptNo, orderByComparator);
	}

	/**
	* Removes all the registration citizens where reciptNo = &#63; from the database.
	*
	* @param reciptNo the recipt no
	*/
	public static void removeByreciptNo(java.lang.String reciptNo) {
		getPersistence().removeByreciptNo(reciptNo);
	}

	/**
	* Returns the number of registration citizens where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @return the number of matching registration citizens
	*/
	public static int countByreciptNo(java.lang.String reciptNo) {
		return getPersistence().countByreciptNo(reciptNo);
	}

	/**
	* Returns all the registration citizens where id = &#63;.
	*
	* @param id the ID
	* @return the matching registration citizens
	*/
	public static List<RegistrationCitizen> findByid(long id) {
		return getPersistence().findByid(id);
	}

	/**
	* Returns a range of all the registration citizens where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByid(long id, int start, int end) {
		return getPersistence().findByid(id, start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByid(long id, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence().findByid(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByid(long id, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByid(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first registration citizen in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByid_First(long id,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	* Returns the first registration citizen in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByid_First(long id,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByid_Last(long id,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByid_Last(long id,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	* Removes all the registration citizens where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	* Returns the number of registration citizens where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching registration citizens
	*/
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	* Returns all the registration citizens where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @return the matching registration citizens
	*/
	public static List<RegistrationCitizen> findByhouseNo(
		java.lang.String houseNo, java.lang.String kebele) {
		return getPersistence().findByhouseNo(houseNo, kebele);
	}

	/**
	* Returns a range of all the registration citizens where houseNo = &#63; and kebele = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByhouseNo(
		java.lang.String houseNo, java.lang.String kebele, int start, int end) {
		return getPersistence().findByhouseNo(houseNo, kebele, start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens where houseNo = &#63; and kebele = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByhouseNo(
		java.lang.String houseNo, java.lang.String kebele, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .findByhouseNo(houseNo, kebele, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens where houseNo = &#63; and kebele = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByhouseNo(
		java.lang.String houseNo, java.lang.String kebele, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByhouseNo(houseNo, kebele, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByhouseNo_First(
		java.lang.String houseNo, java.lang.String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByhouseNo_First(houseNo, kebele, orderByComparator);
	}

	/**
	* Returns the first registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByhouseNo_First(
		java.lang.String houseNo, java.lang.String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByhouseNo_First(houseNo, kebele, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByhouseNo_Last(
		java.lang.String houseNo, java.lang.String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByhouseNo_Last(houseNo, kebele, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByhouseNo_Last(
		java.lang.String houseNo, java.lang.String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByhouseNo_Last(houseNo, kebele, orderByComparator);
	}

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param houseNo the house no
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen[] findByhouseNo_PrevAndNext(long id,
		java.lang.String houseNo, java.lang.String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByhouseNo_PrevAndNext(id, houseNo, kebele,
			orderByComparator);
	}

	/**
	* Removes all the registration citizens where houseNo = &#63; and kebele = &#63; from the database.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	*/
	public static void removeByhouseNo(java.lang.String houseNo,
		java.lang.String kebele) {
		getPersistence().removeByhouseNo(houseNo, kebele);
	}

	/**
	* Returns the number of registration citizens where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @return the number of matching registration citizens
	*/
	public static int countByhouseNo(java.lang.String houseNo,
		java.lang.String kebele) {
		return getPersistence().countByhouseNo(houseNo, kebele);
	}

	/**
	* Returns all the registration citizens where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @return the matching registration citizens
	*/
	public static List<RegistrationCitizen> findByreport(Date issueDate,
		java.lang.String kebele) {
		return getPersistence().findByreport(issueDate, kebele);
	}

	/**
	* Returns a range of all the registration citizens where issueDate = &#63; and kebele = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByreport(Date issueDate,
		java.lang.String kebele, int start, int end) {
		return getPersistence().findByreport(issueDate, kebele, start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByreport(Date issueDate,
		java.lang.String kebele, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .findByreport(issueDate, kebele, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByreport(Date issueDate,
		java.lang.String kebele, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByreport(issueDate, kebele, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByreport_First(Date issueDate,
		java.lang.String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByreport_First(issueDate, kebele, orderByComparator);
	}

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByreport_First(Date issueDate,
		java.lang.String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByreport_First(issueDate, kebele, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByreport_Last(Date issueDate,
		java.lang.String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByreport_Last(issueDate, kebele, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByreport_Last(Date issueDate,
		java.lang.String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByreport_Last(issueDate, kebele, orderByComparator);
	}

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen[] findByreport_PrevAndNext(long id,
		Date issueDate, java.lang.String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByreport_PrevAndNext(id, issueDate, kebele,
			orderByComparator);
	}

	/**
	* Removes all the registration citizens where issueDate = &#63; and kebele = &#63; from the database.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	*/
	public static void removeByreport(Date issueDate, java.lang.String kebele) {
		getPersistence().removeByreport(issueDate, kebele);
	}

	/**
	* Returns the number of registration citizens where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @return the number of matching registration citizens
	*/
	public static int countByreport(Date issueDate, java.lang.String kebele) {
		return getPersistence().countByreport(issueDate, kebele);
	}

	/**
	* Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @return the matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, java.lang.String kebele, int status) {
		return getPersistence()
				   .findByissue_kebele_stat_report(issueDate, kebele, status);
	}

	/**
	* Returns a range of all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, java.lang.String kebele, int status, int start, int end) {
		return getPersistence()
				   .findByissue_kebele_stat_report(issueDate, kebele, status,
			start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, java.lang.String kebele, int status, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .findByissue_kebele_stat_report(issueDate, kebele, status,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, java.lang.String kebele, int status, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissue_kebele_stat_report(issueDate, kebele, status,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByissue_kebele_stat_report_First(
		Date issueDate, java.lang.String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_stat_report_First(issueDate, kebele,
			status, orderByComparator);
	}

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByissue_kebele_stat_report_First(
		Date issueDate, java.lang.String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByissue_kebele_stat_report_First(issueDate, kebele,
			status, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByissue_kebele_stat_report_Last(
		Date issueDate, java.lang.String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_stat_report_Last(issueDate, kebele,
			status, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByissue_kebele_stat_report_Last(
		Date issueDate, java.lang.String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByissue_kebele_stat_report_Last(issueDate, kebele,
			status, orderByComparator);
	}

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen[] findByissue_kebele_stat_report_PrevAndNext(
		long id, Date issueDate, java.lang.String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_stat_report_PrevAndNext(id, issueDate,
			kebele, status, orderByComparator);
	}

	/**
	* Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63; from the database.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	*/
	public static void removeByissue_kebele_stat_report(Date issueDate,
		java.lang.String kebele, int status) {
		getPersistence()
			.removeByissue_kebele_stat_report(issueDate, kebele, status);
	}

	/**
	* Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @return the number of matching registration citizens
	*/
	public static int countByissue_kebele_stat_report(Date issueDate,
		java.lang.String kebele, int status) {
		return getPersistence()
				   .countByissue_kebele_stat_report(issueDate, kebele, status);
	}

	/**
	* Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @return the matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status) {
		return getPersistence()
				   .findByissue_kebele_sex_stat_report(issueDate, kebele, sex,
			status);
	}

	/**
	* Returns a range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, int start, int end) {
		return getPersistence()
				   .findByissue_kebele_sex_stat_report(issueDate, kebele, sex,
			status, start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .findByissue_kebele_sex_stat_report(issueDate, kebele, sex,
			status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissue_kebele_sex_stat_report(issueDate, kebele, sex,
			status, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByissue_kebele_sex_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_sex_stat_report_First(issueDate, kebele,
			sex, status, orderByComparator);
	}

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByissue_kebele_sex_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByissue_kebele_sex_stat_report_First(issueDate,
			kebele, sex, status, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByissue_kebele_sex_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_sex_stat_report_Last(issueDate, kebele,
			sex, status, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByissue_kebele_sex_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByissue_kebele_sex_stat_report_Last(issueDate, kebele,
			sex, status, orderByComparator);
	}

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen[] findByissue_kebele_sex_stat_report_PrevAndNext(
		long id, Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_sex_stat_report_PrevAndNext(id,
			issueDate, kebele, sex, status, orderByComparator);
	}

	/**
	* Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63; from the database.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	*/
	public static void removeByissue_kebele_sex_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String sex, int status) {
		getPersistence()
			.removeByissue_kebele_sex_stat_report(issueDate, kebele, sex, status);
	}

	/**
	* Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @return the number of matching registration citizens
	*/
	public static int countByissue_kebele_sex_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String sex, int status) {
		return getPersistence()
				   .countByissue_kebele_sex_stat_report(issueDate, kebele, sex,
			status);
	}

	/**
	* Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @return the matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status) {
		return getPersistence()
				   .findByissue_kebele_occ_stat_report(issueDate, kebele,
			occupation, status);
	}

	/**
	* Returns a range of all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status, int start, int end) {
		return getPersistence()
				   .findByissue_kebele_occ_stat_report(issueDate, kebele,
			occupation, status, start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .findByissue_kebele_occ_stat_report(issueDate, kebele,
			occupation, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissue_kebele_occ_stat_report(issueDate, kebele,
			occupation, status, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByissue_kebele_occ_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_occ_stat_report_First(issueDate, kebele,
			occupation, status, orderByComparator);
	}

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByissue_kebele_occ_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByissue_kebele_occ_stat_report_First(issueDate,
			kebele, occupation, status, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByissue_kebele_occ_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_occ_stat_report_Last(issueDate, kebele,
			occupation, status, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByissue_kebele_occ_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByissue_kebele_occ_stat_report_Last(issueDate, kebele,
			occupation, status, orderByComparator);
	}

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen[] findByissue_kebele_occ_stat_report_PrevAndNext(
		long id, Date issueDate, java.lang.String kebele,
		java.lang.String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_occ_stat_report_PrevAndNext(id,
			issueDate, kebele, occupation, status, orderByComparator);
	}

	/**
	* Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63; from the database.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	*/
	public static void removeByissue_kebele_occ_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String occupation, int status) {
		getPersistence()
			.removeByissue_kebele_occ_stat_report(issueDate, kebele,
			occupation, status);
	}

	/**
	* Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @return the number of matching registration citizens
	*/
	public static int countByissue_kebele_occ_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String occupation, int status) {
		return getPersistence()
				   .countByissue_kebele_occ_stat_report(issueDate, kebele,
			occupation, status);
	}

	/**
	* Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	* @return the matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status) {
		return getPersistence()
				   .findByissue_kebele_sex_occ_stat_report(issueDate, kebele,
			sex, occupation, status);
	}

	/**
	* Returns a range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status, int start, int end) {
		return getPersistence()
				   .findByissue_kebele_sex_occ_stat_report(issueDate, kebele,
			sex, occupation, status, start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .findByissue_kebele_sex_occ_stat_report(issueDate, kebele,
			sex, occupation, status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching registration citizens
	*/
	public static List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByissue_kebele_sex_occ_stat_report(issueDate, kebele,
			sex, occupation, status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByissue_kebele_sex_occ_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_sex_occ_stat_report_First(issueDate,
			kebele, sex, occupation, status, orderByComparator);
	}

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByissue_kebele_sex_occ_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByissue_kebele_sex_occ_stat_report_First(issueDate,
			kebele, sex, occupation, status, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen findByissue_kebele_sex_occ_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_sex_occ_stat_report_Last(issueDate,
			kebele, sex, occupation, status, orderByComparator);
	}

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public static RegistrationCitizen fetchByissue_kebele_sex_occ_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence()
				   .fetchByissue_kebele_sex_occ_stat_report_Last(issueDate,
			kebele, sex, occupation, status, orderByComparator);
	}

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen[] findByissue_kebele_sex_occ_stat_report_PrevAndNext(
		long id, Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence()
				   .findByissue_kebele_sex_occ_stat_report_PrevAndNext(id,
			issueDate, kebele, sex, occupation, status, orderByComparator);
	}

	/**
	* Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63; from the database.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	*/
	public static void removeByissue_kebele_sex_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status) {
		getPersistence()
			.removeByissue_kebele_sex_occ_stat_report(issueDate, kebele, sex,
			occupation, status);
	}

	/**
	* Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	* @return the number of matching registration citizens
	*/
	public static int countByissue_kebele_sex_occ_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status) {
		return getPersistence()
				   .countByissue_kebele_sex_occ_stat_report(issueDate, kebele,
			sex, occupation, status);
	}

	/**
	* Caches the registration citizen in the entity cache if it is enabled.
	*
	* @param registrationCitizen the registration citizen
	*/
	public static void cacheResult(RegistrationCitizen registrationCitizen) {
		getPersistence().cacheResult(registrationCitizen);
	}

	/**
	* Caches the registration citizens in the entity cache if it is enabled.
	*
	* @param registrationCitizens the registration citizens
	*/
	public static void cacheResult(
		List<RegistrationCitizen> registrationCitizens) {
		getPersistence().cacheResult(registrationCitizens);
	}

	/**
	* Creates a new registration citizen with the primary key. Does not add the registration citizen to the database.
	*
	* @param id the primary key for the new registration citizen
	* @return the new registration citizen
	*/
	public static RegistrationCitizen create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the registration citizen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen that was removed
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen remove(long id)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence().remove(id);
	}

	public static RegistrationCitizen updateImpl(
		RegistrationCitizen registrationCitizen) {
		return getPersistence().updateImpl(registrationCitizen);
	}

	/**
	* Returns the registration citizen with the primary key or throws a {@link NoSuchRegistrationCitizenException} if it could not be found.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen findByPrimaryKey(long id)
		throws IdentificationDatabase.exception.NoSuchRegistrationCitizenException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the registration citizen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen, or <code>null</code> if a registration citizen with the primary key could not be found
	*/
	public static RegistrationCitizen fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, RegistrationCitizen> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the registration citizens.
	*
	* @return the registration citizens
	*/
	public static List<RegistrationCitizen> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the registration citizens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of registration citizens
	*/
	public static List<RegistrationCitizen> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the registration citizens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of registration citizens
	*/
	public static List<RegistrationCitizen> findAll(int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the registration citizens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of registration citizens
	*/
	public static List<RegistrationCitizen> findAll(int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the registration citizens from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of registration citizens.
	*
	* @return the number of registration citizens
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static RegistrationCitizenPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RegistrationCitizenPersistence, RegistrationCitizenPersistence> _serviceTracker =
		ServiceTrackerFactory.open(RegistrationCitizenPersistence.class);
}