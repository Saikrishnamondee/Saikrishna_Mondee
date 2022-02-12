package com.mondee;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
public class MainLogic {
public static void main(String[] args) {
		// TODO Auto-generated method stub
       StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.xml").build();
       Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = me.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		Vendor v=new Vendor();
		v.setVendorId(211);
		v.setVendorName("Flipkart");
		
		Customers c1=new Customers();
		c1.setCustomerId(456);
		c1.setCustomerName("sai");
		
		Customers c2=new Customers();
		c2.setCustomerId(674);
		c2.setCustomerName("krishna");
		
	    Set s=new HashSet();
		s.add(c1);
		s.add(c2);
		
		v.setObj(s);
		se.save(v);
		tx.commit();
		se.close();
		}
}