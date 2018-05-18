package com.ibaset.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		
		Employee e1=new Employee("dhaval");
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(e1);
		
		session.getTransaction().commit();
		
		session.close();

	}
}                         	
