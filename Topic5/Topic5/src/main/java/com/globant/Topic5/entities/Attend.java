package com.globant.Topic5.entities;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;

@Entity("Attends")
public class Attend {
	
	@Id
	private ObjectId id;
	
	@Reference("Student")
	private Student student;
	
	@Reference("Course")
	private Course course;
	
	@Property("First_Note")
	private double firstNote;
	
	@Property("Second_Note")
	private double secondNote;
	
	@Property("Third_Note")
	private double thirdNote;
	
	@Property("Final_Note")
	private double finalNote;
	
	public Attend(){
	}
	
	public Attend(ObjectId id, Student student, Course course, double firstNote, double secondNote, double thirdNote, double finalNote) {
		this.id = id;
		this.student = student;
		this.course = course;
		this.firstNote = firstNote;
		this.secondNote = secondNote;
		this.thirdNote = thirdNote;
		this.finalNote = finalNote;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getFirstNote() {
		return firstNote;
	}

	public void setFirstNote(double firstNote) {
		this.firstNote = firstNote;
	}

	public double getSecondNote() {
		return secondNote;
	}

	public void setSecondNote(double secondNote) {
		this.secondNote = secondNote;
	}

	public double getThirdNote() {
		return thirdNote;
	}

	public void setThirdNote(double thirdNote) {
		this.thirdNote = thirdNote;
	}

	public double getFinalNote() {
		return finalNote;
	}

	public void setFinalNote(double finalNote) {
		this.finalNote = finalNote;
	}
	
}
