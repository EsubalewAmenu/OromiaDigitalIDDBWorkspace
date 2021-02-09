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
public class RegistrationCitizenSoap implements Serializable {
	public static RegistrationCitizenSoap toSoapModel(RegistrationCitizen model) {
		RegistrationCitizenSoap soapModel = new RegistrationCitizenSoap();

		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCode(model.getCode());
		soapModel.setOwner(model.getOwner());
		soapModel.setCity(model.getCity());
		soapModel.setSubCity(model.getSubCity());
		soapModel.setKebele(model.getKebele());
		soapModel.setHouseNo(model.getHouseNo());
		soapModel.setName(model.getName());
		soapModel.setFatherName(model.getFatherName());
		soapModel.setGrandfatherName(model.getGrandfatherName());
		soapModel.setMotherName(model.getMotherName());
		soapModel.setCitizenship(model.getCitizenship());
		soapModel.setNation(model.getNation());
		soapModel.setBirthDate(model.getBirthDate());
		soapModel.setBirthPlace(model.getBirthPlace());
		soapModel.setSex(model.getSex());
		soapModel.setOccupation(model.getOccupation());
		soapModel.setTelephone(model.getTelephone());
		soapModel.setRelation(model.getRelation());
		soapModel.setIdType(model.getIdType());
		soapModel.setIssueDate(model.getIssueDate());
		soapModel.setExpireDate(model.getExpireDate());
		soapModel.setEmergencyContactName(model.getEmergencyContactName());
		soapModel.setEmergencyContacPhone(model.getEmergencyContacPhone());
		soapModel.setImage(model.getImage());
		soapModel.setSignature(model.getSignature());
		soapModel.setFingerprint(model.getFingerprint());
		soapModel.setStatus(model.getStatus());
		soapModel.setReciptNo(model.getReciptNo());
		soapModel.setNotice(model.getNotice());

		return soapModel;
	}

	public static RegistrationCitizenSoap[] toSoapModels(
		RegistrationCitizen[] models) {
		RegistrationCitizenSoap[] soapModels = new RegistrationCitizenSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegistrationCitizenSoap[][] toSoapModels(
		RegistrationCitizen[][] models) {
		RegistrationCitizenSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegistrationCitizenSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegistrationCitizenSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegistrationCitizenSoap[] toSoapModels(
		List<RegistrationCitizen> models) {
		List<RegistrationCitizenSoap> soapModels = new ArrayList<RegistrationCitizenSoap>(models.size());

		for (RegistrationCitizen model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegistrationCitizenSoap[soapModels.size()]);
	}

	public RegistrationCitizenSoap() {
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

	public String getCode() {
		return _code;
	}

	public void setCode(String code) {
		_code = code;
	}

	public boolean getOwner() {
		return _owner;
	}

	public boolean isOwner() {
		return _owner;
	}

	public void setOwner(boolean owner) {
		_owner = owner;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getSubCity() {
		return _subCity;
	}

	public void setSubCity(String subCity) {
		_subCity = subCity;
	}

	public String getKebele() {
		return _kebele;
	}

	public void setKebele(String kebele) {
		_kebele = kebele;
	}

	public String getHouseNo() {
		return _houseNo;
	}

	public void setHouseNo(String houseNo) {
		_houseNo = houseNo;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getFatherName() {
		return _fatherName;
	}

	public void setFatherName(String fatherName) {
		_fatherName = fatherName;
	}

	public String getGrandfatherName() {
		return _grandfatherName;
	}

	public void setGrandfatherName(String grandfatherName) {
		_grandfatherName = grandfatherName;
	}

	public String getMotherName() {
		return _motherName;
	}

	public void setMotherName(String motherName) {
		_motherName = motherName;
	}

	public String getCitizenship() {
		return _citizenship;
	}

	public void setCitizenship(String citizenship) {
		_citizenship = citizenship;
	}

	public String getNation() {
		return _nation;
	}

	public void setNation(String nation) {
		_nation = nation;
	}

	public Date getBirthDate() {
		return _birthDate;
	}

	public void setBirthDate(Date birthDate) {
		_birthDate = birthDate;
	}

	public String getBirthPlace() {
		return _birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		_birthPlace = birthPlace;
	}

	public String getSex() {
		return _sex;
	}

	public void setSex(String sex) {
		_sex = sex;
	}

	public String getOccupation() {
		return _occupation;
	}

	public void setOccupation(String occupation) {
		_occupation = occupation;
	}

	public String getTelephone() {
		return _telephone;
	}

	public void setTelephone(String telephone) {
		_telephone = telephone;
	}

	public String getRelation() {
		return _relation;
	}

	public void setRelation(String relation) {
		_relation = relation;
	}

	public String getIdType() {
		return _idType;
	}

	public void setIdType(String idType) {
		_idType = idType;
	}

	public Date getIssueDate() {
		return _issueDate;
	}

	public void setIssueDate(Date issueDate) {
		_issueDate = issueDate;
	}

	public Date getExpireDate() {
		return _expireDate;
	}

	public void setExpireDate(Date expireDate) {
		_expireDate = expireDate;
	}

	public String getEmergencyContactName() {
		return _emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		_emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContacPhone() {
		return _emergencyContacPhone;
	}

	public void setEmergencyContacPhone(String emergencyContacPhone) {
		_emergencyContacPhone = emergencyContacPhone;
	}

	public String getImage() {
		return _image;
	}

	public void setImage(String image) {
		_image = image;
	}

	public String getSignature() {
		return _signature;
	}

	public void setSignature(String signature) {
		_signature = signature;
	}

	public String getFingerprint() {
		return _fingerprint;
	}

	public void setFingerprint(String fingerprint) {
		_fingerprint = fingerprint;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public String getReciptNo() {
		return _reciptNo;
	}

	public void setReciptNo(String reciptNo) {
		_reciptNo = reciptNo;
	}

	public String getNotice() {
		return _notice;
	}

	public void setNotice(String notice) {
		_notice = notice;
	}

	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _code;
	private boolean _owner;
	private String _city;
	private String _subCity;
	private String _kebele;
	private String _houseNo;
	private String _name;
	private String _fatherName;
	private String _grandfatherName;
	private String _motherName;
	private String _citizenship;
	private String _nation;
	private Date _birthDate;
	private String _birthPlace;
	private String _sex;
	private String _occupation;
	private String _telephone;
	private String _relation;
	private String _idType;
	private Date _issueDate;
	private Date _expireDate;
	private String _emergencyContactName;
	private String _emergencyContacPhone;
	private String _image;
	private String _signature;
	private String _fingerprint;
	private int _status;
	private String _reciptNo;
	private String _notice;
}