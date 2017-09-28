CREATE TABLE `user` (
	`uid`  bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID' ,
	`nickname`  varchar(16) NOT NULL COMMENT '用户昵称' ,
	`email`  varchar(32) NOT NULL COMMENT '用户注册邮箱' ,
	`password`  varchar(32) NOT NULL COMMENT '用户密码' ,
	`create_time`  datetime NOT NULL COMMENT '用户创建时间' ,
	`last_login_time`  datetime NOT NULL COMMENT '用户上次登录时间' ,
	PRIMARY KEY (`uid`)
)
;