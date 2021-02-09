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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TransferToOtherCity service. Represents a row in the &quot;ID_TransferToOtherCity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link IdentificationDatabase.model.impl.TransferToOtherCityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link IdentificationDatabase.model.impl.TransferToOtherCityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TransferToOtherCity
 * @see IdentificationDatabase.model.impl.TransferToOtherCityImpl
 * @see IdentificationDatabase.model.impl.TransferToOtherCityModelImpl
 * @generated
 */
@ProviderType
public interface TransferToOtherCityModel extends AuditedModel,
	BaseModel<TransferToOtherCity>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a transfer to other city model instance should use the {@link TransferToOtherCity} interface instead.
	 */

	/**
	 * Returns the primary key of this transfer to other city.
	 *
	 * @return the primary key of this transfer to other city
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this transfer to other city.
	 *
	 * @param primaryKey the primary key of this transfer to other city
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this transfer to other city.
	 *
	 * @return the ID of this transfer to other city
	 */
	public long getId();

	/**
	 * Sets the ID of this transfer to other city.
	 *
	 * @param id the ID of this transfer to other city
	 */
	public void setId(long id);

	/**
	 * Returns the company ID of this transfer to other city.
	 *
	 * @return the company ID of this transfer to other city
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this transfer to other city.
	 *
	 * @param companyId the company ID of this transfer to other city
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this transfer to other city.
	 *
	 * @return the user ID of this transfer to other city
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this transfer to other city.
	 *
	 * @param userId the user ID of this transfer to other city
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this transfer to other city.
	 *
	 * @return the user uuid of this transfer to other city
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this transfer to other city.
	 *
	 * @param userUuid the user uuid of this transfer to other city
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this transfer to other city.
	 *
	 * @return the user name of this transfer to other city
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this transfer to other city.
	 *
	 * @param userName the user name of this transfer to other city
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this transfer to other city.
	 *
	 * @return the create date of this transfer to other city
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this transfer to other city.
	 *
	 * @param createDate the create date of this transfer to other city
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this transfer to other city.
	 *
	 * @return the modified date of this transfer to other city
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this transfer to other city.
	 *
	 * @param modifiedDate the modified date of this transfer to other city
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the tocity of this transfer to other city.
	 *
	 * @return the tocity of this transfer to other city
	 */
	@AutoEscape
	public String getTocity();

	/**
	 * Sets the tocity of this transfer to other city.
	 *
	 * @param tocity the tocity of this transfer to other city
	 */
	public void setTocity(String tocity);

	/**
	 * Returns the fromcity of this transfer to other city.
	 *
	 * @return the fromcity of this transfer to other city
	 */
	@AutoEscape
	public String getFromcity();

	/**
	 * Sets the fromcity of this transfer to other city.
	 *
	 * @param fromcity the fromcity of this transfer to other city
	 */
	public void setFromcity(String fromcity);

	/**
	 * Returns the subcity of this transfer to other city.
	 *
	 * @return the subcity of this transfer to other city
	 */
	@AutoEscape
	public String getSubcity();

	/**
	 * Sets the subcity of this transfer to other city.
	 *
	 * @param subcity the subcity of this transfer to other city
	 */
	public void setSubcity(String subcity);

	/**
	 * Returns the kebele of this transfer to other city.
	 *
	 * @return the kebele of this transfer to other city
	 */
	@AutoEscape
	public String getKebele();

	/**
	 * Sets the kebele of this transfer to other city.
	 *
	 * @param kebele the kebele of this transfer to other city
	 */
	public void setKebele(String kebele);

	/**
	 * Returns the fullname of this transfer to other city.
	 *
	 * @return the fullname of this transfer to other city
	 */
	@AutoEscape
	public String getFullname();

	/**
	 * Sets the fullname of this transfer to other city.
	 *
	 * @param fullname the fullname of this transfer to other city
	 */
	public void setFullname(String fullname);

	/**
	 * Returns the mothername of this transfer to other city.
	 *
	 * @return the mothername of this transfer to other city
	 */
	@AutoEscape
	public String getMothername();

	/**
	 * Sets the mothername of this transfer to other city.
	 *
	 * @param mothername the mothername of this transfer to other city
	 */
	public void setMothername(String mothername);

	/**
	 * Returns the citizen ID of this transfer to other city.
	 *
	 * @return the citizen ID of this transfer to other city
	 */
	public long getCitizenId();

	/**
	 * Sets the citizen ID of this transfer to other city.
	 *
	 * @param citizenId the citizen ID of this transfer to other city
	 */
	public void setCitizenId(long citizenId);

	/**
	 * Returns the birthdate of this transfer to other city.
	 *
	 * @return the birthdate of this transfer to other city
	 */
	public Date getBirthdate();

	/**
	 * Sets the birthdate of this transfer to other city.
	 *
	 * @param birthdate the birthdate of this transfer to other city
	 */
	public void setBirthdate(Date birthdate);

	/**
	 * Returns the house no of this transfer to other city.
	 *
	 * @return the house no of this transfer to other city
	 */
	@AutoEscape
	public String getHouseNo();

	/**
	 * Sets the house no of this transfer to other city.
	 *
	 * @param houseNo the house no of this transfer to other city
	 */
	public void setHouseNo(String houseNo);

	/**
	 * Returns the is owner of this transfer to other city.
	 *
	 * @return the is owner of this transfer to other city
	 */
	@AutoEscape
	public String getIsOwner();

	/**
	 * Sets the is owner of this transfer to other city.
	 *
	 * @param isOwner the is owner of this transfer to other city
	 */
	public void setIsOwner(String isOwner);

	/**
	 * Returns the phone of this transfer to other city.
	 *
	 * @return the phone of this transfer to other city
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this transfer to other city.
	 *
	 * @param phone the phone of this transfer to other city
	 */
	public void setPhone(String phone);

	/**
	 * Returns the reason of this transfer to other city.
	 *
	 * @return the reason of this transfer to other city
	 */
	@AutoEscape
	public String getReason();

	/**
	 * Sets the reason of this transfer to other city.
	 *
	 * @param reason the reason of this transfer to other city
	 */
	public void setReason(String reason);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		IdentificationDatabase.model.TransferToOtherCity transferToOtherCity);

	@Override
	public int hashCode();

	@Override
	public CacheModel<IdentificationDatabase.model.TransferToOtherCity> toCacheModel();

	@Override
	public IdentificationDatabase.model.TransferToOtherCity toEscapedModel();

	@Override
	public IdentificationDatabase.model.TransferToOtherCity toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}