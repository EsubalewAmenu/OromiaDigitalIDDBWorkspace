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

import IdentificationDatabase.exception.NoSuchKebelesException;

import IdentificationDatabase.model.Kebeles;

import IdentificationDatabase.model.impl.KebelesImpl;
import IdentificationDatabase.model.impl.KebelesModelImpl;

import IdentificationDatabase.service.persistence.KebelesPersistence;

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
 * The persistence implementation for the kebeles service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KebelesPersistence
 * @see IdentificationDatabase.service.persistence.KebelesUtil
 * @generated
 */
@ProviderType
public class KebelesPersistenceImpl extends BasePersistenceImpl<Kebeles>
	implements KebelesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link KebelesUtil} to access the kebeles persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = KebelesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByid",
			new String[] { Long.class.getName() },
			KebelesModelImpl.ID_COLUMN_BITMASK |
			KebelesModelImpl.KEBELEOR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the kebeleses where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching kebeleses
	 */
	@Override
	public List<Kebeles> findByid(long id) {
		return findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kebeleses where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @return the range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findByid(long id, int start, int end) {
		return findByid(id, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kebeleses where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findByid(long id, int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return findByid(id, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the kebeleses where id = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param id the ID
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findByid(long id, int start, int end,
		OrderByComparator<Kebeles> orderByComparator, boolean retrieveFromCache) {
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

		List<Kebeles> list = null;

		if (retrieveFromCache) {
			list = (List<Kebeles>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Kebeles kebeles : list) {
					if ((id != kebeles.getId())) {
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

			query.append(_SQL_SELECT_KEBELES_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KebelesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kebeles in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findByid_First(long id,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchByid_First(id, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the first kebeles in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchByid_First(long id,
		OrderByComparator<Kebeles> orderByComparator) {
		List<Kebeles> list = findByid(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kebeles in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findByid_Last(long id,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchByid_Last(id, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the last kebeles in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchByid_Last(long id,
		OrderByComparator<Kebeles> orderByComparator) {
		int count = countByid(id);

		if (count == 0) {
			return null;
		}

		List<Kebeles> list = findByid(id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Removes all the kebeleses where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByid(long id) {
		for (Kebeles kebeles : findByid(id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kebeles);
		}
	}

	/**
	 * Returns the number of kebeleses where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching kebeleses
	 */
	@Override
	public int countByid(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEBELES_WHERE);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "kebeles.id = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_KEBELEOR = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBykebeleOr",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEOR =
		new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBykebeleOr",
			new String[] { String.class.getName() },
			KebelesModelImpl.KEBELEOR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KEBELEOR = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBykebeleOr",
			new String[] { String.class.getName() });

	/**
	 * Returns all the kebeleses where kebeleOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @return the matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebeleOr(String kebeleOr) {
		return findBykebeleOr(kebeleOr, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the kebeleses where kebeleOr = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kebeleOr the kebele or
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @return the range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebeleOr(String kebeleOr, int start, int end) {
		return findBykebeleOr(kebeleOr, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kebeleses where kebeleOr = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kebeleOr the kebele or
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebeleOr(String kebeleOr, int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return findBykebeleOr(kebeleOr, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the kebeleses where kebeleOr = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kebeleOr the kebele or
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebeleOr(String kebeleOr, int start, int end,
		OrderByComparator<Kebeles> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEOR;
			finderArgs = new Object[] { kebeleOr };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_KEBELEOR;
			finderArgs = new Object[] { kebeleOr, start, end, orderByComparator };
		}

		List<Kebeles> list = null;

		if (retrieveFromCache) {
			list = (List<Kebeles>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Kebeles kebeles : list) {
					if (!Objects.equals(kebeleOr, kebeles.getKebeleOr())) {
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

			query.append(_SQL_SELECT_KEBELES_WHERE);

			boolean bindKebeleOr = false;

			if (kebeleOr == null) {
				query.append(_FINDER_COLUMN_KEBELEOR_KEBELEOR_1);
			}
			else if (kebeleOr.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEBELEOR_KEBELEOR_3);
			}
			else {
				bindKebeleOr = true;

				query.append(_FINDER_COLUMN_KEBELEOR_KEBELEOR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KebelesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKebeleOr) {
					qPos.add(kebeleOr);
				}

				if (!pagination) {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kebeles in the ordered set where kebeleOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findBykebeleOr_First(String kebeleOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchBykebeleOr_First(kebeleOr, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("kebeleOr=");
		msg.append(kebeleOr);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the first kebeles in the ordered set where kebeleOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchBykebeleOr_First(String kebeleOr,
		OrderByComparator<Kebeles> orderByComparator) {
		List<Kebeles> list = findBykebeleOr(kebeleOr, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kebeles in the ordered set where kebeleOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findBykebeleOr_Last(String kebeleOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchBykebeleOr_Last(kebeleOr, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("kebeleOr=");
		msg.append(kebeleOr);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the last kebeles in the ordered set where kebeleOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchBykebeleOr_Last(String kebeleOr,
		OrderByComparator<Kebeles> orderByComparator) {
		int count = countBykebeleOr(kebeleOr);

		if (count == 0) {
			return null;
		}

		List<Kebeles> list = findBykebeleOr(kebeleOr, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kebeleses before and after the current kebeles in the ordered set where kebeleOr = &#63;.
	 *
	 * @param id the primary key of the current kebeles
	 * @param kebeleOr the kebele or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kebeles
	 * @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles[] findBykebeleOr_PrevAndNext(long id, String kebeleOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Kebeles[] array = new KebelesImpl[3];

			array[0] = getBykebeleOr_PrevAndNext(session, kebeles, kebeleOr,
					orderByComparator, true);

			array[1] = kebeles;

			array[2] = getBykebeleOr_PrevAndNext(session, kebeles, kebeleOr,
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

	protected Kebeles getBykebeleOr_PrevAndNext(Session session,
		Kebeles kebeles, String kebeleOr,
		OrderByComparator<Kebeles> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEBELES_WHERE);

		boolean bindKebeleOr = false;

		if (kebeleOr == null) {
			query.append(_FINDER_COLUMN_KEBELEOR_KEBELEOR_1);
		}
		else if (kebeleOr.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_KEBELEOR_KEBELEOR_3);
		}
		else {
			bindKebeleOr = true;

			query.append(_FINDER_COLUMN_KEBELEOR_KEBELEOR_2);
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
			query.append(KebelesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindKebeleOr) {
			qPos.add(kebeleOr);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kebeles);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Kebeles> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kebeleses where kebeleOr = &#63; from the database.
	 *
	 * @param kebeleOr the kebele or
	 */
	@Override
	public void removeBykebeleOr(String kebeleOr) {
		for (Kebeles kebeles : findBykebeleOr(kebeleOr, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kebeles);
		}
	}

	/**
	 * Returns the number of kebeleses where kebeleOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @return the number of matching kebeleses
	 */
	@Override
	public int countBykebeleOr(String kebeleOr) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KEBELEOR;

		Object[] finderArgs = new Object[] { kebeleOr };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEBELES_WHERE);

			boolean bindKebeleOr = false;

			if (kebeleOr == null) {
				query.append(_FINDER_COLUMN_KEBELEOR_KEBELEOR_1);
			}
			else if (kebeleOr.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEBELEOR_KEBELEOR_3);
			}
			else {
				bindKebeleOr = true;

				query.append(_FINDER_COLUMN_KEBELEOR_KEBELEOR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKebeleOr) {
					qPos.add(kebeleOr);
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

	private static final String _FINDER_COLUMN_KEBELEOR_KEBELEOR_1 = "kebeles.kebeleOr IS NULL";
	private static final String _FINDER_COLUMN_KEBELEOR_KEBELEOR_2 = "kebeles.kebeleOr = ?";
	private static final String _FINDER_COLUMN_KEBELEOR_KEBELEOR_3 = "(kebeles.kebeleOr IS NULL OR kebeles.kebeleOr = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_KEBELEAM = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBykebeleAm",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEAM =
		new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBykebeleAm",
			new String[] { String.class.getName() },
			KebelesModelImpl.KEBELEAM_COLUMN_BITMASK |
			KebelesModelImpl.KEBELEOR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KEBELEAM = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBykebeleAm",
			new String[] { String.class.getName() });

	/**
	 * Returns all the kebeleses where kebeleAm = &#63;.
	 *
	 * @param kebeleAm the kebele am
	 * @return the matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebeleAm(String kebeleAm) {
		return findBykebeleAm(kebeleAm, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the kebeleses where kebeleAm = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kebeleAm the kebele am
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @return the range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebeleAm(String kebeleAm, int start, int end) {
		return findBykebeleAm(kebeleAm, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kebeleses where kebeleAm = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kebeleAm the kebele am
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebeleAm(String kebeleAm, int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return findBykebeleAm(kebeleAm, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the kebeleses where kebeleAm = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kebeleAm the kebele am
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebeleAm(String kebeleAm, int start, int end,
		OrderByComparator<Kebeles> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEAM;
			finderArgs = new Object[] { kebeleAm };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_KEBELEAM;
			finderArgs = new Object[] { kebeleAm, start, end, orderByComparator };
		}

		List<Kebeles> list = null;

		if (retrieveFromCache) {
			list = (List<Kebeles>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Kebeles kebeles : list) {
					if (!Objects.equals(kebeleAm, kebeles.getKebeleAm())) {
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

			query.append(_SQL_SELECT_KEBELES_WHERE);

			boolean bindKebeleAm = false;

			if (kebeleAm == null) {
				query.append(_FINDER_COLUMN_KEBELEAM_KEBELEAM_1);
			}
			else if (kebeleAm.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEBELEAM_KEBELEAM_3);
			}
			else {
				bindKebeleAm = true;

				query.append(_FINDER_COLUMN_KEBELEAM_KEBELEAM_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KebelesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKebeleAm) {
					qPos.add(kebeleAm);
				}

				if (!pagination) {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kebeles in the ordered set where kebeleAm = &#63;.
	 *
	 * @param kebeleAm the kebele am
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findBykebeleAm_First(String kebeleAm,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchBykebeleAm_First(kebeleAm, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("kebeleAm=");
		msg.append(kebeleAm);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the first kebeles in the ordered set where kebeleAm = &#63;.
	 *
	 * @param kebeleAm the kebele am
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchBykebeleAm_First(String kebeleAm,
		OrderByComparator<Kebeles> orderByComparator) {
		List<Kebeles> list = findBykebeleAm(kebeleAm, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kebeles in the ordered set where kebeleAm = &#63;.
	 *
	 * @param kebeleAm the kebele am
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findBykebeleAm_Last(String kebeleAm,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchBykebeleAm_Last(kebeleAm, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("kebeleAm=");
		msg.append(kebeleAm);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the last kebeles in the ordered set where kebeleAm = &#63;.
	 *
	 * @param kebeleAm the kebele am
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchBykebeleAm_Last(String kebeleAm,
		OrderByComparator<Kebeles> orderByComparator) {
		int count = countBykebeleAm(kebeleAm);

		if (count == 0) {
			return null;
		}

		List<Kebeles> list = findBykebeleAm(kebeleAm, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kebeleses before and after the current kebeles in the ordered set where kebeleAm = &#63;.
	 *
	 * @param id the primary key of the current kebeles
	 * @param kebeleAm the kebele am
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kebeles
	 * @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles[] findBykebeleAm_PrevAndNext(long id, String kebeleAm,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Kebeles[] array = new KebelesImpl[3];

			array[0] = getBykebeleAm_PrevAndNext(session, kebeles, kebeleAm,
					orderByComparator, true);

			array[1] = kebeles;

			array[2] = getBykebeleAm_PrevAndNext(session, kebeles, kebeleAm,
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

	protected Kebeles getBykebeleAm_PrevAndNext(Session session,
		Kebeles kebeles, String kebeleAm,
		OrderByComparator<Kebeles> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEBELES_WHERE);

		boolean bindKebeleAm = false;

		if (kebeleAm == null) {
			query.append(_FINDER_COLUMN_KEBELEAM_KEBELEAM_1);
		}
		else if (kebeleAm.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_KEBELEAM_KEBELEAM_3);
		}
		else {
			bindKebeleAm = true;

			query.append(_FINDER_COLUMN_KEBELEAM_KEBELEAM_2);
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
			query.append(KebelesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindKebeleAm) {
			qPos.add(kebeleAm);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kebeles);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Kebeles> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kebeleses where kebeleAm = &#63; from the database.
	 *
	 * @param kebeleAm the kebele am
	 */
	@Override
	public void removeBykebeleAm(String kebeleAm) {
		for (Kebeles kebeles : findBykebeleAm(kebeleAm, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kebeles);
		}
	}

	/**
	 * Returns the number of kebeleses where kebeleAm = &#63;.
	 *
	 * @param kebeleAm the kebele am
	 * @return the number of matching kebeleses
	 */
	@Override
	public int countBykebeleAm(String kebeleAm) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KEBELEAM;

		Object[] finderArgs = new Object[] { kebeleAm };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEBELES_WHERE);

			boolean bindKebeleAm = false;

			if (kebeleAm == null) {
				query.append(_FINDER_COLUMN_KEBELEAM_KEBELEAM_1);
			}
			else if (kebeleAm.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEBELEAM_KEBELEAM_3);
			}
			else {
				bindKebeleAm = true;

				query.append(_FINDER_COLUMN_KEBELEAM_KEBELEAM_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKebeleAm) {
					qPos.add(kebeleAm);
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

	private static final String _FINDER_COLUMN_KEBELEAM_KEBELEAM_1 = "kebeles.kebeleAm IS NULL";
	private static final String _FINDER_COLUMN_KEBELEAM_KEBELEAM_2 = "kebeles.kebeleAm = ?";
	private static final String _FINDER_COLUMN_KEBELEAM_KEBELEAM_3 = "(kebeles.kebeleAm IS NULL OR kebeles.kebeleAm = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBCITYOR =
		new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBysubcityOr",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYOR =
		new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBysubcityOr",
			new String[] { String.class.getName() },
			KebelesModelImpl.SUBCITYOR_COLUMN_BITMASK |
			KebelesModelImpl.KEBELEOR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SUBCITYOR = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBysubcityOr",
			new String[] { String.class.getName() });

	/**
	 * Returns all the kebeleses where subcityOr = &#63;.
	 *
	 * @param subcityOr the subcity or
	 * @return the matching kebeleses
	 */
	@Override
	public List<Kebeles> findBysubcityOr(String subcityOr) {
		return findBysubcityOr(subcityOr, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the kebeleses where subcityOr = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param subcityOr the subcity or
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @return the range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBysubcityOr(String subcityOr, int start, int end) {
		return findBysubcityOr(subcityOr, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kebeleses where subcityOr = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param subcityOr the subcity or
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBysubcityOr(String subcityOr, int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return findBysubcityOr(subcityOr, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the kebeleses where subcityOr = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param subcityOr the subcity or
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBysubcityOr(String subcityOr, int start, int end,
		OrderByComparator<Kebeles> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYOR;
			finderArgs = new Object[] { subcityOr };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBCITYOR;
			finderArgs = new Object[] { subcityOr, start, end, orderByComparator };
		}

		List<Kebeles> list = null;

		if (retrieveFromCache) {
			list = (List<Kebeles>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Kebeles kebeles : list) {
					if (!Objects.equals(subcityOr, kebeles.getSubcityOr())) {
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

			query.append(_SQL_SELECT_KEBELES_WHERE);

			boolean bindSubcityOr = false;

			if (subcityOr == null) {
				query.append(_FINDER_COLUMN_SUBCITYOR_SUBCITYOR_1);
			}
			else if (subcityOr.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SUBCITYOR_SUBCITYOR_3);
			}
			else {
				bindSubcityOr = true;

				query.append(_FINDER_COLUMN_SUBCITYOR_SUBCITYOR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KebelesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSubcityOr) {
					qPos.add(subcityOr);
				}

				if (!pagination) {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kebeles in the ordered set where subcityOr = &#63;.
	 *
	 * @param subcityOr the subcity or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findBysubcityOr_First(String subcityOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchBysubcityOr_First(subcityOr, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("subcityOr=");
		msg.append(subcityOr);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the first kebeles in the ordered set where subcityOr = &#63;.
	 *
	 * @param subcityOr the subcity or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchBysubcityOr_First(String subcityOr,
		OrderByComparator<Kebeles> orderByComparator) {
		List<Kebeles> list = findBysubcityOr(subcityOr, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kebeles in the ordered set where subcityOr = &#63;.
	 *
	 * @param subcityOr the subcity or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findBysubcityOr_Last(String subcityOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchBysubcityOr_Last(subcityOr, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("subcityOr=");
		msg.append(subcityOr);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the last kebeles in the ordered set where subcityOr = &#63;.
	 *
	 * @param subcityOr the subcity or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchBysubcityOr_Last(String subcityOr,
		OrderByComparator<Kebeles> orderByComparator) {
		int count = countBysubcityOr(subcityOr);

		if (count == 0) {
			return null;
		}

		List<Kebeles> list = findBysubcityOr(subcityOr, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kebeleses before and after the current kebeles in the ordered set where subcityOr = &#63;.
	 *
	 * @param id the primary key of the current kebeles
	 * @param subcityOr the subcity or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kebeles
	 * @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles[] findBysubcityOr_PrevAndNext(long id, String subcityOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Kebeles[] array = new KebelesImpl[3];

			array[0] = getBysubcityOr_PrevAndNext(session, kebeles, subcityOr,
					orderByComparator, true);

			array[1] = kebeles;

			array[2] = getBysubcityOr_PrevAndNext(session, kebeles, subcityOr,
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

	protected Kebeles getBysubcityOr_PrevAndNext(Session session,
		Kebeles kebeles, String subcityOr,
		OrderByComparator<Kebeles> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEBELES_WHERE);

		boolean bindSubcityOr = false;

		if (subcityOr == null) {
			query.append(_FINDER_COLUMN_SUBCITYOR_SUBCITYOR_1);
		}
		else if (subcityOr.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SUBCITYOR_SUBCITYOR_3);
		}
		else {
			bindSubcityOr = true;

			query.append(_FINDER_COLUMN_SUBCITYOR_SUBCITYOR_2);
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
			query.append(KebelesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSubcityOr) {
			qPos.add(subcityOr);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kebeles);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Kebeles> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kebeleses where subcityOr = &#63; from the database.
	 *
	 * @param subcityOr the subcity or
	 */
	@Override
	public void removeBysubcityOr(String subcityOr) {
		for (Kebeles kebeles : findBysubcityOr(subcityOr, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kebeles);
		}
	}

	/**
	 * Returns the number of kebeleses where subcityOr = &#63;.
	 *
	 * @param subcityOr the subcity or
	 * @return the number of matching kebeleses
	 */
	@Override
	public int countBysubcityOr(String subcityOr) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SUBCITYOR;

		Object[] finderArgs = new Object[] { subcityOr };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEBELES_WHERE);

			boolean bindSubcityOr = false;

			if (subcityOr == null) {
				query.append(_FINDER_COLUMN_SUBCITYOR_SUBCITYOR_1);
			}
			else if (subcityOr.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SUBCITYOR_SUBCITYOR_3);
			}
			else {
				bindSubcityOr = true;

				query.append(_FINDER_COLUMN_SUBCITYOR_SUBCITYOR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSubcityOr) {
					qPos.add(subcityOr);
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

	private static final String _FINDER_COLUMN_SUBCITYOR_SUBCITYOR_1 = "kebeles.subcityOr IS NULL";
	private static final String _FINDER_COLUMN_SUBCITYOR_SUBCITYOR_2 = "kebeles.subcityOr = ?";
	private static final String _FINDER_COLUMN_SUBCITYOR_SUBCITYOR_3 = "(kebeles.subcityOr IS NULL OR kebeles.subcityOr = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBCITYAM =
		new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBysubcityAm",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYAM =
		new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBysubcityAm",
			new String[] { String.class.getName() },
			KebelesModelImpl.SUBCITYAM_COLUMN_BITMASK |
			KebelesModelImpl.KEBELEOR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SUBCITYAM = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBysubcityAm",
			new String[] { String.class.getName() });

	/**
	 * Returns all the kebeleses where subcityAm = &#63;.
	 *
	 * @param subcityAm the subcity am
	 * @return the matching kebeleses
	 */
	@Override
	public List<Kebeles> findBysubcityAm(String subcityAm) {
		return findBysubcityAm(subcityAm, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the kebeleses where subcityAm = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param subcityAm the subcity am
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @return the range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBysubcityAm(String subcityAm, int start, int end) {
		return findBysubcityAm(subcityAm, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kebeleses where subcityAm = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param subcityAm the subcity am
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBysubcityAm(String subcityAm, int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return findBysubcityAm(subcityAm, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the kebeleses where subcityAm = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param subcityAm the subcity am
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBysubcityAm(String subcityAm, int start, int end,
		OrderByComparator<Kebeles> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYAM;
			finderArgs = new Object[] { subcityAm };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SUBCITYAM;
			finderArgs = new Object[] { subcityAm, start, end, orderByComparator };
		}

		List<Kebeles> list = null;

		if (retrieveFromCache) {
			list = (List<Kebeles>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Kebeles kebeles : list) {
					if (!Objects.equals(subcityAm, kebeles.getSubcityAm())) {
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

			query.append(_SQL_SELECT_KEBELES_WHERE);

			boolean bindSubcityAm = false;

			if (subcityAm == null) {
				query.append(_FINDER_COLUMN_SUBCITYAM_SUBCITYAM_1);
			}
			else if (subcityAm.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SUBCITYAM_SUBCITYAM_3);
			}
			else {
				bindSubcityAm = true;

				query.append(_FINDER_COLUMN_SUBCITYAM_SUBCITYAM_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KebelesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSubcityAm) {
					qPos.add(subcityAm);
				}

				if (!pagination) {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kebeles in the ordered set where subcityAm = &#63;.
	 *
	 * @param subcityAm the subcity am
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findBysubcityAm_First(String subcityAm,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchBysubcityAm_First(subcityAm, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("subcityAm=");
		msg.append(subcityAm);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the first kebeles in the ordered set where subcityAm = &#63;.
	 *
	 * @param subcityAm the subcity am
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchBysubcityAm_First(String subcityAm,
		OrderByComparator<Kebeles> orderByComparator) {
		List<Kebeles> list = findBysubcityAm(subcityAm, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kebeles in the ordered set where subcityAm = &#63;.
	 *
	 * @param subcityAm the subcity am
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findBysubcityAm_Last(String subcityAm,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchBysubcityAm_Last(subcityAm, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("subcityAm=");
		msg.append(subcityAm);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the last kebeles in the ordered set where subcityAm = &#63;.
	 *
	 * @param subcityAm the subcity am
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchBysubcityAm_Last(String subcityAm,
		OrderByComparator<Kebeles> orderByComparator) {
		int count = countBysubcityAm(subcityAm);

		if (count == 0) {
			return null;
		}

		List<Kebeles> list = findBysubcityAm(subcityAm, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kebeleses before and after the current kebeles in the ordered set where subcityAm = &#63;.
	 *
	 * @param id the primary key of the current kebeles
	 * @param subcityAm the subcity am
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kebeles
	 * @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles[] findBysubcityAm_PrevAndNext(long id, String subcityAm,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Kebeles[] array = new KebelesImpl[3];

			array[0] = getBysubcityAm_PrevAndNext(session, kebeles, subcityAm,
					orderByComparator, true);

			array[1] = kebeles;

			array[2] = getBysubcityAm_PrevAndNext(session, kebeles, subcityAm,
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

	protected Kebeles getBysubcityAm_PrevAndNext(Session session,
		Kebeles kebeles, String subcityAm,
		OrderByComparator<Kebeles> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEBELES_WHERE);

		boolean bindSubcityAm = false;

		if (subcityAm == null) {
			query.append(_FINDER_COLUMN_SUBCITYAM_SUBCITYAM_1);
		}
		else if (subcityAm.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SUBCITYAM_SUBCITYAM_3);
		}
		else {
			bindSubcityAm = true;

			query.append(_FINDER_COLUMN_SUBCITYAM_SUBCITYAM_2);
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
			query.append(KebelesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindSubcityAm) {
			qPos.add(subcityAm);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kebeles);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Kebeles> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kebeleses where subcityAm = &#63; from the database.
	 *
	 * @param subcityAm the subcity am
	 */
	@Override
	public void removeBysubcityAm(String subcityAm) {
		for (Kebeles kebeles : findBysubcityAm(subcityAm, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(kebeles);
		}
	}

	/**
	 * Returns the number of kebeleses where subcityAm = &#63;.
	 *
	 * @param subcityAm the subcity am
	 * @return the number of matching kebeleses
	 */
	@Override
	public int countBysubcityAm(String subcityAm) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SUBCITYAM;

		Object[] finderArgs = new Object[] { subcityAm };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEBELES_WHERE);

			boolean bindSubcityAm = false;

			if (subcityAm == null) {
				query.append(_FINDER_COLUMN_SUBCITYAM_SUBCITYAM_1);
			}
			else if (subcityAm.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SUBCITYAM_SUBCITYAM_3);
			}
			else {
				bindSubcityAm = true;

				query.append(_FINDER_COLUMN_SUBCITYAM_SUBCITYAM_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindSubcityAm) {
					qPos.add(subcityAm);
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

	private static final String _FINDER_COLUMN_SUBCITYAM_SUBCITYAM_1 = "kebeles.subcityAm IS NULL";
	private static final String _FINDER_COLUMN_SUBCITYAM_SUBCITYAM_2 = "kebeles.subcityAm = ?";
	private static final String _FINDER_COLUMN_SUBCITYAM_SUBCITYAM_3 = "(kebeles.subcityAm IS NULL OR kebeles.subcityAm = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PRINTERNAME =
		new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByprintername",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRINTERNAME =
		new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByprintername",
			new String[] { String.class.getName() },
			KebelesModelImpl.PRINTERNAME_COLUMN_BITMASK |
			KebelesModelImpl.KEBELEOR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PRINTERNAME = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByprintername",
			new String[] { String.class.getName() });

	/**
	 * Returns all the kebeleses where printername = &#63;.
	 *
	 * @param printername the printername
	 * @return the matching kebeleses
	 */
	@Override
	public List<Kebeles> findByprintername(String printername) {
		return findByprintername(printername, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kebeleses where printername = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param printername the printername
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @return the range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findByprintername(String printername, int start,
		int end) {
		return findByprintername(printername, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kebeleses where printername = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param printername the printername
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findByprintername(String printername, int start,
		int end, OrderByComparator<Kebeles> orderByComparator) {
		return findByprintername(printername, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the kebeleses where printername = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param printername the printername
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findByprintername(String printername, int start,
		int end, OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRINTERNAME;
			finderArgs = new Object[] { printername };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PRINTERNAME;
			finderArgs = new Object[] { printername, start, end, orderByComparator };
		}

		List<Kebeles> list = null;

		if (retrieveFromCache) {
			list = (List<Kebeles>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Kebeles kebeles : list) {
					if (!Objects.equals(printername, kebeles.getPrintername())) {
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

			query.append(_SQL_SELECT_KEBELES_WHERE);

			boolean bindPrintername = false;

			if (printername == null) {
				query.append(_FINDER_COLUMN_PRINTERNAME_PRINTERNAME_1);
			}
			else if (printername.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRINTERNAME_PRINTERNAME_3);
			}
			else {
				bindPrintername = true;

				query.append(_FINDER_COLUMN_PRINTERNAME_PRINTERNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KebelesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPrintername) {
					qPos.add(printername);
				}

				if (!pagination) {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kebeles in the ordered set where printername = &#63;.
	 *
	 * @param printername the printername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findByprintername_First(String printername,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchByprintername_First(printername,
				orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("printername=");
		msg.append(printername);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the first kebeles in the ordered set where printername = &#63;.
	 *
	 * @param printername the printername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchByprintername_First(String printername,
		OrderByComparator<Kebeles> orderByComparator) {
		List<Kebeles> list = findByprintername(printername, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kebeles in the ordered set where printername = &#63;.
	 *
	 * @param printername the printername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findByprintername_Last(String printername,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchByprintername_Last(printername, orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("printername=");
		msg.append(printername);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the last kebeles in the ordered set where printername = &#63;.
	 *
	 * @param printername the printername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchByprintername_Last(String printername,
		OrderByComparator<Kebeles> orderByComparator) {
		int count = countByprintername(printername);

		if (count == 0) {
			return null;
		}

		List<Kebeles> list = findByprintername(printername, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kebeleses before and after the current kebeles in the ordered set where printername = &#63;.
	 *
	 * @param id the primary key of the current kebeles
	 * @param printername the printername
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kebeles
	 * @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles[] findByprintername_PrevAndNext(long id, String printername,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Kebeles[] array = new KebelesImpl[3];

			array[0] = getByprintername_PrevAndNext(session, kebeles,
					printername, orderByComparator, true);

			array[1] = kebeles;

			array[2] = getByprintername_PrevAndNext(session, kebeles,
					printername, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Kebeles getByprintername_PrevAndNext(Session session,
		Kebeles kebeles, String printername,
		OrderByComparator<Kebeles> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_KEBELES_WHERE);

		boolean bindPrintername = false;

		if (printername == null) {
			query.append(_FINDER_COLUMN_PRINTERNAME_PRINTERNAME_1);
		}
		else if (printername.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_PRINTERNAME_PRINTERNAME_3);
		}
		else {
			bindPrintername = true;

			query.append(_FINDER_COLUMN_PRINTERNAME_PRINTERNAME_2);
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
			query.append(KebelesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindPrintername) {
			qPos.add(printername);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kebeles);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Kebeles> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kebeleses where printername = &#63; from the database.
	 *
	 * @param printername the printername
	 */
	@Override
	public void removeByprintername(String printername) {
		for (Kebeles kebeles : findByprintername(printername,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(kebeles);
		}
	}

	/**
	 * Returns the number of kebeleses where printername = &#63;.
	 *
	 * @param printername the printername
	 * @return the number of matching kebeleses
	 */
	@Override
	public int countByprintername(String printername) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PRINTERNAME;

		Object[] finderArgs = new Object[] { printername };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_KEBELES_WHERE);

			boolean bindPrintername = false;

			if (printername == null) {
				query.append(_FINDER_COLUMN_PRINTERNAME_PRINTERNAME_1);
			}
			else if (printername.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PRINTERNAME_PRINTERNAME_3);
			}
			else {
				bindPrintername = true;

				query.append(_FINDER_COLUMN_PRINTERNAME_PRINTERNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPrintername) {
					qPos.add(printername);
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

	private static final String _FINDER_COLUMN_PRINTERNAME_PRINTERNAME_1 = "kebeles.printername IS NULL";
	private static final String _FINDER_COLUMN_PRINTERNAME_PRINTERNAME_2 = "kebeles.printername = ?";
	private static final String _FINDER_COLUMN_PRINTERNAME_PRINTERNAME_3 = "(kebeles.printername IS NULL OR kebeles.printername = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_KEBSUBCITY =
		new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBykebsubcity",
			new String[] {
				String.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBSUBCITY =
		new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, KebelesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBykebsubcity",
			new String[] { String.class.getName(), String.class.getName() },
			KebelesModelImpl.KEBELEOR_COLUMN_BITMASK |
			KebelesModelImpl.SUBCITYOR_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_KEBSUBCITY = new FinderPath(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBykebsubcity",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns all the kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 * @return the matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebsubcity(String kebeleOr, String subcityOr) {
		return findBykebsubcity(kebeleOr, subcityOr, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @return the range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebsubcity(String kebeleOr, String subcityOr,
		int start, int end) {
		return findBykebsubcity(kebeleOr, subcityOr, start, end, null);
	}

	/**
	 * Returns an ordered range of all the kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebsubcity(String kebeleOr, String subcityOr,
		int start, int end, OrderByComparator<Kebeles> orderByComparator) {
		return findBykebsubcity(kebeleOr, subcityOr, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching kebeleses
	 */
	@Override
	public List<Kebeles> findBykebsubcity(String kebeleOr, String subcityOr,
		int start, int end, OrderByComparator<Kebeles> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBSUBCITY;
			finderArgs = new Object[] { kebeleOr, subcityOr };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_KEBSUBCITY;
			finderArgs = new Object[] {
					kebeleOr, subcityOr,
					
					start, end, orderByComparator
				};
		}

		List<Kebeles> list = null;

		if (retrieveFromCache) {
			list = (List<Kebeles>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (Kebeles kebeles : list) {
					if (!Objects.equals(kebeleOr, kebeles.getKebeleOr()) ||
							!Objects.equals(subcityOr, kebeles.getSubcityOr())) {
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

			query.append(_SQL_SELECT_KEBELES_WHERE);

			boolean bindKebeleOr = false;

			if (kebeleOr == null) {
				query.append(_FINDER_COLUMN_KEBSUBCITY_KEBELEOR_1);
			}
			else if (kebeleOr.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEBSUBCITY_KEBELEOR_3);
			}
			else {
				bindKebeleOr = true;

				query.append(_FINDER_COLUMN_KEBSUBCITY_KEBELEOR_2);
			}

			boolean bindSubcityOr = false;

			if (subcityOr == null) {
				query.append(_FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_1);
			}
			else if (subcityOr.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_3);
			}
			else {
				bindSubcityOr = true;

				query.append(_FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(KebelesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKebeleOr) {
					qPos.add(kebeleOr);
				}

				if (bindSubcityOr) {
					qPos.add(subcityOr);
				}

				if (!pagination) {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findBykebsubcity_First(String kebeleOr, String subcityOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchBykebsubcity_First(kebeleOr, subcityOr,
				orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("kebeleOr=");
		msg.append(kebeleOr);

		msg.append(", subcityOr=");
		msg.append(subcityOr);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the first kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchBykebsubcity_First(String kebeleOr, String subcityOr,
		OrderByComparator<Kebeles> orderByComparator) {
		List<Kebeles> list = findBykebsubcity(kebeleOr, subcityOr, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles
	 * @throws NoSuchKebelesException if a matching kebeles could not be found
	 */
	@Override
	public Kebeles findBykebsubcity_Last(String kebeleOr, String subcityOr,
		OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchBykebsubcity_Last(kebeleOr, subcityOr,
				orderByComparator);

		if (kebeles != null) {
			return kebeles;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("kebeleOr=");
		msg.append(kebeleOr);

		msg.append(", subcityOr=");
		msg.append(subcityOr);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchKebelesException(msg.toString());
	}

	/**
	 * Returns the last kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kebeles, or <code>null</code> if a matching kebeles could not be found
	 */
	@Override
	public Kebeles fetchBykebsubcity_Last(String kebeleOr, String subcityOr,
		OrderByComparator<Kebeles> orderByComparator) {
		int count = countBykebsubcity(kebeleOr, subcityOr);

		if (count == 0) {
			return null;
		}

		List<Kebeles> list = findBykebsubcity(kebeleOr, subcityOr, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the kebeleses before and after the current kebeles in the ordered set where kebeleOr = &#63; and subcityOr = &#63;.
	 *
	 * @param id the primary key of the current kebeles
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kebeles
	 * @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles[] findBykebsubcity_PrevAndNext(long id, String kebeleOr,
		String subcityOr, OrderByComparator<Kebeles> orderByComparator)
		throws NoSuchKebelesException {
		Kebeles kebeles = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			Kebeles[] array = new KebelesImpl[3];

			array[0] = getBykebsubcity_PrevAndNext(session, kebeles, kebeleOr,
					subcityOr, orderByComparator, true);

			array[1] = kebeles;

			array[2] = getBykebsubcity_PrevAndNext(session, kebeles, kebeleOr,
					subcityOr, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Kebeles getBykebsubcity_PrevAndNext(Session session,
		Kebeles kebeles, String kebeleOr, String subcityOr,
		OrderByComparator<Kebeles> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_KEBELES_WHERE);

		boolean bindKebeleOr = false;

		if (kebeleOr == null) {
			query.append(_FINDER_COLUMN_KEBSUBCITY_KEBELEOR_1);
		}
		else if (kebeleOr.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_KEBSUBCITY_KEBELEOR_3);
		}
		else {
			bindKebeleOr = true;

			query.append(_FINDER_COLUMN_KEBSUBCITY_KEBELEOR_2);
		}

		boolean bindSubcityOr = false;

		if (subcityOr == null) {
			query.append(_FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_1);
		}
		else if (subcityOr.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_3);
		}
		else {
			bindSubcityOr = true;

			query.append(_FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_2);
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
			query.append(KebelesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindKebeleOr) {
			qPos.add(kebeleOr);
		}

		if (bindSubcityOr) {
			qPos.add(subcityOr);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(kebeles);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Kebeles> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the kebeleses where kebeleOr = &#63; and subcityOr = &#63; from the database.
	 *
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 */
	@Override
	public void removeBykebsubcity(String kebeleOr, String subcityOr) {
		for (Kebeles kebeles : findBykebsubcity(kebeleOr, subcityOr,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(kebeles);
		}
	}

	/**
	 * Returns the number of kebeleses where kebeleOr = &#63; and subcityOr = &#63;.
	 *
	 * @param kebeleOr the kebele or
	 * @param subcityOr the subcity or
	 * @return the number of matching kebeleses
	 */
	@Override
	public int countBykebsubcity(String kebeleOr, String subcityOr) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_KEBSUBCITY;

		Object[] finderArgs = new Object[] { kebeleOr, subcityOr };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_KEBELES_WHERE);

			boolean bindKebeleOr = false;

			if (kebeleOr == null) {
				query.append(_FINDER_COLUMN_KEBSUBCITY_KEBELEOR_1);
			}
			else if (kebeleOr.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEBSUBCITY_KEBELEOR_3);
			}
			else {
				bindKebeleOr = true;

				query.append(_FINDER_COLUMN_KEBSUBCITY_KEBELEOR_2);
			}

			boolean bindSubcityOr = false;

			if (subcityOr == null) {
				query.append(_FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_1);
			}
			else if (subcityOr.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_3);
			}
			else {
				bindSubcityOr = true;

				query.append(_FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindKebeleOr) {
					qPos.add(kebeleOr);
				}

				if (bindSubcityOr) {
					qPos.add(subcityOr);
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

	private static final String _FINDER_COLUMN_KEBSUBCITY_KEBELEOR_1 = "kebeles.kebeleOr IS NULL AND ";
	private static final String _FINDER_COLUMN_KEBSUBCITY_KEBELEOR_2 = "kebeles.kebeleOr = ? AND ";
	private static final String _FINDER_COLUMN_KEBSUBCITY_KEBELEOR_3 = "(kebeles.kebeleOr IS NULL OR kebeles.kebeleOr = '') AND ";
	private static final String _FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_1 = "kebeles.subcityOr IS NULL";
	private static final String _FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_2 = "kebeles.subcityOr = ?";
	private static final String _FINDER_COLUMN_KEBSUBCITY_SUBCITYOR_3 = "(kebeles.subcityOr IS NULL OR kebeles.subcityOr = '')";

	public KebelesPersistenceImpl() {
		setModelClass(Kebeles.class);

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
	 * Caches the kebeles in the entity cache if it is enabled.
	 *
	 * @param kebeles the kebeles
	 */
	@Override
	public void cacheResult(Kebeles kebeles) {
		entityCache.putResult(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesImpl.class, kebeles.getPrimaryKey(), kebeles);

		kebeles.resetOriginalValues();
	}

	/**
	 * Caches the kebeleses in the entity cache if it is enabled.
	 *
	 * @param kebeleses the kebeleses
	 */
	@Override
	public void cacheResult(List<Kebeles> kebeleses) {
		for (Kebeles kebeles : kebeleses) {
			if (entityCache.getResult(KebelesModelImpl.ENTITY_CACHE_ENABLED,
						KebelesImpl.class, kebeles.getPrimaryKey()) == null) {
				cacheResult(kebeles);
			}
			else {
				kebeles.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all kebeleses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(KebelesImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the kebeles.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Kebeles kebeles) {
		entityCache.removeResult(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesImpl.class, kebeles.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Kebeles> kebeleses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Kebeles kebeles : kebeleses) {
			entityCache.removeResult(KebelesModelImpl.ENTITY_CACHE_ENABLED,
				KebelesImpl.class, kebeles.getPrimaryKey());
		}
	}

	/**
	 * Creates a new kebeles with the primary key. Does not add the kebeles to the database.
	 *
	 * @param id the primary key for the new kebeles
	 * @return the new kebeles
	 */
	@Override
	public Kebeles create(long id) {
		Kebeles kebeles = new KebelesImpl();

		kebeles.setNew(true);
		kebeles.setPrimaryKey(id);

		kebeles.setCompanyId(companyProvider.getCompanyId());

		return kebeles;
	}

	/**
	 * Removes the kebeles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the kebeles
	 * @return the kebeles that was removed
	 * @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles remove(long id) throws NoSuchKebelesException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the kebeles with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the kebeles
	 * @return the kebeles that was removed
	 * @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles remove(Serializable primaryKey)
		throws NoSuchKebelesException {
		Session session = null;

		try {
			session = openSession();

			Kebeles kebeles = (Kebeles)session.get(KebelesImpl.class, primaryKey);

			if (kebeles == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchKebelesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(kebeles);
		}
		catch (NoSuchKebelesException nsee) {
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
	protected Kebeles removeImpl(Kebeles kebeles) {
		kebeles = toUnwrappedModel(kebeles);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(kebeles)) {
				kebeles = (Kebeles)session.get(KebelesImpl.class,
						kebeles.getPrimaryKeyObj());
			}

			if (kebeles != null) {
				session.delete(kebeles);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (kebeles != null) {
			clearCache(kebeles);
		}

		return kebeles;
	}

	@Override
	public Kebeles updateImpl(Kebeles kebeles) {
		kebeles = toUnwrappedModel(kebeles);

		boolean isNew = kebeles.isNew();

		KebelesModelImpl kebelesModelImpl = (KebelesModelImpl)kebeles;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (kebeles.getCreateDate() == null)) {
			if (serviceContext == null) {
				kebeles.setCreateDate(now);
			}
			else {
				kebeles.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!kebelesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				kebeles.setModifiedDate(now);
			}
			else {
				kebeles.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (kebeles.isNew()) {
				session.save(kebeles);

				kebeles.setNew(false);
			}
			else {
				kebeles = (Kebeles)session.merge(kebeles);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!KebelesModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { kebelesModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			args = new Object[] { kebelesModelImpl.getKebeleOr() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_KEBELEOR, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEOR,
				args);

			args = new Object[] { kebelesModelImpl.getKebeleAm() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_KEBELEAM, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEAM,
				args);

			args = new Object[] { kebelesModelImpl.getSubcityOr() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SUBCITYOR, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYOR,
				args);

			args = new Object[] { kebelesModelImpl.getSubcityAm() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SUBCITYAM, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYAM,
				args);

			args = new Object[] { kebelesModelImpl.getPrintername() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_PRINTERNAME, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRINTERNAME,
				args);

			args = new Object[] {
					kebelesModelImpl.getKebeleOr(),
					kebelesModelImpl.getSubcityOr()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_KEBSUBCITY, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBSUBCITY,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((kebelesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { kebelesModelImpl.getOriginalId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { kebelesModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}

			if ((kebelesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEOR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kebelesModelImpl.getOriginalKebeleOr()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_KEBELEOR, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEOR,
					args);

				args = new Object[] { kebelesModelImpl.getKebeleOr() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_KEBELEOR, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEOR,
					args);
			}

			if ((kebelesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEAM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kebelesModelImpl.getOriginalKebeleAm()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_KEBELEAM, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEAM,
					args);

				args = new Object[] { kebelesModelImpl.getKebeleAm() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_KEBELEAM, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBELEAM,
					args);
			}

			if ((kebelesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYOR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kebelesModelImpl.getOriginalSubcityOr()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SUBCITYOR, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYOR,
					args);

				args = new Object[] { kebelesModelImpl.getSubcityOr() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SUBCITYOR, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYOR,
					args);
			}

			if ((kebelesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYAM.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kebelesModelImpl.getOriginalSubcityAm()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SUBCITYAM, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYAM,
					args);

				args = new Object[] { kebelesModelImpl.getSubcityAm() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SUBCITYAM, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SUBCITYAM,
					args);
			}

			if ((kebelesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRINTERNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kebelesModelImpl.getOriginalPrintername()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRINTERNAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRINTERNAME,
					args);

				args = new Object[] { kebelesModelImpl.getPrintername() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_PRINTERNAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PRINTERNAME,
					args);
			}

			if ((kebelesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBSUBCITY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						kebelesModelImpl.getOriginalKebeleOr(),
						kebelesModelImpl.getOriginalSubcityOr()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_KEBSUBCITY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBSUBCITY,
					args);

				args = new Object[] {
						kebelesModelImpl.getKebeleOr(),
						kebelesModelImpl.getSubcityOr()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_KEBSUBCITY, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_KEBSUBCITY,
					args);
			}
		}

		entityCache.putResult(KebelesModelImpl.ENTITY_CACHE_ENABLED,
			KebelesImpl.class, kebeles.getPrimaryKey(), kebeles, false);

		kebeles.resetOriginalValues();

		return kebeles;
	}

	protected Kebeles toUnwrappedModel(Kebeles kebeles) {
		if (kebeles instanceof KebelesImpl) {
			return kebeles;
		}

		KebelesImpl kebelesImpl = new KebelesImpl();

		kebelesImpl.setNew(kebeles.isNew());
		kebelesImpl.setPrimaryKey(kebeles.getPrimaryKey());

		kebelesImpl.setId(kebeles.getId());
		kebelesImpl.setGroupId(kebeles.getGroupId());
		kebelesImpl.setCompanyId(kebeles.getCompanyId());
		kebelesImpl.setUserId(kebeles.getUserId());
		kebelesImpl.setUserName(kebeles.getUserName());
		kebelesImpl.setCreateDate(kebeles.getCreateDate());
		kebelesImpl.setModifiedDate(kebeles.getModifiedDate());
		kebelesImpl.setKebeleOr(kebeles.getKebeleOr());
		kebelesImpl.setKebeleAm(kebeles.getKebeleAm());
		kebelesImpl.setSubcityOr(kebeles.getSubcityOr());
		kebelesImpl.setSubcityAm(kebeles.getSubcityAm());
		kebelesImpl.setPrintername(kebeles.getPrintername());

		return kebelesImpl;
	}

	/**
	 * Returns the kebeles with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the kebeles
	 * @return the kebeles
	 * @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles findByPrimaryKey(Serializable primaryKey)
		throws NoSuchKebelesException {
		Kebeles kebeles = fetchByPrimaryKey(primaryKey);

		if (kebeles == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchKebelesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return kebeles;
	}

	/**
	 * Returns the kebeles with the primary key or throws a {@link NoSuchKebelesException} if it could not be found.
	 *
	 * @param id the primary key of the kebeles
	 * @return the kebeles
	 * @throws NoSuchKebelesException if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles findByPrimaryKey(long id) throws NoSuchKebelesException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the kebeles with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the kebeles
	 * @return the kebeles, or <code>null</code> if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(KebelesModelImpl.ENTITY_CACHE_ENABLED,
				KebelesImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Kebeles kebeles = (Kebeles)serializable;

		if (kebeles == null) {
			Session session = null;

			try {
				session = openSession();

				kebeles = (Kebeles)session.get(KebelesImpl.class, primaryKey);

				if (kebeles != null) {
					cacheResult(kebeles);
				}
				else {
					entityCache.putResult(KebelesModelImpl.ENTITY_CACHE_ENABLED,
						KebelesImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(KebelesModelImpl.ENTITY_CACHE_ENABLED,
					KebelesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return kebeles;
	}

	/**
	 * Returns the kebeles with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the kebeles
	 * @return the kebeles, or <code>null</code> if a kebeles with the primary key could not be found
	 */
	@Override
	public Kebeles fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, Kebeles> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Kebeles> map = new HashMap<Serializable, Kebeles>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Kebeles kebeles = fetchByPrimaryKey(primaryKey);

			if (kebeles != null) {
				map.put(primaryKey, kebeles);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(KebelesModelImpl.ENTITY_CACHE_ENABLED,
					KebelesImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Kebeles)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_KEBELES_WHERE_PKS_IN);

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

			for (Kebeles kebeles : (List<Kebeles>)q.list()) {
				map.put(kebeles.getPrimaryKeyObj(), kebeles);

				cacheResult(kebeles);

				uncachedPrimaryKeys.remove(kebeles.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(KebelesModelImpl.ENTITY_CACHE_ENABLED,
					KebelesImpl.class, primaryKey, nullModel);
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
	 * Returns all the kebeleses.
	 *
	 * @return the kebeleses
	 */
	@Override
	public List<Kebeles> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the kebeleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @return the range of kebeleses
	 */
	@Override
	public List<Kebeles> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the kebeleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of kebeleses
	 */
	@Override
	public List<Kebeles> findAll(int start, int end,
		OrderByComparator<Kebeles> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the kebeleses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link KebelesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of kebeleses
	 * @param end the upper bound of the range of kebeleses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of kebeleses
	 */
	@Override
	public List<Kebeles> findAll(int start, int end,
		OrderByComparator<Kebeles> orderByComparator, boolean retrieveFromCache) {
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

		List<Kebeles> list = null;

		if (retrieveFromCache) {
			list = (List<Kebeles>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_KEBELES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_KEBELES;

				if (pagination) {
					sql = sql.concat(KebelesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Kebeles>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the kebeleses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Kebeles kebeles : findAll()) {
			remove(kebeles);
		}
	}

	/**
	 * Returns the number of kebeleses.
	 *
	 * @return the number of kebeleses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_KEBELES);

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
		return KebelesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the kebeles persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(KebelesImpl.class.getName());
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
	private static final String _SQL_SELECT_KEBELES = "SELECT kebeles FROM Kebeles kebeles";
	private static final String _SQL_SELECT_KEBELES_WHERE_PKS_IN = "SELECT kebeles FROM Kebeles kebeles WHERE id_ IN (";
	private static final String _SQL_SELECT_KEBELES_WHERE = "SELECT kebeles FROM Kebeles kebeles WHERE ";
	private static final String _SQL_COUNT_KEBELES = "SELECT COUNT(kebeles) FROM Kebeles kebeles";
	private static final String _SQL_COUNT_KEBELES_WHERE = "SELECT COUNT(kebeles) FROM Kebeles kebeles WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "kebeles.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Kebeles exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Kebeles exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(KebelesPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
}