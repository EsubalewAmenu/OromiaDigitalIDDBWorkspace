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

import IdentificationDatabase.model.Services;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the services service. This utility wraps {@link IdentificationDatabase.service.persistence.impl.ServicesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ServicesPersistence
 * @see IdentificationDatabase.service.persistence.impl.ServicesPersistenceImpl
 * @generated
 */
@ProviderType
public class ServicesUtil {
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
	public static void clearCache(Services services) {
		getPersistence().clearCache(services);
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
	public static List<Services> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Services> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Services> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Services> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Services update(Services services) {
		return getPersistence().update(services);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Services update(Services services,
		ServiceContext serviceContext) {
		return getPersistence().update(services, serviceContext);
	}

	/**
	* Returns all the serviceses where status = &#63;.
	*
	* @param status the status
	* @return the matching serviceses
	*/
	public static List<Services> findBystatus(int status) {
		return getPersistence().findBystatus(status);
	}

	/**
	* Returns a range of all the serviceses where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of matching serviceses
	*/
	public static List<Services> findBystatus(int status, int start, int end) {
		return getPersistence().findBystatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the serviceses where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching serviceses
	*/
	public static List<Services> findBystatus(int status, int start, int end,
		OrderByComparator<Services> orderByComparator) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the serviceses where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching serviceses
	*/
	public static List<Services> findBystatus(int status, int start, int end,
		OrderByComparator<Services> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findBystatus(status, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first services in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services
	* @throws NoSuchServicesException if a matching services could not be found
	*/
	public static Services findBystatus_First(int status,
		OrderByComparator<Services> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchServicesException {
		return getPersistence().findBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the first services in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services, or <code>null</code> if a matching services could not be found
	*/
	public static Services fetchBystatus_First(int status,
		OrderByComparator<Services> orderByComparator) {
		return getPersistence().fetchBystatus_First(status, orderByComparator);
	}

	/**
	* Returns the last services in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services
	* @throws NoSuchServicesException if a matching services could not be found
	*/
	public static Services findBystatus_Last(int status,
		OrderByComparator<Services> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchServicesException {
		return getPersistence().findBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the last services in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services, or <code>null</code> if a matching services could not be found
	*/
	public static Services fetchBystatus_Last(int status,
		OrderByComparator<Services> orderByComparator) {
		return getPersistence().fetchBystatus_Last(status, orderByComparator);
	}

	/**
	* Returns the serviceses before and after the current services in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current services
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next services
	* @throws NoSuchServicesException if a services with the primary key could not be found
	*/
	public static Services[] findBystatus_PrevAndNext(long id, int status,
		OrderByComparator<Services> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchServicesException {
		return getPersistence()
				   .findBystatus_PrevAndNext(id, status, orderByComparator);
	}

	/**
	* Removes all the serviceses where status = &#63; from the database.
	*
	* @param status the status
	*/
	public static void removeBystatus(int status) {
		getPersistence().removeBystatus(status);
	}

	/**
	* Returns the number of serviceses where status = &#63;.
	*
	* @param status the status
	* @return the number of matching serviceses
	*/
	public static int countBystatus(int status) {
		return getPersistence().countBystatus(status);
	}

	/**
	* Returns all the serviceses where service = &#63;.
	*
	* @param service the service
	* @return the matching serviceses
	*/
	public static List<Services> findByservice(java.lang.String service) {
		return getPersistence().findByservice(service);
	}

	/**
	* Returns a range of all the serviceses where service = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param service the service
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of matching serviceses
	*/
	public static List<Services> findByservice(java.lang.String service,
		int start, int end) {
		return getPersistence().findByservice(service, start, end);
	}

	/**
	* Returns an ordered range of all the serviceses where service = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param service the service
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching serviceses
	*/
	public static List<Services> findByservice(java.lang.String service,
		int start, int end, OrderByComparator<Services> orderByComparator) {
		return getPersistence()
				   .findByservice(service, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the serviceses where service = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param service the service
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching serviceses
	*/
	public static List<Services> findByservice(java.lang.String service,
		int start, int end, OrderByComparator<Services> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByservice(service, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first services in the ordered set where service = &#63;.
	*
	* @param service the service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services
	* @throws NoSuchServicesException if a matching services could not be found
	*/
	public static Services findByservice_First(java.lang.String service,
		OrderByComparator<Services> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchServicesException {
		return getPersistence().findByservice_First(service, orderByComparator);
	}

	/**
	* Returns the first services in the ordered set where service = &#63;.
	*
	* @param service the service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services, or <code>null</code> if a matching services could not be found
	*/
	public static Services fetchByservice_First(java.lang.String service,
		OrderByComparator<Services> orderByComparator) {
		return getPersistence().fetchByservice_First(service, orderByComparator);
	}

	/**
	* Returns the last services in the ordered set where service = &#63;.
	*
	* @param service the service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services
	* @throws NoSuchServicesException if a matching services could not be found
	*/
	public static Services findByservice_Last(java.lang.String service,
		OrderByComparator<Services> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchServicesException {
		return getPersistence().findByservice_Last(service, orderByComparator);
	}

	/**
	* Returns the last services in the ordered set where service = &#63;.
	*
	* @param service the service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services, or <code>null</code> if a matching services could not be found
	*/
	public static Services fetchByservice_Last(java.lang.String service,
		OrderByComparator<Services> orderByComparator) {
		return getPersistence().fetchByservice_Last(service, orderByComparator);
	}

	/**
	* Returns the serviceses before and after the current services in the ordered set where service = &#63;.
	*
	* @param id the primary key of the current services
	* @param service the service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next services
	* @throws NoSuchServicesException if a services with the primary key could not be found
	*/
	public static Services[] findByservice_PrevAndNext(long id,
		java.lang.String service, OrderByComparator<Services> orderByComparator)
		throws IdentificationDatabase.exception.NoSuchServicesException {
		return getPersistence()
				   .findByservice_PrevAndNext(id, service, orderByComparator);
	}

	/**
	* Removes all the serviceses where service = &#63; from the database.
	*
	* @param service the service
	*/
	public static void removeByservice(java.lang.String service) {
		getPersistence().removeByservice(service);
	}

	/**
	* Returns the number of serviceses where service = &#63;.
	*
	* @param service the service
	* @return the number of matching serviceses
	*/
	public static int countByservice(java.lang.String service) {
		return getPersistence().countByservice(service);
	}

	/**
	* Caches the services in the entity cache if it is enabled.
	*
	* @param services the services
	*/
	public static void cacheResult(Services services) {
		getPersistence().cacheResult(services);
	}

	/**
	* Caches the serviceses in the entity cache if it is enabled.
	*
	* @param serviceses the serviceses
	*/
	public static void cacheResult(List<Services> serviceses) {
		getPersistence().cacheResult(serviceses);
	}

	/**
	* Creates a new services with the primary key. Does not add the services to the database.
	*
	* @param id the primary key for the new services
	* @return the new services
	*/
	public static Services create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the services
	* @return the services that was removed
	* @throws NoSuchServicesException if a services with the primary key could not be found
	*/
	public static Services remove(long id)
		throws IdentificationDatabase.exception.NoSuchServicesException {
		return getPersistence().remove(id);
	}

	public static Services updateImpl(Services services) {
		return getPersistence().updateImpl(services);
	}

	/**
	* Returns the services with the primary key or throws a {@link NoSuchServicesException} if it could not be found.
	*
	* @param id the primary key of the services
	* @return the services
	* @throws NoSuchServicesException if a services with the primary key could not be found
	*/
	public static Services findByPrimaryKey(long id)
		throws IdentificationDatabase.exception.NoSuchServicesException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the services with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the services
	* @return the services, or <code>null</code> if a services with the primary key could not be found
	*/
	public static Services fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, Services> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the serviceses.
	*
	* @return the serviceses
	*/
	public static List<Services> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @return the range of serviceses
	*/
	public static List<Services> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of serviceses
	*/
	public static List<Services> findAll(int start, int end,
		OrderByComparator<Services> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of serviceses
	* @param end the upper bound of the range of serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of serviceses
	*/
	public static List<Services> findAll(int start, int end,
		OrderByComparator<Services> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the serviceses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of serviceses.
	*
	* @return the number of serviceses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ServicesPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ServicesPersistence, ServicesPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ServicesPersistence.class);
}