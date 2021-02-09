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

import IdentificationDatabase.model.Kebeles;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the kebeles service. This utility wraps {@link IdentificationDatabase.service.persistence.impl.KebelesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KebelesPersistence
 * @see IdentificationDatabase.service.persistence.impl.KebelesPersistenceImpl
 * @generated
 */
@ProviderType
public class KebelesUtil {
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
	public static void clearCache(Kebeles kebeles) {
		getPersistence().clearCache(kebeles);
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
	public static List<Kebeles> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Kebeles> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Kebeles> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Kebeles update(Kebeles kebeles) {
		return getPersistence().update(kebeles);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Kebeles update(Kebeles kebeles, ServiceContext serviceContext) {
		return getPersistence().update(kebeles, serviceContext);
	}

	/**
	* Returns all the kebeleses where id = &#63;.
	*
	* @param id the ID
	* @return the matching kebeleses
	*/
	public static List<Kebeles> findByid(long id) {
		return getPersistence().findByid(id);
	}

	/**
	* Returns a range of all the kebeleses where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @return the range of matching kebeleses
	*/
	public static List<Kebeles> findByid(long id, int start, int end) {
		return getPersistence().findByid(id, start, end);
	}

	/**
	* Returns an ordered range of all the kebeleses where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findByid(long id, int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence().findByid(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the kebeleses where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findByid(long id, int start, int end,
		OrderByComparator<Kebeles> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByid(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first kebeles in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findByid_First(long id,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	* Returns the first kebeles in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchByid_First(long id,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findByid_Last(long id,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchByid_Last(long id,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	* Removes all the kebeleses where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	* Returns the number of kebeleses where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching kebeleses
	*/
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	* Returns all the kebeleses where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @return the matching kebeleses
	*/
	public static List<Kebeles> findBykebeleOr(java.lang.String kebeleOr) {
		return getPersistence().findBykebeleOr(kebeleOr);
	}

	/**
	* Returns a range of all the kebeleses where kebeleOr = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kebeleOr the kebele or
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @return the range of matching kebeleses
	*/
	public static List<Kebeles> findBykebeleOr(java.lang.String kebeleOr,
		int start, int end) {
		return getPersistence().findBykebeleOr(kebeleOr, start, end);
	}

	/**
	* Returns an ordered range of all the kebeleses where kebeleOr = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kebeleOr the kebele or
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findBykebeleOr(java.lang.String kebeleOr,
		int start, int end, OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .findBykebeleOr(kebeleOr, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the kebeleses where kebeleOr = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kebeleOr the kebele or
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findBykebeleOr(java.lang.String kebeleOr,
		int start, int end, OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBykebeleOr(kebeleOr, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first kebeles in the ordered set where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findBykebeleOr_First(java.lang.String kebeleOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence().findBykebeleOr_First(kebeleOr, orderByComparator);
	}

	/**
	* Returns the first kebeles in the ordered set where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchBykebeleOr_First(java.lang.String kebeleOr,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .fetchBykebeleOr_First(kebeleOr, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findBykebeleOr_Last(java.lang.String kebeleOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence().findBykebeleOr_Last(kebeleOr, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchBykebeleOr_Last(java.lang.String kebeleOr,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence().fetchBykebeleOr_Last(kebeleOr, orderByComparator);
	}

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where kebeleOr = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param kebeleOr the kebele or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public static Kebeles[] findBykebeleOr_PrevAndNext(long id,
		java.lang.String kebeleOr, OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBykebeleOr_PrevAndNext(id, kebeleOr, orderByComparator);
	}

	/**
	* Removes all the kebeleses where kebeleOr = &#63; from the database.
	*
	* @param kebeleOr the kebele or
	*/
	public static void removeBykebeleOr(java.lang.String kebeleOr) {
		getPersistence().removeBykebeleOr(kebeleOr);
	}

	/**
	* Returns the number of kebeleses where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @return the number of matching kebeleses
	*/
	public static int countBykebeleOr(java.lang.String kebeleOr) {
		return getPersistence().countBykebeleOr(kebeleOr);
	}

	/**
	* Returns all the kebeleses where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @return the matching kebeleses
	*/
	public static List<Kebeles> findBykebeleAm(java.lang.String kebeleAm) {
		return getPersistence().findBykebeleAm(kebeleAm);
	}

	/**
	* Returns a range of all the kebeleses where kebeleAm = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kebeleAm the kebele am
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @return the range of matching kebeleses
	*/
	public static List<Kebeles> findBykebeleAm(java.lang.String kebeleAm,
		int start, int end) {
		return getPersistence().findBykebeleAm(kebeleAm, start, end);
	}

	/**
	* Returns an ordered range of all the kebeleses where kebeleAm = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kebeleAm the kebele am
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findBykebeleAm(java.lang.String kebeleAm,
		int start, int end, OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .findBykebeleAm(kebeleAm, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the kebeleses where kebeleAm = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kebeleAm the kebele am
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findBykebeleAm(java.lang.String kebeleAm,
		int start, int end, OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBykebeleAm(kebeleAm, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first kebeles in the ordered set where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findBykebeleAm_First(java.lang.String kebeleAm,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence().findBykebeleAm_First(kebeleAm, orderByComparator);
	}

	/**
	* Returns the first kebeles in the ordered set where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchBykebeleAm_First(java.lang.String kebeleAm,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .fetchBykebeleAm_First(kebeleAm, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findBykebeleAm_Last(java.lang.String kebeleAm,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence().findBykebeleAm_Last(kebeleAm, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchBykebeleAm_Last(java.lang.String kebeleAm,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence().fetchBykebeleAm_Last(kebeleAm, orderByComparator);
	}

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where kebeleAm = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param kebeleAm the kebele am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public static Kebeles[] findBykebeleAm_PrevAndNext(long id,
		java.lang.String kebeleAm, OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBykebeleAm_PrevAndNext(id, kebeleAm, orderByComparator);
	}

	/**
	* Removes all the kebeleses where kebeleAm = &#63; from the database.
	*
	* @param kebeleAm the kebele am
	*/
	public static void removeBykebeleAm(java.lang.String kebeleAm) {
		getPersistence().removeBykebeleAm(kebeleAm);
	}

	/**
	* Returns the number of kebeleses where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @return the number of matching kebeleses
	*/
	public static int countBykebeleAm(java.lang.String kebeleAm) {
		return getPersistence().countBykebeleAm(kebeleAm);
	}

	/**
	* Returns all the kebeleses where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @return the matching kebeleses
	*/
	public static List<Kebeles> findBysubcityOr(java.lang.String subcityOr) {
		return getPersistence().findBysubcityOr(subcityOr);
	}

	/**
	* Returns a range of all the kebeleses where subcityOr = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subcityOr the subcity or
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @return the range of matching kebeleses
	*/
	public static List<Kebeles> findBysubcityOr(java.lang.String subcityOr,
		int start, int end) {
		return getPersistence().findBysubcityOr(subcityOr, start, end);
	}

	/**
	* Returns an ordered range of all the kebeleses where subcityOr = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subcityOr the subcity or
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findBysubcityOr(java.lang.String subcityOr,
		int start, int end, OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .findBysubcityOr(subcityOr, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the kebeleses where subcityOr = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subcityOr the subcity or
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findBysubcityOr(java.lang.String subcityOr,
		int start, int end, OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBysubcityOr(subcityOr, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first kebeles in the ordered set where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findBysubcityOr_First(java.lang.String subcityOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBysubcityOr_First(subcityOr, orderByComparator);
	}

	/**
	* Returns the first kebeles in the ordered set where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchBysubcityOr_First(java.lang.String subcityOr,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .fetchBysubcityOr_First(subcityOr, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findBysubcityOr_Last(java.lang.String subcityOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBysubcityOr_Last(subcityOr, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchBysubcityOr_Last(java.lang.String subcityOr,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .fetchBysubcityOr_Last(subcityOr, orderByComparator);
	}

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where subcityOr = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public static Kebeles[] findBysubcityOr_PrevAndNext(long id,
		java.lang.String subcityOr, OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBysubcityOr_PrevAndNext(id, subcityOr, orderByComparator);
	}

	/**
	* Removes all the kebeleses where subcityOr = &#63; from the database.
	*
	* @param subcityOr the subcity or
	*/
	public static void removeBysubcityOr(java.lang.String subcityOr) {
		getPersistence().removeBysubcityOr(subcityOr);
	}

	/**
	* Returns the number of kebeleses where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @return the number of matching kebeleses
	*/
	public static int countBysubcityOr(java.lang.String subcityOr) {
		return getPersistence().countBysubcityOr(subcityOr);
	}

	/**
	* Returns all the kebeleses where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @return the matching kebeleses
	*/
	public static List<Kebeles> findBysubcityAm(java.lang.String subcityAm) {
		return getPersistence().findBysubcityAm(subcityAm);
	}

	/**
	* Returns a range of all the kebeleses where subcityAm = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subcityAm the subcity am
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @return the range of matching kebeleses
	*/
	public static List<Kebeles> findBysubcityAm(java.lang.String subcityAm,
		int start, int end) {
		return getPersistence().findBysubcityAm(subcityAm, start, end);
	}

	/**
	* Returns an ordered range of all the kebeleses where subcityAm = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subcityAm the subcity am
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findBysubcityAm(java.lang.String subcityAm,
		int start, int end, OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .findBysubcityAm(subcityAm, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the kebeleses where subcityAm = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param subcityAm the subcity am
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findBysubcityAm(java.lang.String subcityAm,
		int start, int end, OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBysubcityAm(subcityAm, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first kebeles in the ordered set where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findBysubcityAm_First(java.lang.String subcityAm,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBysubcityAm_First(subcityAm, orderByComparator);
	}

	/**
	* Returns the first kebeles in the ordered set where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchBysubcityAm_First(java.lang.String subcityAm,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .fetchBysubcityAm_First(subcityAm, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findBysubcityAm_Last(java.lang.String subcityAm,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBysubcityAm_Last(subcityAm, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchBysubcityAm_Last(java.lang.String subcityAm,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .fetchBysubcityAm_Last(subcityAm, orderByComparator);
	}

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where subcityAm = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param subcityAm the subcity am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public static Kebeles[] findBysubcityAm_PrevAndNext(long id,
		java.lang.String subcityAm, OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBysubcityAm_PrevAndNext(id, subcityAm, orderByComparator);
	}

	/**
	* Removes all the kebeleses where subcityAm = &#63; from the database.
	*
	* @param subcityAm the subcity am
	*/
	public static void removeBysubcityAm(java.lang.String subcityAm) {
		getPersistence().removeBysubcityAm(subcityAm);
	}

	/**
	* Returns the number of kebeleses where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @return the number of matching kebeleses
	*/
	public static int countBysubcityAm(java.lang.String subcityAm) {
		return getPersistence().countBysubcityAm(subcityAm);
	}

	/**
	* Returns all the kebeleses where printername = &#63;.
	*
	* @param printername the printername
	* @return the matching kebeleses
	*/
	public static List<Kebeles> findByprintername(java.lang.String printername) {
		return getPersistence().findByprintername(printername);
	}

	/**
	* Returns a range of all the kebeleses where printername = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param printername the printername
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @return the range of matching kebeleses
	*/
	public static List<Kebeles> findByprintername(
		java.lang.String printername, int start, int end) {
		return getPersistence().findByprintername(printername, start, end);
	}

	/**
	* Returns an ordered range of all the kebeleses where printername = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param printername the printername
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findByprintername(
		java.lang.String printername, int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .findByprintername(printername, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the kebeleses where printername = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param printername the printername
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findByprintername(
		java.lang.String printername, int start, int end,
		OrderByComparator<Kebeles> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByprintername(printername, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first kebeles in the ordered set where printername = &#63;.
	*
	* @param printername the printername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findByprintername_First(
		java.lang.String printername,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findByprintername_First(printername, orderByComparator);
	}

	/**
	* Returns the first kebeles in the ordered set where printername = &#63;.
	*
	* @param printername the printername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchByprintername_First(
		java.lang.String printername,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .fetchByprintername_First(printername, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where printername = &#63;.
	*
	* @param printername the printername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findByprintername_Last(java.lang.String printername,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findByprintername_Last(printername, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where printername = &#63;.
	*
	* @param printername the printername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchByprintername_Last(
		java.lang.String printername,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .fetchByprintername_Last(printername, orderByComparator);
	}

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where printername = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param printername the printername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public static Kebeles[] findByprintername_PrevAndNext(long id,
		java.lang.String printername,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findByprintername_PrevAndNext(id, printername,
			orderByComparator);
	}

	/**
	* Removes all the kebeleses where printername = &#63; from the database.
	*
	* @param printername the printername
	*/
	public static void removeByprintername(java.lang.String printername) {
		getPersistence().removeByprintername(printername);
	}

	/**
	* Returns the number of kebeleses where printername = &#63;.
	*
	* @param printername the printername
	* @return the number of matching kebeleses
	*/
	public static int countByprintername(java.lang.String printername) {
		return getPersistence().countByprintername(printername);
	}

	/**
	* Returns all the kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @return the matching kebeleses
	*/
	public static List<Kebeles> findBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr) {
		return getPersistence().findBykebsubcity(kebeleOr, subcityOr);
	}

	/**
	* Returns a range of all the kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @return the range of matching kebeleses
	*/
	public static List<Kebeles> findBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr, int start, int end) {
		return getPersistence().findBykebsubcity(kebeleOr, subcityOr, start, end);
	}

	/**
	* Returns an ordered range of all the kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr, int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .findBykebsubcity(kebeleOr, subcityOr, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kebeleses
	*/
	public static List<Kebeles> findBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr, int start, int end,
		OrderByComparator<Kebeles> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBykebsubcity(kebeleOr, subcityOr, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findBykebsubcity_First(java.lang.String kebeleOr,
		java.lang.String subcityOr, OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBykebsubcity_First(kebeleOr, subcityOr,
			orderByComparator);
	}

	/**
	* Returns the first kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchBykebsubcity_First(java.lang.String kebeleOr,
		java.lang.String subcityOr, OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .fetchBykebsubcity_First(kebeleOr, subcityOr,
			orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public static Kebeles findBykebsubcity_Last(java.lang.String kebeleOr,
		java.lang.String subcityOr, OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBykebsubcity_Last(kebeleOr, subcityOr, orderByComparator);
	}

	/**
	* Returns the last kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public static Kebeles fetchBykebsubcity_Last(java.lang.String kebeleOr,
		java.lang.String subcityOr, OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence()
				   .fetchBykebsubcity_Last(kebeleOr, subcityOr,
			orderByComparator);
	}

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public static Kebeles[] findBykebsubcity_PrevAndNext(long id,
		java.lang.String kebeleOr, java.lang.String subcityOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence()
				   .findBykebsubcity_PrevAndNext(id, kebeleOr, subcityOr,
			orderByComparator);
	}

	/**
	* Removes all the kebeleses where kebeleOr = &#63; and subcityOr = &#63; from the database.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	*/
	public static void removeBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr) {
		getPersistence().removeBykebsubcity(kebeleOr, subcityOr);
	}

	/**
	* Returns the number of kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @return the number of matching kebeleses
	*/
	public static int countBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr) {
		return getPersistence().countBykebsubcity(kebeleOr, subcityOr);
	}

	/**
	* Caches the kebeles in the entity cache if it is enabled.
	*
	* @param kebeles the kebeles
	*/
	public static void cacheResult(Kebeles kebeles) {
		getPersistence().cacheResult(kebeles);
	}

	/**
	* Caches the kebeleses in the entity cache if it is enabled.
	*
	* @param kebeleses the kebeleses
	*/
	public static void cacheResult(List<Kebeles> kebeleses) {
		getPersistence().cacheResult(kebeleses);
	}

	/**
	* Creates a new kebeles with the primary key. Does not add the kebeles to the database.
	*
	* @param id the primary key for the new kebeles
	* @return the new kebeles
	*/
	public static Kebeles create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the kebeles with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kebeles
	* @return the kebeles that was removed
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public static Kebeles remove(long id)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence().remove(id);
	}

	public static Kebeles updateImpl(Kebeles kebeles) {
		return getPersistence().updateImpl(kebeles);
	}

	/**
	* Returns the kebeles with the primary key or throws a {@link NoSuchKebelesException} if it could not be found.
	*
	* @param id the primary key of the kebeles
	* @return the kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public static Kebeles findByPrimaryKey(long id)
		throws IdentificationDatabase.exception.NoSuchKebelesException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the kebeles with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the kebeles
	* @return the kebeles, or <code>null</code> if a kebeles with the primary key could not be found
	*/
	public static Kebeles fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, Kebeles> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the kebeleses.
	*
	* @return the kebeleses
	*/
	public static List<Kebeles> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the kebeleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @return the range of kebeleses
	*/
	public static List<Kebeles> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the kebeleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kebeleses
	*/
	public static List<Kebeles> findAll(int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the kebeleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of kebeleses
	*/
	public static List<Kebeles> findAll(int start, int end,
		OrderByComparator<Kebeles> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the kebeleses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of kebeleses.
	*
	* @return the number of kebeleses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static KebelesPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<KebelesPersistence, KebelesPersistence> _serviceTracker =
		ServiceTrackerFactory.open(KebelesPersistence.class);
}