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

import IdentificationDatabase.service.base.CitizenFingerprintMatcherLocalServiceBaseImpl;
import java.util.List;
import java.util.Date;

import com.liferay.portal.kernel.exception.SystemException;
import IdentificationDatabase.model.CitizenFingerprintMatcher;

/**
 * The implementation of the citizen fingerprint matcher local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link IdentificationDatabase.service.CitizenFingerprintMatcherLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CitizenFingerprintMatcherLocalServiceBaseImpl
 * @see IdentificationDatabase.service.CitizenFingerprintMatcherLocalServiceUtil
 */
public class CitizenFingerprintMatcherLocalServiceImpl
	extends CitizenFingerprintMatcherLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link IdentificationDatabase.service.CitizenFingerprintMatcherLocalServiceUtil} to access the citizen fingerprint matcher local service.
	 */
	
	public List<CitizenFingerprintMatcher> getMatcherForCitizenId(long _citizenId)
			throws SystemException {
		return citizenFingerprintMatcherPersistence.findBycitizenId(_citizenId);
	}
	
	public List<CitizenFingerprintMatcher> getMatcherForCitizenSecond(long _citizenIdSecond)
			throws SystemException {
		return citizenFingerprintMatcherPersistence.findBycitizenId(_citizenIdSecond);
	}

	public List<CitizenFingerprintMatcher> getMatcherForStatus(int _status)
			throws SystemException {
		return citizenFingerprintMatcherPersistence.findBystatus(_status);
	}

	public List<CitizenFingerprintMatcher> getMatcherForUserId(long _userId)
			throws SystemException {
		return citizenFingerprintMatcherPersistence.findByuserId(_userId);
	}

	public List<CitizenFingerprintMatcher> getMatcherForCitizenStatus(long citizenId, int status)
			throws SystemException {
		return citizenFingerprintMatcherPersistence.findBycitizen_status(citizenId, status);
	}

	public List<CitizenFingerprintMatcher> getMatcherForUser_Status(long userId, int status)
			throws SystemException {
		return citizenFingerprintMatcherPersistence.findByuserid_status(userId, status);
	}
	
}