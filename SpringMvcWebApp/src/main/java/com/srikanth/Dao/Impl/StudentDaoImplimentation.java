package com.srikanth.Dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.srikanth.Dao.StudentDao;
import com.srikanth.model.Student;

@Repository
public class StudentDaoImplimentation {
	
	@Autowired
	JdbcTemplate template;

	public void registerStudent(Student student) {
		
	//	JdbcTemplate jdbc = template;
		
		// TODO Auto-generated method stub
		
		System.out.println("JdbcTemplate in DaoImplimentaion = "+template);
		
		String sql = "INSERT INTO student (id,sName,age,dept,city) VALUES (? , ? , ? , ? , ?)";
		
		template.update(sql, student.getId(),student.getsName(),student.getAge(),student.getDept(),student.getCity());
		
	}
	






}
