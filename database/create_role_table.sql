-- Title: Version 0.1 - Create Role Table
-- Description: Creates the table to store system role information
-- Author: dan-walker-cs

CREATE TABLE IF NOT EXISTS `role` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`label` VARCHAR(32) NOT NULL COMMENT 'String representation of role information',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='sprout-pass system role information';