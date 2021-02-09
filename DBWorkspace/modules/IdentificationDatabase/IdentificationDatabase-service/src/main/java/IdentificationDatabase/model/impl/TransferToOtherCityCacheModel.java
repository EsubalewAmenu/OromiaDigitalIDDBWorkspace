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

package IdentificationDatabase.model.impl;

import IdentificationDatabase.model.TransferToOtherCity;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TransferToOtherCity in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TransferToOtherCity
 * @generated
 */
@ProviderType
public class TransferToOtherCityCacheModel implements CacheModel<TransferToOtherCity>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TransferToOtherCityCacheModel)) {
			return false;
		}

		TransferToOtherCityCacheModel transferToOtherCityCacheModel = (TransferToOtherCityCacheModel)obj;

		if (id == transferToOtherCityCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", tocity=");
		sb.append(tocity);
		sb.append(", fromcity=");
		sb.append(fromcity);
		sb.append(", subcity=");
		sb.append(subcity);
		sb.append(", kebele=");
		sb.append(kebele);
		sb.append(", fullname=");
		sb.append(fullname);
		sb.append(", mothername=");
		sb.append(mothername);
		sb.append(", citizenId=");
		sb.append(citizenId);
		sb.append(", birthdate=");
		sb.append(birthdate);
		sb.append(", houseNo=");
		sb.append(houseNo);
		sb.append(", isOwner=");
		sb.append(isOwner);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", reason=");
		sb.append(reason);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TransferToOtherCity toEntityModel() {
		TransferToOtherCityImpl transferToOtherCityImpl = new TransferToOtherCityImpl();

		transferToOtherCityImpl.setId(id);
		transferToOtherCityImpl.setCompanyId(companyId);
		transferToOtherCityImpl.setUserId(userId);

		if (userName == null) {
			transferToOtherCityImpl.setUserName(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			transferToOtherCityImpl.setCreateDate(null);
		}
		else {
			transferToOtherCityImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			transferToOtherCityImpl.setModifiedDate(null);
		}
		else {
			transferToOtherCityImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tocity == null) {
			transferToOtherCityImpl.setTocity(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setTocity(tocity);
		}

		if (fromcity == null) {
			transferToOtherCityImpl.setFromcity(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setFromcity(fromcity);
		}

		if (subcity == null) {
			transferToOtherCityImpl.setSubcity(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setSubcity(subcity);
		}

		if (kebele == null) {
			transferToOtherCityImpl.setKebele(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setKebele(kebele);
		}

		if (fullname == null) {
			transferToOtherCityImpl.setFullname(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setFullname(fullname);
		}

		if (mothername == null) {
			transferToOtherCityImpl.setMothername(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setMothername(mothername);
		}

		transferToOtherCityImpl.setCitizenId(citizenId);

		if (birthdate == Long.MIN_VALUE) {
			transferToOtherCityImpl.setBirthdate(null);
		}
		else {
			transferToOtherCityImpl.setBirthdate(new Date(birthdate));
		}

		if (houseNo == null) {
			transferToOtherCityImpl.setHouseNo(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setHouseNo(houseNo);
		}

		if (isOwner == null) {
			transferToOtherCityImpl.setIsOwner(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setIsOwner(isOwner);
		}

		if (phone == null) {
			transferToOtherCityImpl.setPhone(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setPhone(phone);
		}

		if (reason == null) {
			transferToOtherCityImpl.setReason(StringPool.BLANK);
		}
		else {
			transferToOtherCityImpl.setReason(reason);
		}

		transferToOtherCityImpl.resetOriginalValues();

		return transferToOtherCityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tocity = objectInput.readUTF();
		fromcity = objectInput.readUTF();
		subcity = objectInput.readUTF();
		kebele = objectInput.readUTF();
		fullname = objectInput.readUTF();
		mothername = objectInput.readUTF();

		citizenId = objectInput.readLong();
		birthdate = objectInput.readLong();
		houseNo = objectInput.readUTF();
		isOwner = objectInput.readUTF();
		phone = objectInput.readUTF();
		reason = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (tocity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tocity);
		}

		if (fromcity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fromcity);
		}

		if (subcity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subcity);
		}

		if (kebele == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kebele);
		}

		if (fullname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullname);
		}

		if (mothername == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mothername);
		}

		objectOutput.writeLong(citizenId);
		objectOutput.writeLong(birthdate);

		if (houseNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(houseNo);
		}

		if (isOwner == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(isOwner);
		}

		if (phone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phone);
		}

		if (reason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reason);
		}
	}

	public long id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tocity;
	public String fromcity;
	public String subcity;
	public String kebele;
	public String fullname;
	public String mothername;
	public long citizenId;
	public long birthdate;
	public String houseNo;
	public String isOwner;
	public String phone;
	public String reason;
}