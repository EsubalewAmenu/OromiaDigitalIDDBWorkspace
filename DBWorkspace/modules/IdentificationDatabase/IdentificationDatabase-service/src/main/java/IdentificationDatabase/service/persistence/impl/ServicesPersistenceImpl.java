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

import IdentificationDatabase.exception.NoSuchServicesException;

import IdentificationDatabase.model.Services;

import IdentificationDatabase.model.impl.ServicesImpl;
import IdentificationDatabase.model.impl.ServicesModelImpl;

import IdentificationDatabase.service.persistence.ServicesPersistence;

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
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ServicesPersistence
 * @see IdentificationDatabase.service.persistence.ServicesUtil
 * @generated
 */
@ProviderType
public class ServicesPersistenceImpl extends BasePersistenceImpl<Services>
	implements ServicesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ServicesUtil} to access the services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ServicesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesModelImpl.FINDER_CACHE_ENABLED, ServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesModelImpl.FINDER_CACHE_ENABLED, ServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesModelImpl.FINDER_CACHE_ENABLED, ServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBystatus",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesModelImpl.FINDER_CACHE_ENABLED, ServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBystatus",
			new String[] { Integer.class.getName() },
			ServicesModelImpl.STATUS_COLUMN_BITMASK |
			ServicesModelImpl.CITIZENID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the serviceses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching serviceses
	 */
	@Override
	public List<Services> findBystatus(int status) {
		return findBystatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the serviceses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of serviceses
	 * @param end the upper bound of the range of serviceses (not inclusive)
	 * @return the range of matching serviceses
	 */
	@Override
	public List<Services> findBystatus(int status, int start, int end) {
		return findBystatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the serviceses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of serviceses
	 * @param end the upper bound of the range of serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching serviceses
	 */
	@Override
	public List<Services> findBystatus(int status, int start, int end,
		OrderByComparator<Services> orderByComparator) {
		return findBystatus(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the serviceses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of serviceses
	 * @param end the upper bound of the range of serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching serviceses
	 */
	@Override
	public List<Services> findBystatus(int status, int start, int end,
		OrderByComparator<Services> orderByComparator, boolean retrieveFromCache) {
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

		List<Services> list = null;

		if (retrieveFromCache) {
			list = (List<Services>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Services services : list) {
					if ((status != services.getStatus())) {
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

			query.append(_SQL_SELECT_SERVICES_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServicesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (!pagination) {
					list = (List<Services>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Services>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first services in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching services
	 * @throws NoSuchServicesException if a matching services could not be found
	 */
	@Override
	public Services findBystatus_First(int status,
		OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException {
		Services services = fetchBystatus_First(status, orderByComparator);

		if (services != null) {
			return services;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServicesException(msg.toString());
	}

	/**
	 * Returns the first services in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching services, or <code>null</code> if a matching services could not be found
	 */
	@Override
	public Services fetchBystatus_First(int status,
		OrderByComparator<Services> orderByComparator) {
		List<Services> list = findBystatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last services in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching services
	 * @throws NoSuchServicesException if a matching services could not be found
	 */
	@Override
	public Services findBystatus_Last(int status,
		OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException {
		Services services = fetchBystatus_Last(status, orderByComparator);

		if (services != null) {
			return services;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServicesException(msg.toString());
	}

	/**
	 * Returns the last services in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching services, or <code>null</code> if a matching services could not be found
	 */
	@Override
	public Services fetchBystatus_Last(int status,
		OrderByComparator<Services> orderByComparator) {
		int count = countBystatus(status);

		if (count == 0) {
			return null;
		}

		List<Services> list = findBystatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the serviceses before and after the current services in the ordered set where status = &#63;.
	 *
	 * @param id the primary key of the current services
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next services
	 * @throws NoSuchServicesException if a services with the primary key could not be found
	 */
	@Override
	public Services[] findBystatus_PrevAndNext(long id, int status,
		OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException {
		Services services = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Services[] array = new ServicesImpl[3];

			array[0] = getBystatus_PrevAndNext(session, services, status,
					orderByComparator, true);

			array[1] = services;

			array[2] = getBystatus_PrevAndNext(session, services, status,
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

	protected Services getBystatus_PrevAndNext(Session session,
		Services services, int status,
		OrderByComparator<Services> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICES_WHERE);

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
			query.append(ServicesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(services);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Services> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the serviceses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBystatus(int status) {
		for (Services services : findBystatus(status, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(services);
		}
	}

	/**
	 * Returns the number of serviceses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching serviceses
	 */
	@Override
	public int countBystatus(int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SERVICES_WHERE);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "services.status = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICE = new FinderPath(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesModelImpl.FINDER_CACHE_ENABLED, ServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByservice",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICE =
		new FinderPath(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesModelImpl.FINDER_CACHE_ENABLED, ServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByservice",
			new String[] { String.class.getName() },
			ServicesModelImpl.SERVICE_COLUMN_BITMASK |
			ServicesModelImpl.CITIZENID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SERVICE = new FinderPath(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByservice",
			new String[] { String.class.getName() });

	/**
	 * Returns all the serviceses where service = &#63;.
	 *
	 * @param service the service
	 * @return the matching serviceses
	 */
	@Override
	public List<Services> findByservice(String service) {
		return findByservice(service, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the serviceses where service = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param service the service
	 * @param start the lower bound of the range of serviceses
	 * @param end the upper bound of the range of serviceses (not inclusive)
	 * @return the range of matching serviceses
	 */
	@Override
	public List<Services> findByservice(String service, int start, int end) {
		return findByservice(service, start, end, null);
	}

	/**
	 * Returns an ordered range of all the serviceses where service = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param service the service
	 * @param start the lower bound of the range of serviceses
	 * @param end the upper bound of the range of serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching serviceses
	 */
	@Override
	public List<Services> findByservice(String service, int start, int end,
		OrderByComparator<Services> orderByComparator) {
		return findByservice(service, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the serviceses where service = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param service the service
	 * @param start the lower bound of the range of serviceses
	 * @param end the upper bound of the range of serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching serviceses
	 */
	@Override
	public List<Services> findByservice(String service, int start, int end,
		OrderByComparator<Services> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICE;
			finderArgs = new Object[] { service };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICE;
			finderArgs = new Object[] { service, start, end, orderByComparator };
		}

		List<Services> list = null;

		if (retrieveFromCache) {
			list = (List<Services>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Services services : list) {
					if (!Objects.equals(service, services.getService())) {
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

			query.append(_SQL_SELECT_SERVICES_WHERE);

			boolean bindService = false;

			if (service == null) {
				query.append(_FINDER_COLUMN_SERVICE_SERVICE_1);
			}
			else if (service.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICE_SERVICE_3);
			}
			else {
				bindService = true;

				query.append(_FINDER_COLUMN_SERVICE_SERVICE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ServicesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindService) {
					qPos.add(service);
				}

				if (!pagination) {
					list = (List<Services>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Services>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first services in the ordered set where service = &#63;.
	 *
	 * @param service the service
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching services
	 * @throws NoSuchServicesException if a matching services could not be found
	 */
	@Override
	public Services findByservice_First(String service,
		OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException {
		Services services = fetchByservice_First(service, orderByComparator);

		if (services != null) {
			return services;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("service=");
		msg.append(service);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServicesException(msg.toString());
	}

	/**
	 * Returns the first services in the ordered set where service = &#63;.
	 *
	 * @param service the service
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching services, or <code>null</code> if a matching services could not be found
	 */
	@Override
	public Services fetchByservice_First(String service,
		OrderByComparator<Services> orderByComparator) {
		List<Services> list = findByservice(service, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last services in the ordered set where service = &#63;.
	 *
	 * @param service the service
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching services
	 * @throws NoSuchServicesException if a matching services could not be found
	 */
	@Override
	public Services findByservice_Last(String service,
		OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException {
		Services services = fetchByservice_Last(service, orderByComparator);

		if (services != null) {
			return services;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("service=");
		msg.append(service);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchServicesException(msg.toString());
	}

	/**
	 * Returns the last services in the ordered set where service = &#63;.
	 *
	 * @param service the service
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching services, or <code>null</code> if a matching services could not be found
	 */
	@Override
	public Services fetchByservice_Last(String service,
		OrderByComparator<Services> orderByComparator) {
		int count = countByservice(service);

		if (count == 0) {
			return null;
		}

		List<Services> list = findByservice(service, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the serviceses before and after the current services in the ordered set where service = &#63;.
	 *
	 * @param id the primary key of the current services
	 * @param service the service
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next services
	 * @throws NoSuchServicesException if a services with the primary key could not be found
	 */
	@Override
	public Services[] findByservice_PrevAndNext(long id, String service,
		OrderByComparator<Services> orderByComparator)
		throws NoSuchServicesException {
		Services services = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Services[] array = new ServicesImpl[3];

			array[0] = getByservice_PrevAndNext(session, services, service,
					orderByComparator, true);

			array[1] = services;

			array[2] = getByservice_PrevAndNext(session, services, service,
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

	protected Services getByservice_PrevAndNext(Session session,
		Services services, String service,
		OrderByComparator<Services> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_SERVICES_WHERE);

		boolean bindService = false;

		if (service == null) {
			query.append(_FINDER_COLUMN_SERVICE_SERVICE_1);
		}
		else if (service.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SERVICE_SERVICE_3);
		}
		else {
			bindService = true;

			query.append(_FINDER_COLUMN_SERVICE_SERVICE_2);
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
			query.append(ServicesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindService) {
			qPos.add(service);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(services);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Services> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the serviceses where service = &#63; from the database.
	 *
	 * @param service the service
	 */
	@Override
	public void removeByservice(String service) {
		for (Services services : findByservice(service, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(services);
		}
	}

	/**
	 * Returns the number of serviceses where service = &#63;.
	 *
	 * @param service the service
	 * @return the number of matching serviceses
	 */
	@Override
	public int countByservice(String service) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICE;

		Object[] finderArgs = new Object[] { service };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_SERVICES_WHERE);

			boolean bindService = false;

			if (service == null) {
				query.append(_FINDER_COLUMN_SERVICE_SERVICE_1);
			}
			else if (service.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SERVICE_SERVICE_3);
			}
			else {
				bindService = true;

				query.append(_FINDER_COLUMN_SERVICE_SERVICE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindService) {
					qPos.add(service);
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

	private static final String _FINDER_COLUMN_SERVICE_SERVICE_1 = "services.service IS NULL";
	private static final String _FINDER_COLUMN_SERVICE_SERVICE_2 = "services.service = ?";
	private static final String _FINDER_COLUMN_SERVICE_SERVICE_3 = "(services.service IS NULL OR services.service = '')";

	public ServicesPersistenceImpl() {
		setModelClass(Services.class);

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
	 * Caches the services in the entity cache if it is enabled.
	 *
	 * @param services the services
	 */
	@Override
	public void cacheResult(Services services) {
		entityCache.putResult(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesImpl.class, services.getPrimaryKey(), services);

		services.resetOriginalValues();
	}

	/**
	 * Caches the serviceses in the entity cache if it is enabled.
	 *
	 * @param serviceses the serviceses
	 */
	@Override
	public void cacheResult(List<Services> serviceses) {
		for (Services services : serviceses) {
			if (entityCache.getResult(ServicesModelImpl.ENTITY_CACHE_ENABLED,
						ServicesImpl.class, services.getPrimaryKey()) == null) {
				cacheResult(services);
			}
			else {
				services.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all serviceses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ServicesImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the services.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Services services) {
		entityCache.removeResult(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesImpl.class, services.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Services> serviceses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Services services : serviceses) {
			entityCache.removeResult(ServicesModelImpl.ENTITY_CACHE_ENABLED,
				ServicesImpl.class, services.getPrimaryKey());
		}
	}

	/**
	 * Creates a new services with the primary key. Does not add the services to the database.
	 *
	 * @param id the primary key for the new services
	 * @return the new services
	 */
	@Override
	public Services create(long id) {
		Services services = new ServicesImpl();

		services.setNew(true);
		services.setPrimaryKey(id);

		services.setCompanyId(companyProvider.getCompanyId());

		return services;
	}

	/**
	 * Removes the services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the services
	 * @return the services that was removed
	 * @throws NoSuchServicesException if a services with the primary key could not be found
	 */
	@Override
	public Services remove(long id) throws NoSuchServicesException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the services
	 * @return the services that was removed
	 * @throws NoSuchServicesException if a services with the primary key could not be found
	 */
	@Override
	public Services remove(Serializable primaryKey)
		throws NoSuchServicesException {
		Session session = null;

		try {
			session = openSession();

			Services services = (Services)session.get(ServicesImpl.class,
					primaryKey);

			if (services == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchServicesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(services);
		}
		catch (NoSuchServicesException nsee) {
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
	protected Services removeImpl(Services services) {
		services = toUnwrappedModel(services);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(services)) {
				services = (Services)session.get(ServicesImpl.class,
						services.getPrimaryKeyObj());
			}

			if (services != null) {
				session.delete(services);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (services != null) {
			clearCache(services);
		}

		return services;
	}

	@Override
	public Services updateImpl(Services services) {
		services = toUnwrappedModel(services);

		boolean isNew = services.isNew();

		ServicesModelImpl servicesModelImpl = (ServicesModelImpl)services;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (services.getCreateDate() == null)) {
			if (serviceContext == null) {
				services.setCreateDate(now);
			}
			else {
				services.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!servicesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				services.setModifiedDate(now);
			}
			else {
				services.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (services.isNew()) {
				session.save(services);

				services.setNew(false);
			}
			else {
				services = (Services)session.merge(services);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ServicesModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { servicesModelImpl.getStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			args = new Object[] { servicesModelImpl.getService() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((servicesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						servicesModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { servicesModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}

			if ((servicesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						servicesModelImpl.getOriginalService()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICE,
					args);

				args = new Object[] { servicesModelImpl.getService() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SERVICE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICE,
					args);
			}
		}

		entityCache.putResult(ServicesModelImpl.ENTITY_CACHE_ENABLED,
			ServicesImpl.class, services.getPrimaryKey(), services, false);

		services.resetOriginalValues();

		return services;
	}

	protected Services toUnwrappedModel(Services services) {
		if (services instanceof ServicesImpl) {
			return services;
		}

		ServicesImpl servicesImpl = new ServicesImpl();

		servicesImpl.setNew(services.isNew());
		servicesImpl.setPrimaryKey(services.getPrimaryKey());

		servicesImpl.setId(services.getId());
		servicesImpl.setGroupId(services.getGroupId());
		servicesImpl.setCompanyId(services.getCompanyId());
		servicesImpl.setUserId(services.getUserId());
		servicesImpl.setUserName(services.getUserName());
		servicesImpl.setCreateDate(services.getCreateDate());
		servicesImpl.setModifiedDate(services.getModifiedDate());
		servicesImpl.setCitizenId(services.getCitizenId());
		servicesImpl.setService(services.getService());
		servicesImpl.setStatus(services.getStatus());

		return servicesImpl;
	}

	/**
	 * Returns the services with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the services
	 * @return the services
	 * @throws NoSuchServicesException if a services with the primary key could not be found
	 */
	@Override
	public Services findByPrimaryKey(Serializable primaryKey)
		throws NoSuchServicesException {
		Services services = fetchByPrimaryKey(primaryKey);

		if (services == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchServicesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return services;
	}

	/**
	 * Returns the services with the primary key or throws a {@link NoSuchServicesException} if it could not be found.
	 *
	 * @param id the primary key of the services
	 * @return the services
	 * @throws NoSuchServicesException if a services with the primary key could not be found
	 */
	@Override
	public Services findByPrimaryKey(long id) throws NoSuchServicesException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the services
	 * @return the services, or <code>null</code> if a services with the primary key could not be found
	 */
	@Override
	public Services fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ServicesModelImpl.ENTITY_CACHE_ENABLED,
				ServicesImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Services services = (Services)serializable;

		if (services == null) {
			Session session = null;

			try {
				session = openSession();

				services = (Services)session.get(ServicesImpl.class, primaryKey);

				if (services != null) {
					cacheResult(services);
				}
				else {
					entityCache.putResult(ServicesModelImpl.ENTITY_CACHE_ENABLED,
						ServicesImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ServicesModelImpl.ENTITY_CACHE_ENABLED,
					ServicesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return services;
	}

	/**
	 * Returns the services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the services
	 * @return the services, or <code>null</code> if a services with the primary key could not be found
	 */
	@Override
	public Services fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, Services> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Services> map = new HashMap<Serializable, Services>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Services services = fetchByPrimaryKey(primaryKey);

			if (services != null) {
				map.put(primaryKey, services);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ServicesModelImpl.ENTITY_CACHE_ENABLED,
					ServicesImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Services)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SERVICES_WHERE_PKS_IN);

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

			for (Services services : (List<Services>)q.list()) {
				map.put(services.getPrimaryKeyObj(), services);

				cacheResult(services);

				uncachedPrimaryKeys.remove(services.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ServicesModelImpl.ENTITY_CACHE_ENABLED,
					ServicesImpl.class, primaryKey, nullModel);
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
	 * Returns all the serviceses.
	 *
	 * @return the serviceses
	 */
	@Override
	public List<Services> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of serviceses
	 * @param end the upper bound of the range of serviceses (not inclusive)
	 * @return the range of serviceses
	 */
	@Override
	public List<Services> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of serviceses
	 * @param end the upper bound of the range of serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of serviceses
	 */
	@Override
	public List<Services> findAll(int start, int end,
		OrderByComparator<Services> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the serviceses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of serviceses
	 * @param end the upper bound of the range of serviceses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of serviceses
	 */
	@Override
	public List<Services> findAll(int start, int end,
		OrderByComparator<Services> orderByComparator, boolean retrieveFromCache) {
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

		List<Services> list = null;

		if (retrieveFromCache) {
			list = (List<Services>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SERVICES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SERVICES;

				if (pagination) {
					sql = sql.concat(ServicesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Services>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Services>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the serviceses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Services services : findAll()) {
			remove(services);
		}
	}

	/**
	 * Returns the number of serviceses.
	 *
	 * @return the number of serviceses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SERVICES);

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
		return ServicesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the services persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ServicesImpl.class.getName());
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
	private static final String _SQL_SELECT_SERVICES = "SELECT services FROM Services services";
	private static final String _SQL_SELECT_SERVICES_WHERE_PKS_IN = "SELECT services FROM Services services WHERE id_ IN (";
	private static final String _SQL_SELECT_SERVICES_WHERE = "SELECT services FROM Services services WHERE ";
	private static final String _SQL_COUNT_SERVICES = "SELECT COUNT(services) FROM Services services";
	private static final String _SQL_COUNT_SERVICES_WHERE = "SELECT COUNT(services) FROM Services services WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "services.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Services exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Services exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ServicesPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}