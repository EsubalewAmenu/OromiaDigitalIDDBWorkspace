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

import IdentificationDatabase.model.RegistrationCitizen;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for RegistrationCitizen. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationCitizenLocalServiceUtil
 * @see IdentificationDatabase.service.base.RegistrationCitizenLocalServiceBaseImpl
 * @see IdentificationDatabase.service.impl.RegistrationCitizenLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface RegistrationCitizenLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegistrationCitizenLocalServiceUtil} to access the registration citizen local service. Add custom service methods to {@link IdentificationDatabase.service.impl.RegistrationCitizenLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the registration citizen to the database. Also notifies the appropriate model listeners.
	*
	* @param registrationCitizen the registration citizen
	* @return the registration citizen that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RegistrationCitizen addRegistrationCitizen(
		RegistrationCitizen registrationCitizen);

	/**
	* Creates a new registration citizen with the primary key. Does not add the registration citizen to the database.
	*
	* @param id the primary key for the new registration citizen
	* @return the new registration citizen
	*/
	public RegistrationCitizen createRegistrationCitizen(long id);

	/**
	* Deletes the registration citizen from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationCitizen the registration citizen
	* @return the registration citizen that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public RegistrationCitizen deleteRegistrationCitizen(
		RegistrationCitizen registrationCitizen);

	/**
	* Deletes the registration citizen with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen that was removed
	* @throws PortalException if a registration citizen with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public RegistrationCitizen deleteRegistrationCitizen(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationCitizen fetchRegistrationCitizen(long id);

	/**
	* Returns the registration citizen with the primary key.
	*
	* @param id the primary key of the registration citizen
	* @return the registration citizen
	* @throws PortalException if a registration citizen with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RegistrationCitizen getRegistrationCitizen(long id)
		throws PortalException;

	/**
	* Updates the registration citizen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param registrationCitizen the registration citizen
	* @return the registration citizen that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RegistrationCitizen updateRegistrationCitizen(
		RegistrationCitizen registrationCitizen);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of registration citizens.
	*
	* @return the number of registration citizens
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRegistrationCitizensCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationCitizen> getCitizenForCode(java.lang.String code)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationCitizen> getCitizenForHouseNo_kebele(
		java.lang.String houseNo, java.lang.String kebele)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationCitizen> getCitizenForId(long _id)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationCitizen> getCitizenForIssueKebeleOccStat(
		Date issueDate, java.lang.String kebele, java.lang.String occupation,
		int status) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationCitizen> getCitizenForIssueKebeleSexOccStat(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		java.lang.String occupation, int status) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationCitizen> getCitizenForIssueKebeleSexStat(
		Date issueDate, java.lang.String kebele, java.lang.String sex,
		int status) throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationCitizen> getCitizenForIssueKebeleStat(
		Date issueDate, java.lang.String kebele, int status)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationCitizen> getCitizenForStatus(int status)
		throws SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationCitizen> getRegistrationCitizens(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RegistrationCitizen> getReportForIssueDate_kebele(
		Date issueDate, java.lang.String kebele) throws SystemException;

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}