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

import IdentificationDatabase.exception.NoSuchCitizenRemarkException;

import IdentificationDatabase.model.CitizenRemark;

import IdentificationDatabase.model.impl.CitizenRemarkImpl;
import IdentificationDatabase.model.impl.CitizenRemarkModelImpl;

import IdentificationDatabase.service.persistence.CitizenRemarkPersistence;

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
 * The persistence implementation for the citizen remark service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitizenRemarkPersistence
 * @see IdentificationDatabase.service.persistence.CitizenRemarkUtil
 * @generated
 */
@ProviderType
public class CitizenRemarkPersistenceImpl extends BasePersistenceImpl<CitizenRemark>
	implements CitizenRemarkPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CitizenRemarkUtil} to access the citizen remark persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CitizenRemarkImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkModelImpl.FINDER_CACHE_ENABLED,
			CitizenRemarkImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkModelImpl.FINDER_CACHE_ENABLED,
			CitizenRemarkImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CITIZENID =
		new FinderPath(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkModelImpl.FINDER_CACHE_ENABLED,
			CitizenRemarkImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycitizenId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID =
		new FinderPath(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkModelImpl.FINDER_CACHE_ENABLED,
			CitizenRemarkImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBycitizenId", new String[] { Long.class.getName() },
			CitizenRemarkModelImpl.CITIZENID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CITIZENID = new FinderPath(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycitizenId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the citizen remarks where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @return the matching citizen remarks
	 */
	@Override
	public List<CitizenRemark> findBycitizenId(long citizenId) {
		return findBycitizenId(citizenId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the citizen remarks where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of citizen remarks
	 * @param end the upper bound of the range of citizen remarks (not inclusive)
	 * @return the range of matching citizen remarks
	 */
	@Override
	public List<CitizenRemark> findBycitizenId(long citizenId, int start,
		int end) {
		return findBycitizenId(citizenId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen remarks where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of citizen remarks
	 * @param end the upper bound of the range of citizen remarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizen remarks
	 */
	@Override
	public List<CitizenRemark> findBycitizenId(long citizenId, int start,
		int end, OrderByComparator<CitizenRemark> orderByComparator) {
		return findBycitizenId(citizenId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen remarks where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of citizen remarks
	 * @param end the upper bound of the range of citizen remarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching citizen remarks
	 */
	@Override
	public List<CitizenRemark> findBycitizenId(long citizenId, int start,
		int end, OrderByComparator<CitizenRemark> orderByComparator,
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

		List<CitizenRemark> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenRemark>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CitizenRemark citizenRemark : list) {
					if ((citizenId != citizenRemark.getCitizenId())) {
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

			query.append(_SQL_SELECT_CITIZENREMARK_WHERE);

			query.append(_FINDER_COLUMN_CITIZENID_CITIZENID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenRemarkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(citizenId);

				if (!pagination) {
					list = (List<CitizenRemark>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenRemark>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first citizen remark in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen remark
	 * @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	 */
	@Override
	public CitizenRemark findBycitizenId_First(long citizenId,
		OrderByComparator<CitizenRemark> orderByComparator)
		throws NoSuchCitizenRemarkException {
		CitizenRemark citizenRemark = fetchBycitizenId_First(citizenId,
				orderByComparator);

		if (citizenRemark != null) {
			return citizenRemark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenRemarkException(msg.toString());
	}

	/**
	 * Returns the first citizen remark in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	 */
	@Override
	public CitizenRemark fetchBycitizenId_First(long citizenId,
		OrderByComparator<CitizenRemark> orderByComparator) {
		List<CitizenRemark> list = findBycitizenId(citizenId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen remark in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen remark
	 * @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	 */
	@Override
	public CitizenRemark findBycitizenId_Last(long citizenId,
		OrderByComparator<CitizenRemark> orderByComparator)
		throws NoSuchCitizenRemarkException {
		CitizenRemark citizenRemark = fetchBycitizenId_Last(citizenId,
				orderByComparator);

		if (citizenRemark != null) {
			return citizenRemark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenRemarkException(msg.toString());
	}

	/**
	 * Returns the last citizen remark in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	 */
	@Override
	public CitizenRemark fetchBycitizenId_Last(long citizenId,
		OrderByComparator<CitizenRemark> orderByComparator) {
		int count = countBycitizenId(citizenId);

		if (count == 0) {
			return null;
		}

		List<CitizenRemark> list = findBycitizenId(citizenId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the citizen remarks before and after the current citizen remark in the ordered set where citizenId = &#63;.
	 *
	 * @param id the primary key of the current citizen remark
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next citizen remark
	 * @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	 */
	@Override
	public CitizenRemark[] findBycitizenId_PrevAndNext(long id, long citizenId,
		OrderByComparator<CitizenRemark> orderByComparator)
		throws NoSuchCitizenRemarkException {
		CitizenRemark citizenRemark = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			CitizenRemark[] array = new CitizenRemarkImpl[3];

			array[0] = getBycitizenId_PrevAndNext(session, citizenRemark,
					citizenId, orderByComparator, true);

			array[1] = citizenRemark;

			array[2] = getBycitizenId_PrevAndNext(session, citizenRemark,
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

	protected CitizenRemark getBycitizenId_PrevAndNext(Session session,
		CitizenRemark citizenRemark, long citizenId,
		OrderByComparator<CitizenRemark> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CITIZENREMARK_WHERE);

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
			query.append(CitizenRemarkModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(citizenId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(citizenRemark);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CitizenRemark> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the citizen remarks where citizenId = &#63; from the database.
	 *
	 * @param citizenId the citizen ID
	 */
	@Override
	public void removeBycitizenId(long citizenId) {
		for (CitizenRemark citizenRemark : findBycitizenId(citizenId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(citizenRemark);
		}
	}

	/**
	 * Returns the number of citizen remarks where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @return the number of matching citizen remarks
	 */
	@Override
	public int countBycitizenId(long citizenId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CITIZENID;

		Object[] finderArgs = new Object[] { citizenId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZENREMARK_WHERE);

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

	private static final String _FINDER_COLUMN_CITIZENID_CITIZENID_2 = "citizenRemark.citizenId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkModelImpl.FINDER_CACHE_ENABLED,
			CitizenRemarkImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkModelImpl.FINDER_CACHE_ENABLED,
			CitizenRemarkImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByid", new String[] { Long.class.getName() },
			CitizenRemarkModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the citizen remarks where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching citizen remarks
	 */
	@Override
	public List<CitizenRemark> findByid(long id) {
		return findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizen remarks where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of citizen remarks
	 * @param end the upper bound of the range of citizen remarks (not inclusive)
	 * @return the range of matching citizen remarks
	 */
	@Override
	public List<CitizenRemark> findByid(long id, int start, int end) {
		return findByid(id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen remarks where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of citizen remarks
	 * @param end the upper bound of the range of citizen remarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching citizen remarks
	 */
	@Override
	public List<CitizenRemark> findByid(long id, int start, int end,
		OrderByComparator<CitizenRemark> orderByComparator) {
		return findByid(id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen remarks where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of citizen remarks
	 * @param end the upper bound of the range of citizen remarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching citizen remarks
	 */
	@Override
	public List<CitizenRemark> findByid(long id, int start, int end,
		OrderByComparator<CitizenRemark> orderByComparator,
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

		List<CitizenRemark> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenRemark>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CitizenRemark citizenRemark : list) {
					if ((id != citizenRemark.getId())) {
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

			query.append(_SQL_SELECT_CITIZENREMARK_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CitizenRemarkModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<CitizenRemark>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenRemark>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first citizen remark in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen remark
	 * @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	 */
	@Override
	public CitizenRemark findByid_First(long id,
		OrderByComparator<CitizenRemark> orderByComparator)
		throws NoSuchCitizenRemarkException {
		CitizenRemark citizenRemark = fetchByid_First(id, orderByComparator);

		if (citizenRemark != null) {
			return citizenRemark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenRemarkException(msg.toString());
	}

	/**
	 * Returns the first citizen remark in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	 */
	@Override
	public CitizenRemark fetchByid_First(long id,
		OrderByComparator<CitizenRemark> orderByComparator) {
		List<CitizenRemark> list = findByid(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last citizen remark in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen remark
	 * @throws NoSuchCitizenRemarkException if a matching citizen remark could not be found
	 */
	@Override
	public CitizenRemark findByid_Last(long id,
		OrderByComparator<CitizenRemark> orderByComparator)
		throws NoSuchCitizenRemarkException {
		CitizenRemark citizenRemark = fetchByid_Last(id, orderByComparator);

		if (citizenRemark != null) {
			return citizenRemark;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCitizenRemarkException(msg.toString());
	}

	/**
	 * Returns the last citizen remark in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching citizen remark, or <code>null</code> if a matching citizen remark could not be found
	 */
	@Override
	public CitizenRemark fetchByid_Last(long id,
		OrderByComparator<CitizenRemark> orderByComparator) {
		int count = countByid(id);

		if (count == 0) {
			return null;
		}

		List<CitizenRemark> list = findByid(id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the citizen remarks where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByid(long id) {
		for (CitizenRemark citizenRemark : findByid(id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(citizenRemark);
		}
	}

	/**
	 * Returns the number of citizen remarks where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching citizen remarks
	 */
	@Override
	public int countByid(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CITIZENREMARK_WHERE);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "citizenRemark.id = ?";

	public CitizenRemarkPersistenceImpl() {
		setModelClass(CitizenRemark.class);

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
	 * Caches the citizen remark in the entity cache if it is enabled.
	 *
	 * @param citizenRemark the citizen remark
	 */
	@Override
	public void cacheResult(CitizenRemark citizenRemark) {
		entityCache.putResult(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkImpl.class, citizenRemark.getPrimaryKey(),
			citizenRemark);

		citizenRemark.resetOriginalValues();
	}

	/**
	 * Caches the citizen remarks in the entity cache if it is enabled.
	 *
	 * @param citizenRemarks the citizen remarks
	 */
	@Override
	public void cacheResult(List<CitizenRemark> citizenRemarks) {
		for (CitizenRemark citizenRemark : citizenRemarks) {
			if (entityCache.getResult(
						CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
						CitizenRemarkImpl.class, citizenRemark.getPrimaryKey()) == null) {
				cacheResult(citizenRemark);
			}
			else {
				citizenRemark.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all citizen remarks.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CitizenRemarkImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the citizen remark.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CitizenRemark citizenRemark) {
		entityCache.removeResult(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkImpl.class, citizenRemark.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CitizenRemark> citizenRemarks) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CitizenRemark citizenRemark : citizenRemarks) {
			entityCache.removeResult(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
				CitizenRemarkImpl.class, citizenRemark.getPrimaryKey());
		}
	}

	/**
	 * Creates a new citizen remark with the primary key. Does not add the citizen remark to the database.
	 *
	 * @param id the primary key for the new citizen remark
	 * @return the new citizen remark
	 */
	@Override
	public CitizenRemark create(long id) {
		CitizenRemark citizenRemark = new CitizenRemarkImpl();

		citizenRemark.setNew(true);
		citizenRemark.setPrimaryKey(id);

		citizenRemark.setCompanyId(companyProvider.getCompanyId());

		return citizenRemark;
	}

	/**
	 * Removes the citizen remark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the citizen remark
	 * @return the citizen remark that was removed
	 * @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	 */
	@Override
	public CitizenRemark remove(long id) throws NoSuchCitizenRemarkException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the citizen remark with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the citizen remark
	 * @return the citizen remark that was removed
	 * @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	 */
	@Override
	public CitizenRemark remove(Serializable primaryKey)
		throws NoSuchCitizenRemarkException {
		Session session = null;

		try {
			session = openSession();

			CitizenRemark citizenRemark = (CitizenRemark)session.get(CitizenRemarkImpl.class,
					primaryKey);

			if (citizenRemark == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCitizenRemarkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(citizenRemark);
		}
		catch (NoSuchCitizenRemarkException nsee) {
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
	protected CitizenRemark removeImpl(CitizenRemark citizenRemark) {
		citizenRemark = toUnwrappedModel(citizenRemark);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(citizenRemark)) {
				citizenRemark = (CitizenRemark)session.get(CitizenRemarkImpl.class,
						citizenRemark.getPrimaryKeyObj());
			}

			if (citizenRemark != null) {
				session.delete(citizenRemark);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (citizenRemark != null) {
			clearCache(citizenRemark);
		}

		return citizenRemark;
	}

	@Override
	public CitizenRemark updateImpl(CitizenRemark citizenRemark) {
		citizenRemark = toUnwrappedModel(citizenRemark);

		boolean isNew = citizenRemark.isNew();

		CitizenRemarkModelImpl citizenRemarkModelImpl = (CitizenRemarkModelImpl)citizenRemark;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (citizenRemark.getCreateDate() == null)) {
			if (serviceContext == null) {
				citizenRemark.setCreateDate(now);
			}
			else {
				citizenRemark.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!citizenRemarkModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				citizenRemark.setModifiedDate(now);
			}
			else {
				citizenRemark.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (citizenRemark.isNew()) {
				session.save(citizenRemark);

				citizenRemark.setNew(false);
			}
			else {
				citizenRemark = (CitizenRemark)session.merge(citizenRemark);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CitizenRemarkModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { citizenRemarkModelImpl.getCitizenId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
				args);

			args = new Object[] { citizenRemarkModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((citizenRemarkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenRemarkModelImpl.getOriginalCitizenId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
					args);

				args = new Object[] { citizenRemarkModelImpl.getCitizenId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
					args);
			}

			if ((citizenRemarkModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						citizenRemarkModelImpl.getOriginalId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { citizenRemarkModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}
		}

		entityCache.putResult(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
			CitizenRemarkImpl.class, citizenRemark.getPrimaryKey(),
			citizenRemark, false);

		citizenRemark.resetOriginalValues();

		return citizenRemark;
	}

	protected CitizenRemark toUnwrappedModel(CitizenRemark citizenRemark) {
		if (citizenRemark instanceof CitizenRemarkImpl) {
			return citizenRemark;
		}

		CitizenRemarkImpl citizenRemarkImpl = new CitizenRemarkImpl();

		citizenRemarkImpl.setNew(citizenRemark.isNew());
		citizenRemarkImpl.setPrimaryKey(citizenRemark.getPrimaryKey());

		citizenRemarkImpl.setId(citizenRemark.getId());
		citizenRemarkImpl.setCompanyId(citizenRemark.getCompanyId());
		citizenRemarkImpl.setUserId(citizenRemark.getUserId());
		citizenRemarkImpl.setUserName(citizenRemark.getUserName());
		citizenRemarkImpl.setCreateDate(citizenRemark.getCreateDate());
		citizenRemarkImpl.setModifiedDate(citizenRemark.getModifiedDate());
		citizenRemarkImpl.setCitizenId(citizenRemark.getCitizenId());
		citizenRemarkImpl.setRemark(citizenRemark.getRemark());

		return citizenRemarkImpl;
	}

	/**
	 * Returns the citizen remark with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the citizen remark
	 * @return the citizen remark
	 * @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	 */
	@Override
	public CitizenRemark findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCitizenRemarkException {
		CitizenRemark citizenRemark = fetchByPrimaryKey(primaryKey);

		if (citizenRemark == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCitizenRemarkException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return citizenRemark;
	}

	/**
	 * Returns the citizen remark with the primary key or throws a {@link NoSuchCitizenRemarkException} if it could not be found.
	 *
	 * @param id the primary key of the citizen remark
	 * @return the citizen remark
	 * @throws NoSuchCitizenRemarkException if a citizen remark with the primary key could not be found
	 */
	@Override
	public CitizenRemark findByPrimaryKey(long id)
		throws NoSuchCitizenRemarkException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the citizen remark with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the citizen remark
	 * @return the citizen remark, or <code>null</code> if a citizen remark with the primary key could not be found
	 */
	@Override
	public CitizenRemark fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
				CitizenRemarkImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CitizenRemark citizenRemark = (CitizenRemark)serializable;

		if (citizenRemark == null) {
			Session session = null;

			try {
				session = openSession();

				citizenRemark = (CitizenRemark)session.get(CitizenRemarkImpl.class,
						primaryKey);

				if (citizenRemark != null) {
					cacheResult(citizenRemark);
				}
				else {
					entityCache.putResult(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
						CitizenRemarkImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
					CitizenRemarkImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return citizenRemark;
	}

	/**
	 * Returns the citizen remark with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the citizen remark
	 * @return the citizen remark, or <code>null</code> if a citizen remark with the primary key could not be found
	 */
	@Override
	public CitizenRemark fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, CitizenRemark> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CitizenRemark> map = new HashMap<Serializable, CitizenRemark>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CitizenRemark citizenRemark = fetchByPrimaryKey(primaryKey);

			if (citizenRemark != null) {
				map.put(primaryKey, citizenRemark);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
					CitizenRemarkImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CitizenRemark)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CITIZENREMARK_WHERE_PKS_IN);

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

			for (CitizenRemark citizenRemark : (List<CitizenRemark>)q.list()) {
				map.put(citizenRemark.getPrimaryKeyObj(), citizenRemark);

				cacheResult(citizenRemark);

				uncachedPrimaryKeys.remove(citizenRemark.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CitizenRemarkModelImpl.ENTITY_CACHE_ENABLED,
					CitizenRemarkImpl.class, primaryKey, nullModel);
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
	 * Returns all the citizen remarks.
	 *
	 * @return the citizen remarks
	 */
	@Override
	public List<CitizenRemark> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the citizen remarks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of citizen remarks
	 * @param end the upper bound of the range of citizen remarks (not inclusive)
	 * @return the range of citizen remarks
	 */
	@Override
	public List<CitizenRemark> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the citizen remarks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of citizen remarks
	 * @param end the upper bound of the range of citizen remarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of citizen remarks
	 */
	@Override
	public List<CitizenRemark> findAll(int start, int end,
		OrderByComparator<CitizenRemark> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the citizen remarks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CitizenRemarkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of citizen remarks
	 * @param end the upper bound of the range of citizen remarks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of citizen remarks
	 */
	@Override
	public List<CitizenRemark> findAll(int start, int end,
		OrderByComparator<CitizenRemark> orderByComparator,
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

		List<CitizenRemark> list = null;

		if (retrieveFromCache) {
			list = (List<CitizenRemark>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CITIZENREMARK);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CITIZENREMARK;

				if (pagination) {
					sql = sql.concat(CitizenRemarkModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CitizenRemark>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CitizenRemark>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the citizen remarks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CitizenRemark citizenRemark : findAll()) {
			remove(citizenRemark);
		}
	}

	/**
	 * Returns the number of citizen remarks.
	 *
	 * @return the number of citizen remarks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CITIZENREMARK);

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
		return CitizenRemarkModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the citizen remark persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CitizenRemarkImpl.class.getName());
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
	private static final String _SQL_SELECT_CITIZENREMARK = "SELECT citizenRemark FROM CitizenRemark citizenRemark";
	private static final String _SQL_SELECT_CITIZENREMARK_WHERE_PKS_IN = "SELECT citizenRemark FROM CitizenRemark citizenRemark WHERE id_ IN (";
	private static final String _SQL_SELECT_CITIZENREMARK_WHERE = "SELECT citizenRemark FROM CitizenRemark citizenRemark WHERE ";
	private static final String _SQL_COUNT_CITIZENREMARK = "SELECT COUNT(citizenRemark) FROM CitizenRemark citizenRemark";
	private static final String _SQL_COUNT_CITIZENREMARK_WHERE = "SELECT COUNT(citizenRemark) FROM CitizenRemark citizenRemark WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "citizenRemark.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CitizenRemark exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CitizenRemark exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CitizenRemarkPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}