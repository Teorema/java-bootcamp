package com.globant.Topic5.entities;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;

@Entity("Courses")
public class Course {
	
	@Id
	private int id;
	
	@Property("Name")
	private String name;
	
	@Property("Weekly_hours")
	private int weeklyHours;
	
	@Reference
	private Teacher teacher;
	
	public Course(){
	}
	
	public Course(int id, String name, int weeklyHours, Teacher teacher) {
		this.id = id;
		this.name = name;
		this.weeklyHours = weeklyHours;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeeklyHours() {
		return weeklyHours;
	}

	public void setWeeklyHours(int weeklyHours) {
		this.weeklyHours = weeklyHours;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
}
