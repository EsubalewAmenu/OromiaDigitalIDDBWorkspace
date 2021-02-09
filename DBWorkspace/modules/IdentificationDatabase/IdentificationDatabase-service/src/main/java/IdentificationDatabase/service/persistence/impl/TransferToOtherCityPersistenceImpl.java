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

import IdentificationDatabase.exception.NoSuchTransferToOtherCityException;

import IdentificationDatabase.model.TransferToOtherCity;

import IdentificationDatabase.model.impl.TransferToOtherCityImpl;
import IdentificationDatabase.model.impl.TransferToOtherCityModelImpl;

import IdentificationDatabase.service.persistence.TransferToOtherCityPersistence;

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
 * The persistence implementation for the transfer to other city service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TransferToOtherCityPersistence
 * @see IdentificationDatabase.service.persistence.TransferToOtherCityUtil
 * @generated
 */
@ProviderType
public class TransferToOtherCityPersistenceImpl extends BasePersistenceImpl<TransferToOtherCity>
	implements TransferToOtherCityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link TransferToOtherCityUtil} to access the transfer to other city persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = TransferToOtherCityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityModelImpl.FINDER_CACHE_ENABLED,
			TransferToOtherCityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityModelImpl.FINDER_CACHE_ENABLED,
			TransferToOtherCityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CITIZENID =
		new FinderPath(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityModelImpl.FINDER_CACHE_ENABLED,
			TransferToOtherCityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycitizenId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID =
		new FinderPath(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityModelImpl.FINDER_CACHE_ENABLED,
			TransferToOtherCityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycitizenId",
			new String[] { Long.class.getName() },
			TransferToOtherCityModelImpl.CITIZENID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CITIZENID = new FinderPath(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycitizenId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the transfer to other cities where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @return the matching transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findBycitizenId(long citizenId) {
		return findBycitizenId(citizenId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the transfer to other cities where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of transfer to other cities
	 * @param end the upper bound of the range of transfer to other cities (not inclusive)
	 * @return the range of matching transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findBycitizenId(long citizenId, int start,
		int end) {
		return findBycitizenId(citizenId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the transfer to other cities where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of transfer to other cities
	 * @param end the upper bound of the range of transfer to other cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findBycitizenId(long citizenId, int start,
		int end, OrderByComparator<TransferToOtherCity> orderByComparator) {
		return findBycitizenId(citizenId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the transfer to other cities where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of transfer to other cities
	 * @param end the upper bound of the range of transfer to other cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findBycitizenId(long citizenId, int start,
		int end, OrderByComparator<TransferToOtherCity> orderByComparator,
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

		List<TransferToOtherCity> list = null;

		if (retrieveFromCache) {
			list = (List<TransferToOtherCity>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TransferToOtherCity transferToOtherCity : list) {
					if ((citizenId != transferToOtherCity.getCitizenId())) {
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

			query.append(_SQL_SELECT_TRANSFERTOOTHERCITY_WHERE);

			query.append(_FINDER_COLUMN_CITIZENID_CITIZENID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TransferToOtherCityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(citizenId);

				if (!pagination) {
					list = (List<TransferToOtherCity>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TransferToOtherCity>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first transfer to other city in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transfer to other city
	 * @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	 */
	@Override
	public TransferToOtherCity findBycitizenId_First(long citizenId,
		OrderByComparator<TransferToOtherCity> orderByComparator)
		throws NoSuchTransferToOtherCityException {
		TransferToOtherCity transferToOtherCity = fetchBycitizenId_First(citizenId,
				orderByComparator);

		if (transferToOtherCity != null) {
			return transferToOtherCity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTransferToOtherCityException(msg.toString());
	}

	/**
	 * Returns the first transfer to other city in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	 */
	@Override
	public TransferToOtherCity fetchBycitizenId_First(long citizenId,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		List<TransferToOtherCity> list = findBycitizenId(citizenId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last transfer to other city in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transfer to other city
	 * @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	 */
	@Override
	public TransferToOtherCity findBycitizenId_Last(long citizenId,
		OrderByComparator<TransferToOtherCity> orderByComparator)
		throws NoSuchTransferToOtherCityException {
		TransferToOtherCity transferToOtherCity = fetchBycitizenId_Last(citizenId,
				orderByComparator);

		if (transferToOtherCity != null) {
			return transferToOtherCity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTransferToOtherCityException(msg.toString());
	}

	/**
	 * Returns the last transfer to other city in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	 */
	@Override
	public TransferToOtherCity fetchBycitizenId_Last(long citizenId,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		int count = countBycitizenId(citizenId);

		if (count == 0) {
			return null;
		}

		List<TransferToOtherCity> list = findBycitizenId(citizenId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the transfer to other cities before and after the current transfer to other city in the ordered set where citizenId = &#63;.
	 *
	 * @param id the primary key of the current transfer to other city
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next transfer to other city
	 * @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	 */
	@Override
	public TransferToOtherCity[] findBycitizenId_PrevAndNext(long id,
		long citizenId, OrderByComparator<TransferToOtherCity> orderByComparator)
		throws NoSuchTransferToOtherCityException {
		TransferToOtherCity transferToOtherCity = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			TransferToOtherCity[] array = new TransferToOtherCityImpl[3];

			array[0] = getBycitizenId_PrevAndNext(session, transferToOtherCity,
					citizenId, orderByComparator, true);

			array[1] = transferToOtherCity;

			array[2] = getBycitizenId_PrevAndNext(session, transferToOtherCity,
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

	protected TransferToOtherCity getBycitizenId_PrevAndNext(Session session,
		TransferToOtherCity transferToOtherCity, long citizenId,
		OrderByComparator<TransferToOtherCity> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_TRANSFERTOOTHERCITY_WHERE);

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
			query.append(TransferToOtherCityModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(citizenId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(transferToOtherCity);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<TransferToOtherCity> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the transfer to other cities where citizenId = &#63; from the database.
	 *
	 * @param citizenId the citizen ID
	 */
	@Override
	public void removeBycitizenId(long citizenId) {
		for (TransferToOtherCity transferToOtherCity : findBycitizenId(
				citizenId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(transferToOtherCity);
		}
	}

	/**
	 * Returns the number of transfer to other cities where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @return the number of matching transfer to other cities
	 */
	@Override
	public int countBycitizenId(long citizenId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CITIZENID;

		Object[] finderArgs = new Object[] { citizenId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRANSFERTOOTHERCITY_WHERE);

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

	private static final String _FINDER_COLUMN_CITIZENID_CITIZENID_2 = "transferToOtherCity.citizenId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityModelImpl.FINDER_CACHE_ENABLED,
			TransferToOtherCityImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityModelImpl.FINDER_CACHE_ENABLED,
			TransferToOtherCityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByid",
			new String[] { Long.class.getName() },
			TransferToOtherCityModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the transfer to other cities where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findByid(long id) {
		return findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the transfer to other cities where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of transfer to other cities
	 * @param end the upper bound of the range of transfer to other cities (not inclusive)
	 * @return the range of matching transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findByid(long id, int start, int end) {
		return findByid(id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the transfer to other cities where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of transfer to other cities
	 * @param end the upper bound of the range of transfer to other cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findByid(long id, int start, int end,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		return findByid(id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the transfer to other cities where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of transfer to other cities
	 * @param end the upper bound of the range of transfer to other cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findByid(long id, int start, int end,
		OrderByComparator<TransferToOtherCity> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID;
			finderArgs = new Object[] { id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ID;
			finderArgs = new Object[] { id, start, end, orderByComparator };
		}

		List<TransferToOtherCity> list = null;

		if (retrieveFromCache) {
			list = (List<TransferToOtherCity>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TransferToOtherCity transferToOtherCity : list) {
					if ((id != transferToOtherCity.getId())) {
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

			query.append(_SQL_SELECT_TRANSFERTOOTHERCITY_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(TransferToOtherCityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<TransferToOtherCity>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TransferToOtherCity>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first transfer to other city in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transfer to other city
	 * @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	 */
	@Override
	public TransferToOtherCity findByid_First(long id,
		OrderByComparator<TransferToOtherCity> orderByComparator)
		throws NoSuchTransferToOtherCityException {
		TransferToOtherCity transferToOtherCity = fetchByid_First(id,
				orderByComparator);

		if (transferToOtherCity != null) {
			return transferToOtherCity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTransferToOtherCityException(msg.toString());
	}

	/**
	 * Returns the first transfer to other city in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	 */
	@Override
	public TransferToOtherCity fetchByid_First(long id,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		List<TransferToOtherCity> list = findByid(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last transfer to other city in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transfer to other city
	 * @throws NoSuchTransferToOtherCityException if a matching transfer to other city could not be found
	 */
	@Override
	public TransferToOtherCity findByid_Last(long id,
		OrderByComparator<TransferToOtherCity> orderByComparator)
		throws NoSuchTransferToOtherCityException {
		TransferToOtherCity transferToOtherCity = fetchByid_Last(id,
				orderByComparator);

		if (transferToOtherCity != null) {
			return transferToOtherCity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchTransferToOtherCityException(msg.toString());
	}

	/**
	 * Returns the last transfer to other city in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching transfer to other city, or <code>null</code> if a matching transfer to other city could not be found
	 */
	@Override
	public TransferToOtherCity fetchByid_Last(long id,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		int count = countByid(id);

		if (count == 0) {
			return null;
		}

		List<TransferToOtherCity> list = findByid(id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the transfer to other cities where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByid(long id) {
		for (TransferToOtherCity transferToOtherCity : findByid(id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(transferToOtherCity);
		}
	}

	/**
	 * Returns the number of transfer to other cities where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching transfer to other cities
	 */
	@Override
	public int countByid(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_TRANSFERTOOTHERCITY_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "transferToOtherCity.id = ?";

	public TransferToOtherCityPersistenceImpl() {
		setModelClass(TransferToOtherCity.class);

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
	 * Caches the transfer to other city in the entity cache if it is enabled.
	 *
	 * @param transferToOtherCity the transfer to other city
	 */
	@Override
	public void cacheResult(TransferToOtherCity transferToOtherCity) {
		entityCache.putResult(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityImpl.class, transferToOtherCity.getPrimaryKey(),
			transferToOtherCity);

		transferToOtherCity.resetOriginalValues();
	}

	/**
	 * Caches the transfer to other cities in the entity cache if it is enabled.
	 *
	 * @param transferToOtherCities the transfer to other cities
	 */
	@Override
	public void cacheResult(List<TransferToOtherCity> transferToOtherCities) {
		for (TransferToOtherCity transferToOtherCity : transferToOtherCities) {
			if (entityCache.getResult(
						TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
						TransferToOtherCityImpl.class,
						transferToOtherCity.getPrimaryKey()) == null) {
				cacheResult(transferToOtherCity);
			}
			else {
				transferToOtherCity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all transfer to other cities.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TransferToOtherCityImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the transfer to other city.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TransferToOtherCity transferToOtherCity) {
		entityCache.removeResult(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityImpl.class, transferToOtherCity.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<TransferToOtherCity> transferToOtherCities) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (TransferToOtherCity transferToOtherCity : transferToOtherCities) {
			entityCache.removeResult(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
				TransferToOtherCityImpl.class,
				transferToOtherCity.getPrimaryKey());
		}
	}

	/**
	 * Creates a new transfer to other city with the primary key. Does not add the transfer to other city to the database.
	 *
	 * @param id the primary key for the new transfer to other city
	 * @return the new transfer to other city
	 */
	@Override
	public TransferToOtherCity create(long id) {
		TransferToOtherCity transferToOtherCity = new TransferToOtherCityImpl();

		transferToOtherCity.setNew(true);
		transferToOtherCity.setPrimaryKey(id);

		transferToOtherCity.setCompanyId(companyProvider.getCompanyId());

		return transferToOtherCity;
	}

	/**
	 * Removes the transfer to other city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the transfer to other city
	 * @return the transfer to other city that was removed
	 * @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	 */
	@Override
	public TransferToOtherCity remove(long id)
		throws NoSuchTransferToOtherCityException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the transfer to other city with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the transfer to other city
	 * @return the transfer to other city that was removed
	 * @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	 */
	@Override
	public TransferToOtherCity remove(Serializable primaryKey)
		throws NoSuchTransferToOtherCityException {
		Session session = null;

		try {
			session = openSession();

			TransferToOtherCity transferToOtherCity = (TransferToOtherCity)session.get(TransferToOtherCityImpl.class,
					primaryKey);

			if (transferToOtherCity == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTransferToOtherCityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(transferToOtherCity);
		}
		catch (NoSuchTransferToOtherCityException nsee) {
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
	protected TransferToOtherCity removeImpl(
		TransferToOtherCity transferToOtherCity) {
		transferToOtherCity = toUnwrappedModel(transferToOtherCity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(transferToOtherCity)) {
				transferToOtherCity = (TransferToOtherCity)session.get(TransferToOtherCityImpl.class,
						transferToOtherCity.getPrimaryKeyObj());
			}

			if (transferToOtherCity != null) {
				session.delete(transferToOtherCity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (transferToOtherCity != null) {
			clearCache(transferToOtherCity);
		}

		return transferToOtherCity;
	}

	@Override
	public TransferToOtherCity updateImpl(
		TransferToOtherCity transferToOtherCity) {
		transferToOtherCity = toUnwrappedModel(transferToOtherCity);

		boolean isNew = transferToOtherCity.isNew();

		TransferToOtherCityModelImpl transferToOtherCityModelImpl = (TransferToOtherCityModelImpl)transferToOtherCity;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (transferToOtherCity.getCreateDate() == null)) {
			if (serviceContext == null) {
				transferToOtherCity.setCreateDate(now);
			}
			else {
				transferToOtherCity.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!transferToOtherCityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				transferToOtherCity.setModifiedDate(now);
			}
			else {
				transferToOtherCity.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (transferToOtherCity.isNew()) {
				session.save(transferToOtherCity);

				transferToOtherCity.setNew(false);
			}
			else {
				transferToOtherCity = (TransferToOtherCity)session.merge(transferToOtherCity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!TransferToOtherCityModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					transferToOtherCityModelImpl.getCitizenId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
				args);

			args = new Object[] { transferToOtherCityModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((transferToOtherCityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						transferToOtherCityModelImpl.getOriginalCitizenId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
					args);

				args = new Object[] { transferToOtherCityModelImpl.getCitizenId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
					args);
			}

			if ((transferToOtherCityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						transferToOtherCityModelImpl.getOriginalId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { transferToOtherCityModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}
		}

		entityCache.putResult(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
			TransferToOtherCityImpl.class, transferToOtherCity.getPrimaryKey(),
			transferToOtherCity, false);

		transferToOtherCity.resetOriginalValues();

		return transferToOtherCity;
	}

	protected TransferToOtherCity toUnwrappedModel(
		TransferToOtherCity transferToOtherCity) {
		if (transferToOtherCity instanceof TransferToOtherCityImpl) {
			return transferToOtherCity;
		}

		TransferToOtherCityImpl transferToOtherCityImpl = new TransferToOtherCityImpl();

		transferToOtherCityImpl.setNew(transferToOtherCity.isNew());
		transferToOtherCityImpl.setPrimaryKey(transferToOtherCity.getPrimaryKey());

		transferToOtherCityImpl.setId(transferToOtherCity.getId());
		transferToOtherCityImpl.setCompanyId(transferToOtherCity.getCompanyId());
		transferToOtherCityImpl.setUserId(transferToOtherCity.getUserId());
		transferToOtherCityImpl.setUserName(transferToOtherCity.getUserName());
		transferToOtherCityImpl.setCreateDate(transferToOtherCity.getCreateDate());
		transferToOtherCityImpl.setModifiedDate(transferToOtherCity.getModifiedDate());
		transferToOtherCityImpl.setTocity(transferToOtherCity.getTocity());
		transferToOtherCityImpl.setFromcity(transferToOtherCity.getFromcity());
		transferToOtherCityImpl.setSubcity(transferToOtherCity.getSubcity());
		transferToOtherCityImpl.setKebele(transferToOtherCity.getKebele());
		transferToOtherCityImpl.setFullname(transferToOtherCity.getFullname());
		transferToOtherCityImpl.setMothername(transferToOtherCity.getMothername());
		transferToOtherCityImpl.setCitizenId(transferToOtherCity.getCitizenId());
		transferToOtherCityImpl.setBirthdate(transferToOtherCity.getBirthdate());
		transferToOtherCityImpl.setHouseNo(transferToOtherCity.getHouseNo());
		transferToOtherCityImpl.setIsOwner(transferToOtherCity.getIsOwner());
		transferToOtherCityImpl.setPhone(transferToOtherCity.getPhone());
		transferToOtherCityImpl.setReason(transferToOtherCity.getReason());

		return transferToOtherCityImpl;
	}

	/**
	 * Returns the transfer to other city with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the transfer to other city
	 * @return the transfer to other city
	 * @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	 */
	@Override
	public TransferToOtherCity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTransferToOtherCityException {
		TransferToOtherCity transferToOtherCity = fetchByPrimaryKey(primaryKey);

		if (transferToOtherCity == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTransferToOtherCityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return transferToOtherCity;
	}

	/**
	 * Returns the transfer to other city with the primary key or throws a {@link NoSuchTransferToOtherCityException} if it could not be found.
	 *
	 * @param id the primary key of the transfer to other city
	 * @return the transfer to other city
	 * @throws NoSuchTransferToOtherCityException if a transfer to other city with the primary key could not be found
	 */
	@Override
	public TransferToOtherCity findByPrimaryKey(long id)
		throws NoSuchTransferToOtherCityException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the transfer to other city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the transfer to other city
	 * @return the transfer to other city, or <code>null</code> if a transfer to other city with the primary key could not be found
	 */
	@Override
	public TransferToOtherCity fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
				TransferToOtherCityImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		TransferToOtherCity transferToOtherCity = (TransferToOtherCity)serializable;

		if (transferToOtherCity == null) {
			Session session = null;

			try {
				session = openSession();

				transferToOtherCity = (TransferToOtherCity)session.get(TransferToOtherCityImpl.class,
						primaryKey);

				if (transferToOtherCity != null) {
					cacheResult(transferToOtherCity);
				}
				else {
					entityCache.putResult(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
						TransferToOtherCityImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
					TransferToOtherCityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return transferToOtherCity;
	}

	/**
	 * Returns the transfer to other city with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the transfer to other city
	 * @return the transfer to other city, or <code>null</code> if a transfer to other city with the primary key could not be found
	 */
	@Override
	public TransferToOtherCity fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, TransferToOtherCity> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, TransferToOtherCity> map = new HashMap<Serializable, TransferToOtherCity>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			TransferToOtherCity transferToOtherCity = fetchByPrimaryKey(primaryKey);

			if (transferToOtherCity != null) {
				map.put(primaryKey, transferToOtherCity);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
					TransferToOtherCityImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (TransferToOtherCity)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_TRANSFERTOOTHERCITY_WHERE_PKS_IN);

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

			for (TransferToOtherCity transferToOtherCity : (List<TransferToOtherCity>)q.list()) {
				map.put(transferToOtherCity.getPrimaryKeyObj(),
					transferToOtherCity);

				cacheResult(transferToOtherCity);

				uncachedPrimaryKeys.remove(transferToOtherCity.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(TransferToOtherCityModelImpl.ENTITY_CACHE_ENABLED,
					TransferToOtherCityImpl.class, primaryKey, nullModel);
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
	 * Returns all the transfer to other cities.
	 *
	 * @return the transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the transfer to other cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of transfer to other cities
	 * @param end the upper bound of the range of transfer to other cities (not inclusive)
	 * @return the range of transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the transfer to other cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of transfer to other cities
	 * @param end the upper bound of the range of transfer to other cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findAll(int start, int end,
		OrderByComparator<TransferToOtherCity> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the transfer to other cities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TransferToOtherCityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of transfer to other cities
	 * @param end the upper bound of the range of transfer to other cities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of transfer to other cities
	 */
	@Override
	public List<TransferToOtherCity> findAll(int start, int end,
		OrderByComparator<TransferToOtherCity> orderByComparator,
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

		List<TransferToOtherCity> list = null;

		if (retrieveFromCache) {
			list = (List<TransferToOtherCity>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_TRANSFERTOOTHERCITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_TRANSFERTOOTHERCITY;

				if (pagination) {
					sql = sql.concat(TransferToOtherCityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<TransferToOtherCity>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<TransferToOtherCity>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the transfer to other cities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TransferToOtherCity transferToOtherCity : findAll()) {
			remove(transferToOtherCity);
		}
	}

	/**
	 * Returns the number of transfer to other cities.
	 *
	 * @return the number of transfer to other cities
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_TRANSFERTOOTHERCITY);

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
		return TransferToOtherCityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the transfer to other city persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(TransferToOtherCityImpl.class.getName());
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
	private static final String _SQL_SELECT_TRANSFERTOOTHERCITY = "SELECT transferToOtherCity FROM TransferToOtherCity transferToOtherCity";
	private static final String _SQL_SELECT_TRANSFERTOOTHERCITY_WHERE_PKS_IN = "SELECT transferToOtherCity FROM TransferToOtherCity transferToOtherCity WHERE id_ IN (";
	private static final String _SQL_SELECT_TRANSFERTOOTHERCITY_WHERE = "SELECT transferToOtherCity FROM TransferToOtherCity transferToOtherCity WHERE ";
	private static final String _SQL_COUNT_TRANSFERTOOTHERCITY = "SELECT COUNT(transferToOtherCity) FROM TransferToOtherCity transferToOtherCity";
	private static final String _SQL_COUNT_TRANSFERTOOTHERCITY_WHERE = "SELECT COUNT(transferToOtherCity) FROM TransferToOtherCity transferToOtherCity WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "transferToOtherCity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No TransferToOtherCity exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No TransferToOtherCity exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(TransferToOtherCityPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}