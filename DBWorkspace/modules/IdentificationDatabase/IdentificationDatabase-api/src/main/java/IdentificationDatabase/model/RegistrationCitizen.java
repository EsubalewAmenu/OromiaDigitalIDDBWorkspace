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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the RegistrationCitizen service. Represents a row in the &quot;ID_RegistrationCitizen&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationCitizenModel
 * @see IdentificationDatabase.model.impl.RegistrationCitizenImpl
 * @see IdentificationDatabase.model.impl.RegistrationCitizenModelImpl
 * @generated
 */
@ImplementationClassName("IdentificationDatabase.model.impl.RegistrationCitizenImpl")
@ProviderType
public interface RegistrationCitizen extends RegistrationCitizenModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link IdentificationDatabase.model.impl.RegistrationCitizenImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RegistrationCitizen, Long> ID_ACCESSOR = new Accessor<RegistrationCitizen, Long>() {
			@Override
			public Long get(RegistrationCitizen registrationCitizen) {
				return registrationCitizen.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RegistrationCitizen> getTypeClass() {
				return RegistrationCitizen.class;
			}
		};
}