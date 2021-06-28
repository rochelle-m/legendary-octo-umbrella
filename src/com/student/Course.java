package com.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	@Id
	private Integer courseId;
	
	private String courseName;
	
	private Integer insem1;
	private Integer insem2;
	private Integer insem3;
	private Integer sem;
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getInsem1() {
		return insem1;
	}
	public void setInsem1(Integer insem1) {
		this.insem1 = insem1;
	}
	public Integer getInsem2() {
		return insem2;
	}
	public void setInsem2(Integer insem2) {
		this.insem2 = insem2;
	}
	public Integer getInsem3() {
		return insem3;
	}
	public void setInsem3(Integer insem3) {
		this.insem3 = insem3;
	}
	public Integer getSem() {
		return sem;
	}
	public void setSem(Integer sem) {
		this.sem = sem;
	}
	
	
	
	
}
