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
 * Provides the local service utility for CitizenFingerprintMatcher. This utility wraps
 * {@link IdentificationDatabase.service.impl.CitizenFingerprintMatcherLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CitizenFingerprintMatcherLocalService
 * @see IdentificationDatabase.service.base.CitizenFingerprintMatcherLocalServiceBaseImpl
 * @see IdentificationDatabase.service.impl.CitizenFingerprintMatcherLocalServiceImpl
 * @generated
 */
@ProviderType
public class CitizenFingerprintMatcherLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link IdentificationDatabase.service.impl.CitizenFingerprintMatcherLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the citizen fingerprint matcher to the database. Also notifies the appropriate model listeners.
	*
	* @param citizenFingerprintMatcher the citizen fingerprint matcher
	* @return the citizen fingerprint matcher that was added
	*/
	public static IdentificationDatabase.model.CitizenFingerprintMatcher addCitizenFingerprintMatcher(
		IdentificationDatabase.model.CitizenFingerprintMatcher citizenFingerprintMatcher) {
		return getService()
				   .addCitizenFingerprintMatcher(citizenFingerprintMatcher);
	}

	/**
	* Creates a new citizen fingerprint matcher with the primary key. Does not add the citizen fingerprint matcher to the database.
	*
	* @param id the primary key for the new citizen fingerprint matcher
	* @return the new citizen fingerprint matcher
	*/
	public static IdentificationDatabase.model.CitizenFingerprintMatcher createCitizenFingerprintMatcher(
		long id) {
		return getService().createCitizenFingerprintMatcher(id);
	}

	/**
	* Deletes the citizen fingerprint matcher from the database. Also notifies the appropriate model listeners.
	*
	* @param citizenFingerprintMatcher the citizen fingerprint matcher
	* @return the citizen fingerprint matcher that was removed
	*/
	public static IdentificationDatabase.model.CitizenFingerprintMatcher deleteCitizenFingerprintMatcher(
		IdentificationDatabase.model.CitizenFingerprintMatcher citizenFingerprintMatcher) {
		return getService()
				   .deleteCitizenFingerprintMatcher(citizenFingerprintMatcher);
	}

	/**
	* Deletes the citizen fingerprint matcher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the citizen fingerprint matcher
	* @return the citizen fingerprint matcher that was removed
	* @throws PortalException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static IdentificationDatabase.model.CitizenFingerprintMatcher deleteCitizenFingerprintMatcher(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCitizenFingerprintMatcher(id);
	}

	public static IdentificationDatabase.model.CitizenFingerprintMatcher fetchCitizenFingerprintMatcher(
		long id) {
		return getService().fetchCitizenFingerprintMatcher(id);
	}

	/**
	* Returns the citizen fingerprint matcher with the primary key.
	*
	* @param id the primary key of the citizen fingerprint matcher
	* @return the citizen fingerprint matcher
	* @throws PortalException if a citizen fingerprint matcher with the primary key could not be found
	*/
	public static IdentificationDatabase.model.CitizenFingerprintMatcher getCitizenFingerprintMatcher(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCitizenFingerprintMatcher(id);
	}

	/**
	* Updates the citizen fingerprint matcher in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param citizenFingerprintMatcher the citizen fingerprint matcher
	* @return the citizen fingerprint matcher that was updated
	*/
	public static IdentificationDatabase.model.CitizenFingerprintMatcher updateCitizenFingerprintMatcher(
		IdentificationDatabase.model.CitizenFingerprintMatcher citizenFingerprintMatcher) {
		return getService()
				   .updateCitizenFingerprintMatcher(citizenFingerprintMatcher);
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
	* Returns the number of citizen fingerprint matchers.
	*
	* @return the number of citizen fingerprint matchers
	*/
	public static int getCitizenFingerprintMatchersCount() {
		return getService().getCitizenFingerprintMatchersCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the citizen fingerprint matchers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizen fingerprint matchers
	* @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	* @return the range of citizen fingerprint matchers
	*/
	public static java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getCitizenFingerprintMatchers(
		int start, int end) {
		return getService().getCitizenFingerprintMatchers(start, end);
	}

	public static java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForCitizenId(
		long _citizenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMatcherForCitizenId(_citizenId);
	}

	public static java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForCitizenSecond(
		long _citizenIdSecond)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMatcherForCitizenSecond(_citizenIdSecond);
	}

	public static java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForCitizenStatus(
		long citizenId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMatcherForCitizenStatus(citizenId, status);
	}

	public static java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForStatus(
		int _status) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMatcherForStatus(_status);
	}

	public static java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForUserId(
		long _userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMatcherForUserId(_userId);
	}

	public static java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForUser_Status(
		long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMatcherForUser_Status(userId, status);
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

	public static CitizenFingerprintMatcherLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CitizenFingerprintMatcherLocalService, CitizenFingerprintMatcherLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CitizenFingerprintMatcherLocalService.class);
}