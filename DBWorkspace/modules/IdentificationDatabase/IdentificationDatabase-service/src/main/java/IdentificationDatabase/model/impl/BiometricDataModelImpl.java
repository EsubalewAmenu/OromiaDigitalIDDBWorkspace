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

import IdentificationDatabase.model.BiometricData;
import IdentificationDatabase.model.BiometricDataFingerPrintBlobModel;
import IdentificationDatabase.model.BiometricDataModel;

import IdentificationDatabase.service.BiometricDataLocalServiceUtil;

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

import java.sql.Blob;
import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the BiometricData service. Represents a row in the &quot;ID_BiometricData&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link BiometricDataModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BiometricDataImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BiometricDataImpl
 * @see BiometricData
 * @see BiometricDataModel
 * @generated
 */
@ProviderType
public class BiometricDataModelImpl extends BaseModelImpl<BiometricData>
	implements BiometricDataModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a biometric data model instance should use the {@link BiometricData} interface instead.
	 */
	public static final String TABLE_NAME = "ID_BiometricData";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "citizenId", Types.BIGINT },
			{ "fingerType", Types.VARCHAR },
			{ "fingerPrint", Types.BLOB },
			{ "Remark", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("citizenId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fingerType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fingerPrint", Types.BLOB);
		TABLE_COLUMNS_MAP.put("Remark", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table ID_BiometricData (id_ LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,citizenId LONG,fingerType VARCHAR(75) null,fingerPrint BLOB,Remark VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table ID_BiometricData";
	public static final String ORDER_BY_JPQL = " ORDER BY biometricData.citizenId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ID_BiometricData.citizenId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.IdentificationDatabase.model.BiometricData"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.IdentificationDatabase.model.BiometricData"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.IdentificationDatabase.model.BiometricData"),
			true);
	public static final long CITIZENID_COLUMN_BITMASK = 1L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(IdentificationDatabase.service.util.ServiceProps.get(
				"lock.expiration.time.IdentificationDatabase.model.BiometricData"));

	public BiometricDataModelImpl() {
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
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
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

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
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
		_columnBitmask = -1L;

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
	public String getFingerType() {
		if (_fingerType == null) {
			return StringPool.BLANK;
		}
		else {
			return _fingerType;
		}
	}

	@Override
	public void setFingerType(String fingerType) {
		_fingerType = fingerType;
	}

	@Override
	public Blob getFingerPrint() {
		if (_fingerPrintBlobModel == null) {
			try {
				_fingerPrintBlobModel = BiometricDataLocalServiceUtil.getFingerPrintBlobModel(getPrimaryKey());
			}
			catch (Exception e) {
			}
		}

		Blob blob = null;

		if (_fingerPrintBlobModel != null) {
			blob = _fingerPrintBlobModel.getFingerPrintBlob();
		}

		return blob;
	}

	@Override
	public void setFingerPrint(Blob fingerPrint) {
		if (_fingerPrintBlobModel == null) {
			_fingerPrintBlobModel = new BiometricDataFingerPrintBlobModel(getPrimaryKey(),
					fingerPrint);
		}
		else {
			_fingerPrintBlobModel.setFingerPrintBlob(fingerPrint);
		}
	}

	@Override
	public String getRemark() {
		if (_Remark == null) {
			return StringPool.BLANK;
		}
		else {
			return _Remark;
		}
	}

	@Override
	public void setRemark(String Remark) {
		_Remark = Remark;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			BiometricData.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public BiometricData toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (BiometricData)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BiometricDataImpl biometricDataImpl = new BiometricDataImpl();

		biometricDataImpl.setId(getId());
		biometricDataImpl.setGroupId(getGroupId());
		biometricDataImpl.setCompanyId(getCompanyId());
		biometricDataImpl.setUserId(getUserId());
		biometricDataImpl.setUserName(getUserName());
		biometricDataImpl.setCreateDate(getCreateDate());
		biometricDataImpl.setModifiedDate(getModifiedDate());
		biometricDataImpl.setCitizenId(getCitizenId());
		biometricDataImpl.setFingerType(getFingerType());
		biometricDataImpl.setRemark(getRemark());

		biometricDataImpl.resetOriginalValues();

		return biometricDataImpl;
	}

	@Override
	public int compareTo(BiometricData biometricData) {
		int value = 0;

		if (getCitizenId() < biometricData.getCitizenId()) {
			value = -1;
		}
		else if (getCitizenId() > biometricData.getCitizenId()) {
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

		if (!(obj instanceof BiometricData)) {
			return false;
		}

		BiometricData biometricData = (BiometricData)obj;

		long primaryKey = biometricData.getPrimaryKey();

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
		BiometricDataModelImpl biometricDataModelImpl = this;

		biometricDataModelImpl._setModifiedDate = false;

		biometricDataModelImpl._originalCitizenId = biometricDataModelImpl._citizenId;

		biometricDataModelImpl._setOriginalCitizenId = false;

		biometricDataModelImpl._fingerPrintBlobModel = null;

		biometricDataModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<BiometricData> toCacheModel() {
		BiometricDataCacheModel biometricDataCacheModel = new BiometricDataCacheModel();

		biometricDataCacheModel.id = getId();

		biometricDataCacheModel.groupId = getGroupId();

		biometricDataCacheModel.companyId = getCompanyId();

		biometricDataCacheModel.userId = getUserId();

		biometricDataCacheModel.userName = getUserName();

		String userName = biometricDataCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			biometricDataCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			biometricDataCacheModel.createDate = createDate.getTime();
		}
		else {
			biometricDataCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			biometricDataCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			biometricDataCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		biometricDataCacheModel.citizenId = getCitizenId();

		biometricDataCacheModel.fingerType = getFingerType();

		String fingerType = biometricDataCacheModel.fingerType;

		if ((fingerType != null) && (fingerType.length() == 0)) {
			biometricDataCacheModel.fingerType = null;
		}

		biometricDataCacheModel.Remark = getRemark();

		String Remark = biometricDataCacheModel.Remark;

		if ((Remark != null) && (Remark.length() == 0)) {
			biometricDataCacheModel.Remark = null;
		}

		return biometricDataCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", citizenId=");
		sb.append(getCitizenId());
		sb.append(", fingerType=");
		sb.append(getFingerType());
		sb.append(", Remark=");
		sb.append(getRemark());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("IdentificationDatabase.model.BiometricData");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
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
			"<column><column-name>fingerType</column-name><column-value><![CDATA[");
		sb.append(getFingerType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Remark</column-name><column-value><![CDATA[");
		sb.append(getRemark());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = BiometricData.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			BiometricData.class
		};
	private long _id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private long _citizenId;
	private long _originalCitizenId;
	private boolean _setOriginalCitizenId;
	private String _fingerType;
	private BiometricDataFingerPrintBlobModel _fingerPrintBlobModel;
	private String _Remark;
	private long _columnBitmask;
	private BiometricData _escapedModel;
}