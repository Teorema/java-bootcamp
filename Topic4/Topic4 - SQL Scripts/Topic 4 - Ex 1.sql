-- -----------------------------------------------------
-- Schema high-school
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS "high-school" CASCADE;
CREATE SCHEMA "high-school";

-- -----------------------------------------------------
-- Table `high-school`.`Student`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS "high-school"."Student" (
  "Registration Number" INT NOT NULL,
  "First Name" VARCHAR(45) NOT NULL,
  "Last Name" VARCHAR(45) NOT NULL,
  "Birthday" DATE NULL,
  PRIMARY KEY ("Registration Number"));

-- -----------------------------------------------------
-- Table `high-school`.`Teacher`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS "high-school"."Teacher" (
  "idTeacher" INT NOT NULL,
  "First Name" VARCHAR(45) NOT NULL,
  "Last Name" VARCHAR(45) NOT NULL,
  "Birthday" DATE NULL,
  PRIMARY KEY ("idTeacher"));

-- -----------------------------------------------------
-- Table `high-school`.`Course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS "high-school"."Course" (
  "idCourse" INT NOT NULL,
  "Name" VARCHAR(45) NOT NULL,
  "Teacher" INT NOT NULL,
  "Weekly hours" INT NOT NULL,
  PRIMARY KEY ("idCourse"),
  CONSTRAINT "Assigned Teacher"
    FOREIGN KEY ("Teacher")
    REFERENCES "high-school"."Teacher" ("idTeacher")
    ON DELETE RESTRICT
    ON UPDATE RESTRICT);

-- -----------------------------------------------------
-- Table `high-school`.`Attend`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS "high-school"."Attend" (
  "Student" INT NOT NULL,
  "Course" INT NOT NULL,
  "First Note" FLOAT NULL,
  "Second Note" FLOAT NULL,
  "Third Note" FLOAT NULL,
  "Final Note" FLOAT NULL,
  PRIMARY KEY ("Student", "Course"),
  CONSTRAINT "Student_Attend"
    FOREIGN KEY ("Student")
    REFERENCES "high-school"."Student" ("Registration Number")
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT "Course_Attend"
    FOREIGN KEY ("Course")
    REFERENCES "high-school"."Course" ("idCourse")
    ON DELETE RESTRICT
    ON UPDATE RESTRICT);

-- -----------------------------------------------------
-- Table `high-school`.`Schedule`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS "high-school"."Schedule" (
  "idSchedule" INT NOT NULL,
  "Day" VARCHAR(45) NULL,
  "StartTime" TIME(6) NULL,
  "EndTime" TIME(6) NULL,
  PRIMARY KEY ("idSchedule"));

-- -----------------------------------------------------
-- Table `high-school`.`AssingedTime`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS "high-school"."AssingedTime" (
  "idCourse" INT NOT NULL,
  "idSchedule" INT NOT NULL,
  PRIMARY KEY ("idCourse", "idSchedule"),
  CONSTRAINT "Assinged Course"
    FOREIGN KEY ("idCourse")
    REFERENCES "high-school"."Course" ("idCourse")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT "Assinged Schedule"
    FOREIGN KEY ("idSchedule")
    REFERENCES "high-school"."Schedule" ("idSchedule")
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
