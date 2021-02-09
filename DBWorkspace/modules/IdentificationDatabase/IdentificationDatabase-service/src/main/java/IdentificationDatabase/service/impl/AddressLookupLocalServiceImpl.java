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

package IdentificationDatabase.service.impl;

import IdentificationDatabase.service.base.AddressLookupLocalServiceBaseImpl;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import IdentificationDatabase.model.AddressLookup;

/**
 * The implementation of the address lookup local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link IdentificationDatabase.service.AddressLookupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddressLookupLocalServiceBaseImpl
 * @see IdentificationDatabase.service.AddressLookupLocalServiceUtil
 */
public class AddressLookupLocalServiceImpl
	extends AddressLookupLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link IdentificationDatabase.service.AddressLookupLocalServiceUtil} to access the address lookup local service.
	 */
	public List<AddressLookup> getAddressesForStatus(int status) throws SystemException {

		  //return this.registrationCitizenPersistence.findBystatus(status);
		  
		  return this.addressLookupPersistence.findBystatus(status);

		}

}