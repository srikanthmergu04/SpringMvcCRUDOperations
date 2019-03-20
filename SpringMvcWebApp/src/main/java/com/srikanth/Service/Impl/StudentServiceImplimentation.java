package com.srikanth.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.srikanth.Dao.StudentDao;
import com.srikanth.Dao.Impl.StudentDaoImplimentation;
import com.srikanth.Service.StudentService;
import com.srikanth.model.Student;

@Service
public class StudentServiceImplimentation{
	
	@Autowired
	StudentDaoImplimentation dao;
	

	public void registerStudent(Student student) {
		// TODO Auto-generated method stub=
		System.out.println("dao in Service Implimentation = "+dao);
	//	StudentDao studentDao = new StudentDaoImplimentation();
		
		dao.registerStudent(student);
		
	}

}
