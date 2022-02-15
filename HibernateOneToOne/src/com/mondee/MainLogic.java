package com.mondee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class MainLogic {
	
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	       StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
	       Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
			SessionFactory sf = me.buildSessionFactory();
			Session se = sf.openSession();
			Transaction tx = se.beginTransaction();
			
			Employeee E=new Employeee();
			E.setEid(1203);
			E.setEname("sai");
			
			Email em = new Email();
			em.setMailid("sgardasu@mondee.com");
			
			
			E.setEmail(em);
			em.setEmployee(E);
			
			se.save(E);
			se.save(em);
			
			tx.commit();
			se.close();
			}
	}


