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
 * This class is a wrapper for {@link Services}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Services
 * @generated
 */
@ProviderType
public class ServicesWrapper implements Services, ModelWrapper<Services> {
	public ServicesWrapper(Services services) {
		_services = services;
	}

	@Override
	public Class<?> getModelClass() {
		return Services.class;
	}

	@Override
	public String getModelClassName() {
		return Services.class.getName();
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
		attributes.put("service", getService());
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

		Long citizenId = (Long)attributes.get("citizenId");

		if (citizenId != null) {
			setCitizenId(citizenId);
		}

		String service = (String)attributes.get("service");

		if (service != null) {
			setService(service);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@Override
	public IdentificationDatabase.model.Services toEscapedModel() {
		return new ServicesWrapper(_services.toEscapedModel());
	}

	@Override
	public IdentificationDatabase.model.Services toUnescapedModel() {
		return new ServicesWrapper(_services.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _services.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _services.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _services.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _services.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<IdentificationDatabase.model.Services> toCacheModel() {
		return _services.toCacheModel();
	}

	@Override
	public int compareTo(IdentificationDatabase.model.Services services) {
		return _services.compareTo(services);
	}

	/**
	* Returns the status of this services.
	*
	* @return the status of this services
	*/
	@Override
	public int getStatus() {
		return _services.getStatus();
	}

	@Override
	public int hashCode() {
		return _services.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _services.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ServicesWrapper((Services)_services.clone());
	}

	/**
	* Returns the service of this services.
	*
	* @return the service of this services
	*/
	@Override
	public java.lang.String getService() {
		return _services.getService();
	}

	/**
	* Returns the user name of this services.
	*
	* @return the user name of this services
	*/
	@Override
	public java.lang.String getUserName() {
		return _services.getUserName();
	}

	/**
	* Returns the user uuid of this services.
	*
	* @return the user uuid of this services
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _services.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _services.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _services.toXmlString();
	}

	/**
	* Returns the create date of this services.
	*
	* @return the create date of this services
	*/
	@Override
	public Date getCreateDate() {
		return _services.getCreateDate();
	}

	/**
	* Returns the modified date of this services.
	*
	* @return the modified date of this services
	*/
	@Override
	public Date getModifiedDate() {
		return _services.getModifiedDate();
	}

	/**
	* Returns the citizen ID of this services.
	*
	* @return the citizen ID of this services
	*/
	@Override
	public long getCitizenId() {
		return _services.getCitizenId();
	}

	/**
	* Returns the company ID of this services.
	*
	* @return the company ID of this services
	*/
	@Override
	public long getCompanyId() {
		return _services.getCompanyId();
	}

	/**
	* Returns the group ID of this services.
	*
	* @return the group ID of this services
	*/
	@Override
	public long getGroupId() {
		return _services.getGroupId();
	}

	/**
	* Returns the ID of this services.
	*
	* @return the ID of this services
	*/
	@Override
	public long getId() {
		return _services.getId();
	}

	/**
	* Returns the primary key of this services.
	*
	* @return the primary key of this services
	*/
	@Override
	public long getPrimaryKey() {
		return _services.getPrimaryKey();
	}

	/**
	* Returns the user ID of this services.
	*
	* @return the user ID of this services
	*/
	@Override
	public long getUserId() {
		return _services.getUserId();
	}

	@Override
	public void persist() {
		_services.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_services.setCachedModel(cachedModel);
	}

	/**
	* Sets the citizen ID of this services.
	*
	* @param citizenId the citizen ID of this services
	*/
	@Override
	public void setCitizenId(long citizenId) {
		_services.setCitizenId(citizenId);
	}

	/**
	* Sets the company ID of this services.
	*
	* @param companyId the company ID of this services
	*/
	@Override
	public void setCompanyId(long companyId) {
		_services.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this services.
	*
	* @param createDate the create date of this services
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_services.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_services.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_services.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_services.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this services.
	*
	* @param groupId the group ID of this services
	*/
	@Override
	public void setGroupId(long groupId) {
		_services.setGroupId(groupId);
	}

	/**
	* Sets the ID of this services.
	*
	* @param id the ID of this services
	*/
	@Override
	public void setId(long id) {
		_services.setId(id);
	}

	/**
	* Sets the modified date of this services.
	*
	* @param modifiedDate the modified date of this services
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_services.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_services.setNew(n);
	}

	/**
	* Sets the primary key of this services.
	*
	* @param primaryKey the primary key of this services
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_services.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_services.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the service of this services.
	*
	* @param service the service of this services
	*/
	@Override
	public void setService(java.lang.String service) {
		_services.setService(service);
	}

	/**
	* Sets the status of this services.
	*
	* @param status the status of this services
	*/
	@Override
	public void setStatus(int status) {
		_services.setStatus(status);
	}

	/**
	* Sets the user ID of this services.
	*
	* @param userId the user ID of this services
	*/
	@Override
	public void setUserId(long userId) {
		_services.setUserId(userId);
	}

	/**
	* Sets the user name of this services.
	*
	* @param userName the user name of this services
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_services.setUserName(userName);
	}

	/**
	* Sets the user uuid of this services.
	*
	* @param userUuid the user uuid of this services
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_services.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicesWrapper)) {
			return false;
		}

		ServicesWrapper servicesWrapper = (ServicesWrapper)obj;

		if (Objects.equals(_services, servicesWrapper._services)) {
			return true;
		}

		return false;
	}

	@Override
	public Services getWrappedModel() {
		return _services;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _services.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _services.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_services.resetOriginalValues();
	}

	private final Services _services;
}