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
 * This class is a wrapper for {@link Kebeles}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Kebeles
 * @generated
 */
@ProviderType
public class KebelesWrapper implements Kebeles, ModelWrapper<Kebeles> {
	public KebelesWrapper(Kebeles kebeles) {
		_kebeles = kebeles;
	}

	@Override
	public Class<?> getModelClass() {
		return Kebeles.class;
	}

	@Override
	public String getModelClassName() {
		return Kebeles.class.getName();
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
		attributes.put("kebeleOr", getKebeleOr());
		attributes.put("kebeleAm", getKebeleAm());
		attributes.put("subcityOr", getSubcityOr());
		attributes.put("subcityAm", getSubcityAm());
		attributes.put("printername", getPrintername());

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

		String kebeleOr = (String)attributes.get("kebeleOr");

		if (kebeleOr != null) {
			setKebeleOr(kebeleOr);
		}

		String kebeleAm = (String)attributes.get("kebeleAm");

		if (kebeleAm != null) {
			setKebeleAm(kebeleAm);
		}

		String subcityOr = (String)attributes.get("subcityOr");

		if (subcityOr != null) {
			setSubcityOr(subcityOr);
		}

		String subcityAm = (String)attributes.get("subcityAm");

		if (subcityAm != null) {
			setSubcityAm(subcityAm);
		}

		String printername = (String)attributes.get("printername");

		if (printername != null) {
			setPrintername(printername);
		}
	}

	@Override
	public IdentificationDatabase.model.Kebeles toEscapedModel() {
		return new KebelesWrapper(_kebeles.toEscapedModel());
	}

