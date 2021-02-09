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
 * This class is a wrapper for {@link AddressLookup}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressLookup
 * @generated
 */
@ProviderType
public class AddressLookupWrapper implements AddressLookup,
	ModelWrapper<AddressLookup> {
	public AddressLookupWrapper(AddressLookup addressLookup) {
		_addressLookup = addressLookup;
	}

	@Override
	public Class<?> getModelClass() {
		return AddressLookup.class;
	}

	@Override
	public String getModelClassName() {
		return AddressLookup.class.getName();
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
		attributes.put("organizationId", getOrganizationId());
		attributes.put("parentId", getParentId());
		attributes.put("name", getName());
		attributes.put("level", getLevel());
		attributes.put("description", getDescription());
		attributes.put("status", getStatus());

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

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long parentId = (Long)attributes.get("parentId");

		if (parentId != null) {
			setParentId(parentId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String level = (String)attributes.get("level");

		if (level != null) {
			setLevel(level);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public IdentificationDatabase.model.AddressLookup toEscapedModel() {
		return new AddressLookupWrapper(_addressLookup.toEscapedModel());
	}

	@Override
	public IdentificationDatabase.model.AddressLookup toUnescapedModel() {
		return new AddressLookupWrapper(_addressLookup.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _addressLookup.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _addressLookup.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _addressLookup.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _addressLookup.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<IdentificationDatabase.model.AddressLookup> toCacheModel() {
		return _addressLookup.toCacheModel();
	}

	@Override
	public int compareTo(
		IdentificationDatabase.model.AddressLookup addressLookup) {
		return _addressLookup.compareTo(addressLookup);
	}

	/**
	* Returns the status of this address lookup.
	*
	* @return the status of this address lookup
	*/
	@Override
	public int getStatus() {
		return _addressLookup.getStatus();
	}

	@Override
	public int hashCode() {
		return _addressLookup.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _addressLookup.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AddressLookupWrapper((AddressLookup)_addressLookup.clone());
	}

	/**
	* Returns the code of this address lookup.
	*
	* @return the code of this address lookup
	*/
	@Override
	public java.lang.String getCode() {
		return _addressLookup.getCode();
	}

	/**
	* Returns the description of this address lookup.
	*
	* @return the description of this address lookup
	*/
	@Override
	public java.lang.String getDescription() {
		return _addressLookup.getDescription();
	}

	/**
	* Returns the level of this address lookup.
	*
	* @return the level of this address lookup
	*/
	@Override
	public java.lang.String getLevel() {
		return _addressLookup.getLevel();
	}

	/**
	* Returns the name of this address lookup.
	*
	* @return the name of this address lookup
	*/
	@Override
	public java.lang.String getName() {
		return _addressLookup.getName();
	}

	/**
	* Returns the user name of this address lookup.
	*
	* @return the user name of this address lookup
	*/
	@Override
	public java.lang.String getUserName() {
		return _addressLookup.getUserName();
	}

	/**
	* Returns the user uuid of this address lookup.
	*
	* @return the user uuid of this address lookup
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _addressLookup.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _addressLookup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _addressLookup.toXmlString();
	}

	/**
	* Returns the create date of this address lookup.
	*
	* @return the create date of this address lookup
	*/
	@Override
	public Date getCreateDate() {
		return _addressLookup.getCreateDate();
	}

	/**
	* Returns the modified date of this address lookup.
	*
	* @return the modified date of this address lookup
	*/
	@Override
	public Date getModifiedDate() {
		return _addressLookup.getModifiedDate();
	}

	/**
	* Returns the company ID of this address lookup.
	*
	* @return the company ID of this address lookup
	*/
	@Override
	public long getCompanyId() {
		return _addressLookup.getCompanyId();
	}

	/**
	* Returns the group ID of this address lookup.
	*
	* @return the group ID of this address lookup
	*/
	@Override
	public long getGroupId() {
		return _addressLookup.getGroupId();
	}

	/**
	* Returns the ID of this address lookup.
	*
	* @return the ID of this address lookup
	*/
	@Override
	public long getId() {
		return _addressLookup.getId();
	}

	/**
	* Returns the organization ID of this address lookup.
	*
	* @return the organization ID of this address lookup
	*/
	@Override
	public long getOrganizationId() {
		return _addressLookup.getOrganizationId();
	}

	/**
	* Returns the parent ID of this address lookup.
	*
	* @return the parent ID of this address lookup
	*/
	@Override
	public long getParentId() {
		return _addressLookup.getParentId();
	}

	/**
	* Returns the primary key of this address lookup.
	*
	* @return the primary key of this address lookup
	*/
	@Override
	public long getPrimaryKey() {
		return _addressLookup.getPrimaryKey();
	}

	/**
	* Returns the user ID of this address lookup.
	*
	* @return the user ID of this address lookup
	*/
	@Override
	public long getUserId() {
		return _addressLookup.getUserId();
	}

	@Override
	public void persist() {
		_addressLookup.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_addressLookup.setCachedModel(cachedModel);
	}

	/**
	* Sets the code of this address lookup.
	*
	* @param code the code of this address lookup
	*/
	@Override
	public void setCode(java.lang.String code) {
		_addressLookup.setCode(code);
	}

	/**
	* Sets the company ID of this address lookup.
	*
	* @param companyId the company ID of this address lookup
	*/
	@Override
	public void setCompanyId(long companyId) {
		_addressLookup.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this address lookup.
	*
	* @param createDate the create date of this address lookup
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_addressLookup.setCreateDate(createDate);
	}

	/**
	* Sets the description of this address lookup.
	*
	* @param description the description of this address lookup
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_addressLookup.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_addressLookup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_addressLookup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_addressLookup.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this address lookup.
	*
	* @param groupId the group ID of this address lookup
	*/
	@Override
	public void setGroupId(long groupId) {
		_addressLookup.setGroupId(groupId);
	}

	/**
	* Sets the ID of this address lookup.
	*
	* @param id the ID of this address lookup
	*/
	@Override
	public void setId(long id) {
		_addressLookup.setId(id);
	}

	/**
	* Sets the level of this address lookup.
	*
	* @param level the level of this address lookup
	*/
	@Override
	public void setLevel(java.lang.String level) {
		_addressLookup.setLevel(level);
	}

	/**
	* Sets the modified date of this address lookup.
	*
	* @param modifiedDate the modified date of this address lookup
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_addressLookup.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this address lookup.
	*
	* @param name the name of this address lookup
	*/
	@Override
	public void setName(java.lang.String name) {
		_addressLookup.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_addressLookup.setNew(n);
	}

	/**
	* Sets the organization ID of this address lookup.
	*
	* @param organizationId the organization ID of this address lookup
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_addressLookup.setOrganizationId(organizationId);
	}

	/**
	* Sets the parent ID of this address lookup.
	*
	* @param parentId the parent ID of this address lookup
	*/
	@Override
	public void setParentId(long parentId) {
		_addressLookup.setParentId(parentId);
	}

	/**
	* Sets the primary key of this address lookup.
	*
	* @param primaryKey the primary key of this address lookup
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_addressLookup.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_addressLookup.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this address lookup.
	*
	* @param status the status of this address lookup
	*/
	@Override
	public void setStatus(int status) {
		_addressLookup.setStatus(status);
	}

	/**
	* Sets the user ID of this address lookup.
	*
	* @param userId the user ID of this address lookup
	*/
	@Override
	public void setUserId(long userId) {
		_addressLookup.setUserId(userId);
	}

	/**
	* Sets the user name of this address lookup.
	*
	* @param userName the user name of this address lookup
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_addressLookup.setUserName(userName);
	}

	/**
	* Sets the user uuid of this address lookup.
	*
	* @param userUuid the user uuid of this address lookup
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_addressLookup.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AddressLookupWrapper)) {
			return false;
		}

		AddressLookupWrapper addressLookupWrapper = (AddressLookupWrapper)obj;

		if (Objects.equals(_addressLookup, addressLookupWrapper._addressLookup)) {
			return true;
		}

		return false;
	}

	@Override
	public AddressLookup getWrappedModel() {
		return _addressLookup;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _addressLookup.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _addressLookup.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_addressLookup.resetOriginalValues();
	}

	private final AddressLookup _addressLookup;
}