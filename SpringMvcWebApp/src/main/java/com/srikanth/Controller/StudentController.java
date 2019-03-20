package com.srikanth.Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
		
		System.out.println();
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
		return "redirect:/listStudents";
	}
	
	@RequestMapping(value="/listStudents", method=RequestMethod.GET)
	public String listStudents(Model model)
	{
		//ModelAndView model = new ModelAndView();
		List<Student> student = new ArrayList();
		
		student = service.listAllUsers();
		
	//System.out.println("student in Controller = "+student);
		/*
		for (Student stu : student) {
			
			System.out.println(stu.getId());
			System.out.println(stu.getsName());
			System.out.println(stu.getAge());
			System.out.println(stu.getDept());
			System.out.println(stu.getCity());
			
			
		}
		*/

		/*
		model.addObject("list", student);
	
		model.setViewName("listStudents.jsp");
		*/
		
		model.addAttribute("list", student);
		
		
		return "listStudents.jsp";
		
	}
	
	

}