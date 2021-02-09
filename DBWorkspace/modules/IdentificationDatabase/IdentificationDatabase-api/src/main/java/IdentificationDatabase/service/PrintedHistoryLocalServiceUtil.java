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

package IdentificationDatabase.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for PrintedHistory. This utility wraps
 * {@link IdentificationDatabase.service.impl.PrintedHistoryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PrintedHistoryLocalService
 * @see IdentificationDatabase.service.base.PrintedHistoryLocalServiceBaseImpl
 * @see IdentificationDatabase.service.impl.PrintedHistoryLocalServiceImpl
 * @generated
 */
@ProviderType
public class PrintedHistoryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link IdentificationDatabase.service.impl.PrintedHistoryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the printed history to the database. Also notifies the appropriate model listeners.
	*
	* @param printedHistory the printed history
	* @return the printed history that was added
	*/
	public static IdentificationDatabase.model.PrintedHistory addPrintedHistory(
		IdentificationDatabase.model.PrintedHistory printedHistory) {
		return getService().addPrintedHistory(printedHistory);
	}

	/**
	* Creates a new printed history with the primary key. Does not add the printed history to the database.
	*
	* @param id the primary key for the new printed history
	* @return the new printed history
	*/
	public static IdentificationDatabase.model.PrintedHistory createPrintedHistory(
		long id) {
		return getService().createPrintedHistory(id);
	}

	/**
	* Deletes the printed history from the database. Also notifies the appropriate model listeners.
	*
	* @param printedHistory the printed history
	* @return the printed history that was removed
	*/
	public static IdentificationDatabase.model.PrintedHistory deletePrintedHistory(
		IdentificationDatabase.model.PrintedHistory printedHistory) {
		return getService().deletePrintedHistory(printedHistory);
	}

	/**
	* Deletes the printed history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the printed history
	* @return the printed history that was removed
	* @throws PortalException if a printed history with the primary key could not be found
	*/
	public static IdentificationDatabase.model.PrintedHistory deletePrintedHistory(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePrintedHistory(id);
	}

	public static IdentificationDatabase.model.PrintedHistory fetchPrintedHistory(
		long id) {
		return getService().fetchPrintedHistory(id);
	}

	/**
	* Returns the printed history with the primary key.
	*
	* @param id the primary key of the printed history
	* @return the printed history
	* @throws PortalException if a printed history with the primary key could not be found
	*/
	public static IdentificationDatabase.model.PrintedHistory getPrintedHistory(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPrintedHistory(id);
	}

	/**
	* Updates the printed history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param printedHistory the printed history
	* @return the printed history that was updated
	*/
	public static IdentificationDatabase.model.PrintedHistory updatePrintedHistory(
		IdentificationDatabase.model.PrintedHistory printedHistory) {
		return getService().updatePrintedHistory(printedHistory);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of printed histories.
	*
	* @return the number of printed histories
	*/
	public static int getPrintedHistoriesCount() {
		return getService().getPrintedHistoriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the printed histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of printed histories
	* @param end the upper bound of the range of printed histories (not inclusive)
	* @return the range of printed histories
	*/
	public static java.util.List<IdentificationDatabase.model.PrintedHistory> getPrintedHistories(
		int start, int end) {
		return getService().getPrintedHistories(start, end);
	}

	public static java.util.List<IdentificationDatabase.model.PrintedHistory> getRemarkForCitizenId(
		long _citizenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRemarkForCitizenId(_citizenId);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static PrintedHistoryLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PrintedHistoryLocalService, PrintedHistoryLocalService> _serviceTracker =
		ServiceTrackerFactory.open(PrintedHistoryLocalService.class);
}