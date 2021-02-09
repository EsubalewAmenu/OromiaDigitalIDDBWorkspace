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
public class KebelesSoap implements Serializable {
	public static KebelesSoap toSoapModel(Kebeles model) {
		KebelesSoap soapModel = new KebelesSoap();

		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setKebeleOr(model.getKebeleOr());
		soapModel.setKebeleAm(model.getKebeleAm());
		soapModel.setSubcityOr(model.getSubcityOr());
		soapModel.setSubcityAm(model.getSubcityAm());
		soapModel.setPrintername(model.getPrintername());

		return soapModel;
	}

	public static KebelesSoap[] toSoapModels(Kebeles[] models) {
		KebelesSoap[] soapModels = new KebelesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static KebelesSoap[][] toSoapModels(Kebeles[][] models) {
		KebelesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new KebelesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new KebelesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static KebelesSoap[] toSoapModels(List<Kebeles> models) {
		List<KebelesSoap> soapModels = new ArrayList<KebelesSoap>(models.size());

		for (Kebeles model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new KebelesSoap[soapModels.size()]);
	}

	public KebelesSoap() {
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

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
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

	public String getKebeleOr() {
		return _kebeleOr;
	}

	public void setKebeleOr(String kebeleOr) {
		_kebeleOr = kebeleOr;
	}

	public String getKebeleAm() {
		return _kebeleAm;
	}

	public void setKebeleAm(String kebeleAm) {
		_kebeleAm = kebeleAm;
	}

	public String getSubcityOr() {
		return _subcityOr;
	}

	public void setSubcityOr(String subcityOr) {
		_subcityOr = subcityOr;
	}

	public String getSubcityAm() {
		return _subcityAm;
	}

	public void setSubcityAm(String subcityAm) {
		_subcityAm = subcityAm;
	}

	public String getPrintername() {
		return _printername;
	}

	public void setPrintername(String printername) {
		_printername = printername;
	}

	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _kebeleOr;
	private String _kebeleAm;
	private String _subcityOr;
	private String _subcityAm;
	private String _printername;
}