	@Override
	public IdentificationDatabase.model.Kebeles toUnescapedModel() {
		return new KebelesWrapper(_kebeles.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _kebeles.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _kebeles.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _kebeles.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _kebeles.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<IdentificationDatabase.model.Kebeles> toCacheModel() {
		return _kebeles.toCacheModel();
	}

	@Override
	public int compareTo(IdentificationDatabase.model.Kebeles kebeles) {
		return _kebeles.compareTo(kebeles);
	}

	@Override
	public int hashCode() {
		return _kebeles.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _kebeles.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new KebelesWrapper((Kebeles)_kebeles.clone());
	}

	/**
	* Returns the kebele am of this kebeles.
	*
	* @return the kebele am of this kebeles
	*/
	@Override
	public java.lang.String getKebeleAm() {
		return _kebeles.getKebeleAm();
	}

	/**
	* Returns the kebele or of this kebeles.
	*
	* @return the kebele or of this kebeles
	*/
	@Override
	public java.lang.String getKebeleOr() {
		return _kebeles.getKebeleOr();
	}

	/**
	* Returns the printername of this kebeles.
	*
	* @return the printername of this kebeles
	*/
	@Override
	public java.lang.String getPrintername() {
		return _kebeles.getPrintername();
	}

	/**
	* Returns the subcity am of this kebeles.
	*
	* @return the subcity am of this kebeles
	*/
	@Override
	public java.lang.String getSubcityAm() {
		return _kebeles.getSubcityAm();
	}

	/**
	* Returns the subcity or of this kebeles.
	*
	* @return the subcity or of this kebeles
	*/
	@Override
	public java.lang.String getSubcityOr() {
		return _kebeles.getSubcityOr();
	}

	/**
	* Returns the user name of this kebeles.
	*
	* @return the user name of this kebeles
	*/
	@Override
	public java.lang.String getUserName() {
		return _kebeles.getUserName();
	}

	/**
	* Returns the user uuid of this kebeles.
	*
	* @return the user uuid of this kebeles
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _kebeles.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _kebeles.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _kebeles.toXmlString();
	}

	/**
	* Returns the create date of this kebeles.
	*
	* @return the create date of this kebeles
	*/
	@Override
	public Date getCreateDate() {
		return _kebeles.getCreateDate();
	}

	/**
	* Returns the modified date of this kebeles.
	*
	* @return the modified date of this kebeles
	*/
	@Override
	public Date getModifiedDate() {
		return _kebeles.getModifiedDate();
	}

	/**
	* Returns the company ID of this kebeles.
	*
	* @return the company ID of this kebeles
	*/
	@Override
	public long getCompanyId() {
		return _kebeles.getCompanyId();
	}

	/**
	* Returns the group ID of this kebeles.
	*
	* @return the group ID of this kebeles
	*/
	@Override
	public long getGroupId() {
		return _kebeles.getGroupId();
	}

	/**
	* Returns the ID of this kebeles.
	*
	* @return the ID of this kebeles
	*/
	@Override
	public long getId() {
		return _kebeles.getId();
	}

	/**
	* Returns the primary key of this kebeles.
	*
	* @return the primary key of this kebeles
	*/
	@Override
	public long getPrimaryKey() {
		return _kebeles.getPrimaryKey();
	}

	/**
	* Returns the user ID of this kebeles.
	*
	* @return the user ID of this kebeles
	*/
	@Override
	public long getUserId() {
		return _kebeles.getUserId();
	}

	@Override
	public void persist() {
		_kebeles.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_kebeles.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this kebeles.
	*
	* @param companyId the company ID of this kebeles
	*/
	@Override
	public void setCompanyId(long companyId) {
		_kebeles.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this kebeles.
	*
	* @param createDate the create date of this kebeles
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_kebeles.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_kebeles.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_kebeles.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_kebeles.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this kebeles.
	*
	* @param groupId the group ID of this kebeles
	*/
	@Override
	public void setGroupId(long groupId) {
		_kebeles.setGroupId(groupId);
	}

	/**
	* Sets the ID of this kebeles.
	*
	* @param id the ID of this kebeles
	*/
	@Override
	public void setId(long id) {
		_kebeles.setId(id);
	}

	/**
	* Sets the kebele am of this kebeles.
	*
	* @param kebeleAm the kebele am of this kebeles
	*/
	@Override
	public void setKebeleAm(java.lang.String kebeleAm) {
		_kebeles.setKebeleAm(kebeleAm);
	}

	/**
	* Sets the kebele or of this kebeles.
	*
	* @param kebeleOr the kebele or of this kebeles
	*/
	@Override
	public void setKebeleOr(java.lang.String kebeleOr) {
		_kebeles.setKebeleOr(kebeleOr);
	}

	/**
	* Sets the modified date of this kebeles.
	*
	* @param modifiedDate the modified date of this kebeles
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_kebeles.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_kebeles.setNew(n);
	}

	/**
	* Sets the primary key of this kebeles.
	*
	* @param primaryKey the primary key of this kebeles
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_kebeles.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_kebeles.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the printername of this kebeles.
	*
	* @param printername the printername of this kebeles
	*/
	@Override
	public void setPrintername(java.lang.String printername) {
		_kebeles.setPrintername(printername);
	}

	/**
	* Sets the subcity am of this kebeles.
	*
	* @param subcityAm the subcity am of this kebeles
	*/
	@Override
	public void setSubcityAm(java.lang.String subcityAm) {
		_kebeles.setSubcityAm(subcityAm);
	}

	/**
	* Sets the subcity or of this kebeles.
	*
	* @param subcityOr the subcity or of this kebeles
	*/
	@Override
	public void setSubcityOr(java.lang.String subcityOr) {
		_kebeles.setSubcityOr(subcityOr);
	}

	/**
	* Sets the user ID of this kebeles.
	*
	* @param userId the user ID of this kebeles
	*/
	@Override
	public void setUserId(long userId) {
		_kebeles.setUserId(userId);
	}

	/**
	* Sets the user name of this kebeles.
	*
	* @param userName the user name of this kebeles
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_kebeles.setUserName(userName);
	}

	/**
	* Sets the user uuid of this kebeles.
	*
	* @param userUuid the user uuid of this kebeles
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_kebeles.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KebelesWrapper)) {
			return false;
		}

		KebelesWrapper kebelesWrapper = (KebelesWrapper)obj;

		if (Objects.equals(_kebeles, kebelesWrapper._kebeles)) {
			return true;
		}

		return false;
	}

	@Override
	public Kebeles getWrappedModel() {
		return _kebeles;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _kebeles.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _kebeles.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_kebeles.resetOriginalValues();
	}

	private final Kebeles _kebeles;
}