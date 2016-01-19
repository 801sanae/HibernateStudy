package com.hibernate.study;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory =cfg.buildSessionFactory();
		
		Session session =factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setId(61);
		e1.setFirstName("Kim");
		e1.setLastName("myy");
		
		EmployeeAnnotation e2 = new EmployeeAnnotation();
		e2.setId(62);
		e2.setFirstName("kim");
		e2.setLastName("dayeon");
		
		
		session.persist(e1);
		session.persist(e2);
		
		
		t.commit();
		session.close();
		
		System.out.println("Suceesfully saved");
	}
	
}
