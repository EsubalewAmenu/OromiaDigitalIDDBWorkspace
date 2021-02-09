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

import IdentificationDatabase.exception.NoSuchRegistrationCitizenException;

import IdentificationDatabase.model.RegistrationCitizen;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Date;

/**
 * The persistence interface for the registration citizen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.persistence.impl.RegistrationCitizenPersistenceImpl
 * @see RegistrationCitizenUtil
 * @generated
 */
@ProviderType
public interface RegistrationCitizenPersistence extends BasePersistence<RegistrationCitizen> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegistrationCitizenUtil} to access the registration citizen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the registration citizens where status = &#63;.
	*
	* @param status the status
	* @return the matching registration citizens
	*/
	public java.util.List<RegistrationCitizen> findBystatus(int status);

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
	public java.util.List<RegistrationCitizen> findBystatus(int status,
		int start, int end);

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
	public java.util.List<RegistrationCitizen> findBystatus(int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findBystatus(int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first registration citizen in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findBystatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the first registration citizen in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchBystatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

	/**
	* Returns the last registration citizen in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findBystatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the last registration citizen in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchBystatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public RegistrationCitizen[] findBystatus_PrevAndNext(long id, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Removes all the registration citizens where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeBystatus(int status);

	/**
	* Returns the number of registration citizens where status = &#63;.
	*
	* @param status the status
	* @return the number of matching registration citizens
	*/
	public int countBystatus(int status);

	/**
	* Returns all the registration citizens where code = &#63;.
	*
	* @param code the code
	* @return the matching registration citizens
	*/
	public java.util.List<RegistrationCitizen> findBycode(java.lang.String code);

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
	public java.util.List<RegistrationCitizen> findBycode(
		java.lang.String code, int start, int end);

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
	public java.util.List<RegistrationCitizen> findBycode(
		java.lang.String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findBycode(
		java.lang.String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first registration citizen in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findBycode_First(java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the first registration citizen in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchBycode_First(java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

	/**
	* Returns the last registration citizen in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findBycode_Last(java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the last registration citizen in the ordered set where code = &#63;.
	*
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchBycode_Last(java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where code = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param code the code
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public RegistrationCitizen[] findBycode_PrevAndNext(long id,
		java.lang.String code,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Removes all the registration citizens where code = &#63; from the database.
	*
	* @param code the code
	*/
	public void removeBycode(java.lang.String code);

	/**
	* Returns the number of registration citizens where code = &#63;.
	*
	* @param code the code
	* @return the number of matching registration citizens
	*/
	public int countBycode(java.lang.String code);

	/**
	* Returns all the registration citizens where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @return the matching registration citizens
	*/
	public java.util.List<RegistrationCitizen> findByreciptNo(
		java.lang.String reciptNo);

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
	public java.util.List<RegistrationCitizen> findByreciptNo(
		java.lang.String reciptNo, int start, int end);

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
	public java.util.List<RegistrationCitizen> findByreciptNo(
		java.lang.String reciptNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findByreciptNo(
		java.lang.String reciptNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first registration citizen in the ordered set where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findByreciptNo_First(java.lang.String reciptNo,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the first registration citizen in the ordered set where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchByreciptNo_First(
		java.lang.String reciptNo,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

	/**
	* Returns the last registration citizen in the ordered set where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findByreciptNo_Last(java.lang.String reciptNo,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the last registration citizen in the ordered set where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchByreciptNo_Last(java.lang.String reciptNo,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

	/**
	* Returns the registration citizens before and after the current registration citizen in the ordered set where reciptNo = &#63;.
	*
	* @param id the primary key of the current registration citizen
	* @param reciptNo the recipt no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public RegistrationCitizen[] findByreciptNo_PrevAndNext(long id,
		java.lang.String reciptNo,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Removes all the registration citizens where reciptNo = &#63; from the database.
	*
	* @param reciptNo the recipt no
	*/
	public void removeByreciptNo(java.lang.String reciptNo);

	/**
	* Returns the number of registration citizens where reciptNo = &#63;.
	*
	* @param reciptNo the recipt no
	* @return the number of matching registration citizens
	*/
	public int countByreciptNo(java.lang.String reciptNo);

	/**
	* Returns all the registration citizens where id = &#63;.
	*
	* @param id the ID
	* @return the matching registration citizens
	*/
	public java.util.List<RegistrationCitizen> findByid(long id);

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
	public java.util.List<RegistrationCitizen> findByid(long id, int start,
		int end);

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
	public java.util.List<RegistrationCitizen> findByid(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findByid(long id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first registration citizen in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the first registration citizen in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

	/**
	* Returns the last registration citizen in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the last registration citizen in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

	/**
	* Removes all the registration citizens where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByid(long id);

	/**
	* Returns the number of registration citizens where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching registration citizens
	*/
	public int countByid(long id);

	/**
	* Returns all the registration citizens where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @return the matching registration citizens
	*/
	public java.util.List<RegistrationCitizen> findByhouseNo(
		java.lang.String houseNo, java.lang.String kebele);

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
	public java.util.List<RegistrationCitizen> findByhouseNo(
		java.lang.String houseNo, java.lang.String kebele, int start, int end);

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
	public java.util.List<RegistrationCitizen> findByhouseNo(
		java.lang.String houseNo, java.lang.String kebele, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findByhouseNo(
		java.lang.String houseNo, java.lang.String kebele, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findByhouseNo_First(java.lang.String houseNo,
		java.lang.String kebele,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the first registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchByhouseNo_First(java.lang.String houseNo,
		java.lang.String kebele,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

	/**
	* Returns the last registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findByhouseNo_Last(java.lang.String houseNo,
		java.lang.String kebele,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the last registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchByhouseNo_Last(java.lang.String houseNo,
		java.lang.String kebele,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public RegistrationCitizen[] findByhouseNo_PrevAndNext(long id,
		java.lang.String houseNo, java.lang.String kebele,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Removes all the registration citizens where houseNo = &#63; and kebele = &#63; from the database.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	*/
	public void removeByhouseNo(java.lang.String houseNo,
		java.lang.String kebele);

	/**
	* Returns the number of registration citizens where houseNo = &#63; and kebele = &#63;.
	*
	* @param houseNo the house no
	* @param kebele the kebele
	* @return the number of matching registration citizens
	*/
	public int countByhouseNo(java.lang.String houseNo, java.lang.String kebele);

	/**
	* Returns all the registration citizens where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @return the matching registration citizens
	*/
	public java.util.List<RegistrationCitizen> findByreport(Date issueDate,
		java.lang.String kebele);

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
	public java.util.List<RegistrationCitizen> findByreport(Date issueDate,
		java.lang.String kebele, int start, int end);

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
	public java.util.List<RegistrationCitizen> findByreport(Date issueDate,
		java.lang.String kebele, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findByreport(Date issueDate,
		java.lang.String kebele, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findByreport_First(Date issueDate,
		java.lang.String kebele,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchByreport_First(Date issueDate,
		java.lang.String kebele,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen
	* @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	*/
	public RegistrationCitizen findByreport_Last(Date issueDate,
		java.lang.String kebele,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchByreport_Last(Date issueDate,
		java.lang.String kebele,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public RegistrationCitizen[] findByreport_PrevAndNext(long id,
		Date issueDate, java.lang.String kebele,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Removes all the registration citizens where issueDate = &#63; and kebele = &#63; from the database.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	*/
	public void removeByreport(Date issueDate, java.lang.String kebele);

	/**
	* Returns the number of registration citizens where issueDate = &#63; and kebele = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @return the number of matching registration citizens
	*/
	public int countByreport(Date issueDate, java.lang.String kebele);

	/**
	* Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @return the matching registration citizens
	*/
	public java.util.List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, java.lang.String kebele, int status);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, java.lang.String kebele, int status, int start, int end);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, java.lang.String kebele, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, java.lang.String kebele, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

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
	public RegistrationCitizen findByissue_kebele_stat_report_First(
		Date issueDate, java.lang.String kebele, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchByissue_kebele_stat_report_First(
		Date issueDate, java.lang.String kebele, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public RegistrationCitizen findByissue_kebele_stat_report_Last(
		Date issueDate, java.lang.String kebele, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	*/
	public RegistrationCitizen fetchByissue_kebele_stat_report_Last(
		Date issueDate, java.lang.String kebele, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public RegistrationCitizen[] findByissue_kebele_stat_report_PrevAndNext(
		long id, Date issueDate, java.lang.String kebele, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63; from the database.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	*/
	public void removeByissue_kebele_stat_report(Date issueDate,
		java.lang.String kebele, int status);

	/**
	* Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param status the status
	* @return the number of matching registration citizens
	*/
	public int countByissue_kebele_stat_report(Date issueDate,
		java.lang.String kebele, int status);

	/**
	* Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @return the matching registration citizens
	*/
	public java.util.List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, int start, int end);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

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
	public RegistrationCitizen findByissue_kebele_sex_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

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
	public RegistrationCitizen fetchByissue_kebele_sex_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public RegistrationCitizen findByissue_kebele_sex_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

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
	public RegistrationCitizen fetchByissue_kebele_sex_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public RegistrationCitizen[] findByissue_kebele_sex_stat_report_PrevAndNext(
		long id, Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63; from the database.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	*/
	public void removeByissue_kebele_sex_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String sex, int status);

	/**
	* Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param status the status
	* @return the number of matching registration citizens
	*/
	public int countByissue_kebele_sex_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String sex, int status);

	/**
	* Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @return the matching registration citizens
	*/
	public java.util.List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status, int start, int end);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

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
	public RegistrationCitizen findByissue_kebele_occ_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

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
	public RegistrationCitizen fetchByissue_kebele_occ_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public RegistrationCitizen findByissue_kebele_occ_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

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
	public RegistrationCitizen fetchByissue_kebele_occ_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public RegistrationCitizen[] findByissue_kebele_occ_stat_report_PrevAndNext(
		long id, Date issueDate, java.lang.String kebele,
		java.lang.String occupation, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63; from the database.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	*/
	public void removeByissue_kebele_occ_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String occupation, int status);

	/**
	* Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param occupation the occupation
	* @param status the status
	* @return the number of matching registration citizens
	*/
	public int countByissue_kebele_occ_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String occupation, int status);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status, int start, int end);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

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
	public RegistrationCitizen findByissue_kebele_sex_occ_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

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
	public RegistrationCitizen fetchByissue_kebele_sex_occ_stat_report_First(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public RegistrationCitizen findByissue_kebele_sex_occ_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

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
	public RegistrationCitizen fetchByissue_kebele_sex_occ_stat_report_Last(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public RegistrationCitizen[] findByissue_kebele_sex_occ_stat_report_PrevAndNext(
		long id, Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException;

	/**
	* Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63; from the database.
	*
	* @param issueDate the issue date
	* @param kebele the kebele
	* @param sex the sex
	* @param occupation the occupation
	* @param status the status
	*/
	public void removeByissue_kebele_sex_occ_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status);

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
	public int countByissue_kebele_sex_occ_stat_report(Date issueDate,
		java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status);

	/**
	* Caches the registration citizen in the entity cache if it is enabled.
	*
	* @param registrationCitizen the registration citizen
	*/
	public void cacheResult(RegistrationCitizen registrationCitizen);

	/**
	* Caches the registration citizens in the entity cache if it is enabled.
	*
	* @param registrationCitizens the registration citizens
	*/
	public void cacheResult(
		java.util.List<RegistrationCitizen> registrationCitizens);

	/**
	* Creates a new registration citizen with the primary key. Does not add the registration citizen to the database.
	*
	* @param id the primary key for the new registration citizen
	* @return the new registration citizen
	*/
	public RegistrationCitizen create(long id);

	/**
	* Removes the registration citizen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen that was removed
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public RegistrationCitizen remove(long id)
		throws NoSuchRegistrationCitizenException;

	public RegistrationCitizen updateImpl(
		RegistrationCitizen registrationCitizen);

	/**
	* Returns the registration citizen with the primary key or throws a {@link NoSuchRegistrationCitizenException} if it could not be found.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen
	* @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	*/
	public RegistrationCitizen findByPrimaryKey(long id)
		throws NoSuchRegistrationCitizenException;

	/**
	* Returns the registration citizen with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen, or <code>null</code> if a registration citizen with the primary key could not be found
	*/
	public RegistrationCitizen fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, RegistrationCitizen> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the registration citizens.
	*
	* @return the registration citizens
	*/
	public java.util.List<RegistrationCitizen> findAll();

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
	public java.util.List<RegistrationCitizen> findAll(int start, int end);

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
	public java.util.List<RegistrationCitizen> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator);

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
	public java.util.List<RegistrationCitizen> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the registration citizens from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of registration citizens.
	*
	* @return the number of registration citizens
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}