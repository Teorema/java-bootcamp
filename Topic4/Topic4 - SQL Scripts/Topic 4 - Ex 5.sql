SELECT T."Last Name", T."First Name", S."DayOfWeek", S."StartTime", S."EndTime", C."Name"
FROM "high-school"."Teacher" T
JOIN "high-school"."Course" C
	ON T."idTeacher" = C."Teacher"
JOIN "high-school"."AssingedTime" A
	ON C."idCourse" = A."idCourse"
JOIN "high-school"."Schedule" S
	ON A."idSchedule" = S."idSchedule"
WHERE T."idTeacher" = 3
ORDER BY S."DayOfWeek", S."StartTime" ASC;