
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
  `visaId` INT NOT NULL,
  PRIMARY KEY (`id`));

      -- TABLE Question
   CREATE TABLE `sys`.`question` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `question` VARCHAR(45) NULL,
  `description` VARCHAR(45) NULL,
  `votes` VARCHAR(45) NULL,
  `user_id` INT NOT NULL,
  `photo_id` VARCHAR(255) NULL,
  `insert_date` VARCHAR(45) NULL,
  `is_active` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

    -- Table answers
    CREATE TABLE `sys`.`answers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `question_id` INT NOT NULL,
  `user_id` INT NOT NULL,
  `votes` VARCHAR(45) NULL,
  `photo_id` VARCHAR(255) NULL,
  `description` VARCHAR(45) NULL,
  `insert_date` VARCHAR(45) NULL,
  `is_active` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
  
  
  -- POPULATE DUMMY DATA

-- INSERT INTO users
INSERT INTO `sys`.`users` (`id`, `first_name`, `middle_name`, `last_name`, `nationality`, `date_of_birth`, `visaId`) VALUES ('1', 'Bikalpa', 'Raj', 'Dhakal', 'Nepalese', '1997-10-19', '1');


-- INSERT INTO visa_information
INSERT INTO `sys`.`visa_information` (`id`, `document_type`, `document_number`, `expiry_date`, `visa_type`, `visa_period`) VALUES ('1', 'ABC', '1234', '2020-10-12', 'abc', 200)

-- INSERT INTO Question
INSERT INTO `sys`.`question` (`question`, `description`, `votes`, `user_id`, `photo_id`, `insert_date`, `is_active`) VALUES ('Total visit cost for pokhara tour?', 'Total amout and places to visit in pokhara.', '3', '1', 'dfgfdrsfsda', '1997-10-19', '1');

-- Insert into answers
INSERT INTO `sys`.`answers` (`question_id`, `user_id`, `votes`, `photo_id`, `description`, `insert_date`, `is_active`) VALUES ('1', '1', '3', 'fbgnhfdgbvbs', 'This is test comment for question 1', '1997-10-19', '1');


