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
 * The base model interface for the PrintedHistory service. Represents a row in the &quot;ID_PrintedHistory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link IdentificationDatabase.model.impl.PrintedHistoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link IdentificationDatabase.model.impl.PrintedHistoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PrintedHistory
 * @see IdentificationDatabase.model.impl.PrintedHistoryImpl
 * @see IdentificationDatabase.model.impl.PrintedHistoryModelImpl
 * @generated
 */
@ProviderType
public interface PrintedHistoryModel extends AuditedModel,
	BaseModel<PrintedHistory>, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a printed history model instance should use the {@link PrintedHistory} interface instead.
	 */

	/**
	 * Returns the primary key of this printed history.
	 *
	 * @return the primary key of this printed history
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this printed history.
	 *
	 * @param primaryKey the primary key of this printed history
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this printed history.
	 *
	 * @return the ID of this printed history
	 */
	public long getId();

	/**
	 * Sets the ID of this printed history.
	 *
	 * @param id the ID of this printed history
	 */
	public void setId(long id);

	/**
	 * Returns the company ID of this printed history.
	 *
	 * @return the company ID of this printed history
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this printed history.
	 *
	 * @param companyId the company ID of this printed history
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this printed history.
	 *
	 * @return the user ID of this printed history
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this printed history.
	 *
	 * @param userId the user ID of this printed history
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this printed history.
	 *
	 * @return the user uuid of this printed history
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this printed history.
	 *
	 * @param userUuid the user uuid of this printed history
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this printed history.
	 *
	 * @return the user name of this printed history
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this printed history.
	 *
	 * @param userName the user name of this printed history
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this printed history.
	 *
	 * @return the create date of this printed history
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this printed history.
	 *
	 * @param createDate the create date of this printed history
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this printed history.
	 *
	 * @return the modified date of this printed history
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this printed history.
	 *
	 * @param modifiedDate the modified date of this printed history
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the citizen ID of this printed history.
	 *
	 * @return the citizen ID of this printed history
	 */
	public long getCitizenId();

	/**
	 * Sets the citizen ID of this printed history.
	 *
	 * @param citizenId the citizen ID of this printed history
	 */
	public void setCitizenId(long citizenId);

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
		IdentificationDatabase.model.PrintedHistory printedHistory);

	@Override
	public int hashCode();

	@Override
	public CacheModel<IdentificationDatabase.model.PrintedHistory> toCacheModel();

	@Override
	public IdentificationDatabase.model.PrintedHistory toEscapedModel();

	@Override
	public IdentificationDatabase.model.PrintedHistory toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}