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
 * This class is a wrapper for {@link PrintedHistory}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PrintedHistory
 * @generated
 */
@ProviderType
public class PrintedHistoryWrapper implements PrintedHistory,
	ModelWrapper<PrintedHistory> {
	public PrintedHistoryWrapper(PrintedHistory printedHistory) {
		_printedHistory = printedHistory;
	}

	@Override
	public Class<?> getModelClass() {
		return PrintedHistory.class;
	}

	@Override
	public String getModelClassName() {
		return PrintedHistory.class.getName();
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
	}

	@Override
	public IdentificationDatabase.model.PrintedHistory toEscapedModel() {
		return new PrintedHistoryWrapper(_printedHistory.toEscapedModel());
	}

	@Override
	public IdentificationDatabase.model.PrintedHistory toUnescapedModel() {
		return new PrintedHistoryWrapper(_printedHistory.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _printedHistory.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _printedHistory.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _printedHistory.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _printedHistory.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<IdentificationDatabase.model.PrintedHistory> toCacheModel() {
		return _printedHistory.toCacheModel();
	}

	@Override
	public int compareTo(
		IdentificationDatabase.model.PrintedHistory printedHistory) {
		return _printedHistory.compareTo(printedHistory);
	}

	@Override
	public int hashCode() {
		return _printedHistory.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _printedHistory.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new PrintedHistoryWrapper((PrintedHistory)_printedHistory.clone());
	}

	/**
	* Returns the user name of this printed history.
	*
	* @return the user name of this printed history
	*/
	@Override
	public java.lang.String getUserName() {
		return _printedHistory.getUserName();
	}

	/**
	* Returns the user uuid of this printed history.
	*
	* @return the user uuid of this printed history
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _printedHistory.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _printedHistory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _printedHistory.toXmlString();
	}

	/**
	* Returns the create date of this printed history.
	*
	* @return the create date of this printed history
	*/
	@Override
	public Date getCreateDate() {
		return _printedHistory.getCreateDate();
	}

	/**
	* Returns the modified date of this printed history.
	*
	* @return the modified date of this printed history
	*/
	@Override
	public Date getModifiedDate() {
		return _printedHistory.getModifiedDate();
	}

	/**
	* Returns the citizen ID of this printed history.
	*
	* @return the citizen ID of this printed history
	*/
	@Override
	public long getCitizenId() {
		return _printedHistory.getCitizenId();
	}

	/**
	* Returns the company ID of this printed history.
	*
	* @return the company ID of this printed history
	*/
	@Override
	public long getCompanyId() {
		return _printedHistory.getCompanyId();
	}

	/**
	* Returns the ID of this printed history.
	*
	* @return the ID of this printed history
	*/
	@Override
	public long getId() {
		return _printedHistory.getId();
	}

	/**
	* Returns the primary key of this printed history.
	*
	* @return the primary key of this printed history
	*/
	@Override
	public long getPrimaryKey() {
		return _printedHistory.getPrimaryKey();
	}

	/**
	* Returns the user ID of this printed history.
	*
	* @return the user ID of this printed history
	*/
	@Override
	public long getUserId() {
		return _printedHistory.getUserId();
	}

	@Override
	public void persist() {
		_printedHistory.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_printedHistory.setCachedModel(cachedModel);
	}

	/**
	* Sets the citizen ID of this printed history.
	*
	* @param citizenId the citizen ID of this printed history
	*/
	@Override
	public void setCitizenId(long citizenId) {
		_printedHistory.setCitizenId(citizenId);
	}

	/**
	* Sets the company ID of this printed history.
	*
	* @param companyId the company ID of this printed history
	*/
	@Override
	public void setCompanyId(long companyId) {
		_printedHistory.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this printed history.
	*
	* @param createDate the create date of this printed history
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_printedHistory.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_printedHistory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_printedHistory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_printedHistory.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this printed history.
	*
	* @param id the ID of this printed history
	*/
	@Override
	public void setId(long id) {
		_printedHistory.setId(id);
	}

	/**
	* Sets the modified date of this printed history.
	*
	* @param modifiedDate the modified date of this printed history
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_printedHistory.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_printedHistory.setNew(n);
	}

	/**
	* Sets the primary key of this printed history.
	*
	* @param primaryKey the primary key of this printed history
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_printedHistory.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_printedHistory.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this printed history.
	*
	* @param userId the user ID of this printed history
	*/
	@Override
	public void setUserId(long userId) {
		_printedHistory.setUserId(userId);
	}

	/**
	* Sets the user name of this printed history.
	*
	* @param userName the user name of this printed history
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_printedHistory.setUserName(userName);
	}

	/**
	* Sets the user uuid of this printed history.
	*
	* @param userUuid the user uuid of this printed history
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_printedHistory.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PrintedHistoryWrapper)) {
			return false;
		}

		PrintedHistoryWrapper printedHistoryWrapper = (PrintedHistoryWrapper)obj;

		if (Objects.equals(_printedHistory,
					printedHistoryWrapper._printedHistory)) {
			return true;
		}

		return false;
	}

	@Override
	public PrintedHistory getWrappedModel() {
		return _printedHistory;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _printedHistory.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _printedHistory.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_printedHistory.resetOriginalValues();
	}

	private final PrintedHistory _printedHistory;
}