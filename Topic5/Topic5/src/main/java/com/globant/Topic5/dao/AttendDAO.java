package com.globant.Topic5.dao;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.QueryResults;

import com.globant.Topic5.entities.Attend;
import com.mongodb.MongoClient;

public class AttendDAO extends BasicDAO<Attend, String> {

	public AttendDAO(Morphia morphia, MongoClient mongo, String dbName) {
		super(mongo, morphia, dbName);
	}
	
	public void findStudentsWithFinalNoteGreaterThan4(Datastore datastore, int course) {
		Query<Attend> query = datastore.createQuery(Attend.class);
		query.and(query.criteria("Course").equal(course), query.criteria("Final_Note").greaterThanOrEq(4));
		QueryResults<Attend> retrievedStudents = find(query);
		System.out.println("Nº of Students who pass: "+retrievedStudents.count());
	}
	
}
