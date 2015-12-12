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

package org.blisswisdom.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.blisswisdom.NoSuchPetitionException;

import org.blisswisdom.model.Petition;
import org.blisswisdom.model.impl.PetitionImpl;
import org.blisswisdom.model.impl.PetitionModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the petition service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danny
 * @see PetitionPersistence
 * @see PetitionUtil
 * @generated
 */
public class PetitionPersistenceImpl extends BasePersistenceImpl<Petition>
	implements PetitionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PetitionUtil} to access the petition persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PetitionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, PetitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, PetitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, PetitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, PetitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			PetitionModelImpl.UUID_COLUMN_BITMASK |
			PetitionModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the petitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Petition> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the petitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of petitions
	 * @param end the upper bound of the range of petitions (not inclusive)
	 * @return the range of matching petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Petition> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the petitions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of petitions
	 * @param end the upper bound of the range of petitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Petition> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<Petition> list = (List<Petition>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Petition petition : list) {
				if (!Validator.equals(uuid, petition.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_PETITION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PetitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<Petition>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Petition>(list);
				}
				else {
					list = (List<Petition>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first petition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching petition
	 * @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchPetitionException, SystemException {
		Petition petition = fetchByUuid_First(uuid, orderByComparator);

		if (petition != null) {
			return petition;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPetitionException(msg.toString());
	}

	/**
	 * Returns the first petition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching petition, or <code>null</code> if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<Petition> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last petition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching petition
	 * @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchPetitionException, SystemException {
		Petition petition = fetchByUuid_Last(uuid, orderByComparator);

		if (petition != null) {
			return petition;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPetitionException(msg.toString());
	}

	/**
	 * Returns the last petition in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching petition, or <code>null</code> if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Petition> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the petitions before and after the current petition in the ordered set where uuid = &#63;.
	 *
	 * @param petitionId the primary key of the current petition
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next petition
	 * @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition[] findByUuid_PrevAndNext(long petitionId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchPetitionException, SystemException {
		Petition petition = findByPrimaryKey(petitionId);

		Session session = null;

		try {
			session = openSession();

			Petition[] array = new PetitionImpl[3];

			array[0] = getByUuid_PrevAndNext(session, petition, uuid,
					orderByComparator, true);

			array[1] = petition;

			array[2] = getByUuid_PrevAndNext(session, petition, uuid,
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

	protected Petition getByUuid_PrevAndNext(Session session,
		Petition petition, String uuid, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PETITION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
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
			query.append(PetitionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(petition);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Petition> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the petitions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (Petition petition : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(petition);
		}
	}

	/**
	 * Returns the number of petitions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PETITION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "petition.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "petition.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(petition.uuid IS NULL OR petition.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, PetitionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			PetitionModelImpl.UUID_COLUMN_BITMASK |
			PetitionModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the petition where uuid = &#63; and groupId = &#63; or throws a {@link org.blisswisdom.NoSuchPetitionException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching petition
	 * @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition findByUUID_G(String uuid, long groupId)
		throws NoSuchPetitionException, SystemException {
		Petition petition = fetchByUUID_G(uuid, groupId);

		if (petition == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPetitionException(msg.toString());
		}

		return petition;
	}

	/**
	 * Returns the petition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching petition, or <code>null</code> if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the petition where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching petition, or <code>null</code> if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof Petition) {
			Petition petition = (Petition)result;

			if (!Validator.equals(uuid, petition.getUuid()) ||
					(groupId != petition.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_PETITION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Petition> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					Petition petition = list.get(0);

					result = petition;

					cacheResult(petition);

					if ((petition.getUuid() == null) ||
							!petition.getUuid().equals(uuid) ||
							(petition.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, petition);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Petition)result;
		}
	}

	/**
	 * Removes the petition where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the petition that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition removeByUUID_G(String uuid, long groupId)
		throws NoSuchPetitionException, SystemException {
		Petition petition = findByUUID_G(uuid, groupId);

		return remove(petition);
	}

	/**
	 * Returns the number of petitions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PETITION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "petition.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "petition.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(petition.uuid IS NULL OR petition.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "petition.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, PetitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, PetitionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			PetitionModelImpl.UUID_COLUMN_BITMASK |
			PetitionModelImpl.COMPANYID_COLUMN_BITMASK |
			PetitionModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the petitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Petition> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the petitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of petitions
	 * @param end the upper bound of the range of petitions (not inclusive)
	 * @return the range of matching petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Petition> findByUuid_C(String uuid, long companyId, int start,
		int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the petitions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of petitions
	 * @param end the upper bound of the range of petitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Petition> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<Petition> list = (List<Petition>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Petition petition : list) {
				if (!Validator.equals(uuid, petition.getUuid()) ||
						(companyId != petition.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_PETITION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PetitionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<Petition>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Petition>(list);
				}
				else {
					list = (List<Petition>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first petition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching petition
	 * @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPetitionException, SystemException {
		Petition petition = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (petition != null) {
			return petition;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPetitionException(msg.toString());
	}

	/**
	 * Returns the first petition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching petition, or <code>null</code> if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Petition> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last petition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching petition
	 * @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchPetitionException, SystemException {
		Petition petition = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (petition != null) {
			return petition;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPetitionException(msg.toString());
	}

	/**
	 * Returns the last petition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching petition, or <code>null</code> if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Petition> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the petitions before and after the current petition in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param petitionId the primary key of the current petition
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next petition
	 * @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition[] findByUuid_C_PrevAndNext(long petitionId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchPetitionException, SystemException {
		Petition petition = findByPrimaryKey(petitionId);

		Session session = null;

		try {
			session = openSession();

			Petition[] array = new PetitionImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, petition, uuid,
					companyId, orderByComparator, true);

			array[1] = petition;

			array[2] = getByUuid_C_PrevAndNext(session, petition, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Petition getByUuid_C_PrevAndNext(Session session,
		Petition petition, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PETITION_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
			query.append(PetitionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(petition);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Petition> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the petitions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (Petition petition : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(petition);
		}
	}

	/**
	 * Returns the number of petitions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PETITION_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "petition.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "petition.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(petition.uuid IS NULL OR petition.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "petition.companyId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_PETITIONNUMBER = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, PetitionImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByPetitionNumber",
			new String[] { String.class.getName() },
			PetitionModelImpl.PETITIONNUMBER_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PETITIONNUMBER = new FinderPath(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPetitionNumber",
			new String[] { String.class.getName() });

	/**
	 * Returns the petition where petitionNumber = &#63; or throws a {@link org.blisswisdom.NoSuchPetitionException} if it could not be found.
	 *
	 * @param petitionNumber the petition number
	 * @return the matching petition
	 * @throws org.blisswisdom.NoSuchPetitionException if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition findByPetitionNumber(String petitionNumber)
		throws NoSuchPetitionException, SystemException {
		Petition petition = fetchByPetitionNumber(petitionNumber);

		if (petition == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("petitionNumber=");
			msg.append(petitionNumber);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchPetitionException(msg.toString());
		}

		return petition;
	}

	/**
	 * Returns the petition where petitionNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param petitionNumber the petition number
	 * @return the matching petition, or <code>null</code> if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition fetchByPetitionNumber(String petitionNumber)
		throws SystemException {
		return fetchByPetitionNumber(petitionNumber, true);
	}

	/**
	 * Returns the petition where petitionNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param petitionNumber the petition number
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching petition, or <code>null</code> if a matching petition could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition fetchByPetitionNumber(String petitionNumber,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { petitionNumber };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PETITIONNUMBER,
					finderArgs, this);
		}

		if (result instanceof Petition) {
			Petition petition = (Petition)result;

			if (!Validator.equals(petitionNumber, petition.getPetitionNumber())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_PETITION_WHERE);

			boolean bindPetitionNumber = false;

			if (petitionNumber == null) {
				query.append(_FINDER_COLUMN_PETITIONNUMBER_PETITIONNUMBER_1);
			}
			else if (petitionNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PETITIONNUMBER_PETITIONNUMBER_3);
			}
			else {
				bindPetitionNumber = true;

				query.append(_FINDER_COLUMN_PETITIONNUMBER_PETITIONNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPetitionNumber) {
					qPos.add(petitionNumber);
				}

				List<Petition> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PETITIONNUMBER,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"PetitionPersistenceImpl.fetchByPetitionNumber(String, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Petition petition = list.get(0);

					result = petition;

					cacheResult(petition);

					if ((petition.getPetitionNumber() == null) ||
							!petition.getPetitionNumber().equals(petitionNumber)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PETITIONNUMBER,
							finderArgs, petition);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PETITIONNUMBER,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Petition)result;
		}
	}

	/**
	 * Removes the petition where petitionNumber = &#63; from the database.
	 *
	 * @param petitionNumber the petition number
	 * @return the petition that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition removeByPetitionNumber(String petitionNumber)
		throws NoSuchPetitionException, SystemException {
		Petition petition = findByPetitionNumber(petitionNumber);

		return remove(petition);
	}

	/**
	 * Returns the number of petitions where petitionNumber = &#63;.
	 *
	 * @param petitionNumber the petition number
	 * @return the number of matching petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPetitionNumber(String petitionNumber)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PETITIONNUMBER;

		Object[] finderArgs = new Object[] { petitionNumber };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PETITION_WHERE);

			boolean bindPetitionNumber = false;

			if (petitionNumber == null) {
				query.append(_FINDER_COLUMN_PETITIONNUMBER_PETITIONNUMBER_1);
			}
			else if (petitionNumber.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_PETITIONNUMBER_PETITIONNUMBER_3);
			}
			else {
				bindPetitionNumber = true;

				query.append(_FINDER_COLUMN_PETITIONNUMBER_PETITIONNUMBER_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindPetitionNumber) {
					qPos.add(petitionNumber);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PETITIONNUMBER_PETITIONNUMBER_1 = "petition.petitionNumber IS NULL";
	private static final String _FINDER_COLUMN_PETITIONNUMBER_PETITIONNUMBER_2 = "petition.petitionNumber = ?";
	private static final String _FINDER_COLUMN_PETITIONNUMBER_PETITIONNUMBER_3 = "(petition.petitionNumber IS NULL OR petition.petitionNumber = '')";

	public PetitionPersistenceImpl() {
		setModelClass(Petition.class);
	}

	/**
	 * Caches the petition in the entity cache if it is enabled.
	 *
	 * @param petition the petition
	 */
	@Override
	public void cacheResult(Petition petition) {
		EntityCacheUtil.putResult(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionImpl.class, petition.getPrimaryKey(), petition);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { petition.getUuid(), petition.getGroupId() }, petition);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PETITIONNUMBER,
			new Object[] { petition.getPetitionNumber() }, petition);

		petition.resetOriginalValues();
	}

	/**
	 * Caches the petitions in the entity cache if it is enabled.
	 *
	 * @param petitions the petitions
	 */
	@Override
	public void cacheResult(List<Petition> petitions) {
		for (Petition petition : petitions) {
			if (EntityCacheUtil.getResult(
						PetitionModelImpl.ENTITY_CACHE_ENABLED,
						PetitionImpl.class, petition.getPrimaryKey()) == null) {
				cacheResult(petition);
			}
			else {
				petition.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all petitions.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PetitionImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PetitionImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the petition.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Petition petition) {
		EntityCacheUtil.removeResult(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionImpl.class, petition.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(petition);
	}

	@Override
	public void clearCache(List<Petition> petitions) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Petition petition : petitions) {
			EntityCacheUtil.removeResult(PetitionModelImpl.ENTITY_CACHE_ENABLED,
				PetitionImpl.class, petition.getPrimaryKey());

			clearUniqueFindersCache(petition);
		}
	}

	protected void cacheUniqueFindersCache(Petition petition) {
		if (petition.isNew()) {
			Object[] args = new Object[] {
					petition.getUuid(), petition.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				petition);

			args = new Object[] { petition.getPetitionNumber() };

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PETITIONNUMBER,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PETITIONNUMBER,
				args, petition);
		}
		else {
			PetitionModelImpl petitionModelImpl = (PetitionModelImpl)petition;

			if ((petitionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						petition.getUuid(), petition.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					petition);
			}

			if ((petitionModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_PETITIONNUMBER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { petition.getPetitionNumber() };

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PETITIONNUMBER,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PETITIONNUMBER,
					args, petition);
			}
		}
	}

	protected void clearUniqueFindersCache(Petition petition) {
		PetitionModelImpl petitionModelImpl = (PetitionModelImpl)petition;

		Object[] args = new Object[] { petition.getUuid(), petition.getGroupId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((petitionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					petitionModelImpl.getOriginalUuid(),
					petitionModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		args = new Object[] { petition.getPetitionNumber() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PETITIONNUMBER, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PETITIONNUMBER, args);

		if ((petitionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_PETITIONNUMBER.getColumnBitmask()) != 0) {
			args = new Object[] { petitionModelImpl.getOriginalPetitionNumber() };

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PETITIONNUMBER,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PETITIONNUMBER,
				args);
		}
	}

	/**
	 * Creates a new petition with the primary key. Does not add the petition to the database.
	 *
	 * @param petitionId the primary key for the new petition
	 * @return the new petition
	 */
	@Override
	public Petition create(long petitionId) {
		Petition petition = new PetitionImpl();

		petition.setNew(true);
		petition.setPrimaryKey(petitionId);

		String uuid = PortalUUIDUtil.generate();

		petition.setUuid(uuid);

		return petition;
	}

	/**
	 * Removes the petition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param petitionId the primary key of the petition
	 * @return the petition that was removed
	 * @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition remove(long petitionId)
		throws NoSuchPetitionException, SystemException {
		return remove((Serializable)petitionId);
	}

	/**
	 * Removes the petition with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the petition
	 * @return the petition that was removed
	 * @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition remove(Serializable primaryKey)
		throws NoSuchPetitionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Petition petition = (Petition)session.get(PetitionImpl.class,
					primaryKey);

			if (petition == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPetitionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(petition);
		}
		catch (NoSuchPetitionException nsee) {
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
	protected Petition removeImpl(Petition petition) throws SystemException {
		petition = toUnwrappedModel(petition);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(petition)) {
				petition = (Petition)session.get(PetitionImpl.class,
						petition.getPrimaryKeyObj());
			}

			if (petition != null) {
				session.delete(petition);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (petition != null) {
			clearCache(petition);
		}

		return petition;
	}

	@Override
	public Petition updateImpl(org.blisswisdom.model.Petition petition)
		throws SystemException {
		petition = toUnwrappedModel(petition);

		boolean isNew = petition.isNew();

		PetitionModelImpl petitionModelImpl = (PetitionModelImpl)petition;

		if (Validator.isNull(petition.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			petition.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (petition.isNew()) {
				session.save(petition);

				petition.setNew(false);
			}
			else {
				session.merge(petition);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PetitionModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((petitionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { petitionModelImpl.getOriginalUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { petitionModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((petitionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						petitionModelImpl.getOriginalUuid(),
						petitionModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						petitionModelImpl.getUuid(),
						petitionModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}
		}

		EntityCacheUtil.putResult(PetitionModelImpl.ENTITY_CACHE_ENABLED,
			PetitionImpl.class, petition.getPrimaryKey(), petition);

		clearUniqueFindersCache(petition);
		cacheUniqueFindersCache(petition);

		return petition;
	}

	protected Petition toUnwrappedModel(Petition petition) {
		if (petition instanceof PetitionImpl) {
			return petition;
		}

		PetitionImpl petitionImpl = new PetitionImpl();

		petitionImpl.setNew(petition.isNew());
		petitionImpl.setPrimaryKey(petition.getPrimaryKey());

		petitionImpl.setUuid(petition.getUuid());
		petitionImpl.setPetitionId(petition.getPetitionId());
		petitionImpl.setCompanyId(petition.getCompanyId());
		petitionImpl.setGroupId(petition.getGroupId());
		petitionImpl.setUserId(petition.getUserId());
		petitionImpl.setUserName(petition.getUserName());
		petitionImpl.setCreateDate(petition.getCreateDate());
		petitionImpl.setModifiedDate(petition.getModifiedDate());
		petitionImpl.setPetitionNumber(petition.getPetitionNumber());
		petitionImpl.setPublishDate(petition.getPublishDate());
		petitionImpl.setSignUnit(petition.getSignUnit());
		petitionImpl.setSigner(petition.getSigner());
		petitionImpl.setDesignee(petition.getDesignee());
		petitionImpl.setPlusSign(petition.getPlusSign());
		petitionImpl.setSubject(petition.getSubject());
		petitionImpl.setExplanation(petition.getExplanation());
		petitionImpl.setComments(petition.getComments());
		petitionImpl.setCommentsByMonk(petition.getCommentsByMonk());
		petitionImpl.setCommentsByManagement(petition.getCommentsByManagement());
		petitionImpl.setCommentsByCEO(petition.getCommentsByCEO());
		petitionImpl.setCommentsByAides(petition.getCommentsByAides());
		petitionImpl.setStatus(petition.getStatus());
		petitionImpl.setStatusByUserId(petition.getStatusByUserId());
		petitionImpl.setStatusByUserName(petition.getStatusByUserName());
		petitionImpl.setStatusDate(petition.getStatusDate());

		return petitionImpl;
	}

	/**
	 * Returns the petition with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the petition
	 * @return the petition
	 * @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPetitionException, SystemException {
		Petition petition = fetchByPrimaryKey(primaryKey);

		if (petition == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPetitionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return petition;
	}

	/**
	 * Returns the petition with the primary key or throws a {@link org.blisswisdom.NoSuchPetitionException} if it could not be found.
	 *
	 * @param petitionId the primary key of the petition
	 * @return the petition
	 * @throws org.blisswisdom.NoSuchPetitionException if a petition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition findByPrimaryKey(long petitionId)
		throws NoSuchPetitionException, SystemException {
		return findByPrimaryKey((Serializable)petitionId);
	}

	/**
	 * Returns the petition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the petition
	 * @return the petition, or <code>null</code> if a petition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Petition petition = (Petition)EntityCacheUtil.getResult(PetitionModelImpl.ENTITY_CACHE_ENABLED,
				PetitionImpl.class, primaryKey);

		if (petition == _nullPetition) {
			return null;
		}

		if (petition == null) {
			Session session = null;

			try {
				session = openSession();

				petition = (Petition)session.get(PetitionImpl.class, primaryKey);

				if (petition != null) {
					cacheResult(petition);
				}
				else {
					EntityCacheUtil.putResult(PetitionModelImpl.ENTITY_CACHE_ENABLED,
						PetitionImpl.class, primaryKey, _nullPetition);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PetitionModelImpl.ENTITY_CACHE_ENABLED,
					PetitionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return petition;
	}

	/**
	 * Returns the petition with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param petitionId the primary key of the petition
	 * @return the petition, or <code>null</code> if a petition with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Petition fetchByPrimaryKey(long petitionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)petitionId);
	}

	/**
	 * Returns all the petitions.
	 *
	 * @return the petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Petition> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the petitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of petitions
	 * @param end the upper bound of the range of petitions (not inclusive)
	 * @return the range of petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Petition> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the petitions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PetitionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of petitions
	 * @param end the upper bound of the range of petitions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Petition> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
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

		List<Petition> list = (List<Petition>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PETITION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PETITION;

				if (pagination) {
					sql = sql.concat(PetitionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Petition>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Petition>(list);
				}
				else {
					list = (List<Petition>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the petitions from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Petition petition : findAll()) {
			remove(petition);
		}
	}

	/**
	 * Returns the number of petitions.
	 *
	 * @return the number of petitions
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PETITION);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
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
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the petition persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.blisswisdom.model.Petition")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Petition>> listenersList = new ArrayList<ModelListener<Petition>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Petition>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(PetitionImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PETITION = "SELECT petition FROM Petition petition";
	private static final String _SQL_SELECT_PETITION_WHERE = "SELECT petition FROM Petition petition WHERE ";
	private static final String _SQL_COUNT_PETITION = "SELECT COUNT(petition) FROM Petition petition";
	private static final String _SQL_COUNT_PETITION_WHERE = "SELECT COUNT(petition) FROM Petition petition WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "petition.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Petition exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Petition exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PetitionPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static Petition _nullPetition = new PetitionImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Petition> toCacheModel() {
				return _nullPetitionCacheModel;
			}
		};

	private static CacheModel<Petition> _nullPetitionCacheModel = new CacheModel<Petition>() {
			@Override
			public Petition toEntityModel() {
				return _nullPetition;
			}
		};
}