CREATE TABLE `user` (
	`uid`  bigint NOT NULL AUTO_INCREMENT COMMENT '�û�ID' ,
	`nickname`  varchar(16) NOT NULL COMMENT '�û��ǳ�' ,
	`email`  varchar(32) NOT NULL COMMENT '�û�ע������' ,
	`password`  varchar(32) NOT NULL COMMENT '�û�����' ,
	`create_time`  datetime NOT NULL COMMENT '�û�����ʱ��' ,
	`last_login_time`  datetime NOT NULL COMMENT '�û��ϴε�¼ʱ��' ,
	PRIMARY KEY (`uid`)
)
;