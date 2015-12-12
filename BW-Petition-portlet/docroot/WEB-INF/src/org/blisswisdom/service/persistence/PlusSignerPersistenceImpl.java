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

import org.blisswisdom.NoSuchPlusSignerException;

import org.blisswisdom.model.PlusSigner;
import org.blisswisdom.model.impl.PlusSignerImpl;
import org.blisswisdom.model.impl.PlusSignerModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the plus signer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Danny
 * @see PlusSignerPersistence
 * @see PlusSignerUtil
 * @generated
 */
public class PlusSignerPersistenceImpl extends BasePersistenceImpl<PlusSigner>
	implements PlusSignerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PlusSignerUtil} to access the plus signer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PlusSignerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerModelImpl.FINDER_CACHE_ENABLED, PlusSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerModelImpl.FINDER_CACHE_ENABLED, PlusSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PETITIONID =
		new FinderPath(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerModelImpl.FINDER_CACHE_ENABLED, PlusSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPetitionId",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PETITIONID =
		new FinderPath(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerModelImpl.FINDER_CACHE_ENABLED, PlusSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPetitionId",
			new String[] { Long.class.getName() },
			PlusSignerModelImpl.PETITIONID_COLUMN_BITMASK |
			PlusSignerModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_PETITIONID = new FinderPath(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPetitionId",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the plus signers where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @return the matching plus signers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlusSigner> findByPetitionId(long petitionId)
		throws SystemException {
		return findByPetitionId(petitionId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the plus signers where petitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param petitionId the petition ID
	 * @param start the lower bound of the range of plus signers
	 * @param end the upper bound of the range of plus signers (not inclusive)
	 * @return the range of matching plus signers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlusSigner> findByPetitionId(long petitionId, int start, int end)
		throws SystemException {
		return findByPetitionId(petitionId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the plus signers where petitionId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param petitionId the petition ID
	 * @param start the lower bound of the range of plus signers
	 * @param end the upper bound of the range of plus signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plus signers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlusSigner> findByPetitionId(long petitionId, int start,
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

		List<PlusSigner> list = (List<PlusSigner>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PlusSigner plusSigner : list) {
				if ((petitionId != plusSigner.getPetitionId())) {
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

			query.append(_SQL_SELECT_PLUSSIGNER_WHERE);

			query.append(_FINDER_COLUMN_PETITIONID_PETITIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PlusSignerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(petitionId);

				if (!pagination) {
					list = (List<PlusSigner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PlusSigner>(list);
				}
				else {
					list = (List<PlusSigner>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first plus signer in the ordered set where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plus signer
	 * @throws org.blisswisdom.NoSuchPlusSignerException if a matching plus signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner findByPetitionId_First(long petitionId,
		OrderByComparator orderByComparator)
		throws NoSuchPlusSignerException, SystemException {
		PlusSigner plusSigner = fetchByPetitionId_First(petitionId,
				orderByComparator);

		if (plusSigner != null) {
			return plusSigner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("petitionId=");
		msg.append(petitionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPlusSignerException(msg.toString());
	}

	/**
	 * Returns the first plus signer in the ordered set where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plus signer, or <code>null</code> if a matching plus signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner fetchByPetitionId_First(long petitionId,
		OrderByComparator orderByComparator) throws SystemException {
		List<PlusSigner> list = findByPetitionId(petitionId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last plus signer in the ordered set where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plus signer
	 * @throws org.blisswisdom.NoSuchPlusSignerException if a matching plus signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner findByPetitionId_Last(long petitionId,
		OrderByComparator orderByComparator)
		throws NoSuchPlusSignerException, SystemException {
		PlusSigner plusSigner = fetchByPetitionId_Last(petitionId,
				orderByComparator);

		if (plusSigner != null) {
			return plusSigner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("petitionId=");
		msg.append(petitionId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPlusSignerException(msg.toString());
	}

	/**
	 * Returns the last plus signer in the ordered set where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plus signer, or <code>null</code> if a matching plus signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner fetchByPetitionId_Last(long petitionId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByPetitionId(petitionId);

		if (count == 0) {
			return null;
		}

		List<PlusSigner> list = findByPetitionId(petitionId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the plus signers before and after the current plus signer in the ordered set where petitionId = &#63;.
	 *
	 * @param plusSignerId the primary key of the current plus signer
	 * @param petitionId the petition ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plus signer
	 * @throws org.blisswisdom.NoSuchPlusSignerException if a plus signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner[] findByPetitionId_PrevAndNext(long plusSignerId,
		long petitionId, OrderByComparator orderByComparator)
		throws NoSuchPlusSignerException, SystemException {
		PlusSigner plusSigner = findByPrimaryKey(plusSignerId);

		Session session = null;

		try {
			session = openSession();

			PlusSigner[] array = new PlusSignerImpl[3];

			array[0] = getByPetitionId_PrevAndNext(session, plusSigner,
					petitionId, orderByComparator, true);

			array[1] = plusSigner;

			array[2] = getByPetitionId_PrevAndNext(session, plusSigner,
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

	protected PlusSigner getByPetitionId_PrevAndNext(Session session,
		PlusSigner plusSigner, long petitionId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PLUSSIGNER_WHERE);

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
			query.append(PlusSignerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(petitionId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(plusSigner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PlusSigner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the plus signers where petitionId = &#63; from the database.
	 *
	 * @param petitionId the petition ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByPetitionId(long petitionId) throws SystemException {
		for (PlusSigner plusSigner : findByPetitionId(petitionId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(plusSigner);
		}
	}

	/**
	 * Returns the number of plus signers where petitionId = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @return the number of matching plus signers
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

			query.append(_SQL_COUNT_PLUSSIGNER_WHERE);

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

	private static final String _FINDER_COLUMN_PETITIONID_PETITIONID_2 = "plusSigner.petitionId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S = new FinderPath(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerModelImpl.FINDER_CACHE_ENABLED, PlusSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByP_S",
			new String[] {
				Long.class.getName(), String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S = new FinderPath(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerModelImpl.FINDER_CACHE_ENABLED, PlusSignerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByP_S",
			new String[] { Long.class.getName(), String.class.getName() },
			PlusSignerModelImpl.PETITIONID_COLUMN_BITMASK |
			PlusSignerModelImpl.SIGNERTYPE_COLUMN_BITMASK |
			PlusSignerModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_P_S = new FinderPath(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByP_S",
			new String[] { Long.class.getName(), String.class.getName() });

	/**
	 * Returns all the plus signers where petitionId = &#63; and signerType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param signerType the signer type
	 * @return the matching plus signers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlusSigner> findByP_S(long petitionId, String signerType)
		throws SystemException {
		return findByP_S(petitionId, signerType, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the plus signers where petitionId = &#63; and signerType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param petitionId the petition ID
	 * @param signerType the signer type
	 * @param start the lower bound of the range of plus signers
	 * @param end the upper bound of the range of plus signers (not inclusive)
	 * @return the range of matching plus signers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlusSigner> findByP_S(long petitionId, String signerType,
		int start, int end) throws SystemException {
		return findByP_S(petitionId, signerType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the plus signers where petitionId = &#63; and signerType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param petitionId the petition ID
	 * @param signerType the signer type
	 * @param start the lower bound of the range of plus signers
	 * @param end the upper bound of the range of plus signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plus signers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlusSigner> findByP_S(long petitionId, String signerType,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S;
			finderArgs = new Object[] { petitionId, signerType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_P_S;
			finderArgs = new Object[] {
					petitionId, signerType,
					
					start, end, orderByComparator
				};
		}

		List<PlusSigner> list = (List<PlusSigner>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (PlusSigner plusSigner : list) {
				if ((petitionId != plusSigner.getPetitionId()) ||
						!Validator.equals(signerType, plusSigner.getSignerType())) {
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

			query.append(_SQL_SELECT_PLUSSIGNER_WHERE);

			query.append(_FINDER_COLUMN_P_S_PETITIONID_2);

			boolean bindSignerType = false;

			if (signerType == null) {
				query.append(_FINDER_COLUMN_P_S_SIGNERTYPE_1);
			}
			else if (signerType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_SIGNERTYPE_3);
			}
			else {
				bindSignerType = true;

				query.append(_FINDER_COLUMN_P_S_SIGNERTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PlusSignerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(petitionId);

				if (bindSignerType) {
					qPos.add(signerType);
				}

				if (!pagination) {
					list = (List<PlusSigner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PlusSigner>(list);
				}
				else {
					list = (List<PlusSigner>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first plus signer in the ordered set where petitionId = &#63; and signerType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param signerType the signer type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plus signer
	 * @throws org.blisswisdom.NoSuchPlusSignerException if a matching plus signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner findByP_S_First(long petitionId, String signerType,
		OrderByComparator orderByComparator)
		throws NoSuchPlusSignerException, SystemException {
		PlusSigner plusSigner = fetchByP_S_First(petitionId, signerType,
				orderByComparator);

		if (plusSigner != null) {
			return plusSigner;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("petitionId=");
		msg.append(petitionId);

		msg.append(", signerType=");
		msg.append(signerType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPlusSignerException(msg.toString());
	}

	/**
	 * Returns the first plus signer in the ordered set where petitionId = &#63; and signerType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param signerType the signer type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plus signer, or <code>null</code> if a matching plus signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner fetchByP_S_First(long petitionId, String signerType,
		OrderByComparator orderByComparator) throws SystemException {
		List<PlusSigner> list = findByP_S(petitionId, signerType, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last plus signer in the ordered set where petitionId = &#63; and signerType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param signerType the signer type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plus signer
	 * @throws org.blisswisdom.NoSuchPlusSignerException if a matching plus signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner findByP_S_Last(long petitionId, String signerType,
		OrderByComparator orderByComparator)
		throws NoSuchPlusSignerException, SystemException {
		PlusSigner plusSigner = fetchByP_S_Last(petitionId, signerType,
				orderByComparator);

		if (plusSigner != null) {
			return plusSigner;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("petitionId=");
		msg.append(petitionId);

		msg.append(", signerType=");
		msg.append(signerType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPlusSignerException(msg.toString());
	}

	/**
	 * Returns the last plus signer in the ordered set where petitionId = &#63; and signerType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param signerType the signer type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plus signer, or <code>null</code> if a matching plus signer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner fetchByP_S_Last(long petitionId, String signerType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByP_S(petitionId, signerType);

		if (count == 0) {
			return null;
		}

		List<PlusSigner> list = findByP_S(petitionId, signerType, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the plus signers before and after the current plus signer in the ordered set where petitionId = &#63; and signerType = &#63;.
	 *
	 * @param plusSignerId the primary key of the current plus signer
	 * @param petitionId the petition ID
	 * @param signerType the signer type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plus signer
	 * @throws org.blisswisdom.NoSuchPlusSignerException if a plus signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner[] findByP_S_PrevAndNext(long plusSignerId,
		long petitionId, String signerType, OrderByComparator orderByComparator)
		throws NoSuchPlusSignerException, SystemException {
		PlusSigner plusSigner = findByPrimaryKey(plusSignerId);

		Session session = null;

		try {
			session = openSession();

			PlusSigner[] array = new PlusSignerImpl[3];

			array[0] = getByP_S_PrevAndNext(session, plusSigner, petitionId,
					signerType, orderByComparator, true);

			array[1] = plusSigner;

			array[2] = getByP_S_PrevAndNext(session, plusSigner, petitionId,
					signerType, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PlusSigner getByP_S_PrevAndNext(Session session,
		PlusSigner plusSigner, long petitionId, String signerType,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PLUSSIGNER_WHERE);

		query.append(_FINDER_COLUMN_P_S_PETITIONID_2);

		boolean bindSignerType = false;

		if (signerType == null) {
			query.append(_FINDER_COLUMN_P_S_SIGNERTYPE_1);
		}
		else if (signerType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_P_S_SIGNERTYPE_3);
		}
		else {
			bindSignerType = true;

			query.append(_FINDER_COLUMN_P_S_SIGNERTYPE_2);
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
			query.append(PlusSignerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(petitionId);

		if (bindSignerType) {
			qPos.add(signerType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(plusSigner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PlusSigner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the plus signers where petitionId = &#63; and signerType = &#63; from the database.
	 *
	 * @param petitionId the petition ID
	 * @param signerType the signer type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByP_S(long petitionId, String signerType)
		throws SystemException {
		for (PlusSigner plusSigner : findByP_S(petitionId, signerType,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(plusSigner);
		}
	}

	/**
	 * Returns the number of plus signers where petitionId = &#63; and signerType = &#63;.
	 *
	 * @param petitionId the petition ID
	 * @param signerType the signer type
	 * @return the number of matching plus signers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByP_S(long petitionId, String signerType)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_P_S;

		Object[] finderArgs = new Object[] { petitionId, signerType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PLUSSIGNER_WHERE);

			query.append(_FINDER_COLUMN_P_S_PETITIONID_2);

			boolean bindSignerType = false;

			if (signerType == null) {
				query.append(_FINDER_COLUMN_P_S_SIGNERTYPE_1);
			}
			else if (signerType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_P_S_SIGNERTYPE_3);
			}
			else {
				bindSignerType = true;

				query.append(_FINDER_COLUMN_P_S_SIGNERTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(petitionId);

				if (bindSignerType) {
					qPos.add(signerType);
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

	private static final String _FINDER_COLUMN_P_S_PETITIONID_2 = "plusSigner.petitionId = ? AND ";
	private static final String _FINDER_COLUMN_P_S_SIGNERTYPE_1 = "plusSigner.signerType IS NULL";
	private static final String _FINDER_COLUMN_P_S_SIGNERTYPE_2 = "plusSigner.signerType = ?";
	private static final String _FINDER_COLUMN_P_S_SIGNERTYPE_3 = "(plusSigner.signerType IS NULL OR plusSigner.signerType = '')";

	public PlusSignerPersistenceImpl() {
		setModelClass(PlusSigner.class);
	}

	/**
	 * Caches the plus signer in the entity cache if it is enabled.
	 *
	 * @param plusSigner the plus signer
	 */
	@Override
	public void cacheResult(PlusSigner plusSigner) {
		EntityCacheUtil.putResult(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerImpl.class, plusSigner.getPrimaryKey(), plusSigner);

		plusSigner.resetOriginalValues();
	}

	/**
	 * Caches the plus signers in the entity cache if it is enabled.
	 *
	 * @param plusSigners the plus signers
	 */
	@Override
	public void cacheResult(List<PlusSigner> plusSigners) {
		for (PlusSigner plusSigner : plusSigners) {
			if (EntityCacheUtil.getResult(
						PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
						PlusSignerImpl.class, plusSigner.getPrimaryKey()) == null) {
				cacheResult(plusSigner);
			}
			else {
				plusSigner.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all plus signers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(PlusSignerImpl.class.getName());
		}

		EntityCacheUtil.clearCache(PlusSignerImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the plus signer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PlusSigner plusSigner) {
		EntityCacheUtil.removeResult(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerImpl.class, plusSigner.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PlusSigner> plusSigners) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PlusSigner plusSigner : plusSigners) {
			EntityCacheUtil.removeResult(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
				PlusSignerImpl.class, plusSigner.getPrimaryKey());
		}
	}

	/**
	 * Creates a new plus signer with the primary key. Does not add the plus signer to the database.
	 *
	 * @param plusSignerId the primary key for the new plus signer
	 * @return the new plus signer
	 */
	@Override
	public PlusSigner create(long plusSignerId) {
		PlusSigner plusSigner = new PlusSignerImpl();

		plusSigner.setNew(true);
		plusSigner.setPrimaryKey(plusSignerId);

		return plusSigner;
	}

	/**
	 * Removes the plus signer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param plusSignerId the primary key of the plus signer
	 * @return the plus signer that was removed
	 * @throws org.blisswisdom.NoSuchPlusSignerException if a plus signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner remove(long plusSignerId)
		throws NoSuchPlusSignerException, SystemException {
		return remove((Serializable)plusSignerId);
	}

	/**
	 * Removes the plus signer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the plus signer
	 * @return the plus signer that was removed
	 * @throws org.blisswisdom.NoSuchPlusSignerException if a plus signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner remove(Serializable primaryKey)
		throws NoSuchPlusSignerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			PlusSigner plusSigner = (PlusSigner)session.get(PlusSignerImpl.class,
					primaryKey);

			if (plusSigner == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPlusSignerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(plusSigner);
		}
		catch (NoSuchPlusSignerException nsee) {
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
	protected PlusSigner removeImpl(PlusSigner plusSigner)
		throws SystemException {
		plusSigner = toUnwrappedModel(plusSigner);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(plusSigner)) {
				plusSigner = (PlusSigner)session.get(PlusSignerImpl.class,
						plusSigner.getPrimaryKeyObj());
			}

			if (plusSigner != null) {
				session.delete(plusSigner);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (plusSigner != null) {
			clearCache(plusSigner);
		}

		return plusSigner;
	}

	@Override
	public PlusSigner updateImpl(org.blisswisdom.model.PlusSigner plusSigner)
		throws SystemException {
		plusSigner = toUnwrappedModel(plusSigner);

		boolean isNew = plusSigner.isNew();

		PlusSignerModelImpl plusSignerModelImpl = (PlusSignerModelImpl)plusSigner;

		Session session = null;

		try {
			session = openSession();

			if (plusSigner.isNew()) {
				session.save(plusSigner);

				plusSigner.setNew(false);
			}
			else {
				session.merge(plusSigner);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !PlusSignerModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((plusSignerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PETITIONID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						plusSignerModelImpl.getOriginalPetitionId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PETITIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PETITIONID,
					args);

				args = new Object[] { plusSignerModelImpl.getPetitionId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PETITIONID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PETITIONID,
					args);
			}

			if ((plusSignerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						plusSignerModelImpl.getOriginalPetitionId(),
						plusSignerModelImpl.getOriginalSignerType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_P_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S,
					args);

				args = new Object[] {
						plusSignerModelImpl.getPetitionId(),
						plusSignerModelImpl.getSignerType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_P_S, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_P_S,
					args);
			}
		}

		EntityCacheUtil.putResult(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
			PlusSignerImpl.class, plusSigner.getPrimaryKey(), plusSigner);

		return plusSigner;
	}

	protected PlusSigner toUnwrappedModel(PlusSigner plusSigner) {
		if (plusSigner instanceof PlusSignerImpl) {
			return plusSigner;
		}

		PlusSignerImpl plusSignerImpl = new PlusSignerImpl();

		plusSignerImpl.setNew(plusSigner.isNew());
		plusSignerImpl.setPrimaryKey(plusSigner.getPrimaryKey());

		plusSignerImpl.setPlusSignerId(plusSigner.getPlusSignerId());
		plusSignerImpl.setPetitionId(plusSigner.getPetitionId());
		plusSignerImpl.setUserId(plusSigner.getUserId());
		plusSignerImpl.setUserName(plusSigner.getUserName());
		plusSignerImpl.setSignerId(plusSigner.getSignerId());
		plusSignerImpl.setSignerName(plusSigner.getSignerName());
		plusSignerImpl.setSignerType(plusSigner.getSignerType());
		plusSignerImpl.setCreateDate(plusSigner.getCreateDate());

		return plusSignerImpl;
	}

	/**
	 * Returns the plus signer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the plus signer
	 * @return the plus signer
	 * @throws org.blisswisdom.NoSuchPlusSignerException if a plus signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPlusSignerException, SystemException {
		PlusSigner plusSigner = fetchByPrimaryKey(primaryKey);

		if (plusSigner == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPlusSignerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return plusSigner;
	}

	/**
	 * Returns the plus signer with the primary key or throws a {@link org.blisswisdom.NoSuchPlusSignerException} if it could not be found.
	 *
	 * @param plusSignerId the primary key of the plus signer
	 * @return the plus signer
	 * @throws org.blisswisdom.NoSuchPlusSignerException if a plus signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner findByPrimaryKey(long plusSignerId)
		throws NoSuchPlusSignerException, SystemException {
		return findByPrimaryKey((Serializable)plusSignerId);
	}

	/**
	 * Returns the plus signer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the plus signer
	 * @return the plus signer, or <code>null</code> if a plus signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		PlusSigner plusSigner = (PlusSigner)EntityCacheUtil.getResult(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
				PlusSignerImpl.class, primaryKey);

		if (plusSigner == _nullPlusSigner) {
			return null;
		}

		if (plusSigner == null) {
			Session session = null;

			try {
				session = openSession();

				plusSigner = (PlusSigner)session.get(PlusSignerImpl.class,
						primaryKey);

				if (plusSigner != null) {
					cacheResult(plusSigner);
				}
				else {
					EntityCacheUtil.putResult(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
						PlusSignerImpl.class, primaryKey, _nullPlusSigner);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(PlusSignerModelImpl.ENTITY_CACHE_ENABLED,
					PlusSignerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return plusSigner;
	}

	/**
	 * Returns the plus signer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param plusSignerId the primary key of the plus signer
	 * @return the plus signer, or <code>null</code> if a plus signer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PlusSigner fetchByPrimaryKey(long plusSignerId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)plusSignerId);
	}

	/**
	 * Returns all the plus signers.
	 *
	 * @return the plus signers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlusSigner> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the plus signers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plus signers
	 * @param end the upper bound of the range of plus signers (not inclusive)
	 * @return the range of plus signers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlusSigner> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the plus signers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.blisswisdom.model.impl.PlusSignerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of plus signers
	 * @param end the upper bound of the range of plus signers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of plus signers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PlusSigner> findAll(int start, int end,
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

		List<PlusSigner> list = (List<PlusSigner>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PLUSSIGNER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PLUSSIGNER;

				if (pagination) {
					sql = sql.concat(PlusSignerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PlusSigner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<PlusSigner>(list);
				}
				else {
					list = (List<PlusSigner>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the plus signers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (PlusSigner plusSigner : findAll()) {
			remove(plusSigner);
		}
	}

	/**
	 * Returns the number of plus signers.
	 *
	 * @return the number of plus signers
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

				Query q = session.createQuery(_SQL_COUNT_PLUSSIGNER);

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
	 * Initializes the plus signer persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.blisswisdom.model.PlusSigner")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<PlusSigner>> listenersList = new ArrayList<ModelListener<PlusSigner>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<PlusSigner>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(PlusSignerImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PLUSSIGNER = "SELECT plusSigner FROM PlusSigner plusSigner";
	private static final String _SQL_SELECT_PLUSSIGNER_WHERE = "SELECT plusSigner FROM PlusSigner plusSigner WHERE ";
	private static final String _SQL_COUNT_PLUSSIGNER = "SELECT COUNT(plusSigner) FROM PlusSigner plusSigner";
	private static final String _SQL_COUNT_PLUSSIGNER_WHERE = "SELECT COUNT(plusSigner) FROM PlusSigner plusSigner WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "plusSigner.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PlusSigner exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PlusSigner exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(PlusSignerPersistenceImpl.class);
	private static PlusSigner _nullPlusSigner = new PlusSignerImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<PlusSigner> toCacheModel() {
				return _nullPlusSignerCacheModel;
			}
		};

	private static CacheModel<PlusSigner> _nullPlusSignerCacheModel = new CacheModel<PlusSigner>() {
			@Override
			public PlusSigner toEntityModel() {
				return _nullPlusSigner;
			}
		};
}