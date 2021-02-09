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
 * The cache model class for representing Kebeles in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Kebeles
 * @generated
 */
@ProviderType
public class KebelesCacheModel implements CacheModel<Kebeles>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof KebelesCacheModel)) {
			return false;
		}

		KebelesCacheModel kebelesCacheModel = (KebelesCacheModel)obj;

		if (id == kebelesCacheModel.id) {
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
		StringBundler sb = new StringBundler(25);

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
		sb.append(", kebeleOr=");
		sb.append(kebeleOr);
		sb.append(", kebeleAm=");
		sb.append(kebeleAm);
		sb.append(", subcityOr=");
		sb.append(subcityOr);
		sb.append(", subcityAm=");
		sb.append(subcityAm);
		sb.append(", printername=");
		sb.append(printername);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Kebeles toEntityModel() {
		KebelesImpl kebelesImpl = new KebelesImpl();

		kebelesImpl.setId(id);
		kebelesImpl.setGroupId(groupId);
		kebelesImpl.setCompanyId(companyId);
		kebelesImpl.setUserId(userId);

		if (userName == null) {
			kebelesImpl.setUserName(StringPool.BLANK);
		}
		else {
			kebelesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			kebelesImpl.setCreateDate(null);
		}
		else {
			kebelesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			kebelesImpl.setModifiedDate(null);
		}
		else {
			kebelesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (kebeleOr == null) {
			kebelesImpl.setKebeleOr(StringPool.BLANK);
		}
		else {
			kebelesImpl.setKebeleOr(kebeleOr);
		}

		if (kebeleAm == null) {
			kebelesImpl.setKebeleAm(StringPool.BLANK);
		}
		else {
			kebelesImpl.setKebeleAm(kebeleAm);
		}

		if (subcityOr == null) {
			kebelesImpl.setSubcityOr(StringPool.BLANK);
		}
		else {
			kebelesImpl.setSubcityOr(subcityOr);
		}

		if (subcityAm == null) {
			kebelesImpl.setSubcityAm(StringPool.BLANK);
		}
		else {
			kebelesImpl.setSubcityAm(subcityAm);
		}

		if (printername == null) {
			kebelesImpl.setPrintername(StringPool.BLANK);
		}
		else {
			kebelesImpl.setPrintername(printername);
		}

		kebelesImpl.resetOriginalValues();

		return kebelesImpl;
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
		kebeleOr = objectInput.readUTF();
		kebeleAm = objectInput.readUTF();
		subcityOr = objectInput.readUTF();
		subcityAm = objectInput.readUTF();
		printername = objectInput.readUTF();
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

		if (kebeleOr == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kebeleOr);
		}

		if (kebeleAm == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kebeleAm);
		}

		if (subcityOr == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subcityOr);
		}

		if (subcityAm == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subcityAm);
		}

		if (printername == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(printername);
		}
	}

	public long id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String kebeleOr;
	public String kebeleAm;
	public String subcityOr;
	public String subcityAm;
	public String printername;
}