package com.mondee;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;



public class SpringJdbcSelect {

		 SessionFactory   sf;

		public void setSf(SessionFactory  sf) {
			this.sf = sf;
		}
		
		public void select()
		{
			
			Session se = sf.openSession();
			Query qr = se.createQuery("from Student s");
			List  li =qr.list();
			Iterator i =li.iterator();
			
			while(i.hasNext()) {
				Student s=(Student)i.next();
				System.out.println(s.getSid()+" "+s.getName()+" "+s.getMarks()+" "+s.getAddress());
			}
			
			
			
		}
		public void insert() {
			Session se= sf.openSession();
			Transaction tx =se.beginTransaction();
			
			Student s1 = new Student();
			s1.setSid(1301);
			s1.setName("ram");
			s1.setMarks(320);
			s1.setAddress("Noida");
			se.save(s1);
			tx.commit();
			
			}
	
public void update() {
	 {
			
			Session se=sf.openSession();
			Transaction tx=se.beginTransaction();
			Student s1=se.load(Student.class,1301);
			s1.setName("ramesh");
			se.update(s1);
			tx.commit();
		}
	
	}
public void delete()
{
	  Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		Student s1=se.load(Student.class,1204);
		se.delete(s1);
		tx.commit();
}
}

