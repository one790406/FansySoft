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
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.blisswisdom.NoSuchCommentsUpdateException;

import org.blisswisdom.model.CommentsUpdate;
import org.blisswisdom.model.impl.CommentsUpdateImpl;
import org.blisswisdom.model.impl.CommentsUpdateModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the comments update service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danny
 * @see CommentsUpdatePersistence
 * @see CommentsUpdateUtil
 * @generated
 */
public class CommentsUpdatePersistenceImpl extends BasePersistenceImpl<CommentsUpdate>
	implements CommentsUpdatePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CommentsUpdateUtil} to access the comments update persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CommentsUpdateImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateModelImpl.FINDER_CACHE_ENABLED,
			CommentsUpdateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateModelImpl.FINDER_CACHE_ENABLED,
			CommentsUpdateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PETITIONID =
		new FinderPath(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateModelImpl.FINDER_CACHE_ENABLED,
			CommentsUpdateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByPetitionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PETITIONID =
		new FinderPath(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateModelImpl.FINDER_CACHE_ENABLED,
			CommentsUpdateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPetitionId",
			new String[] { Long.class.getName() },
			CommentsUpdateModelImpl.PETITIONID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PETITIONID = new FinderPath(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPetitionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the comments updates where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @return the matching comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CommentsUpdate> findByPetitionId(long petitionId)
		throws SystemException {
		return findByPetitionId(petitionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the comments updates where petitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param petitionId the petition ID
	 * @param start the lower bound of the range of comments updates
	 * @param end the upper bound of the range of comments updates (not inclusive)
	 * @return the range of matching comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CommentsUpdate> findByPetitionId(long petitionId, int start,
		int end) throws SystemException {
		return findByPetitionId(petitionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the comments updates where petitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param petitionId the petition ID
	 * @param start the lower bound of the range of comments updates
	 * @param end the upper bound of the range of comments updates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CommentsUpdate> findByPetitionId(long petitionId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PETITIONID;
			finderArgs = new Object[] { petitionId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PETITIONID;
			finderArgs = new Object[] { petitionId, start, end, orderByComparator };
		}

		List<CommentsUpdate> list = (List<CommentsUpdate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CommentsUpdate commentsUpdate : list) {
				if ((petitionId != commentsUpdate.getPetitionId())) {
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

			query.append(_SQL_SELECT_COMMENTSUPDATE_WHERE);

			query.append(_FINDER_COLUMN_PETITIONID_PETITIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CommentsUpdateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(petitionId);

				if (!pagination) {
					list = (List<CommentsUpdate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CommentsUpdate>(list);
				}
				else {
					list = (List<CommentsUpdate>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first comments update in the ordered set where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comments update
	 * @throws org.blisswisdom.NoSuchCommentsUpdateException if a matching comments update could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate findByPetitionId_First(long petitionId,
		OrderByComparator orderByComparator)
		throws NoSuchCommentsUpdateException, SystemException {
		CommentsUpdate commentsUpdate = fetchByPetitionId_First(petitionId,
				orderByComparator);

		if (commentsUpdate != null) {
			return commentsUpdate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("petitionId=");
		msg.append(petitionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCommentsUpdateException(msg.toString());
	}

	/**
	 * Returns the first comments update in the ordered set where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comments update, or <code>null</code> if a matching comments update could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate fetchByPetitionId_First(long petitionId,
		OrderByComparator orderByComparator) throws SystemException {
		List<CommentsUpdate> list = findByPetitionId(petitionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last comments update in the ordered set where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comments update
	 * @throws org.blisswisdom.NoSuchCommentsUpdateException if a matching comments update could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate findByPetitionId_Last(long petitionId,
		OrderByComparator orderByComparator)
		throws NoSuchCommentsUpdateException, SystemException {
		CommentsUpdate commentsUpdate = fetchByPetitionId_Last(petitionId,
				orderByComparator);

		if (commentsUpdate != null) {
			return commentsUpdate;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("petitionId=");
		msg.append(petitionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCommentsUpdateException(msg.toString());
	}

	/**
	 * Returns the last comments update in the ordered set where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comments update, or <code>null</code> if a matching comments update could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate fetchByPetitionId_Last(long petitionId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPetitionId(petitionId);

		if (count == 0) {
			return null;
		}

		List<CommentsUpdate> list = findByPetitionId(petitionId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the comments updates before and after the current comments update in the ordered set where petitionId = &#63;.
	 *
	 * @param commentsUpdateId the primary key of the current comments update
	 * @param petitionId the petition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next comments update
	 * @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate[] findByPetitionId_PrevAndNext(
		long commentsUpdateId, long petitionId,
		OrderByComparator orderByComparator)
		throws NoSuchCommentsUpdateException, SystemException {
		CommentsUpdate commentsUpdate = findByPrimaryKey(commentsUpdateId);

		Session session = null;

		try {
			session = openSession();

			CommentsUpdate[] array = new CommentsUpdateImpl[3];

			array[0] = getByPetitionId_PrevAndNext(session, commentsUpdate,
					petitionId, orderByComparator, true);

			array[1] = commentsUpdate;

			array[2] = getByPetitionId_PrevAndNext(session, commentsUpdate,
					petitionId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CommentsUpdate getByPetitionId_PrevAndNext(Session session,
		CommentsUpdate commentsUpdate, long petitionId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMMENTSUPDATE_WHERE);

		query.append(_FINDER_COLUMN_PETITIONID_PETITIONID_2);

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
			query.append(CommentsUpdateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(petitionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(commentsUpdate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CommentsUpdate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the comments updates where petitionId = &#63; from the database.
	 *
	 * @param petitionId the petition ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPetitionId(long petitionId) throws SystemException {
		for (CommentsUpdate commentsUpdate : findByPetitionId(petitionId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(commentsUpdate);
		}
	}

	/**
	 * Returns the number of comments updates where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @return the number of matching comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByPetitionId(long petitionId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_PETITIONID;

		Object[] finderArgs = new Object[] { petitionId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_COMMENTSUPDATE_WHERE);

			query.append(_FINDER_COLUMN_PETITIONID_PETITIONID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(petitionId);

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

	private static final String _FINDER_COLUMN_PETITIONID_PETITIONID_2 = "commentsUpdate.petitionId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_C = new FinderPath(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateModelImpl.FINDER_CACHE_ENABLED,
			CommentsUpdateImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByP_C",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_C = new FinderPath(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateModelImpl.FINDER_CACHE_ENABLED,
			CommentsUpdateImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_C",
			new String[] { Long.class.getName(), String.class.getName() },
			CommentsUpdateModelImpl.PETITIONID_COLUMN_BITMASK |
			CommentsUpdateModelImpl.COMMENTSTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_C = new FinderPath(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_C",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the comments updates where petitionId = &#63; and commentsType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param commentsType the comments type
	 * @return the matching comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CommentsUpdate> findByP_C(long petitionId, String commentsType)
		throws SystemException {
		return findByP_C(petitionId, commentsType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the comments updates where petitionId = &#63; and commentsType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param petitionId the petition ID
	 * @param commentsType the comments type
	 * @param start the lower bound of the range of comments updates
	 * @param end the upper bound of the range of comments updates (not inclusive)
	 * @return the range of matching comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CommentsUpdate> findByP_C(long petitionId, String commentsType,
		int start, int end) throws SystemException {
		return findByP_C(petitionId, commentsType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the comments updates where petitionId = &#63; and commentsType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param petitionId the petition ID
	 * @param commentsType the comments type
	 * @param start the lower bound of the range of comments updates
	 * @param end the upper bound of the range of comments updates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CommentsUpdate> findByP_C(long petitionId, String commentsType,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_C;
			finderArgs = new Object[] { petitionId, commentsType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_C;
			finderArgs = new Object[] {
					petitionId, commentsType,
					
					start, end, orderByComparator
				};
		}

		List<CommentsUpdate> list = (List<CommentsUpdate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (CommentsUpdate commentsUpdate : list) {
				if ((petitionId != commentsUpdate.getPetitionId()) ||
						!Validator.equals(commentsType,
							commentsUpdate.getCommentsType())) {
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

			query.append(_SQL_SELECT_COMMENTSUPDATE_WHERE);

			query.append(_FINDER_COLUMN_P_C_PETITIONID_2);

			boolean bindCommentsType = false;

			if (commentsType == null) {
				query.append(_FINDER_COLUMN_P_C_COMMENTSTYPE_1);
			}
			else if (commentsType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_C_COMMENTSTYPE_3);
			}
			else {
				bindCommentsType = true;

				query.append(_FINDER_COLUMN_P_C_COMMENTSTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CommentsUpdateModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(petitionId);

				if (bindCommentsType) {
					qPos.add(commentsType);
				}

				if (!pagination) {
					list = (List<CommentsUpdate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CommentsUpdate>(list);
				}
				else {
					list = (List<CommentsUpdate>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Returns the first comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param commentsType the comments type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comments update
	 * @throws org.blisswisdom.NoSuchCommentsUpdateException if a matching comments update could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate findByP_C_First(long petitionId, String commentsType,
		OrderByComparator orderByComparator)
		throws NoSuchCommentsUpdateException, SystemException {
		CommentsUpdate commentsUpdate = fetchByP_C_First(petitionId,
				commentsType, orderByComparator);

		if (commentsUpdate != null) {
			return commentsUpdate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("petitionId=");
		msg.append(petitionId);

		msg.append(", commentsType=");
		msg.append(commentsType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCommentsUpdateException(msg.toString());
	}

	/**
	 * Returns the first comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param commentsType the comments type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching comments update, or <code>null</code> if a matching comments update could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate fetchByP_C_First(long petitionId,
		String commentsType, OrderByComparator orderByComparator)
		throws SystemException {
		List<CommentsUpdate> list = findByP_C(petitionId, commentsType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param commentsType the comments type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comments update
	 * @throws org.blisswisdom.NoSuchCommentsUpdateException if a matching comments update could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate findByP_C_Last(long petitionId, String commentsType,
		OrderByComparator orderByComparator)
		throws NoSuchCommentsUpdateException, SystemException {
		CommentsUpdate commentsUpdate = fetchByP_C_Last(petitionId,
				commentsType, orderByComparator);

		if (commentsUpdate != null) {
			return commentsUpdate;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("petitionId=");
		msg.append(petitionId);

		msg.append(", commentsType=");
		msg.append(commentsType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCommentsUpdateException(msg.toString());
	}

	/**
	 * Returns the last comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param commentsType the comments type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching comments update, or <code>null</code> if a matching comments update could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate fetchByP_C_Last(long petitionId, String commentsType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByP_C(petitionId, commentsType);

		if (count == 0) {
			return null;
		}

		List<CommentsUpdate> list = findByP_C(petitionId, commentsType,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the comments updates before and after the current comments update in the ordered set where petitionId = &#63; and commentsType = &#63;.
	 *
	 * @param commentsUpdateId the primary key of the current comments update
	 * @param petitionId the petition ID
	 * @param commentsType the comments type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next comments update
	 * @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate[] findByP_C_PrevAndNext(long commentsUpdateId,
		long petitionId, String commentsType,
		OrderByComparator orderByComparator)
		throws NoSuchCommentsUpdateException, SystemException {
		CommentsUpdate commentsUpdate = findByPrimaryKey(commentsUpdateId);

		Session session = null;

		try {
			session = openSession();

			CommentsUpdate[] array = new CommentsUpdateImpl[3];

			array[0] = getByP_C_PrevAndNext(session, commentsUpdate,
					petitionId, commentsType, orderByComparator, true);

			array[1] = commentsUpdate;

			array[2] = getByP_C_PrevAndNext(session, commentsUpdate,
					petitionId, commentsType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CommentsUpdate getByP_C_PrevAndNext(Session session,
		CommentsUpdate commentsUpdate, long petitionId, String commentsType,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_COMMENTSUPDATE_WHERE);

		query.append(_FINDER_COLUMN_P_C_PETITIONID_2);

		boolean bindCommentsType = false;

		if (commentsType == null) {
			query.append(_FINDER_COLUMN_P_C_COMMENTSTYPE_1);
		}
		else if (commentsType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_C_COMMENTSTYPE_3);
		}
		else {
			bindCommentsType = true;

			query.append(_FINDER_COLUMN_P_C_COMMENTSTYPE_2);
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
			query.append(CommentsUpdateModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(petitionId);

		if (bindCommentsType) {
			qPos.add(commentsType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(commentsUpdate);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CommentsUpdate> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the comments updates where petitionId = &#63; and commentsType = &#63; from the database.
	 *
	 * @param petitionId the petition ID
	 * @param commentsType the comments type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByP_C(long petitionId, String commentsType)
		throws SystemException {
		for (CommentsUpdate commentsUpdate : findByP_C(petitionId,
				commentsType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(commentsUpdate);
		}
	}

	/**
	 * Returns the number of comments updates where petitionId = &#63; and commentsType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param commentsType the comments type
	 * @return the number of matching comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByP_C(long petitionId, String commentsType)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_C;

		Object[] finderArgs = new Object[] { petitionId, commentsType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_COMMENTSUPDATE_WHERE);

			query.append(_FINDER_COLUMN_P_C_PETITIONID_2);

			boolean bindCommentsType = false;

			if (commentsType == null) {
				query.append(_FINDER_COLUMN_P_C_COMMENTSTYPE_1);
			}
			else if (commentsType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_C_COMMENTSTYPE_3);
			}
			else {
				bindCommentsType = true;

				query.append(_FINDER_COLUMN_P_C_COMMENTSTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(petitionId);

				if (bindCommentsType) {
					qPos.add(commentsType);
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

	private static final String _FINDER_COLUMN_P_C_PETITIONID_2 = "commentsUpdate.petitionId = ? AND ";
	private static final String _FINDER_COLUMN_P_C_COMMENTSTYPE_1 = "commentsUpdate.commentsType IS NULL";
	private static final String _FINDER_COLUMN_P_C_COMMENTSTYPE_2 = "commentsUpdate.commentsType = ?";
	private static final String _FINDER_COLUMN_P_C_COMMENTSTYPE_3 = "(commentsUpdate.commentsType IS NULL OR commentsUpdate.commentsType = '')";

	public CommentsUpdatePersistenceImpl() {
		setModelClass(CommentsUpdate.class);
	}

	/**
	 * Caches the comments update in the entity cache if it is enabled.
	 *
	 * @param commentsUpdate the comments update
	 */
	@Override
	public void cacheResult(CommentsUpdate commentsUpdate) {
		EntityCacheUtil.putResult(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateImpl.class, commentsUpdate.getPrimaryKey(),
			commentsUpdate);

		commentsUpdate.resetOriginalValues();
	}

	/**
	 * Caches the comments updates in the entity cache if it is enabled.
	 *
	 * @param commentsUpdates the comments updates
	 */
	@Override
	public void cacheResult(List<CommentsUpdate> commentsUpdates) {
		for (CommentsUpdate commentsUpdate : commentsUpdates) {
			if (EntityCacheUtil.getResult(
						CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
						CommentsUpdateImpl.class, commentsUpdate.getPrimaryKey()) == null) {
				cacheResult(commentsUpdate);
			}
			else {
				commentsUpdate.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all comments updates.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CommentsUpdateImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CommentsUpdateImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the comments update.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CommentsUpdate commentsUpdate) {
		EntityCacheUtil.removeResult(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateImpl.class, commentsUpdate.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CommentsUpdate> commentsUpdates) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CommentsUpdate commentsUpdate : commentsUpdates) {
			EntityCacheUtil.removeResult(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
				CommentsUpdateImpl.class, commentsUpdate.getPrimaryKey());
		}
	}

	/**
	 * Creates a new comments update with the primary key. Does not add the comments update to the database.
	 *
	 * @param commentsUpdateId the primary key for the new comments update
	 * @return the new comments update
	 */
	@Override
	public CommentsUpdate create(long commentsUpdateId) {
		CommentsUpdate commentsUpdate = new CommentsUpdateImpl();

		commentsUpdate.setNew(true);
		commentsUpdate.setPrimaryKey(commentsUpdateId);

		return commentsUpdate;
	}

	/**
	 * Removes the comments update with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commentsUpdateId the primary key of the comments update
	 * @return the comments update that was removed
	 * @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate remove(long commentsUpdateId)
		throws NoSuchCommentsUpdateException, SystemException {
		return remove((Serializable)commentsUpdateId);
	}

	/**
	 * Removes the comments update with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the comments update
	 * @return the comments update that was removed
	 * @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate remove(Serializable primaryKey)
		throws NoSuchCommentsUpdateException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CommentsUpdate commentsUpdate = (CommentsUpdate)session.get(CommentsUpdateImpl.class,
					primaryKey);

			if (commentsUpdate == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCommentsUpdateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(commentsUpdate);
		}
		catch (NoSuchCommentsUpdateException nsee) {
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
	protected CommentsUpdate removeImpl(CommentsUpdate commentsUpdate)
		throws SystemException {
		commentsUpdate = toUnwrappedModel(commentsUpdate);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(commentsUpdate)) {
				commentsUpdate = (CommentsUpdate)session.get(CommentsUpdateImpl.class,
						commentsUpdate.getPrimaryKeyObj());
			}

			if (commentsUpdate != null) {
				session.delete(commentsUpdate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (commentsUpdate != null) {
			clearCache(commentsUpdate);
		}

		return commentsUpdate;
	}

	@Override
	public CommentsUpdate updateImpl(
		org.blisswisdom.model.CommentsUpdate commentsUpdate)
		throws SystemException {
		commentsUpdate = toUnwrappedModel(commentsUpdate);

		boolean isNew = commentsUpdate.isNew();

		CommentsUpdateModelImpl commentsUpdateModelImpl = (CommentsUpdateModelImpl)commentsUpdate;

		Session session = null;

		try {
			session = openSession();

			if (commentsUpdate.isNew()) {
				session.save(commentsUpdate);

				commentsUpdate.setNew(false);
			}
			else {
				session.merge(commentsUpdate);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CommentsUpdateModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((commentsUpdateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PETITIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						commentsUpdateModelImpl.getOriginalPetitionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PETITIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PETITIONID,
					args);

				args = new Object[] { commentsUpdateModelImpl.getPetitionId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PETITIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PETITIONID,
					args);
			}

			if ((commentsUpdateModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						commentsUpdateModelImpl.getOriginalPetitionId(),
						commentsUpdateModelImpl.getOriginalCommentsType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_P_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_C,
					args);

				args = new Object[] {
						commentsUpdateModelImpl.getPetitionId(),
						commentsUpdateModelImpl.getCommentsType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_P_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_C,
					args);
			}
		}

		EntityCacheUtil.putResult(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
			CommentsUpdateImpl.class, commentsUpdate.getPrimaryKey(),
			commentsUpdate);

		return commentsUpdate;
	}

	protected CommentsUpdate toUnwrappedModel(CommentsUpdate commentsUpdate) {
		if (commentsUpdate instanceof CommentsUpdateImpl) {
			return commentsUpdate;
		}

		CommentsUpdateImpl commentsUpdateImpl = new CommentsUpdateImpl();

		commentsUpdateImpl.setNew(commentsUpdate.isNew());
		commentsUpdateImpl.setPrimaryKey(commentsUpdate.getPrimaryKey());

		commentsUpdateImpl.setCommentsUpdateId(commentsUpdate.getCommentsUpdateId());
		commentsUpdateImpl.setPetitionId(commentsUpdate.getPetitionId());
		commentsUpdateImpl.setUserId(commentsUpdate.getUserId());
		commentsUpdateImpl.setUserName(commentsUpdate.getUserName());
		commentsUpdateImpl.setCommentsType(commentsUpdate.getCommentsType());
		commentsUpdateImpl.setCommentsContent(commentsUpdate.getCommentsContent());
		commentsUpdateImpl.setUpdateTime(commentsUpdate.getUpdateTime());

		return commentsUpdateImpl;
	}

	/**
	 * Returns the comments update with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the comments update
	 * @return the comments update
	 * @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCommentsUpdateException, SystemException {
		CommentsUpdate commentsUpdate = fetchByPrimaryKey(primaryKey);

		if (commentsUpdate == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCommentsUpdateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return commentsUpdate;
	}

	/**
	 * Returns the comments update with the primary key or throws a {@link org.blisswisdom.NoSuchCommentsUpdateException} if it could not be found.
	 *
	 * @param commentsUpdateId the primary key of the comments update
	 * @return the comments update
	 * @throws org.blisswisdom.NoSuchCommentsUpdateException if a comments update with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate findByPrimaryKey(long commentsUpdateId)
		throws NoSuchCommentsUpdateException, SystemException {
		return findByPrimaryKey((Serializable)commentsUpdateId);
	}

	/**
	 * Returns the comments update with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the comments update
	 * @return the comments update, or <code>null</code> if a comments update with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		CommentsUpdate commentsUpdate = (CommentsUpdate)EntityCacheUtil.getResult(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
				CommentsUpdateImpl.class, primaryKey);

		if (commentsUpdate == _nullCommentsUpdate) {
			return null;
		}

		if (commentsUpdate == null) {
			Session session = null;

			try {
				session = openSession();

				commentsUpdate = (CommentsUpdate)session.get(CommentsUpdateImpl.class,
						primaryKey);

				if (commentsUpdate != null) {
					cacheResult(commentsUpdate);
				}
				else {
					EntityCacheUtil.putResult(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
						CommentsUpdateImpl.class, primaryKey,
						_nullCommentsUpdate);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(CommentsUpdateModelImpl.ENTITY_CACHE_ENABLED,
					CommentsUpdateImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return commentsUpdate;
	}

	/**
	 * Returns the comments update with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param commentsUpdateId the primary key of the comments update
	 * @return the comments update, or <code>null</code> if a comments update with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CommentsUpdate fetchByPrimaryKey(long commentsUpdateId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)commentsUpdateId);
	}

	/**
	 * Returns all the comments updates.
	 *
	 * @return the comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CommentsUpdate> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the comments updates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of comments updates
	 * @param end the upper bound of the range of comments updates (not inclusive)
	 * @return the range of comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CommentsUpdate> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the comments updates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.CommentsUpdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of comments updates
	 * @param end the upper bound of the range of comments updates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of comments updates
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<CommentsUpdate> findAll(int start, int end,
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

		List<CommentsUpdate> list = (List<CommentsUpdate>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_COMMENTSUPDATE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_COMMENTSUPDATE;

				if (pagination) {
					sql = sql.concat(CommentsUpdateModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CommentsUpdate>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<CommentsUpdate>(list);
				}
				else {
					list = (List<CommentsUpdate>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the comments updates from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (CommentsUpdate commentsUpdate : findAll()) {
			remove(commentsUpdate);
		}
	}

	/**
	 * Returns the number of comments updates.
	 *
	 * @return the number of comments updates
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

				Query q = session.createQuery(_SQL_COUNT_COMMENTSUPDATE);

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

	/**
	 * Initializes the comments update persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.blisswisdom.model.CommentsUpdate")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CommentsUpdate>> listenersList = new ArrayList<ModelListener<CommentsUpdate>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CommentsUpdate>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CommentsUpdateImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_COMMENTSUPDATE = "SELECT commentsUpdate FROM CommentsUpdate commentsUpdate";
	private static final String _SQL_SELECT_COMMENTSUPDATE_WHERE = "SELECT commentsUpdate FROM CommentsUpdate commentsUpdate WHERE ";
	private static final String _SQL_COUNT_COMMENTSUPDATE = "SELECT COUNT(commentsUpdate) FROM CommentsUpdate commentsUpdate";
	private static final String _SQL_COUNT_COMMENTSUPDATE_WHERE = "SELECT COUNT(commentsUpdate) FROM CommentsUpdate commentsUpdate WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "commentsUpdate.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CommentsUpdate exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CommentsUpdate exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CommentsUpdatePersistenceImpl.class);
	private static CommentsUpdate _nullCommentsUpdate = new CommentsUpdateImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CommentsUpdate> toCacheModel() {
				return _nullCommentsUpdateCacheModel;
			}
		};

	private static CacheModel<CommentsUpdate> _nullCommentsUpdateCacheModel = new CacheModel<CommentsUpdate>() {
			@Override
			public CommentsUpdate toEntityModel() {
				return _nullCommentsUpdate;
			}
		};
}