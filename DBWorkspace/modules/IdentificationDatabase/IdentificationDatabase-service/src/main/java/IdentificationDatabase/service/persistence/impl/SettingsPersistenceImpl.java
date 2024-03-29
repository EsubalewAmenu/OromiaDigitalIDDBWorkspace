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

package IdentificationDatabase.service.persistence.impl;

import IdentificationDatabase.exception.NoSuchSettingsException;

import IdentificationDatabase.model.Settings;

import IdentificationDatabase.model.impl.SettingsImpl;
import IdentificationDatabase.model.impl.SettingsModelImpl;

import IdentificationDatabase.service.persistence.SettingsPersistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the settings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SettingsPersistence
 * @see IdentificationDatabase.service.persistence.SettingsUtil
 * @generated
 */
@ProviderType
public class SettingsPersistenceImpl extends BasePersistenceImpl<Settings>
	implements SettingsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link SettingsUtil} to access the settings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = SettingsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SettingsModelImpl.ENTITY_CACHE_ENABLED,
			SettingsModelImpl.FINDER_CACHE_ENABLED, SettingsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SettingsModelImpl.ENTITY_CACHE_ENABLED,
			SettingsModelImpl.FINDER_CACHE_ENABLED, SettingsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SettingsModelImpl.ENTITY_CACHE_ENABLED,
			SettingsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public SettingsPersistenceImpl() {
		setModelClass(Settings.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("id", "id_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the settings in the entity cache if it is enabled.
	 *
	 * @param settings the settings
	 */
	@Override
	public void cacheResult(Settings settings) {
		entityCache.putResult(SettingsModelImpl.ENTITY_CACHE_ENABLED,
			SettingsImpl.class, settings.getPrimaryKey(), settings);

		settings.resetOriginalValues();
	}

	/**
	 * Caches the settingses in the entity cache if it is enabled.
	 *
	 * @param settingses the settingses
	 */
	@Override
	public void cacheResult(List<Settings> settingses) {
		for (Settings settings : settingses) {
			if (entityCache.getResult(SettingsModelImpl.ENTITY_CACHE_ENABLED,
						SettingsImpl.class, settings.getPrimaryKey()) == null) {
				cacheResult(settings);
			}
			else {
				settings.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all settingses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SettingsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the settings.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Settings settings) {
		entityCache.removeResult(SettingsModelImpl.ENTITY_CACHE_ENABLED,
			SettingsImpl.class, settings.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Settings> settingses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Settings settings : settingses) {
			entityCache.removeResult(SettingsModelImpl.ENTITY_CACHE_ENABLED,
				SettingsImpl.class, settings.getPrimaryKey());
		}
	}

	/**
	 * Creates a new settings with the primary key. Does not add the settings to the database.
	 *
	 * @param id the primary key for the new settings
	 * @return the new settings
	 */
	@Override
	public Settings create(long id) {
		Settings settings = new SettingsImpl();

		settings.setNew(true);
		settings.setPrimaryKey(id);

		settings.setCompanyId(companyProvider.getCompanyId());

		return settings;
	}

	/**
	 * Removes the settings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the settings
	 * @return the settings that was removed
	 * @throws NoSuchSettingsException if a settings with the primary key could not be found
	 */
	@Override
	public Settings remove(long id) throws NoSuchSettingsException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the settings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the settings
	 * @return the settings that was removed
	 * @throws NoSuchSettingsException if a settings with the primary key could not be found
	 */
	@Override
	public Settings remove(Serializable primaryKey)
		throws NoSuchSettingsException {
		Session session = null;

		try {
			session = openSession();

			Settings settings = (Settings)session.get(SettingsImpl.class,
					primaryKey);

			if (settings == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSettingsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(settings);
		}
		catch (NoSuchSettingsException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Settings removeImpl(Settings settings) {
		settings = toUnwrappedModel(settings);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(settings)) {
				settings = (Settings)session.get(SettingsImpl.class,
						settings.getPrimaryKeyObj());
			}

			if (settings != null) {
				session.delete(settings);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (settings != null) {
			clearCache(settings);
		}

		return settings;
	}

	@Override
	public Settings updateImpl(Settings settings) {
		settings = toUnwrappedModel(settings);

		boolean isNew = settings.isNew();

		SettingsModelImpl settingsModelImpl = (SettingsModelImpl)settings;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (settings.getCreateDate() == null)) {
			if (serviceContext == null) {
				settings.setCreateDate(now);
			}
			else {
				settings.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!settingsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				settings.setModifiedDate(now);
			}
			else {
				settings.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (settings.isNew()) {
				session.save(settings);

				settings.setNew(false);
			}
			else {
				settings = (Settings)session.merge(settings);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(SettingsModelImpl.ENTITY_CACHE_ENABLED,
			SettingsImpl.class, settings.getPrimaryKey(), settings, false);

		settings.resetOriginalValues();

		return settings;
	}

	protected Settings toUnwrappedModel(Settings settings) {
		if (settings instanceof SettingsImpl) {
			return settings;
		}

		SettingsImpl settingsImpl = new SettingsImpl();

		settingsImpl.setNew(settings.isNew());
		settingsImpl.setPrimaryKey(settings.getPrimaryKey());

		settingsImpl.setId(settings.getId());
		settingsImpl.setGroupId(settings.getGroupId());
		settingsImpl.setCompanyId(settings.getCompanyId());
		settingsImpl.setUserId(settings.getUserId());
		settingsImpl.setUserName(settings.getUserName());
		settingsImpl.setCreateDate(settings.getCreateDate());
		settingsImpl.setModifiedDate(settings.getModifiedDate());
		settingsImpl.setAssignedUserId(settings.getAssignedUserId());
		settingsImpl.setOrganizationId(settings.getOrganizationId());
		settingsImpl.setRoleId(settings.getRoleId());
		settingsImpl.setRemark(settings.getRemark());

		return settingsImpl;
	}

	/**
	 * Returns the settings with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the settings
	 * @return the settings
	 * @throws NoSuchSettingsException if a settings with the primary key could not be found
	 */
	@Override
	public Settings findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSettingsException {
		Settings settings = fetchByPrimaryKey(primaryKey);

		if (settings == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSettingsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return settings;
	}

	/**
	 * Returns the settings with the primary key or throws a {@link NoSuchSettingsException} if it could not be found.
	 *
	 * @param id the primary key of the settings
	 * @return the settings
	 * @throws NoSuchSettingsException if a settings with the primary key could not be found
	 */
	@Override
	public Settings findByPrimaryKey(long id) throws NoSuchSettingsException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the settings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the settings
	 * @return the settings, or <code>null</code> if a settings with the primary key could not be found
	 */
	@Override
	public Settings fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(SettingsModelImpl.ENTITY_CACHE_ENABLED,
				SettingsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Settings settings = (Settings)serializable;

		if (settings == null) {
			Session session = null;

			try {
				session = openSession();

				settings = (Settings)session.get(SettingsImpl.class, primaryKey);

				if (settings != null) {
					cacheResult(settings);
				}
				else {
					entityCache.putResult(SettingsModelImpl.ENTITY_CACHE_ENABLED,
						SettingsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(SettingsModelImpl.ENTITY_CACHE_ENABLED,
					SettingsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return settings;
	}

	/**
	 * Returns the settings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the settings
	 * @return the settings, or <code>null</code> if a settings with the primary key could not be found
	 */
	@Override
	public Settings fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, Settings> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Settings> map = new HashMap<Serializable, Settings>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Settings settings = fetchByPrimaryKey(primaryKey);

			if (settings != null) {
				map.put(primaryKey, settings);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(SettingsModelImpl.ENTITY_CACHE_ENABLED,
					SettingsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Settings)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SETTINGS_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Settings settings : (List<Settings>)q.list()) {
				map.put(settings.getPrimaryKeyObj(), settings);

				cacheResult(settings);

				uncachedPrimaryKeys.remove(settings.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(SettingsModelImpl.ENTITY_CACHE_ENABLED,
					SettingsImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the settingses.
	 *
	 * @return the settingses
	 */
	@Override
	public List<Settings> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Settings> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Settings> findAll(int start, int end,
		OrderByComparator<Settings> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Settings> findAll(int start, int end,
		OrderByComparator<Settings> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Settings> list = null;

		if (retrieveFromCache) {
			list = (List<Settings>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SETTINGS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SETTINGS;

				if (pagination) {
					sql = sql.concat(SettingsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Settings>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Settings>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the settingses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Settings settings : findAll()) {
			remove(settings);
		}
	}

	/**
	 * Returns the number of settingses.
	 *
	 * @return the number of settingses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SETTINGS);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SettingsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the settings persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(SettingsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SETTINGS = "SELECT settings FROM Settings settings";
	private static final String _SQL_SELECT_SETTINGS_WHERE_PKS_IN = "SELECT settings FROM Settings settings WHERE id_ IN (";
	private static final String _SQL_COUNT_SETTINGS = "SELECT COUNT(settings) FROM Settings settings";
	private static final String _ORDER_BY_ENTITY_ALIAS = "settings.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Settings exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(SettingsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}