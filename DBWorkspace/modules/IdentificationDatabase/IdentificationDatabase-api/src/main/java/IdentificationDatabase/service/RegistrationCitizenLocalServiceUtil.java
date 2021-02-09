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
 * Provides the local service utility for RegistrationCitizen. This utility wraps
 * {@link IdentificationDatabase.service.impl.RegistrationCitizenLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationCitizenLocalService
 * @see IdentificationDatabase.service.base.RegistrationCitizenLocalServiceBaseImpl
 * @see IdentificationDatabase.service.impl.RegistrationCitizenLocalServiceImpl
 * @generated
 */
@ProviderType
public class RegistrationCitizenLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link IdentificationDatabase.service.impl.RegistrationCitizenLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the registration citizen to the database. Also notifies the appropriate model listeners.
	*
	* @param registrationCitizen the registration citizen
	* @return the registration citizen that was added
	*/
	public static IdentificationDatabase.model.RegistrationCitizen addRegistrationCitizen(
		IdentificationDatabase.model.RegistrationCitizen registrationCitizen) {
		return getService().addRegistrationCitizen(registrationCitizen);
	}

	/**
	* Creates a new registration citizen with the primary key. Does not add the registration citizen to the database.
	*
	* @param id the primary key for the new registration citizen
	* @return the new registration citizen
	*/
	public static IdentificationDatabase.model.RegistrationCitizen createRegistrationCitizen(
		long id) {
		return getService().createRegistrationCitizen(id);
	}

	/**
	* Deletes the registration citizen from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationCitizen the registration citizen
	* @return the registration citizen that was removed
	*/
	public static IdentificationDatabase.model.RegistrationCitizen deleteRegistrationCitizen(
		IdentificationDatabase.model.RegistrationCitizen registrationCitizen) {
		return getService().deleteRegistrationCitizen(registrationCitizen);
	}

	/**
	* Deletes the registration citizen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen that was removed
	* @throws PortalException if a registration citizen with the primary key could not be found
	*/
	public static IdentificationDatabase.model.RegistrationCitizen deleteRegistrationCitizen(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteRegistrationCitizen(id);
	}

	public static IdentificationDatabase.model.RegistrationCitizen fetchRegistrationCitizen(
		long id) {
		return getService().fetchRegistrationCitizen(id);
	}

	/**
	* Returns the registration citizen with the primary key.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen
	* @throws PortalException if a registration citizen with the primary key could not be found
	*/
	public static IdentificationDatabase.model.RegistrationCitizen getRegistrationCitizen(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRegistrationCitizen(id);
	}

	/**
	* Updates the registration citizen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registrationCitizen the registration citizen
	* @return the registration citizen that was updated
	*/
	public static IdentificationDatabase.model.RegistrationCitizen updateRegistrationCitizen(
		IdentificationDatabase.model.RegistrationCitizen registrationCitizen) {
		return getService().updateRegistrationCitizen(registrationCitizen);
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
	* Returns the number of registration citizens.
	*
	* @return the number of registration citizens
	*/
	public static int getRegistrationCitizensCount() {
		return getService().getRegistrationCitizensCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCitizenForCode(code);
	}

	public static java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForHouseNo_kebele(
		java.lang.String houseNo, java.lang.String kebele)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCitizenForHouseNo_kebele(houseNo, kebele);
	}

	public static java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForId(
		long _id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCitizenForId(_id);
	}

	public static java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForIssueKebeleOccStat(
		java.util.Date issueDate, java.lang.String kebele,
		java.lang.String occupation, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCitizenForIssueKebeleOccStat(issueDate, kebele,
			occupation, status);
	}

	public static java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForIssueKebeleSexOccStat(
		java.util.Date issueDate, java.lang.String kebele,
		java.lang.String sex, java.lang.String occupation, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCitizenForIssueKebeleSexOccStat(issueDate, kebele, sex,
			occupation, status);
	}

	public static java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForIssueKebeleSexStat(
		java.util.Date issueDate, java.lang.String kebele,
		java.lang.String sex, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCitizenForIssueKebeleSexStat(issueDate, kebele, sex,
			status);
	}

	public static java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForIssueKebeleStat(
		java.util.Date issueDate, java.lang.String kebele, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getCitizenForIssueKebeleStat(issueDate, kebele, status);
	}

	public static java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForStatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getCitizenForStatus(status);
	}

	/**
	* Returns a range of all the registration citizens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of registration citizens
	* @param end the upper bound of the range of registration citizens (not inclusive)
	* @return the range of registration citizens
	*/
	public static java.util.List<IdentificationDatabase.model.RegistrationCitizen> getRegistrationCitizens(
		int start, int end) {
		return getService().getRegistrationCitizens(start, end);
	}

	public static java.util.List<IdentificationDatabase.model.RegistrationCitizen> getReportForIssueDate_kebele(
		java.util.Date issueDate, java.lang.String kebele)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getReportForIssueDate_kebele(issueDate, kebele);
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

	public static RegistrationCitizenLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RegistrationCitizenLocalService, RegistrationCitizenLocalService> _serviceTracker =
		ServiceTrackerFactory.open(RegistrationCitizenLocalService.class);
}