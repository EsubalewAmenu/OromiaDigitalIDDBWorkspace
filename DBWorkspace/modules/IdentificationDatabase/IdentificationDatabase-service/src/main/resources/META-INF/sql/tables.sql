create table ID_AddressLookup (
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	organizationId LONG,
	parentId LONG,
	name VARCHAR(75) null,
	level VARCHAR(75) null,
	description VARCHAR(75) null,
	status INTEGER
);

create table ID_BiometricData (
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	citizenId LONG,
	fingerType VARCHAR(75) null,
	fingerPrint BLOB,
	Remark VARCHAR(75) null
);

create table ID_CitizenFingerprintMatcher (
	id_ LONG not null primary key,
	createDate DATE null,
	modifiedDate DATE null,
	citizenId LONG,
	citizenIdSecond LONG,
	score INTEGER,
	status INTEGER,
	userId LONG
);

create table ID_CitizenRemark (
	id_ LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	citizenId LONG,
	remark VARCHAR(75) null
);

create table ID_Kebeles (
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	kebeleOr VARCHAR(75) null,
	kebeleAm VARCHAR(75) null,
	subcityOr VARCHAR(75) null,
	subcityAm VARCHAR(75) null,
	printername VARCHAR(75) null
);

create table ID_PrintedHistory (
	id_ LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	citizenId LONG
);

create table ID_RegistrationCitizen (
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	owner BOOLEAN,
	city VARCHAR(75) null,
	subCity VARCHAR(75) null,
	kebele VARCHAR(75) null,
	houseNo VARCHAR(75) null,
	name VARCHAR(75) null,
	fatherName VARCHAR(75) null,
	grandfatherName VARCHAR(75) null,
	motherName VARCHAR(75) null,
	citizenship VARCHAR(75) null,
	nation VARCHAR(75) null,
	birthDate DATE null,
	birthPlace VARCHAR(75) null,
	sex VARCHAR(75) null,
	occupation VARCHAR(75) null,
	telephone VARCHAR(75) null,
	relation VARCHAR(75) null,
	idType VARCHAR(75) null,
	issueDate DATE null,
	expireDate DATE null,
	emergencyContactName VARCHAR(75) null,
	emergencyContacPhone VARCHAR(75) null,
	image VARCHAR(75) null,
	signature VARCHAR(75) null,
	fingerprint VARCHAR(75) null,
	status INTEGER,
	reciptNo VARCHAR(75) null,
	notice VARCHAR(75) null
);

create table ID_Services (
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	citizenId LONG,
	service VARCHAR(75) null,
	status INTEGER
);

create table ID_Settings (
	id_ LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assignedUserId LONG,
	organizationId LONG,
	roleId LONG,
	remark VARCHAR(75) null
);

create table ID_TransferToOtherCity (
	id_ LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tocity VARCHAR(75) null,
	fromcity VARCHAR(75) null,
	subcity VARCHAR(75) null,
	kebele VARCHAR(75) null,
	fullname VARCHAR(75) null,
	mothername VARCHAR(75) null,
	citizenId LONG,
	birthdate DATE null,
	houseNo VARCHAR(75) null,
	isOwner VARCHAR(75) null,
	phone VARCHAR(75) null,
	reason VARCHAR(75) null
);