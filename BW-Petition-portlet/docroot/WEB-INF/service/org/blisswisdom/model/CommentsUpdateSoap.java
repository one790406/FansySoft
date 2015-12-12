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
public class CommentsUpdateSoap implements Serializable {
	public static CommentsUpdateSoap toSoapModel(CommentsUpdate model) {
		CommentsUpdateSoap soapModel = new CommentsUpdateSoap();

		soapModel.setCommentsUpdateId(model.getCommentsUpdateId());
		soapModel.setPetitionId(model.getPetitionId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCommentsType(model.getCommentsType());
		soapModel.setCommentsContent(model.getCommentsContent());
		soapModel.setUpdateTime(model.getUpdateTime());

		return soapModel;
	}

	public static CommentsUpdateSoap[] toSoapModels(CommentsUpdate[] models) {
		CommentsUpdateSoap[] soapModels = new CommentsUpdateSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CommentsUpdateSoap[][] toSoapModels(CommentsUpdate[][] models) {
		CommentsUpdateSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CommentsUpdateSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CommentsUpdateSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CommentsUpdateSoap[] toSoapModels(List<CommentsUpdate> models) {
		List<CommentsUpdateSoap> soapModels = new ArrayList<CommentsUpdateSoap>(models.size());

		for (CommentsUpdate model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CommentsUpdateSoap[soapModels.size()]);
	}

	public CommentsUpdateSoap() {
	}

	public long getPrimaryKey() {
		return _commentsUpdateId;
	}

	public void setPrimaryKey(long pk) {
		setCommentsUpdateId(pk);
	}

	public long getCommentsUpdateId() {
		return _commentsUpdateId;
	}

	public void setCommentsUpdateId(long commentsUpdateId) {
		_commentsUpdateId = commentsUpdateId;
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

	public String getCommentsType() {
		return _commentsType;
	}

	public void setCommentsType(String commentsType) {
		_commentsType = commentsType;
	}

	public String getCommentsContent() {
		return _commentsContent;
	}

	public void setCommentsContent(String commentsContent) {
		_commentsContent = commentsContent;
	}

	public Date getUpdateTime() {
		return _updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		_updateTime = updateTime;
	}

	private long _commentsUpdateId;
	private long _petitionId;
	private long _userId;
	private String _userName;
	private String _commentsType;
	private String _commentsContent;
	private Date _updateTime;
}