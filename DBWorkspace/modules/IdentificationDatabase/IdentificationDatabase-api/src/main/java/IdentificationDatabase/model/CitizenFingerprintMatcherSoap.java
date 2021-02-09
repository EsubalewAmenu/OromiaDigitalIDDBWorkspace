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

package IdentificationDatabase.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CitizenFingerprintMatcherSoap implements Serializable {
	public static CitizenFingerprintMatcherSoap toSoapModel(
		CitizenFingerprintMatcher model) {
		CitizenFingerprintMatcherSoap soapModel = new CitizenFingerprintMatcherSoap();

		soapModel.setId(model.getId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCitizenId(model.getCitizenId());
		soapModel.setCitizenIdSecond(model.getCitizenIdSecond());
		soapModel.setScore(model.getScore());
		soapModel.setStatus(model.getStatus());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static CitizenFingerprintMatcherSoap[] toSoapModels(
		CitizenFingerprintMatcher[] models) {
		CitizenFingerprintMatcherSoap[] soapModels = new CitizenFingerprintMatcherSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CitizenFingerprintMatcherSoap[][] toSoapModels(
		CitizenFingerprintMatcher[][] models) {
		CitizenFingerprintMatcherSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CitizenFingerprintMatcherSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CitizenFingerprintMatcherSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CitizenFingerprintMatcherSoap[] toSoapModels(
		List<CitizenFingerprintMatcher> models) {
		List<CitizenFingerprintMatcherSoap> soapModels = new ArrayList<CitizenFingerprintMatcherSoap>(models.size());

		for (CitizenFingerprintMatcher model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CitizenFingerprintMatcherSoap[soapModels.size()]);
	}

	public CitizenFingerprintMatcherSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
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

	public long getCitizenId() {
		return _citizenId;
	}

	public void setCitizenId(long citizenId) {
		_citizenId = citizenId;
	}

	public long getCitizenIdSecond() {
		return _citizenIdSecond;
	}

	public void setCitizenIdSecond(long citizenIdSecond) {
		_citizenIdSecond = citizenIdSecond;
	}

	public int getScore() {
		return _score;
	}

	public void setScore(int score) {
		_score = score;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private long _id;
	private Date _createDate;
	private Date _modifiedDate;
	private long _citizenId;
	private long _citizenIdSecond;
	private int _score;
	private int _status;
	private long _userId;
}