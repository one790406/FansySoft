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
import java.util.List;

import org.blisswisdom.model.PlusSigner;
import org.blisswisdom.service.base.PlusSignerLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the plus signer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link org.blisswisdom.service.PlusSignerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Danny
 * @see org.blisswisdom.service.base.PlusSignerLocalServiceBaseImpl
 * @see org.blisswisdom.service.PlusSignerLocalServiceUtil
 */
public class PlusSignerLocalServiceImpl extends PlusSignerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * org.blisswisdom.service.PlusSignerLocalServiceUtil} to access the plus
	 * signer local service.
	 */

	public PlusSigner addPlusSigner(long petitionId, long userId,
			String userName, long signerId, String signerName, String signerType)
			throws SystemException {

		PlusSigner plusSigner = plusSignerPersistence
				.create(counterLocalService.increment());
		plusSigner.setPetitionId(petitionId);
		plusSigner.setUserId(userId);
		plusSigner.setUserName(userName);
		plusSigner.setSignerId(signerId);
		plusSigner.setSignerName(signerName);
		plusSigner.setSignerType(signerType);
		plusSigner.setCreateDate(new Date());

		return super.addPlusSigner(plusSigner);
	}

	public void removeByPetitionId(long petitionId) throws SystemException {
		plusSignerPersistence.removeByPetitionId(petitionId);
	}

	public List<PlusSigner> findByP_S(long petitionId, String signerType)
			throws SystemException {
		return plusSignerPersistence.findByP_S(petitionId, signerType);
	}

}
