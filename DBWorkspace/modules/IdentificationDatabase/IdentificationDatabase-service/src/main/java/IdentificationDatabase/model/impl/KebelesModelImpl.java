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

import IdentificationDatabase.model.Kebeles;
import IdentificationDatabase.model.KebelesModel;

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
 * The base model implementation for the Kebeles service. Represents a row in the &quot;ID_Kebeles&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link KebelesModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KebelesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KebelesImpl
 * @see Kebeles
 * @see KebelesModel
 * @generated
 */
@ProviderType
public class KebelesModelImpl extends BaseModelImpl<Kebeles>
	implements KebelesModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a kebeles model instance should use the {@link Kebeles} interface instead.
	 */
	public static final String TABLE_NAME = "ID_Kebeles";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "kebeleOr", Types.VARCHAR },
			{ "kebeleAm", Types.VARCHAR },
			{ "subcityOr", Types.VARCHAR },
			{ "subcityAm", Types.VARCHAR },
			{ "printername", Types.VARCHAR }
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
		TABLE_COLUMNS_MAP.put("kebeleOr", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("kebeleAm", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("subcityOr", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("subcityAm", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("printername", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table ID_Kebeles (id_ LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,kebeleOr VARCHAR(75) null,kebeleAm VARCHAR(75) null,subcityOr VARCHAR(75) null,subcityAm VARCHAR(75) null,printername VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table ID_Kebeles";
	public static final String ORDER_BY_JPQL = " ORDER BY kebeles.kebeleOr ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ID_Kebeles.kebeleOr ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.IdentificationDatabase.model.Kebeles"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.IdentificationDatabase.model.Kebeles"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.IdentificationDatabase.model.Kebeles"),
			true);
	public static final long ID_COLUMN_BITMASK = 1L;
	public static final long KEBELEAM_COLUMN_BITMASK = 2L;
	public static final long KEBELEOR_COLUMN_BITMASK = 4L;
	public static final long PRINTERNAME_COLUMN_BITMASK = 8L;
	public static final long SUBCITYAM_COLUMN_BITMASK = 16L;
	public static final long SUBCITYOR_COLUMN_BITMASK = 32L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(IdentificationDatabase.service.util.ServiceProps.get(
				"lock.expiration.time.IdentificationDatabase.model.Kebeles"));

	public KebelesModelImpl() {
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
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask |= ID_COLUMN_BITMASK;

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
	public String getKebeleOr() {
		if (_kebeleOr == null) {
			return StringPool.BLANK;
		}
		else {
			return _kebeleOr;
		}
	}

	@Override
	public void setKebeleOr(String kebeleOr) {
		_columnBitmask = -1L;

		if (_originalKebeleOr == null) {
			_originalKebeleOr = _kebeleOr;
		}

		_kebeleOr = kebeleOr;
	}

	public String getOriginalKebeleOr() {
		return GetterUtil.getString(_originalKebeleOr);
	}

	@Override
	public String getKebeleAm() {
		if (_kebeleAm == null) {
			return StringPool.BLANK;
		}
		else {
			return _kebeleAm;
		}
	}

	@Override
	public void setKebeleAm(String kebeleAm) {
		_columnBitmask |= KEBELEAM_COLUMN_BITMASK;

		if (_originalKebeleAm == null) {
			_originalKebeleAm = _kebeleAm;
		}

		_kebeleAm = kebeleAm;
	}

	public String getOriginalKebeleAm() {
		return GetterUtil.getString(_originalKebeleAm);
	}

	@Override
	public String getSubcityOr() {
		if (_subcityOr == null) {
			return StringPool.BLANK;
		}
		else {
			return _subcityOr;
		}
	}

	@Override
	public void setSubcityOr(String subcityOr) {
		_columnBitmask |= SUBCITYOR_COLUMN_BITMASK;

		if (_originalSubcityOr == null) {
			_originalSubcityOr = _subcityOr;
		}

		_subcityOr = subcityOr;
	}

	public String getOriginalSubcityOr() {
		return GetterUtil.getString(_originalSubcityOr);
	}

	@Override
	public String getSubcityAm() {
		if (_subcityAm == null) {
			return StringPool.BLANK;
		}
		else {
			return _subcityAm;
		}
	}

	@Override
	public void setSubcityAm(String subcityAm) {
		_columnBitmask |= SUBCITYAM_COLUMN_BITMASK;

		if (_originalSubcityAm == null) {
			_originalSubcityAm = _subcityAm;
		}

		_subcityAm = subcityAm;
	}

	public String getOriginalSubcityAm() {
		return GetterUtil.getString(_originalSubcityAm);
	}

	@Override
	public String getPrintername() {
		if (_printername == null) {
			return StringPool.BLANK;
		}
		else {
			return _printername;
		}
	}

	@Override
	public void setPrintername(String printername) {
		_columnBitmask |= PRINTERNAME_COLUMN_BITMASK;

		if (_originalPrintername == null) {
			_originalPrintername = _printername;
		}

		_printername = printername;
	}

	public String getOriginalPrintername() {
		return GetterUtil.getString(_originalPrintername);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Kebeles.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Kebeles toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Kebeles)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		KebelesImpl kebelesImpl = new KebelesImpl();

		kebelesImpl.setId(getId());
		kebelesImpl.setGroupId(getGroupId());
		kebelesImpl.setCompanyId(getCompanyId());
		kebelesImpl.setUserId(getUserId());
		kebelesImpl.setUserName(getUserName());
		kebelesImpl.setCreateDate(getCreateDate());
		kebelesImpl.setModifiedDate(getModifiedDate());
		kebelesImpl.setKebeleOr(getKebeleOr());
		kebelesImpl.setKebeleAm(getKebeleAm());
		kebelesImpl.setSubcityOr(getSubcityOr());
		kebelesImpl.setSubcityAm(getSubcityAm());
		kebelesImpl.setPrintername(getPrintername());

		kebelesImpl.resetOriginalValues();

		return kebelesImpl;
	}

	@Override
	public int compareTo(Kebeles kebeles) {
		int value = 0;

		value = getKebeleOr().compareTo(kebeles.getKebeleOr());

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

		if (!(obj instanceof Kebeles)) {
			return false;
		}

		Kebeles kebeles = (Kebeles)obj;

		long primaryKey = kebeles.getPrimaryKey();

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
		KebelesModelImpl kebelesModelImpl = this;

		kebelesModelImpl._originalId = kebelesModelImpl._id;

		kebelesModelImpl._setOriginalId = false;

		kebelesModelImpl._setModifiedDate = false;

		kebelesModelImpl._originalKebeleOr = kebelesModelImpl._kebeleOr;

		kebelesModelImpl._originalKebeleAm = kebelesModelImpl._kebeleAm;

		kebelesModelImpl._originalSubcityOr = kebelesModelImpl._subcityOr;

		kebelesModelImpl._originalSubcityAm = kebelesModelImpl._subcityAm;

		kebelesModelImpl._originalPrintername = kebelesModelImpl._printername;

		kebelesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Kebeles> toCacheModel() {
		KebelesCacheModel kebelesCacheModel = new KebelesCacheModel();

		kebelesCacheModel.id = getId();

		kebelesCacheModel.groupId = getGroupId();

		kebelesCacheModel.companyId = getCompanyId();

		kebelesCacheModel.userId = getUserId();

		kebelesCacheModel.userName = getUserName();

		String userName = kebelesCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			kebelesCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			kebelesCacheModel.createDate = createDate.getTime();
		}
		else {
			kebelesCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			kebelesCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			kebelesCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		kebelesCacheModel.kebeleOr = getKebeleOr();

		String kebeleOr = kebelesCacheModel.kebeleOr;

		if ((kebeleOr != null) && (kebeleOr.length() == 0)) {
			kebelesCacheModel.kebeleOr = null;
		}

		kebelesCacheModel.kebeleAm = getKebeleAm();

		String kebeleAm = kebelesCacheModel.kebeleAm;

		if ((kebeleAm != null) && (kebeleAm.length() == 0)) {
			kebelesCacheModel.kebeleAm = null;
		}

		kebelesCacheModel.subcityOr = getSubcityOr();

		String subcityOr = kebelesCacheModel.subcityOr;

		if ((subcityOr != null) && (subcityOr.length() == 0)) {
			kebelesCacheModel.subcityOr = null;
		}

		kebelesCacheModel.subcityAm = getSubcityAm();

		String subcityAm = kebelesCacheModel.subcityAm;

		if ((subcityAm != null) && (subcityAm.length() == 0)) {
			kebelesCacheModel.subcityAm = null;
		}

		kebelesCacheModel.printername = getPrintername();

		String printername = kebelesCacheModel.printername;

		if ((printername != null) && (printername.length() == 0)) {
			kebelesCacheModel.printername = null;
		}

		return kebelesCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

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
		sb.append(", kebeleOr=");
		sb.append(getKebeleOr());
		sb.append(", kebeleAm=");
		sb.append(getKebeleAm());
		sb.append(", subcityOr=");
		sb.append(getSubcityOr());
		sb.append(", subcityAm=");
		sb.append(getSubcityAm());
		sb.append(", printername=");
		sb.append(getPrintername());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("IdentificationDatabase.model.Kebeles");
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
			"<column><column-name>kebeleOr</column-name><column-value><![CDATA[");
		sb.append(getKebeleOr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kebeleAm</column-name><column-value><![CDATA[");
		sb.append(getKebeleAm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subcityOr</column-name><column-value><![CDATA[");
		sb.append(getSubcityOr());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subcityAm</column-name><column-value><![CDATA[");
		sb.append(getSubcityAm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>printername</column-name><column-value><![CDATA[");
		sb.append(getPrintername());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Kebeles.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Kebeles.class
		};
	private long _id;
	private long _originalId;
	private boolean _setOriginalId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _kebeleOr;
	private String _originalKebeleOr;
	private String _kebeleAm;
	private String _originalKebeleAm;
	private String _subcityOr;
	private String _originalSubcityOr;
	private String _subcityAm;
	private String _originalSubcityAm;
	private String _printername;
	private String _originalPrintername;
	private long _columnBitmask;
	private Kebeles _escapedModel;
}