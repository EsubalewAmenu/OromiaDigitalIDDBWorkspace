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
 * This class is a wrapper for {@link CitizenFingerprintMatcher}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitizenFingerprintMatcher
 * @generated
 */
@ProviderType
public class CitizenFingerprintMatcherWrapper
	implements CitizenFingerprintMatcher,
		ModelWrapper<CitizenFingerprintMatcher> {
	public CitizenFingerprintMatcherWrapper(
		CitizenFingerprintMatcher citizenFingerprintMatcher) {
		_citizenFingerprintMatcher = citizenFingerprintMatcher;
	}

	@Override
	public Class<?> getModelClass() {
		return CitizenFingerprintMatcher.class;
	}

	@Override
	public String getModelClassName() {
		return CitizenFingerprintMatcher.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("citizenId", getCitizenId());
		attributes.put("citizenIdSecond", getCitizenIdSecond());
		attributes.put("score", getScore());
		attributes.put("status", getStatus());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		Long citizenIdSecond = (Long)attributes.get("citizenIdSecond");

		if (citizenIdSecond != null) {
			setCitizenIdSecond(citizenIdSecond);
		}

		Integer score = (Integer)attributes.get("score");

		if (score != null) {
			setScore(score);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public IdentificationDatabase.model.CitizenFingerprintMatcher toEscapedModel() {
		return new CitizenFingerprintMatcherWrapper(_citizenFingerprintMatcher.toEscapedModel());
	}

	@Override
	public IdentificationDatabase.model.CitizenFingerprintMatcher toUnescapedModel() {
		return new CitizenFingerprintMatcherWrapper(_citizenFingerprintMatcher.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _citizenFingerprintMatcher.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _citizenFingerprintMatcher.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _citizenFingerprintMatcher.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _citizenFingerprintMatcher.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<IdentificationDatabase.model.CitizenFingerprintMatcher> toCacheModel() {
		return _citizenFingerprintMatcher.toCacheModel();
	}

	@Override
	public int compareTo(
		IdentificationDatabase.model.CitizenFingerprintMatcher citizenFingerprintMatcher) {
		return _citizenFingerprintMatcher.compareTo(citizenFingerprintMatcher);
	}

	/**
	* Returns the score of this citizen fingerprint matcher.
	*
	* @return the score of this citizen fingerprint matcher
	*/
	@Override
	public int getScore() {
		return _citizenFingerprintMatcher.getScore();
	}

	/**
	* Returns the status of this citizen fingerprint matcher.
	*
	* @return the status of this citizen fingerprint matcher
	*/
	@Override
	public int getStatus() {
		return _citizenFingerprintMatcher.getStatus();
	}

	@Override
	public int hashCode() {
		return _citizenFingerprintMatcher.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _citizenFingerprintMatcher.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CitizenFingerprintMatcherWrapper((CitizenFingerprintMatcher)_citizenFingerprintMatcher.clone());
	}

	/**
	* Returns the user uuid of this citizen fingerprint matcher.
	*
	* @return the user uuid of this citizen fingerprint matcher
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _citizenFingerprintMatcher.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _citizenFingerprintMatcher.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _citizenFingerprintMatcher.toXmlString();
	}

	/**
	* Returns the create date of this citizen fingerprint matcher.
	*
	* @return the create date of this citizen fingerprint matcher
	*/
	@Override
	public Date getCreateDate() {
		return _citizenFingerprintMatcher.getCreateDate();
	}

	/**
	* Returns the modified date of this citizen fingerprint matcher.
	*
	* @return the modified date of this citizen fingerprint matcher
	*/
	@Override
	public Date getModifiedDate() {
		return _citizenFingerprintMatcher.getModifiedDate();
	}

	/**
	* Returns the citizen ID of this citizen fingerprint matcher.
	*
	* @return the citizen ID of this citizen fingerprint matcher
	*/
	@Override
	public long getCitizenId() {
		return _citizenFingerprintMatcher.getCitizenId();
	}

	/**
	* Returns the citizen ID second of this citizen fingerprint matcher.
	*
	* @return the citizen ID second of this citizen fingerprint matcher
	*/
	@Override
	public long getCitizenIdSecond() {
		return _citizenFingerprintMatcher.getCitizenIdSecond();
	}

	/**
	* Returns the ID of this citizen fingerprint matcher.
	*
	* @return the ID of this citizen fingerprint matcher
	*/
	@Override
	public long getId() {
		return _citizenFingerprintMatcher.getId();
	}

	/**
	* Returns the primary key of this citizen fingerprint matcher.
	*
	* @return the primary key of this citizen fingerprint matcher
	*/
	@Override
	public long getPrimaryKey() {
		return _citizenFingerprintMatcher.getPrimaryKey();
	}

	/**
	* Returns the user ID of this citizen fingerprint matcher.
	*
	* @return the user ID of this citizen fingerprint matcher
	*/
	@Override
	public long getUserId() {
		return _citizenFingerprintMatcher.getUserId();
	}

	@Override
	public void persist() {
		_citizenFingerprintMatcher.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_citizenFingerprintMatcher.setCachedModel(cachedModel);
	}

	/**
	* Sets the citizen ID of this citizen fingerprint matcher.
	*
	* @param citizenId the citizen ID of this citizen fingerprint matcher
	*/
	@Override
	public void setCitizenId(long citizenId) {
		_citizenFingerprintMatcher.setCitizenId(citizenId);
	}

	/**
	* Sets the citizen ID second of this citizen fingerprint matcher.
	*
	* @param citizenIdSecond the citizen ID second of this citizen fingerprint matcher
	*/
	@Override
	public void setCitizenIdSecond(long citizenIdSecond) {
		_citizenFingerprintMatcher.setCitizenIdSecond(citizenIdSecond);
	}

	/**
	* Sets the create date of this citizen fingerprint matcher.
	*
	* @param createDate the create date of this citizen fingerprint matcher
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_citizenFingerprintMatcher.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_citizenFingerprintMatcher.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_citizenFingerprintMatcher.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_citizenFingerprintMatcher.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this citizen fingerprint matcher.
	*
	* @param id the ID of this citizen fingerprint matcher
	*/
	@Override
	public void setId(long id) {
		_citizenFingerprintMatcher.setId(id);
	}

	/**
	* Sets the modified date of this citizen fingerprint matcher.
	*
	* @param modifiedDate the modified date of this citizen fingerprint matcher
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_citizenFingerprintMatcher.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_citizenFingerprintMatcher.setNew(n);
	}

	/**
	* Sets the primary key of this citizen fingerprint matcher.
	*
	* @param primaryKey the primary key of this citizen fingerprint matcher
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_citizenFingerprintMatcher.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_citizenFingerprintMatcher.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the score of this citizen fingerprint matcher.
	*
	* @param score the score of this citizen fingerprint matcher
	*/
	@Override
	public void setScore(int score) {
		_citizenFingerprintMatcher.setScore(score);
	}

	/**
	* Sets the status of this citizen fingerprint matcher.
	*
	* @param status the status of this citizen fingerprint matcher
	*/
	@Override
	public void setStatus(int status) {
		_citizenFingerprintMatcher.setStatus(status);
	}

	/**
	* Sets the user ID of this citizen fingerprint matcher.
	*
	* @param userId the user ID of this citizen fingerprint matcher
	*/
	@Override
	public void setUserId(long userId) {
		_citizenFingerprintMatcher.setUserId(userId);
	}

	/**
	* Sets the user uuid of this citizen fingerprint matcher.
	*
	* @param userUuid the user uuid of this citizen fingerprint matcher
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_citizenFingerprintMatcher.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CitizenFingerprintMatcherWrapper)) {
			return false;
		}

		CitizenFingerprintMatcherWrapper citizenFingerprintMatcherWrapper = (CitizenFingerprintMatcherWrapper)obj;

		if (Objects.equals(_citizenFingerprintMatcher,
					citizenFingerprintMatcherWrapper._citizenFingerprintMatcher)) {
			return true;
		}

		return false;
	}

	@Override
	public CitizenFingerprintMatcher getWrappedModel() {
		return _citizenFingerprintMatcher;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _citizenFingerprintMatcher.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _citizenFingerprintMatcher.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_citizenFingerprintMatcher.resetOriginalValues();
	}

	private final CitizenFingerprintMatcher _citizenFingerprintMatcher;
}