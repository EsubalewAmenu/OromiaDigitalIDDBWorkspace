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

import IdentificationDatabase.exception.NoSuchSettingsException;

import IdentificationDatabase.model.Settings;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the settings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see IdentificationDatabase.service.persistence.impl.SettingsPersistenceImpl
 * @see SettingsUtil
 * @generated
 */
@ProviderType
public interface SettingsPersistence extends BasePersistence<Settings> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SettingsUtil} to access the settings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the settings in the entity cache if it is enabled.
	*
	* @param settings the settings
	*/
	public void cacheResult(Settings settings);

	/**
	* Caches the settingses in the entity cache if it is enabled.
	*
	* @param settingses the settingses
	*/
	public void cacheResult(java.util.List<Settings> settingses);

	/**
	* Creates a new settings with the primary key. Does not add the settings to the database.
	*
	* @param id the primary key for the new settings
	* @return the new settings
	*/
	public Settings create(long id);

	/**
	* Removes the settings with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the settings
	* @return the settings that was removed
	* @throws NoSuchSettingsException if a settings with the primary key could not be found
	*/
	public Settings remove(long id) throws NoSuchSettingsException;

	public Settings updateImpl(Settings settings);

	/**
	* Returns the settings with the primary key or throws a {@link NoSuchSettingsException} if it could not be found.
	*
	* @param id the primary key of the settings
	* @return the settings
	* @throws NoSuchSettingsException if a settings with the primary key could not be found
	*/
	public Settings findByPrimaryKey(long id) throws NoSuchSettingsException;

	/**
	* Returns the settings with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the settings
	* @return the settings, or <code>null</code> if a settings with the primary key could not be found
	*/
	public Settings fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, Settings> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the settingses.
	*
	* @return the settingses
	*/
	public java.util.List<Settings> findAll();

	/**
	* Returns a range of all the settingses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SettingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of settingses
	* @param end the upper bound of the range of settingses (not inclusive)
	* @return the range of settingses
	*/
	public java.util.List<Settings> findAll(int start, int end);

	/**
	* Returns an ordered range of all the settingses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SettingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of settingses
	* @param end the upper bound of the range of settingses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of settingses
	*/
	public java.util.List<Settings> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Settings> orderByComparator);

	/**
	* Returns an ordered range of all the settingses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SettingsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of settingses
	* @param end the upper bound of the range of settingses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of settingses
	*/
	public java.util.List<Settings> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Settings> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the settingses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of settingses.
	*
	* @return the number of settingses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}