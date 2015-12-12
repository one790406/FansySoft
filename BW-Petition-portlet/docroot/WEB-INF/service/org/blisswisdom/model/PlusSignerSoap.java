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
public class PlusSignerSoap implements Serializable {
	public static PlusSignerSoap toSoapModel(PlusSigner model) {
		PlusSignerSoap soapModel = new PlusSignerSoap();

		soapModel.setPlusSignerId(model.getPlusSignerId());
		soapModel.setPetitionId(model.getPetitionId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setSignerId(model.getSignerId());
		soapModel.setSignerName(model.getSignerName());
		soapModel.setSignerType(model.getSignerType());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static PlusSignerSoap[] toSoapModels(PlusSigner[] models) {
		PlusSignerSoap[] soapModels = new PlusSignerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PlusSignerSoap[][] toSoapModels(PlusSigner[][] models) {
		PlusSignerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PlusSignerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PlusSignerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PlusSignerSoap[] toSoapModels(List<PlusSigner> models) {
		List<PlusSignerSoap> soapModels = new ArrayList<PlusSignerSoap>(models.size());

		for (PlusSigner model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PlusSignerSoap[soapModels.size()]);
	}

	public PlusSignerSoap() {
	}

	public long getPrimaryKey() {
		return _plusSignerId;
	}

	public void setPrimaryKey(long pk) {
		setPlusSignerId(pk);
	}

	public long getPlusSignerId() {
		return _plusSignerId;
	}

	public void setPlusSignerId(long plusSignerId) {
		_plusSignerId = plusSignerId;
	}

	public long getPetitionId() {
		return _petitionId;
	}

	public void setPetitionId(long petitionId) {
		_petitionId = petitionId;
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

	public long getSignerId() {
		return _signerId;
	}

	public void setSignerId(long signerId) {
		_signerId = signerId;
	}

	public String getSignerName() {
		return _signerName;
	}

	public void setSignerName(String signerName) {
		_signerName = signerName;
	}

	public String getSignerType() {
		return _signerType;
	}

	public void setSignerType(String signerType) {
		_signerType = signerType;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _plusSignerId;
	private long _petitionId;
	private long _userId;
	private String _userName;
	private long _signerId;
	private String _signerName;
	private String _signerType;
	private Date _createDate;
}