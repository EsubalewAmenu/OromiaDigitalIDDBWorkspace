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

import IdentificationDatabase.model.TransferToOtherCity;
import IdentificationDatabase.model.TransferToOtherCityModel;

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
 * The base model implementation for the TransferToOtherCity service. Represents a row in the &quot;ID_TransferToOtherCity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link TransferToOtherCityModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TransferToOtherCityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TransferToOtherCityImpl
 * @see TransferToOtherCity
 * @see TransferToOtherCityModel
 * @generated
 */
@ProviderType
public class TransferToOtherCityModelImpl extends BaseModelImpl<TransferToOtherCity>
	implements TransferToOtherCityModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a transfer to other city model instance should use the {@link TransferToOtherCity} interface instead.
	 */
	public static final String TABLE_NAME = "ID_TransferToOtherCity";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "tocity", Types.VARCHAR },
			{ "fromcity", Types.VARCHAR },
			{ "subcity", Types.VARCHAR },
			{ "kebele", Types.VARCHAR },
			{ "fullname", Types.VARCHAR },
			{ "mothername", Types.VARCHAR },
			{ "citizenId", Types.BIGINT },
			{ "birthdate", Types.TIMESTAMP },
			{ "houseNo", Types.VARCHAR },
			{ "isOwner", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "reason", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("tocity", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fromcity", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("subcity", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("kebele", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fullname", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("mothername", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("citizenId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("birthdate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("houseNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("isOwner", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phone", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("reason", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table ID_TransferToOtherCity (id_ LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,tocity VARCHAR(75) null,fromcity VARCHAR(75) null,subcity VARCHAR(75) null,kebele VARCHAR(75) null,fullname VARCHAR(75) null,mothername VARCHAR(75) null,citizenId LONG,birthdate DATE null,houseNo VARCHAR(75) null,isOwner VARCHAR(75) null,phone VARCHAR(75) null,reason VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table ID_TransferToOtherCity";
	public static final String ORDER_BY_JPQL = " ORDER BY transferToOtherCity.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY ID_TransferToOtherCity.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.IdentificationDatabase.model.TransferToOtherCity"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.IdentificationDatabase.model.TransferToOtherCity"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(IdentificationDatabase.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.IdentificationDatabase.model.TransferToOtherCity"),
			true);
	public static final long CITIZENID_COLUMN_BITMASK = 1L;
	public static final long ID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(IdentificationDatabase.service.util.ServiceProps.get(
				"lock.expiration.time.IdentificationDatabase.model.TransferToOtherCity"));

	public TransferToOtherCityModelImpl() {
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
		return TransferToOtherCity.class;
	}

	@Override
	public String getModelClassName() {
		return TransferToOtherCity.class.getName();
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
		attributes.put("tocity", getTocity());
		attributes.put("fromcity", getFromcity());
		attributes.put("subcity", getSubcity());
		attributes.put("kebele", getKebele());
		attributes.put("fullname", getFullname());
		attributes.put("mothername", getMothername());
		attributes.put("citizenId", getCitizenId());
		attributes.put("birthdate", getBirthdate());
		attributes.put("houseNo", getHouseNo());
		attributes.put("isOwner", getIsOwner());
		attributes.put("phone", getPhone());
		attributes.put("reason", getReason());

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

		String tocity = (String)attributes.get("tocity");

		if (tocity != null) {
			setTocity(tocity);
		}

		String fromcity = (String)attributes.get("fromcity");

		if (fromcity != null) {
			setFromcity(fromcity);
		}

		String subcity = (String)attributes.get("subcity");

		if (subcity != null) {
			setSubcity(subcity);
		}

		String kebele = (String)attributes.get("kebele");

		if (kebele != null) {
			setKebele(kebele);
		}

		String fullname = (String)attributes.get("fullname");

		if (fullname != null) {
			setFullname(fullname);
		}

		String mothername = (String)attributes.get("mothername");

		if (mothername != null) {
			setMothername(mothername);
		}

		Long citizenId = (Long)attributes.get("citizenId");

		if (citizenId != null) {
			setCitizenId(citizenId);
		}

		Date birthdate = (Date)attributes.get("birthdate");

		if (birthdate != null) {
			setBirthdate(birthdate);
		}

		String houseNo = (String)attributes.get("houseNo");

		if (houseNo != null) {
			setHouseNo(houseNo);
		}

		String isOwner = (String)attributes.get("isOwner");

		if (isOwner != null) {
			setIsOwner(isOwner);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String reason = (String)attributes.get("reason");

		if (reason != null) {
			setReason(reason);
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
	public String getTocity() {
		if (_tocity == null) {
			return StringPool.BLANK;
		}
		else {
			return _tocity;
		}
	}

	@Override
	public void setTocity(String tocity) {
		_tocity = tocity;
	}

	@Override
	public String getFromcity() {
		if (_fromcity == null) {
			return StringPool.BLANK;
		}
		else {
			return _fromcity;
		}
	}

	@Override
	public void setFromcity(String fromcity) {
		_fromcity = fromcity;
	}

	@Override
	public String getSubcity() {
		if (_subcity == null) {
			return StringPool.BLANK;
		}
		else {
			return _subcity;
		}
	}

	@Override
	public void setSubcity(String subcity) {
		_subcity = subcity;
	}

	@Override
	public String getKebele() {
		if (_kebele == null) {
			return StringPool.BLANK;
		}
		else {
			return _kebele;
		}
	}

	@Override
	public void setKebele(String kebele) {
		_kebele = kebele;
	}

	@Override
	public String getFullname() {
		if (_fullname == null) {
			return StringPool.BLANK;
		}
		else {
			return _fullname;
		}
	}

	@Override
	public void setFullname(String fullname) {
		_fullname = fullname;
	}

	@Override
	public String getMothername() {
		if (_mothername == null) {
			return StringPool.BLANK;
		}
		else {
			return _mothername;
		}
	}

	@Override
	public void setMothername(String mothername) {
		_mothername = mothername;
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
	public Date getBirthdate() {
		return _birthdate;
	}

	@Override
	public void setBirthdate(Date birthdate) {
		_birthdate = birthdate;
	}

	@Override
	public String getHouseNo() {
		if (_houseNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _houseNo;
		}
	}

	@Override
	public void setHouseNo(String houseNo) {
		_houseNo = houseNo;
	}

	@Override
	public String getIsOwner() {
		if (_isOwner == null) {
			return StringPool.BLANK;
		}
		else {
			return _isOwner;
		}
	}

	@Override
	public void setIsOwner(String isOwner) {
		_isOwner = isOwner;
	}

	@Override
	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	@Override
	public void setPhone(String phone) {
		_phone = phone;
	}

	@Override
	public String getReason() {
		if (_reason == null) {
			return StringPool.BLANK;
		}
		else {
			return _reason;
		}
	}

	@Override
	public void setReason(String reason) {
		_reason = reason;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			TransferToOtherCity.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TransferToOtherCity toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (TransferToOtherCity)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TransferToOtherCityImpl transferToOtherCityImpl = new TransferToOtherCityImpl();

		transferToOtherCityImpl.setId(getId());
		transferToOtherCityImpl.setCompanyId(getCompanyId());
		transferToOtherCityImpl.setUserId(getUserId());
		transferToOtherCityImpl.setUserName(getUserName());
		transferToOtherCityImpl.setCreateDate(getCreateDate());
		transferToOtherCityImpl.setModifiedDate(getModifiedDate());
		transferToOtherCityImpl.setTocity(getTocity());
		transferToOtherCityImpl.setFromcity(getFromcity());
		transferToOtherCityImpl.setSubcity(getSubcity());
		transferToOtherCityImpl.setKebele(getKebele());
		transferToOtherCityImpl.setFullname(getFullname());
		transferToOtherCityImpl.setMothername(getMothername());
		transferToOtherCityImpl.setCitizenId(getCitizenId());
		transferToOtherCityImpl.setBirthdate(getBirthdate());
		transferToOtherCityImpl.setHouseNo(getHouseNo());
		transferToOtherCityImpl.setIsOwner(getIsOwner());
		transferToOtherCityImpl.setPhone(getPhone());
		transferToOtherCityImpl.setReason(getReason());

		transferToOtherCityImpl.resetOriginalValues();

		return transferToOtherCityImpl;
	}

	@Override
	public int compareTo(TransferToOtherCity transferToOtherCity) {
		int value = 0;

		if (getId() < transferToOtherCity.getId()) {
			value = -1;
		}
		else if (getId() > transferToOtherCity.getId()) {
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

		if (!(obj instanceof TransferToOtherCity)) {
			return false;
		}

		TransferToOtherCity transferToOtherCity = (TransferToOtherCity)obj;

		long primaryKey = transferToOtherCity.getPrimaryKey();

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
		TransferToOtherCityModelImpl transferToOtherCityModelImpl = this;

		transferToOtherCityModelImpl._originalId = transferToOtherCityModelImpl._id;

		transferToOtherCityModelImpl._setOriginalId = false;

		transferToOtherCityModelImpl._setModifiedDate = false;

		transferToOtherCityModelImpl._originalCitizenId = transferToOtherCityModelImpl._citizenId;

		transferToOtherCityModelImpl._setOriginalCitizenId = false;

		transferToOtherCityModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<TransferToOtherCity> toCacheModel() {
		TransferToOtherCityCacheModel transferToOtherCityCacheModel = new TransferToOtherCityCacheModel();

		transferToOtherCityCacheModel.id = getId();

		transferToOtherCityCacheModel.companyId = getCompanyId();

		transferToOtherCityCacheModel.userId = getUserId();

		transferToOtherCityCacheModel.userName = getUserName();

		String userName = transferToOtherCityCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			transferToOtherCityCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			transferToOtherCityCacheModel.createDate = createDate.getTime();
		}
		else {
			transferToOtherCityCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			transferToOtherCityCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			transferToOtherCityCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		transferToOtherCityCacheModel.tocity = getTocity();

		String tocity = transferToOtherCityCacheModel.tocity;

		if ((tocity != null) && (tocity.length() == 0)) {
			transferToOtherCityCacheModel.tocity = null;
		}

		transferToOtherCityCacheModel.fromcity = getFromcity();

		String fromcity = transferToOtherCityCacheModel.fromcity;

		if ((fromcity != null) && (fromcity.length() == 0)) {
			transferToOtherCityCacheModel.fromcity = null;
		}

		transferToOtherCityCacheModel.subcity = getSubcity();

		String subcity = transferToOtherCityCacheModel.subcity;

		if ((subcity != null) && (subcity.length() == 0)) {
			transferToOtherCityCacheModel.subcity = null;
		}

		transferToOtherCityCacheModel.kebele = getKebele();

		String kebele = transferToOtherCityCacheModel.kebele;

		if ((kebele != null) && (kebele.length() == 0)) {
			transferToOtherCityCacheModel.kebele = null;
		}

		transferToOtherCityCacheModel.fullname = getFullname();

		String fullname = transferToOtherCityCacheModel.fullname;

		if ((fullname != null) && (fullname.length() == 0)) {
			transferToOtherCityCacheModel.fullname = null;
		}

		transferToOtherCityCacheModel.mothername = getMothername();

		String mothername = transferToOtherCityCacheModel.mothername;

		if ((mothername != null) && (mothername.length() == 0)) {
			transferToOtherCityCacheModel.mothername = null;
		}

		transferToOtherCityCacheModel.citizenId = getCitizenId();

		Date birthdate = getBirthdate();

		if (birthdate != null) {
			transferToOtherCityCacheModel.birthdate = birthdate.getTime();
		}
		else {
			transferToOtherCityCacheModel.birthdate = Long.MIN_VALUE;
		}

		transferToOtherCityCacheModel.houseNo = getHouseNo();

		String houseNo = transferToOtherCityCacheModel.houseNo;

		if ((houseNo != null) && (houseNo.length() == 0)) {
			transferToOtherCityCacheModel.houseNo = null;
		}

		transferToOtherCityCacheModel.isOwner = getIsOwner();

		String isOwner = transferToOtherCityCacheModel.isOwner;

		if ((isOwner != null) && (isOwner.length() == 0)) {
			transferToOtherCityCacheModel.isOwner = null;
		}

		transferToOtherCityCacheModel.phone = getPhone();

		String phone = transferToOtherCityCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			transferToOtherCityCacheModel.phone = null;
		}

		transferToOtherCityCacheModel.reason = getReason();

		String reason = transferToOtherCityCacheModel.reason;

		if ((reason != null) && (reason.length() == 0)) {
			transferToOtherCityCacheModel.reason = null;
		}

		return transferToOtherCityCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{id=");
		sb.append(getId());
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
		sb.append(", tocity=");
		sb.append(getTocity());
		sb.append(", fromcity=");
		sb.append(getFromcity());
		sb.append(", subcity=");
		sb.append(getSubcity());
		sb.append(", kebele=");
		sb.append(getKebele());
		sb.append(", fullname=");
		sb.append(getFullname());
		sb.append(", mothername=");
		sb.append(getMothername());
		sb.append(", citizenId=");
		sb.append(getCitizenId());
		sb.append(", birthdate=");
		sb.append(getBirthdate());
		sb.append(", houseNo=");
		sb.append(getHouseNo());
		sb.append(", isOwner=");
		sb.append(getIsOwner());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", reason=");
		sb.append(getReason());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(58);

		sb.append("<model><model-name>");
		sb.append("IdentificationDatabase.model.TransferToOtherCity");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>tocity</column-name><column-value><![CDATA[");
		sb.append(getTocity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromcity</column-name><column-value><![CDATA[");
		sb.append(getFromcity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subcity</column-name><column-value><![CDATA[");
		sb.append(getSubcity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>kebele</column-name><column-value><![CDATA[");
		sb.append(getKebele());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullname</column-name><column-value><![CDATA[");
		sb.append(getFullname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mothername</column-name><column-value><![CDATA[");
		sb.append(getMothername());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>citizenId</column-name><column-value><![CDATA[");
		sb.append(getCitizenId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthdate</column-name><column-value><![CDATA[");
		sb.append(getBirthdate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>houseNo</column-name><column-value><![CDATA[");
		sb.append(getHouseNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isOwner</column-name><column-value><![CDATA[");
		sb.append(getIsOwner());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>reason</column-name><column-value><![CDATA[");
		sb.append(getReason());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = TransferToOtherCity.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			TransferToOtherCity.class
		};
	private long _id;
	private long _originalId;
	private boolean _setOriginalId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _tocity;
	private String _fromcity;
	private String _subcity;
	private String _kebele;
	private String _fullname;
	private String _mothername;
	private long _citizenId;
	private long _originalCitizenId;
	private boolean _setOriginalCitizenId;
	private Date _birthdate;
	private String _houseNo;
	private String _isOwner;
	private String _phone;
	private String _reason;
	private long _columnBitmask;
	private TransferToOtherCity _escapedModel;
}