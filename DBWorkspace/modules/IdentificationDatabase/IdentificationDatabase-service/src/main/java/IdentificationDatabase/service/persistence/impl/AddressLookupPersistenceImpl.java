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

import IdentificationDatabase.exception.NoSuchAddressLookupException;

import IdentificationDatabase.model.AddressLookup;

import IdentificationDatabase.model.impl.AddressLookupImpl;
import IdentificationDatabase.model.impl.AddressLookupModelImpl;

import IdentificationDatabase.service.persistence.AddressLookupPersistence;

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
 * The persistence implementation for the address lookup service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressLookupPersistence
 * @see IdentificationDatabase.service.persistence.AddressLookupUtil
 * @generated
 */
@ProviderType
public class AddressLookupPersistenceImpl extends BasePersistenceImpl<AddressLookup>
	implements AddressLookupPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AddressLookupUtil} to access the address lookup persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AddressLookupImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
			AddressLookupModelImpl.FINDER_CACHE_ENABLED,
			AddressLookupImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
			AddressLookupModelImpl.FINDER_CACHE_ENABLED,
			AddressLookupImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
			AddressLookupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STATUS = new FinderPath(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
			AddressLookupModelImpl.FINDER_CACHE_ENABLED,
			AddressLookupImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBystatus",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS =
		new FinderPath(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
			AddressLookupModelImpl.FINDER_CACHE_ENABLED,
			AddressLookupImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBystatus", new String[] { Integer.class.getName() },
			AddressLookupModelImpl.STATUS_COLUMN_BITMASK |
			AddressLookupModelImpl.CODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_STATUS = new FinderPath(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
			AddressLookupModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBystatus",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the address lookups where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching address lookups
	 */
	@Override
	public List<AddressLookup> findBystatus(int status) {
		return findBystatus(status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the address lookups where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of address lookups
	 * @param end the upper bound of the range of address lookups (not inclusive)
	 * @return the range of matching address lookups
	 */
	@Override
	public List<AddressLookup> findBystatus(int status, int start, int end) {
		return findBystatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the address lookups where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of address lookups
	 * @param end the upper bound of the range of address lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching address lookups
	 */
	@Override
	public List<AddressLookup> findBystatus(int status, int start, int end,
		OrderByComparator<AddressLookup> orderByComparator) {
		return findBystatus(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the address lookups where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of address lookups
	 * @param end the upper bound of the range of address lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching address lookups
	 */
	@Override
	public List<AddressLookup> findBystatus(int status, int start, int end,
		OrderByComparator<AddressLookup> orderByComparator,
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

		List<AddressLookup> list = null;

		if (retrieveFromCache) {
			list = (List<AddressLookup>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddressLookup addressLookup : list) {
					if ((status != addressLookup.getStatus())) {
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

			query.append(_SQL_SELECT_ADDRESSLOOKUP_WHERE);

			query.append(_FINDER_COLUMN_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AddressLookupModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(status);

				if (!pagination) {
					list = (List<AddressLookup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AddressLookup>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first address lookup in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching address lookup
	 * @throws NoSuchAddressLookupException if a matching address lookup could not be found
	 */
	@Override
	public AddressLookup findBystatus_First(int status,
		OrderByComparator<AddressLookup> orderByComparator)
		throws NoSuchAddressLookupException {
		AddressLookup addressLookup = fetchBystatus_First(status,
				orderByComparator);

		if (addressLookup != null) {
			return addressLookup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAddressLookupException(msg.toString());
	}

	/**
	 * Returns the first address lookup in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching address lookup, or <code>null</code> if a matching address lookup could not be found
	 */
	@Override
	public AddressLookup fetchBystatus_First(int status,
		OrderByComparator<AddressLookup> orderByComparator) {
		List<AddressLookup> list = findBystatus(status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last address lookup in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching address lookup
	 * @throws NoSuchAddressLookupException if a matching address lookup could not be found
	 */
	@Override
	public AddressLookup findBystatus_Last(int status,
		OrderByComparator<AddressLookup> orderByComparator)
		throws NoSuchAddressLookupException {
		AddressLookup addressLookup = fetchBystatus_Last(status,
				orderByComparator);

		if (addressLookup != null) {
			return addressLookup;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("status=");
		msg.append(status);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAddressLookupException(msg.toString());
	}

	/**
	 * Returns the last address lookup in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching address lookup, or <code>null</code> if a matching address lookup could not be found
	 */
	@Override
	public AddressLookup fetchBystatus_Last(int status,
		OrderByComparator<AddressLookup> orderByComparator) {
		int count = countBystatus(status);

		if (count == 0) {
			return null;
		}

		List<AddressLookup> list = findBystatus(status, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the address lookups before and after the current address lookup in the ordered set where status = &#63;.
	 *
	 * @param id the primary key of the current address lookup
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next address lookup
	 * @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	 */
	@Override
	public AddressLookup[] findBystatus_PrevAndNext(long id, int status,
		OrderByComparator<AddressLookup> orderByComparator)
		throws NoSuchAddressLookupException {
		AddressLookup addressLookup = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			AddressLookup[] array = new AddressLookupImpl[3];

			array[0] = getBystatus_PrevAndNext(session, addressLookup, status,
					orderByComparator, true);

			array[1] = addressLookup;

			array[2] = getBystatus_PrevAndNext(session, addressLookup, status,
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

	protected AddressLookup getBystatus_PrevAndNext(Session session,
		AddressLookup addressLookup, int status,
		OrderByComparator<AddressLookup> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ADDRESSLOOKUP_WHERE);

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
			query.append(AddressLookupModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(status);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(addressLookup);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AddressLookup> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the address lookups where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBystatus(int status) {
		for (AddressLookup addressLookup : findBystatus(status,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(addressLookup);
		}
	}

	/**
	 * Returns the number of address lookups where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching address lookups
	 */
	@Override
	public int countBystatus(int status) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_STATUS;

		Object[] finderArgs = new Object[] { status };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ADDRESSLOOKUP_WHERE);

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

	private static final String _FINDER_COLUMN_STATUS_STATUS_2 = "addressLookup.status = ?";

	public AddressLookupPersistenceImpl() {
		setModelClass(AddressLookup.class);

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
	 * Caches the address lookup in the entity cache if it is enabled.
	 *
	 * @param addressLookup the address lookup
	 */
	@Override
	public void cacheResult(AddressLookup addressLookup) {
		entityCache.putResult(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
			AddressLookupImpl.class, addressLookup.getPrimaryKey(),
			addressLookup);

		addressLookup.resetOriginalValues();
	}

	/**
	 * Caches the address lookups in the entity cache if it is enabled.
	 *
	 * @param addressLookups the address lookups
	 */
	@Override
	public void cacheResult(List<AddressLookup> addressLookups) {
		for (AddressLookup addressLookup : addressLookups) {
			if (entityCache.getResult(
						AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
						AddressLookupImpl.class, addressLookup.getPrimaryKey()) == null) {
				cacheResult(addressLookup);
			}
			else {
				addressLookup.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all address lookups.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddressLookupImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the address lookup.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddressLookup addressLookup) {
		entityCache.removeResult(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
			AddressLookupImpl.class, addressLookup.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AddressLookup> addressLookups) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AddressLookup addressLookup : addressLookups) {
			entityCache.removeResult(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
				AddressLookupImpl.class, addressLookup.getPrimaryKey());
		}
	}

	/**
	 * Creates a new address lookup with the primary key. Does not add the address lookup to the database.
	 *
	 * @param id the primary key for the new address lookup
	 * @return the new address lookup
	 */
	@Override
	public AddressLookup create(long id) {
		AddressLookup addressLookup = new AddressLookupImpl();

		addressLookup.setNew(true);
		addressLookup.setPrimaryKey(id);

		addressLookup.setCompanyId(companyProvider.getCompanyId());

		return addressLookup;
	}

	/**
	 * Removes the address lookup with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the address lookup
	 * @return the address lookup that was removed
	 * @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	 */
	@Override
	public AddressLookup remove(long id) throws NoSuchAddressLookupException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the address lookup with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the address lookup
	 * @return the address lookup that was removed
	 * @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	 */
	@Override
	public AddressLookup remove(Serializable primaryKey)
		throws NoSuchAddressLookupException {
		Session session = null;

		try {
			session = openSession();

			AddressLookup addressLookup = (AddressLookup)session.get(AddressLookupImpl.class,
					primaryKey);

			if (addressLookup == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddressLookupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(addressLookup);
		}
		catch (NoSuchAddressLookupException nsee) {
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
	protected AddressLookup removeImpl(AddressLookup addressLookup) {
		addressLookup = toUnwrappedModel(addressLookup);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addressLookup)) {
				addressLookup = (AddressLookup)session.get(AddressLookupImpl.class,
						addressLookup.getPrimaryKeyObj());
			}

			if (addressLookup != null) {
				session.delete(addressLookup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (addressLookup != null) {
			clearCache(addressLookup);
		}

		return addressLookup;
	}

	@Override
	public AddressLookup updateImpl(AddressLookup addressLookup) {
		addressLookup = toUnwrappedModel(addressLookup);

		boolean isNew = addressLookup.isNew();

		AddressLookupModelImpl addressLookupModelImpl = (AddressLookupModelImpl)addressLookup;

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (addressLookup.getCreateDate() == null)) {
			if (serviceContext == null) {
				addressLookup.setCreateDate(now);
			}
			else {
				addressLookup.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!addressLookupModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addressLookup.setModifiedDate(now);
			}
			else {
				addressLookup.setModifiedDate(serviceContext.getModifiedDate(
						now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (addressLookup.isNew()) {
				session.save(addressLookup);

				addressLookup.setNew(false);
			}
			else {
				addressLookup = (AddressLookup)session.merge(addressLookup);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!AddressLookupModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { addressLookupModelImpl.getStatus() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((addressLookupModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						addressLookupModelImpl.getOriginalStatus()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);

				args = new Object[] { addressLookupModelImpl.getStatus() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_STATUS, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STATUS,
					args);
			}
		}

		entityCache.putResult(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
			AddressLookupImpl.class, addressLookup.getPrimaryKey(),
			addressLookup, false);

		addressLookup.resetOriginalValues();

		return addressLookup;
	}

	protected AddressLookup toUnwrappedModel(AddressLookup addressLookup) {
		if (addressLookup instanceof AddressLookupImpl) {
			return addressLookup;
		}

		AddressLookupImpl addressLookupImpl = new AddressLookupImpl();

		addressLookupImpl.setNew(addressLookup.isNew());
		addressLookupImpl.setPrimaryKey(addressLookup.getPrimaryKey());

		addressLookupImpl.setId(addressLookup.getId());
		addressLookupImpl.setGroupId(addressLookup.getGroupId());
		addressLookupImpl.setCompanyId(addressLookup.getCompanyId());
		addressLookupImpl.setUserId(addressLookup.getUserId());
		addressLookupImpl.setUserName(addressLookup.getUserName());
		addressLookupImpl.setCreateDate(addressLookup.getCreateDate());
		addressLookupImpl.setModifiedDate(addressLookup.getModifiedDate());
		addressLookupImpl.setCode(addressLookup.getCode());
		addressLookupImpl.setOrganizationId(addressLookup.getOrganizationId());
		addressLookupImpl.setParentId(addressLookup.getParentId());
		addressLookupImpl.setName(addressLookup.getName());
		addressLookupImpl.setLevel(addressLookup.getLevel());
		addressLookupImpl.setDescription(addressLookup.getDescription());
		addressLookupImpl.setStatus(addressLookup.getStatus());

		return addressLookupImpl;
	}

	/**
	 * Returns the address lookup with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the address lookup
	 * @return the address lookup
	 * @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	 */
	@Override
	public AddressLookup findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddressLookupException {
		AddressLookup addressLookup = fetchByPrimaryKey(primaryKey);

		if (addressLookup == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddressLookupException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return addressLookup;
	}

	/**
	 * Returns the address lookup with the primary key or throws a {@link NoSuchAddressLookupException} if it could not be found.
	 *
	 * @param id the primary key of the address lookup
	 * @return the address lookup
	 * @throws NoSuchAddressLookupException if a address lookup with the primary key could not be found
	 */
	@Override
	public AddressLookup findByPrimaryKey(long id)
		throws NoSuchAddressLookupException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the address lookup with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the address lookup
	 * @return the address lookup, or <code>null</code> if a address lookup with the primary key could not be found
	 */
	@Override
	public AddressLookup fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
				AddressLookupImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AddressLookup addressLookup = (AddressLookup)serializable;

		if (addressLookup == null) {
			Session session = null;

			try {
				session = openSession();

				addressLookup = (AddressLookup)session.get(AddressLookupImpl.class,
						primaryKey);

				if (addressLookup != null) {
					cacheResult(addressLookup);
				}
				else {
					entityCache.putResult(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
						AddressLookupImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
					AddressLookupImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return addressLookup;
	}

	/**
	 * Returns the address lookup with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the address lookup
	 * @return the address lookup, or <code>null</code> if a address lookup with the primary key could not be found
	 */
	@Override
	public AddressLookup fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, AddressLookup> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AddressLookup> map = new HashMap<Serializable, AddressLookup>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AddressLookup addressLookup = fetchByPrimaryKey(primaryKey);

			if (addressLookup != null) {
				map.put(primaryKey, addressLookup);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
					AddressLookupImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AddressLookup)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ADDRESSLOOKUP_WHERE_PKS_IN);

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

			for (AddressLookup addressLookup : (List<AddressLookup>)q.list()) {
				map.put(addressLookup.getPrimaryKeyObj(), addressLookup);

				cacheResult(addressLookup);

				uncachedPrimaryKeys.remove(addressLookup.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AddressLookupModelImpl.ENTITY_CACHE_ENABLED,
					AddressLookupImpl.class, primaryKey, nullModel);
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
	 * Returns all the address lookups.
	 *
	 * @return the address lookups
	 */
	@Override
	public List<AddressLookup> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the address lookups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of address lookups
	 * @param end the upper bound of the range of address lookups (not inclusive)
	 * @return the range of address lookups
	 */
	@Override
	public List<AddressLookup> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the address lookups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of address lookups
	 * @param end the upper bound of the range of address lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of address lookups
	 */
	@Override
	public List<AddressLookup> findAll(int start, int end,
		OrderByComparator<AddressLookup> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the address lookups.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AddressLookupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of address lookups
	 * @param end the upper bound of the range of address lookups (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of address lookups
	 */
	@Override
	public List<AddressLookup> findAll(int start, int end,
		OrderByComparator<AddressLookup> orderByComparator,
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

		List<AddressLookup> list = null;

		if (retrieveFromCache) {
			list = (List<AddressLookup>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ADDRESSLOOKUP);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ADDRESSLOOKUP;

				if (pagination) {
					sql = sql.concat(AddressLookupModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AddressLookup>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AddressLookup>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the address lookups from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddressLookup addressLookup : findAll()) {
			remove(addressLookup);
		}
	}

	/**
	 * Returns the number of address lookups.
	 *
	 * @return the number of address lookups
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ADDRESSLOOKUP);

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
		return AddressLookupModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the address lookup persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AddressLookupImpl.class.getName());
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
	private static final String _SQL_SELECT_ADDRESSLOOKUP = "SELECT addressLookup FROM AddressLookup addressLookup";
	private static final String _SQL_SELECT_ADDRESSLOOKUP_WHERE_PKS_IN = "SELECT addressLookup FROM AddressLookup addressLookup WHERE id_ IN (";
	private static final String _SQL_SELECT_ADDRESSLOOKUP_WHERE = "SELECT addressLookup FROM AddressLookup addressLookup WHERE ";
	private static final String _SQL_COUNT_ADDRESSLOOKUP = "SELECT COUNT(addressLookup) FROM AddressLookup addressLookup";
	private static final String _SQL_COUNT_ADDRESSLOOKUP_WHERE = "SELECT COUNT(addressLookup) FROM AddressLookup addressLookup WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "addressLookup.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AddressLookup exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AddressLookup exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AddressLookupPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "code"
			});
}