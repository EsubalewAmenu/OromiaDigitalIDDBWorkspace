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

import IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException;

import IdentificationDatabase.model.CitizenFingerprintMatcher;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the citizen fingerprint matcher service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.persistence.impl.CitizenFingerprintMatcherPersistenceImpl
 * @see CitizenFingerprintMatcherUtil
 * @generated
 */
@ProviderType
public interface CitizenFingerprintMatcherPersistence extends BasePersistence<CitizenFingerprintMatcher> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CitizenFingerprintMatcherUtil} to access the citizen fingerprint matcher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @return the matching citizen fingerprint matchers
	*/
	public java.util.List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status);

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
	public java.util.List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status, int start, int end);

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
	public java.util.List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

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
	public java.util.List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findBycitizen_status_First(
		long citizenId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchBycitizen_status_First(
		long citizenId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findBycitizen_status_Last(long citizenId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchBycitizen_status_Last(
		long citizenId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

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
	public CitizenFingerprintMatcher[] findBycitizen_status_PrevAndNext(
		long id, long citizenId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Removes all the citizen fingerprint matchers where citizenId = &#63; and status = &#63; from the database.
	*
	* @param citizenId the citizen ID
	* @param status the status
	*/
	public void removeBycitizen_status(long citizenId, int status);

	/**
	* Returns the number of citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	*
	* @param citizenId the citizen ID
	* @param status the status
	* @return the number of matching citizen fingerprint matchers
	*/
	public int countBycitizen_status(long citizenId, int status);

	/**
	* Returns all the citizen fingerprint matchers where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching citizen fingerprint matchers
	*/
	public java.util.List<CitizenFingerprintMatcher> findByuserid_status(
		long userId, int status);

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
	public java.util.List<CitizenFingerprintMatcher> findByuserid_status(
		long userId, int status, int start, int end);

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
	public java.util.List<CitizenFingerprintMatcher> findByuserid_status(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

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
	public java.util.List<CitizenFingerprintMatcher> findByuserid_status(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findByuserid_status_First(long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchByuserid_status_First(long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findByuserid_status_Last(long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchByuserid_status_Last(long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

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
	public CitizenFingerprintMatcher[] findByuserid_status_PrevAndNext(
		long id, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Removes all the citizen fingerprint matchers where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByuserid_status(long userId, int status);

	/**
	* Returns the number of citizen fingerprint matchers where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching citizen fingerprint matchers
	*/
	public int countByuserid_status(long userId, int status);

	/**
	* Returns all the citizen fingerprint matchers where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the matching citizen fingerprint matchers
	*/
	public java.util.List<CitizenFingerprintMatcher> findBycitizenId(
		long citizenId);

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
	public java.util.List<CitizenFingerprintMatcher> findBycitizenId(
		long citizenId, int start, int end);

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
	public java.util.List<CitizenFingerprintMatcher> findBycitizenId(
		long citizenId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

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
	public java.util.List<CitizenFingerprintMatcher> findBycitizenId(
		long citizenId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findBycitizenId_First(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchBycitizenId_First(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findBycitizenId_Last(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchBycitizenId_Last(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	*
	* @param id the primary key of the current citizen fingerprint matcher
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public CitizenFingerprintMatcher[] findBycitizenId_PrevAndNext(long id,
		long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Removes all the citizen fingerprint matchers where citizenId = &#63; from the database.
	*
	* @param citizenId the citizen ID
	*/
	public void removeBycitizenId(long citizenId);

	/**
	* Returns the number of citizen fingerprint matchers where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the number of matching citizen fingerprint matchers
	*/
	public int countBycitizenId(long citizenId);

	/**
	* Returns all the citizen fingerprint matchers where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @return the matching citizen fingerprint matchers
	*/
	public java.util.List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond);

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
	public java.util.List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond, int start, int end);

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
	public java.util.List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

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
	public java.util.List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findBycitizenIdSecond_First(
		long citizenIdSecond,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchBycitizenIdSecond_First(
		long citizenIdSecond,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findBycitizenIdSecond_Last(
		long citizenIdSecond,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchBycitizenIdSecond_Last(
		long citizenIdSecond,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	*
	* @param id the primary key of the current citizen fingerprint matcher
	* @param citizenIdSecond the citizen ID second
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public CitizenFingerprintMatcher[] findBycitizenIdSecond_PrevAndNext(
		long id, long citizenIdSecond,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Removes all the citizen fingerprint matchers where citizenIdSecond = &#63; from the database.
	*
	* @param citizenIdSecond the citizen ID second
	*/
	public void removeBycitizenIdSecond(long citizenIdSecond);

	/**
	* Returns the number of citizen fingerprint matchers where citizenIdSecond = &#63;.
	*
	* @param citizenIdSecond the citizen ID second
	* @return the number of matching citizen fingerprint matchers
	*/
	public int countBycitizenIdSecond(long citizenIdSecond);

	/**
	* Returns all the citizen fingerprint matchers where status = &#63;.
	*
	* @param status the status
	* @return the matching citizen fingerprint matchers
	*/
	public java.util.List<CitizenFingerprintMatcher> findBystatus(int status);

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
	public java.util.List<CitizenFingerprintMatcher> findBystatus(int status,
		int start, int end);

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
	public java.util.List<CitizenFingerprintMatcher> findBystatus(int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

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
	public java.util.List<CitizenFingerprintMatcher> findBystatus(int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findBystatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchBystatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findBystatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchBystatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where status = &#63;.
	*
	* @param id the primary key of the current citizen fingerprint matcher
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public CitizenFingerprintMatcher[] findBystatus_PrevAndNext(long id,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Removes all the citizen fingerprint matchers where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeBystatus(int status);

	/**
	* Returns the number of citizen fingerprint matchers where status = &#63;.
	*
	* @param status the status
	* @return the number of matching citizen fingerprint matchers
	*/
	public int countBystatus(int status);

	/**
	* Returns all the citizen fingerprint matchers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching citizen fingerprint matchers
	*/
	public java.util.List<CitizenFingerprintMatcher> findByuserId(long userId);

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
	public java.util.List<CitizenFingerprintMatcher> findByuserId(long userId,
		int start, int end);

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
	public java.util.List<CitizenFingerprintMatcher> findByuserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

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
	public java.util.List<CitizenFingerprintMatcher> findByuserId(long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchByuserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchByuserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current citizen fingerprint matcher
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public CitizenFingerprintMatcher[] findByuserId_PrevAndNext(long id,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Removes all the citizen fingerprint matchers where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByuserId(long userId);

	/**
	* Returns the number of citizen fingerprint matchers where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching citizen fingerprint matchers
	*/
	public int countByuserId(long userId);

	/**
	* Returns all the citizen fingerprint matchers where id = &#63;.
	*
	* @param id the ID
	* @return the matching citizen fingerprint matchers
	*/
	public java.util.List<CitizenFingerprintMatcher> findByid(long id);

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
	public java.util.List<CitizenFingerprintMatcher> findByid(long id,
		int start, int end);

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
	public java.util.List<CitizenFingerprintMatcher> findByid(long id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

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
	public java.util.List<CitizenFingerprintMatcher> findByid(long id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the first citizen fingerprint matcher in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher findByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the last citizen fingerprint matcher in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	*/
	public CitizenFingerprintMatcher fetchByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

	/**
	* Removes all the citizen fingerprint matchers where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByid(long id);

	/**
	* Returns the number of citizen fingerprint matchers where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching citizen fingerprint matchers
	*/
	public int countByid(long id);

	/**
	* Caches the citizen fingerprint matcher in the entity cache if it is enabled.
	*
	* @param citizenFingerprintMatcher the citizen fingerprint matcher
	*/
	public void cacheResult(CitizenFingerprintMatcher citizenFingerprintMatcher);

	/**
	* Caches the citizen fingerprint matchers in the entity cache if it is enabled.
	*
	* @param citizenFingerprintMatchers the citizen fingerprint matchers
	*/
	public void cacheResult(
		java.util.List<CitizenFingerprintMatcher> citizenFingerprintMatchers);

	/**
	* Creates a new citizen fingerprint matcher with the primary key. Does not add the citizen fingerprint matcher to the database.
	*
	* @param id the primary key for the new citizen fingerprint matcher
	* @return the new citizen fingerprint matcher
	*/
	public CitizenFingerprintMatcher create(long id);

	/**
	* Removes the citizen fingerprint matcher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the citizen fingerprint matcher
	* @return the citizen fingerprint matcher that was removed
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public CitizenFingerprintMatcher remove(long id)
		throws NoSuchCitizenFingerprintMatcherException;

	public CitizenFingerprintMatcher updateImpl(
		CitizenFingerprintMatcher citizenFingerprintMatcher);

	/**
	* Returns the citizen fingerprint matcher with the primary key or throws a {@link NoSuchCitizenFingerprintMatcherException} if it could not be found.
	*
	* @param id the primary key of the citizen fingerprint matcher
	* @return the citizen fingerprint matcher
	* @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public CitizenFingerprintMatcher findByPrimaryKey(long id)
		throws NoSuchCitizenFingerprintMatcherException;

	/**
	* Returns the citizen fingerprint matcher with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the citizen fingerprint matcher
	* @return the citizen fingerprint matcher, or <code>null</code> if a citizen fingerprint matcher with the primary key could not be found
	*/
	public CitizenFingerprintMatcher fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, CitizenFingerprintMatcher> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the citizen fingerprint matchers.
	*
	* @return the citizen fingerprint matchers
	*/
	public java.util.List<CitizenFingerprintMatcher> findAll();

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
	public java.util.List<CitizenFingerprintMatcher> findAll(int start, int end);

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
	public java.util.List<CitizenFingerprintMatcher> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator);

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
	public java.util.List<CitizenFingerprintMatcher> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the citizen fingerprint matchers from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of citizen fingerprint matchers.
	*
	* @return the number of citizen fingerprint matchers
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}