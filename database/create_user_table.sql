-- Title: Version 0.1 - Create User Table
-- Description: Creates the table to store user authentication and audit data
-- Author: dan-walker-cs

select 'Beginning create_user_table...';

CREATE TABLE IF NOT EXISTS `user` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
    `auth_id` VARCHAR(256) NOT NULL COMMENT 'Authentication principal identifier',
    `username` VARCHAR(32) NOT NULL COMMENT 'Account pseudonym',
    `email_id` VARCHAR(256) DEFAULT NULL COMMENT 'Optionally provided contact email',
    `last_login_dt` DATETIME DEFAULT NULL COMMENT 'Datetimestamp representing the last system access',
    `created_dt` DATETIME NOT NULL COMMENT 'Datetimestamp representing the user registration',
    `last_updated_dt` DATETIME DEFAULT NULL COMMENT 'Datetimetamp representing the last record update',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='sprout-pass user registration and authentication information table.';

select 'Completed create_user_table.';