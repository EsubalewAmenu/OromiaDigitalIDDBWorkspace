create index IX_832E3276 on ID_AddressLookup (status);

create index IX_8EA25A8F on ID_BiometricData (citizenId);

create index IX_2874441 on ID_CitizenFingerprintMatcher (citizenId, status);
create index IX_1BE7292F on ID_CitizenFingerprintMatcher (citizenIdSecond);
create index IX_C744C9C on ID_CitizenFingerprintMatcher (id_);
create index IX_B6B5391E on ID_CitizenFingerprintMatcher (status);
create index IX_5E79FF58 on ID_CitizenFingerprintMatcher (userId, status);

create index IX_1A343BC9 on ID_CitizenRemark (citizenId);
create index IX_6FABA28A on ID_CitizenRemark (id_);

create index IX_58A59315 on ID_Kebeles (id_);
create index IX_B670B3F5 on ID_Kebeles (kebeleAm[$COLUMN_LENGTH:75$]);
create index IX_BC1917B2 on ID_Kebeles (kebeleOr[$COLUMN_LENGTH:75$], subcityOr[$COLUMN_LENGTH:75$]);
create index IX_41DF36D6 on ID_Kebeles (printername[$COLUMN_LENGTH:75$]);
create index IX_B18839A8 on ID_Kebeles (subcityAm[$COLUMN_LENGTH:75$]);
create index IX_B18EA99F on ID_Kebeles (subcityOr[$COLUMN_LENGTH:75$]);

create index IX_CD9E4AE1 on ID_PrintedHistory (citizenId);
create index IX_4334E3A2 on ID_PrintedHistory (id_);

create index IX_50F3C0F1 on ID_RegistrationCitizen (code_[$COLUMN_LENGTH:75$]);
create index IX_1E50E2A on ID_RegistrationCitizen (houseNo[$COLUMN_LENGTH:75$], kebele[$COLUMN_LENGTH:75$]);
create index IX_522D1243 on ID_RegistrationCitizen (id_);
create index IX_C645DB75 on ID_RegistrationCitizen (issueDate, kebele[$COLUMN_LENGTH:75$], occupation[$COLUMN_LENGTH:75$], status);
create index IX_61B3FA6B on ID_RegistrationCitizen (issueDate, kebele[$COLUMN_LENGTH:75$], sex[$COLUMN_LENGTH:75$], occupation[$COLUMN_LENGTH:75$], status);
create index IX_C0D20D6C on ID_RegistrationCitizen (issueDate, kebele[$COLUMN_LENGTH:75$], sex[$COLUMN_LENGTH:75$], status);
create index IX_ACB5AD76 on ID_RegistrationCitizen (issueDate, kebele[$COLUMN_LENGTH:75$], status);
create index IX_906866A3 on ID_RegistrationCitizen (reciptNo[$COLUMN_LENGTH:75$]);
create index IX_4FD63E17 on ID_RegistrationCitizen (status);

create index IX_493E633D on ID_Services (service[$COLUMN_LENGTH:75$]);
create index IX_AC2CC54E on ID_Services (status);

create index IX_54635F7C on ID_TransferToOtherCity (citizenId);
create index IX_B620487D on ID_TransferToOtherCity (id_);