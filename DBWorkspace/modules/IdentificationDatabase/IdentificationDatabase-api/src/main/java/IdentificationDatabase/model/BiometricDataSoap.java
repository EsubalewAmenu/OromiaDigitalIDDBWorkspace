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

import java.sql.Blob;

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
public class BiometricDataSoap implements Serializable {
	public static BiometricDataSoap toSoapModel(BiometricData model) {
		BiometricDataSoap soapModel = new BiometricDataSoap();

		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCitizenId(model.getCitizenId());
		soapModel.setFingerType(model.getFingerType());
		soapModel.setFingerPrint(model.getFingerPrint());
		soapModel.setRemark(model.getRemark());

		return soapModel;
	}

	public static BiometricDataSoap[] toSoapModels(BiometricData[] models) {
		BiometricDataSoap[] soapModels = new BiometricDataSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static BiometricDataSoap[][] toSoapModels(BiometricData[][] models) {
		BiometricDataSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new BiometricDataSoap[models.length][models[0].length];
		}
		else {
			soapModels = new BiometricDataSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static BiometricDataSoap[] toSoapModels(List<BiometricData> models) {
		List<BiometricDataSoap> soapModels = new ArrayList<BiometricDataSoap>(models.size());

		for (BiometricData model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new BiometricDataSoap[soapModels.size()]);
	}

	public BiometricDataSoap() {
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

	public long getCitizenId() {
		return _citizenId;
	}

	public void setCitizenId(long citizenId) {
		_citizenId = citizenId;
	}

	public String getFingerType() {
		return _fingerType;
	}

	public void setFingerType(String fingerType) {
		_fingerType = fingerType;
	}

	public Blob getFingerPrint() {
		return _fingerPrint;
	}

	public void setFingerPrint(Blob fingerPrint) {
		_fingerPrint = fingerPrint;
	}

	public String getRemark() {
		return _Remark;
	}

	public void setRemark(String Remark) {
		_Remark = Remark;
	}

	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _citizenId;
	private String _fingerType;
	private Blob _fingerPrint;
	private String _Remark;
}