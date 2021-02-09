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
 * Provides a wrapper for {@link CitizenRemarkLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CitizenRemarkLocalService
 * @generated
 */
@ProviderType
public class CitizenRemarkLocalServiceWrapper
	implements CitizenRemarkLocalService,
		ServiceWrapper<CitizenRemarkLocalService> {
	public CitizenRemarkLocalServiceWrapper(
		CitizenRemarkLocalService citizenRemarkLocalService) {
		_citizenRemarkLocalService = citizenRemarkLocalService;
	}

	/**
	* Adds the citizen remark to the database. Also notifies the appropriate model listeners.
	*
	* @param citizenRemark the citizen remark
	* @return the citizen remark that was added
	*/
	@Override
	public IdentificationDatabase.model.CitizenRemark addCitizenRemark(
		IdentificationDatabase.model.CitizenRemark citizenRemark) {
		return _citizenRemarkLocalService.addCitizenRemark(citizenRemark);
	}

	/**
	* Creates a new citizen remark with the primary key. Does not add the citizen remark to the database.
	*
	* @param id the primary key for the new citizen remark
	* @return the new citizen remark
	*/
	@Override
	public IdentificationDatabase.model.CitizenRemark createCitizenRemark(
		long id) {
		return _citizenRemarkLocalService.createCitizenRemark(id);
	}

	/**
	* Deletes the citizen remark from the database. Also notifies the appropriate model listeners.
	*
	* @param citizenRemark the citizen remark
	* @return the citizen remark that was removed
	*/
	@Override
	public IdentificationDatabase.model.CitizenRemark deleteCitizenRemark(
		IdentificationDatabase.model.CitizenRemark citizenRemark) {
		return _citizenRemarkLocalService.deleteCitizenRemark(citizenRemark);
	}

	/**
	* Deletes the citizen remark with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the citizen remark
	* @return the citizen remark that was removed
	* @throws PortalException if a citizen remark with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.CitizenRemark deleteCitizenRemark(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _citizenRemarkLocalService.deleteCitizenRemark(id);
	}

	@Override
	public IdentificationDatabase.model.CitizenRemark fetchCitizenRemark(
		long id) {
		return _citizenRemarkLocalService.fetchCitizenRemark(id);
	}

	/**
	* Returns the citizen remark with the primary key.
	*
	* @param id the primary key of the citizen remark
	* @return the citizen remark
	* @throws PortalException if a citizen remark with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.CitizenRemark getCitizenRemark(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _citizenRemarkLocalService.getCitizenRemark(id);
	}

	/**
	* Updates the citizen remark in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param citizenRemark the citizen remark
	* @return the citizen remark that was updated
	*/
	@Override
	public IdentificationDatabase.model.CitizenRemark updateCitizenRemark(
		IdentificationDatabase.model.CitizenRemark citizenRemark) {
		return _citizenRemarkLocalService.updateCitizenRemark(citizenRemark);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _citizenRemarkLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _citizenRemarkLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _citizenRemarkLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _citizenRemarkLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _citizenRemarkLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of citizen remarks.
	*
	* @return the number of citizen remarks
	*/
	@Override
	public int getCitizenRemarksCount() {
		return _citizenRemarkLocalService.getCitizenRemarksCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _citizenRemarkLocalService.getOSGiServiceIdentifier();
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
		return _citizenRemarkLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _citizenRemarkLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _citizenRemarkLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the citizen remarks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of citizen remarks
	* @param end the upper bound of the range of citizen remarks (not inclusive)
	* @return the range of citizen remarks
	*/
	@Override
	public java.util.List<IdentificationDatabase.model.CitizenRemark> getCitizenRemarks(
		int start, int end) {
		return _citizenRemarkLocalService.getCitizenRemarks(start, end);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.CitizenRemark> getRemarkForCitizenId(
		long _citizenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenRemarkLocalService.getRemarkForCitizenId(_citizenId);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.CitizenRemark> getRemarkForId(
		long _id) throws com.liferay.portal.kernel.exception.SystemException {
		return _citizenRemarkLocalService.getRemarkForId(_id);
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
		return _citizenRemarkLocalService.dynamicQueryCount(dynamicQuery);
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
		return _citizenRemarkLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public CitizenRemarkLocalService getWrappedService() {
		return _citizenRemarkLocalService;
	}

	@Override
	public void setWrappedService(
		CitizenRemarkLocalService citizenRemarkLocalService) {
		_citizenRemarkLocalService = citizenRemarkLocalService;
	}

	private CitizenRemarkLocalService _citizenRemarkLocalService;
}