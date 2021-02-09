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

import IdentificationDatabase.exception.NoSuchServicesException;

import IdentificationDatabase.model.Services;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.persistence.impl.ServicesPersistenceImpl
 * @see ServicesUtil
 * @generated
 */
@ProviderType
public interface ServicesPersistence extends BasePersistence<Services> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ServicesUtil} to access the services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the serviceses where status = &#63;.
	*
	* @param status the status
	* @return the matching serviceses
	*/
	public java.util.List<Services> findBystatus(int status);

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
	public java.util.List<Services> findBystatus(int status, int start, int end);

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
	public java.util.List<Services> findBystatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator);

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
	public java.util.List<Services> findBystatus(int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first services in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services
	* @throws NoSuchServicesException if a matching services could not be found
	*/
	public Services findBystatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException;

	/**
	* Returns the first services in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services, or <code>null</code> if a matching services could not be found
	*/
	public Services fetchBystatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator);

	/**
	* Returns the last services in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services
	* @throws NoSuchServicesException if a matching services could not be found
	*/
	public Services findBystatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException;

	/**
	* Returns the last services in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services, or <code>null</code> if a matching services could not be found
	*/
	public Services fetchBystatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator);

	/**
	* Returns the serviceses before and after the current services in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current services
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next services
	* @throws NoSuchServicesException if a services with the primary key could not be found
	*/
	public Services[] findBystatus_PrevAndNext(long id, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException;

	/**
	* Removes all the serviceses where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeBystatus(int status);

	/**
	* Returns the number of serviceses where status = &#63;.
	*
	* @param status the status
	* @return the number of matching serviceses
	*/
	public int countBystatus(int status);

	/**
	* Returns all the serviceses where service = &#63;.
	*
	* @param service the service
	* @return the matching serviceses
	*/
	public java.util.List<Services> findByservice(java.lang.String service);

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
	public java.util.List<Services> findByservice(java.lang.String service,
		int start, int end);

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
	public java.util.List<Services> findByservice(java.lang.String service,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator);

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
	public java.util.List<Services> findByservice(java.lang.String service,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first services in the ordered set where service = &#63;.
	*
	* @param service the service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services
	* @throws NoSuchServicesException if a matching services could not be found
	*/
	public Services findByservice_First(java.lang.String service,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException;

	/**
	* Returns the first services in the ordered set where service = &#63;.
	*
	* @param service the service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching services, or <code>null</code> if a matching services could not be found
	*/
	public Services fetchByservice_First(java.lang.String service,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator);

	/**
	* Returns the last services in the ordered set where service = &#63;.
	*
	* @param service the service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services
	* @throws NoSuchServicesException if a matching services could not be found
	*/
	public Services findByservice_Last(java.lang.String service,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException;

	/**
	* Returns the last services in the ordered set where service = &#63;.
	*
	* @param service the service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching services, or <code>null</code> if a matching services could not be found
	*/
	public Services fetchByservice_Last(java.lang.String service,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator);

	/**
	* Returns the serviceses before and after the current services in the ordered set where service = &#63;.
	*
	* @param id the primary key of the current services
	* @param service the service
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next services
	* @throws NoSuchServicesException if a services with the primary key could not be found
	*/
	public Services[] findByservice_PrevAndNext(long id,
		java.lang.String service,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException;

	/**
	* Removes all the serviceses where service = &#63; from the database.
	*
	* @param service the service
	*/
	public void removeByservice(java.lang.String service);

	/**
	* Returns the number of serviceses where service = &#63;.
	*
	* @param service the service
	* @return the number of matching serviceses
	*/
	public int countByservice(java.lang.String service);

	/**
	* Caches the services in the entity cache if it is enabled.
	*
	* @param services the services
	*/
	public void cacheResult(Services services);

	/**
	* Caches the serviceses in the entity cache if it is enabled.
	*
	* @param serviceses the serviceses
	*/
	public void cacheResult(java.util.List<Services> serviceses);

	/**
	* Creates a new services with the primary key. Does not add the services to the database.
	*
	* @param id the primary key for the new services
	* @return the new services
	*/
	public Services create(long id);

	/**
	* Removes the services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the services
	* @return the services that was removed
	* @throws NoSuchServicesException if a services with the primary key could not be found
	*/
	public Services remove(long id) throws NoSuchServicesException;

	public Services updateImpl(Services services);

	/**
	* Returns the services with the primary key or throws a {@link NoSuchServicesException} if it could not be found.
	*
	* @param id the primary key of the services
	* @return the services
	* @throws NoSuchServicesException if a services with the primary key could not be found
	*/
	public Services findByPrimaryKey(long id) throws NoSuchServicesException;

	/**
	* Returns the services with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the services
	* @return the services, or <code>null</code> if a services with the primary key could not be found
	*/
	public Services fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, Services> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the serviceses.
	*
	* @return the serviceses
	*/
	public java.util.List<Services> findAll();

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
	public java.util.List<Services> findAll(int start, int end);

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
	public java.util.List<Services> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator);

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
	public java.util.List<Services> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Services> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the serviceses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of serviceses.
	*
	* @return the number of serviceses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}