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
 * This class is a wrapper for {@link Settings}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Settings
 * @generated
 */
@ProviderType
public class SettingsWrapper implements Settings, ModelWrapper<Settings> {
	public SettingsWrapper(Settings settings) {
		_settings = settings;
	}

	@Override
	public Class<?> getModelClass() {
		return Settings.class;
	}

	@Override
	public String getModelClassName() {
		return Settings.class.getName();
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
		attributes.put("assignedUserId", getAssignedUserId());
		attributes.put("organizationId", getOrganizationId());
		attributes.put("roleId", getRoleId());
		attributes.put("remark", getRemark());

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

		Long assignedUserId = (Long)attributes.get("assignedUserId");

		if (assignedUserId != null) {
			setAssignedUserId(assignedUserId);
		}

		Long organizationId = (Long)attributes.get("organizationId");

		if (organizationId != null) {
			setOrganizationId(organizationId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}

		String remark = (String)attributes.get("remark");

		if (remark != null) {
			setRemark(remark);
		}
	}

	@Override
	public IdentificationDatabase.model.Settings toEscapedModel() {
		return new SettingsWrapper(_settings.toEscapedModel());
	}

	@Override
	public IdentificationDatabase.model.Settings toUnescapedModel() {
		return new SettingsWrapper(_settings.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _settings.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _settings.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _settings.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _settings.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<IdentificationDatabase.model.Settings> toCacheModel() {
		return _settings.toCacheModel();
	}

	@Override
	public int compareTo(IdentificationDatabase.model.Settings settings) {
		return _settings.compareTo(settings);
	}

	@Override
	public int hashCode() {
		return _settings.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _settings.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new SettingsWrapper((Settings)_settings.clone());
	}

	/**
	* Returns the assigned user uuid of this settings.
	*
	* @return the assigned user uuid of this settings
	*/
	@Override
	public java.lang.String getAssignedUserUuid() {
		return _settings.getAssignedUserUuid();
	}

	/**
	* Returns the remark of this settings.
	*
	* @return the remark of this settings
	*/
	@Override
	public java.lang.String getRemark() {
		return _settings.getRemark();
	}

	/**
	* Returns the user name of this settings.
	*
	* @return the user name of this settings
	*/
	@Override
	public java.lang.String getUserName() {
		return _settings.getUserName();
	}

	/**
	* Returns the user uuid of this settings.
	*
	* @return the user uuid of this settings
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _settings.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _settings.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _settings.toXmlString();
	}

	/**
	* Returns the create date of this settings.
	*
	* @return the create date of this settings
	*/
	@Override
	public Date getCreateDate() {
		return _settings.getCreateDate();
	}

	/**
	* Returns the modified date of this settings.
	*
	* @return the modified date of this settings
	*/
	@Override
	public Date getModifiedDate() {
		return _settings.getModifiedDate();
	}

	/**
	* Returns the assigned user ID of this settings.
	*
	* @return the assigned user ID of this settings
	*/
	@Override
	public long getAssignedUserId() {
		return _settings.getAssignedUserId();
	}

	/**
	* Returns the company ID of this settings.
	*
	* @return the company ID of this settings
	*/
	@Override
	public long getCompanyId() {
		return _settings.getCompanyId();
	}

	/**
	* Returns the group ID of this settings.
	*
	* @return the group ID of this settings
	*/
	@Override
	public long getGroupId() {
		return _settings.getGroupId();
	}

	/**
	* Returns the ID of this settings.
	*
	* @return the ID of this settings
	*/
	@Override
	public long getId() {
		return _settings.getId();
	}

	/**
	* Returns the organization ID of this settings.
	*
	* @return the organization ID of this settings
	*/
	@Override
	public long getOrganizationId() {
		return _settings.getOrganizationId();
	}

	/**
	* Returns the primary key of this settings.
	*
	* @return the primary key of this settings
	*/
	@Override
	public long getPrimaryKey() {
		return _settings.getPrimaryKey();
	}

	/**
	* Returns the role ID of this settings.
	*
	* @return the role ID of this settings
	*/
	@Override
	public long getRoleId() {
		return _settings.getRoleId();
	}

	/**
	* Returns the user ID of this settings.
	*
	* @return the user ID of this settings
	*/
	@Override
	public long getUserId() {
		return _settings.getUserId();
	}

	@Override
	public void persist() {
		_settings.persist();
	}

	/**
	* Sets the assigned user ID of this settings.
	*
	* @param assignedUserId the assigned user ID of this settings
	*/
	@Override
	public void setAssignedUserId(long assignedUserId) {
		_settings.setAssignedUserId(assignedUserId);
	}

	/**
	* Sets the assigned user uuid of this settings.
	*
	* @param assignedUserUuid the assigned user uuid of this settings
	*/
	@Override
	public void setAssignedUserUuid(java.lang.String assignedUserUuid) {
		_settings.setAssignedUserUuid(assignedUserUuid);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_settings.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this settings.
	*
	* @param companyId the company ID of this settings
	*/
	@Override
	public void setCompanyId(long companyId) {
		_settings.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this settings.
	*
	* @param createDate the create date of this settings
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_settings.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_settings.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_settings.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_settings.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this settings.
	*
	* @param groupId the group ID of this settings
	*/
	@Override
	public void setGroupId(long groupId) {
		_settings.setGroupId(groupId);
	}

	/**
	* Sets the ID of this settings.
	*
	* @param id the ID of this settings
	*/
	@Override
	public void setId(long id) {
		_settings.setId(id);
	}

	/**
	* Sets the modified date of this settings.
	*
	* @param modifiedDate the modified date of this settings
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_settings.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_settings.setNew(n);
	}

	/**
	* Sets the organization ID of this settings.
	*
	* @param organizationId the organization ID of this settings
	*/
	@Override
	public void setOrganizationId(long organizationId) {
		_settings.setOrganizationId(organizationId);
	}

	/**
	* Sets the primary key of this settings.
	*
	* @param primaryKey the primary key of this settings
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_settings.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_settings.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remark of this settings.
	*
	* @param remark the remark of this settings
	*/
	@Override
	public void setRemark(java.lang.String remark) {
		_settings.setRemark(remark);
	}

	/**
	* Sets the role ID of this settings.
	*
	* @param roleId the role ID of this settings
	*/
	@Override
	public void setRoleId(long roleId) {
		_settings.setRoleId(roleId);
	}

	/**
	* Sets the user ID of this settings.
	*
	* @param userId the user ID of this settings
	*/
	@Override
	public void setUserId(long userId) {
		_settings.setUserId(userId);
	}

	/**
	* Sets the user name of this settings.
	*
	* @param userName the user name of this settings
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_settings.setUserName(userName);
	}

	/**
	* Sets the user uuid of this settings.
	*
	* @param userUuid the user uuid of this settings
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_settings.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SettingsWrapper)) {
			return false;
		}

		SettingsWrapper settingsWrapper = (SettingsWrapper)obj;

		if (Objects.equals(_settings, settingsWrapper._settings)) {
			return true;
		}

		return false;
	}

	@Override
	public Settings getWrappedModel() {
		return _settings;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _settings.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _settings.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_settings.resetOriginalValues();
	}

	private final Settings _settings;
}