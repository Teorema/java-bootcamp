SELECT C."Name", Count(*) "Total Students",
	avg(case when A."Final Note" >= 4.0 then 1 else 0 end) "Passed",
    avg(case when A."Final Note" < 4.0 then 1 else 0 end) "Failed"
FROM "high-school"."Course" AS C 
JOIN "high-school"."Attend" AS A
	ON C."idCourse" = A."Course"
WHERE "idCourse" = 2
GROUP BY C."Name";