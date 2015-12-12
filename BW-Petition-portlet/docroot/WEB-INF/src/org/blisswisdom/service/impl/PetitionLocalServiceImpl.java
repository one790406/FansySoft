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

package org.blisswisdom.service.impl;

import java.util.Date;

import org.blisswisdom.model.Petition;
import org.blisswisdom.service.base.PetitionLocalServiceBaseImpl;

import com.liferay.portal.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.WorkflowInstanceLinkLocalServiceUtil;

/**
 * The implementation of the petition local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.blisswisdom.service.PetitionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Danny
 * @see org.blisswisdom.service.base.PetitionLocalServiceBaseImpl
 * @see org.blisswisdom.service.PetitionLocalServiceUtil
 */
public class PetitionLocalServiceImpl extends PetitionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * org.blisswisdom.service.PetitionLocalServiceUtil} to access the petition
	 * local service.
	 */

	public Petition addPetition(long companyId, long groupId, long userId,
			String userName, Date createDate, Date modifiedDate,
			String petitionNumber, Date publishDate, String signUnit,
			String signer, String designee, String plusSign, String subject,
			String explanation, String comments, String commentsByMonk,
			String commentsByManagement, String commentsByCEO,
			String commentsByAides, ServiceContext serviceContext)
			throws SystemException, PortalException {

		Petition petition = petitionPersistence.create(counterLocalService
				.increment());

		petition.setCompanyId(companyId);
		petition.setGroupId(groupId);
		petition.setUserId(userId);
		petition.setUserName(userName);
		petition.setCreateDate(createDate);
		petition.setModifiedDate(modifiedDate);

		petition.setPetitionNumber(petitionNumber);
		petition.setPublishDate(publishDate);
		petition.setSignUnit(signUnit);
		petition.setSigner(signer);
		petition.setDesignee(designee);
		petition.setPlusSign(plusSign);
		petition.setSubject(subject);
		petition.setExplanation(explanation);

		petition.setComments(comments);
		petition.setCommentsByMonk(commentsByMonk);
		petition.setCommentsByManagement(commentsByManagement);
		petition.setCommentsByCEO(commentsByCEO);
		petition.setCommentsByAides(commentsByAides);

		addAssetResource(userId, petition, serviceContext);

		return super.addPetition(petition);
	}

	public Petition updatePetition(long petitionId, String petitionNumber,
			Date publishDate, String signUnit, String signer, String designee,
			String plusSign, String subject, String explanation,
			String comments, String commentsByMonk,
			String commentsByManagement, String commentsByCEO,
			String commentsByAides, ServiceContext serviceContext)
			throws SystemException, PortalException {

		Petition petition = petitionLocalService.getPetition(petitionId);
		petition.setPetitionNumber(petitionNumber);
		petition.setPublishDate(publishDate);
		petition.setSignUnit(signUnit);
		petition.setSigner(signer);
		petition.setDesignee(designee);
		petition.setPlusSign(plusSign);
		petition.setSubject(subject);
		petition.setExplanation(explanation);

		petition.setComments(comments);
		petition.setCommentsByMonk(commentsByMonk);
		petition.setCommentsByManagement(commentsByManagement);
		petition.setCommentsByCEO(commentsByCEO);
		petition.setCommentsByAides(commentsByAides);

		return super.updatePetition(petition);
	}

	public void removePetitionBatch(long[] petitionIds) {
		for (long petitionId : petitionIds) {
			try {
				Petition petition = petitionPersistence.remove(petitionId);

				WorkflowInstanceLinkLocalServiceUtil
						.deleteWorkflowInstanceLinks(petition.getCompanyId(),
								petition.getGroupId(),
								Petition.class.getName(), petitionId);
				
				plusSignerLocalService.removeByPetitionId(petitionId);
				commentsUpdateLocalService.removeByPetitionId(petitionId);

			} catch (Exception e) {
				_log.warn(e.getMessage());
			}
		}
	}

	/**
	 * Kaleo workflow updateStatus;
	 */
	public Petition updateStatus(long userId, long resourcePrimKey, int status,
			ServiceContext serviceContext) throws NoSuchUserException,
			SystemException {
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();

		Petition petition = null;
		try {
			petition = petitionLocalService.getPetition(resourcePrimKey);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		petition.setStatus(status);
		petition.setStatusByUserId(user.getUserId());
		petition.setStatusByUserName(user.getFullName());
		petition.setStatusDate(serviceContext.getModifiedDate(now));
		petitionLocalService.updatePetition(petition);

		// try {
		// if (status == WorkflowConstants.STATUS_APPROVED) {
		// assetEntryLocalService.updateVisible(Petition.class.getName(),
		// resourcePrimKey, true);
		// } else {
		// assetEntryLocalService.updateVisible(Petition.class.getName(),
		// resourcePrimKey, false);
		// }
		//
		// } catch (PortalException e) {
		// e.printStackTrace();
		// }
		return petition;
	}

	private void addAssetResource(long userId, Petition petition,
			ServiceContext serviceContext) throws PortalException, SystemException{

		// Asset
		assetEntryLocalService.updateEntry(userId, petition.getGroupId(),
				petition.getCreateDate(), petition.getModifiedDate(),
				Petition.class.getName(), petition.getPetitionId(),
				petition.getUuid(), 0, serviceContext.getAssetCategoryIds(),
				serviceContext.getAssetTagNames(), true, null, null, null,
				ContentTypes.TEXT_HTML, petition.getSubject(),
				petition.getSubject(), null, null, petition.getUuid(), 0, 0,
				null, false);

		// Resources
//		resourceLocalService.addResources(petition.getCompanyId(),
//				petition.getGroupId(), userId, Petition.class.getName(),
//				petition.getPetitionId(), false,
//				serviceContext.isAddGroupPermissions(),
//				serviceContext.isAddGuestPermissions());

//		resourceLocalService.addModelResources(petition.getCompanyId(),
//				petition.getGroupId(), userId, Petition.class.getName(),
//				petition.getPetitionId(), serviceContext.getGroupPermissions(),
//				serviceContext.getGuestPermissions());

		// Indexer
		// Indexer indexer = IndexerRegistryUtil.getIndexer(Petition.class);
//		Indexer indexer = IndexerRegistryUtil
//				.nullSafeGetIndexer(Petition.class);
//		indexer.reindex(petition);

	}

	private final static Log _log = LogFactoryUtil
			.getLog(PetitionLocalServiceImpl.class);

}