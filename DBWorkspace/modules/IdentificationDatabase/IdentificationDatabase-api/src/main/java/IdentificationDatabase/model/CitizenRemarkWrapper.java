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
 * This class is a wrapper for {@link CitizenRemark}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitizenRemark
 * @generated
 */
@ProviderType
public class CitizenRemarkWrapper implements CitizenRemark,
	ModelWrapper<CitizenRemark> {
	public CitizenRemarkWrapper(CitizenRemark citizenRemark) {
		_citizenRemark = citizenRemark;
	}

	@Override
	public Class<?> getModelClass() {
		return CitizenRemark.class;
	}

	@Override
	public String getModelClassName() {
		return CitizenRemark.class.getName();
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
		attributes.put("citizenId", getCitizenId());
		attributes.put("remark", getRemark());

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

		Long citizenId = (Long)attributes.get("citizenId");

		if (citizenId != null) {
			setCitizenId(citizenId);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
		}
	}

	@Override
	public IdentificationDatabase.model.CitizenRemark toEscapedModel() {
		return new CitizenRemarkWrapper(_citizenRemark.toEscapedModel());
	}

	@Override
	public IdentificationDatabase.model.CitizenRemark toUnescapedModel() {
		return new CitizenRemarkWrapper(_citizenRemark.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _citizenRemark.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _citizenRemark.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _citizenRemark.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _citizenRemark.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<IdentificationDatabase.model.CitizenRemark> toCacheModel() {
		return _citizenRemark.toCacheModel();
	}

	@Override
	public int compareTo(
		IdentificationDatabase.model.CitizenRemark citizenRemark) {
		return _citizenRemark.compareTo(citizenRemark);
	}

	@Override
	public int hashCode() {
		return _citizenRemark.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _citizenRemark.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CitizenRemarkWrapper((CitizenRemark)_citizenRemark.clone());
	}

	/**
	* Returns the remark of this citizen remark.
	*
	* @return the remark of this citizen remark
	*/
	@Override
	public java.lang.String getRemark() {
		return _citizenRemark.getRemark();
	}

	/**
	* Returns the user name of this citizen remark.
	*
	* @return the user name of this citizen remark
	*/
	@Override
	public java.lang.String getUserName() {
		return _citizenRemark.getUserName();
	}

	/**
	* Returns the user uuid of this citizen remark.
	*
	* @return the user uuid of this citizen remark
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _citizenRemark.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _citizenRemark.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _citizenRemark.toXmlString();
	}

	/**
	* Returns the create date of this citizen remark.
	*
	* @return the create date of this citizen remark
	*/
	@Override
	public Date getCreateDate() {
		return _citizenRemark.getCreateDate();
	}

	/**
	* Returns the modified date of this citizen remark.
	*
	* @return the modified date of this citizen remark
	*/
	@Override
	public Date getModifiedDate() {
		return _citizenRemark.getModifiedDate();
	}

	/**
	* Returns the citizen ID of this citizen remark.
	*
	* @return the citizen ID of this citizen remark
	*/
	@Override
	public long getCitizenId() {
		return _citizenRemark.getCitizenId();
	}

	/**
	* Returns the company ID of this citizen remark.
	*
	* @return the company ID of this citizen remark
	*/
	@Override
	public long getCompanyId() {
		return _citizenRemark.getCompanyId();
	}

	/**
	* Returns the ID of this citizen remark.
	*
	* @return the ID of this citizen remark
	*/
	@Override
	public long getId() {
		return _citizenRemark.getId();
	}

	/**
	* Returns the primary key of this citizen remark.
	*
	* @return the primary key of this citizen remark
	*/
	@Override
	public long getPrimaryKey() {
		return _citizenRemark.getPrimaryKey();
	}

	/**
	* Returns the user ID of this citizen remark.
	*
	* @return the user ID of this citizen remark
	*/
	@Override
	public long getUserId() {
		return _citizenRemark.getUserId();
	}

	@Override
	public void persist() {
		_citizenRemark.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_citizenRemark.setCachedModel(cachedModel);
	}

	/**
	* Sets the citizen ID of this citizen remark.
	*
	* @param citizenId the citizen ID of this citizen remark
	*/
	@Override
	public void setCitizenId(long citizenId) {
		_citizenRemark.setCitizenId(citizenId);
	}

	/**
	* Sets the company ID of this citizen remark.
	*
	* @param companyId the company ID of this citizen remark
	*/
	@Override
	public void setCompanyId(long companyId) {
		_citizenRemark.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this citizen remark.
	*
	* @param createDate the create date of this citizen remark
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_citizenRemark.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_citizenRemark.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_citizenRemark.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_citizenRemark.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this citizen remark.
	*
	* @param id the ID of this citizen remark
	*/
	@Override
	public void setId(long id) {
		_citizenRemark.setId(id);
	}

	/**
	* Sets the modified date of this citizen remark.
	*
	* @param modifiedDate the modified date of this citizen remark
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_citizenRemark.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_citizenRemark.setNew(n);
	}

	/**
	* Sets the primary key of this citizen remark.
	*
	* @param primaryKey the primary key of this citizen remark
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_citizenRemark.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_citizenRemark.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remark of this citizen remark.
	*
	* @param remark the remark of this citizen remark
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_citizenRemark.setRemark(remark);
	}

	/**
	* Sets the user ID of this citizen remark.
	*
	* @param userId the user ID of this citizen remark
	*/
	@Override
	public void setUserId(long userId) {
		_citizenRemark.setUserId(userId);
	}

	/**
	* Sets the user name of this citizen remark.
	*
	* @param userName the user name of this citizen remark
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_citizenRemark.setUserName(userName);
	}

	/**
	* Sets the user uuid of this citizen remark.
	*
	* @param userUuid the user uuid of this citizen remark
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_citizenRemark.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CitizenRemarkWrapper)) {
			return false;
		}

		CitizenRemarkWrapper citizenRemarkWrapper = (CitizenRemarkWrapper)obj;

		if (Objects.equals(_citizenRemark, citizenRemarkWrapper._citizenRemark)) {
			return true;
		}

		return false;
	}

	@Override
	public CitizenRemark getWrappedModel() {
		return _citizenRemark;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _citizenRemark.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _citizenRemark.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_citizenRemark.resetOriginalValues();
	}

	private final CitizenRemark _citizenRemark;
}