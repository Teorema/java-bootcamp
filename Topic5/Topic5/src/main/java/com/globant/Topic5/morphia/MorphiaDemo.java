package com.globant.Topic5.morphia;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.globant.Topic5.dao.AttendDAO;
import com.globant.Topic5.dao.CourseDAO;
import com.globant.Topic5.entities.Course;
import com.mongodb.MongoClient;

public class MorphiaDemo {

	public static void main( String[] args ) {
		String dbName = new String("high-school");
	    final Morphia morphia = new Morphia();
	    morphia.mapPackage("com.globant.Topic5.entities");
	    MongoClient mongo = new MongoClient();
	    Datastore datastore = morphia.createDatastore(mongo, dbName);
	    
	    CourseDAO courseDao = new CourseDAO(morphia, mongo, dbName);
	    Course course = courseDao.findCourseId(datastore, "Math");
	    
	    AttendDAO attend = new AttendDAO(morphia, mongo, dbName);
	    attend.findStudentsWithFinalNoteGreaterThan4(datastore, course.getId());
	}
	
}
