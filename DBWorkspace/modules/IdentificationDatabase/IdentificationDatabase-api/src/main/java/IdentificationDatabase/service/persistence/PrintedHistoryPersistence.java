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

import IdentificationDatabase.exception.NoSuchPrintedHistoryException;

import IdentificationDatabase.model.PrintedHistory;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the printed history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.persistence.impl.PrintedHistoryPersistenceImpl
 * @see PrintedHistoryUtil
 * @generated
 */
@ProviderType
public interface PrintedHistoryPersistence extends BasePersistence<PrintedHistory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PrintedHistoryUtil} to access the printed history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the printed histories where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the matching printed histories
	*/
	public java.util.List<PrintedHistory> findBycitizenId(long citizenId);

	/**
	* Returns a range of all the printed histories where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @return the range of matching printed histories
	*/
	public java.util.List<PrintedHistory> findBycitizenId(long citizenId,
		int start, int end);

	/**
	* Returns an ordered range of all the printed histories where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching printed histories
	*/
	public java.util.List<PrintedHistory> findBycitizenId(long citizenId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator);

	/**
	* Returns an ordered range of all the printed histories where citizenId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param citizenId the citizen ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching printed histories
	*/
	public java.util.List<PrintedHistory> findBycitizenId(long citizenId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first printed history in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching printed history
	* @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	*/
	public PrintedHistory findBycitizenId_First(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator)
		throws NoSuchPrintedHistoryException;

	/**
	* Returns the first printed history in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching printed history, or <code>null</code> if a matching printed history could not be found
	*/
	public PrintedHistory fetchBycitizenId_First(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator);

	/**
	* Returns the last printed history in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching printed history
	* @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	*/
	public PrintedHistory findBycitizenId_Last(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator)
		throws NoSuchPrintedHistoryException;

	/**
	* Returns the last printed history in the ordered set where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching printed history, or <code>null</code> if a matching printed history could not be found
	*/
	public PrintedHistory fetchBycitizenId_Last(long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator);

	/**
	* Returns the printed histories before and after the current printed history in the ordered set where citizenId = &#63;.
	*
	* @param id the primary key of the current printed history
	* @param citizenId the citizen ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next printed history
	* @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	*/
	public PrintedHistory[] findBycitizenId_PrevAndNext(long id,
		long citizenId,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator)
		throws NoSuchPrintedHistoryException;

	/**
	* Removes all the printed histories where citizenId = &#63; from the database.
	*
	* @param citizenId the citizen ID
	*/
	public void removeBycitizenId(long citizenId);

	/**
	* Returns the number of printed histories where citizenId = &#63;.
	*
	* @param citizenId the citizen ID
	* @return the number of matching printed histories
	*/
	public int countBycitizenId(long citizenId);

	/**
	* Returns all the printed histories where id = &#63;.
	*
	* @param id the ID
	* @return the matching printed histories
	*/
	public java.util.List<PrintedHistory> findByid(long id);

	/**
	* Returns a range of all the printed histories where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @return the range of matching printed histories
	*/
	public java.util.List<PrintedHistory> findByid(long id, int start, int end);

	/**
	* Returns an ordered range of all the printed histories where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching printed histories
	*/
	public java.util.List<PrintedHistory> findByid(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator);

	/**
	* Returns an ordered range of all the printed histories where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching printed histories
	*/
	public java.util.List<PrintedHistory> findByid(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first printed history in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching printed history
	* @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	*/
	public PrintedHistory findByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator)
		throws NoSuchPrintedHistoryException;

	/**
	* Returns the first printed history in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching printed history, or <code>null</code> if a matching printed history could not be found
	*/
	public PrintedHistory fetchByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator);

	/**
	* Returns the last printed history in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching printed history
	* @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	*/
	public PrintedHistory findByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator)
		throws NoSuchPrintedHistoryException;

	/**
	* Returns the last printed history in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching printed history, or <code>null</code> if a matching printed history could not be found
	*/
	public PrintedHistory fetchByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator);

	/**
	* Removes all the printed histories where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByid(long id);

	/**
	* Returns the number of printed histories where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching printed histories
	*/
	public int countByid(long id);

	/**
	* Caches the printed history in the entity cache if it is enabled.
	*
	* @param printedHistory the printed history
	*/
	public void cacheResult(PrintedHistory printedHistory);

	/**
	* Caches the printed histories in the entity cache if it is enabled.
	*
	* @param printedHistories the printed histories
	*/
	public void cacheResult(java.util.List<PrintedHistory> printedHistories);

	/**
	* Creates a new printed history with the primary key. Does not add the printed history to the database.
	*
	* @param id the primary key for the new printed history
	* @return the new printed history
	*/
	public PrintedHistory create(long id);

	/**
	* Removes the printed history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the printed history
	* @return the printed history that was removed
	* @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	*/
	public PrintedHistory remove(long id) throws NoSuchPrintedHistoryException;

	public PrintedHistory updateImpl(PrintedHistory printedHistory);

	/**
	* Returns the printed history with the primary key or throws a {@link NoSuchPrintedHistoryException} if it could not be found.
	*
	* @param id the primary key of the printed history
	* @return the printed history
	* @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	*/
	public PrintedHistory findByPrimaryKey(long id)
		throws NoSuchPrintedHistoryException;

	/**
	* Returns the printed history with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the printed history
	* @return the printed history, or <code>null</code> if a printed history with the primary key could not be found
	*/
	public PrintedHistory fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, PrintedHistory> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the printed histories.
	*
	* @return the printed histories
	*/
	public java.util.List<PrintedHistory> findAll();

	/**
	* Returns a range of all the printed histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @return the range of printed histories
	*/
	public java.util.List<PrintedHistory> findAll(int start, int end);

	/**
	* Returns an ordered range of all the printed histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of printed histories
	*/
	public java.util.List<PrintedHistory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator);

	/**
	* Returns an ordered range of all the printed histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of printed histories
	*/
	public java.util.List<PrintedHistory> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PrintedHistory> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the printed histories from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of printed histories.
	*
	* @return the number of printed histories
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}