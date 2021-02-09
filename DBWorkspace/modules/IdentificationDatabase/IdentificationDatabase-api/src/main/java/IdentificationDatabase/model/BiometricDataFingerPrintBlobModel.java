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

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the fingerPrint column in BiometricData.
 *
 * @author Brian Wing Shun Chan
 * @see BiometricData
 * @generated
 */
@ProviderType
public class BiometricDataFingerPrintBlobModel {
	public BiometricDataFingerPrintBlobModel() {
	}

	public BiometricDataFingerPrintBlobModel(long id) {
		_id = id;
	}

	public BiometricDataFingerPrintBlobModel(long id, Blob fingerPrintBlob) {
		_id = id;
		_fingerPrintBlob = fingerPrintBlob;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public Blob getFingerPrintBlob() {
		return _fingerPrintBlob;
	}

	public void setFingerPrintBlob(Blob fingerPrintBlob) {
		_fingerPrintBlob = fingerPrintBlob;
	}

	private long _id;
	private Blob _fingerPrintBlob;
}