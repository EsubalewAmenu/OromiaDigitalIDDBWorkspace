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

import IdentificationDatabase.service.base.KebelesLocalServiceBaseImpl;
import java.util.List;
import java.util.Date;

import com.liferay.portal.kernel.exception.SystemException;
import IdentificationDatabase.model.Kebeles;

/**
 * The implementation of the kebeles local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link IdentificationDatabase.service.KebelesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KebelesLocalServiceBaseImpl
 * @see IdentificationDatabase.service.KebelesLocalServiceUtil
 */
public class KebelesLocalServiceImpl extends KebelesLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link IdentificationDatabase.service.KebelesLocalServiceUtil} to access the kebeles local service.
	 */
	

	public List<Kebeles> getKebeleForId(long id)
			throws SystemException {
		return kebelesPersistence.findByid(id);
	}	

	public List<Kebeles> getKebeleByOr(String kebele_OR)
			throws SystemException {
		return kebelesPersistence.findBykebeleOr(kebele_OR);
	}

	public List<Kebeles> getKebeleByAm(String kebele_AM)
			throws SystemException {
		return kebelesPersistence.findBykebeleAm(kebele_AM);
	}

	public List<Kebeles> getKebeleBySubcityOr(String Subcity_OR)
			throws SystemException {
		return kebelesPersistence.findBysubcityOr(Subcity_OR);
	}

	public List<Kebeles> getKebeleBySubcityAm(String Subcity_AM)
			throws SystemException {
		return kebelesPersistence.findBysubcityAm(Subcity_AM);
	}

	public List<Kebeles> getKebeleByPrinterName(String printerName)
			throws SystemException {
		return kebelesPersistence.findByprintername(printerName);
	}
	
}