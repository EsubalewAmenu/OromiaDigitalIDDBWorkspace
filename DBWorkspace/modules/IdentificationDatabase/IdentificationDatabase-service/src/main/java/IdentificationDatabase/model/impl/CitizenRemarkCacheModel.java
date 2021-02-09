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

import IdentificationDatabase.model.CitizenRemark;

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
 * The cache model class for representing CitizenRemark in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CitizenRemark
 * @generated
 */
@ProviderType
public class CitizenRemarkCacheModel implements CacheModel<CitizenRemark>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CitizenRemarkCacheModel)) {
			return false;
		}

		CitizenRemarkCacheModel citizenRemarkCacheModel = (CitizenRemarkCacheModel)obj;

		if (id == citizenRemarkCacheModel.id) {
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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
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
		sb.append(", remark=");
		sb.append(remark);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CitizenRemark toEntityModel() {
		CitizenRemarkImpl citizenRemarkImpl = new CitizenRemarkImpl();

		citizenRemarkImpl.setId(id);
		citizenRemarkImpl.setCompanyId(companyId);
		citizenRemarkImpl.setUserId(userId);

		if (userName == null) {
			citizenRemarkImpl.setUserName(StringPool.BLANK);
		}
		else {
			citizenRemarkImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			citizenRemarkImpl.setCreateDate(null);
		}
		else {
			citizenRemarkImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			citizenRemarkImpl.setModifiedDate(null);
		}
		else {
			citizenRemarkImpl.setModifiedDate(new Date(modifiedDate));
		}

		citizenRemarkImpl.setCitizenId(citizenId);

		if (remark == null) {
			citizenRemarkImpl.setRemark(StringPool.BLANK);
		}
		else {
			citizenRemarkImpl.setRemark(remark);
		}

		citizenRemarkImpl.resetOriginalValues();

		return citizenRemarkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		citizenId = objectInput.readLong();
		remark = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

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

		if (remark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remark);
		}
	}

	public long id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long citizenId;
	public String remark;
}