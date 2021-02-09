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

import IdentificationDatabase.model.RegistrationCitizen;

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
 * The cache model class for representing RegistrationCitizen in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationCitizen
 * @generated
 */
@ProviderType
public class RegistrationCitizenCacheModel implements CacheModel<RegistrationCitizen>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RegistrationCitizenCacheModel)) {
			return false;
		}

		RegistrationCitizenCacheModel registrationCitizenCacheModel = (RegistrationCitizenCacheModel)obj;

		if (id == registrationCitizenCacheModel.id) {
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
		StringBundler sb = new StringBundler(73);

		sb.append("{id=");
		sb.append(id);
		sb.append(", groupId=");
		sb.append(groupId);
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
		sb.append(", code=");
		sb.append(code);
		sb.append(", owner=");
		sb.append(owner);
		sb.append(", city=");
		sb.append(city);
		sb.append(", subCity=");
		sb.append(subCity);
		sb.append(", kebele=");
		sb.append(kebele);
		sb.append(", houseNo=");
		sb.append(houseNo);
		sb.append(", name=");
		sb.append(name);
		sb.append(", fatherName=");
		sb.append(fatherName);
		sb.append(", grandfatherName=");
		sb.append(grandfatherName);
		sb.append(", motherName=");
		sb.append(motherName);
		sb.append(", citizenship=");
		sb.append(citizenship);
		sb.append(", nation=");
		sb.append(nation);
		sb.append(", birthDate=");
		sb.append(birthDate);
		sb.append(", birthPlace=");
		sb.append(birthPlace);
		sb.append(", sex=");
		sb.append(sex);
		sb.append(", occupation=");
		sb.append(occupation);
		sb.append(", telephone=");
		sb.append(telephone);
		sb.append(", relation=");
		sb.append(relation);
		sb.append(", idType=");
		sb.append(idType);
		sb.append(", issueDate=");
		sb.append(issueDate);
		sb.append(", expireDate=");
		sb.append(expireDate);
		sb.append(", emergencyContactName=");
		sb.append(emergencyContactName);
		sb.append(", emergencyContacPhone=");
		sb.append(emergencyContacPhone);
		sb.append(", image=");
		sb.append(image);
		sb.append(", signature=");
		sb.append(signature);
		sb.append(", fingerprint=");
		sb.append(fingerprint);
		sb.append(", status=");
		sb.append(status);
		sb.append(", reciptNo=");
		sb.append(reciptNo);
		sb.append(", notice=");
		sb.append(notice);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RegistrationCitizen toEntityModel() {
		RegistrationCitizenImpl registrationCitizenImpl = new RegistrationCitizenImpl();

		registrationCitizenImpl.setId(id);
		registrationCitizenImpl.setGroupId(groupId);
		registrationCitizenImpl.setCompanyId(companyId);
		registrationCitizenImpl.setUserId(userId);

		if (userName == null) {
			registrationCitizenImpl.setUserName(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			registrationCitizenImpl.setCreateDate(null);
		}
		else {
			registrationCitizenImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			registrationCitizenImpl.setModifiedDate(null);
		}
		else {
			registrationCitizenImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (code == null) {
			registrationCitizenImpl.setCode(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setCode(code);
		}

		registrationCitizenImpl.setOwner(owner);

		if (city == null) {
			registrationCitizenImpl.setCity(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setCity(city);
		}

		if (subCity == null) {
			registrationCitizenImpl.setSubCity(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setSubCity(subCity);
		}

		if (kebele == null) {
			registrationCitizenImpl.setKebele(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setKebele(kebele);
		}

		if (houseNo == null) {
			registrationCitizenImpl.setHouseNo(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setHouseNo(houseNo);
		}

		if (name == null) {
			registrationCitizenImpl.setName(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setName(name);
		}

		if (fatherName == null) {
			registrationCitizenImpl.setFatherName(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setFatherName(fatherName);
		}

		if (grandfatherName == null) {
			registrationCitizenImpl.setGrandfatherName(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setGrandfatherName(grandfatherName);
		}

		if (motherName == null) {
			registrationCitizenImpl.setMotherName(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setMotherName(motherName);
		}

		if (citizenship == null) {
			registrationCitizenImpl.setCitizenship(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setCitizenship(citizenship);
		}

		if (nation == null) {
			registrationCitizenImpl.setNation(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setNation(nation);
		}

		if (birthDate == Long.MIN_VALUE) {
			registrationCitizenImpl.setBirthDate(null);
		}
		else {
			registrationCitizenImpl.setBirthDate(new Date(birthDate));
		}

		if (birthPlace == null) {
			registrationCitizenImpl.setBirthPlace(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setBirthPlace(birthPlace);
		}

		if (sex == null) {
			registrationCitizenImpl.setSex(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setSex(sex);
		}

		if (occupation == null) {
			registrationCitizenImpl.setOccupation(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setOccupation(occupation);
		}

		if (telephone == null) {
			registrationCitizenImpl.setTelephone(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setTelephone(telephone);
		}

		if (relation == null) {
			registrationCitizenImpl.setRelation(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setRelation(relation);
		}

		if (idType == null) {
			registrationCitizenImpl.setIdType(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setIdType(idType);
		}

		if (issueDate == Long.MIN_VALUE) {
			registrationCitizenImpl.setIssueDate(null);
		}
		else {
			registrationCitizenImpl.setIssueDate(new Date(issueDate));
		}

		if (expireDate == Long.MIN_VALUE) {
			registrationCitizenImpl.setExpireDate(null);
		}
		else {
			registrationCitizenImpl.setExpireDate(new Date(expireDate));
		}

		if (emergencyContactName == null) {
			registrationCitizenImpl.setEmergencyContactName(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setEmergencyContactName(emergencyContactName);
		}

		if (emergencyContacPhone == null) {
			registrationCitizenImpl.setEmergencyContacPhone(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setEmergencyContacPhone(emergencyContacPhone);
		}

		if (image == null) {
			registrationCitizenImpl.setImage(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setImage(image);
		}

		if (signature == null) {
			registrationCitizenImpl.setSignature(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setSignature(signature);
		}

		if (fingerprint == null) {
			registrationCitizenImpl.setFingerprint(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setFingerprint(fingerprint);
		}

		registrationCitizenImpl.setStatus(status);

		if (reciptNo == null) {
			registrationCitizenImpl.setReciptNo(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setReciptNo(reciptNo);
		}

		if (notice == null) {
			registrationCitizenImpl.setNotice(StringPool.BLANK);
		}
		else {
			registrationCitizenImpl.setNotice(notice);
		}

		registrationCitizenImpl.resetOriginalValues();

		return registrationCitizenImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		code = objectInput.readUTF();

		owner = objectInput.readBoolean();
		city = objectInput.readUTF();
		subCity = objectInput.readUTF();
		kebele = objectInput.readUTF();
		houseNo = objectInput.readUTF();
		name = objectInput.readUTF();
		fatherName = objectInput.readUTF();
		grandfatherName = objectInput.readUTF();
		motherName = objectInput.readUTF();
		citizenship = objectInput.readUTF();
		nation = objectInput.readUTF();
		birthDate = objectInput.readLong();
		birthPlace = objectInput.readUTF();
		sex = objectInput.readUTF();
		occupation = objectInput.readUTF();
		telephone = objectInput.readUTF();
		relation = objectInput.readUTF();
		idType = objectInput.readUTF();
		issueDate = objectInput.readLong();
		expireDate = objectInput.readLong();
		emergencyContactName = objectInput.readUTF();
		emergencyContacPhone = objectInput.readUTF();
		image = objectInput.readUTF();
		signature = objectInput.readUTF();
		fingerprint = objectInput.readUTF();

		status = objectInput.readInt();
		reciptNo = objectInput.readUTF();
		notice = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(groupId);

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

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		objectOutput.writeBoolean(owner);

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (subCity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subCity);
		}

		if (kebele == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kebele);
		}

		if (houseNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(houseNo);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (fatherName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fatherName);
		}

		if (grandfatherName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(grandfatherName);
		}

		if (motherName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(motherName);
		}

		if (citizenship == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(citizenship);
		}

		if (nation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nation);
		}

		objectOutput.writeLong(birthDate);

		if (birthPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(birthPlace);
		}

		if (sex == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sex);
		}

		if (occupation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(occupation);
		}

		if (telephone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telephone);
		}

		if (relation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relation);
		}

		if (idType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(idType);
		}

		objectOutput.writeLong(issueDate);
		objectOutput.writeLong(expireDate);

		if (emergencyContactName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emergencyContactName);
		}

		if (emergencyContacPhone == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emergencyContacPhone);
		}

		if (image == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image);
		}

		if (signature == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(signature);
		}

		if (fingerprint == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fingerprint);
		}

		objectOutput.writeInt(status);

		if (reciptNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(reciptNo);
		}

		if (notice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(notice);
		}
	}

	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String code;
	public boolean owner;
	public String city;
	public String subCity;
	public String kebele;
	public String houseNo;
	public String name;
	public String fatherName;
	public String grandfatherName;
	public String motherName;
	public String citizenship;
	public String nation;
	public long birthDate;
	public String birthPlace;
	public String sex;
	public String occupation;
	public String telephone;
	public String relation;
	public String idType;
	public long issueDate;
	public long expireDate;
	public String emergencyContactName;
	public String emergencyContacPhone;
	public String image;
	public String signature;
	public String fingerprint;
	public int status;
	public String reciptNo;
	public String notice;
}