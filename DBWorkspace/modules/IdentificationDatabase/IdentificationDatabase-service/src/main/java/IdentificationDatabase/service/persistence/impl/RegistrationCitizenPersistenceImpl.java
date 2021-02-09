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

import IdentificationDatabase.exception.NoSuchRegistrationCitizenException;

import IdentificationDatabase.model.RegistrationCitizen;

import IdentificationDatabase.model.impl.RegistrationCitizenImpl;
import IdentificationDatabase.model.impl.RegistrationCitizenModelImpl;

import IdentificationDatabase.service.persistence.RegistrationCitizenPersistence;

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

import java.sql.Timestamp;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the registration citizen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationCitizenPersistence
 * @see IdentificationDatabase.service.persistence.RegistrationCitizenUtil
 * @generated
 */
@ProviderType
public class RegistrationCitizenPersistenceImpl extends BasePersistenceImpl<RegistrationCitizen>
	implements RegistrationCitizenPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RegistrationCitizenUtil} to access the registration citizen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RegistrationCitizenImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystatus",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatus",
			new String[] { Integer.class.getName() },
			RegistrationCitizenModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the registration citizens where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findBystatus(int status) {
		return findBystatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration citizens where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findBystatus(int status, int start, int end) {
		return findBystatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findBystatus(int status, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findBystatus(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the registration citizens where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findBystatus(int status, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator,
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

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RegistrationCitizen registrationCitizen : list) {
					if ((status != registrationCitizen.getStatus())) {
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

			query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Returns the first registration citizen in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findBystatus_First(int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchBystatus_First(status,
				orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the first registration citizen in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchBystatus_First(int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		List<RegistrationCitizen> list = findBystatus(status, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration citizen in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findBystatus_Last(int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchBystatus_Last(status,
				orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the last registration citizen in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchBystatus_Last(int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		int count = countBystatus(status);

		if (count == 0) {
			return null;
		}

		List<RegistrationCitizen> list = findBystatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registration citizens before and after the current registration citizen in the ordered set where status = &#63;.
	 *
	 * @param id the primary key of the current registration citizen
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen[] findBystatus_PrevAndNext(long id, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RegistrationCitizen[] array = new RegistrationCitizenImpl[3];

			array[0] = getBystatus_PrevAndNext(session, registrationCitizen,
					status, orderByComparator, true);

			array[1] = registrationCitizen;

			array[2] = getBystatus_PrevAndNext(session, registrationCitizen,
					status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RegistrationCitizen getBystatus_PrevAndNext(Session session,
		RegistrationCitizen registrationCitizen, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator,
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

		query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

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
			query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registrationCitizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegistrationCitizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registration citizens where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBystatus(int status) {
		for (RegistrationCitizen registrationCitizen : findBystatus(status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching registration citizens
	 */
	@Override
	public int countBystatus(int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REGISTRATIONCITIZEN_WHERE);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "registrationCitizen.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CODE = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBycode",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycode",
			new String[] { String.class.getName() },
			RegistrationCitizenModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CODE = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycode",
			new String[] { String.class.getName() });

	/**
	 * Returns all the registration citizens where code = &#63;.
	 *
	 * @param code the code
	 * @return the matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findBycode(String code) {
		return findBycode(code, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration citizens where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findBycode(String code, int start, int end) {
		return findBycode(code, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findBycode(String code, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findBycode(code, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the registration citizens where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findBycode(String code, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE;
			finderArgs = new Object[] { code };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CODE;
			finderArgs = new Object[] { code, start, end, orderByComparator };
		}

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RegistrationCitizen registrationCitizen : list) {
					if (!Objects.equals(code, registrationCitizen.getCode())) {
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

			query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Returns the first registration citizen in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findBycode_First(String code,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchBycode_First(code,
				orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the first registration citizen in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchBycode_First(String code,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		List<RegistrationCitizen> list = findBycode(code, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration citizen in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findBycode_Last(String code,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchBycode_Last(code,
				orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("code=");
		msg.append(code);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the last registration citizen in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchBycode_Last(String code,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		int count = countBycode(code);

		if (count == 0) {
			return null;
		}

		List<RegistrationCitizen> list = findBycode(code, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registration citizens before and after the current registration citizen in the ordered set where code = &#63;.
	 *
	 * @param id the primary key of the current registration citizen
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen[] findBycode_PrevAndNext(long id, String code,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RegistrationCitizen[] array = new RegistrationCitizenImpl[3];

			array[0] = getBycode_PrevAndNext(session, registrationCitizen,
					code, orderByComparator, true);

			array[1] = registrationCitizen;

			array[2] = getBycode_PrevAndNext(session, registrationCitizen,
					code, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RegistrationCitizen getBycode_PrevAndNext(Session session,
		RegistrationCitizen registrationCitizen, String code,
		OrderByComparator<RegistrationCitizen> orderByComparator,
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

		query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

		boolean bindCode = false;

		if (code == null) {
			query.append(_FINDER_COLUMN_CODE_CODE_1);
		}
		else if (code.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CODE_CODE_3);
		}
		else {
			bindCode = true;

			query.append(_FINDER_COLUMN_CODE_CODE_2);
		}

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
			query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCode) {
			qPos.add(code);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registrationCitizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegistrationCitizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registration citizens where code = &#63; from the database.
	 *
	 * @param code the code
	 */
	@Override
	public void removeBycode(String code) {
		for (RegistrationCitizen registrationCitizen : findBycode(code,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching registration citizens
	 */
	@Override
	public int countBycode(String code) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CODE;

		Object[] finderArgs = new Object[] { code };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REGISTRATIONCITIZEN_WHERE);

			boolean bindCode = false;

			if (code == null) {
				query.append(_FINDER_COLUMN_CODE_CODE_1);
			}
			else if (code.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CODE_CODE_3);
			}
			else {
				bindCode = true;

				query.append(_FINDER_COLUMN_CODE_CODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCode) {
					qPos.add(code);
				}

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

	private static final String _FINDER_COLUMN_CODE_CODE_1 = "registrationCitizen.code IS NULL";
	private static final String _FINDER_COLUMN_CODE_CODE_2 = "registrationCitizen.code = ?";
	private static final String _FINDER_COLUMN_CODE_CODE_3 = "(registrationCitizen.code IS NULL OR registrationCitizen.code = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_RECIPTNO = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByreciptNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECIPTNO =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByreciptNo",
			new String[] { String.class.getName() },
			RegistrationCitizenModelImpl.RECIPTNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_RECIPTNO = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByreciptNo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the registration citizens where reciptNo = &#63;.
	 *
	 * @param reciptNo the recipt no
	 * @return the matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByreciptNo(String reciptNo) {
		return findByreciptNo(reciptNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the registration citizens where reciptNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param reciptNo the recipt no
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByreciptNo(String reciptNo, int start,
		int end) {
		return findByreciptNo(reciptNo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens where reciptNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param reciptNo the recipt no
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByreciptNo(String reciptNo, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findByreciptNo(reciptNo, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the registration citizens where reciptNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param reciptNo the recipt no
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByreciptNo(String reciptNo, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECIPTNO;
			finderArgs = new Object[] { reciptNo };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_RECIPTNO;
			finderArgs = new Object[] { reciptNo, start, end, orderByComparator };
		}

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RegistrationCitizen registrationCitizen : list) {
					if (!Objects.equals(reciptNo,
								registrationCitizen.getReciptNo())) {
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

			query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

			boolean bindReciptNo = false;

			if (reciptNo == null) {
				query.append(_FINDER_COLUMN_RECIPTNO_RECIPTNO_1);
			}
			else if (reciptNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RECIPTNO_RECIPTNO_3);
			}
			else {
				bindReciptNo = true;

				query.append(_FINDER_COLUMN_RECIPTNO_RECIPTNO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindReciptNo) {
					qPos.add(reciptNo);
				}

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Returns the first registration citizen in the ordered set where reciptNo = &#63;.
	 *
	 * @param reciptNo the recipt no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByreciptNo_First(String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByreciptNo_First(reciptNo,
				orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("reciptNo=");
		msg.append(reciptNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the first registration citizen in the ordered set where reciptNo = &#63;.
	 *
	 * @param reciptNo the recipt no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByreciptNo_First(String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		List<RegistrationCitizen> list = findByreciptNo(reciptNo, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration citizen in the ordered set where reciptNo = &#63;.
	 *
	 * @param reciptNo the recipt no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByreciptNo_Last(String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByreciptNo_Last(reciptNo,
				orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("reciptNo=");
		msg.append(reciptNo);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the last registration citizen in the ordered set where reciptNo = &#63;.
	 *
	 * @param reciptNo the recipt no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByreciptNo_Last(String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		int count = countByreciptNo(reciptNo);

		if (count == 0) {
			return null;
		}

		List<RegistrationCitizen> list = findByreciptNo(reciptNo, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registration citizens before and after the current registration citizen in the ordered set where reciptNo = &#63;.
	 *
	 * @param id the primary key of the current registration citizen
	 * @param reciptNo the recipt no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen[] findByreciptNo_PrevAndNext(long id,
		String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RegistrationCitizen[] array = new RegistrationCitizenImpl[3];

			array[0] = getByreciptNo_PrevAndNext(session, registrationCitizen,
					reciptNo, orderByComparator, true);

			array[1] = registrationCitizen;

			array[2] = getByreciptNo_PrevAndNext(session, registrationCitizen,
					reciptNo, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RegistrationCitizen getByreciptNo_PrevAndNext(Session session,
		RegistrationCitizen registrationCitizen, String reciptNo,
		OrderByComparator<RegistrationCitizen> orderByComparator,
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

		query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

		boolean bindReciptNo = false;

		if (reciptNo == null) {
			query.append(_FINDER_COLUMN_RECIPTNO_RECIPTNO_1);
		}
		else if (reciptNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_RECIPTNO_RECIPTNO_3);
		}
		else {
			bindReciptNo = true;

			query.append(_FINDER_COLUMN_RECIPTNO_RECIPTNO_2);
		}

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
			query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindReciptNo) {
			qPos.add(reciptNo);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registrationCitizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegistrationCitizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registration citizens where reciptNo = &#63; from the database.
	 *
	 * @param reciptNo the recipt no
	 */
	@Override
	public void removeByreciptNo(String reciptNo) {
		for (RegistrationCitizen registrationCitizen : findByreciptNo(
				reciptNo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens where reciptNo = &#63;.
	 *
	 * @param reciptNo the recipt no
	 * @return the number of matching registration citizens
	 */
	@Override
	public int countByreciptNo(String reciptNo) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_RECIPTNO;

		Object[] finderArgs = new Object[] { reciptNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REGISTRATIONCITIZEN_WHERE);

			boolean bindReciptNo = false;

			if (reciptNo == null) {
				query.append(_FINDER_COLUMN_RECIPTNO_RECIPTNO_1);
			}
			else if (reciptNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_RECIPTNO_RECIPTNO_3);
			}
			else {
				bindReciptNo = true;

				query.append(_FINDER_COLUMN_RECIPTNO_RECIPTNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindReciptNo) {
					qPos.add(reciptNo);
				}

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

	private static final String _FINDER_COLUMN_RECIPTNO_RECIPTNO_1 = "registrationCitizen.reciptNo IS NULL";
	private static final String _FINDER_COLUMN_RECIPTNO_RECIPTNO_2 = "registrationCitizen.reciptNo = ?";
	private static final String _FINDER_COLUMN_RECIPTNO_RECIPTNO_3 = "(registrationCitizen.reciptNo IS NULL OR registrationCitizen.reciptNo = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByid",
			new String[] { Long.class.getName() },
			RegistrationCitizenModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the registration citizens where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByid(long id) {
		return findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration citizens where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByid(long id, int start, int end) {
		return findByid(id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByid(long id, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findByid(id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the registration citizens where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByid(long id, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
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

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RegistrationCitizen registrationCitizen : list) {
					if ((id != registrationCitizen.getId())) {
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

			query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Returns the first registration citizen in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByid_First(long id,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByid_First(id,
				orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the first registration citizen in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByid_First(long id,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		List<RegistrationCitizen> list = findByid(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration citizen in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByid_Last(long id,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByid_Last(id,
				orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the last registration citizen in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByid_Last(long id,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		int count = countByid(id);

		if (count == 0) {
			return null;
		}

		List<RegistrationCitizen> list = findByid(id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the registration citizens where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByid(long id) {
		for (RegistrationCitizen registrationCitizen : findByid(id,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching registration citizens
	 */
	@Override
	public int countByid(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REGISTRATIONCITIZEN_WHERE);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "registrationCitizen.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOUSENO = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByhouseNo",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSENO =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByhouseNo",
			new String[] { String.class.getName(), String.class.getName() },
			RegistrationCitizenModelImpl.HOUSENO_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.KEBELE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOUSENO = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByhouseNo",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the registration citizens where houseNo = &#63; and kebele = &#63;.
	 *
	 * @param houseNo the house no
	 * @param kebele the kebele
	 * @return the matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByhouseNo(String houseNo, String kebele) {
		return findByhouseNo(houseNo, kebele, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration citizens where houseNo = &#63; and kebele = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param houseNo the house no
	 * @param kebele the kebele
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByhouseNo(String houseNo,
		String kebele, int start, int end) {
		return findByhouseNo(houseNo, kebele, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens where houseNo = &#63; and kebele = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param houseNo the house no
	 * @param kebele the kebele
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByhouseNo(String houseNo,
		String kebele, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findByhouseNo(houseNo, kebele, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the registration citizens where houseNo = &#63; and kebele = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param houseNo the house no
	 * @param kebele the kebele
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByhouseNo(String houseNo,
		String kebele, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSENO;
			finderArgs = new Object[] { houseNo, kebele };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOUSENO;
			finderArgs = new Object[] {
					houseNo, kebele,
					
					start, end, orderByComparator
				};
		}

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RegistrationCitizen registrationCitizen : list) {
					if (!Objects.equals(houseNo,
								registrationCitizen.getHouseNo()) ||
							!Objects.equals(kebele,
								registrationCitizen.getKebele())) {
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

			query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

			boolean bindHouseNo = false;

			if (houseNo == null) {
				query.append(_FINDER_COLUMN_HOUSENO_HOUSENO_1);
			}
			else if (houseNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HOUSENO_HOUSENO_3);
			}
			else {
				bindHouseNo = true;

				query.append(_FINDER_COLUMN_HOUSENO_HOUSENO_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_HOUSENO_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HOUSENO_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_HOUSENO_KEBELE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindHouseNo) {
					qPos.add(houseNo);
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Returns the first registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	 *
	 * @param houseNo the house no
	 * @param kebele the kebele
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByhouseNo_First(String houseNo,
		String kebele, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByhouseNo_First(houseNo,
				kebele, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("houseNo=");
		msg.append(houseNo);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the first registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	 *
	 * @param houseNo the house no
	 * @param kebele the kebele
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByhouseNo_First(String houseNo,
		String kebele, OrderByComparator<RegistrationCitizen> orderByComparator) {
		List<RegistrationCitizen> list = findByhouseNo(houseNo, kebele, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	 *
	 * @param houseNo the house no
	 * @param kebele the kebele
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByhouseNo_Last(String houseNo,
		String kebele, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByhouseNo_Last(houseNo,
				kebele, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("houseNo=");
		msg.append(houseNo);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the last registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	 *
	 * @param houseNo the house no
	 * @param kebele the kebele
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByhouseNo_Last(String houseNo,
		String kebele, OrderByComparator<RegistrationCitizen> orderByComparator) {
		int count = countByhouseNo(houseNo, kebele);

		if (count == 0) {
			return null;
		}

		List<RegistrationCitizen> list = findByhouseNo(houseNo, kebele,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registration citizens before and after the current registration citizen in the ordered set where houseNo = &#63; and kebele = &#63;.
	 *
	 * @param id the primary key of the current registration citizen
	 * @param houseNo the house no
	 * @param kebele the kebele
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen[] findByhouseNo_PrevAndNext(long id,
		String houseNo, String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RegistrationCitizen[] array = new RegistrationCitizenImpl[3];

			array[0] = getByhouseNo_PrevAndNext(session, registrationCitizen,
					houseNo, kebele, orderByComparator, true);

			array[1] = registrationCitizen;

			array[2] = getByhouseNo_PrevAndNext(session, registrationCitizen,
					houseNo, kebele, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RegistrationCitizen getByhouseNo_PrevAndNext(Session session,
		RegistrationCitizen registrationCitizen, String houseNo, String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator,
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

		query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

		boolean bindHouseNo = false;

		if (houseNo == null) {
			query.append(_FINDER_COLUMN_HOUSENO_HOUSENO_1);
		}
		else if (houseNo.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_HOUSENO_HOUSENO_3);
		}
		else {
			bindHouseNo = true;

			query.append(_FINDER_COLUMN_HOUSENO_HOUSENO_2);
		}

		boolean bindKebele = false;

		if (kebele == null) {
			query.append(_FINDER_COLUMN_HOUSENO_KEBELE_1);
		}
		else if (kebele.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_HOUSENO_KEBELE_3);
		}
		else {
			bindKebele = true;

			query.append(_FINDER_COLUMN_HOUSENO_KEBELE_2);
		}

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
			query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindHouseNo) {
			qPos.add(houseNo);
		}

		if (bindKebele) {
			qPos.add(kebele);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registrationCitizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegistrationCitizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registration citizens where houseNo = &#63; and kebele = &#63; from the database.
	 *
	 * @param houseNo the house no
	 * @param kebele the kebele
	 */
	@Override
	public void removeByhouseNo(String houseNo, String kebele) {
		for (RegistrationCitizen registrationCitizen : findByhouseNo(houseNo,
				kebele, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens where houseNo = &#63; and kebele = &#63;.
	 *
	 * @param houseNo the house no
	 * @param kebele the kebele
	 * @return the number of matching registration citizens
	 */
	@Override
	public int countByhouseNo(String houseNo, String kebele) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HOUSENO;

		Object[] finderArgs = new Object[] { houseNo, kebele };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_REGISTRATIONCITIZEN_WHERE);

			boolean bindHouseNo = false;

			if (houseNo == null) {
				query.append(_FINDER_COLUMN_HOUSENO_HOUSENO_1);
			}
			else if (houseNo.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HOUSENO_HOUSENO_3);
			}
			else {
				bindHouseNo = true;

				query.append(_FINDER_COLUMN_HOUSENO_HOUSENO_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_HOUSENO_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HOUSENO_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_HOUSENO_KEBELE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindHouseNo) {
					qPos.add(houseNo);
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

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

	private static final String _FINDER_COLUMN_HOUSENO_HOUSENO_1 = "registrationCitizen.houseNo IS NULL AND ";
	private static final String _FINDER_COLUMN_HOUSENO_HOUSENO_2 = "registrationCitizen.houseNo = ? AND ";
	private static final String _FINDER_COLUMN_HOUSENO_HOUSENO_3 = "(registrationCitizen.houseNo IS NULL OR registrationCitizen.houseNo = '') AND ";
	private static final String _FINDER_COLUMN_HOUSENO_KEBELE_1 = "registrationCitizen.kebele IS NULL";
	private static final String _FINDER_COLUMN_HOUSENO_KEBELE_2 = "registrationCitizen.kebele = ?";
	private static final String _FINDER_COLUMN_HOUSENO_KEBELE_3 = "(registrationCitizen.kebele IS NULL OR registrationCitizen.kebele = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_REPORT = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByreport",
			new String[] {
				Date.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByreport",
			new String[] { Date.class.getName(), String.class.getName() },
			RegistrationCitizenModelImpl.ISSUEDATE_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.KEBELE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REPORT = new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByreport",
			new String[] { Date.class.getName(), String.class.getName() });

	/**
	 * Returns all the registration citizens where issueDate = &#63; and kebele = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @return the matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByreport(Date issueDate, String kebele) {
		return findByreport(issueDate, kebele, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration citizens where issueDate = &#63; and kebele = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByreport(Date issueDate,
		String kebele, int start, int end) {
		return findByreport(issueDate, kebele, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByreport(Date issueDate,
		String kebele, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findByreport(issueDate, kebele, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByreport(Date issueDate,
		String kebele, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORT;
			finderArgs = new Object[] { issueDate, kebele };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_REPORT;
			finderArgs = new Object[] {
					issueDate, kebele,
					
					start, end, orderByComparator
				};
		}

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RegistrationCitizen registrationCitizen : list) {
					if (!Objects.equals(issueDate,
								registrationCitizen.getIssueDate()) ||
							!Objects.equals(kebele,
								registrationCitizen.getKebele())) {
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

			query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

			boolean bindIssueDate = false;

			if (issueDate == null) {
				query.append(_FINDER_COLUMN_REPORT_ISSUEDATE_1);
			}
			else {
				bindIssueDate = true;

				query.append(_FINDER_COLUMN_REPORT_ISSUEDATE_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_REPORT_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPORT_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_REPORT_KEBELE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssueDate) {
					qPos.add(new Timestamp(issueDate.getTime()));
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByreport_First(Date issueDate,
		String kebele, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByreport_First(issueDate,
				kebele, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueDate=");
		msg.append(issueDate);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByreport_First(Date issueDate,
		String kebele, OrderByComparator<RegistrationCitizen> orderByComparator) {
		List<RegistrationCitizen> list = findByreport(issueDate, kebele, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByreport_Last(Date issueDate, String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByreport_Last(issueDate,
				kebele, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueDate=");
		msg.append(issueDate);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByreport_Last(Date issueDate,
		String kebele, OrderByComparator<RegistrationCitizen> orderByComparator) {
		int count = countByreport(issueDate, kebele);

		if (count == 0) {
			return null;
		}

		List<RegistrationCitizen> list = findByreport(issueDate, kebele,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registration citizens before and after the current registration citizen in the ordered set where issueDate = &#63; and kebele = &#63;.
	 *
	 * @param id the primary key of the current registration citizen
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen[] findByreport_PrevAndNext(long id,
		Date issueDate, String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RegistrationCitizen[] array = new RegistrationCitizenImpl[3];

			array[0] = getByreport_PrevAndNext(session, registrationCitizen,
					issueDate, kebele, orderByComparator, true);

			array[1] = registrationCitizen;

			array[2] = getByreport_PrevAndNext(session, registrationCitizen,
					issueDate, kebele, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RegistrationCitizen getByreport_PrevAndNext(Session session,
		RegistrationCitizen registrationCitizen, Date issueDate, String kebele,
		OrderByComparator<RegistrationCitizen> orderByComparator,
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

		query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

		boolean bindIssueDate = false;

		if (issueDate == null) {
			query.append(_FINDER_COLUMN_REPORT_ISSUEDATE_1);
		}
		else {
			bindIssueDate = true;

			query.append(_FINDER_COLUMN_REPORT_ISSUEDATE_2);
		}

		boolean bindKebele = false;

		if (kebele == null) {
			query.append(_FINDER_COLUMN_REPORT_KEBELE_1);
		}
		else if (kebele.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_REPORT_KEBELE_3);
		}
		else {
			bindKebele = true;

			query.append(_FINDER_COLUMN_REPORT_KEBELE_2);
		}

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
			query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindIssueDate) {
			qPos.add(new Timestamp(issueDate.getTime()));
		}

		if (bindKebele) {
			qPos.add(kebele);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registrationCitizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegistrationCitizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registration citizens where issueDate = &#63; and kebele = &#63; from the database.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 */
	@Override
	public void removeByreport(Date issueDate, String kebele) {
		for (RegistrationCitizen registrationCitizen : findByreport(issueDate,
				kebele, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens where issueDate = &#63; and kebele = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @return the number of matching registration citizens
	 */
	@Override
	public int countByreport(Date issueDate, String kebele) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_REPORT;

		Object[] finderArgs = new Object[] { issueDate, kebele };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_REGISTRATIONCITIZEN_WHERE);

			boolean bindIssueDate = false;

			if (issueDate == null) {
				query.append(_FINDER_COLUMN_REPORT_ISSUEDATE_1);
			}
			else {
				bindIssueDate = true;

				query.append(_FINDER_COLUMN_REPORT_ISSUEDATE_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_REPORT_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_REPORT_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_REPORT_KEBELE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssueDate) {
					qPos.add(new Timestamp(issueDate.getTime()));
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

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

	private static final String _FINDER_COLUMN_REPORT_ISSUEDATE_1 = "registrationCitizen.issueDate IS NULL AND ";
	private static final String _FINDER_COLUMN_REPORT_ISSUEDATE_2 = "registrationCitizen.issueDate = ? AND ";
	private static final String _FINDER_COLUMN_REPORT_KEBELE_1 = "registrationCitizen.kebele IS NULL";
	private static final String _FINDER_COLUMN_REPORT_KEBELE_2 = "registrationCitizen.kebele = ?";
	private static final String _FINDER_COLUMN_REPORT_KEBELE_3 = "(registrationCitizen.kebele IS NULL OR registrationCitizen.kebele = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUE_KEBELE_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByissue_kebele_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByissue_kebele_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			RegistrationCitizenModelImpl.ISSUEDATE_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.KEBELE_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUE_KEBELE_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByissue_kebele_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 * @return the matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, String kebele, int status) {
		return findByissue_kebele_stat_report(issueDate, kebele, status,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, String kebele, int status, int start, int end) {
		return findByissue_kebele_stat_report(issueDate, kebele, status, start,
			end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, String kebele, int status, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findByissue_kebele_stat_report(issueDate, kebele, status, start,
			end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_stat_report(
		Date issueDate, String kebele, int status, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_STAT_REPORT;
			finderArgs = new Object[] { issueDate, kebele, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUE_KEBELE_STAT_REPORT;
			finderArgs = new Object[] {
					issueDate, kebele, status,
					
					start, end, orderByComparator
				};
		}

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RegistrationCitizen registrationCitizen : list) {
					if (!Objects.equals(issueDate,
								registrationCitizen.getIssueDate()) ||
							!Objects.equals(kebele,
								registrationCitizen.getKebele()) ||
							(status != registrationCitizen.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

			boolean bindIssueDate = false;

			if (issueDate == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_ISSUEDATE_1);
			}
			else {
				bindIssueDate = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_ISSUEDATE_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_2);
			}

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssueDate) {
					qPos.add(new Timestamp(issueDate.getTime()));
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByissue_kebele_stat_report_First(
		Date issueDate, String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByissue_kebele_stat_report_First(issueDate,
				kebele, status, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueDate=");
		msg.append(issueDate);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByissue_kebele_stat_report_First(
		Date issueDate, String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		List<RegistrationCitizen> list = findByissue_kebele_stat_report(issueDate,
				kebele, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByissue_kebele_stat_report_Last(
		Date issueDate, String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByissue_kebele_stat_report_Last(issueDate,
				kebele, status, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueDate=");
		msg.append(issueDate);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByissue_kebele_stat_report_Last(
		Date issueDate, String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		int count = countByissue_kebele_stat_report(issueDate, kebele, status);

		if (count == 0) {
			return null;
		}

		List<RegistrationCitizen> list = findByissue_kebele_stat_report(issueDate,
				kebele, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registration citizens before and after the current registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current registration citizen
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen[] findByissue_kebele_stat_report_PrevAndNext(
		long id, Date issueDate, String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RegistrationCitizen[] array = new RegistrationCitizenImpl[3];

			array[0] = getByissue_kebele_stat_report_PrevAndNext(session,
					registrationCitizen, issueDate, kebele, status,
					orderByComparator, true);

			array[1] = registrationCitizen;

			array[2] = getByissue_kebele_stat_report_PrevAndNext(session,
					registrationCitizen, issueDate, kebele, status,
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

	protected RegistrationCitizen getByissue_kebele_stat_report_PrevAndNext(
		Session session, RegistrationCitizen registrationCitizen,
		Date issueDate, String kebele, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(5);
		}

		query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

		boolean bindIssueDate = false;

		if (issueDate == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_ISSUEDATE_1);
		}
		else {
			bindIssueDate = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_ISSUEDATE_2);
		}

		boolean bindKebele = false;

		if (kebele == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_1);
		}
		else if (kebele.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_3);
		}
		else {
			bindKebele = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_2);
		}

		query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_STATUS_2);

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
			query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindIssueDate) {
			qPos.add(new Timestamp(issueDate.getTime()));
		}

		if (bindKebele) {
			qPos.add(kebele);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registrationCitizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegistrationCitizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63; from the database.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 */
	@Override
	public void removeByissue_kebele_stat_report(Date issueDate, String kebele,
		int status) {
		for (RegistrationCitizen registrationCitizen : findByissue_kebele_stat_report(
				issueDate, kebele, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param status the status
	 * @return the number of matching registration citizens
	 */
	@Override
	public int countByissue_kebele_stat_report(Date issueDate, String kebele,
		int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUE_KEBELE_STAT_REPORT;

		Object[] finderArgs = new Object[] { issueDate, kebele, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_REGISTRATIONCITIZEN_WHERE);

			boolean bindIssueDate = false;

			if (issueDate == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_ISSUEDATE_1);
			}
			else {
				bindIssueDate = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_ISSUEDATE_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_2);
			}

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssueDate) {
					qPos.add(new Timestamp(issueDate.getTime()));
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

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

	private static final String _FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_ISSUEDATE_1 =
		"registrationCitizen.issueDate IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_ISSUEDATE_2 =
		"registrationCitizen.issueDate = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_1 =
		"registrationCitizen.kebele IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_2 =
		"registrationCitizen.kebele = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_KEBELE_3 =
		"(registrationCitizen.kebele IS NULL OR registrationCitizen.kebele = '') AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_STAT_REPORT_STATUS_2 =
		"registrationCitizen.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByissue_kebele_sex_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByissue_kebele_sex_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			RegistrationCitizenModelImpl.ISSUEDATE_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.KEBELE_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.SEX_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUE_KEBELE_SEX_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByissue_kebele_sex_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 * @return the matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, String kebele, String sex, int status) {
		return findByissue_kebele_sex_stat_report(issueDate, kebele, sex,
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, String kebele, String sex, int status, int start,
		int end) {
		return findByissue_kebele_sex_stat_report(issueDate, kebele, sex,
			status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, String kebele, String sex, int status, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findByissue_kebele_sex_stat_report(issueDate, kebele, sex,
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_sex_stat_report(
		Date issueDate, String kebele, String sex, int status, int start,
		int end, OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_STAT_REPORT;
			finderArgs = new Object[] { issueDate, kebele, sex, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_STAT_REPORT;
			finderArgs = new Object[] {
					issueDate, kebele, sex, status,
					
					start, end, orderByComparator
				};
		}

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RegistrationCitizen registrationCitizen : list) {
					if (!Objects.equals(issueDate,
								registrationCitizen.getIssueDate()) ||
							!Objects.equals(kebele,
								registrationCitizen.getKebele()) ||
							!Objects.equals(sex, registrationCitizen.getSex()) ||
							(status != registrationCitizen.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

			boolean bindIssueDate = false;

			if (issueDate == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_ISSUEDATE_1);
			}
			else {
				bindIssueDate = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_ISSUEDATE_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_2);
			}

			boolean bindSex = false;

			if (sex == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_1);
			}
			else if (sex.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_3);
			}
			else {
				bindSex = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_2);
			}

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssueDate) {
					qPos.add(new Timestamp(issueDate.getTime()));
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

				if (bindSex) {
					qPos.add(sex);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByissue_kebele_sex_stat_report_First(
		Date issueDate, String kebele, String sex, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByissue_kebele_sex_stat_report_First(issueDate,
				kebele, sex, status, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueDate=");
		msg.append(issueDate);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(", sex=");
		msg.append(sex);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByissue_kebele_sex_stat_report_First(
		Date issueDate, String kebele, String sex, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		List<RegistrationCitizen> list = findByissue_kebele_sex_stat_report(issueDate,
				kebele, sex, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByissue_kebele_sex_stat_report_Last(
		Date issueDate, String kebele, String sex, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByissue_kebele_sex_stat_report_Last(issueDate,
				kebele, sex, status, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueDate=");
		msg.append(issueDate);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(", sex=");
		msg.append(sex);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByissue_kebele_sex_stat_report_Last(
		Date issueDate, String kebele, String sex, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		int count = countByissue_kebele_sex_stat_report(issueDate, kebele, sex,
				status);

		if (count == 0) {
			return null;
		}

		List<RegistrationCitizen> list = findByissue_kebele_sex_stat_report(issueDate,
				kebele, sex, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registration citizens before and after the current registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current registration citizen
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen[] findByissue_kebele_sex_stat_report_PrevAndNext(
		long id, Date issueDate, String kebele, String sex, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RegistrationCitizen[] array = new RegistrationCitizenImpl[3];

			array[0] = getByissue_kebele_sex_stat_report_PrevAndNext(session,
					registrationCitizen, issueDate, kebele, sex, status,
					orderByComparator, true);

			array[1] = registrationCitizen;

			array[2] = getByissue_kebele_sex_stat_report_PrevAndNext(session,
					registrationCitizen, issueDate, kebele, sex, status,
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

	protected RegistrationCitizen getByissue_kebele_sex_stat_report_PrevAndNext(
		Session session, RegistrationCitizen registrationCitizen,
		Date issueDate, String kebele, String sex, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

		boolean bindIssueDate = false;

		if (issueDate == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_ISSUEDATE_1);
		}
		else {
			bindIssueDate = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_ISSUEDATE_2);
		}

		boolean bindKebele = false;

		if (kebele == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_1);
		}
		else if (kebele.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_3);
		}
		else {
			bindKebele = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_2);
		}

		boolean bindSex = false;

		if (sex == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_1);
		}
		else if (sex.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_3);
		}
		else {
			bindSex = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_2);
		}

		query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_STATUS_2);

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
			query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindIssueDate) {
			qPos.add(new Timestamp(issueDate.getTime()));
		}

		if (bindKebele) {
			qPos.add(kebele);
		}

		if (bindSex) {
			qPos.add(sex);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registrationCitizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegistrationCitizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63; from the database.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 */
	@Override
	public void removeByissue_kebele_sex_stat_report(Date issueDate,
		String kebele, String sex, int status) {
		for (RegistrationCitizen registrationCitizen : findByissue_kebele_sex_stat_report(
				issueDate, kebele, sex, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param status the status
	 * @return the number of matching registration citizens
	 */
	@Override
	public int countByissue_kebele_sex_stat_report(Date issueDate,
		String kebele, String sex, int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUE_KEBELE_SEX_STAT_REPORT;

		Object[] finderArgs = new Object[] { issueDate, kebele, sex, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_REGISTRATIONCITIZEN_WHERE);

			boolean bindIssueDate = false;

			if (issueDate == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_ISSUEDATE_1);
			}
			else {
				bindIssueDate = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_ISSUEDATE_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_2);
			}

			boolean bindSex = false;

			if (sex == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_1);
			}
			else if (sex.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_3);
			}
			else {
				bindSex = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_2);
			}

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssueDate) {
					qPos.add(new Timestamp(issueDate.getTime()));
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

				if (bindSex) {
					qPos.add(sex);
				}

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

	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_ISSUEDATE_1 =
		"registrationCitizen.issueDate IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_ISSUEDATE_2 =
		"registrationCitizen.issueDate = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_1 =
		"registrationCitizen.kebele IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_2 =
		"registrationCitizen.kebele = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_KEBELE_3 =
		"(registrationCitizen.kebele IS NULL OR registrationCitizen.kebele = '') AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_1 =
		"registrationCitizen.sex IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_2 =
		"registrationCitizen.sex = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_SEX_3 =
		"(registrationCitizen.sex IS NULL OR registrationCitizen.sex = '') AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_STAT_REPORT_STATUS_2 =
		"registrationCitizen.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUE_KEBELE_OCC_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByissue_kebele_occ_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_OCC_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByissue_kebele_occ_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			},
			RegistrationCitizenModelImpl.ISSUEDATE_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.KEBELE_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.OCCUPATION_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUE_KEBELE_OCC_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByissue_kebele_occ_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				String.class.getName(), Integer.class.getName()
			});

	/**
	 * Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 * @return the matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, String kebele, String occupation, int status) {
		return findByissue_kebele_occ_stat_report(issueDate, kebele,
			occupation, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, String kebele, String occupation, int status,
		int start, int end) {
		return findByissue_kebele_occ_stat_report(issueDate, kebele,
			occupation, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, String kebele, String occupation, int status,
		int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findByissue_kebele_occ_stat_report(issueDate, kebele,
			occupation, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_occ_stat_report(
		Date issueDate, String kebele, String occupation, int status,
		int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_OCC_STAT_REPORT;
			finderArgs = new Object[] { issueDate, kebele, occupation, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUE_KEBELE_OCC_STAT_REPORT;
			finderArgs = new Object[] {
					issueDate, kebele, occupation, status,
					
					start, end, orderByComparator
				};
		}

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RegistrationCitizen registrationCitizen : list) {
					if (!Objects.equals(issueDate,
								registrationCitizen.getIssueDate()) ||
							!Objects.equals(kebele,
								registrationCitizen.getKebele()) ||
							!Objects.equals(occupation,
								registrationCitizen.getOccupation()) ||
							(status != registrationCitizen.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(6 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(6);
			}

			query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

			boolean bindIssueDate = false;

			if (issueDate == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_ISSUEDATE_1);
			}
			else {
				bindIssueDate = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_ISSUEDATE_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_2);
			}

			boolean bindOccupation = false;

			if (occupation == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_1);
			}
			else if (occupation.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_3);
			}
			else {
				bindOccupation = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_2);
			}

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssueDate) {
					qPos.add(new Timestamp(issueDate.getTime()));
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

				if (bindOccupation) {
					qPos.add(occupation);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByissue_kebele_occ_stat_report_First(
		Date issueDate, String kebele, String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByissue_kebele_occ_stat_report_First(issueDate,
				kebele, occupation, status, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueDate=");
		msg.append(issueDate);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(", occupation=");
		msg.append(occupation);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByissue_kebele_occ_stat_report_First(
		Date issueDate, String kebele, String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		List<RegistrationCitizen> list = findByissue_kebele_occ_stat_report(issueDate,
				kebele, occupation, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByissue_kebele_occ_stat_report_Last(
		Date issueDate, String kebele, String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByissue_kebele_occ_stat_report_Last(issueDate,
				kebele, occupation, status, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(10);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueDate=");
		msg.append(issueDate);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(", occupation=");
		msg.append(occupation);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByissue_kebele_occ_stat_report_Last(
		Date issueDate, String kebele, String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		int count = countByissue_kebele_occ_stat_report(issueDate, kebele,
				occupation, status);

		if (count == 0) {
			return null;
		}

		List<RegistrationCitizen> list = findByissue_kebele_occ_stat_report(issueDate,
				kebele, occupation, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registration citizens before and after the current registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current registration citizen
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen[] findByissue_kebele_occ_stat_report_PrevAndNext(
		long id, Date issueDate, String kebele, String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RegistrationCitizen[] array = new RegistrationCitizenImpl[3];

			array[0] = getByissue_kebele_occ_stat_report_PrevAndNext(session,
					registrationCitizen, issueDate, kebele, occupation, status,
					orderByComparator, true);

			array[1] = registrationCitizen;

			array[2] = getByissue_kebele_occ_stat_report_PrevAndNext(session,
					registrationCitizen, issueDate, kebele, occupation, status,
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

	protected RegistrationCitizen getByissue_kebele_occ_stat_report_PrevAndNext(
		Session session, RegistrationCitizen registrationCitizen,
		Date issueDate, String kebele, String occupation, int status,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(7 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(6);
		}

		query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

		boolean bindIssueDate = false;

		if (issueDate == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_ISSUEDATE_1);
		}
		else {
			bindIssueDate = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_ISSUEDATE_2);
		}

		boolean bindKebele = false;

		if (kebele == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_1);
		}
		else if (kebele.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_3);
		}
		else {
			bindKebele = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_2);
		}

		boolean bindOccupation = false;

		if (occupation == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_1);
		}
		else if (occupation.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_3);
		}
		else {
			bindOccupation = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_2);
		}

		query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_STATUS_2);

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
			query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindIssueDate) {
			qPos.add(new Timestamp(issueDate.getTime()));
		}

		if (bindKebele) {
			qPos.add(kebele);
		}

		if (bindOccupation) {
			qPos.add(occupation);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registrationCitizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegistrationCitizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63; from the database.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 */
	@Override
	public void removeByissue_kebele_occ_stat_report(Date issueDate,
		String kebele, String occupation, int status) {
		for (RegistrationCitizen registrationCitizen : findByissue_kebele_occ_stat_report(
				issueDate, kebele, occupation, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param occupation the occupation
	 * @param status the status
	 * @return the number of matching registration citizens
	 */
	@Override
	public int countByissue_kebele_occ_stat_report(Date issueDate,
		String kebele, String occupation, int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUE_KEBELE_OCC_STAT_REPORT;

		Object[] finderArgs = new Object[] { issueDate, kebele, occupation, status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_COUNT_REGISTRATIONCITIZEN_WHERE);

			boolean bindIssueDate = false;

			if (issueDate == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_ISSUEDATE_1);
			}
			else {
				bindIssueDate = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_ISSUEDATE_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_2);
			}

			boolean bindOccupation = false;

			if (occupation == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_1);
			}
			else if (occupation.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_3);
			}
			else {
				bindOccupation = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_2);
			}

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssueDate) {
					qPos.add(new Timestamp(issueDate.getTime()));
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

				if (bindOccupation) {
					qPos.add(occupation);
				}

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

	private static final String _FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_ISSUEDATE_1 =
		"registrationCitizen.issueDate IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_ISSUEDATE_2 =
		"registrationCitizen.issueDate = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_1 =
		"registrationCitizen.kebele IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_2 =
		"registrationCitizen.kebele = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_KEBELE_3 =
		"(registrationCitizen.kebele IS NULL OR registrationCitizen.kebele = '') AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_1 =
		"registrationCitizen.occupation IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_2 =
		"registrationCitizen.occupation = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_OCCUPATION_3 =
		"(registrationCitizen.occupation IS NULL OR registrationCitizen.occupation = '') AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_OCC_STAT_REPORT_STATUS_2 =
		"registrationCitizen.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByissue_kebele_sex_occ_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED,
			RegistrationCitizenImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByissue_kebele_sex_occ_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			},
			RegistrationCitizenModelImpl.ISSUEDATE_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.KEBELE_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.SEX_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.OCCUPATION_COLUMN_BITMASK |
			RegistrationCitizenModelImpl.STATUS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT =
		new FinderPath(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByissue_kebele_sex_occ_stat_report",
			new String[] {
				Date.class.getName(), String.class.getName(),
				String.class.getName(), String.class.getName(),
				Integer.class.getName()
			});

	/**
	 * Returns all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 * @return the matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, String kebele, String sex, String occupation, int status) {
		return findByissue_kebele_sex_occ_stat_report(issueDate, kebele, sex,
			occupation, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, String kebele, String sex, String occupation,
		int status, int start, int end) {
		return findByissue_kebele_sex_occ_stat_report(issueDate, kebele, sex,
			occupation, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, String kebele, String sex, String occupation,
		int status, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findByissue_kebele_sex_occ_stat_report(issueDate, kebele, sex,
			occupation, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findByissue_kebele_sex_occ_stat_report(
		Date issueDate, String kebele, String sex, String occupation,
		int status, int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT;
			finderArgs = new Object[] { issueDate, kebele, sex, occupation, status };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT;
			finderArgs = new Object[] {
					issueDate, kebele, sex, occupation, status,
					
					start, end, orderByComparator
				};
		}

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RegistrationCitizen registrationCitizen : list) {
					if (!Objects.equals(issueDate,
								registrationCitizen.getIssueDate()) ||
							!Objects.equals(kebele,
								registrationCitizen.getKebele()) ||
							!Objects.equals(sex, registrationCitizen.getSex()) ||
							!Objects.equals(occupation,
								registrationCitizen.getOccupation()) ||
							(status != registrationCitizen.getStatus())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(7 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(7);
			}

			query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

			boolean bindIssueDate = false;

			if (issueDate == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_ISSUEDATE_1);
			}
			else {
				bindIssueDate = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_ISSUEDATE_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_2);
			}

			boolean bindSex = false;

			if (sex == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_1);
			}
			else if (sex.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_3);
			}
			else {
				bindSex = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_2);
			}

			boolean bindOccupation = false;

			if (occupation == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_1);
			}
			else if (occupation.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_3);
			}
			else {
				bindOccupation = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_2);
			}

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssueDate) {
					qPos.add(new Timestamp(issueDate.getTime()));
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

				if (bindSex) {
					qPos.add(sex);
				}

				if (bindOccupation) {
					qPos.add(occupation);
				}

				qPos.add(status);

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByissue_kebele_sex_occ_stat_report_First(
		Date issueDate, String kebele, String sex, String occupation,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByissue_kebele_sex_occ_stat_report_First(issueDate,
				kebele, sex, occupation, status, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueDate=");
		msg.append(issueDate);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(", sex=");
		msg.append(sex);

		msg.append(", occupation=");
		msg.append(occupation);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the first registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByissue_kebele_sex_occ_stat_report_First(
		Date issueDate, String kebele, String sex, String occupation,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator) {
		List<RegistrationCitizen> list = findByissue_kebele_sex_occ_stat_report(issueDate,
				kebele, sex, occupation, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen
	 * @throws NoSuchRegistrationCitizenException if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen findByissue_kebele_sex_occ_stat_report_Last(
		Date issueDate, String kebele, String sex, String occupation,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByissue_kebele_sex_occ_stat_report_Last(issueDate,
				kebele, sex, occupation, status, orderByComparator);

		if (registrationCitizen != null) {
			return registrationCitizen;
		}

		StringBundler msg = new StringBundler(12);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("issueDate=");
		msg.append(issueDate);

		msg.append(", kebele=");
		msg.append(kebele);

		msg.append(", sex=");
		msg.append(sex);

		msg.append(", occupation=");
		msg.append(occupation);

		msg.append(", status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRegistrationCitizenException(msg.toString());
	}

	/**
	 * Returns the last registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration citizen, or <code>null</code> if a matching registration citizen could not be found
	 */
	@Override
	public RegistrationCitizen fetchByissue_kebele_sex_occ_stat_report_Last(
		Date issueDate, String kebele, String sex, String occupation,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator) {
		int count = countByissue_kebele_sex_occ_stat_report(issueDate, kebele,
				sex, occupation, status);

		if (count == 0) {
			return null;
		}

		List<RegistrationCitizen> list = findByissue_kebele_sex_occ_stat_report(issueDate,
				kebele, sex, occupation, status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the registration citizens before and after the current registration citizen in the ordered set where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param id the primary key of the current registration citizen
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen[] findByissue_kebele_sex_occ_stat_report_PrevAndNext(
		long id, Date issueDate, String kebele, String sex, String occupation,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			RegistrationCitizen[] array = new RegistrationCitizenImpl[3];

			array[0] = getByissue_kebele_sex_occ_stat_report_PrevAndNext(session,
					registrationCitizen, issueDate, kebele, sex, occupation,
					status, orderByComparator, true);

			array[1] = registrationCitizen;

			array[2] = getByissue_kebele_sex_occ_stat_report_PrevAndNext(session,
					registrationCitizen, issueDate, kebele, sex, occupation,
					status, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RegistrationCitizen getByissue_kebele_sex_occ_stat_report_PrevAndNext(
		Session session, RegistrationCitizen registrationCitizen,
		Date issueDate, String kebele, String sex, String occupation,
		int status, OrderByComparator<RegistrationCitizen> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(8 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(7);
		}

		query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE);

		boolean bindIssueDate = false;

		if (issueDate == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_ISSUEDATE_1);
		}
		else {
			bindIssueDate = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_ISSUEDATE_2);
		}

		boolean bindKebele = false;

		if (kebele == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_1);
		}
		else if (kebele.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_3);
		}
		else {
			bindKebele = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_2);
		}

		boolean bindSex = false;

		if (sex == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_1);
		}
		else if (sex.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_3);
		}
		else {
			bindSex = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_2);
		}

		boolean bindOccupation = false;

		if (occupation == null) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_1);
		}
		else if (occupation.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_3);
		}
		else {
			bindOccupation = true;

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_2);
		}

		query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_STATUS_2);

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
			query.append(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindIssueDate) {
			qPos.add(new Timestamp(issueDate.getTime()));
		}

		if (bindKebele) {
			qPos.add(kebele);
		}

		if (bindSex) {
			qPos.add(sex);
		}

		if (bindOccupation) {
			qPos.add(occupation);
		}

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(registrationCitizen);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RegistrationCitizen> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63; from the database.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 */
	@Override
	public void removeByissue_kebele_sex_occ_stat_report(Date issueDate,
		String kebele, String sex, String occupation, int status) {
		for (RegistrationCitizen registrationCitizen : findByissue_kebele_sex_occ_stat_report(
				issueDate, kebele, sex, occupation, status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens where issueDate = &#63; and kebele = &#63; and sex = &#63; and occupation = &#63; and status = &#63;.
	 *
	 * @param issueDate the issue date
	 * @param kebele the kebele
	 * @param sex the sex
	 * @param occupation the occupation
	 * @param status the status
	 * @return the number of matching registration citizens
	 */
	@Override
	public int countByissue_kebele_sex_occ_stat_report(Date issueDate,
		String kebele, String sex, String occupation, int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT;

		Object[] finderArgs = new Object[] {
				issueDate, kebele, sex, occupation, status
			};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(6);

			query.append(_SQL_COUNT_REGISTRATIONCITIZEN_WHERE);

			boolean bindIssueDate = false;

			if (issueDate == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_ISSUEDATE_1);
			}
			else {
				bindIssueDate = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_ISSUEDATE_2);
			}

			boolean bindKebele = false;

			if (kebele == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_1);
			}
			else if (kebele.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_3);
			}
			else {
				bindKebele = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_2);
			}

			boolean bindSex = false;

			if (sex == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_1);
			}
			else if (sex.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_3);
			}
			else {
				bindSex = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_2);
			}

			boolean bindOccupation = false;

			if (occupation == null) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_1);
			}
			else if (occupation.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_3);
			}
			else {
				bindOccupation = true;

				query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_2);
			}

			query.append(_FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_STATUS_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindIssueDate) {
					qPos.add(new Timestamp(issueDate.getTime()));
				}

				if (bindKebele) {
					qPos.add(kebele);
				}

				if (bindSex) {
					qPos.add(sex);
				}

				if (bindOccupation) {
					qPos.add(occupation);
				}

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

	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_ISSUEDATE_1 =
		"registrationCitizen.issueDate IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_ISSUEDATE_2 =
		"registrationCitizen.issueDate = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_1 =
		"registrationCitizen.kebele IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_2 =
		"registrationCitizen.kebele = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_KEBELE_3 =
		"(registrationCitizen.kebele IS NULL OR registrationCitizen.kebele = '') AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_1 =
		"registrationCitizen.sex IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_2 =
		"registrationCitizen.sex = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_SEX_3 =
		"(registrationCitizen.sex IS NULL OR registrationCitizen.sex = '') AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_1 =
		"registrationCitizen.occupation IS NULL AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_2 =
		"registrationCitizen.occupation = ? AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_OCCUPATION_3 =
		"(registrationCitizen.occupation IS NULL OR registrationCitizen.occupation = '') AND ";
	private static final String _FINDER_COLUMN_ISSUE_KEBELE_SEX_OCC_STAT_REPORT_STATUS_2 =
		"registrationCitizen.status = ?";

	public RegistrationCitizenPersistenceImpl() {
		setModelClass(RegistrationCitizen.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("id", "id_");
			dbColumnNames.put("code", "code_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the registration citizen in the entity cache if it is enabled.
	 *
	 * @param registrationCitizen the registration citizen
	 */
	@Override
	public void cacheResult(RegistrationCitizen registrationCitizen) {
		entityCache.putResult(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenImpl.class, registrationCitizen.getPrimaryKey(),
			registrationCitizen);

		registrationCitizen.resetOriginalValues();
	}

	/**
	 * Caches the registration citizens in the entity cache if it is enabled.
	 *
	 * @param registrationCitizens the registration citizens
	 */
	@Override
	public void cacheResult(List<RegistrationCitizen> registrationCitizens) {
		for (RegistrationCitizen registrationCitizen : registrationCitizens) {
			if (entityCache.getResult(
						RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
						RegistrationCitizenImpl.class,
						registrationCitizen.getPrimaryKey()) == null) {
				cacheResult(registrationCitizen);
			}
			else {
				registrationCitizen.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all registration citizens.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RegistrationCitizenImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the registration citizen.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RegistrationCitizen registrationCitizen) {
		entityCache.removeResult(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenImpl.class, registrationCitizen.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RegistrationCitizen> registrationCitizens) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RegistrationCitizen registrationCitizen : registrationCitizens) {
			entityCache.removeResult(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
				RegistrationCitizenImpl.class,
				registrationCitizen.getPrimaryKey());
		}
	}

	/**
	 * Creates a new registration citizen with the primary key. Does not add the registration citizen to the database.
	 *
	 * @param id the primary key for the new registration citizen
	 * @return the new registration citizen
	 */
	@Override
	public RegistrationCitizen create(long id) {
		RegistrationCitizen registrationCitizen = new RegistrationCitizenImpl();

		registrationCitizen.setNew(true);
		registrationCitizen.setPrimaryKey(id);

		registrationCitizen.setCompanyId(companyProvider.getCompanyId());

		return registrationCitizen;
	}

	/**
	 * Removes the registration citizen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the registration citizen
	 * @return the registration citizen that was removed
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen remove(long id)
		throws NoSuchRegistrationCitizenException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the registration citizen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the registration citizen
	 * @return the registration citizen that was removed
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen remove(Serializable primaryKey)
		throws NoSuchRegistrationCitizenException {
		Session session = null;

		try {
			session = openSession();

			RegistrationCitizen registrationCitizen = (RegistrationCitizen)session.get(RegistrationCitizenImpl.class,
					primaryKey);

			if (registrationCitizen == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRegistrationCitizenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(registrationCitizen);
		}
		catch (NoSuchRegistrationCitizenException nsee) {
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
	protected RegistrationCitizen removeImpl(
		RegistrationCitizen registrationCitizen) {
		registrationCitizen = toUnwrappedModel(registrationCitizen);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(registrationCitizen)) {
				registrationCitizen = (RegistrationCitizen)session.get(RegistrationCitizenImpl.class,
						registrationCitizen.getPrimaryKeyObj());
			}

			if (registrationCitizen != null) {
				session.delete(registrationCitizen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (registrationCitizen != null) {
			clearCache(registrationCitizen);
		}

		return registrationCitizen;
	}

	@Override
	public RegistrationCitizen updateImpl(
		RegistrationCitizen registrationCitizen) {
		registrationCitizen = toUnwrappedModel(registrationCitizen);

		boolean isNew = registrationCitizen.isNew();

		RegistrationCitizenModelImpl registrationCitizenModelImpl = (RegistrationCitizenModelImpl)registrationCitizen;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (registrationCitizen.getCreateDate() == null)) {
			if (serviceContext == null) {
				registrationCitizen.setCreateDate(now);
			}
			else {
				registrationCitizen.setCreateDate(serviceContext.getCreateDate(
						now));
			}
		}

		if (!registrationCitizenModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				registrationCitizen.setModifiedDate(now);
			}
			else {
				registrationCitizen.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (registrationCitizen.isNew()) {
				session.save(registrationCitizen);

				registrationCitizen.setNew(false);
			}
			else {
				registrationCitizen = (RegistrationCitizen)session.merge(registrationCitizen);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!RegistrationCitizenModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					registrationCitizenModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			args = new Object[] { registrationCitizenModelImpl.getCode() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE,
				args);

			args = new Object[] { registrationCitizenModelImpl.getReciptNo() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_RECIPTNO, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECIPTNO,
				args);

			args = new Object[] { registrationCitizenModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			args = new Object[] {
					registrationCitizenModelImpl.getHouseNo(),
					registrationCitizenModelImpl.getKebele()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_HOUSENO, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSENO,
				args);

			args = new Object[] {
					registrationCitizenModelImpl.getIssueDate(),
					registrationCitizenModelImpl.getKebele()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REPORT, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORT,
				args);

			args = new Object[] {
					registrationCitizenModelImpl.getIssueDate(),
					registrationCitizenModelImpl.getKebele(),
					registrationCitizenModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_STAT_REPORT,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_STAT_REPORT,
				args);

			args = new Object[] {
					registrationCitizenModelImpl.getIssueDate(),
					registrationCitizenModelImpl.getKebele(),
					registrationCitizenModelImpl.getSex(),
					registrationCitizenModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_SEX_STAT_REPORT,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_STAT_REPORT,
				args);

			args = new Object[] {
					registrationCitizenModelImpl.getIssueDate(),
					registrationCitizenModelImpl.getKebele(),
					registrationCitizenModelImpl.getOccupation(),
					registrationCitizenModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_OCC_STAT_REPORT,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_OCC_STAT_REPORT,
				args);

			args = new Object[] {
					registrationCitizenModelImpl.getIssueDate(),
					registrationCitizenModelImpl.getKebele(),
					registrationCitizenModelImpl.getSex(),
					registrationCitizenModelImpl.getOccupation(),
					registrationCitizenModelImpl.getStatus()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((registrationCitizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationCitizenModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { registrationCitizenModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}

			if ((registrationCitizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationCitizenModelImpl.getOriginalCode()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE,
					args);

				args = new Object[] { registrationCitizenModelImpl.getCode() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CODE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CODE,
					args);
			}

			if ((registrationCitizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECIPTNO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationCitizenModelImpl.getOriginalReciptNo()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_RECIPTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECIPTNO,
					args);

				args = new Object[] { registrationCitizenModelImpl.getReciptNo() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_RECIPTNO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_RECIPTNO,
					args);
			}

			if ((registrationCitizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationCitizenModelImpl.getOriginalId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { registrationCitizenModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}

			if ((registrationCitizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSENO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationCitizenModelImpl.getOriginalHouseNo(),
						registrationCitizenModelImpl.getOriginalKebele()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_HOUSENO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSENO,
					args);

				args = new Object[] {
						registrationCitizenModelImpl.getHouseNo(),
						registrationCitizenModelImpl.getKebele()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_HOUSENO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSENO,
					args);
			}

			if ((registrationCitizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationCitizenModelImpl.getOriginalIssueDate(),
						registrationCitizenModelImpl.getOriginalKebele()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REPORT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORT,
					args);

				args = new Object[] {
						registrationCitizenModelImpl.getIssueDate(),
						registrationCitizenModelImpl.getKebele()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_REPORT, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_REPORT,
					args);
			}

			if ((registrationCitizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_STAT_REPORT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationCitizenModelImpl.getOriginalIssueDate(),
						registrationCitizenModelImpl.getOriginalKebele(),
						registrationCitizenModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_STAT_REPORT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_STAT_REPORT,
					args);

				args = new Object[] {
						registrationCitizenModelImpl.getIssueDate(),
						registrationCitizenModelImpl.getKebele(),
						registrationCitizenModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_STAT_REPORT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_STAT_REPORT,
					args);
			}

			if ((registrationCitizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_STAT_REPORT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationCitizenModelImpl.getOriginalIssueDate(),
						registrationCitizenModelImpl.getOriginalKebele(),
						registrationCitizenModelImpl.getOriginalSex(),
						registrationCitizenModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_SEX_STAT_REPORT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_STAT_REPORT,
					args);

				args = new Object[] {
						registrationCitizenModelImpl.getIssueDate(),
						registrationCitizenModelImpl.getKebele(),
						registrationCitizenModelImpl.getSex(),
						registrationCitizenModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_SEX_STAT_REPORT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_STAT_REPORT,
					args);
			}

			if ((registrationCitizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_OCC_STAT_REPORT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationCitizenModelImpl.getOriginalIssueDate(),
						registrationCitizenModelImpl.getOriginalKebele(),
						registrationCitizenModelImpl.getOriginalOccupation(),
						registrationCitizenModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_OCC_STAT_REPORT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_OCC_STAT_REPORT,
					args);

				args = new Object[] {
						registrationCitizenModelImpl.getIssueDate(),
						registrationCitizenModelImpl.getKebele(),
						registrationCitizenModelImpl.getOccupation(),
						registrationCitizenModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_OCC_STAT_REPORT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_OCC_STAT_REPORT,
					args);
			}

			if ((registrationCitizenModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						registrationCitizenModelImpl.getOriginalIssueDate(),
						registrationCitizenModelImpl.getOriginalKebele(),
						registrationCitizenModelImpl.getOriginalSex(),
						registrationCitizenModelImpl.getOriginalOccupation(),
						registrationCitizenModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT,
					args);

				args = new Object[] {
						registrationCitizenModelImpl.getIssueDate(),
						registrationCitizenModelImpl.getKebele(),
						registrationCitizenModelImpl.getSex(),
						registrationCitizenModelImpl.getOccupation(),
						registrationCitizenModelImpl.getStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ISSUE_KEBELE_SEX_OCC_STAT_REPORT,
					args);
			}
		}

		entityCache.putResult(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
			RegistrationCitizenImpl.class, registrationCitizen.getPrimaryKey(),
			registrationCitizen, false);

		registrationCitizen.resetOriginalValues();

		return registrationCitizen;
	}

	protected RegistrationCitizen toUnwrappedModel(
		RegistrationCitizen registrationCitizen) {
		if (registrationCitizen instanceof RegistrationCitizenImpl) {
			return registrationCitizen;
		}

		RegistrationCitizenImpl registrationCitizenImpl = new RegistrationCitizenImpl();

		registrationCitizenImpl.setNew(registrationCitizen.isNew());
		registrationCitizenImpl.setPrimaryKey(registrationCitizen.getPrimaryKey());

		registrationCitizenImpl.setId(registrationCitizen.getId());
		registrationCitizenImpl.setGroupId(registrationCitizen.getGroupId());
		registrationCitizenImpl.setCompanyId(registrationCitizen.getCompanyId());
		registrationCitizenImpl.setUserId(registrationCitizen.getUserId());
		registrationCitizenImpl.setUserName(registrationCitizen.getUserName());
		registrationCitizenImpl.setCreateDate(registrationCitizen.getCreateDate());
		registrationCitizenImpl.setModifiedDate(registrationCitizen.getModifiedDate());
		registrationCitizenImpl.setCode(registrationCitizen.getCode());
		registrationCitizenImpl.setOwner(registrationCitizen.isOwner());
		registrationCitizenImpl.setCity(registrationCitizen.getCity());
		registrationCitizenImpl.setSubCity(registrationCitizen.getSubCity());
		registrationCitizenImpl.setKebele(registrationCitizen.getKebele());
		registrationCitizenImpl.setHouseNo(registrationCitizen.getHouseNo());
		registrationCitizenImpl.setName(registrationCitizen.getName());
		registrationCitizenImpl.setFatherName(registrationCitizen.getFatherName());
		registrationCitizenImpl.setGrandfatherName(registrationCitizen.getGrandfatherName());
		registrationCitizenImpl.setMotherName(registrationCitizen.getMotherName());
		registrationCitizenImpl.setCitizenship(registrationCitizen.getCitizenship());
		registrationCitizenImpl.setNation(registrationCitizen.getNation());
		registrationCitizenImpl.setBirthDate(registrationCitizen.getBirthDate());
		registrationCitizenImpl.setBirthPlace(registrationCitizen.getBirthPlace());
		registrationCitizenImpl.setSex(registrationCitizen.getSex());
		registrationCitizenImpl.setOccupation(registrationCitizen.getOccupation());
		registrationCitizenImpl.setTelephone(registrationCitizen.getTelephone());
		registrationCitizenImpl.setRelation(registrationCitizen.getRelation());
		registrationCitizenImpl.setIdType(registrationCitizen.getIdType());
		registrationCitizenImpl.setIssueDate(registrationCitizen.getIssueDate());
		registrationCitizenImpl.setExpireDate(registrationCitizen.getExpireDate());
		registrationCitizenImpl.setEmergencyContactName(registrationCitizen.getEmergencyContactName());
		registrationCitizenImpl.setEmergencyContacPhone(registrationCitizen.getEmergencyContacPhone());
		registrationCitizenImpl.setImage(registrationCitizen.getImage());
		registrationCitizenImpl.setSignature(registrationCitizen.getSignature());
		registrationCitizenImpl.setFingerprint(registrationCitizen.getFingerprint());
		registrationCitizenImpl.setStatus(registrationCitizen.getStatus());
		registrationCitizenImpl.setReciptNo(registrationCitizen.getReciptNo());
		registrationCitizenImpl.setNotice(registrationCitizen.getNotice());

		return registrationCitizenImpl;
	}

	/**
	 * Returns the registration citizen with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the registration citizen
	 * @return the registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRegistrationCitizenException {
		RegistrationCitizen registrationCitizen = fetchByPrimaryKey(primaryKey);

		if (registrationCitizen == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRegistrationCitizenException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return registrationCitizen;
	}

	/**
	 * Returns the registration citizen with the primary key or throws a {@link NoSuchRegistrationCitizenException} if it could not be found.
	 *
	 * @param id the primary key of the registration citizen
	 * @return the registration citizen
	 * @throws NoSuchRegistrationCitizenException if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen findByPrimaryKey(long id)
		throws NoSuchRegistrationCitizenException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the registration citizen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the registration citizen
	 * @return the registration citizen, or <code>null</code> if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
				RegistrationCitizenImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		RegistrationCitizen registrationCitizen = (RegistrationCitizen)serializable;

		if (registrationCitizen == null) {
			Session session = null;

			try {
				session = openSession();

				registrationCitizen = (RegistrationCitizen)session.get(RegistrationCitizenImpl.class,
						primaryKey);

				if (registrationCitizen != null) {
					cacheResult(registrationCitizen);
				}
				else {
					entityCache.putResult(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
						RegistrationCitizenImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
					RegistrationCitizenImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return registrationCitizen;
	}

	/**
	 * Returns the registration citizen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the registration citizen
	 * @return the registration citizen, or <code>null</code> if a registration citizen with the primary key could not be found
	 */
	@Override
	public RegistrationCitizen fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, RegistrationCitizen> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, RegistrationCitizen> map = new HashMap<Serializable, RegistrationCitizen>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			RegistrationCitizen registrationCitizen = fetchByPrimaryKey(primaryKey);

			if (registrationCitizen != null) {
				map.put(primaryKey, registrationCitizen);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
					RegistrationCitizenImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (RegistrationCitizen)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_REGISTRATIONCITIZEN_WHERE_PKS_IN);

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

			for (RegistrationCitizen registrationCitizen : (List<RegistrationCitizen>)q.list()) {
				map.put(registrationCitizen.getPrimaryKeyObj(),
					registrationCitizen);

				cacheResult(registrationCitizen);

				uncachedPrimaryKeys.remove(registrationCitizen.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(RegistrationCitizenModelImpl.ENTITY_CACHE_ENABLED,
					RegistrationCitizenImpl.class, primaryKey, nullModel);
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
	 * Returns all the registration citizens.
	 *
	 * @return the registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the registration citizens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @return the range of registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the registration citizens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findAll(int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the registration citizens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RegistrationCitizenModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registration citizens
	 * @param end the upper bound of the range of registration citizens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of registration citizens
	 */
	@Override
	public List<RegistrationCitizen> findAll(int start, int end,
		OrderByComparator<RegistrationCitizen> orderByComparator,
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

		List<RegistrationCitizen> list = null;

		if (retrieveFromCache) {
			list = (List<RegistrationCitizen>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REGISTRATIONCITIZEN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REGISTRATIONCITIZEN;

				if (pagination) {
					sql = sql.concat(RegistrationCitizenModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistrationCitizen>)QueryUtil.list(q,
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
	 * Removes all the registration citizens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RegistrationCitizen registrationCitizen : findAll()) {
			remove(registrationCitizen);
		}
	}

	/**
	 * Returns the number of registration citizens.
	 *
	 * @return the number of registration citizens
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REGISTRATIONCITIZEN);

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
		return RegistrationCitizenModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the registration citizen persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(RegistrationCitizenImpl.class.getName());
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
	private static final String _SQL_SELECT_REGISTRATIONCITIZEN = "SELECT registrationCitizen FROM RegistrationCitizen registrationCitizen";
	private static final String _SQL_SELECT_REGISTRATIONCITIZEN_WHERE_PKS_IN = "SELECT registrationCitizen FROM RegistrationCitizen registrationCitizen WHERE id_ IN (";
	private static final String _SQL_SELECT_REGISTRATIONCITIZEN_WHERE = "SELECT registrationCitizen FROM RegistrationCitizen registrationCitizen WHERE ";
	private static final String _SQL_COUNT_REGISTRATIONCITIZEN = "SELECT COUNT(registrationCitizen) FROM RegistrationCitizen registrationCitizen";
	private static final String _SQL_COUNT_REGISTRATIONCITIZEN_WHERE = "SELECT COUNT(registrationCitizen) FROM RegistrationCitizen registrationCitizen WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "registrationCitizen.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RegistrationCitizen exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RegistrationCitizen exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(RegistrationCitizenPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "code"
			});
}