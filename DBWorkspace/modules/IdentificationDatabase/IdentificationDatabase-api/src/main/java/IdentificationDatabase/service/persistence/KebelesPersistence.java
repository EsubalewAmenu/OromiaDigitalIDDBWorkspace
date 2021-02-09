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

import IdentificationDatabase.exception.NoSuchKebelesException;

import IdentificationDatabase.model.Kebeles;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the kebeles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.persistence.impl.KebelesPersistenceImpl
 * @see KebelesUtil
 * @generated
 */
@ProviderType
public interface KebelesPersistence extends BasePersistence<Kebeles> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KebelesUtil} to access the kebeles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the kebeleses where id = &#63;.
	*
	* @param id the ID
	* @return the matching kebeleses
	*/
	public java.util.List<Kebeles> findByid(long id);

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
	public java.util.List<Kebeles> findByid(long id, int start, int end);

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
	public java.util.List<Kebeles> findByid(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

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
	public java.util.List<Kebeles> findByid(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kebeles in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the first kebeles in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the last kebeles in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the last kebeles in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Removes all the kebeleses where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByid(long id);

	/**
	* Returns the number of kebeleses where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching kebeleses
	*/
	public int countByid(long id);

	/**
	* Returns all the kebeleses where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @return the matching kebeleses
	*/
	public java.util.List<Kebeles> findBykebeleOr(java.lang.String kebeleOr);

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
	public java.util.List<Kebeles> findBykebeleOr(java.lang.String kebeleOr,
		int start, int end);

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
	public java.util.List<Kebeles> findBykebeleOr(java.lang.String kebeleOr,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

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
	public java.util.List<Kebeles> findBykebeleOr(java.lang.String kebeleOr,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kebeles in the ordered set where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findBykebeleOr_First(java.lang.String kebeleOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the first kebeles in the ordered set where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchBykebeleOr_First(java.lang.String kebeleOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the last kebeles in the ordered set where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findBykebeleOr_Last(java.lang.String kebeleOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the last kebeles in the ordered set where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchBykebeleOr_Last(java.lang.String kebeleOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where kebeleOr = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param kebeleOr the kebele or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public Kebeles[] findBykebeleOr_PrevAndNext(long id,
		java.lang.String kebeleOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Removes all the kebeleses where kebeleOr = &#63; from the database.
	*
	* @param kebeleOr the kebele or
	*/
	public void removeBykebeleOr(java.lang.String kebeleOr);

	/**
	* Returns the number of kebeleses where kebeleOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @return the number of matching kebeleses
	*/
	public int countBykebeleOr(java.lang.String kebeleOr);

	/**
	* Returns all the kebeleses where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @return the matching kebeleses
	*/
	public java.util.List<Kebeles> findBykebeleAm(java.lang.String kebeleAm);

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
	public java.util.List<Kebeles> findBykebeleAm(java.lang.String kebeleAm,
		int start, int end);

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
	public java.util.List<Kebeles> findBykebeleAm(java.lang.String kebeleAm,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

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
	public java.util.List<Kebeles> findBykebeleAm(java.lang.String kebeleAm,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kebeles in the ordered set where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findBykebeleAm_First(java.lang.String kebeleAm,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the first kebeles in the ordered set where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchBykebeleAm_First(java.lang.String kebeleAm,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the last kebeles in the ordered set where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findBykebeleAm_Last(java.lang.String kebeleAm,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the last kebeles in the ordered set where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchBykebeleAm_Last(java.lang.String kebeleAm,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where kebeleAm = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param kebeleAm the kebele am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public Kebeles[] findBykebeleAm_PrevAndNext(long id,
		java.lang.String kebeleAm,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Removes all the kebeleses where kebeleAm = &#63; from the database.
	*
	* @param kebeleAm the kebele am
	*/
	public void removeBykebeleAm(java.lang.String kebeleAm);

	/**
	* Returns the number of kebeleses where kebeleAm = &#63;.
	*
	* @param kebeleAm the kebele am
	* @return the number of matching kebeleses
	*/
	public int countBykebeleAm(java.lang.String kebeleAm);

	/**
	* Returns all the kebeleses where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @return the matching kebeleses
	*/
	public java.util.List<Kebeles> findBysubcityOr(java.lang.String subcityOr);

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
	public java.util.List<Kebeles> findBysubcityOr(java.lang.String subcityOr,
		int start, int end);

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
	public java.util.List<Kebeles> findBysubcityOr(java.lang.String subcityOr,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

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
	public java.util.List<Kebeles> findBysubcityOr(java.lang.String subcityOr,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kebeles in the ordered set where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findBysubcityOr_First(java.lang.String subcityOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the first kebeles in the ordered set where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchBysubcityOr_First(java.lang.String subcityOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the last kebeles in the ordered set where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findBysubcityOr_Last(java.lang.String subcityOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the last kebeles in the ordered set where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchBysubcityOr_Last(java.lang.String subcityOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where subcityOr = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public Kebeles[] findBysubcityOr_PrevAndNext(long id,
		java.lang.String subcityOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Removes all the kebeleses where subcityOr = &#63; from the database.
	*
	* @param subcityOr the subcity or
	*/
	public void removeBysubcityOr(java.lang.String subcityOr);

	/**
	* Returns the number of kebeleses where subcityOr = &#63;.
	*
	* @param subcityOr the subcity or
	* @return the number of matching kebeleses
	*/
	public int countBysubcityOr(java.lang.String subcityOr);

	/**
	* Returns all the kebeleses where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @return the matching kebeleses
	*/
	public java.util.List<Kebeles> findBysubcityAm(java.lang.String subcityAm);

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
	public java.util.List<Kebeles> findBysubcityAm(java.lang.String subcityAm,
		int start, int end);

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
	public java.util.List<Kebeles> findBysubcityAm(java.lang.String subcityAm,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

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
	public java.util.List<Kebeles> findBysubcityAm(java.lang.String subcityAm,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kebeles in the ordered set where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findBysubcityAm_First(java.lang.String subcityAm,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the first kebeles in the ordered set where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchBysubcityAm_First(java.lang.String subcityAm,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the last kebeles in the ordered set where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findBysubcityAm_Last(java.lang.String subcityAm,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the last kebeles in the ordered set where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchBysubcityAm_Last(java.lang.String subcityAm,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where subcityAm = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param subcityAm the subcity am
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public Kebeles[] findBysubcityAm_PrevAndNext(long id,
		java.lang.String subcityAm,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Removes all the kebeleses where subcityAm = &#63; from the database.
	*
	* @param subcityAm the subcity am
	*/
	public void removeBysubcityAm(java.lang.String subcityAm);

	/**
	* Returns the number of kebeleses where subcityAm = &#63;.
	*
	* @param subcityAm the subcity am
	* @return the number of matching kebeleses
	*/
	public int countBysubcityAm(java.lang.String subcityAm);

	/**
	* Returns all the kebeleses where printername = &#63;.
	*
	* @param printername the printername
	* @return the matching kebeleses
	*/
	public java.util.List<Kebeles> findByprintername(
		java.lang.String printername);

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
	public java.util.List<Kebeles> findByprintername(
		java.lang.String printername, int start, int end);

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
	public java.util.List<Kebeles> findByprintername(
		java.lang.String printername, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

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
	public java.util.List<Kebeles> findByprintername(
		java.lang.String printername, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kebeles in the ordered set where printername = &#63;.
	*
	* @param printername the printername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findByprintername_First(java.lang.String printername,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the first kebeles in the ordered set where printername = &#63;.
	*
	* @param printername the printername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchByprintername_First(java.lang.String printername,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the last kebeles in the ordered set where printername = &#63;.
	*
	* @param printername the printername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findByprintername_Last(java.lang.String printername,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the last kebeles in the ordered set where printername = &#63;.
	*
	* @param printername the printername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchByprintername_Last(java.lang.String printername,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the kebeleses before and after the current kebeles in the ordered set where printername = &#63;.
	*
	* @param id the primary key of the current kebeles
	* @param printername the printername
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public Kebeles[] findByprintername_PrevAndNext(long id,
		java.lang.String printername,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Removes all the kebeleses where printername = &#63; from the database.
	*
	* @param printername the printername
	*/
	public void removeByprintername(java.lang.String printername);

	/**
	* Returns the number of kebeleses where printername = &#63;.
	*
	* @param printername the printername
	* @return the number of matching kebeleses
	*/
	public int countByprintername(java.lang.String printername);

	/**
	* Returns all the kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @return the matching kebeleses
	*/
	public java.util.List<Kebeles> findBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr);

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
	public java.util.List<Kebeles> findBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr, int start, int end);

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
	public java.util.List<Kebeles> findBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

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
	public java.util.List<Kebeles> findBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findBykebsubcity_First(java.lang.String kebeleOr,
		java.lang.String subcityOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the first kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchBykebsubcity_First(java.lang.String kebeleOr,
		java.lang.String subcityOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

	/**
	* Returns the last kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles
	* @throws NoSuchKebelesException if a matching kebeles could not be found
	*/
	public Kebeles findBykebsubcity_Last(java.lang.String kebeleOr,
		java.lang.String subcityOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Returns the last kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	*/
	public Kebeles fetchBykebsubcity_Last(java.lang.String kebeleOr,
		java.lang.String subcityOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

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
	public Kebeles[] findBykebsubcity_PrevAndNext(long id,
		java.lang.String kebeleOr, java.lang.String subcityOr,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException;

	/**
	* Removes all the kebeleses where kebeleOr = &#63; and subcityOr = &#63; from the database.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	*/
	public void removeBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr);

	/**
	* Returns the number of kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	*
	* @param kebeleOr the kebele or
	* @param subcityOr the subcity or
	* @return the number of matching kebeleses
	*/
	public int countBykebsubcity(java.lang.String kebeleOr,
		java.lang.String subcityOr);

	/**
	* Caches the kebeles in the entity cache if it is enabled.
	*
	* @param kebeles the kebeles
	*/
	public void cacheResult(Kebeles kebeles);

	/**
	* Caches the kebeleses in the entity cache if it is enabled.
	*
	* @param kebeleses the kebeleses
	*/
	public void cacheResult(java.util.List<Kebeles> kebeleses);

	/**
	* Creates a new kebeles with the primary key. Does not add the kebeles to the database.
	*
	* @param id the primary key for the new kebeles
	* @return the new kebeles
	*/
	public Kebeles create(long id);

	/**
	* Removes the kebeles with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kebeles
	* @return the kebeles that was removed
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public Kebeles remove(long id) throws NoSuchKebelesException;

	public Kebeles updateImpl(Kebeles kebeles);

	/**
	* Returns the kebeles with the primary key or throws a {@link NoSuchKebelesException} if it could not be found.
	*
	* @param id the primary key of the kebeles
	* @return the kebeles
	* @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	*/
	public Kebeles findByPrimaryKey(long id) throws NoSuchKebelesException;

	/**
	* Returns the kebeles with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the kebeles
	* @return the kebeles, or <code>null</code> if a kebeles with the primary key could not be found
	*/
	public Kebeles fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, Kebeles> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the kebeleses.
	*
	* @return the kebeleses
	*/
	public java.util.List<Kebeles> findAll();

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
	public java.util.List<Kebeles> findAll(int start, int end);

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
	public java.util.List<Kebeles> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator);

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
	public java.util.List<Kebeles> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the kebeleses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of kebeleses.
	*
	* @return the number of kebeleses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}