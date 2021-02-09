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
 * Provides a wrapper for {@link KebelesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see KebelesLocalService
 * @generated
 */
@ProviderType
public class KebelesLocalServiceWrapper implements KebelesLocalService,
	ServiceWrapper<KebelesLocalService> {
	public KebelesLocalServiceWrapper(KebelesLocalService kebelesLocalService) {
		_kebelesLocalService = kebelesLocalService;
	}

	/**
	* Adds the kebeles to the database. Also notifies the appropriate model listeners.
	*
	* @param kebeles the kebeles
	* @return the kebeles that was added
	*/
	@Override
	public IdentificationDatabase.model.Kebeles addKebeles(
		IdentificationDatabase.model.Kebeles kebeles) {
		return _kebelesLocalService.addKebeles(kebeles);
	}

	/**
	* Creates a new kebeles with the primary key. Does not add the kebeles to the database.
	*
	* @param id the primary key for the new kebeles
	* @return the new kebeles
	*/
	@Override
	public IdentificationDatabase.model.Kebeles createKebeles(long id) {
		return _kebelesLocalService.createKebeles(id);
	}

	/**
	* Deletes the kebeles from the database. Also notifies the appropriate model listeners.
	*
	* @param kebeles the kebeles
	* @return the kebeles that was removed
	*/
	@Override
	public IdentificationDatabase.model.Kebeles deleteKebeles(
		IdentificationDatabase.model.Kebeles kebeles) {
		return _kebelesLocalService.deleteKebeles(kebeles);
	}

	/**
	* Deletes the kebeles with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kebeles
	* @return the kebeles that was removed
	* @throws PortalException if a kebeles with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.Kebeles deleteKebeles(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kebelesLocalService.deleteKebeles(id);
	}

	@Override
	public IdentificationDatabase.model.Kebeles fetchKebeles(long id) {
		return _kebelesLocalService.fetchKebeles(id);
	}

	/**
	* Returns the kebeles with the primary key.
	*
	* @param id the primary key of the kebeles
	* @return the kebeles
	* @throws PortalException if a kebeles with the primary key could not be found
	*/
	@Override
	public IdentificationDatabase.model.Kebeles getKebeles(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kebelesLocalService.getKebeles(id);
	}

	/**
	* Updates the kebeles in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param kebeles the kebeles
	* @return the kebeles that was updated
	*/
	@Override
	public IdentificationDatabase.model.Kebeles updateKebeles(
		IdentificationDatabase.model.Kebeles kebeles) {
		return _kebelesLocalService.updateKebeles(kebeles);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _kebelesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _kebelesLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _kebelesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kebelesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kebelesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of kebeleses.
	*
	* @return the number of kebeleses
	*/
	@Override
	public int getKebelesesCount() {
		return _kebelesLocalService.getKebelesesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _kebelesLocalService.getOSGiServiceIdentifier();
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
		return _kebelesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kebelesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _kebelesLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.Kebeles> getKebeleByAm(
		java.lang.String kebele_AM)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kebelesLocalService.getKebeleByAm(kebele_AM);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.Kebeles> getKebeleByOr(
		java.lang.String kebele_OR)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kebelesLocalService.getKebeleByOr(kebele_OR);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.Kebeles> getKebeleByPrinterName(
		java.lang.String printerName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kebelesLocalService.getKebeleByPrinterName(printerName);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.Kebeles> getKebeleBySubcityAm(
		java.lang.String Subcity_AM)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kebelesLocalService.getKebeleBySubcityAm(Subcity_AM);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.Kebeles> getKebeleBySubcityOr(
		java.lang.String Subcity_OR)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _kebelesLocalService.getKebeleBySubcityOr(Subcity_OR);
	}

	@Override
	public java.util.List<IdentificationDatabase.model.Kebeles> getKebeleForId(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _kebelesLocalService.getKebeleForId(id);
	}

	/**
	* Returns a range of all the kebeleses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kebeleses
	* @param end the upper bound of the range of kebeleses (not inclusive)
	* @return the range of kebeleses
	*/
	@Override
	public java.util.List<IdentificationDatabase.model.Kebeles> getKebeleses(
		int start, int end) {
		return _kebelesLocalService.getKebeleses(start, end);
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
		return _kebelesLocalService.dynamicQueryCount(dynamicQuery);
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
		return _kebelesLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public KebelesLocalService getWrappedService() {
		return _kebelesLocalService;
	}

	@Override
	public void setWrappedService(KebelesLocalService kebelesLocalService) {
		_kebelesLocalService = kebelesLocalService;
	}

	private KebelesLocalService _kebelesLocalService;
}