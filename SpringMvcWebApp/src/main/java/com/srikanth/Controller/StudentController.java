package com.srikanth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.srikanth.Dao.Impl.StudentDaoImplimentation;
import com.srikanth.Service.StudentService;
import com.srikanth.Service.Impl.StudentServiceImplimentation;
import com.srikanth.model.Student;

@Controller
public class StudentController {
		
	@Autowired
	StudentServiceImplimentation service ; 

	@RequestMapping("/RegisterStudent")
	public String registerStudents(Model m)
	{
		//System.out.println("Hello this is StudentController");
		m.addAttribute("student", new Student());
		//System.out.println("JdbcTemplate = "+template);
		System.out.println("service in Student Controller = "+service);
		//System.out.println("dao = "+dao);
		return "registerStudent.jsp";
		
	}
	
	@RequestMapping(value="/registerSuccess", method=RequestMethod.POST)
	public String registerSuccess(@ModelAttribute("student") Student student) {
		
		System.out.println(student.getId());
		System.out.println(student.getsName());
		
	//	StudentService studentService = new StudentServiceImplimentation();
		
	    service.registerStudent(student);
		
		
		
		
		//userService.createUser(student);
		return "redirect:/listUsers";
	}
	
	

}