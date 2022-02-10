package com.mondee;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;

import org.hibernate.query.Query;

public class MainLogic {
	public static void main(String[] args) {
		
		
		Session se =DatabaseConnection.getSessionFactory().openSession();
		Transaction tx =se.beginTransaction();
		//Query qr =se.createQuery("from student s");
		//List li =qr.list();
		//Iterator i = li.iterator();
		Query<student> qr =se.createQuery("from student s");
		List<student> li =qr.list();
		Iterator<student> i = li.iterator();
		while(i.hasNext()) {
			student x = i.next();
			System.out.println(x.getSid()+" "+x.getSname()+" "+x.getSmarks()+" "+x.getSaddress());
		}
		
		
        tx.commit();
        se.close();
    }
}


