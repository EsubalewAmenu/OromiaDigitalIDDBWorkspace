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

package IdentificationDatabase.service.base;

import IdentificationDatabase.model.TransferToOtherCity;

import IdentificationDatabase.service.TransferToOtherCityLocalService;

import IdentificationDatabase.service.persistence.AddressLookupPersistence;
import IdentificationDatabase.service.persistence.BiometricDataPersistence;
import IdentificationDatabase.service.persistence.CitizenFingerprintMatcherPersistence;
import IdentificationDatabase.service.persistence.CitizenRemarkPersistence;
import IdentificationDatabase.service.persistence.KebelesPersistence;
import IdentificationDatabase.service.persistence.PrintedHistoryPersistence;
import IdentificationDatabase.service.persistence.RegistrationCitizenPersistence;
import IdentificationDatabase.service.persistence.ServicesPersistence;
import IdentificationDatabase.service.persistence.SettingsPersistence;
import IdentificationDatabase.service.persistence.TransferToOtherCityPersistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the transfer to other city local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link IdentificationDatabase.service.impl.TransferToOtherCityLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.impl.TransferToOtherCityLocalServiceImpl
 * @see IdentificationDatabase.service.TransferToOtherCityLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class TransferToOtherCityLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements TransferToOtherCityLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link IdentificationDatabase.service.TransferToOtherCityLocalServiceUtil} to access the transfer to other city local service.
	 */

	/**
	 * Adds the transfer to other city to the database. Also notifies the appropriate model listeners.
	 *
	 * @param transferToOtherCity the transfer to other city
	 * @return the transfer to other city that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TransferToOtherCity addTransferToOtherCity(
		TransferToOtherCity transferToOtherCity) {
		transferToOtherCity.setNew(true);

		return transferToOtherCityPersistence.update(transferToOtherCity);
	}

	/**
	 * Creates a new transfer to other city with the primary key. Does not add the transfer to other city to the database.
	 *
	 * @param id the primary key for the new transfer to other city
	 * @return the new transfer to other city
	 */
	@Override
	public TransferToOtherCity createTransferToOtherCity(long id) {
		return transferToOtherCityPersistence.create(id);
	}

	/**
	 * Deletes the transfer to other city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the transfer to other city
	 * @return the transfer to other city that was removed
	 * @throws PortalException if a transfer to other city with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TransferToOtherCity deleteTransferToOtherCity(long id)
		throws PortalException {
		return transferToOtherCityPersistence.remove(id);
	}

	/**
	 * Deletes the transfer to other city from the database. Also notifies the appropriate model listeners.
	 *
	 * @param transferToOtherCity the transfer to other city
	 * @return the transfer to other city that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public TransferToOtherCity deleteTransferToOtherCity(
		TransferToOtherCity transferToOtherCity) {
		return transferToOtherCityPersistence.remove(transferToOtherCity);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(TransferToOtherCity.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return transferToOtherCityPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return transferToOtherCityPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return transferToOtherCityPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return transferToOtherCityPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return transferToOtherCityPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public TransferToOtherCity fetchTransferToOtherCity(long id) {
		return transferToOtherCityPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the transfer to other city with the primary key.
	 *
	 * @param id the primary key of the transfer to other city
	 * @return the transfer to other city
	 * @throws PortalException if a transfer to other city with the primary key could not be found
	 */
	@Override
	public TransferToOtherCity getTransferToOtherCity(long id)
		throws PortalException {
		return transferToOtherCityPersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(transferToOtherCityLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(TransferToOtherCity.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(transferToOtherCityLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(TransferToOtherCity.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(transferToOtherCityLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(TransferToOtherCity.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return transferToOtherCityLocalService.deleteTransferToOtherCity((TransferToOtherCity)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return transferToOtherCityPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the transfer to other cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link IdentificationDatabase.model.impl.TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of transfer to other cities
	 * @param end the upper bound of the range of transfer to other cities (not inclusive)
	 * @return the range of transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> getTransferToOtherCities(int start, int end) {
		return transferToOtherCityPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of transfer to other cities.
	 *
	 * @return the number of transfer to other cities
	 */
	@Override
	public int getTransferToOtherCitiesCount() {
		return transferToOtherCityPersistence.countAll();
	}

	/**
	 * Updates the transfer to other city in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param transferToOtherCity the transfer to other city
	 * @return the transfer to other city that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public TransferToOtherCity updateTransferToOtherCity(
		TransferToOtherCity transferToOtherCity) {
		return transferToOtherCityPersistence.update(transferToOtherCity);
	}

	/**
	 * Returns the address lookup local service.
	 *
	 * @return the address lookup local service
	 */
	public IdentificationDatabase.service.AddressLookupLocalService getAddressLookupLocalService() {
		return addressLookupLocalService;
	}

	/**
	 * Sets the address lookup local service.
	 *
	 * @param addressLookupLocalService the address lookup local service
	 */
	public void setAddressLookupLocalService(
		IdentificationDatabase.service.AddressLookupLocalService addressLookupLocalService) {
		this.addressLookupLocalService = addressLookupLocalService;
	}

	/**
	 * Returns the address lookup persistence.
	 *
	 * @return the address lookup persistence
	 */
	public AddressLookupPersistence getAddressLookupPersistence() {
		return addressLookupPersistence;
	}

	/**
	 * Sets the address lookup persistence.
	 *
	 * @param addressLookupPersistence the address lookup persistence
	 */
	public void setAddressLookupPersistence(
		AddressLookupPersistence addressLookupPersistence) {
		this.addressLookupPersistence = addressLookupPersistence;
	}

	/**
	 * Returns the biometric data local service.
	 *
	 * @return the biometric data local service
	 */
	public IdentificationDatabase.service.BiometricDataLocalService getBiometricDataLocalService() {
		return biometricDataLocalService;
	}

	/**
	 * Sets the biometric data local service.
	 *
	 * @param biometricDataLocalService the biometric data local service
	 */
	public void setBiometricDataLocalService(
		IdentificationDatabase.service.BiometricDataLocalService biometricDataLocalService) {
		this.biometricDataLocalService = biometricDataLocalService;
	}

	/**
	 * Returns the biometric data persistence.
	 *
	 * @return the biometric data persistence
	 */
	public BiometricDataPersistence getBiometricDataPersistence() {
		return biometricDataPersistence;
	}

	/**
	 * Sets the biometric data persistence.
	 *
	 * @param biometricDataPersistence the biometric data persistence
	 */
	public void setBiometricDataPersistence(
		BiometricDataPersistence biometricDataPersistence) {
		this.biometricDataPersistence = biometricDataPersistence;
	}

	/**
	 * Returns the citizen fingerprint matcher local service.
	 *
	 * @return the citizen fingerprint matcher local service
	 */
	public IdentificationDatabase.service.CitizenFingerprintMatcherLocalService getCitizenFingerprintMatcherLocalService() {
		return citizenFingerprintMatcherLocalService;
	}

	/**
	 * Sets the citizen fingerprint matcher local service.
	 *
	 * @param citizenFingerprintMatcherLocalService the citizen fingerprint matcher local service
	 */
	public void setCitizenFingerprintMatcherLocalService(
		IdentificationDatabase.service.CitizenFingerprintMatcherLocalService citizenFingerprintMatcherLocalService) {
		this.citizenFingerprintMatcherLocalService = citizenFingerprintMatcherLocalService;
	}

	/**
	 * Returns the citizen fingerprint matcher persistence.
	 *
	 * @return the citizen fingerprint matcher persistence
	 */
	public CitizenFingerprintMatcherPersistence getCitizenFingerprintMatcherPersistence() {
		return citizenFingerprintMatcherPersistence;
	}

	/**
	 * Sets the citizen fingerprint matcher persistence.
	 *
	 * @param citizenFingerprintMatcherPersistence the citizen fingerprint matcher persistence
	 */
	public void setCitizenFingerprintMatcherPersistence(
		CitizenFingerprintMatcherPersistence citizenFingerprintMatcherPersistence) {
		this.citizenFingerprintMatcherPersistence = citizenFingerprintMatcherPersistence;
	}

	/**
	 * Returns the citizen remark local service.
	 *
	 * @return the citizen remark local service
	 */
	public IdentificationDatabase.service.CitizenRemarkLocalService getCitizenRemarkLocalService() {
		return citizenRemarkLocalService;
	}

	/**
	 * Sets the citizen remark local service.
	 *
	 * @param citizenRemarkLocalService the citizen remark local service
	 */
	public void setCitizenRemarkLocalService(
		IdentificationDatabase.service.CitizenRemarkLocalService citizenRemarkLocalService) {
		this.citizenRemarkLocalService = citizenRemarkLocalService;
	}

	/**
	 * Returns the citizen remark persistence.
	 *
	 * @return the citizen remark persistence
	 */
	public CitizenRemarkPersistence getCitizenRemarkPersistence() {
		return citizenRemarkPersistence;
	}

	/**
	 * Sets the citizen remark persistence.
	 *
	 * @param citizenRemarkPersistence the citizen remark persistence
	 */
	public void setCitizenRemarkPersistence(
		CitizenRemarkPersistence citizenRemarkPersistence) {
		this.citizenRemarkPersistence = citizenRemarkPersistence;
	}

	/**
	 * Returns the kebeles local service.
	 *
	 * @return the kebeles local service
	 */
	public IdentificationDatabase.service.KebelesLocalService getKebelesLocalService() {
		return kebelesLocalService;
	}

	/**
	 * Sets the kebeles local service.
	 *
	 * @param kebelesLocalService the kebeles local service
	 */
	public void setKebelesLocalService(
		IdentificationDatabase.service.KebelesLocalService kebelesLocalService) {
		this.kebelesLocalService = kebelesLocalService;
	}

	/**
	 * Returns the kebeles persistence.
	 *
	 * @return the kebeles persistence
	 */
	public KebelesPersistence getKebelesPersistence() {
		return kebelesPersistence;
	}

	/**
	 * Sets the kebeles persistence.
	 *
	 * @param kebelesPersistence the kebeles persistence
	 */
	public void setKebelesPersistence(KebelesPersistence kebelesPersistence) {
		this.kebelesPersistence = kebelesPersistence;
	}

	/**
	 * Returns the printed history local service.
	 *
	 * @return the printed history local service
	 */
	public IdentificationDatabase.service.PrintedHistoryLocalService getPrintedHistoryLocalService() {
		return printedHistoryLocalService;
	}

	/**
	 * Sets the printed history local service.
	 *
	 * @param printedHistoryLocalService the printed history local service
	 */
	public void setPrintedHistoryLocalService(
		IdentificationDatabase.service.PrintedHistoryLocalService printedHistoryLocalService) {
		this.printedHistoryLocalService = printedHistoryLocalService;
	}

	/**
	 * Returns the printed history persistence.
	 *
	 * @return the printed history persistence
	 */
	public PrintedHistoryPersistence getPrintedHistoryPersistence() {
		return printedHistoryPersistence;
	}

	/**
	 * Sets the printed history persistence.
	 *
	 * @param printedHistoryPersistence the printed history persistence
	 */
	public void setPrintedHistoryPersistence(
		PrintedHistoryPersistence printedHistoryPersistence) {
		this.printedHistoryPersistence = printedHistoryPersistence;
	}

	/**
	 * Returns the registration citizen local service.
	 *
	 * @return the registration citizen local service
	 */
	public IdentificationDatabase.service.RegistrationCitizenLocalService getRegistrationCitizenLocalService() {
		return registrationCitizenLocalService;
	}

	/**
	 * Sets the registration citizen local service.
	 *
	 * @param registrationCitizenLocalService the registration citizen local service
	 */
	public void setRegistrationCitizenLocalService(
		IdentificationDatabase.service.RegistrationCitizenLocalService registrationCitizenLocalService) {
		this.registrationCitizenLocalService = registrationCitizenLocalService;
	}

	/**
	 * Returns the registration citizen persistence.
	 *
	 * @return the registration citizen persistence
	 */
	public RegistrationCitizenPersistence getRegistrationCitizenPersistence() {
		return registrationCitizenPersistence;
	}

	/**
	 * Sets the registration citizen persistence.
	 *
	 * @param registrationCitizenPersistence the registration citizen persistence
	 */
	public void setRegistrationCitizenPersistence(
		RegistrationCitizenPersistence registrationCitizenPersistence) {
		this.registrationCitizenPersistence = registrationCitizenPersistence;
	}

	/**
	 * Returns the services local service.
	 *
	 * @return the services local service
	 */
	public IdentificationDatabase.service.ServicesLocalService getServicesLocalService() {
		return servicesLocalService;
	}

	/**
	 * Sets the services local service.
	 *
	 * @param servicesLocalService the services local service
	 */
	public void setServicesLocalService(
		IdentificationDatabase.service.ServicesLocalService servicesLocalService) {
		this.servicesLocalService = servicesLocalService;
	}

	/**
	 * Returns the services persistence.
	 *
	 * @return the services persistence
	 */
	public ServicesPersistence getServicesPersistence() {
		return servicesPersistence;
	}

	/**
	 * Sets the services persistence.
	 *
	 * @param servicesPersistence the services persistence
	 */
	public void setServicesPersistence(ServicesPersistence servicesPersistence) {
		this.servicesPersistence = servicesPersistence;
	}

	/**
	 * Returns the settings local service.
	 *
	 * @return the settings local service
	 */
	public IdentificationDatabase.service.SettingsLocalService getSettingsLocalService() {
		return settingsLocalService;
	}

	/**
	 * Sets the settings local service.
	 *
	 * @param settingsLocalService the settings local service
	 */
	public void setSettingsLocalService(
		IdentificationDatabase.service.SettingsLocalService settingsLocalService) {
		this.settingsLocalService = settingsLocalService;
	}

	/**
	 * Returns the settings persistence.
	 *
	 * @return the settings persistence
	 */
	public SettingsPersistence getSettingsPersistence() {
		return settingsPersistence;
	}

	/**
	 * Sets the settings persistence.
	 *
	 * @param settingsPersistence the settings persistence
	 */
	public void setSettingsPersistence(SettingsPersistence settingsPersistence) {
		this.settingsPersistence = settingsPersistence;
	}

	/**
	 * Returns the transfer to other city local service.
	 *
	 * @return the transfer to other city local service
	 */
	public TransferToOtherCityLocalService getTransferToOtherCityLocalService() {
		return transferToOtherCityLocalService;
	}

	/**
	 * Sets the transfer to other city local service.
	 *
	 * @param transferToOtherCityLocalService the transfer to other city local service
	 */
	public void setTransferToOtherCityLocalService(
		TransferToOtherCityLocalService transferToOtherCityLocalService) {
		this.transferToOtherCityLocalService = transferToOtherCityLocalService;
	}

	/**
	 * Returns the transfer to other city persistence.
	 *
	 * @return the transfer to other city persistence
	 */
	public TransferToOtherCityPersistence getTransferToOtherCityPersistence() {
		return transferToOtherCityPersistence;
	}

	/**
	 * Sets the transfer to other city persistence.
	 *
	 * @param transferToOtherCityPersistence the transfer to other city persistence
	 */
	public void setTransferToOtherCityPersistence(
		TransferToOtherCityPersistence transferToOtherCityPersistence) {
		this.transferToOtherCityPersistence = transferToOtherCityPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("IdentificationDatabase.model.TransferToOtherCity",
			transferToOtherCityLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"IdentificationDatabase.model.TransferToOtherCity");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return TransferToOtherCityLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return TransferToOtherCity.class;
	}

	protected String getModelClassName() {
		return TransferToOtherCity.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = transferToOtherCityPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = IdentificationDatabase.service.AddressLookupLocalService.class)
	protected IdentificationDatabase.service.AddressLookupLocalService addressLookupLocalService;
	@BeanReference(type = AddressLookupPersistence.class)
	protected AddressLookupPersistence addressLookupPersistence;
	@BeanReference(type = IdentificationDatabase.service.BiometricDataLocalService.class)
	protected IdentificationDatabase.service.BiometricDataLocalService biometricDataLocalService;
	@BeanReference(type = BiometricDataPersistence.class)
	protected BiometricDataPersistence biometricDataPersistence;
	@BeanReference(type = IdentificationDatabase.service.CitizenFingerprintMatcherLocalService.class)
	protected IdentificationDatabase.service.CitizenFingerprintMatcherLocalService citizenFingerprintMatcherLocalService;
	@BeanReference(type = CitizenFingerprintMatcherPersistence.class)
	protected CitizenFingerprintMatcherPersistence citizenFingerprintMatcherPersistence;
	@BeanReference(type = IdentificationDatabase.service.CitizenRemarkLocalService.class)
	protected IdentificationDatabase.service.CitizenRemarkLocalService citizenRemarkLocalService;
	@BeanReference(type = CitizenRemarkPersistence.class)
	protected CitizenRemarkPersistence citizenRemarkPersistence;
	@BeanReference(type = IdentificationDatabase.service.KebelesLocalService.class)
	protected IdentificationDatabase.service.KebelesLocalService kebelesLocalService;
	@BeanReference(type = KebelesPersistence.class)
	protected KebelesPersistence kebelesPersistence;
	@BeanReference(type = IdentificationDatabase.service.PrintedHistoryLocalService.class)
	protected IdentificationDatabase.service.PrintedHistoryLocalService printedHistoryLocalService;
	@BeanReference(type = PrintedHistoryPersistence.class)
	protected PrintedHistoryPersistence printedHistoryPersistence;
	@BeanReference(type = IdentificationDatabase.service.RegistrationCitizenLocalService.class)
	protected IdentificationDatabase.service.RegistrationCitizenLocalService registrationCitizenLocalService;
	@BeanReference(type = RegistrationCitizenPersistence.class)
	protected RegistrationCitizenPersistence registrationCitizenPersistence;
	@BeanReference(type = IdentificationDatabase.service.ServicesLocalService.class)
	protected IdentificationDatabase.service.ServicesLocalService servicesLocalService;
	@BeanReference(type = ServicesPersistence.class)
	protected ServicesPersistence servicesPersistence;
	@BeanReference(type = IdentificationDatabase.service.SettingsLocalService.class)
	protected IdentificationDatabase.service.SettingsLocalService settingsLocalService;
	@BeanReference(type = SettingsPersistence.class)
	protected SettingsPersistence settingsPersistence;
	@BeanReference(type = TransferToOtherCityLocalService.class)
	protected TransferToOtherCityLocalService transferToOtherCityLocalService;
	@BeanReference(type = TransferToOtherCityPersistence.class)
	protected TransferToOtherCityPersistence transferToOtherCityPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}