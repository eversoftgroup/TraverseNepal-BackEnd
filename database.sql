
-- TABLE visa_information
CREATE TABLE `sys`.`visa_information` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `document_type` VARCHAR(45) NOT NULL,
  `document_number` VARCHAR(45) NOT NULL,
  `expiry_date` DATETIME NOT NULL,
  `visa_type` VARCHAR(45) NOT NULL,
  `visa_period` INT NOT NULL,
  PRIMARY KEY (`id`));
  
  -- TABLE users
  CREATE TABLE `sys`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `middle_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `nationality` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `visa_id` INT NOT NULL,
  `login_id` INT NOT NULL,
  PRIMARY KEY (`id`));
ALTER TABLE `sys`.`users` 
ADD COLUMN `avatar_url` VARCHAR(512) NOT NULL AFTER `login_id`;
ALTER TABLE `sys`.`users` 
CHANGE COLUMN `avatar_url` `avatar_url` VARCHAR(512) NOT NULL DEFAULT 'http://www.culpepperandassociates.com/wp-content/uploads/2014/08/dummy-avatar-999x999.png' ;

  
  -- TABLE user_login
  CREATE TABLE `sys`.`user_login` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `password_hash` VARCHAR(45) NOT NULL,
  `password_salt` VARCHAR(45) NOT NULL,
  `role_id` INT NOT NULL,
  PRIMARY KEY (`id`));


  
  
  
  
  
  -- POPULATE DUMMY DATA

-- INSERT INTO users
INSERT INTO `sys`.`users` (`id`, `first_name`, `middle_name`, `last_name`, `nationality`, `date_of_birth`, `visa_id`, `login_id`) VALUES ('1', 'Bikalpa', 'Raj', 'Dhakal', 'Nepalese', '1997-10-19', '1', '1');


-- INSERT INTO visa_information
INSERT INTO `sys`.`visa_information` (`id`, `document_type`, `document_number`, `expiry_date`, `visa_type`, `visa_period`) VALUES ('1', 'ABC', '1234', '2020-10-12', 'abc', 200);

-- INSERT INTO user_login
INSERT INTO `sys`.`user_login` (`id`, `username`, `email`, `password_hash`, `password_salt`, `role_id`) VALUES ('2', 'pradip', 'abc@xyz.com', 'dsf', 'df', '1');
