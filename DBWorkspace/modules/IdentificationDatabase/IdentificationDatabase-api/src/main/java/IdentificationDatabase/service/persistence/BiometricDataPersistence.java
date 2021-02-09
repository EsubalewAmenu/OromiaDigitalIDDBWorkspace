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

import IdentificationDatabase.exception.NoSuchBiometricDataException;

import IdentificationDatabase.model.BiometricData;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the biometric data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.persistence.impl.BiometricDataPersistenceImpl
 * @see BiometricDataUtil
 * @generated
 */
@ProviderType
public interface BiometricDataPersistence extends BasePersistence<BiometricData> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link BiometricDataUtil} to access the biometric data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the biometric datas where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the matching biometric datas
	*/
	public java.util.List<BiometricData> findBycitizenId(long citizenId);

	/**
	* Returns a range of all the biometric datas where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @return the range of matching biometric datas
	*/
	public java.util.List<BiometricData> findBycitizenId(long citizenId,
		int start, int end);

	/**
	* Returns an ordered range of all the biometric datas where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching biometric datas
	*/
	public java.util.List<BiometricData> findBycitizenId(long citizenId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BiometricData> orderByComparator);

	/**
	* Returns an ordered range of all the biometric datas where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching biometric datas
	*/
	public java.util.List<BiometricData> findBycitizenId(long citizenId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BiometricData> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first biometric data in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching biometric data
	* @throws NoSuchBiometricDataException if a matching biometric data could not be found
	*/
	public BiometricData findBycitizenId_First(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<BiometricData> orderByComparator)
		throws NoSuchBiometricDataException;

	/**
	* Returns the first biometric data in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching biometric data, or <code>null</code> if a matching biometric data could not be found
	*/
	public BiometricData fetchBycitizenId_First(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<BiometricData> orderByComparator);

	/**
	* Returns the last biometric data in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching biometric data
	* @throws NoSuchBiometricDataException if a matching biometric data could not be found
	*/
	public BiometricData findBycitizenId_Last(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<BiometricData> orderByComparator)
		throws NoSuchBiometricDataException;

	/**
	* Returns the last biometric data in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching biometric data, or <code>null</code> if a matching biometric data could not be found
	*/
	public BiometricData fetchBycitizenId_Last(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<BiometricData> orderByComparator);

	/**
	* Returns the biometric datas before and after the current biometric data in the ordered set where citizenId = &#63;.
	*
	* @param id the primary key of the current biometric data
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next biometric data
	* @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	*/
	public BiometricData[] findBycitizenId_PrevAndNext(long id, long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<BiometricData> orderByComparator)
		throws NoSuchBiometricDataException;

	/**
	* Removes all the biometric datas where citizenId = &#63; from the database.
	*
	* @param citizenId the citizen ID
	*/
	public void removeBycitizenId(long citizenId);

	/**
	* Returns the number of biometric datas where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the number of matching biometric datas
	*/
	public int countBycitizenId(long citizenId);

	/**
	* Caches the biometric data in the entity cache if it is enabled.
	*
	* @param biometricData the biometric data
	*/
	public void cacheResult(BiometricData biometricData);

	/**
	* Caches the biometric datas in the entity cache if it is enabled.
	*
	* @param biometricDatas the biometric datas
	*/
	public void cacheResult(java.util.List<BiometricData> biometricDatas);

	/**
	* Creates a new biometric data with the primary key. Does not add the biometric data to the database.
	*
	* @param id the primary key for the new biometric data
	* @return the new biometric data
	*/
	public BiometricData create(long id);

	/**
	* Removes the biometric data with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the biometric data
	* @return the biometric data that was removed
	* @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	*/
	public BiometricData remove(long id) throws NoSuchBiometricDataException;

	public BiometricData updateImpl(BiometricData biometricData);

	/**
	* Returns the biometric data with the primary key or throws a {@link NoSuchBiometricDataException} if it could not be found.
	*
	* @param id the primary key of the biometric data
	* @return the biometric data
	* @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	*/
	public BiometricData findByPrimaryKey(long id)
		throws NoSuchBiometricDataException;

	/**
	* Returns the biometric data with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the biometric data
	* @return the biometric data, or <code>null</code> if a biometric data with the primary key could not be found
	*/
	public BiometricData fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, BiometricData> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the biometric datas.
	*
	* @return the biometric datas
	*/
	public java.util.List<BiometricData> findAll();

	/**
	* Returns a range of all the biometric datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @return the range of biometric datas
	*/
	public java.util.List<BiometricData> findAll(int start, int end);

	/**
	* Returns an ordered range of all the biometric datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of biometric datas
	*/
	public java.util.List<BiometricData> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BiometricData> orderByComparator);

	/**
	* Returns an ordered range of all the biometric datas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of biometric datas
	* @param end the upper bound of the range of biometric datas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of biometric datas
	*/
	public java.util.List<BiometricData> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<BiometricData> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the biometric datas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of biometric datas.
	*
	* @return the number of biometric datas
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}