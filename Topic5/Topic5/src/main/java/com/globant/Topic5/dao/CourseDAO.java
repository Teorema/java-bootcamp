package com.globant.Topic5.dao;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

import com.globant.Topic5.entities.Course;
import com.mongodb.MongoClient;

public class CourseDAO extends BasicDAO<Course, String>{

	public CourseDAO(Morphia morphia, MongoClient mongo, String dbName) {
		super(mongo, morphia, dbName);
	}
	
	public Course findCourseId(Datastore datastore, String course_name) {
		Query<Course> query = datastore.createQuery(Course.class);
		query.criteria("name").equal(course_name);
		return findOne(query);
	}
	
}
