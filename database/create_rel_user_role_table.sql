-- Title: Version 0.1 - Create rel_user_role Table
-- Description: Creates the table to store relationship data between user and role tables
-- Author: dan-walker-cs

CREATE TABLE IF NOT EXISTS `rel_user_role` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
    `user_id` INT(11) NOT NULL COMMENT 'Reference to the id column of the user table',
    `role_id` INT(11) NOT NULL COMMENT 'Reference to the id column of the role table',
	`created_dt` DATETIME NOT NULL COMMENT 'Datetimestamp representing the user registration',
    `last_updated_dt` DATETIME DEFAULT NULL COMMENT 'Datetimetamp representing the last record update',
    PRIMARY KEY (`id`),
    FOREIGN KEY `fk_rel_user_role_user_id` (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    FOREIGN KEY `fk_rel_user_role_role_id` (`role_id`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='sprout-pass user registration and authentication information table.';
