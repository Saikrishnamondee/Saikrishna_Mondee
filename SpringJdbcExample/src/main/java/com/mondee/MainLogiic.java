package com.mondee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogiic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ct =new  ClassPathXmlApplicationContext("spring.xml");
		SpringJdbcSelect sj =ct.getBean(SpringJdbcSelect.class);
		//sj.insert();
		//sj.update();
		sj.delete();
		sj.select();
		
		
	}

}
