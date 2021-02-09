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
public class TransferToOtherCitySoap implements Serializable {
	public static TransferToOtherCitySoap toSoapModel(TransferToOtherCity model) {
		TransferToOtherCitySoap soapModel = new TransferToOtherCitySoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTocity(model.getTocity());
		soapModel.setFromcity(model.getFromcity());
		soapModel.setSubcity(model.getSubcity());
		soapModel.setKebele(model.getKebele());
		soapModel.setFullname(model.getFullname());
		soapModel.setMothername(model.getMothername());
		soapModel.setCitizenId(model.getCitizenId());
		soapModel.setBirthdate(model.getBirthdate());
		soapModel.setHouseNo(model.getHouseNo());
		soapModel.setIsOwner(model.getIsOwner());
		soapModel.setPhone(model.getPhone());
		soapModel.setReason(model.getReason());

		return soapModel;
	}

	public static TransferToOtherCitySoap[] toSoapModels(
		TransferToOtherCity[] models) {
		TransferToOtherCitySoap[] soapModels = new TransferToOtherCitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TransferToOtherCitySoap[][] toSoapModels(
		TransferToOtherCity[][] models) {
		TransferToOtherCitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TransferToOtherCitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new TransferToOtherCitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TransferToOtherCitySoap[] toSoapModels(
		List<TransferToOtherCity> models) {
		List<TransferToOtherCitySoap> soapModels = new ArrayList<TransferToOtherCitySoap>(models.size());

		for (TransferToOtherCity model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TransferToOtherCitySoap[soapModels.size()]);
	}

	public TransferToOtherCitySoap() {
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

	public String getTocity() {
		return _tocity;
	}

	public void setTocity(String tocity) {
		_tocity = tocity;
	}

	public String getFromcity() {
		return _fromcity;
	}

	public void setFromcity(String fromcity) {
		_fromcity = fromcity;
	}

	public String getSubcity() {
		return _subcity;
	}

	public void setSubcity(String subcity) {
		_subcity = subcity;
	}

	public String getKebele() {
		return _kebele;
	}

	public void setKebele(String kebele) {
		_kebele = kebele;
	}

	public String getFullname() {
		return _fullname;
	}

	public void setFullname(String fullname) {
		_fullname = fullname;
	}

	public String getMothername() {
		return _mothername;
	}

	public void setMothername(String mothername) {
		_mothername = mothername;
	}

	public long getCitizenId() {
		return _citizenId;
	}

	public void setCitizenId(long citizenId) {
		_citizenId = citizenId;
	}

	public Date getBirthdate() {
		return _birthdate;
	}

	public void setBirthdate(Date birthdate) {
		_birthdate = birthdate;
	}

	public String getHouseNo() {
		return _houseNo;
	}

	public void setHouseNo(String houseNo) {
		_houseNo = houseNo;
	}

	public String getIsOwner() {
		return _isOwner;
	}

	public void setIsOwner(String isOwner) {
		_isOwner = isOwner;
	}

	public String getPhone() {
		return _phone;
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public String getReason() {
		return _reason;
	}

	public void setReason(String reason) {
		_reason = reason;
	}

	private long _id;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tocity;
	private String _fromcity;
	private String _subcity;
	private String _kebele;
	private String _fullname;
	private String _mothername;
	private long _citizenId;
	private Date _birthdate;
	private String _houseNo;
	private String _isOwner;
	private String _phone;
	private String _reason;
}