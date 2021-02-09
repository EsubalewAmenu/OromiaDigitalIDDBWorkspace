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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link RegistrationCitizen}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationCitizen
 * @generated
 */
@ProviderType
public class RegistrationCitizenWrapper implements RegistrationCitizen,
	ModelWrapper<RegistrationCitizen> {
	public RegistrationCitizenWrapper(RegistrationCitizen registrationCitizen) {
		_registrationCitizen = registrationCitizen;
	}

	@Override
	public Class<?> getModelClass() {
		return RegistrationCitizen.class;
	}

	@Override
	public String getModelClassName() {
		return RegistrationCitizen.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("code", getCode());
		attributes.put("owner", getOwner());
		attributes.put("city", getCity());
		attributes.put("subCity", getSubCity());
		attributes.put("kebele", getKebele());
		attributes.put("houseNo", getHouseNo());
		attributes.put("name", getName());
		attributes.put("fatherName", getFatherName());
		attributes.put("grandfatherName", getGrandfatherName());
		attributes.put("motherName", getMotherName());
		attributes.put("citizenship", getCitizenship());
		attributes.put("nation", getNation());
		attributes.put("birthDate", getBirthDate());
		attributes.put("birthPlace", getBirthPlace());
		attributes.put("sex", getSex());
		attributes.put("occupation", getOccupation());
		attributes.put("telephone", getTelephone());
		attributes.put("relation", getRelation());
		attributes.put("idType", getIdType());
		attributes.put("issueDate", getIssueDate());
		attributes.put("expireDate", getExpireDate());
		attributes.put("emergencyContactName", getEmergencyContactName());
		attributes.put("emergencyContacPhone", getEmergencyContacPhone());
		attributes.put("image", getImage());
		attributes.put("signature", getSignature());
		attributes.put("fingerprint", getFingerprint());
		attributes.put("status", getStatus());
		attributes.put("reciptNo", getReciptNo());
		attributes.put("notice", getNotice());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		Boolean owner = (Boolean)attributes.get("owner");

		if (owner != null) {
			setOwner(owner);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String subCity = (String)attributes.get("subCity");

		if (subCity != null) {
			setSubCity(subCity);
		}

		String kebele = (String)attributes.get("kebele");

		if (kebele != null) {
			setKebele(kebele);
		}

		String houseNo = (String)attributes.get("houseNo");

		if (houseNo != null) {
			setHouseNo(houseNo);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String fatherName = (String)attributes.get("fatherName");

		if (fatherName != null) {
			setFatherName(fatherName);
		}

		String grandfatherName = (String)attributes.get("grandfatherName");

		if (grandfatherName != null) {
			setGrandfatherName(grandfatherName);
		}

		String motherName = (String)attributes.get("motherName");

		if (motherName != null) {
			setMotherName(motherName);
		}

		String citizenship = (String)attributes.get("citizenship");

		if (citizenship != null) {
			setCitizenship(citizenship);
		}

		String nation = (String)attributes.get("nation");

		if (nation != null) {
			setNation(nation);
		}

		Date birthDate = (Date)attributes.get("birthDate");

		if (birthDate != null) {
			setBirthDate(birthDate);
		}

		String birthPlace = (String)attributes.get("birthPlace");

		if (birthPlace != null) {
			setBirthPlace(birthPlace);
		}

		String sex = (String)attributes.get("sex");

		if (sex != null) {
			setSex(sex);
		}

		String occupation = (String)attributes.get("occupation");

		if (occupation != null) {
			setOccupation(occupation);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		String relation = (String)attributes.get("relation");

		if (relation != null) {
			setRelation(relation);
		}

		String idType = (String)attributes.get("idType");

		if (idType != null) {
			setIdType(idType);
		}

		Date issueDate = (Date)attributes.get("issueDate");

		if (issueDate != null) {
			setIssueDate(issueDate);
		}

		Date expireDate = (Date)attributes.get("expireDate");

		if (expireDate != null) {
			setExpireDate(expireDate);
		}

		String emergencyContactName = (String)attributes.get(
				"emergencyContactName");

		if (emergencyContactName != null) {
			setEmergencyContactName(emergencyContactName);
		}

		String emergencyContacPhone = (String)attributes.get(
				"emergencyContacPhone");

		if (emergencyContacPhone != null) {
			setEmergencyContacPhone(emergencyContacPhone);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		String signature = (String)attributes.get("signature");

		if (signature != null) {
			setSignature(signature);
		}

		String fingerprint = (String)attributes.get("fingerprint");

		if (fingerprint != null) {
			setFingerprint(fingerprint);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String reciptNo = (String)attributes.get("reciptNo");

		if (reciptNo != null) {
			setReciptNo(reciptNo);
		}

		String notice = (String)attributes.get("notice");

		if (notice != null) {
			setNotice(notice);
		}
	}

	@Override
	public IdentificationDatabase.model.RegistrationCitizen toEscapedModel() {
		return new RegistrationCitizenWrapper(_registrationCitizen.toEscapedModel());
	}

	@Override
	public IdentificationDatabase.model.RegistrationCitizen toUnescapedModel() {
		return new RegistrationCitizenWrapper(_registrationCitizen.toUnescapedModel());
	}

	/**
	* Returns the owner of this registration citizen.
	*
	* @return the owner of this registration citizen
	*/
	@Override
	public boolean getOwner() {
		return _registrationCitizen.getOwner();
	}

	@Override
	public boolean isCachedModel() {
		return _registrationCitizen.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _registrationCitizen.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _registrationCitizen.isNew();
	}

	/**
	* Returns <code>true</code> if this registration citizen is owner.
	*
	* @return <code>true</code> if this registration citizen is owner; <code>false</code> otherwise
	*/
	@Override
	public boolean isOwner() {
		return _registrationCitizen.isOwner();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _registrationCitizen.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<IdentificationDatabase.model.RegistrationCitizen> toCacheModel() {
		return _registrationCitizen.toCacheModel();
	}

	@Override
	public int compareTo(
		IdentificationDatabase.model.RegistrationCitizen registrationCitizen) {
		return _registrationCitizen.compareTo(registrationCitizen);
	}

	/**
	* Returns the status of this registration citizen.
	*
	* @return the status of this registration citizen
	*/
	@Override
	public int getStatus() {
		return _registrationCitizen.getStatus();
	}

	@Override
	public int hashCode() {
		return _registrationCitizen.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _registrationCitizen.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RegistrationCitizenWrapper((RegistrationCitizen)_registrationCitizen.clone());
	}

	/**
	* Returns the birth place of this registration citizen.
	*
	* @return the birth place of this registration citizen
	*/
	@Override
	public java.lang.String getBirthPlace() {
		return _registrationCitizen.getBirthPlace();
	}

	/**
	* Returns the citizenship of this registration citizen.
	*
	* @return the citizenship of this registration citizen
	*/
	@Override
	public java.lang.String getCitizenship() {
		return _registrationCitizen.getCitizenship();
	}

	/**
	* Returns the city of this registration citizen.
	*
	* @return the city of this registration citizen
	*/
	@Override
	public java.lang.String getCity() {
		return _registrationCitizen.getCity();
	}

	/**
	* Returns the code of this registration citizen.
	*
	* @return the code of this registration citizen
	*/
	@Override
	public java.lang.String getCode() {
		return _registrationCitizen.getCode();
	}

	/**
	* Returns the emergency contac phone of this registration citizen.
	*
	* @return the emergency contac phone of this registration citizen
	*/
	@Override
	public java.lang.String getEmergencyContacPhone() {
		return _registrationCitizen.getEmergencyContacPhone();
	}

	/**
	* Returns the emergency contact name of this registration citizen.
	*
	* @return the emergency contact name of this registration citizen
	*/
	@Override
	public java.lang.String getEmergencyContactName() {
		return _registrationCitizen.getEmergencyContactName();
	}

	/**
	* Returns the father name of this registration citizen.
	*
	* @return the father name of this registration citizen
	*/
	@Override
	public java.lang.String getFatherName() {
		return _registrationCitizen.getFatherName();
	}

	/**
	* Returns the fingerprint of this registration citizen.
	*
	* @return the fingerprint of this registration citizen
	*/
	@Override
	public java.lang.String getFingerprint() {
		return _registrationCitizen.getFingerprint();
	}

	/**
	* Returns the grandfather name of this registration citizen.
	*
	* @return the grandfather name of this registration citizen
	*/
	@Override
	public java.lang.String getGrandfatherName() {
		return _registrationCitizen.getGrandfatherName();
	}

	/**
	* Returns the house no of this registration citizen.
	*
	* @return the house no of this registration citizen
	*/
	@Override
	public java.lang.String getHouseNo() {
		return _registrationCitizen.getHouseNo();
	}

	/**
	* Returns the id type of this registration citizen.
	*
	* @return the id type of this registration citizen
	*/
	@Override
	public java.lang.String getIdType() {
		return _registrationCitizen.getIdType();
	}

	/**
	* Returns the image of this registration citizen.
	*
	* @return the image of this registration citizen
	*/
	@Override
	public java.lang.String getImage() {
		return _registrationCitizen.getImage();
	}

	/**
	* Returns the kebele of this registration citizen.
	*
	* @return the kebele of this registration citizen
	*/
	@Override
	public java.lang.String getKebele() {
		return _registrationCitizen.getKebele();
	}

	/**
	* Returns the mother name of this registration citizen.
	*
	* @return the mother name of this registration citizen
	*/
	@Override
	public java.lang.String getMotherName() {
		return _registrationCitizen.getMotherName();
	}

	/**
	* Returns the name of this registration citizen.
	*
	* @return the name of this registration citizen
	*/
	@Override
	public java.lang.String getName() {
		return _registrationCitizen.getName();
	}

	/**
	* Returns the nation of this registration citizen.
	*
	* @return the nation of this registration citizen
	*/
	@Override
	public java.lang.String getNation() {
		return _registrationCitizen.getNation();
	}

	/**
	* Returns the notice of this registration citizen.
	*
	* @return the notice of this registration citizen
	*/
	@Override
	public java.lang.String getNotice() {
		return _registrationCitizen.getNotice();
	}

	/**
	* Returns the occupation of this registration citizen.
	*
	* @return the occupation of this registration citizen
	*/
	@Override
	public java.lang.String getOccupation() {
		return _registrationCitizen.getOccupation();
	}

	/**
	* Returns the recipt no of this registration citizen.
	*
	* @return the recipt no of this registration citizen
	*/
	@Override
	public java.lang.String getReciptNo() {
		return _registrationCitizen.getReciptNo();
	}

	/**
	* Returns the relation of this registration citizen.
	*
	* @return the relation of this registration citizen
	*/
	@Override
	public java.lang.String getRelation() {
		return _registrationCitizen.getRelation();
	}

	/**
	* Returns the sex of this registration citizen.
	*
	* @return the sex of this registration citizen
	*/
	@Override
	public java.lang.String getSex() {
		return _registrationCitizen.getSex();
	}

	/**
	* Returns the signature of this registration citizen.
	*
	* @return the signature of this registration citizen
	*/
	@Override
	public java.lang.String getSignature() {
		return _registrationCitizen.getSignature();
	}

	/**
	* Returns the sub city of this registration citizen.
	*
	* @return the sub city of this registration citizen
	*/
	@Override
	public java.lang.String getSubCity() {
		return _registrationCitizen.getSubCity();
	}

	/**
	* Returns the telephone of this registration citizen.
	*
	* @return the telephone of this registration citizen
	*/
	@Override
	public java.lang.String getTelephone() {
		return _registrationCitizen.getTelephone();
	}

	/**
	* Returns the user name of this registration citizen.
	*
	* @return the user name of this registration citizen
	*/
	@Override
	public java.lang.String getUserName() {
		return _registrationCitizen.getUserName();
	}

	/**
	* Returns the user uuid of this registration citizen.
	*
	* @return the user uuid of this registration citizen
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _registrationCitizen.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _registrationCitizen.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _registrationCitizen.toXmlString();
	}

	/**
	* Returns the birth date of this registration citizen.
	*
	* @return the birth date of this registration citizen
	*/
	@Override
	public Date getBirthDate() {
		return _registrationCitizen.getBirthDate();
	}

	/**
	* Returns the create date of this registration citizen.
	*
	* @return the create date of this registration citizen
	*/
	@Override
	public Date getCreateDate() {
		return _registrationCitizen.getCreateDate();
	}

	/**
	* Returns the expire date of this registration citizen.
	*
	* @return the expire date of this registration citizen
	*/
	@Override
	public Date getExpireDate() {
		return _registrationCitizen.getExpireDate();
	}

	/**
	* Returns the issue date of this registration citizen.
	*
	* @return the issue date of this registration citizen
	*/
	@Override
	public Date getIssueDate() {
		return _registrationCitizen.getIssueDate();
	}

	/**
	* Returns the modified date of this registration citizen.
	*
	* @return the modified date of this registration citizen
	*/
	@Override
	public Date getModifiedDate() {
		return _registrationCitizen.getModifiedDate();
	}

	/**
	* Returns the company ID of this registration citizen.
	*
	* @return the company ID of this registration citizen
	*/
	@Override
	public long getCompanyId() {
		return _registrationCitizen.getCompanyId();
	}

	/**
	* Returns the group ID of this registration citizen.
	*
	* @return the group ID of this registration citizen
	*/
	@Override
	public long getGroupId() {
		return _registrationCitizen.getGroupId();
	}

	/**
	* Returns the ID of this registration citizen.
	*
	* @return the ID of this registration citizen
	*/
	@Override
	public long getId() {
		return _registrationCitizen.getId();
	}

	/**
	* Returns the primary key of this registration citizen.
	*
	* @return the primary key of this registration citizen
	*/
	@Override
	public long getPrimaryKey() {
		return _registrationCitizen.getPrimaryKey();
	}

	/**
	* Returns the user ID of this registration citizen.
	*
	* @return the user ID of this registration citizen
	*/
	@Override
	public long getUserId() {
		return _registrationCitizen.getUserId();
	}

	@Override
	public void persist() {
		_registrationCitizen.persist();
	}

	/**
	* Sets the birth date of this registration citizen.
	*
	* @param birthDate the birth date of this registration citizen
	*/
	@Override
	public void setBirthDate(Date birthDate) {
		_registrationCitizen.setBirthDate(birthDate);
	}

	/**
	* Sets the birth place of this registration citizen.
	*
	* @param birthPlace the birth place of this registration citizen
	*/
	@Override
	public void setBirthPlace(java.lang.String birthPlace) {
		_registrationCitizen.setBirthPlace(birthPlace);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_registrationCitizen.setCachedModel(cachedModel);
	}

	/**
	* Sets the citizenship of this registration citizen.
	*
	* @param citizenship the citizenship of this registration citizen
	*/
	@Override
	public void setCitizenship(java.lang.String citizenship) {
		_registrationCitizen.setCitizenship(citizenship);
	}

	/**
	* Sets the city of this registration citizen.
	*
	* @param city the city of this registration citizen
	*/
	@Override
	public void setCity(java.lang.String city) {
		_registrationCitizen.setCity(city);
	}

	/**
	* Sets the code of this registration citizen.
	*
	* @param code the code of this registration citizen
	*/
	@Override
	public void setCode(java.lang.String code) {
		_registrationCitizen.setCode(code);
	}

	/**
	* Sets the company ID of this registration citizen.
	*
	* @param companyId the company ID of this registration citizen
	*/
	@Override
	public void setCompanyId(long companyId) {
		_registrationCitizen.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this registration citizen.
	*
	* @param createDate the create date of this registration citizen
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_registrationCitizen.setCreateDate(createDate);
	}

	/**
	* Sets the emergency contac phone of this registration citizen.
	*
	* @param emergencyContacPhone the emergency contac phone of this registration citizen
	*/
	@Override
	public void setEmergencyContacPhone(java.lang.String emergencyContacPhone) {
		_registrationCitizen.setEmergencyContacPhone(emergencyContacPhone);
	}

	/**
	* Sets the emergency contact name of this registration citizen.
	*
	* @param emergencyContactName the emergency contact name of this registration citizen
	*/
	@Override
	public void setEmergencyContactName(java.lang.String emergencyContactName) {
		_registrationCitizen.setEmergencyContactName(emergencyContactName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_registrationCitizen.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_registrationCitizen.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_registrationCitizen.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the expire date of this registration citizen.
	*
	* @param expireDate the expire date of this registration citizen
	*/
	@Override
	public void setExpireDate(Date expireDate) {
		_registrationCitizen.setExpireDate(expireDate);
	}

	/**
	* Sets the father name of this registration citizen.
	*
	* @param fatherName the father name of this registration citizen
	*/
	@Override
	public void setFatherName(java.lang.String fatherName) {
		_registrationCitizen.setFatherName(fatherName);
	}

	/**
	* Sets the fingerprint of this registration citizen.
	*
	* @param fingerprint the fingerprint of this registration citizen
	*/
	@Override
	public void setFingerprint(java.lang.String fingerprint) {
		_registrationCitizen.setFingerprint(fingerprint);
	}

	/**
	* Sets the grandfather name of this registration citizen.
	*
	* @param grandfatherName the grandfather name of this registration citizen
	*/
	@Override
	public void setGrandfatherName(java.lang.String grandfatherName) {
		_registrationCitizen.setGrandfatherName(grandfatherName);
	}

	/**
	* Sets the group ID of this registration citizen.
	*
	* @param groupId the group ID of this registration citizen
	*/
	@Override
	public void setGroupId(long groupId) {
		_registrationCitizen.setGroupId(groupId);
	}

	/**
	* Sets the house no of this registration citizen.
	*
	* @param houseNo the house no of this registration citizen
	*/
	@Override
	public void setHouseNo(java.lang.String houseNo) {
		_registrationCitizen.setHouseNo(houseNo);
	}

	/**
	* Sets the ID of this registration citizen.
	*
	* @param id the ID of this registration citizen
	*/
	@Override
	public void setId(long id) {
		_registrationCitizen.setId(id);
	}

	/**
	* Sets the id type of this registration citizen.
	*
	* @param idType the id type of this registration citizen
	*/
	@Override
	public void setIdType(java.lang.String idType) {
		_registrationCitizen.setIdType(idType);
	}

	/**
	* Sets the image of this registration citizen.
	*
	* @param image the image of this registration citizen
	*/
	@Override
	public void setImage(java.lang.String image) {
		_registrationCitizen.setImage(image);
	}

	/**
	* Sets the issue date of this registration citizen.
	*
	* @param issueDate the issue date of this registration citizen
	*/
	@Override
	public void setIssueDate(Date issueDate) {
		_registrationCitizen.setIssueDate(issueDate);
	}

	/**
	* Sets the kebele of this registration citizen.
	*
	* @param kebele the kebele of this registration citizen
	*/
	@Override
	public void setKebele(java.lang.String kebele) {
		_registrationCitizen.setKebele(kebele);
	}

	/**
	* Sets the modified date of this registration citizen.
	*
	* @param modifiedDate the modified date of this registration citizen
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_registrationCitizen.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the mother name of this registration citizen.
	*
	* @param motherName the mother name of this registration citizen
	*/
	@Override
	public void setMotherName(java.lang.String motherName) {
		_registrationCitizen.setMotherName(motherName);
	}

	/**
	* Sets the name of this registration citizen.
	*
	* @param name the name of this registration citizen
	*/
	@Override
	public void setName(java.lang.String name) {
		_registrationCitizen.setName(name);
	}

	/**
	* Sets the nation of this registration citizen.
	*
	* @param nation the nation of this registration citizen
	*/
	@Override
	public void setNation(java.lang.String nation) {
		_registrationCitizen.setNation(nation);
	}

	@Override
	public void setNew(boolean n) {
		_registrationCitizen.setNew(n);
	}

	/**
	* Sets the notice of this registration citizen.
	*
	* @param notice the notice of this registration citizen
	*/
	@Override
	public void setNotice(java.lang.String notice) {
		_registrationCitizen.setNotice(notice);
	}

	/**
	* Sets the occupation of this registration citizen.
	*
	* @param occupation the occupation of this registration citizen
	*/
	@Override
	public void setOccupation(java.lang.String occupation) {
		_registrationCitizen.setOccupation(occupation);
	}

	/**
	* Sets whether this registration citizen is owner.
	*
	* @param owner the owner of this registration citizen
	*/
	@Override
	public void setOwner(boolean owner) {
		_registrationCitizen.setOwner(owner);
	}

	/**
	* Sets the primary key of this registration citizen.
	*
	* @param primaryKey the primary key of this registration citizen
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_registrationCitizen.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_registrationCitizen.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the recipt no of this registration citizen.
	*
	* @param reciptNo the recipt no of this registration citizen
	*/
	@Override
	public void setReciptNo(java.lang.String reciptNo) {
		_registrationCitizen.setReciptNo(reciptNo);
	}

	/**
	* Sets the relation of this registration citizen.
	*
	* @param relation the relation of this registration citizen
	*/
	@Override
	public void setRelation(java.lang.String relation) {
		_registrationCitizen.setRelation(relation);
	}

	/**
	* Sets the sex of this registration citizen.
	*
	* @param sex the sex of this registration citizen
	*/
	@Override
	public void setSex(java.lang.String sex) {
		_registrationCitizen.setSex(sex);
	}

	/**
	* Sets the signature of this registration citizen.
	*
	* @param signature the signature of this registration citizen
	*/
	@Override
	public void setSignature(java.lang.String signature) {
		_registrationCitizen.setSignature(signature);
	}

	/**
	* Sets the status of this registration citizen.
	*
	* @param status the status of this registration citizen
	*/
	@Override
	public void setStatus(int status) {
		_registrationCitizen.setStatus(status);
	}

	/**
	* Sets the sub city of this registration citizen.
	*
	* @param subCity the sub city of this registration citizen
	*/
	@Override
	public void setSubCity(java.lang.String subCity) {
		_registrationCitizen.setSubCity(subCity);
	}

	/**
	* Sets the telephone of this registration citizen.
	*
	* @param telephone the telephone of this registration citizen
	*/
	@Override
	public void setTelephone(java.lang.String telephone) {
		_registrationCitizen.setTelephone(telephone);
	}

	/**
	* Sets the user ID of this registration citizen.
	*
	* @param userId the user ID of this registration citizen
	*/
	@Override
	public void setUserId(long userId) {
		_registrationCitizen.setUserId(userId);
	}

	/**
	* Sets the user name of this registration citizen.
	*
	* @param userName the user name of this registration citizen
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_registrationCitizen.setUserName(userName);
	}

	/**
	* Sets the user uuid of this registration citizen.
	*
	* @param userUuid the user uuid of this registration citizen
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_registrationCitizen.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RegistrationCitizenWrapper)) {
			return false;
		}

		RegistrationCitizenWrapper registrationCitizenWrapper = (RegistrationCitizenWrapper)obj;

		if (Objects.equals(_registrationCitizen,
					registrationCitizenWrapper._registrationCitizen)) {
			return true;
		}

		return false;
	}

	@Override
	public RegistrationCitizen getWrappedModel() {
		return _registrationCitizen;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _registrationCitizen.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _registrationCitizen.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_registrationCitizen.resetOriginalValues();
	}

	private final RegistrationCitizen _registrationCitizen;
}