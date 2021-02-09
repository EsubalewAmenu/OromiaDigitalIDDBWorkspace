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

import java.sql.Blob;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link BiometricData}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BiometricData
 * @generated
 */
@ProviderType
public class BiometricDataWrapper implements BiometricData,
	ModelWrapper<BiometricData> {
	public BiometricDataWrapper(BiometricData biometricData) {
		_biometricData = biometricData;
	}

	@Override
	public Class<?> getModelClass() {
		return BiometricData.class;
	}

	@Override
	public String getModelClassName() {
		return BiometricData.class.getName();
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
		attributes.put("citizenId", getCitizenId());
		attributes.put("fingerType", getFingerType());
		attributes.put("fingerPrint", getFingerPrint());
		attributes.put("Remark", getRemark());

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

		Long citizenId = (Long)attributes.get("citizenId");

		if (citizenId != null) {
			setCitizenId(citizenId);
		}

		String fingerType = (String)attributes.get("fingerType");

		if (fingerType != null) {
			setFingerType(fingerType);
		}

		Blob fingerPrint = (Blob)attributes.get("fingerPrint");

		if (fingerPrint != null) {
			setFingerPrint(fingerPrint);
		}

		String Remark = (String)attributes.get("Remark");

		if (Remark != null) {
			setRemark(Remark);
		}
	}

	@Override
	public IdentificationDatabase.model.BiometricData toEscapedModel() {
		return new BiometricDataWrapper(_biometricData.toEscapedModel());
	}

	@Override
	public IdentificationDatabase.model.BiometricData toUnescapedModel() {
		return new BiometricDataWrapper(_biometricData.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _biometricData.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _biometricData.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _biometricData.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _biometricData.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<IdentificationDatabase.model.BiometricData> toCacheModel() {
		return _biometricData.toCacheModel();
	}

	@Override
	public int compareTo(
		IdentificationDatabase.model.BiometricData biometricData) {
		return _biometricData.compareTo(biometricData);
	}

	@Override
	public int hashCode() {
		return _biometricData.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _biometricData.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new BiometricDataWrapper((BiometricData)_biometricData.clone());
	}

	/**
	* Returns the finger type of this biometric data.
	*
	* @return the finger type of this biometric data
	*/
	@Override
	public java.lang.String getFingerType() {
		return _biometricData.getFingerType();
	}

	/**
	* Returns the remark of this biometric data.
	*
	* @return the remark of this biometric data
	*/
	@Override
	public java.lang.String getRemark() {
		return _biometricData.getRemark();
	}

	/**
	* Returns the user name of this biometric data.
	*
	* @return the user name of this biometric data
	*/
	@Override
	public java.lang.String getUserName() {
		return _biometricData.getUserName();
	}

	/**
	* Returns the user uuid of this biometric data.
	*
	* @return the user uuid of this biometric data
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _biometricData.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _biometricData.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _biometricData.toXmlString();
	}

	/**
	* Returns the finger print of this biometric data.
	*
	* @return the finger print of this biometric data
	*/
	@Override
	public Blob getFingerPrint() {
		return _biometricData.getFingerPrint();
	}

	/**
	* Returns the create date of this biometric data.
	*
	* @return the create date of this biometric data
	*/
	@Override
	public Date getCreateDate() {
		return _biometricData.getCreateDate();
	}

	/**
	* Returns the modified date of this biometric data.
	*
	* @return the modified date of this biometric data
	*/
	@Override
	public Date getModifiedDate() {
		return _biometricData.getModifiedDate();
	}

	/**
	* Returns the citizen ID of this biometric data.
	*
	* @return the citizen ID of this biometric data
	*/
	@Override
	public long getCitizenId() {
		return _biometricData.getCitizenId();
	}

	/**
	* Returns the company ID of this biometric data.
	*
	* @return the company ID of this biometric data
	*/
	@Override
	public long getCompanyId() {
		return _biometricData.getCompanyId();
	}

	/**
	* Returns the group ID of this biometric data.
	*
	* @return the group ID of this biometric data
	*/
	@Override
	public long getGroupId() {
		return _biometricData.getGroupId();
	}

	/**
	* Returns the ID of this biometric data.
	*
	* @return the ID of this biometric data
	*/
	@Override
	public long getId() {
		return _biometricData.getId();
	}

	/**
	* Returns the primary key of this biometric data.
	*
	* @return the primary key of this biometric data
	*/
	@Override
	public long getPrimaryKey() {
		return _biometricData.getPrimaryKey();
	}

	/**
	* Returns the user ID of this biometric data.
	*
	* @return the user ID of this biometric data
	*/
	@Override
	public long getUserId() {
		return _biometricData.getUserId();
	}

	@Override
	public void persist() {
		_biometricData.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_biometricData.setCachedModel(cachedModel);
	}

	/**
	* Sets the citizen ID of this biometric data.
	*
	* @param citizenId the citizen ID of this biometric data
	*/
	@Override
	public void setCitizenId(long citizenId) {
		_biometricData.setCitizenId(citizenId);
	}

	/**
	* Sets the company ID of this biometric data.
	*
	* @param companyId the company ID of this biometric data
	*/
	@Override
	public void setCompanyId(long companyId) {
		_biometricData.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this biometric data.
	*
	* @param createDate the create date of this biometric data
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_biometricData.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_biometricData.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_biometricData.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_biometricData.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the finger print of this biometric data.
	*
	* @param fingerPrint the finger print of this biometric data
	*/
	@Override
	public void setFingerPrint(Blob fingerPrint) {
		_biometricData.setFingerPrint(fingerPrint);
	}

	/**
	* Sets the finger type of this biometric data.
	*
	* @param fingerType the finger type of this biometric data
	*/
	@Override
	public void setFingerType(java.lang.String fingerType) {
		_biometricData.setFingerType(fingerType);
	}

	/**
	* Sets the group ID of this biometric data.
	*
	* @param groupId the group ID of this biometric data
	*/
	@Override
	public void setGroupId(long groupId) {
		_biometricData.setGroupId(groupId);
	}

	/**
	* Sets the ID of this biometric data.
	*
	* @param id the ID of this biometric data
	*/
	@Override
	public void setId(long id) {
		_biometricData.setId(id);
	}

	/**
	* Sets the modified date of this biometric data.
	*
	* @param modifiedDate the modified date of this biometric data
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_biometricData.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_biometricData.setNew(n);
	}

	/**
	* Sets the primary key of this biometric data.
	*
	* @param primaryKey the primary key of this biometric data
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_biometricData.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_biometricData.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remark of this biometric data.
	*
	* @param Remark the remark of this biometric data
	*/
	@Override
	public void setRemark(java.lang.String Remark) {
		_biometricData.setRemark(Remark);
	}

	/**
	* Sets the user ID of this biometric data.
	*
	* @param userId the user ID of this biometric data
	*/
	@Override
	public void setUserId(long userId) {
		_biometricData.setUserId(userId);
	}

	/**
	* Sets the user name of this biometric data.
	*
	* @param userName the user name of this biometric data
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_biometricData.setUserName(userName);
	}

	/**
	* Sets the user uuid of this biometric data.
	*
	* @param userUuid the user uuid of this biometric data
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_biometricData.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BiometricDataWrapper)) {
			return false;
		}

		BiometricDataWrapper biometricDataWrapper = (BiometricDataWrapper)obj;

		if (Objects.equals(_biometricData, biometricDataWrapper._biometricData)) {
			return true;
		}

		return false;
	}

	@Override
	public BiometricData getWrappedModel() {
		return _biometricData;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _biometricData.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _biometricData.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_biometricData.resetOriginalValues();
	}

	private final BiometricData _biometricData;
}