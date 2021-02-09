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

import IdentificationDatabase.model.PrintedHistory;

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
 * The cache model class for representing PrintedHistory in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PrintedHistory
 * @generated
 */
@ProviderType
public class PrintedHistoryCacheModel implements CacheModel<PrintedHistory>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PrintedHistoryCacheModel)) {
			return false;
		}

		PrintedHistoryCacheModel printedHistoryCacheModel = (PrintedHistoryCacheModel)obj;

		if (id == printedHistoryCacheModel.id) {
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
		StringBundler sb = new StringBundler(15);

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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PrintedHistory toEntityModel() {
		PrintedHistoryImpl printedHistoryImpl = new PrintedHistoryImpl();

		printedHistoryImpl.setId(id);
		printedHistoryImpl.setCompanyId(companyId);
		printedHistoryImpl.setUserId(userId);

		if (userName == null) {
			printedHistoryImpl.setUserName(StringPool.BLANK);
		}
		else {
			printedHistoryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			printedHistoryImpl.setCreateDate(null);
		}
		else {
			printedHistoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			printedHistoryImpl.setModifiedDate(null);
		}
		else {
			printedHistoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		printedHistoryImpl.setCitizenId(citizenId);

		printedHistoryImpl.resetOriginalValues();

		return printedHistoryImpl;
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
	}

	public long id;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long citizenId;
}