package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cf = new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		student sai = new student();
		sai.setSid(1205);
		sai.setSname("masthan");
		sai.setSmarks(555);
		sai.setSaddress("guntur");
		se.save(sai);
		
		
		tx.commit();
		se.close();
		
		
		
		
	}

}
