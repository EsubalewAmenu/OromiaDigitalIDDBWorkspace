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

import IdentificationDatabase.model.Settings;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Settings in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Settings
 * @generated
 */
@ProviderType
public class SettingsCacheModel implements CacheModel<Settings>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SettingsCacheModel)) {
			return false;
		}

		SettingsCacheModel settingsCacheModel = (SettingsCacheModel)obj;

		if (id == settingsCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", assignedUserId=");
		sb.append(assignedUserId);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", roleId=");
		sb.append(roleId);
		sb.append(", remark=");
		sb.append(remark);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Settings toEntityModel() {
		SettingsImpl settingsImpl = new SettingsImpl();

		settingsImpl.setId(id);
		settingsImpl.setGroupId(groupId);
		settingsImpl.setCompanyId(companyId);
		settingsImpl.setUserId(userId);

		if (userName == null) {
			settingsImpl.setUserName(StringPool.BLANK);
		}
		else {
			settingsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			settingsImpl.setCreateDate(null);
		}
		else {
			settingsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			settingsImpl.setModifiedDate(null);
		}
		else {
			settingsImpl.setModifiedDate(new Date(modifiedDate));
		}

		settingsImpl.setAssignedUserId(assignedUserId);
		settingsImpl.setOrganizationId(organizationId);
		settingsImpl.setRoleId(roleId);

		if (remark == null) {
			settingsImpl.setRemark(StringPool.BLANK);
		}
		else {
			settingsImpl.setRemark(remark);
		}

		settingsImpl.resetOriginalValues();

		return settingsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		assignedUserId = objectInput.readLong();

		organizationId = objectInput.readLong();

		roleId = objectInput.readLong();
		remark = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(assignedUserId);

		objectOutput.writeLong(organizationId);

		objectOutput.writeLong(roleId);

		if (remark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remark);
		}
	}

	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long assignedUserId;
	public long organizationId;
	public long roleId;
	public String remark;
}