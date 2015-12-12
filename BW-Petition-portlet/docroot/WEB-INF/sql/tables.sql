create table bw_Attachment (
	attachmentId LONG not null primary key,
	petitionId LONG,
	userId LONG,
	attachmentEntryId LONG,
	attachmentName VARCHAR(75) null
);

create table bw_CommentsUpdate (
	commentsUpdateId LONG not null primary key,
	petitionId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	commentsType VARCHAR(75) null,
	commentsContent VARCHAR(75) null,
	updateTime DATE null
);

create table bw_Petition (
	uuid_ VARCHAR(75) null,
	petitionId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	petitionNumber VARCHAR(75) null,
	publishDate DATE null,
	signUnit VARCHAR(75) null,
	signer VARCHAR(75) null,
	designee VARCHAR(75) null,
	plusSign VARCHAR(75) null,
	subject VARCHAR(75) null,
	explanation VARCHAR(75) null,
	comments VARCHAR(75) null,
	commentsByMonk VARCHAR(75) null,
	commentsByManagement VARCHAR(75) null,
	commentsByCEO VARCHAR(75) null,
	commentsByAides VARCHAR(75) null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null
);

create table bw_PlusSigner (
	plusSignerId LONG not null primary key,
	petitionId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	signerId LONG,
	signerName VARCHAR(75) null,
	signerType VARCHAR(75) null,
	createDate DATE null
);