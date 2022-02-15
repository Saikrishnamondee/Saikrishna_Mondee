package com.mondee;

import java.util.ArrayList;

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
			
			
			
			Answer ans1= new Answer();
			ans1.setAnswer("HyperTextMarkupLanguage");
			ans1.setAnsweredby("ram");
			ans1.setAid(1);
			
			Answer ans2 = new Answer();
			ans2.setAnswer("Used to create WebPages");
			ans2.setAnsweredby("raju");
			ans2.setAid(2);
			
			ArrayList<Answer> aa1 = new ArrayList<Answer>();
			aa1.add(ans1);
			aa1.add(ans2);
			
			Answer ans3 = new Answer();
			ans3.setAnswer("Programming language");
			ans3.setAnsweredby("kiran");
			ans3.setAid(3);
			
			Answer ans4 = new Answer();
			ans4.setAnswer("Platform independent");
			ans4.setAnsweredby("sai");
			ans4.setAid(4);
			
			ArrayList<Answer> aa2 = new ArrayList<Answer>();
			aa2.add(ans3);
			aa2.add(ans4);
			
			
			Question que1= new Question();
			que1.setQuestion("what is HTML");
			que1.setId(1);
			

			Question que2= new Question();
			que2.setQuestion("what is JAVA");
			que2.setId(2);
			
			que1.setAnswers(aa1);
			que2.setAnswers(aa2);
			se.save(que1);
			se.save(que2);
			tx.commit();
			se.close();
			}
	}


