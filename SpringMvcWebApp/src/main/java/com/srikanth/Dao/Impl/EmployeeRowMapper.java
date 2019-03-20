package com.srikanth.Dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.srikanth.model.Student;

public class EmployeeRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		
		student.setId(rs.getInt("id"));
		student.setsName(rs.getString("sName"));
		student.setAge(rs.getInt("age"));
		student.setDept(rs.getString("dept"));
		student.setCity(rs.getString("city"));
		
		return student;
	}

}
