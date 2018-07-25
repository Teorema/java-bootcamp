SELECT C."Name", T."Last Name", T."First Name", S."Last Name", S."First Name"
FROM "high-school"."Course" AS C 
JOIN "high-school"."Teacher" AS T
	ON C."Teacher" = T."idTeacher"
JOIN "high-school"."Attend" AS A
	ON C."idCourse" = A."Course"
JOIN "high-school"."Student" AS S
	ON A."Student" = S."Registration Number"
WHERE "idCourse" = 2;