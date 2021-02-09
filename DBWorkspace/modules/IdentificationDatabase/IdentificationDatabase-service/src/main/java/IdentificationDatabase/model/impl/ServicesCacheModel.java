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

import IdentificationDatabase.model.Services;

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
 * The cache model class for representing Services in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Services
 * @generated
 */
@ProviderType
public class ServicesCacheModel implements CacheModel<Services>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicesCacheModel)) {
			return false;
		}

		ServicesCacheModel servicesCacheModel = (ServicesCacheModel)obj;

		if (id == servicesCacheModel.id) {
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
		StringBundler sb = new StringBundler(21);

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
		sb.append(", citizenId=");
		sb.append(citizenId);
		sb.append(", service=");
		sb.append(service);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Services toEntityModel() {
		ServicesImpl servicesImpl = new ServicesImpl();

		servicesImpl.setId(id);
		servicesImpl.setGroupId(groupId);
		servicesImpl.setCompanyId(companyId);
		servicesImpl.setUserId(userId);

		if (userName == null) {
			servicesImpl.setUserName(StringPool.BLANK);
		}
		else {
			servicesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			servicesImpl.setCreateDate(null);
		}
		else {
			servicesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			servicesImpl.setModifiedDate(null);
		}
		else {
			servicesImpl.setModifiedDate(new Date(modifiedDate));
		}

		servicesImpl.setCitizenId(citizenId);

		if (service == null) {
			servicesImpl.setService(StringPool.BLANK);
		}
		else {
			servicesImpl.setService(service);
		}

		servicesImpl.setStatus(status);

		servicesImpl.resetOriginalValues();

		return servicesImpl;
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

		citizenId = objectInput.readLong();
		service = objectInput.readUTF();

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

		objectOutput.writeLong(citizenId);

		if (service == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(service);
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
	public long citizenId;
	public String service;
	public int status;
}