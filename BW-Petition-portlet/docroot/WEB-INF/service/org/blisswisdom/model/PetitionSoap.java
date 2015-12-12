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

package org.blisswisdom.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Danny
 * @generated
 */
public class PetitionSoap implements Serializable {
	public static PetitionSoap toSoapModel(Petition model) {
		PetitionSoap soapModel = new PetitionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setPetitionId(model.getPetitionId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setPetitionNumber(model.getPetitionNumber());
		soapModel.setPublishDate(model.getPublishDate());
		soapModel.setSignUnit(model.getSignUnit());
		soapModel.setSigner(model.getSigner());
		soapModel.setDesignee(model.getDesignee());
		soapModel.setPlusSign(model.getPlusSign());
		soapModel.setSubject(model.getSubject());
		soapModel.setExplanation(model.getExplanation());
		soapModel.setComments(model.getComments());
		soapModel.setCommentsByMonk(model.getCommentsByMonk());
		soapModel.setCommentsByManagement(model.getCommentsByManagement());
		soapModel.setCommentsByCEO(model.getCommentsByCEO());
		soapModel.setCommentsByAides(model.getCommentsByAides());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static PetitionSoap[] toSoapModels(Petition[] models) {
		PetitionSoap[] soapModels = new PetitionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PetitionSoap[][] toSoapModels(Petition[][] models) {
		PetitionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PetitionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PetitionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PetitionSoap[] toSoapModels(List<Petition> models) {
		List<PetitionSoap> soapModels = new ArrayList<PetitionSoap>(models.size());

		for (Petition model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PetitionSoap[soapModels.size()]);
	}

	public PetitionSoap() {
	}

	public long getPrimaryKey() {
		return _petitionId;
	}

	public void setPrimaryKey(long pk) {
		setPetitionId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getPetitionId() {
		return _petitionId;
	}

	public void setPetitionId(long petitionId) {
		_petitionId = petitionId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getPetitionNumber() {
		return _petitionNumber;
	}

	public void setPetitionNumber(String petitionNumber) {
		_petitionNumber = petitionNumber;
	}

	public Date getPublishDate() {
		return _publishDate;
	}

	public void setPublishDate(Date publishDate) {
		_publishDate = publishDate;
	}

	public String getSignUnit() {
		return _signUnit;
	}

	public void setSignUnit(String signUnit) {
		_signUnit = signUnit;
	}

	public String getSigner() {
		return _signer;
	}

	public void setSigner(String signer) {
		_signer = signer;
	}

	public String getDesignee() {
		return _designee;
	}

	public void setDesignee(String designee) {
		_designee = designee;
	}

	public String getPlusSign() {
		return _plusSign;
	}

	public void setPlusSign(String plusSign) {
		_plusSign = plusSign;
	}

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public String getExplanation() {
		return _explanation;
	}

	public void setExplanation(String explanation) {
		_explanation = explanation;
	}

	public String getComments() {
		return _comments;
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	public String getCommentsByMonk() {
		return _commentsByMonk;
	}

	public void setCommentsByMonk(String commentsByMonk) {
		_commentsByMonk = commentsByMonk;
	}

	public String getCommentsByManagement() {
		return _commentsByManagement;
	}

	public void setCommentsByManagement(String commentsByManagement) {
		_commentsByManagement = commentsByManagement;
	}

	public String getCommentsByCEO() {
		return _commentsByCEO;
	}

	public void setCommentsByCEO(String commentsByCEO) {
		_commentsByCEO = commentsByCEO;
	}

	public String getCommentsByAides() {
		return _commentsByAides;
	}

	public void setCommentsByAides(String commentsByAides) {
		_commentsByAides = commentsByAides;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	private String _uuid;
	private long _petitionId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _petitionNumber;
	private Date _publishDate;
	private String _signUnit;
	private String _signer;
	private String _designee;
	private String _plusSign;
	private String _subject;
	private String _explanation;
	private String _comments;
	private String _commentsByMonk;
	private String _commentsByManagement;
	private String _commentsByCEO;
	private String _commentsByAides;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
}