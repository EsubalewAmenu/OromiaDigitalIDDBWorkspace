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

import IdentificationDatabase.exception.NoSuchPrintedHistoryException;

import IdentificationDatabase.model.PrintedHistory;

import IdentificationDatabase.model.impl.PrintedHistoryImpl;
import IdentificationDatabase.model.impl.PrintedHistoryModelImpl;

import IdentificationDatabase.service.persistence.PrintedHistoryPersistence;

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
 * The persistence implementation for the printed history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PrintedHistoryPersistence
 * @see IdentificationDatabase.service.persistence.PrintedHistoryUtil
 * @generated
 */
@ProviderType
public class PrintedHistoryPersistenceImpl extends BasePersistenceImpl<PrintedHistory>
	implements PrintedHistoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PrintedHistoryUtil} to access the printed history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PrintedHistoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryModelImpl.FINDER_CACHE_ENABLED,
			PrintedHistoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryModelImpl.FINDER_CACHE_ENABLED,
			PrintedHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CITIZENID =
		new FinderPath(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryModelImpl.FINDER_CACHE_ENABLED,
			PrintedHistoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBycitizenId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID =
		new FinderPath(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryModelImpl.FINDER_CACHE_ENABLED,
			PrintedHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBycitizenId",
			new String[] { Long.class.getName() },
			PrintedHistoryModelImpl.CITIZENID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CITIZENID = new FinderPath(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBycitizenId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the printed histories where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @return the matching printed histories
	 */
	@Override
	public List<PrintedHistory> findBycitizenId(long citizenId) {
		return findBycitizenId(citizenId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the printed histories where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of printed histories
	 * @param end the upper bound of the range of printed histories (not inclusive)
	 * @return the range of matching printed histories
	 */
	@Override
	public List<PrintedHistory> findBycitizenId(long citizenId, int start,
		int end) {
		return findBycitizenId(citizenId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the printed histories where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of printed histories
	 * @param end the upper bound of the range of printed histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching printed histories
	 */
	@Override
	public List<PrintedHistory> findBycitizenId(long citizenId, int start,
		int end, OrderByComparator<PrintedHistory> orderByComparator) {
		return findBycitizenId(citizenId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the printed histories where citizenId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param citizenId the citizen ID
	 * @param start the lower bound of the range of printed histories
	 * @param end the upper bound of the range of printed histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching printed histories
	 */
	@Override
	public List<PrintedHistory> findBycitizenId(long citizenId, int start,
		int end, OrderByComparator<PrintedHistory> orderByComparator,
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

		List<PrintedHistory> list = null;

		if (retrieveFromCache) {
			list = (List<PrintedHistory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PrintedHistory printedHistory : list) {
					if ((citizenId != printedHistory.getCitizenId())) {
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

			query.append(_SQL_SELECT_PRINTEDHISTORY_WHERE);

			query.append(_FINDER_COLUMN_CITIZENID_CITIZENID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PrintedHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(citizenId);

				if (!pagination) {
					list = (List<PrintedHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PrintedHistory>)QueryUtil.list(q,
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
	 * Returns the first printed history in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching printed history
	 * @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	 */
	@Override
	public PrintedHistory findBycitizenId_First(long citizenId,
		OrderByComparator<PrintedHistory> orderByComparator)
		throws NoSuchPrintedHistoryException {
		PrintedHistory printedHistory = fetchBycitizenId_First(citizenId,
				orderByComparator);

		if (printedHistory != null) {
			return printedHistory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPrintedHistoryException(msg.toString());
	}

	/**
	 * Returns the first printed history in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching printed history, or <code>null</code> if a matching printed history could not be found
	 */
	@Override
	public PrintedHistory fetchBycitizenId_First(long citizenId,
		OrderByComparator<PrintedHistory> orderByComparator) {
		List<PrintedHistory> list = findBycitizenId(citizenId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last printed history in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching printed history
	 * @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	 */
	@Override
	public PrintedHistory findBycitizenId_Last(long citizenId,
		OrderByComparator<PrintedHistory> orderByComparator)
		throws NoSuchPrintedHistoryException {
		PrintedHistory printedHistory = fetchBycitizenId_Last(citizenId,
				orderByComparator);

		if (printedHistory != null) {
			return printedHistory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("citizenId=");
		msg.append(citizenId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPrintedHistoryException(msg.toString());
	}

	/**
	 * Returns the last printed history in the ordered set where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching printed history, or <code>null</code> if a matching printed history could not be found
	 */
	@Override
	public PrintedHistory fetchBycitizenId_Last(long citizenId,
		OrderByComparator<PrintedHistory> orderByComparator) {
		int count = countBycitizenId(citizenId);

		if (count == 0) {
			return null;
		}

		List<PrintedHistory> list = findBycitizenId(citizenId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the printed histories before and after the current printed history in the ordered set where citizenId = &#63;.
	 *
	 * @param id the primary key of the current printed history
	 * @param citizenId the citizen ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next printed history
	 * @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	 */
	@Override
	public PrintedHistory[] findBycitizenId_PrevAndNext(long id,
		long citizenId, OrderByComparator<PrintedHistory> orderByComparator)
		throws NoSuchPrintedHistoryException {
		PrintedHistory printedHistory = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			PrintedHistory[] array = new PrintedHistoryImpl[3];

			array[0] = getBycitizenId_PrevAndNext(session, printedHistory,
					citizenId, orderByComparator, true);

			array[1] = printedHistory;

			array[2] = getBycitizenId_PrevAndNext(session, printedHistory,
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

	protected PrintedHistory getBycitizenId_PrevAndNext(Session session,
		PrintedHistory printedHistory, long citizenId,
		OrderByComparator<PrintedHistory> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRINTEDHISTORY_WHERE);

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
			query.append(PrintedHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(citizenId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(printedHistory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PrintedHistory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the printed histories where citizenId = &#63; from the database.
	 *
	 * @param citizenId the citizen ID
	 */
	@Override
	public void removeBycitizenId(long citizenId) {
		for (PrintedHistory printedHistory : findBycitizenId(citizenId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(printedHistory);
		}
	}

	/**
	 * Returns the number of printed histories where citizenId = &#63;.
	 *
	 * @param citizenId the citizen ID
	 * @return the number of matching printed histories
	 */
	@Override
	public int countBycitizenId(long citizenId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CITIZENID;

		Object[] finderArgs = new Object[] { citizenId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRINTEDHISTORY_WHERE);

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

	private static final String _FINDER_COLUMN_CITIZENID_CITIZENID_2 = "printedHistory.citizenId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryModelImpl.FINDER_CACHE_ENABLED,
			PrintedHistoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryModelImpl.FINDER_CACHE_ENABLED,
			PrintedHistoryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByid",
			new String[] { Long.class.getName() },
			PrintedHistoryModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the printed histories where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching printed histories
	 */
	@Override
	public List<PrintedHistory> findByid(long id) {
		return findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the printed histories where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of printed histories
	 * @param end the upper bound of the range of printed histories (not inclusive)
	 * @return the range of matching printed histories
	 */
	@Override
	public List<PrintedHistory> findByid(long id, int start, int end) {
		return findByid(id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the printed histories where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of printed histories
	 * @param end the upper bound of the range of printed histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching printed histories
	 */
	@Override
	public List<PrintedHistory> findByid(long id, int start, int end,
		OrderByComparator<PrintedHistory> orderByComparator) {
		return findByid(id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the printed histories where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of printed histories
	 * @param end the upper bound of the range of printed histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching printed histories
	 */
	@Override
	public List<PrintedHistory> findByid(long id, int start, int end,
		OrderByComparator<PrintedHistory> orderByComparator,
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

		List<PrintedHistory> list = null;

		if (retrieveFromCache) {
			list = (List<PrintedHistory>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PrintedHistory printedHistory : list) {
					if ((id != printedHistory.getId())) {
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

			query.append(_SQL_SELECT_PRINTEDHISTORY_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PrintedHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<PrintedHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PrintedHistory>)QueryUtil.list(q,
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
	 * Returns the first printed history in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching printed history
	 * @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	 */
	@Override
	public PrintedHistory findByid_First(long id,
		OrderByComparator<PrintedHistory> orderByComparator)
		throws NoSuchPrintedHistoryException {
		PrintedHistory printedHistory = fetchByid_First(id, orderByComparator);

		if (printedHistory != null) {
			return printedHistory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPrintedHistoryException(msg.toString());
	}

	/**
	 * Returns the first printed history in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching printed history, or <code>null</code> if a matching printed history could not be found
	 */
	@Override
	public PrintedHistory fetchByid_First(long id,
		OrderByComparator<PrintedHistory> orderByComparator) {
		List<PrintedHistory> list = findByid(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last printed history in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching printed history
	 * @throws NoSuchPrintedHistoryException if a matching printed history could not be found
	 */
	@Override
	public PrintedHistory findByid_Last(long id,
		OrderByComparator<PrintedHistory> orderByComparator)
		throws NoSuchPrintedHistoryException {
		PrintedHistory printedHistory = fetchByid_Last(id, orderByComparator);

		if (printedHistory != null) {
			return printedHistory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPrintedHistoryException(msg.toString());
	}

	/**
	 * Returns the last printed history in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching printed history, or <code>null</code> if a matching printed history could not be found
	 */
	@Override
	public PrintedHistory fetchByid_Last(long id,
		OrderByComparator<PrintedHistory> orderByComparator) {
		int count = countByid(id);

		if (count == 0) {
			return null;
		}

		List<PrintedHistory> list = findByid(id, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the printed histories where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByid(long id) {
		for (PrintedHistory printedHistory : findByid(id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(printedHistory);
		}
	}

	/**
	 * Returns the number of printed histories where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching printed histories
	 */
	@Override
	public int countByid(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRINTEDHISTORY_WHERE);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "printedHistory.id = ?";

	public PrintedHistoryPersistenceImpl() {
		setModelClass(PrintedHistory.class);

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
	 * Caches the printed history in the entity cache if it is enabled.
	 *
	 * @param printedHistory the printed history
	 */
	@Override
	public void cacheResult(PrintedHistory printedHistory) {
		entityCache.putResult(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryImpl.class, printedHistory.getPrimaryKey(),
			printedHistory);

		printedHistory.resetOriginalValues();
	}

	/**
	 * Caches the printed histories in the entity cache if it is enabled.
	 *
	 * @param printedHistories the printed histories
	 */
	@Override
	public void cacheResult(List<PrintedHistory> printedHistories) {
		for (PrintedHistory printedHistory : printedHistories) {
			if (entityCache.getResult(
						PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
						PrintedHistoryImpl.class, printedHistory.getPrimaryKey()) == null) {
				cacheResult(printedHistory);
			}
			else {
				printedHistory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all printed histories.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PrintedHistoryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the printed history.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PrintedHistory printedHistory) {
		entityCache.removeResult(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryImpl.class, printedHistory.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PrintedHistory> printedHistories) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PrintedHistory printedHistory : printedHistories) {
			entityCache.removeResult(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
				PrintedHistoryImpl.class, printedHistory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new printed history with the primary key. Does not add the printed history to the database.
	 *
	 * @param id the primary key for the new printed history
	 * @return the new printed history
	 */
	@Override
	public PrintedHistory create(long id) {
		PrintedHistory printedHistory = new PrintedHistoryImpl();

		printedHistory.setNew(true);
		printedHistory.setPrimaryKey(id);

		printedHistory.setCompanyId(companyProvider.getCompanyId());

		return printedHistory;
	}

	/**
	 * Removes the printed history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the printed history
	 * @return the printed history that was removed
	 * @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	 */
	@Override
	public PrintedHistory remove(long id) throws NoSuchPrintedHistoryException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the printed history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the printed history
	 * @return the printed history that was removed
	 * @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	 */
	@Override
	public PrintedHistory remove(Serializable primaryKey)
		throws NoSuchPrintedHistoryException {
		Session session = null;

		try {
			session = openSession();

			PrintedHistory printedHistory = (PrintedHistory)session.get(PrintedHistoryImpl.class,
					primaryKey);

			if (printedHistory == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPrintedHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(printedHistory);
		}
		catch (NoSuchPrintedHistoryException nsee) {
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
	protected PrintedHistory removeImpl(PrintedHistory printedHistory) {
		printedHistory = toUnwrappedModel(printedHistory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(printedHistory)) {
				printedHistory = (PrintedHistory)session.get(PrintedHistoryImpl.class,
						printedHistory.getPrimaryKeyObj());
			}

			if (printedHistory != null) {
				session.delete(printedHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (printedHistory != null) {
			clearCache(printedHistory);
		}

		return printedHistory;
	}

	@Override
	public PrintedHistory updateImpl(PrintedHistory printedHistory) {
		printedHistory = toUnwrappedModel(printedHistory);

		boolean isNew = printedHistory.isNew();

		PrintedHistoryModelImpl printedHistoryModelImpl = (PrintedHistoryModelImpl)printedHistory;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (printedHistory.getCreateDate() == null)) {
			if (serviceContext == null) {
				printedHistory.setCreateDate(now);
			}
			else {
				printedHistory.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!printedHistoryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				printedHistory.setModifiedDate(now);
			}
			else {
				printedHistory.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (printedHistory.isNew()) {
				session.save(printedHistory);

				printedHistory.setNew(false);
			}
			else {
				printedHistory = (PrintedHistory)session.merge(printedHistory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!PrintedHistoryModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { printedHistoryModelImpl.getCitizenId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
				args);

			args = new Object[] { printedHistoryModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((printedHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						printedHistoryModelImpl.getOriginalCitizenId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
					args);

				args = new Object[] { printedHistoryModelImpl.getCitizenId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_CITIZENID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CITIZENID,
					args);
			}

			if ((printedHistoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						printedHistoryModelImpl.getOriginalId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { printedHistoryModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}
		}

		entityCache.putResult(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
			PrintedHistoryImpl.class, printedHistory.getPrimaryKey(),
			printedHistory, false);

		printedHistory.resetOriginalValues();

		return printedHistory;
	}

	protected PrintedHistory toUnwrappedModel(PrintedHistory printedHistory) {
		if (printedHistory instanceof PrintedHistoryImpl) {
			return printedHistory;
		}

		PrintedHistoryImpl printedHistoryImpl = new PrintedHistoryImpl();

		printedHistoryImpl.setNew(printedHistory.isNew());
		printedHistoryImpl.setPrimaryKey(printedHistory.getPrimaryKey());

		printedHistoryImpl.setId(printedHistory.getId());
		printedHistoryImpl.setCompanyId(printedHistory.getCompanyId());
		printedHistoryImpl.setUserId(printedHistory.getUserId());
		printedHistoryImpl.setUserName(printedHistory.getUserName());
		printedHistoryImpl.setCreateDate(printedHistory.getCreateDate());
		printedHistoryImpl.setModifiedDate(printedHistory.getModifiedDate());
		printedHistoryImpl.setCitizenId(printedHistory.getCitizenId());

		return printedHistoryImpl;
	}

	/**
	 * Returns the printed history with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the printed history
	 * @return the printed history
	 * @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	 */
	@Override
	public PrintedHistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPrintedHistoryException {
		PrintedHistory printedHistory = fetchByPrimaryKey(primaryKey);

		if (printedHistory == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPrintedHistoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return printedHistory;
	}

	/**
	 * Returns the printed history with the primary key or throws a {@link NoSuchPrintedHistoryException} if it could not be found.
	 *
	 * @param id the primary key of the printed history
	 * @return the printed history
	 * @throws NoSuchPrintedHistoryException if a printed history with the primary key could not be found
	 */
	@Override
	public PrintedHistory findByPrimaryKey(long id)
		throws NoSuchPrintedHistoryException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the printed history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the printed history
	 * @return the printed history, or <code>null</code> if a printed history with the primary key could not be found
	 */
	@Override
	public PrintedHistory fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
				PrintedHistoryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		PrintedHistory printedHistory = (PrintedHistory)serializable;

		if (printedHistory == null) {
			Session session = null;

			try {
				session = openSession();

				printedHistory = (PrintedHistory)session.get(PrintedHistoryImpl.class,
						primaryKey);

				if (printedHistory != null) {
					cacheResult(printedHistory);
				}
				else {
					entityCache.putResult(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
						PrintedHistoryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
					PrintedHistoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return printedHistory;
	}

	/**
	 * Returns the printed history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the printed history
	 * @return the printed history, or <code>null</code> if a printed history with the primary key could not be found
	 */
	@Override
	public PrintedHistory fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, PrintedHistory> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, PrintedHistory> map = new HashMap<Serializable, PrintedHistory>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			PrintedHistory printedHistory = fetchByPrimaryKey(primaryKey);

			if (printedHistory != null) {
				map.put(primaryKey, printedHistory);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
					PrintedHistoryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (PrintedHistory)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PRINTEDHISTORY_WHERE_PKS_IN);

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

			for (PrintedHistory printedHistory : (List<PrintedHistory>)q.list()) {
				map.put(printedHistory.getPrimaryKeyObj(), printedHistory);

				cacheResult(printedHistory);

				uncachedPrimaryKeys.remove(printedHistory.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(PrintedHistoryModelImpl.ENTITY_CACHE_ENABLED,
					PrintedHistoryImpl.class, primaryKey, nullModel);
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
	 * Returns all the printed histories.
	 *
	 * @return the printed histories
	 */
	@Override
	public List<PrintedHistory> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the printed histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of printed histories
	 * @param end the upper bound of the range of printed histories (not inclusive)
	 * @return the range of printed histories
	 */
	@Override
	public List<PrintedHistory> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the printed histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of printed histories
	 * @param end the upper bound of the range of printed histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of printed histories
	 */
	@Override
	public List<PrintedHistory> findAll(int start, int end,
		OrderByComparator<PrintedHistory> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the printed histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PrintedHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of printed histories
	 * @param end the upper bound of the range of printed histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of printed histories
	 */
	@Override
	public List<PrintedHistory> findAll(int start, int end,
		OrderByComparator<PrintedHistory> orderByComparator,
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

		List<PrintedHistory> list = null;

		if (retrieveFromCache) {
			list = (List<PrintedHistory>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PRINTEDHISTORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRINTEDHISTORY;

				if (pagination) {
					sql = sql.concat(PrintedHistoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PrintedHistory>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PrintedHistory>)QueryUtil.list(q,
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
	 * Removes all the printed histories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PrintedHistory printedHistory : findAll()) {
			remove(printedHistory);
		}
	}

	/**
	 * Returns the number of printed histories.
	 *
	 * @return the number of printed histories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PRINTEDHISTORY);

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
		return PrintedHistoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the printed history persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(PrintedHistoryImpl.class.getName());
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
	private static final String _SQL_SELECT_PRINTEDHISTORY = "SELECT printedHistory FROM PrintedHistory printedHistory";
	private static final String _SQL_SELECT_PRINTEDHISTORY_WHERE_PKS_IN = "SELECT printedHistory FROM PrintedHistory printedHistory WHERE id_ IN (";
	private static final String _SQL_SELECT_PRINTEDHISTORY_WHERE = "SELECT printedHistory FROM PrintedHistory printedHistory WHERE ";
	private static final String _SQL_COUNT_PRINTEDHISTORY = "SELECT COUNT(printedHistory) FROM PrintedHistory printedHistory";
	private static final String _SQL_COUNT_PRINTEDHISTORY_WHERE = "SELECT COUNT(printedHistory) FROM PrintedHistory printedHistory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "printedHistory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PrintedHistory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PrintedHistory exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(PrintedHistoryPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}