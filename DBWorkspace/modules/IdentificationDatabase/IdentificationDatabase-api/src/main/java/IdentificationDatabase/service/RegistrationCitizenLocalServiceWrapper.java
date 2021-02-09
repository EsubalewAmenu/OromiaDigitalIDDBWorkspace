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
 * Provides a wrapper for {@link RegistrationCitizenLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationCitizenLocalService
 * @generated
 */
@ProviderType
public class RegistrationCitizenLocalServiceWrapper
	implements RegistrationCitizenLocalService,
		ServiceWrapper<RegistrationCitizenLocalService> {
	public RegistrationCitizenLocalServiceWrapper(
		RegistrationCitizenLocalService registrationCitizenLocalService) {
		_registrationCitizenLocalService = registrationCitizenLocalService;
	}

	/**
	* Adds the registration citizen to the database. Also notifies the appropriate model listeners.
	*
	* @param registrationCitizen the registration citizen
	* @return the registration citizen that was added
	*/
	@Override
	public IdentificationDatabase.model.RegistrationCitizen addRegistrationCitizen(
		IdentificationDatabase.model.RegistrationCitizen registrationCitizen) {
		return _registrationCitizenLocalService.addRegistrationCitizen(registrationCitizen);
	}

	/**
	* Creates a new registration citizen with the primary key. Does not add the registration citizen to the database.
	*
	* @param id the primary key for the new registration citizen
	* @return the new registration citizen
	*/
	@Override
	public IdentificationDatabase.model.RegistrationCitizen createRegistrationCitizen(
		long id) {
		return _registrationCitizenLocalService.createRegistrationCitizen(id);
	}

	/**
	* Deletes the registration citizen from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationCitizen the registration citizen
	* @return the registration citizen that was removed
	*/
	@Override
	public IdentificationDatabase.model.RegistrationCitizen deleteRegistrationCitizen(
		IdentificationDatabase.model.RegistrationCitizen registrationCitizen) {
		return _registrationCitizenLocalService.deleteRegistrationCitizen(registrationCitizen);
	}

	/**
	* Deletes the registration citizen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen that was removed
	* @throws PortalException if a registration citizen with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.RegistrationCitizen deleteRegistrationCitizen(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _registrationCitizenLocalService.deleteRegistrationCitizen(id);
	}

	@Override
	public IdentificationDatabase.model.RegistrationCitizen fetchRegistrationCitizen(
		long id) {
		return _registrationCitizenLocalService.fetchRegistrationCitizen(id);
	}

	/**
	* Returns the registration citizen with the primary key.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen
	* @throws PortalException if a registration citizen with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.RegistrationCitizen getRegistrationCitizen(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _registrationCitizenLocalService.getRegistrationCitizen(id);
	}

	/**
	* Updates the registration citizen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registrationCitizen the registration citizen
	* @return the registration citizen that was updated
	*/
	@Override
	public IdentificationDatabase.model.RegistrationCitizen updateRegistrationCitizen(
		IdentificationDatabase.model.RegistrationCitizen registrationCitizen) {
		return _registrationCitizenLocalService.updateRegistrationCitizen(registrationCitizen);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _registrationCitizenLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _registrationCitizenLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _registrationCitizenLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _registrationCitizenLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _registrationCitizenLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of registration citizens.
	*
	* @return the number of registration citizens
	*/
	@Override
	public int getRegistrationCitizensCount() {
		return _registrationCitizenLocalService.getRegistrationCitizensCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _registrationCitizenLocalService.getOSGiServiceIdentifier();
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
		return _registrationCitizenLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _registrationCitizenLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _registrationCitizenLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForCode(
		java.lang.String code)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationCitizenLocalService.getCitizenForCode(code);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForHouseNo_kebele(
		java.lang.String houseNo, java.lang.String kebele)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationCitizenLocalService.getCitizenForHouseNo_kebele(houseNo,
			kebele);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForId(
		long _id) throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationCitizenLocalService.getCitizenForId(_id);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForIssueKebeleOccStat(
		java.util.Date issueDate, java.lang.String kebele,
		java.lang.String occupation, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationCitizenLocalService.getCitizenForIssueKebeleOccStat(issueDate,
			kebele, occupation, status);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForIssueKebeleSexOccStat(
		java.util.Date issueDate, java.lang.String kebele,
		java.lang.String sex, java.lang.String occupation, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationCitizenLocalService.getCitizenForIssueKebeleSexOccStat(issueDate,
			kebele, sex, occupation, status);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForIssueKebeleSexStat(
		java.util.Date issueDate, java.lang.String kebele,
		java.lang.String sex, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationCitizenLocalService.getCitizenForIssueKebeleSexStat(issueDate,
			kebele, sex, status);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForIssueKebeleStat(
		java.util.Date issueDate, java.lang.String kebele, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationCitizenLocalService.getCitizenForIssueKebeleStat(issueDate,
			kebele, status);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.RegistrationCitizen> getCitizenForStatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationCitizenLocalService.getCitizenForStatus(status);
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
	@Override
	public java.util.List<IdentificationDatabase.model.RegistrationCitizen> getRegistrationCitizens(
		int start, int end) {
		return _registrationCitizenLocalService.getRegistrationCitizens(start,
			end);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.RegistrationCitizen> getReportForIssueDate_kebele(
		java.util.Date issueDate, java.lang.String kebele)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _registrationCitizenLocalService.getReportForIssueDate_kebele(issueDate,
			kebele);
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
		return _registrationCitizenLocalService.dynamicQueryCount(dynamicQuery);
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
		return _registrationCitizenLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public RegistrationCitizenLocalService getWrappedService() {
		return _registrationCitizenLocalService;
	}

	@Override
	public void setWrappedService(
		RegistrationCitizenLocalService registrationCitizenLocalService) {
		_registrationCitizenLocalService = registrationCitizenLocalService;
	}

	private RegistrationCitizenLocalService _registrationCitizenLocalService;
}