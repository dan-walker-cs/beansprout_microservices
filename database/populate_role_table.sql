-- Title: Version 0.1 - Populate Role Table
-- Description: Populates the Role table with initial system roles: ADMIN, USER, and READ_ONLY.
-- Author: dan-walker-cs

select 'Beginning populate_role_table...';

INSERT IGNORE INTO `role` (label, created_dt) VALUES ('ADMIN', now());
SHOW WARNINGS;
INSERT IGNORE INTO `role` (label, created_dt) VALUES ('USER', now());
SHOW WARNINGS;
INSERT IGNORE INTO `role` (label, created_dt) VALUES ('READ_ONLY', now());
SHOW WARNINGS;