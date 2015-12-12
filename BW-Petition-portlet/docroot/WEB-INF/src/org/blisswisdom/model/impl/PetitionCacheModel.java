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

package org.blisswisdom.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.blisswisdom.model.Petition;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Petition in entity cache.
 *
 * @author Danny
 * @see Petition
 * @generated
 */
public class PetitionCacheModel implements CacheModel<Petition>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", petitionId=");
		sb.append(petitionId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", petitionNumber=");
		sb.append(petitionNumber);
		sb.append(", publishDate=");
		sb.append(publishDate);
		sb.append(", signUnit=");
		sb.append(signUnit);
		sb.append(", signer=");
		sb.append(signer);
		sb.append(", designee=");
		sb.append(designee);
		sb.append(", plusSign=");
		sb.append(plusSign);
		sb.append(", subject=");
		sb.append(subject);
		sb.append(", explanation=");
		sb.append(explanation);
		sb.append(", comments=");
		sb.append(comments);
		sb.append(", commentsByMonk=");
		sb.append(commentsByMonk);
		sb.append(", commentsByManagement=");
		sb.append(commentsByManagement);
		sb.append(", commentsByCEO=");
		sb.append(commentsByCEO);
		sb.append(", commentsByAides=");
		sb.append(commentsByAides);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Petition toEntityModel() {
		PetitionImpl petitionImpl = new PetitionImpl();

		if (uuid == null) {
			petitionImpl.setUuid(StringPool.BLANK);
		}
		else {
			petitionImpl.setUuid(uuid);
		}

		petitionImpl.setPetitionId(petitionId);
		petitionImpl.setCompanyId(companyId);
		petitionImpl.setGroupId(groupId);
		petitionImpl.setUserId(userId);

		if (userName == null) {
			petitionImpl.setUserName(StringPool.BLANK);
		}
		else {
			petitionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			petitionImpl.setCreateDate(null);
		}
		else {
			petitionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			petitionImpl.setModifiedDate(null);
		}
		else {
			petitionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (petitionNumber == null) {
			petitionImpl.setPetitionNumber(StringPool.BLANK);
		}
		else {
			petitionImpl.setPetitionNumber(petitionNumber);
		}

		if (publishDate == Long.MIN_VALUE) {
			petitionImpl.setPublishDate(null);
		}
		else {
			petitionImpl.setPublishDate(new Date(publishDate));
		}

		if (signUnit == null) {
			petitionImpl.setSignUnit(StringPool.BLANK);
		}
		else {
			petitionImpl.setSignUnit(signUnit);
		}

		if (signer == null) {
			petitionImpl.setSigner(StringPool.BLANK);
		}
		else {
			petitionImpl.setSigner(signer);
		}

		if (designee == null) {
			petitionImpl.setDesignee(StringPool.BLANK);
		}
		else {
			petitionImpl.setDesignee(designee);
		}

		if (plusSign == null) {
			petitionImpl.setPlusSign(StringPool.BLANK);
		}
		else {
			petitionImpl.setPlusSign(plusSign);
		}

		if (subject == null) {
			petitionImpl.setSubject(StringPool.BLANK);
		}
		else {
			petitionImpl.setSubject(subject);
		}

		if (explanation == null) {
			petitionImpl.setExplanation(StringPool.BLANK);
		}
		else {
			petitionImpl.setExplanation(explanation);
		}

		if (comments == null) {
			petitionImpl.setComments(StringPool.BLANK);
		}
		else {
			petitionImpl.setComments(comments);
		}

		if (commentsByMonk == null) {
			petitionImpl.setCommentsByMonk(StringPool.BLANK);
		}
		else {
			petitionImpl.setCommentsByMonk(commentsByMonk);
		}

		if (commentsByManagement == null) {
			petitionImpl.setCommentsByManagement(StringPool.BLANK);
		}
		else {
			petitionImpl.setCommentsByManagement(commentsByManagement);
		}

		if (commentsByCEO == null) {
			petitionImpl.setCommentsByCEO(StringPool.BLANK);
		}
		else {
			petitionImpl.setCommentsByCEO(commentsByCEO);
		}

		if (commentsByAides == null) {
			petitionImpl.setCommentsByAides(StringPool.BLANK);
		}
		else {
			petitionImpl.setCommentsByAides(commentsByAides);
		}

		petitionImpl.setStatus(status);
		petitionImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			petitionImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			petitionImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			petitionImpl.setStatusDate(null);
		}
		else {
			petitionImpl.setStatusDate(new Date(statusDate));
		}

		petitionImpl.resetOriginalValues();

		return petitionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		petitionId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		petitionNumber = objectInput.readUTF();
		publishDate = objectInput.readLong();
		signUnit = objectInput.readUTF();
		signer = objectInput.readUTF();
		designee = objectInput.readUTF();
		plusSign = objectInput.readUTF();
		subject = objectInput.readUTF();
		explanation = objectInput.readUTF();
		comments = objectInput.readUTF();
		commentsByMonk = objectInput.readUTF();
		commentsByManagement = objectInput.readUTF();
		commentsByCEO = objectInput.readUTF();
		commentsByAides = objectInput.readUTF();
		status = objectInput.readInt();
		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(petitionId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (petitionNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(petitionNumber);
		}

		objectOutput.writeLong(publishDate);

		if (signUnit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signUnit);
		}

		if (signer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signer);
		}

		if (designee == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designee);
		}

		if (plusSign == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(plusSign);
		}

		if (subject == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subject);
		}

		if (explanation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(explanation);
		}

		if (comments == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(comments);
		}

		if (commentsByMonk == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commentsByMonk);
		}

		if (commentsByManagement == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commentsByManagement);
		}

		if (commentsByCEO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commentsByCEO);
		}

		if (commentsByAides == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(commentsByAides);
		}

		objectOutput.writeInt(status);
		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long petitionId;
	public long companyId;
	public long groupId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String petitionNumber;
	public long publishDate;
	public String signUnit;
	public String signer;
	public String designee;
	public String plusSign;
	public String subject;
	public String explanation;
	public String comments;
	public String commentsByMonk;
	public String commentsByManagement;
	public String commentsByCEO;
	public String commentsByAides;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
}