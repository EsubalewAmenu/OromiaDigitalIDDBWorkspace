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

import IdentificationDatabase.exception.NoSuchBiometricDataException;

import IdentificationDatabase.model.BiometricData;

import IdentificationDatabase.model.impl.BiometricDataImpl;
import IdentificationDatabase.model.impl.BiometricDataModelImpl;

import IdentificationDatabase.service.persistence.BiometricDataPersistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
 * The persistence implementation for the biometric data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BiometricDataPersistence
 * @see IdentificationDatabase.service.persistence.BiometricDataUtil
 * @generated
 */
@ProviderType
public class BiometricDataPersistenceImpl extends BasePersistenceImpl<BiometricData>
	implements BiometricDataPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link BiometricDataUtil} to access the biometric data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = BiometricDataImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
			BiometricDataModelImpl.FINDER_CACHE_ENABLED,
			BiometricDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
			BiometricDataModelImpl.FINDER_CACHE_ENABLED,
			BiometricDataImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
			BiometricDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CITIZENID =
		new FinderPath(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
			BiometricDataModelImpl.FINDER_CACHE_ENABLED,
			BiometricDataImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycitizenId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID =
		new FinderPath(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
			BiometricDataModelImpl.FINDER_CACHE_ENABLED,
			BiometricDataImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycitizenId", new String[] { Long.class.getName() },
			BiometricDataModelImpl.CITIZENID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CITIZENID = new FinderPath(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
			BiometricDataModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycitizenId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the biometric datas where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @return the matching biometric datas
	 */
	@Override
	public List<BiometricData> findBycitizenId(long citizenId) {
		return findBycitizenId(citizenId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the biometric datas where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of biometric datas
	 * @param end the upper bound of the range of biometric datas (not inclusive)
	 * @return the range of matching biometric datas
	 */
	@Override
	public List<BiometricData> findBycitizenId(long citizenId, int start,
		int end) {
		return findBycitizenId(citizenId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the biometric datas where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of biometric datas
	 * @param end the upper bound of the range of biometric datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching biometric datas
	 */
	@Override
	public List<BiometricData> findBycitizenId(long citizenId, int start,
		int end, OrderByComparator<BiometricData> orderByComparator) {
		return findBycitizenId(citizenId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the biometric datas where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of biometric datas
	 * @param end the upper bound of the range of biometric datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching biometric datas
	 */
	@Override
	public List<BiometricData> findBycitizenId(long citizenId, int start,
		int end, OrderByComparator<BiometricData> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID;
			finderArgs = new Object[] { citizenId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CITIZENID;
			finderArgs = new Object[] { citizenId, start, end, orderByComparator };
		}

		List<BiometricData> list = null;

		if (retrieveFromCache) {
			list = (List<BiometricData>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (BiometricData biometricData : list) {
					if ((citizenId != biometricData.getCitizenId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_BIOMETRICDATA_WHERE);

			query.append(_FINDER_COLUMN_CITIZENID_CITIZENID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(BiometricDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(citizenId);

				if (!pagination) {
					list = (List<BiometricData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BiometricData>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first biometric data in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching biometric data
	 * @throws NoSuchBiometricDataException if a matching biometric data could not be found
	 */
	@Override
	public BiometricData findBycitizenId_First(long citizenId,
		OrderByComparator<BiometricData> orderByComparator)
		throws NoSuchBiometricDataException {
		BiometricData biometricData = fetchBycitizenId_First(citizenId,
				orderByComparator);

		if (biometricData != null) {
			return biometricData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBiometricDataException(msg.toString());
	}

	/**
	 * Returns the first biometric data in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching biometric data, or <code>null</code> if a matching biometric data could not be found
	 */
	@Override
	public BiometricData fetchBycitizenId_First(long citizenId,
		OrderByComparator<BiometricData> orderByComparator) {
		List<BiometricData> list = findBycitizenId(citizenId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last biometric data in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching biometric data
	 * @throws NoSuchBiometricDataException if a matching biometric data could not be found
	 */
	@Override
	public BiometricData findBycitizenId_Last(long citizenId,
		OrderByComparator<BiometricData> orderByComparator)
		throws NoSuchBiometricDataException {
		BiometricData biometricData = fetchBycitizenId_Last(citizenId,
				orderByComparator);

		if (biometricData != null) {
			return biometricData;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchBiometricDataException(msg.toString());
	}

	/**
	 * Returns the last biometric data in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching biometric data, or <code>null</code> if a matching biometric data could not be found
	 */
	@Override
	public BiometricData fetchBycitizenId_Last(long citizenId,
		OrderByComparator<BiometricData> orderByComparator) {
		int count = countBycitizenId(citizenId);

		if (count == 0) {
			return null;
		}

		List<BiometricData> list = findBycitizenId(citizenId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the biometric datas before and after the current biometric data in the ordered set where citizenId = &#63;.
	 *
	 * @param id the primary key of the current biometric data
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next biometric data
	 * @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	 */
	@Override
	public BiometricData[] findBycitizenId_PrevAndNext(long id, long citizenId,
		OrderByComparator<BiometricData> orderByComparator)
		throws NoSuchBiometricDataException {
		BiometricData biometricData = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			BiometricData[] array = new BiometricDataImpl[3];

			array[0] = getBycitizenId_PrevAndNext(session, biometricData,
					citizenId, orderByComparator, true);

			array[1] = biometricData;

			array[2] = getBycitizenId_PrevAndNext(session, biometricData,
					citizenId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected BiometricData getBycitizenId_PrevAndNext(Session session,
		BiometricData biometricData, long citizenId,
		OrderByComparator<BiometricData> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_BIOMETRICDATA_WHERE);

		query.append(_FINDER_COLUMN_CITIZENID_CITIZENID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(BiometricDataModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(citizenId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(biometricData);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<BiometricData> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the biometric datas where citizenId = &#63; from the database.
	 *
	 * @param citizenId the citizen ID
	 */
	@Override
	public void removeBycitizenId(long citizenId) {
		for (BiometricData biometricData : findBycitizenId(citizenId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(biometricData);
		}
	}

	/**
	 * Returns the number of biometric datas where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @return the number of matching biometric datas
	 */
	@Override
	public int countBycitizenId(long citizenId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CITIZENID;

		Object[] finderArgs = new Object[] { citizenId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_BIOMETRICDATA_WHERE);

			query.append(_FINDER_COLUMN_CITIZENID_CITIZENID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(citizenId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CITIZENID_CITIZENID_2 = "biometricData.citizenId = ?";

	public BiometricDataPersistenceImpl() {
		setModelClass(BiometricData.class);

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
	 * Caches the biometric data in the entity cache if it is enabled.
	 *
	 * @param biometricData the biometric data
	 */
	@Override
	public void cacheResult(BiometricData biometricData) {
		entityCache.putResult(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
			BiometricDataImpl.class, biometricData.getPrimaryKey(),
			biometricData);

		biometricData.resetOriginalValues();
	}

	/**
	 * Caches the biometric datas in the entity cache if it is enabled.
	 *
	 * @param biometricDatas the biometric datas
	 */
	@Override
	public void cacheResult(List<BiometricData> biometricDatas) {
		for (BiometricData biometricData : biometricDatas) {
			if (entityCache.getResult(
						BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
						BiometricDataImpl.class, biometricData.getPrimaryKey()) == null) {
				cacheResult(biometricData);
			}
			else {
				biometricData.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all biometric datas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(BiometricDataImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the biometric data.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(BiometricData biometricData) {
		entityCache.removeResult(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
			BiometricDataImpl.class, biometricData.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<BiometricData> biometricDatas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (BiometricData biometricData : biometricDatas) {
			entityCache.removeResult(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
				BiometricDataImpl.class, biometricData.getPrimaryKey());
		}
	}

	/**
	 * Creates a new biometric data with the primary key. Does not add the biometric data to the database.
	 *
	 * @param id the primary key for the new biometric data
	 * @return the new biometric data
	 */
	@Override
	public BiometricData create(long id) {
		BiometricData biometricData = new BiometricDataImpl();

		biometricData.setNew(true);
		biometricData.setPrimaryKey(id);

		biometricData.setCompanyId(companyProvider.getCompanyId());

		return biometricData;
	}

	/**
	 * Removes the biometric data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the biometric data
	 * @return the biometric data that was removed
	 * @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	 */
	@Override
	public BiometricData remove(long id) throws NoSuchBiometricDataException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the biometric data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the biometric data
	 * @return the biometric data that was removed
	 * @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	 */
	@Override
	public BiometricData remove(Serializable primaryKey)
		throws NoSuchBiometricDataException {
		Session session = null;

		try {
			session = openSession();

			BiometricData biometricData = (BiometricData)session.get(BiometricDataImpl.class,
					primaryKey);

			if (biometricData == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchBiometricDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(biometricData);
		}
		catch (NoSuchBiometricDataException nsee) {
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
	protected BiometricData removeImpl(BiometricData biometricData) {
		biometricData = toUnwrappedModel(biometricData);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(biometricData)) {
				biometricData = (BiometricData)session.get(BiometricDataImpl.class,
						biometricData.getPrimaryKeyObj());
			}

			if (biometricData != null) {
				session.delete(biometricData);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (biometricData != null) {
			clearCache(biometricData);
		}

		return biometricData;
	}

	@Override
	public BiometricData updateImpl(BiometricData biometricData) {
		biometricData = toUnwrappedModel(biometricData);

		boolean isNew = biometricData.isNew();

		BiometricDataModelImpl biometricDataModelImpl = (BiometricDataModelImpl)biometricData;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (biometricData.getCreateDate() == null)) {
			if (serviceContext == null) {
				biometricData.setCreateDate(now);
			}
			else {
				biometricData.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!biometricDataModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				biometricData.setModifiedDate(now);
			}
			else {
				biometricData.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (biometricData.isNew()) {
				session.save(biometricData);

				biometricData.setNew(false);
			}
			else {
				session.evict(biometricData);
				session.saveOrUpdate(biometricData);
			}

			session.flush();
			session.clear();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!BiometricDataModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { biometricDataModelImpl.getCitizenId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((biometricDataModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						biometricDataModelImpl.getOriginalCitizenId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
					args);

				args = new Object[] { biometricDataModelImpl.getCitizenId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
					args);
			}
		}

		entityCache.putResult(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
			BiometricDataImpl.class, biometricData.getPrimaryKey(),
			biometricData, false);

		biometricData.resetOriginalValues();

		return biometricData;
	}

	protected BiometricData toUnwrappedModel(BiometricData biometricData) {
		if (biometricData instanceof BiometricDataImpl) {
			return biometricData;
		}

		BiometricDataImpl biometricDataImpl = new BiometricDataImpl();

		biometricDataImpl.setNew(biometricData.isNew());
		biometricDataImpl.setPrimaryKey(biometricData.getPrimaryKey());

		biometricDataImpl.setId(biometricData.getId());
		biometricDataImpl.setGroupId(biometricData.getGroupId());
		biometricDataImpl.setCompanyId(biometricData.getCompanyId());
		biometricDataImpl.setUserId(biometricData.getUserId());
		biometricDataImpl.setUserName(biometricData.getUserName());
		biometricDataImpl.setCreateDate(biometricData.getCreateDate());
		biometricDataImpl.setModifiedDate(biometricData.getModifiedDate());
		biometricDataImpl.setCitizenId(biometricData.getCitizenId());
		biometricDataImpl.setFingerType(biometricData.getFingerType());
		biometricDataImpl.setFingerPrint(biometricData.getFingerPrint());
		biometricDataImpl.setRemark(biometricData.getRemark());

		return biometricDataImpl;
	}

	/**
	 * Returns the biometric data with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the biometric data
	 * @return the biometric data
	 * @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	 */
	@Override
	public BiometricData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchBiometricDataException {
		BiometricData biometricData = fetchByPrimaryKey(primaryKey);

		if (biometricData == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchBiometricDataException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return biometricData;
	}

	/**
	 * Returns the biometric data with the primary key or throws a {@link NoSuchBiometricDataException} if it could not be found.
	 *
	 * @param id the primary key of the biometric data
	 * @return the biometric data
	 * @throws NoSuchBiometricDataException if a biometric data with the primary key could not be found
	 */
	@Override
	public BiometricData findByPrimaryKey(long id)
		throws NoSuchBiometricDataException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the biometric data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the biometric data
	 * @return the biometric data, or <code>null</code> if a biometric data with the primary key could not be found
	 */
	@Override
	public BiometricData fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
				BiometricDataImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		BiometricData biometricData = (BiometricData)serializable;

		if (biometricData == null) {
			Session session = null;

			try {
				session = openSession();

				biometricData = (BiometricData)session.get(BiometricDataImpl.class,
						primaryKey);

				if (biometricData != null) {
					cacheResult(biometricData);
				}
				else {
					entityCache.putResult(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
						BiometricDataImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
					BiometricDataImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return biometricData;
	}

	/**
	 * Returns the biometric data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the biometric data
	 * @return the biometric data, or <code>null</code> if a biometric data with the primary key could not be found
	 */
	@Override
	public BiometricData fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, BiometricData> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, BiometricData> map = new HashMap<Serializable, BiometricData>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			BiometricData biometricData = fetchByPrimaryKey(primaryKey);

			if (biometricData != null) {
				map.put(primaryKey, biometricData);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
					BiometricDataImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (BiometricData)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_BIOMETRICDATA_WHERE_PKS_IN);

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

			for (BiometricData biometricData : (List<BiometricData>)q.list()) {
				map.put(biometricData.getPrimaryKeyObj(), biometricData);

				cacheResult(biometricData);

				uncachedPrimaryKeys.remove(biometricData.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(BiometricDataModelImpl.ENTITY_CACHE_ENABLED,
					BiometricDataImpl.class, primaryKey, nullModel);
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
	 * Returns all the biometric datas.
	 *
	 * @return the biometric datas
	 */
	@Override
	public List<BiometricData> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the biometric datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of biometric datas
	 * @param end the upper bound of the range of biometric datas (not inclusive)
	 * @return the range of biometric datas
	 */
	@Override
	public List<BiometricData> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the biometric datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of biometric datas
	 * @param end the upper bound of the range of biometric datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of biometric datas
	 */
	@Override
	public List<BiometricData> findAll(int start, int end,
		OrderByComparator<BiometricData> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the biometric datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link BiometricDataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of biometric datas
	 * @param end the upper bound of the range of biometric datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of biometric datas
	 */
	@Override
	public List<BiometricData> findAll(int start, int end,
		OrderByComparator<BiometricData> orderByComparator,
		boolean retrieveFromCache) {
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

		List<BiometricData> list = null;

		if (retrieveFromCache) {
			list = (List<BiometricData>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_BIOMETRICDATA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_BIOMETRICDATA;

				if (pagination) {
					sql = sql.concat(BiometricDataModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<BiometricData>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<BiometricData>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the biometric datas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (BiometricData biometricData : findAll()) {
			remove(biometricData);
		}
	}

	/**
	 * Returns the number of biometric datas.
	 *
	 * @return the number of biometric datas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_BIOMETRICDATA);

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
		return BiometricDataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the biometric data persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(BiometricDataImpl.class.getName());
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
	private static final String _SQL_SELECT_BIOMETRICDATA = "SELECT biometricData FROM BiometricData biometricData";
	private static final String _SQL_SELECT_BIOMETRICDATA_WHERE_PKS_IN = "SELECT biometricData FROM BiometricData biometricData WHERE id_ IN (";
	private static final String _SQL_SELECT_BIOMETRICDATA_WHERE = "SELECT biometricData FROM BiometricData biometricData WHERE ";
	private static final String _SQL_COUNT_BIOMETRICDATA = "SELECT COUNT(biometricData) FROM BiometricData biometricData";
	private static final String _SQL_COUNT_BIOMETRICDATA_WHERE = "SELECT COUNT(biometricData) FROM BiometricData biometricData WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "biometricData.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BiometricData exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No BiometricData exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(BiometricDataPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}