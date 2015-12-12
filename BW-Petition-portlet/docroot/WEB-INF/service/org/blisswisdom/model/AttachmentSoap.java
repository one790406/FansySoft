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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Danny
 * @generated
 */
public class AttachmentSoap implements Serializable {
	public static AttachmentSoap toSoapModel(Attachment model) {
		AttachmentSoap soapModel = new AttachmentSoap();

		soapModel.setAttachmentId(model.getAttachmentId());
		soapModel.setPetitionId(model.getPetitionId());
		soapModel.setUserId(model.getUserId());
		soapModel.setAttachmentEntryId(model.getAttachmentEntryId());
		soapModel.setAttachmentName(model.getAttachmentName());

		return soapModel;
	}

	public static AttachmentSoap[] toSoapModels(Attachment[] models) {
		AttachmentSoap[] soapModels = new AttachmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AttachmentSoap[][] toSoapModels(Attachment[][] models) {
		AttachmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AttachmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AttachmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AttachmentSoap[] toSoapModels(List<Attachment> models) {
		List<AttachmentSoap> soapModels = new ArrayList<AttachmentSoap>(models.size());

		for (Attachment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AttachmentSoap[soapModels.size()]);
	}

	public AttachmentSoap() {
	}

	public long getPrimaryKey() {
		return _attachmentId;
	}

	public void setPrimaryKey(long pk) {
		setAttachmentId(pk);
	}

	public long getAttachmentId() {
		return _attachmentId;
	}

	public void setAttachmentId(long attachmentId) {
		_attachmentId = attachmentId;
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

	public long getAttachmentEntryId() {
		return _attachmentEntryId;
	}

	public void setAttachmentEntryId(long attachmentEntryId) {
		_attachmentEntryId = attachmentEntryId;
	}

	public String getAttachmentName() {
		return _attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		_attachmentName = attachmentName;
	}

	private long _attachmentId;
	private long _petitionId;
	private long _userId;
	private long _attachmentEntryId;
	private String _attachmentName;
}