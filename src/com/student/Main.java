package com.student;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("Roch");
		student.setLastName("M");
		
		Course c1 = new Course();
		c1.setCourseId(304);
		c1.setCourseName("Software Eng");
		c1.setInsem1(20);
		c1.setInsem2(20);
		c1.setInsem3(20);
		c1.setSem(30);
		
		Course c2 = new Course();
		c2.setCourseId(304);
		c2.setCourseName("Software Eng");
		c2.setInsem1(20);
		c2.setInsem2(20);
		c2.setInsem3(20);
		c2.setSem(30);
		
		Marksheet marksheet = new Marksheet();
		
		List<Course> courses = new ArrayList<>();
		courses.add(c1);
		courses.add(c2);
		
		marksheet.setCourses(courses);
		
		marksheet.setStudent(student);
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(marksheet);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
