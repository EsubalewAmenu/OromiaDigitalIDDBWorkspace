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

import IdentificationDatabase.service.base.RegistrationCitizenLocalServiceBaseImpl;
import java.util.List;
import java.util.Date;

import com.liferay.portal.kernel.exception.SystemException;
import IdentificationDatabase.model.RegistrationCitizen;

/**
 * The implementation of the registration citizen local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link IdentificationDatabase.service.RegistrationCitizenLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationCitizenLocalServiceBaseImpl
 * @see IdentificationDatabase.service.RegistrationCitizenLocalServiceUtil
 */
public class RegistrationCitizenLocalServiceImpl
	extends RegistrationCitizenLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link IdentificationDatabase.service.RegistrationCitizenLocalServiceUtil} to access the registration citizen local service.
	 */

	public List<RegistrationCitizen> getCitizenForStatus(int status)
			throws SystemException {
		return registrationCitizenPersistence.findBystatus(status);
	}
	
	public List<RegistrationCitizen> getCitizenForCode(String code)
			throws SystemException {

		return registrationCitizenPersistence.findBycode(code);

	}

	public List<RegistrationCitizen> getCitizenForId(long _id)
			throws SystemException {

		return registrationCitizenPersistence.findByid(_id);

	}

	public List<RegistrationCitizen> getCitizenForHouseNo_kebele(
			String houseNo, String kebele) throws SystemException {

		return registrationCitizenPersistence.findByhouseNo(houseNo,
				kebele);

	}
	
	public List<RegistrationCitizen> getReportForIssueDate_kebele(
			Date issueDate, String kebele) throws SystemException {

		return registrationCitizenPersistence.findByreport(issueDate, kebele);
	}
	
	public List<RegistrationCitizen> getCitizenForIssueKebeleStat(
			Date issueDate, String kebele, int status) throws SystemException {

		return registrationCitizenPersistence.findByissue_kebele_stat_report(issueDate, kebele, status);

	}

	public List<RegistrationCitizen> getCitizenForIssueKebeleSexStat(
			Date issueDate, String kebele, String sex, int status) throws SystemException {

		return registrationCitizenPersistence.findByissue_kebele_sex_stat_report(issueDate, kebele, sex, status);
	}
	public List<RegistrationCitizen> getCitizenForIssueKebeleOccStat(
			Date issueDate, String kebele, String occupation, int status) throws SystemException {

		return registrationCitizenPersistence.findByissue_kebele_occ_stat_report(issueDate, kebele, occupation, status);
	}
	public List<RegistrationCitizen> getCitizenForIssueKebeleSexOccStat(
			Date issueDate, String kebele, String sex, String occupation, int status) throws SystemException {

		return registrationCitizenPersistence.findByissue_kebele_sex_occ_stat_report(issueDate, kebele, sex, occupation, status);
	}
	
}