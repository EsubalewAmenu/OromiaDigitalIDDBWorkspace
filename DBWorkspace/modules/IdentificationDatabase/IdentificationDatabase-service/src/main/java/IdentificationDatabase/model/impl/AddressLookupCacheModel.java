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

import IdentificationDatabase.model.AddressLookup;

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
 * The cache model class for representing AddressLookup in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AddressLookup
 * @generated
 */
@ProviderType
public class AddressLookupCacheModel implements CacheModel<AddressLookup>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AddressLookupCacheModel)) {
			return false;
		}

		AddressLookupCacheModel addressLookupCacheModel = (AddressLookupCacheModel)obj;

		if (id == addressLookupCacheModel.id) {
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
		StringBundler sb = new StringBundler(29);

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
		sb.append(", code=");
		sb.append(code);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", parentId=");
		sb.append(parentId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", level=");
		sb.append(level);
		sb.append(", description=");
		sb.append(description);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AddressLookup toEntityModel() {
		AddressLookupImpl addressLookupImpl = new AddressLookupImpl();

		addressLookupImpl.setId(id);
		addressLookupImpl.setGroupId(groupId);
		addressLookupImpl.setCompanyId(companyId);
		addressLookupImpl.setUserId(userId);

		if (userName == null) {
			addressLookupImpl.setUserName(StringPool.BLANK);
		}
		else {
			addressLookupImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			addressLookupImpl.setCreateDate(null);
		}
		else {
			addressLookupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			addressLookupImpl.setModifiedDate(null);
		}
		else {
			addressLookupImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (code == null) {
			addressLookupImpl.setCode(StringPool.BLANK);
		}
		else {
			addressLookupImpl.setCode(code);
		}

		addressLookupImpl.setOrganizationId(organizationId);
		addressLookupImpl.setParentId(parentId);

		if (name == null) {
			addressLookupImpl.setName(StringPool.BLANK);
		}
		else {
			addressLookupImpl.setName(name);
		}

		if (level == null) {
			addressLookupImpl.setLevel(StringPool.BLANK);
		}
		else {
			addressLookupImpl.setLevel(level);
		}

		if (description == null) {
			addressLookupImpl.setDescription(StringPool.BLANK);
		}
		else {
			addressLookupImpl.setDescription(description);
		}

		addressLookupImpl.setStatus(status);

		addressLookupImpl.resetOriginalValues();

		return addressLookupImpl;
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
		code = objectInput.readUTF();

		organizationId = objectInput.readLong();

		parentId = objectInput.readLong();
		name = objectInput.readUTF();
		level = objectInput.readUTF();
		description = objectInput.readUTF();

		status = objectInput.readInt();
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

		if (code == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(code);
		}

		objectOutput.writeLong(organizationId);

		objectOutput.writeLong(parentId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (level == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(level);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeInt(status);
	}

	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String code;
	public long organizationId;
	public long parentId;
	public String name;
	public String level;
	public String description;
	public int status;
}