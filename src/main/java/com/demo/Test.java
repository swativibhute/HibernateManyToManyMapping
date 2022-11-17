package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {


		Configuration configuration = new Configuration();
		configuration.configure("Hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Teacher teacher = new Teacher();
		teacher.setName("vanita");
		teacher.setMobileNo("9528369856");

		
		Teacher teacher2 = new Teacher();
		teacher2.setName("asha");
		teacher2.setMobileNo("8875698574");
		
		
		Subjects subjects = new Subjects();
		subjects.setSub_name("Science");
		subjects.setSub_Code("Sci41253");
		
		Subjects subjects2 = new Subjects();
		subjects2.setSub_name("Mathamatics");
		subjects2.setSub_Code("M1236");
		
		Subjects subjects3= new Subjects();
		subjects3.setSub_name("Physics");
		subjects3.setSub_Code("P00123");
		
		
		teacher.getSubjects().add(subjects);
		teacher.getSubjects().add(subjects2);
		
		teacher2.getSubjects().add(subjects);
		teacher2.getSubjects().add(subjects2);
		teacher2.getSubjects().add(subjects3);
		
		subjects.getTeachers().add(teacher);
		subjects.getTeachers().add(teacher2);
		
		subjects2.getTeachers().add(teacher);
		
		subjects3.getTeachers().add(teacher);
		subjects3.getTeachers().add(teacher2);
		
		
		session.save(teacher);
		session.save(teacher2);
		
		transaction.commit();
		session.close();
		System.out.println("Done");
		
		
		
		
	}

}
