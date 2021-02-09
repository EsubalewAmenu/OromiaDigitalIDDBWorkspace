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
 * This class is a wrapper for {@link TransferToOtherCity}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TransferToOtherCity
 * @generated
 */
@ProviderType
public class TransferToOtherCityWrapper implements TransferToOtherCity,
	ModelWrapper<TransferToOtherCity> {
	public TransferToOtherCityWrapper(TransferToOtherCity transferToOtherCity) {
		_transferToOtherCity = transferToOtherCity;
	}

	@Override
	public Class<?> getModelClass() {
		return TransferToOtherCity.class;
	}

	@Override
	public String getModelClassName() {
		return TransferToOtherCity.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tocity", getTocity());
		attributes.put("fromcity", getFromcity());
		attributes.put("subcity", getSubcity());
		attributes.put("kebele", getKebele());
		attributes.put("fullname", getFullname());
		attributes.put("mothername", getMothername());
		attributes.put("citizenId", getCitizenId());
		attributes.put("birthdate", getBirthdate());
		attributes.put("houseNo", getHouseNo());
		attributes.put("isOwner", getIsOwner());
		attributes.put("phone", getPhone());
		attributes.put("reason", getReason());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		String tocity = (String)attributes.get("tocity");

		if (tocity != null) {
			setTocity(tocity);
		}

		String fromcity = (String)attributes.get("fromcity");

		if (fromcity != null) {
			setFromcity(fromcity);
		}

		String subcity = (String)attributes.get("subcity");

		if (subcity != null) {
			setSubcity(subcity);
		}

		String kebele = (String)attributes.get("kebele");

		if (kebele != null) {
			setKebele(kebele);
		}

		String fullname = (String)attributes.get("fullname");

		if (fullname != null) {
			setFullname(fullname);
		}

		String mothername = (String)attributes.get("mothername");

		if (mothername != null) {
			setMothername(mothername);
		}

		Long citizenId = (Long)attributes.get("citizenId");

		if (citizenId != null) {
			setCitizenId(citizenId);
		}

		Date birthdate = (Date)attributes.get("birthdate");

		if (birthdate != null) {
			setBirthdate(birthdate);
		}

		String houseNo = (String)attributes.get("houseNo");

		if (houseNo != null) {
			setHouseNo(houseNo);
		}

		String isOwner = (String)attributes.get("isOwner");

		if (isOwner != null) {
			setIsOwner(isOwner);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String reason = (String)attributes.get("reason");

		if (reason != null) {
			setReason(reason);
		}
	}

	@Override
	public IdentificationDatabase.model.TransferToOtherCity toEscapedModel() {
		return new TransferToOtherCityWrapper(_transferToOtherCity.toEscapedModel());
	}

	@Override
	public IdentificationDatabase.model.TransferToOtherCity toUnescapedModel() {
		return new TransferToOtherCityWrapper(_transferToOtherCity.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _transferToOtherCity.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _transferToOtherCity.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _transferToOtherCity.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _transferToOtherCity.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<IdentificationDatabase.model.TransferToOtherCity> toCacheModel() {
		return _transferToOtherCity.toCacheModel();
	}

	@Override
	public int compareTo(
		IdentificationDatabase.model.TransferToOtherCity transferToOtherCity) {
		return _transferToOtherCity.compareTo(transferToOtherCity);
	}

	@Override
	public int hashCode() {
		return _transferToOtherCity.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _transferToOtherCity.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new TransferToOtherCityWrapper((TransferToOtherCity)_transferToOtherCity.clone());
	}

	/**
	* Returns the fromcity of this transfer to other city.
	*
	* @return the fromcity of this transfer to other city
	*/
	@Override
	public java.lang.String getFromcity() {
		return _transferToOtherCity.getFromcity();
	}

	/**
	* Returns the fullname of this transfer to other city.
	*
	* @return the fullname of this transfer to other city
	*/
	@Override
	public java.lang.String getFullname() {
		return _transferToOtherCity.getFullname();
	}

	/**
	* Returns the house no of this transfer to other city.
	*
	* @return the house no of this transfer to other city
	*/
	@Override
	public java.lang.String getHouseNo() {
		return _transferToOtherCity.getHouseNo();
	}

	/**
	* Returns the is owner of this transfer to other city.
	*
	* @return the is owner of this transfer to other city
	*/
	@Override
	public java.lang.String getIsOwner() {
		return _transferToOtherCity.getIsOwner();
	}

	/**
	* Returns the kebele of this transfer to other city.
	*
	* @return the kebele of this transfer to other city
	*/
	@Override
	public java.lang.String getKebele() {
		return _transferToOtherCity.getKebele();
	}

	/**
	* Returns the mothername of this transfer to other city.
	*
	* @return the mothername of this transfer to other city
	*/
	@Override
	public java.lang.String getMothername() {
		return _transferToOtherCity.getMothername();
	}

	/**
	* Returns the phone of this transfer to other city.
	*
	* @return the phone of this transfer to other city
	*/
	@Override
	public java.lang.String getPhone() {
		return _transferToOtherCity.getPhone();
	}

	/**
	* Returns the reason of this transfer to other city.
	*
	* @return the reason of this transfer to other city
	*/
	@Override
	public java.lang.String getReason() {
		return _transferToOtherCity.getReason();
	}

	/**
	* Returns the subcity of this transfer to other city.
	*
	* @return the subcity of this transfer to other city
	*/
	@Override
	public java.lang.String getSubcity() {
		return _transferToOtherCity.getSubcity();
	}

	/**
	* Returns the tocity of this transfer to other city.
	*
	* @return the tocity of this transfer to other city
	*/
	@Override
	public java.lang.String getTocity() {
		return _transferToOtherCity.getTocity();
	}

	/**
	* Returns the user name of this transfer to other city.
	*
	* @return the user name of this transfer to other city
	*/
	@Override
	public java.lang.String getUserName() {
		return _transferToOtherCity.getUserName();
	}

	/**
	* Returns the user uuid of this transfer to other city.
	*
	* @return the user uuid of this transfer to other city
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _transferToOtherCity.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _transferToOtherCity.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _transferToOtherCity.toXmlString();
	}

	/**
	* Returns the birthdate of this transfer to other city.
	*
	* @return the birthdate of this transfer to other city
	*/
	@Override
	public Date getBirthdate() {
		return _transferToOtherCity.getBirthdate();
	}

	/**
	* Returns the create date of this transfer to other city.
	*
	* @return the create date of this transfer to other city
	*/
	@Override
	public Date getCreateDate() {
		return _transferToOtherCity.getCreateDate();
	}

	/**
	* Returns the modified date of this transfer to other city.
	*
	* @return the modified date of this transfer to other city
	*/
	@Override
	public Date getModifiedDate() {
		return _transferToOtherCity.getModifiedDate();
	}

	/**
	* Returns the citizen ID of this transfer to other city.
	*
	* @return the citizen ID of this transfer to other city
	*/
	@Override
	public long getCitizenId() {
		return _transferToOtherCity.getCitizenId();
	}

	/**
	* Returns the company ID of this transfer to other city.
	*
	* @return the company ID of this transfer to other city
	*/
	@Override
	public long getCompanyId() {
		return _transferToOtherCity.getCompanyId();
	}

	/**
	* Returns the ID of this transfer to other city.
	*
	* @return the ID of this transfer to other city
	*/
	@Override
	public long getId() {
		return _transferToOtherCity.getId();
	}

	/**
	* Returns the primary key of this transfer to other city.
	*
	* @return the primary key of this transfer to other city
	*/
	@Override
	public long getPrimaryKey() {
		return _transferToOtherCity.getPrimaryKey();
	}

	/**
	* Returns the user ID of this transfer to other city.
	*
	* @return the user ID of this transfer to other city
	*/
	@Override
	public long getUserId() {
		return _transferToOtherCity.getUserId();
	}

	@Override
	public void persist() {
		_transferToOtherCity.persist();
	}

	/**
	* Sets the birthdate of this transfer to other city.
	*
	* @param birthdate the birthdate of this transfer to other city
	*/
	@Override
	public void setBirthdate(Date birthdate) {
		_transferToOtherCity.setBirthdate(birthdate);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_transferToOtherCity.setCachedModel(cachedModel);
	}

	/**
	* Sets the citizen ID of this transfer to other city.
	*
	* @param citizenId the citizen ID of this transfer to other city
	*/
	@Override
	public void setCitizenId(long citizenId) {
		_transferToOtherCity.setCitizenId(citizenId);
	}

	/**
	* Sets the company ID of this transfer to other city.
	*
	* @param companyId the company ID of this transfer to other city
	*/
	@Override
	public void setCompanyId(long companyId) {
		_transferToOtherCity.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this transfer to other city.
	*
	* @param createDate the create date of this transfer to other city
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_transferToOtherCity.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_transferToOtherCity.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_transferToOtherCity.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_transferToOtherCity.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fromcity of this transfer to other city.
	*
	* @param fromcity the fromcity of this transfer to other city
	*/
	@Override
	public void setFromcity(java.lang.String fromcity) {
		_transferToOtherCity.setFromcity(fromcity);
	}

	/**
	* Sets the fullname of this transfer to other city.
	*
	* @param fullname the fullname of this transfer to other city
	*/
	@Override
	public void setFullname(java.lang.String fullname) {
		_transferToOtherCity.setFullname(fullname);
	}

	/**
	* Sets the house no of this transfer to other city.
	*
	* @param houseNo the house no of this transfer to other city
	*/
	@Override
	public void setHouseNo(java.lang.String houseNo) {
		_transferToOtherCity.setHouseNo(houseNo);
	}

	/**
	* Sets the ID of this transfer to other city.
	*
	* @param id the ID of this transfer to other city
	*/
	@Override
	public void setId(long id) {
		_transferToOtherCity.setId(id);
	}

	/**
	* Sets the is owner of this transfer to other city.
	*
	* @param isOwner the is owner of this transfer to other city
	*/
	@Override
	public void setIsOwner(java.lang.String isOwner) {
		_transferToOtherCity.setIsOwner(isOwner);
	}

	/**
	* Sets the kebele of this transfer to other city.
	*
	* @param kebele the kebele of this transfer to other city
	*/
	@Override
	public void setKebele(java.lang.String kebele) {
		_transferToOtherCity.setKebele(kebele);
	}

	/**
	* Sets the modified date of this transfer to other city.
	*
	* @param modifiedDate the modified date of this transfer to other city
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_transferToOtherCity.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the mothername of this transfer to other city.
	*
	* @param mothername the mothername of this transfer to other city
	*/
	@Override
	public void setMothername(java.lang.String mothername) {
		_transferToOtherCity.setMothername(mothername);
	}

	@Override
	public void setNew(boolean n) {
		_transferToOtherCity.setNew(n);
	}

	/**
	* Sets the phone of this transfer to other city.
	*
	* @param phone the phone of this transfer to other city
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_transferToOtherCity.setPhone(phone);
	}

	/**
	* Sets the primary key of this transfer to other city.
	*
	* @param primaryKey the primary key of this transfer to other city
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_transferToOtherCity.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_transferToOtherCity.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the reason of this transfer to other city.
	*
	* @param reason the reason of this transfer to other city
	*/
	@Override
	public void setReason(java.lang.String reason) {
		_transferToOtherCity.setReason(reason);
	}

	/**
	* Sets the subcity of this transfer to other city.
	*
	* @param subcity the subcity of this transfer to other city
	*/
	@Override
	public void setSubcity(java.lang.String subcity) {
		_transferToOtherCity.setSubcity(subcity);
	}

	/**
	* Sets the tocity of this transfer to other city.
	*
	* @param tocity the tocity of this transfer to other city
	*/
	@Override
	public void setTocity(java.lang.String tocity) {
		_transferToOtherCity.setTocity(tocity);
	}

	/**
	* Sets the user ID of this transfer to other city.
	*
	* @param userId the user ID of this transfer to other city
	*/
	@Override
	public void setUserId(long userId) {
		_transferToOtherCity.setUserId(userId);
	}

	/**
	* Sets the user name of this transfer to other city.
	*
	* @param userName the user name of this transfer to other city
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_transferToOtherCity.setUserName(userName);
	}

	/**
	* Sets the user uuid of this transfer to other city.
	*
	* @param userUuid the user uuid of this transfer to other city
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_transferToOtherCity.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TransferToOtherCityWrapper)) {
			return false;
		}

		TransferToOtherCityWrapper transferToOtherCityWrapper = (TransferToOtherCityWrapper)obj;

		if (Objects.equals(_transferToOtherCity,
					transferToOtherCityWrapper._transferToOtherCity)) {
			return true;
		}

		return false;
	}

	@Override
	public TransferToOtherCity getWrappedModel() {
		return _transferToOtherCity;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _transferToOtherCity.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _transferToOtherCity.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_transferToOtherCity.resetOriginalValues();
	}

	private final TransferToOtherCity _transferToOtherCity;
}