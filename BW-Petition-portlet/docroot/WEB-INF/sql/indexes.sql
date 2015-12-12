create index IX_625CA6E7 on bw_Attachment (attachmentEntryId);
create index IX_1FFF1AA0 on bw_Attachment (petitionId);

create index IX_100FBADA on bw_CommentsUpdate (petitionId);
create index IX_560F4B1C on bw_CommentsUpdate (petitionId, commentsType);

create index IX_8DECD5A9 on bw_Petition (petitionNumber);
create index IX_47D78A26 on bw_Petition (uuid_);
create index IX_C6C642 on bw_Petition (uuid_, companyId);
create unique index IX_166FF544 on bw_Petition (uuid_, groupId);

create index IX_E8138921 on bw_PlusSigner (petitionId);
create index IX_64DA0E99 on bw_PlusSigner (petitionId, signerType);