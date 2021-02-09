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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CitizenFingerprintMatcherLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CitizenFingerprintMatcherLocalService
 * @generated
 */
@ProviderType
public class CitizenFingerprintMatcherLocalServiceWrapper
	implements CitizenFingerprintMatcherLocalService,
		ServiceWrapper<CitizenFingerprintMatcherLocalService> {
	public CitizenFingerprintMatcherLocalServiceWrapper(
		CitizenFingerprintMatcherLocalService citizenFingerprintMatcherLocalService) {
		_citizenFingerprintMatcherLocalService = citizenFingerprintMatcherLocalService;
	}

	/**
	* Adds the citizen fingerprint matcher to the database. Also notifies the appropriate model listeners.
	*
	* @param citizenFingerprintMatcher the citizen fingerprint matcher
	* @return the citizen fingerprint matcher that was added
	*/
	@Override
	public IdentificationDatabase.model.CitizenFingerprintMatcher addCitizenFingerprintMatcher(
		IdentificationDatabase.model.CitizenFingerprintMatcher citizenFingerprintMatcher) {
		return _citizenFingerprintMatcherLocalService.addCitizenFingerprintMatcher(citizenFingerprintMatcher);
	}

	/**
	* Creates a new citizen fingerprint matcher with the primary key. Does not add the citizen fingerprint matcher to the database.
	*
	* @param id the primary key for the new citizen fingerprint matcher
	* @return the new citizen fingerprint matcher
	*/
	@Override
	public IdentificationDatabase.model.CitizenFingerprintMatcher createCitizenFingerprintMatcher(
		long id) {
		return _citizenFingerprintMatcherLocalService.createCitizenFingerprintMatcher(id);
	}

	/**
	* Deletes the citizen fingerprint matcher from the database. Also notifies the appropriate model listeners.
	*
	* @param citizenFingerprintMatcher the citizen fingerprint matcher
	* @return the citizen fingerprint matcher that was removed
	*/
	@Override
	public IdentificationDatabase.model.CitizenFingerprintMatcher deleteCitizenFingerprintMatcher(
		IdentificationDatabase.model.CitizenFingerprintMatcher citizenFingerprintMatcher) {
		return _citizenFingerprintMatcherLocalService.deleteCitizenFingerprintMatcher(citizenFingerprintMatcher);
	}

	/**
	* Deletes the citizen fingerprint matcher with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the citizen fingerprint matcher
	* @return the citizen fingerprint matcher that was removed
	* @throws PortalException if a citizen fingerprint matcher with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.CitizenFingerprintMatcher deleteCitizenFingerprintMatcher(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _citizenFingerprintMatcherLocalService.deleteCitizenFingerprintMatcher(id);
	}

	@Override
	public IdentificationDatabase.model.CitizenFingerprintMatcher fetchCitizenFingerprintMatcher(
		long id) {
		return _citizenFingerprintMatcherLocalService.fetchCitizenFingerprintMatcher(id);
	}

	/**
	* Returns the citizen fingerprint matcher with the primary key.
	*
	* @param id the primary key of the citizen fingerprint matcher
	* @return the citizen fingerprint matcher
	* @throws PortalException if a citizen fingerprint matcher with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.CitizenFingerprintMatcher getCitizenFingerprintMatcher(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _citizenFingerprintMatcherLocalService.getCitizenFingerprintMatcher(id);
	}

	/**
	* Updates the citizen fingerprint matcher in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param citizenFingerprintMatcher the citizen fingerprint matcher
	* @return the citizen fingerprint matcher that was updated
	*/
	@Override
	public IdentificationDatabase.model.CitizenFingerprintMatcher updateCitizenFingerprintMatcher(
		IdentificationDatabase.model.CitizenFingerprintMatcher citizenFingerprintMatcher) {
		return _citizenFingerprintMatcherLocalService.updateCitizenFingerprintMatcher(citizenFingerprintMatcher);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _citizenFingerprintMatcherLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _citizenFingerprintMatcherLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _citizenFingerprintMatcherLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _citizenFingerprintMatcherLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _citizenFingerprintMatcherLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of citizen fingerprint matchers.
	*
	* @return the number of citizen fingerprint matchers
	*/
	@Override
	public int getCitizenFingerprintMatchersCount() {
		return _citizenFingerprintMatcherLocalService.getCitizenFingerprintMatchersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _citizenFingerprintMatcherLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _citizenFingerprintMatcherLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _citizenFingerprintMatcherLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _citizenFingerprintMatcherLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
	@Override
	public java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getCitizenFingerprintMatchers(
		int start, int end) {
		return _citizenFingerprintMatcherLocalService.getCitizenFingerprintMatchers(start,
			end);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForCitizenId(
		long _citizenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenFingerprintMatcherLocalService.getMatcherForCitizenId(_citizenId);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForCitizenSecond(
		long _citizenIdSecond)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenFingerprintMatcherLocalService.getMatcherForCitizenSecond(_citizenIdSecond);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForCitizenStatus(
		long citizenId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenFingerprintMatcherLocalService.getMatcherForCitizenStatus(citizenId,
			status);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForStatus(
		int _status) throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenFingerprintMatcherLocalService.getMatcherForStatus(_status);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForUserId(
		long _userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenFingerprintMatcherLocalService.getMatcherForUserId(_userId);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.CitizenFingerprintMatcher> getMatcherForUser_Status(
		long userId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenFingerprintMatcherLocalService.getMatcherForUser_Status(userId,
			status);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _citizenFingerprintMatcherLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _citizenFingerprintMatcherLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CitizenFingerprintMatcherLocalService getWrappedService() {
		return _citizenFingerprintMatcherLocalService;
	}

	@Override
	public void setWrappedService(
		CitizenFingerprintMatcherLocalService citizenFingerprintMatcherLocalService) {
		_citizenFingerprintMatcherLocalService = citizenFingerprintMatcherLocalService;
	}

	private CitizenFingerprintMatcherLocalService _citizenFingerprintMatcherLocalService;
}