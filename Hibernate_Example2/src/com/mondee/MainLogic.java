package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
		Metadata me= new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory sf = me.getSessionFactoryBuilder().build();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		/*student sai = new student();
		sai.setSid(1204);
		sai.setSname("sagar");
		sai.setSmarks(550);
		sai.setSaddress("vizag");
		se.save(sai);*/
		
		student x =(student)se.load(student.class, 1204);
		System.out.println(x.getSid()+" "+x.getSname()+" "+x.getSmarks()+" "+x.getSaddress());
		
		tx.commit();
		se.close();
		
		
		
		
	}

}
