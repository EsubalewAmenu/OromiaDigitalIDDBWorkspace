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

import IdentificationDatabase.exception.NoSuchCitizenRemarkException;

import IdentificationDatabase.model.CitizenRemark;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the citizen remark service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.persistence.impl.CitizenRemarkPersistenceImpl
 * @see CitizenRemarkUtil
 * @generated
 */
@ProviderType
public interface CitizenRemarkPersistence extends BasePersistence<CitizenRemark> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CitizenRemarkUtil} to access the citizen remark persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the citizen remarks where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the matching citizen remarks
	*/
	public java.util.List<CitizenRemark> findBycitizenId(long citizenId);

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
	public java.util.List<CitizenRemark> findBycitizenId(long citizenId,
		int start, int end);

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
	public java.util.List<CitizenRemark> findBycitizenId(long citizenId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator);

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
	public java.util.List<CitizenRemark> findBycitizenId(long citizenId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first citizen remark in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen remark
	* @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	*/
	public CitizenRemark findBycitizenId_First(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator)
		throws NoSuchCitizenRemarkException;

	/**
	* Returns the first citizen remark in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	*/
	public CitizenRemark fetchBycitizenId_First(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator);

	/**
	* Returns the last citizen remark in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen remark
	* @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	*/
	public CitizenRemark findBycitizenId_Last(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator)
		throws NoSuchCitizenRemarkException;

	/**
	* Returns the last citizen remark in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	*/
	public CitizenRemark fetchBycitizenId_Last(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator);

	/**
	* Returns the citizen remarks before and after the current citizen remark in the ordered set where citizenId = &#63;.
	*
	* @param id the primary key of the current citizen remark
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen remark
	* @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	*/
	public CitizenRemark[] findBycitizenId_PrevAndNext(long id, long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator)
		throws NoSuchCitizenRemarkException;

	/**
	* Removes all the citizen remarks where citizenId = &#63; from the database.
	*
	* @param citizenId the citizen ID
	*/
	public void removeBycitizenId(long citizenId);

	/**
	* Returns the number of citizen remarks where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the number of matching citizen remarks
	*/
	public int countBycitizenId(long citizenId);

	/**
	* Returns all the citizen remarks where id = &#63;.
	*
	* @param id the ID
	* @return the matching citizen remarks
	*/
	public java.util.List<CitizenRemark> findByid(long id);

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
	public java.util.List<CitizenRemark> findByid(long id, int start, int end);

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
	public java.util.List<CitizenRemark> findByid(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator);

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
	public java.util.List<CitizenRemark> findByid(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first citizen remark in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen remark
	* @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	*/
	public CitizenRemark findByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator)
		throws NoSuchCitizenRemarkException;

	/**
	* Returns the first citizen remark in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	*/
	public CitizenRemark fetchByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator);

	/**
	* Returns the last citizen remark in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen remark
	* @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	*/
	public CitizenRemark findByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator)
		throws NoSuchCitizenRemarkException;

	/**
	* Returns the last citizen remark in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	*/
	public CitizenRemark fetchByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator);

	/**
	* Removes all the citizen remarks where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByid(long id);

	/**
	* Returns the number of citizen remarks where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching citizen remarks
	*/
	public int countByid(long id);

	/**
	* Caches the citizen remark in the entity cache if it is enabled.
	*
	* @param citizenRemark the citizen remark
	*/
	public void cacheResult(CitizenRemark citizenRemark);

	/**
	* Caches the citizen remarks in the entity cache if it is enabled.
	*
	* @param citizenRemarks the citizen remarks
	*/
	public void cacheResult(java.util.List<CitizenRemark> citizenRemarks);

	/**
	* Creates a new citizen remark with the primary key. Does not add the citizen remark to the database.
	*
	* @param id the primary key for the new citizen remark
	* @return the new citizen remark
	*/
	public CitizenRemark create(long id);

	/**
	* Removes the citizen remark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the citizen remark
	* @return the citizen remark that was removed
	* @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	*/
	public CitizenRemark remove(long id) throws NoSuchCitizenRemarkException;

	public CitizenRemark updateImpl(CitizenRemark citizenRemark);

	/**
	* Returns the citizen remark with the primary key or throws a {@link NoSuchCitizenRemarkException} if it could not be found.
	*
	* @param id the primary key of the citizen remark
	* @return the citizen remark
	* @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	*/
	public CitizenRemark findByPrimaryKey(long id)
		throws NoSuchCitizenRemarkException;

	/**
	* Returns the citizen remark with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the citizen remark
	* @return the citizen remark, or <code>null</code> if a citizen remark with the primary key could not be found
	*/
	public CitizenRemark fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, CitizenRemark> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the citizen remarks.
	*
	* @return the citizen remarks
	*/
	public java.util.List<CitizenRemark> findAll();

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
	public java.util.List<CitizenRemark> findAll(int start, int end);

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
	public java.util.List<CitizenRemark> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator);

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
	public java.util.List<CitizenRemark> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenRemark> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the citizen remarks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of citizen remarks.
	*
	* @return the number of citizen remarks
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}