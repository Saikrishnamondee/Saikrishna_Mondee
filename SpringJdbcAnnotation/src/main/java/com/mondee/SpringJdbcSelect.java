package com.mondee;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
public class SpringJdbcSelect {
	JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
public void select()
{
	List li= jt.queryForList("Select * from student");
	Iterator i= li.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
public void insert() {
	jt.execute("insert into student values(1206,'kiran',345,'Mumbai')");
}
public void update() {
	jt.execute("update student set address='delhi' where sid=1204");
}
public void delete() {
	jt.execute("delete from  student where sid=1208");
}
}
