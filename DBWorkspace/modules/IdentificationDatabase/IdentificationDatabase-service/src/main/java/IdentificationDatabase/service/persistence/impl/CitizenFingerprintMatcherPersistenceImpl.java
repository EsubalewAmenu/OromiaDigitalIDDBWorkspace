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

import IdentificationDatabase.exception.NoSuchCitizenFingerprintMatcherException;

import IdentificationDatabase.model.CitizenFingerprintMatcher;

import IdentificationDatabase.model.impl.CitizenFingerprintMatcherImpl;
import IdentificationDatabase.model.impl.CitizenFingerprintMatcherModelImpl;

import IdentificationDatabase.service.persistence.CitizenFingerprintMatcherPersistence;

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
 * The persistence implementation for the citizen fingerprint matcher service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitizenFingerprintMatcherPersistence
 * @see IdentificationDatabase.service.persistence.CitizenFingerprintMatcherUtil
 * @generated
 */
@ProviderType
public class CitizenFingerprintMatcherPersistenceImpl
	extends BasePersistenceImpl<CitizenFingerprintMatcher>
	implements CitizenFingerprintMatcherPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CitizenFingerprintMatcherUtil} to access the citizen fingerprint matcher persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CitizenFingerprintMatcherImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CITIZEN_STATUS =
		new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycitizen_status",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZEN_STATUS =
		new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycitizen_status",
			new String[] { Long.class.getName(), Integer.class.getName() },
			CitizenFingerprintMatcherModelImpl.CITIZENID_COLUMN_BITMASK |
			CitizenFingerprintMatcherModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CITIZEN_STATUS = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycitizen_status",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param status the status
	 * @return the matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status) {
		return findBycitizen_status(citizenId, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param status the status
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @return the range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status, int start, int end) {
		return findBycitizen_status(citizenId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param status the status
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return findBycitizen_status(citizenId, status, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param status the status
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizen_status(
		long citizenId, int status, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZEN_STATUS;
			finderArgs = new Object[] { citizenId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CITIZEN_STATUS;
			finderArgs = new Object[] {
					citizenId, status,
					
					start, end, orderByComparator
				};
		}

		List<CitizenFingerprintMatcher> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenFingerprintMatcher>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CitizenFingerprintMatcher citizenFingerprintMatcher : list) {
					if ((citizenId != citizenFingerprintMatcher.getCitizenId()) ||
							(status != citizenFingerprintMatcher.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_CITIZEN_STATUS_CITIZENID_2);

			query.append(_FINDER_COLUMN_CITIZEN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(citizenId);

				qPos.add(status);

				if (!pagination) {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
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
	 * Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findBycitizen_status_First(
		long citizenId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchBycitizen_status_First(citizenId,
				status, orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchBycitizen_status_First(
		long citizenId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		List<CitizenFingerprintMatcher> list = findBycitizen_status(citizenId,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findBycitizen_status_Last(long citizenId,
		int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchBycitizen_status_Last(citizenId,
				status, orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchBycitizen_status_Last(
		long citizenId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		int count = countBycitizen_status(citizenId, status);

		if (count == 0) {
			return null;
		}

		List<CitizenFingerprintMatcher> list = findBycitizen_status(citizenId,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where citizenId = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current citizen fingerprint matcher
	 * @param citizenId the citizen ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher[] findBycitizen_status_PrevAndNext(
		long id, long citizenId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CitizenFingerprintMatcher[] array = new CitizenFingerprintMatcherImpl[3];

			array[0] = getBycitizen_status_PrevAndNext(session,
					citizenFingerprintMatcher, citizenId, status,
					orderByComparator, true);

			array[1] = citizenFingerprintMatcher;

			array[2] = getBycitizen_status_PrevAndNext(session,
					citizenFingerprintMatcher, citizenId, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CitizenFingerprintMatcher getBycitizen_status_PrevAndNext(
		Session session, CitizenFingerprintMatcher citizenFingerprintMatcher,
		long citizenId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

		query.append(_FINDER_COLUMN_CITIZEN_STATUS_CITIZENID_2);

		query.append(_FINDER_COLUMN_CITIZEN_STATUS_STATUS_2);

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
			query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(citizenId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(citizenFingerprintMatcher);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CitizenFingerprintMatcher> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the citizen fingerprint matchers where citizenId = &#63; and status = &#63; from the database.
	 *
	 * @param citizenId the citizen ID
	 * @param status the status
	 */
	@Override
	public void removeBycitizen_status(long citizenId, int status) {
		for (CitizenFingerprintMatcher citizenFingerprintMatcher : findBycitizen_status(
				citizenId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(citizenFingerprintMatcher);
		}
	}

	/**
	 * Returns the number of citizen fingerprint matchers where citizenId = &#63; and status = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param status the status
	 * @return the number of matching citizen fingerprint matchers
	 */
	@Override
	public int countBycitizen_status(long citizenId, int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CITIZEN_STATUS;

		Object[] finderArgs = new Object[] { citizenId, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_CITIZEN_STATUS_CITIZENID_2);

			query.append(_FINDER_COLUMN_CITIZEN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(citizenId);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_CITIZEN_STATUS_CITIZENID_2 = "citizenFingerprintMatcher.citizenId = ? AND ";
	private static final String _FINDER_COLUMN_CITIZEN_STATUS_STATUS_2 = "citizenFingerprintMatcher.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID_STATUS =
		new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserid_status",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID_STATUS =
		new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserid_status",
			new String[] { Long.class.getName(), Integer.class.getName() },
			CitizenFingerprintMatcherModelImpl.USERID_COLUMN_BITMASK |
			CitizenFingerprintMatcherModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID_STATUS = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByuserid_status",
			new String[] { Long.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the citizen fingerprint matchers where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByuserid_status(long userId,
		int status) {
		return findByuserid_status(userId, status, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizen fingerprint matchers where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @return the range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByuserid_status(long userId,
		int status, int start, int end) {
		return findByuserid_status(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByuserid_status(long userId,
		int status, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return findByuserid_status(userId, status, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByuserid_status(long userId,
		int status, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID_STATUS;
			finderArgs = new Object[] { userId, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID_STATUS;
			finderArgs = new Object[] {
					userId, status,
					
					start, end, orderByComparator
				};
		}

		List<CitizenFingerprintMatcher> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenFingerprintMatcher>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CitizenFingerprintMatcher citizenFingerprintMatcher : list) {
					if ((userId != citizenFingerprintMatcher.getUserId()) ||
							(status != citizenFingerprintMatcher.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_USERID_STATUS_USERID_2);

			query.append(_FINDER_COLUMN_USERID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(status);

				if (!pagination) {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
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
	 * Returns the first citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findByuserid_status_First(long userId,
		int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchByuserid_status_First(userId,
				status, orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the first citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchByuserid_status_First(long userId,
		int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		List<CitizenFingerprintMatcher> list = findByuserid_status(userId,
				status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findByuserid_status_Last(long userId,
		int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchByuserid_status_Last(userId,
				status, orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchByuserid_status_Last(long userId,
		int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		int count = countByuserid_status(userId, status);

		if (count == 0) {
			return null;
		}

		List<CitizenFingerprintMatcher> list = findByuserid_status(userId,
				status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current citizen fingerprint matcher
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher[] findByuserid_status_PrevAndNext(
		long id, long userId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CitizenFingerprintMatcher[] array = new CitizenFingerprintMatcherImpl[3];

			array[0] = getByuserid_status_PrevAndNext(session,
					citizenFingerprintMatcher, userId, status,
					orderByComparator, true);

			array[1] = citizenFingerprintMatcher;

			array[2] = getByuserid_status_PrevAndNext(session,
					citizenFingerprintMatcher, userId, status,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CitizenFingerprintMatcher getByuserid_status_PrevAndNext(
		Session session, CitizenFingerprintMatcher citizenFingerprintMatcher,
		long userId, int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

		query.append(_FINDER_COLUMN_USERID_STATUS_USERID_2);

		query.append(_FINDER_COLUMN_USERID_STATUS_STATUS_2);

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
			query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(citizenFingerprintMatcher);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CitizenFingerprintMatcher> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the citizen fingerprint matchers where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeByuserid_status(long userId, int status) {
		for (CitizenFingerprintMatcher citizenFingerprintMatcher : findByuserid_status(
				userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(citizenFingerprintMatcher);
		}
	}

	/**
	 * Returns the number of citizen fingerprint matchers where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching citizen fingerprint matchers
	 */
	@Override
	public int countByuserid_status(long userId, int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID_STATUS;

		Object[] finderArgs = new Object[] { userId, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_USERID_STATUS_USERID_2);

			query.append(_FINDER_COLUMN_USERID_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_USERID_STATUS_USERID_2 = "citizenFingerprintMatcher.userId = ? AND ";
	private static final String _FINDER_COLUMN_USERID_STATUS_STATUS_2 = "citizenFingerprintMatcher.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CITIZENID =
		new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycitizenId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID =
		new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycitizenId",
			new String[] { Long.class.getName() },
			CitizenFingerprintMatcherModelImpl.CITIZENID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CITIZENID = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycitizenId", new String[] { Long.class.getName() });

	/**
	 * Returns all the citizen fingerprint matchers where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @return the matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizenId(long citizenId) {
		return findBycitizenId(citizenId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the citizen fingerprint matchers where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @return the range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizenId(long citizenId,
		int start, int end) {
		return findBycitizenId(citizenId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizenId(long citizenId,
		int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return findBycitizenId(citizenId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizenId(long citizenId,
		int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
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

		List<CitizenFingerprintMatcher> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenFingerprintMatcher>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CitizenFingerprintMatcher citizenFingerprintMatcher : list) {
					if ((citizenId != citizenFingerprintMatcher.getCitizenId())) {
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

			query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_CITIZENID_CITIZENID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(citizenId);

				if (!pagination) {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
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
	 * Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findBycitizenId_First(long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchBycitizenId_First(citizenId,
				orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the first citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchBycitizenId_First(long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		List<CitizenFingerprintMatcher> list = findBycitizenId(citizenId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findBycitizenId_Last(long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchBycitizenId_Last(citizenId,
				orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchBycitizenId_Last(long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		int count = countBycitizenId(citizenId);

		if (count == 0) {
			return null;
		}

		List<CitizenFingerprintMatcher> list = findBycitizenId(citizenId,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where citizenId = &#63;.
	 *
	 * @param id the primary key of the current citizen fingerprint matcher
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher[] findBycitizenId_PrevAndNext(long id,
		long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CitizenFingerprintMatcher[] array = new CitizenFingerprintMatcherImpl[3];

			array[0] = getBycitizenId_PrevAndNext(session,
					citizenFingerprintMatcher, citizenId, orderByComparator,
					true);

			array[1] = citizenFingerprintMatcher;

			array[2] = getBycitizenId_PrevAndNext(session,
					citizenFingerprintMatcher, citizenId, orderByComparator,
					false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CitizenFingerprintMatcher getBycitizenId_PrevAndNext(
		Session session, CitizenFingerprintMatcher citizenFingerprintMatcher,
		long citizenId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
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

		query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

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
			query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(citizenId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(citizenFingerprintMatcher);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CitizenFingerprintMatcher> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the citizen fingerprint matchers where citizenId = &#63; from the database.
	 *
	 * @param citizenId the citizen ID
	 */
	@Override
	public void removeBycitizenId(long citizenId) {
		for (CitizenFingerprintMatcher citizenFingerprintMatcher : findBycitizenId(
				citizenId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(citizenFingerprintMatcher);
		}
	}

	/**
	 * Returns the number of citizen fingerprint matchers where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @return the number of matching citizen fingerprint matchers
	 */
	@Override
	public int countBycitizenId(long citizenId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CITIZENID;

		Object[] finderArgs = new Object[] { citizenId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZENFINGERPRINTMATCHER_WHERE);

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

	private static final String _FINDER_COLUMN_CITIZENID_CITIZENID_2 = "citizenFingerprintMatcher.citizenId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CITIZENIDSECOND =
		new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycitizenIdSecond",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENIDSECOND =
		new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycitizenIdSecond",
			new String[] { Long.class.getName() },
			CitizenFingerprintMatcherModelImpl.CITIZENIDSECOND_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CITIZENIDSECOND = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycitizenIdSecond", new String[] { Long.class.getName() });

	/**
	 * Returns all the citizen fingerprint matchers where citizenIdSecond = &#63;.
	 *
	 * @param citizenIdSecond the citizen ID second
	 * @return the matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond) {
		return findBycitizenIdSecond(citizenIdSecond, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizen fingerprint matchers where citizenIdSecond = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenIdSecond the citizen ID second
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @return the range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond, int start, int end) {
		return findBycitizenIdSecond(citizenIdSecond, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where citizenIdSecond = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenIdSecond the citizen ID second
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return findBycitizenIdSecond(citizenIdSecond, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where citizenIdSecond = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenIdSecond the citizen ID second
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBycitizenIdSecond(
		long citizenIdSecond, int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENIDSECOND;
			finderArgs = new Object[] { citizenIdSecond };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CITIZENIDSECOND;
			finderArgs = new Object[] {
					citizenIdSecond,
					
					start, end, orderByComparator
				};
		}

		List<CitizenFingerprintMatcher> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenFingerprintMatcher>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CitizenFingerprintMatcher citizenFingerprintMatcher : list) {
					if ((citizenIdSecond != citizenFingerprintMatcher.getCitizenIdSecond())) {
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

			query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_CITIZENIDSECOND_CITIZENIDSECOND_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(citizenIdSecond);

				if (!pagination) {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
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
	 * Returns the first citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	 *
	 * @param citizenIdSecond the citizen ID second
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findBycitizenIdSecond_First(
		long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchBycitizenIdSecond_First(citizenIdSecond,
				orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenIdSecond=");
		msg.append(citizenIdSecond);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the first citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	 *
	 * @param citizenIdSecond the citizen ID second
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchBycitizenIdSecond_First(
		long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		List<CitizenFingerprintMatcher> list = findBycitizenIdSecond(citizenIdSecond,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	 *
	 * @param citizenIdSecond the citizen ID second
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findBycitizenIdSecond_Last(
		long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchBycitizenIdSecond_Last(citizenIdSecond,
				orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenIdSecond=");
		msg.append(citizenIdSecond);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	 *
	 * @param citizenIdSecond the citizen ID second
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchBycitizenIdSecond_Last(
		long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		int count = countBycitizenIdSecond(citizenIdSecond);

		if (count == 0) {
			return null;
		}

		List<CitizenFingerprintMatcher> list = findBycitizenIdSecond(citizenIdSecond,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where citizenIdSecond = &#63;.
	 *
	 * @param id the primary key of the current citizen fingerprint matcher
	 * @param citizenIdSecond the citizen ID second
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher[] findBycitizenIdSecond_PrevAndNext(
		long id, long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CitizenFingerprintMatcher[] array = new CitizenFingerprintMatcherImpl[3];

			array[0] = getBycitizenIdSecond_PrevAndNext(session,
					citizenFingerprintMatcher, citizenIdSecond,
					orderByComparator, true);

			array[1] = citizenFingerprintMatcher;

			array[2] = getBycitizenIdSecond_PrevAndNext(session,
					citizenFingerprintMatcher, citizenIdSecond,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CitizenFingerprintMatcher getBycitizenIdSecond_PrevAndNext(
		Session session, CitizenFingerprintMatcher citizenFingerprintMatcher,
		long citizenIdSecond,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
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

		query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

		query.append(_FINDER_COLUMN_CITIZENIDSECOND_CITIZENIDSECOND_2);

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
			query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(citizenIdSecond);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(citizenFingerprintMatcher);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CitizenFingerprintMatcher> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the citizen fingerprint matchers where citizenIdSecond = &#63; from the database.
	 *
	 * @param citizenIdSecond the citizen ID second
	 */
	@Override
	public void removeBycitizenIdSecond(long citizenIdSecond) {
		for (CitizenFingerprintMatcher citizenFingerprintMatcher : findBycitizenIdSecond(
				citizenIdSecond, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(citizenFingerprintMatcher);
		}
	}

	/**
	 * Returns the number of citizen fingerprint matchers where citizenIdSecond = &#63;.
	 *
	 * @param citizenIdSecond the citizen ID second
	 * @return the number of matching citizen fingerprint matchers
	 */
	@Override
	public int countBycitizenIdSecond(long citizenIdSecond) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CITIZENIDSECOND;

		Object[] finderArgs = new Object[] { citizenIdSecond };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_CITIZENIDSECOND_CITIZENIDSECOND_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(citizenIdSecond);

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

	private static final String _FINDER_COLUMN_CITIZENIDSECOND_CITIZENIDSECOND_2 =
		"citizenFingerprintMatcher.citizenIdSecond = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystatus",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatus",
			new String[] { Integer.class.getName() },
			CitizenFingerprintMatcherModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBystatus", new String[] { Integer.class.getName() });

	/**
	 * Returns all the citizen fingerprint matchers where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBystatus(int status) {
		return findBystatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizen fingerprint matchers where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @return the range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBystatus(int status, int start,
		int end) {
		return findBystatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBystatus(int status, int start,
		int end, OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return findBystatus(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findBystatus(int status, int start,
		int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS;
			finderArgs = new Object[] { status, start, end, orderByComparator };
		}

		List<CitizenFingerprintMatcher> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenFingerprintMatcher>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CitizenFingerprintMatcher citizenFingerprintMatcher : list) {
					if ((status != citizenFingerprintMatcher.getStatus())) {
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

			query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (!pagination) {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
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
	 * Returns the first citizen fingerprint matcher in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findBystatus_First(int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchBystatus_First(status,
				orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the first citizen fingerprint matcher in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchBystatus_First(int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		List<CitizenFingerprintMatcher> list = findBystatus(status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findBystatus_Last(int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchBystatus_Last(status,
				orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchBystatus_Last(int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		int count = countBystatus(status);

		if (count == 0) {
			return null;
		}

		List<CitizenFingerprintMatcher> list = findBystatus(status, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where status = &#63;.
	 *
	 * @param id the primary key of the current citizen fingerprint matcher
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher[] findBystatus_PrevAndNext(long id,
		int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CitizenFingerprintMatcher[] array = new CitizenFingerprintMatcherImpl[3];

			array[0] = getBystatus_PrevAndNext(session,
					citizenFingerprintMatcher, status, orderByComparator, true);

			array[1] = citizenFingerprintMatcher;

			array[2] = getBystatus_PrevAndNext(session,
					citizenFingerprintMatcher, status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CitizenFingerprintMatcher getBystatus_PrevAndNext(
		Session session, CitizenFingerprintMatcher citizenFingerprintMatcher,
		int status,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
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

		query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

		query.append(_FINDER_COLUMN_STATUS_STATUS_2);

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
			query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(citizenFingerprintMatcher);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CitizenFingerprintMatcher> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the citizen fingerprint matchers where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBystatus(int status) {
		for (CitizenFingerprintMatcher citizenFingerprintMatcher : findBystatus(
				status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(citizenFingerprintMatcher);
		}
	}

	/**
	 * Returns the number of citizen fingerprint matchers where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching citizen fingerprint matchers
	 */
	@Override
	public int countBystatus(int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "citizenFingerprintMatcher.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByuserId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID =
		new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByuserId",
			new String[] { Long.class.getName() },
			CitizenFingerprintMatcherModelImpl.USERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_USERID = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByuserId", new String[] { Long.class.getName() });

	/**
	 * Returns all the citizen fingerprint matchers where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByuserId(long userId) {
		return findByuserId(userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizen fingerprint matchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @return the range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByuserId(long userId, int start,
		int end) {
		return findByuserId(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByuserId(long userId, int start,
		int end, OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return findByuserId(userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByuserId(long userId, int start,
		int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USERID;
			finderArgs = new Object[] { userId, start, end, orderByComparator };
		}

		List<CitizenFingerprintMatcher> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenFingerprintMatcher>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CitizenFingerprintMatcher citizenFingerprintMatcher : list) {
					if ((userId != citizenFingerprintMatcher.getUserId())) {
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

			query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

				if (!pagination) {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
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
	 * Returns the first citizen fingerprint matcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findByuserId_First(long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchByuserId_First(userId,
				orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the first citizen fingerprint matcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchByuserId_First(long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		List<CitizenFingerprintMatcher> list = findByuserId(userId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findByuserId_Last(long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchByuserId_Last(userId,
				orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("userId=");
		msg.append(userId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchByuserId_Last(long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		int count = countByuserId(userId);

		if (count == 0) {
			return null;
		}

		List<CitizenFingerprintMatcher> list = findByuserId(userId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the citizen fingerprint matchers before and after the current citizen fingerprint matcher in the ordered set where userId = &#63;.
	 *
	 * @param id the primary key of the current citizen fingerprint matcher
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher[] findByuserId_PrevAndNext(long id,
		long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CitizenFingerprintMatcher[] array = new CitizenFingerprintMatcherImpl[3];

			array[0] = getByuserId_PrevAndNext(session,
					citizenFingerprintMatcher, userId, orderByComparator, true);

			array[1] = citizenFingerprintMatcher;

			array[2] = getByuserId_PrevAndNext(session,
					citizenFingerprintMatcher, userId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CitizenFingerprintMatcher getByuserId_PrevAndNext(
		Session session, CitizenFingerprintMatcher citizenFingerprintMatcher,
		long userId,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
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

		query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

		query.append(_FINDER_COLUMN_USERID_USERID_2);

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
			query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(userId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(citizenFingerprintMatcher);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CitizenFingerprintMatcher> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the citizen fingerprint matchers where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeByuserId(long userId) {
		for (CitizenFingerprintMatcher citizenFingerprintMatcher : findByuserId(
				userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(citizenFingerprintMatcher);
		}
	}

	/**
	 * Returns the number of citizen fingerprint matchers where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching citizen fingerprint matchers
	 */
	@Override
	public int countByuserId(long userId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_USERID;

		Object[] finderArgs = new Object[] { userId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_USERID_USERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(userId);

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

	private static final String _FINDER_COLUMN_USERID_USERID_2 = "citizenFingerprintMatcher.userId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByid",
			new String[] { Long.class.getName() },
			CitizenFingerprintMatcherModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the citizen fingerprint matchers where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByid(long id) {
		return findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizen fingerprint matchers where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @return the range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByid(long id, int start, int end) {
		return findByid(id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByid(long id, int start,
		int end, OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return findByid(id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findByid(long id, int start,
		int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
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

		List<CitizenFingerprintMatcher> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenFingerprintMatcher>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CitizenFingerprintMatcher citizenFingerprintMatcher : list) {
					if ((id != citizenFingerprintMatcher.getId())) {
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

			query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
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
	 * Returns the first citizen fingerprint matcher in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findByid_First(long id,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchByid_First(id,
				orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the first citizen fingerprint matcher in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchByid_First(long id,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		List<CitizenFingerprintMatcher> list = findByid(id, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findByid_Last(long id,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchByid_Last(id,
				orderByComparator);

		if (citizenFingerprintMatcher != null) {
			return citizenFingerprintMatcher;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenFingerprintMatcherException(msg.toString());
	}

	/**
	 * Returns the last citizen fingerprint matcher in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen fingerprint matcher, or <code>null</code> if a matching citizen fingerprint matcher could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchByid_Last(long id,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		int count = countByid(id);

		if (count == 0) {
			return null;
		}

		List<CitizenFingerprintMatcher> list = findByid(id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the citizen fingerprint matchers where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByid(long id) {
		for (CitizenFingerprintMatcher citizenFingerprintMatcher : findByid(
				id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(citizenFingerprintMatcher);
		}
	}

	/**
	 * Returns the number of citizen fingerprint matchers where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching citizen fingerprint matchers
	 */
	@Override
	public int countByid(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZENFINGERPRINTMATCHER_WHERE);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "citizenFingerprintMatcher.id = ?";

	public CitizenFingerprintMatcherPersistenceImpl() {
		setModelClass(CitizenFingerprintMatcher.class);

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
	 * Caches the citizen fingerprint matcher in the entity cache if it is enabled.
	 *
	 * @param citizenFingerprintMatcher the citizen fingerprint matcher
	 */
	@Override
	public void cacheResult(CitizenFingerprintMatcher citizenFingerprintMatcher) {
		entityCache.putResult(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			citizenFingerprintMatcher.getPrimaryKey(), citizenFingerprintMatcher);

		citizenFingerprintMatcher.resetOriginalValues();
	}

	/**
	 * Caches the citizen fingerprint matchers in the entity cache if it is enabled.
	 *
	 * @param citizenFingerprintMatchers the citizen fingerprint matchers
	 */
	@Override
	public void cacheResult(
		List<CitizenFingerprintMatcher> citizenFingerprintMatchers) {
		for (CitizenFingerprintMatcher citizenFingerprintMatcher : citizenFingerprintMatchers) {
			if (entityCache.getResult(
						CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
						CitizenFingerprintMatcherImpl.class,
						citizenFingerprintMatcher.getPrimaryKey()) == null) {
				cacheResult(citizenFingerprintMatcher);
			}
			else {
				citizenFingerprintMatcher.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all citizen fingerprint matchers.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CitizenFingerprintMatcherImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the citizen fingerprint matcher.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CitizenFingerprintMatcher citizenFingerprintMatcher) {
		entityCache.removeResult(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			citizenFingerprintMatcher.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<CitizenFingerprintMatcher> citizenFingerprintMatchers) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CitizenFingerprintMatcher citizenFingerprintMatcher : citizenFingerprintMatchers) {
			entityCache.removeResult(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
				CitizenFingerprintMatcherImpl.class,
				citizenFingerprintMatcher.getPrimaryKey());
		}
	}

	/**
	 * Creates a new citizen fingerprint matcher with the primary key. Does not add the citizen fingerprint matcher to the database.
	 *
	 * @param id the primary key for the new citizen fingerprint matcher
	 * @return the new citizen fingerprint matcher
	 */
	@Override
	public CitizenFingerprintMatcher create(long id) {
		CitizenFingerprintMatcher citizenFingerprintMatcher = new CitizenFingerprintMatcherImpl();

		citizenFingerprintMatcher.setNew(true);
		citizenFingerprintMatcher.setPrimaryKey(id);

		return citizenFingerprintMatcher;
	}

	/**
	 * Removes the citizen fingerprint matcher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the citizen fingerprint matcher
	 * @return the citizen fingerprint matcher that was removed
	 * @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher remove(long id)
		throws NoSuchCitizenFingerprintMatcherException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the citizen fingerprint matcher with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the citizen fingerprint matcher
	 * @return the citizen fingerprint matcher that was removed
	 * @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher remove(Serializable primaryKey)
		throws NoSuchCitizenFingerprintMatcherException {
		Session session = null;

		try {
			session = openSession();

			CitizenFingerprintMatcher citizenFingerprintMatcher = (CitizenFingerprintMatcher)session.get(CitizenFingerprintMatcherImpl.class,
					primaryKey);

			if (citizenFingerprintMatcher == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCitizenFingerprintMatcherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(citizenFingerprintMatcher);
		}
		catch (NoSuchCitizenFingerprintMatcherException nsee) {
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
	protected CitizenFingerprintMatcher removeImpl(
		CitizenFingerprintMatcher citizenFingerprintMatcher) {
		citizenFingerprintMatcher = toUnwrappedModel(citizenFingerprintMatcher);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(citizenFingerprintMatcher)) {
				citizenFingerprintMatcher = (CitizenFingerprintMatcher)session.get(CitizenFingerprintMatcherImpl.class,
						citizenFingerprintMatcher.getPrimaryKeyObj());
			}

			if (citizenFingerprintMatcher != null) {
				session.delete(citizenFingerprintMatcher);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (citizenFingerprintMatcher != null) {
			clearCache(citizenFingerprintMatcher);
		}

		return citizenFingerprintMatcher;
	}

	@Override
	public CitizenFingerprintMatcher updateImpl(
		CitizenFingerprintMatcher citizenFingerprintMatcher) {
		citizenFingerprintMatcher = toUnwrappedModel(citizenFingerprintMatcher);

		boolean isNew = citizenFingerprintMatcher.isNew();

		CitizenFingerprintMatcherModelImpl citizenFingerprintMatcherModelImpl = (CitizenFingerprintMatcherModelImpl)citizenFingerprintMatcher;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (citizenFingerprintMatcher.getCreateDate() == null)) {
			if (serviceContext == null) {
				citizenFingerprintMatcher.setCreateDate(now);
			}
			else {
				citizenFingerprintMatcher.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!citizenFingerprintMatcherModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				citizenFingerprintMatcher.setModifiedDate(now);
			}
			else {
				citizenFingerprintMatcher.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (citizenFingerprintMatcher.isNew()) {
				session.save(citizenFingerprintMatcher);

				citizenFingerprintMatcher.setNew(false);
			}
			else {
				citizenFingerprintMatcher = (CitizenFingerprintMatcher)session.merge(citizenFingerprintMatcher);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CitizenFingerprintMatcherModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					citizenFingerprintMatcherModelImpl.getCitizenId(),
					citizenFingerprintMatcherModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZEN_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZEN_STATUS,
				args);

			args = new Object[] {
					citizenFingerprintMatcherModelImpl.getUserId(),
					citizenFingerprintMatcherModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID_STATUS,
				args);

			args = new Object[] {
					citizenFingerprintMatcherModelImpl.getCitizenId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
				args);

			args = new Object[] {
					citizenFingerprintMatcherModelImpl.getCitizenIdSecond()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENIDSECOND, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENIDSECOND,
				args);

			args = new Object[] { citizenFingerprintMatcherModelImpl.getStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			args = new Object[] { citizenFingerprintMatcherModelImpl.getUserId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
				args);

			args = new Object[] { citizenFingerprintMatcherModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((citizenFingerprintMatcherModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZEN_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenFingerprintMatcherModelImpl.getOriginalCitizenId(),
						citizenFingerprintMatcherModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZEN_STATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZEN_STATUS,
					args);

				args = new Object[] {
						citizenFingerprintMatcherModelImpl.getCitizenId(),
						citizenFingerprintMatcherModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZEN_STATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZEN_STATUS,
					args);
			}

			if ((citizenFingerprintMatcherModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenFingerprintMatcherModelImpl.getOriginalUserId(),
						citizenFingerprintMatcherModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID_STATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID_STATUS,
					args);

				args = new Object[] {
						citizenFingerprintMatcherModelImpl.getUserId(),
						citizenFingerprintMatcherModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID_STATUS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID_STATUS,
					args);
			}

			if ((citizenFingerprintMatcherModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenFingerprintMatcherModelImpl.getOriginalCitizenId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
					args);

				args = new Object[] {
						citizenFingerprintMatcherModelImpl.getCitizenId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
					args);
			}

			if ((citizenFingerprintMatcherModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENIDSECOND.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenFingerprintMatcherModelImpl.getOriginalCitizenIdSecond()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENIDSECOND,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENIDSECOND,
					args);

				args = new Object[] {
						citizenFingerprintMatcherModelImpl.getCitizenIdSecond()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENIDSECOND,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENIDSECOND,
					args);
			}

			if ((citizenFingerprintMatcherModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenFingerprintMatcherModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] {
						citizenFingerprintMatcherModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}

			if ((citizenFingerprintMatcherModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenFingerprintMatcherModelImpl.getOriginalUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);

				args = new Object[] {
						citizenFingerprintMatcherModelImpl.getUserId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_USERID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USERID,
					args);
			}

			if ((citizenFingerprintMatcherModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenFingerprintMatcherModelImpl.getOriginalId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { citizenFingerprintMatcherModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}
		}

		entityCache.putResult(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
			CitizenFingerprintMatcherImpl.class,
			citizenFingerprintMatcher.getPrimaryKey(),
			citizenFingerprintMatcher, false);

		citizenFingerprintMatcher.resetOriginalValues();

		return citizenFingerprintMatcher;
	}

	protected CitizenFingerprintMatcher toUnwrappedModel(
		CitizenFingerprintMatcher citizenFingerprintMatcher) {
		if (citizenFingerprintMatcher instanceof CitizenFingerprintMatcherImpl) {
			return citizenFingerprintMatcher;
		}

		CitizenFingerprintMatcherImpl citizenFingerprintMatcherImpl = new CitizenFingerprintMatcherImpl();

		citizenFingerprintMatcherImpl.setNew(citizenFingerprintMatcher.isNew());
		citizenFingerprintMatcherImpl.setPrimaryKey(citizenFingerprintMatcher.getPrimaryKey());

		citizenFingerprintMatcherImpl.setId(citizenFingerprintMatcher.getId());
		citizenFingerprintMatcherImpl.setCreateDate(citizenFingerprintMatcher.getCreateDate());
		citizenFingerprintMatcherImpl.setModifiedDate(citizenFingerprintMatcher.getModifiedDate());
		citizenFingerprintMatcherImpl.setCitizenId(citizenFingerprintMatcher.getCitizenId());
		citizenFingerprintMatcherImpl.setCitizenIdSecond(citizenFingerprintMatcher.getCitizenIdSecond());
		citizenFingerprintMatcherImpl.setScore(citizenFingerprintMatcher.getScore());
		citizenFingerprintMatcherImpl.setStatus(citizenFingerprintMatcher.getStatus());
		citizenFingerprintMatcherImpl.setUserId(citizenFingerprintMatcher.getUserId());

		return citizenFingerprintMatcherImpl;
	}

	/**
	 * Returns the citizen fingerprint matcher with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the citizen fingerprint matcher
	 * @return the citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCitizenFingerprintMatcherException {
		CitizenFingerprintMatcher citizenFingerprintMatcher = fetchByPrimaryKey(primaryKey);

		if (citizenFingerprintMatcher == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCitizenFingerprintMatcherException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return citizenFingerprintMatcher;
	}

	/**
	 * Returns the citizen fingerprint matcher with the primary key or throws a {@link NoSuchCitizenFingerprintMatcherException} if it could not be found.
	 *
	 * @param id the primary key of the citizen fingerprint matcher
	 * @return the citizen fingerprint matcher
	 * @throws NoSuchCitizenFingerprintMatcherException if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher findByPrimaryKey(long id)
		throws NoSuchCitizenFingerprintMatcherException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the citizen fingerprint matcher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the citizen fingerprint matcher
	 * @return the citizen fingerprint matcher, or <code>null</code> if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
				CitizenFingerprintMatcherImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CitizenFingerprintMatcher citizenFingerprintMatcher = (CitizenFingerprintMatcher)serializable;

		if (citizenFingerprintMatcher == null) {
			Session session = null;

			try {
				session = openSession();

				citizenFingerprintMatcher = (CitizenFingerprintMatcher)session.get(CitizenFingerprintMatcherImpl.class,
						primaryKey);

				if (citizenFingerprintMatcher != null) {
					cacheResult(citizenFingerprintMatcher);
				}
				else {
					entityCache.putResult(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
						CitizenFingerprintMatcherImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
					CitizenFingerprintMatcherImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return citizenFingerprintMatcher;
	}

	/**
	 * Returns the citizen fingerprint matcher with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the citizen fingerprint matcher
	 * @return the citizen fingerprint matcher, or <code>null</code> if a citizen fingerprint matcher with the primary key could not be found
	 */
	@Override
	public CitizenFingerprintMatcher fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, CitizenFingerprintMatcher> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CitizenFingerprintMatcher> map = new HashMap<Serializable, CitizenFingerprintMatcher>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CitizenFingerprintMatcher citizenFingerprintMatcher = fetchByPrimaryKey(primaryKey);

			if (citizenFingerprintMatcher != null) {
				map.put(primaryKey, citizenFingerprintMatcher);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
					CitizenFingerprintMatcherImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CitizenFingerprintMatcher)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE_PKS_IN);

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

			for (CitizenFingerprintMatcher citizenFingerprintMatcher : (List<CitizenFingerprintMatcher>)q.list()) {
				map.put(citizenFingerprintMatcher.getPrimaryKeyObj(),
					citizenFingerprintMatcher);

				cacheResult(citizenFingerprintMatcher);

				uncachedPrimaryKeys.remove(citizenFingerprintMatcher.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CitizenFingerprintMatcherModelImpl.ENTITY_CACHE_ENABLED,
					CitizenFingerprintMatcherImpl.class, primaryKey, nullModel);
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
	 * Returns all the citizen fingerprint matchers.
	 *
	 * @return the citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizen fingerprint matchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @return the range of citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findAll(int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen fingerprint matchers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenFingerprintMatcherModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of citizen fingerprint matchers
	 * @param end the upper bound of the range of citizen fingerprint matchers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of citizen fingerprint matchers
	 */
	@Override
	public List<CitizenFingerprintMatcher> findAll(int start, int end,
		OrderByComparator<CitizenFingerprintMatcher> orderByComparator,
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

		List<CitizenFingerprintMatcher> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenFingerprintMatcher>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CITIZENFINGERPRINTMATCHER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CITIZENFINGERPRINTMATCHER;

				if (pagination) {
					sql = sql.concat(CitizenFingerprintMatcherModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenFingerprintMatcher>)QueryUtil.list(q,
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
	 * Removes all the citizen fingerprint matchers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CitizenFingerprintMatcher citizenFingerprintMatcher : findAll()) {
			remove(citizenFingerprintMatcher);
		}
	}

	/**
	 * Returns the number of citizen fingerprint matchers.
	 *
	 * @return the number of citizen fingerprint matchers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CITIZENFINGERPRINTMATCHER);

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
		return CitizenFingerprintMatcherModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the citizen fingerprint matcher persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CitizenFingerprintMatcherImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CITIZENFINGERPRINTMATCHER = "SELECT citizenFingerprintMatcher FROM CitizenFingerprintMatcher citizenFingerprintMatcher";
	private static final String _SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE_PKS_IN =
		"SELECT citizenFingerprintMatcher FROM CitizenFingerprintMatcher citizenFingerprintMatcher WHERE id_ IN (";
	private static final String _SQL_SELECT_CITIZENFINGERPRINTMATCHER_WHERE = "SELECT citizenFingerprintMatcher FROM CitizenFingerprintMatcher citizenFingerprintMatcher WHERE ";
	private static final String _SQL_COUNT_CITIZENFINGERPRINTMATCHER = "SELECT COUNT(citizenFingerprintMatcher) FROM CitizenFingerprintMatcher citizenFingerprintMatcher";
	private static final String _SQL_COUNT_CITIZENFINGERPRINTMATCHER_WHERE = "SELECT COUNT(citizenFingerprintMatcher) FROM CitizenFingerprintMatcher citizenFingerprintMatcher WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "citizenFingerprintMatcher.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CitizenFingerprintMatcher exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CitizenFingerprintMatcher exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CitizenFingerprintMatcherPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}