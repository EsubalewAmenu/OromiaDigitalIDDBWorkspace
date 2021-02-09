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

import IdentificationDatabase.model.CitizenFingerprintMatcher;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CitizenFingerprintMatcher in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CitizenFingerprintMatcher
 * @generated
 */
@ProviderType
public class CitizenFingerprintMatcherCacheModel implements CacheModel<CitizenFingerprintMatcher>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CitizenFingerprintMatcherCacheModel)) {
			return false;
		}

		CitizenFingerprintMatcherCacheModel citizenFingerprintMatcherCacheModel = (CitizenFingerprintMatcherCacheModel)obj;

		if (id == citizenFingerprintMatcherCacheModel.id) {
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
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", citizenId=");
		sb.append(citizenId);
		sb.append(", citizenIdSecond=");
		sb.append(citizenIdSecond);
		sb.append(", score=");
		sb.append(score);
		sb.append(", status=");
		sb.append(status);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CitizenFingerprintMatcher toEntityModel() {
		CitizenFingerprintMatcherImpl citizenFingerprintMatcherImpl = new CitizenFingerprintMatcherImpl();

		citizenFingerprintMatcherImpl.setId(id);

		if (createDate == Long.MIN_VALUE) {
			citizenFingerprintMatcherImpl.setCreateDate(null);
		}
		else {
			citizenFingerprintMatcherImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			citizenFingerprintMatcherImpl.setModifiedDate(null);
		}
		else {
			citizenFingerprintMatcherImpl.setModifiedDate(new Date(modifiedDate));
		}

		citizenFingerprintMatcherImpl.setCitizenId(citizenId);
		citizenFingerprintMatcherImpl.setCitizenIdSecond(citizenIdSecond);
		citizenFingerprintMatcherImpl.setScore(score);
		citizenFingerprintMatcherImpl.setStatus(status);
		citizenFingerprintMatcherImpl.setUserId(userId);

		citizenFingerprintMatcherImpl.resetOriginalValues();

		return citizenFingerprintMatcherImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		citizenId = objectInput.readLong();

		citizenIdSecond = objectInput.readLong();

		score = objectInput.readInt();

		status = objectInput.readInt();

		userId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(citizenId);

		objectOutput.writeLong(citizenIdSecond);

		objectOutput.writeInt(score);

		objectOutput.writeInt(status);

		objectOutput.writeLong(userId);
	}

	public long id;
	public long createDate;
	public long modifiedDate;
	public long citizenId;
	public long citizenIdSecond;
	public int score;
	public int status;
	public long userId;
}