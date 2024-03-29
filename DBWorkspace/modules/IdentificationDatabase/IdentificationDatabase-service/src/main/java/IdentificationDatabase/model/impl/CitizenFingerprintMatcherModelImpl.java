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

package IdentificationDatabase.model.impl;

import IdentificationDatabase.model.CitizenFingerprintMatcher;
import IdentificationDatabase.model.CitizenFingerprintMatcherModel;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the CitizenFingerprintMatcher service. Represents a row in the &quot;ID_CitizenFingerprintMatcher&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link CitizenFingerprintMatcherModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CitizenFingerprintMatcherImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitizenFingerprintMatcherImpl
 * @see CitizenFingerprintMatcher
 * @see CitizenFingerprintMatcherModel
 * @generated
 */
@ProviderType
public class CitizenFingerprintMatcherModelImpl extends BaseModelImpl<CitizenFingerprintMatcher>
	implements CitizenFingerprintMatcherModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a citizen fingerprint matcher model instance should use the {@link CitizenFingerprintMatcher} interface instead.
	 */
	public static final String TABLE_NAME = "ID_CitizenFingerprintMatcher";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "citizenId", Types.BIGINT },
			{ "citizenIdSecond", Types.BIGINT },
			{ "score", Types.INTEGER },
			{ "status", Types.INTEGER },
			{ "userId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("citizenId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("citizenIdSecond", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("score", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table ID_CitizenFingerprintMatcher (id_ LONG not null primary key,createDate DATE null,modifiedDate DATE null,citizenId LONG,citizenIdSecond LONG,score INTEGER,status INTEGER,userId LONG)";
	public static final String TABLE_SQL_DROP = "drop table ID_CitizenFingerprintMatcher";
	public static final String ORDER_BY_JPQL = " ORDER BY citizenFingerprintMatcher.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ID_CitizenFingerprintMatcher.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.IdentificationDatabase.model.CitizenFingerprintMatcher"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.IdentificationDatabase.model.CitizenFingerprintMatcher"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.IdentificationDatabase.model.CitizenFingerprintMatcher"),
			true);
	public static final long CITIZENID_COLUMN_BITMASK = 1L;
	public static final long CITIZENIDSECOND_COLUMN_BITMASK = 2L;
	public static final long ID_COLUMN_BITMASK = 4L;
	public static final long STATUS_COLUMN_BITMASK = 8L;
	public static final long USERID_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(IdentificationDatabase.service.util.ServiceProps.get(
				"lock.expiration.time.IdentificationDatabase.model.CitizenFingerprintMatcher"));

	public CitizenFingerprintMatcherModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		if (!_setOriginalId) {
			_setOriginalId = true;

			_originalId = _id;
		}

		_id = id;
	}

	public long getOriginalId() {
		return _originalId;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public long getCitizenId() {
		return _citizenId;
	}

	@Override
	public void setCitizenId(long citizenId) {
		_columnBitmask |= CITIZENID_COLUMN_BITMASK;

		if (!_setOriginalCitizenId) {
			_setOriginalCitizenId = true;

			_originalCitizenId = _citizenId;
		}

		_citizenId = citizenId;
	}

	public long getOriginalCitizenId() {
		return _originalCitizenId;
	}

	@Override
	public long getCitizenIdSecond() {
		return _citizenIdSecond;
	}

	@Override
	public void setCitizenIdSecond(long citizenIdSecond) {
		_columnBitmask |= CITIZENIDSECOND_COLUMN_BITMASK;

		if (!_setOriginalCitizenIdSecond) {
			_setOriginalCitizenIdSecond = true;

			_originalCitizenIdSecond = _citizenIdSecond;
		}

		_citizenIdSecond = citizenIdSecond;
	}

	public long getOriginalCitizenIdSecond() {
		return _originalCitizenIdSecond;
	}

	@Override
	public int getScore() {
		return _score;
	}

	@Override
	public void setScore(int score) {
		_score = score;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			CitizenFingerprintMatcher.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CitizenFingerprintMatcher toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CitizenFingerprintMatcher)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CitizenFingerprintMatcherImpl citizenFingerprintMatcherImpl = new CitizenFingerprintMatcherImpl();

		citizenFingerprintMatcherImpl.setId(getId());
		citizenFingerprintMatcherImpl.setCreateDate(getCreateDate());
		citizenFingerprintMatcherImpl.setModifiedDate(getModifiedDate());
		citizenFingerprintMatcherImpl.setCitizenId(getCitizenId());
		citizenFingerprintMatcherImpl.setCitizenIdSecond(getCitizenIdSecond());
		citizenFingerprintMatcherImpl.setScore(getScore());
		citizenFingerprintMatcherImpl.setStatus(getStatus());
		citizenFingerprintMatcherImpl.setUserId(getUserId());

		citizenFingerprintMatcherImpl.resetOriginalValues();

		return citizenFingerprintMatcherImpl;
	}

	@Override
	public int compareTo(CitizenFingerprintMatcher citizenFingerprintMatcher) {
		int value = 0;

		if (getId() < citizenFingerprintMatcher.getId()) {
			value = -1;
		}
		else if (getId() > citizenFingerprintMatcher.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CitizenFingerprintMatcher)) {
			return false;
		}

		CitizenFingerprintMatcher citizenFingerprintMatcher = (CitizenFingerprintMatcher)obj;

		long primaryKey = citizenFingerprintMatcher.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		CitizenFingerprintMatcherModelImpl citizenFingerprintMatcherModelImpl = this;

		citizenFingerprintMatcherModelImpl._originalId = citizenFingerprintMatcherModelImpl._id;

		citizenFingerprintMatcherModelImpl._setOriginalId = false;

		citizenFingerprintMatcherModelImpl._setModifiedDate = false;

		citizenFingerprintMatcherModelImpl._originalCitizenId = citizenFingerprintMatcherModelImpl._citizenId;

		citizenFingerprintMatcherModelImpl._setOriginalCitizenId = false;

		citizenFingerprintMatcherModelImpl._originalCitizenIdSecond = citizenFingerprintMatcherModelImpl._citizenIdSecond;

		citizenFingerprintMatcherModelImpl._setOriginalCitizenIdSecond = false;

		citizenFingerprintMatcherModelImpl._originalStatus = citizenFingerprintMatcherModelImpl._status;

		citizenFingerprintMatcherModelImpl._setOriginalStatus = false;

		citizenFingerprintMatcherModelImpl._originalUserId = citizenFingerprintMatcherModelImpl._userId;

		citizenFingerprintMatcherModelImpl._setOriginalUserId = false;

		citizenFingerprintMatcherModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CitizenFingerprintMatcher> toCacheModel() {
		CitizenFingerprintMatcherCacheModel citizenFingerprintMatcherCacheModel = new CitizenFingerprintMatcherCacheModel();

		citizenFingerprintMatcherCacheModel.id = getId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			citizenFingerprintMatcherCacheModel.createDate = createDate.getTime();
		}
		else {
			citizenFingerprintMatcherCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			citizenFingerprintMatcherCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			citizenFingerprintMatcherCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		citizenFingerprintMatcherCacheModel.citizenId = getCitizenId();

		citizenFingerprintMatcherCacheModel.citizenIdSecond = getCitizenIdSecond();

		citizenFingerprintMatcherCacheModel.score = getScore();

		citizenFingerprintMatcherCacheModel.status = getStatus();

		citizenFingerprintMatcherCacheModel.userId = getUserId();

		return citizenFingerprintMatcherCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", citizenId=");
		sb.append(getCitizenId());
		sb.append(", citizenIdSecond=");
		sb.append(getCitizenIdSecond());
		sb.append(", score=");
		sb.append(getScore());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("IdentificationDatabase.model.CitizenFingerprintMatcher");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citizenId</column-name><column-value><![CDATA[");
		sb.append(getCitizenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citizenIdSecond</column-name><column-value><![CDATA[");
		sb.append(getCitizenIdSecond());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>score</column-name><column-value><![CDATA[");
		sb.append(getScore());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = CitizenFingerprintMatcher.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			CitizenFingerprintMatcher.class
		};
	private long _id;
	private long _originalId;
	private boolean _setOriginalId;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _citizenId;
	private long _originalCitizenId;
	private boolean _setOriginalCitizenId;
	private long _citizenIdSecond;
	private long _originalCitizenIdSecond;
	private boolean _setOriginalCitizenIdSecond;
	private int _score;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private long _columnBitmask;
	private CitizenFingerprintMatcher _escapedModel;
}