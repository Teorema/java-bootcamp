INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (1, 'A', 'A', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (2, 'B', 'B', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (3, 'C', 'C', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (4, 'D', 'D', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (5, 'E', 'E', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (6, 'F', 'F', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (7, 'G', 'G', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (8, 'H', 'H', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (9, 'I', 'I', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (10, 'J', 'J', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (11, 'K', 'K', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (12, 'L', 'L', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (13, 'M', 'M', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (14, 'N', 'N', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (15, 'O', 'O', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (16, 'P', 'P', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (17, 'Q', 'Q', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (18, 'R', 'R', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (19, 'S', 'S', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (20, 'T', 'T', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (21, 'U', 'U', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (22, 'V', 'V', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (23, 'W', 'W', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (24, 'X', 'X', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (25, 'Y', 'Y', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (26, 'Z', 'Z', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (27, 'AA', 'AA', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (28, 'AB', 'AB', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (29, 'AC', 'AC', '1990-01-01');
INSERT INTO "high-school"."Student"("Registration Number", "First Name", "Last Name", "Birthday")
	VALUES (30, 'AD', 'AD', '1990-01-01');

INSERT INTO "high-school"."Teacher"("idTeacher", "First Name", "Last Name", "Birthday")
	VALUES (1, 'TeacherA', 'TeacherA', '1990-01-01');
INSERT INTO "high-school"."Teacher"("idTeacher", "First Name", "Last Name", "Birthday")
	VALUES (2, 'TeacherB', 'TeacherB', '1990-01-01');
INSERT INTO "high-school"."Teacher"("idTeacher", "First Name", "Last Name", "Birthday")
	VALUES (3, 'TeacherC', 'TeacherC', '1990-01-01');

INSERT INTO "high-school"."Course"("idCourse", "Name", "Teacher", "Weekly hours")
	VALUES (1, 'Math', 1, 10);
INSERT INTO "high-school"."Course"("idCourse", "Name", "Teacher", "Weekly hours")
	VALUES (2, 'History', 2, 10);
INSERT INTO "high-school"."Course"("idCourse", "Name", "Teacher", "Weekly hours")
	VALUES (3, 'Law', 3, 5);

INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (1, 1, 4.0, 6.0, 5.0, 5.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (2, 1, 4.0, 4.0, 7.0, 5.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (3, 1, 4.0, 8.0, 6.0, 6.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (4, 1, 7.0, 7.0, 5.0, 6.3);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (5, 1, 6.0, 4.0, 2.0, 4.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (6, 1, 2.0, 4.0, 2.0, 2.6);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (7, 1, 2.0, 6.0, 9.0, 5.6);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (8, 1, 2.0, 3.0, 9.0, 4.6);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (9, 1, 3.0, 4.0, 6.0, 4.2);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (10, 1, 9.0, 9.0, 5.0, 7.6);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (11, 2, 4.0, 4.0, 4.0, 4.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (12, 2, 7.0, 5.0, 4.0, 5.3);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (13, 2, 7.0, 5.0, 2.0, 4.6);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (14, 2, 7.0, 4.0, 2.0, 4.3);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (15, 2, 6.0, 3.0, 1.0, 3.3);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (16, 2, 2.0, 4.0, 1.0, 2.3);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (17, 2, 2.0, 4.0, 6.0, 4.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (18, 2, 2.0, 1.0, 9.0, 4.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (19, 2, 2.0, 1.0, 10.0, 4.3);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (20, 2, 6.0, 6.0, 6.0, 6.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (21, 3, 4.0, 5.0, 6.0, 5.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (22, 3, 4.0, 6.0, 8.0, 6.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (23, 3, 6.0, 4.0, 8.0, 6.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (24, 3, 9.0, 4.0, 5.0, 6.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (25, 3, 8.0, 9.0, 5.0, 7.3);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (26, 3, 9.0, 8.0, 8.0, 8.3);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (27, 3, 1.0, 4.0, 6.0, 3.6);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (28, 3, 1.0, 2.0, 5.0, 2.6);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (29, 3, 4.0, 5.0, 9.0, 6.0);
INSERT INTO "high-school"."Attend"("Student", "Course", "First Note", "Second Note", "Third Note", "Final Note")
	VALUES (30, 3, 4.0, 8.0, 5.0, 5.6);