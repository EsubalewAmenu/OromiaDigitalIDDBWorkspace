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

import IdentificationDatabase.service.base.CitizenRemarkLocalServiceBaseImpl;
import java.util.List;
import java.util.Date;

import com.liferay.portal.kernel.exception.SystemException;
import IdentificationDatabase.model.CitizenRemark;

/**
 * The implementation of the citizen remark local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link IdentificationDatabase.service.CitizenRemarkLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitizenRemarkLocalServiceBaseImpl
 * @see IdentificationDatabase.service.CitizenRemarkLocalServiceUtil
 */
public class CitizenRemarkLocalServiceImpl
	extends CitizenRemarkLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link IdentificationDatabase.service.CitizenRemarkLocalServiceUtil} to access the citizen remark local service.
	 */
	

	public List<CitizenRemark> getRemarkForId(long _id)
			throws SystemException {
		return citizenRemarkPersistence.findByid(_id);
	}
	public List<CitizenRemark> getRemarkForCitizenId(long _citizenId)
			throws SystemException {
		return citizenRemarkPersistence.findBycitizenId(_citizenId);
	}

	
}