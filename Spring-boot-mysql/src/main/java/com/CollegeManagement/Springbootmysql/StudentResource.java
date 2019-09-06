package com.CollegeManagement.Springbootmysql;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class StudentResource {
	@Autowired
	StudentRepository studentRepository;
	@RequestMapping("/login")
	public String login()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/details")
	public ModelAndView login(personaldetails student)
	{
		System.out.println("hello");
		studentRepository.save(student);
		ModelAndView mv= new ModelAndView();
		mv.addObject("obj", student);
		mv.setViewName("details.jsp");
		return mv;
	}
	
	@RequestMapping("/adduser")
	public personaldetails adduser(@RequestBody personaldetails student)
	{
		
		studentRepository.save(student);
		return student;
		
	}
	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable int id)
	{
		studentRepository.deleteById(id);
		return "deleted";
		
	}
	
	@PutMapping("/updateuser")
	public personaldetails updateUser(@RequestBody personaldetails pd)
	{
		studentRepository.save(pd);
		return pd;
		
	}
	@RequestMapping("/getdetails")
	public ModelAndView getDetails(@RequestParam int id)
	{
		System.out.println(studentRepository.findByAddress("hyd"));
		personaldetails student=studentRepository.findById(id).orElse(new personaldetails());
		System.out.println(studentRepository.findByIdGreaterThan(1));
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("obj", student);
		mv.setViewName("details.jsp");
		return mv;
	}
	@RequestMapping("/all")
	@ResponseBody
	public List<personaldetails> getDetails()
	{
		
	return	studentRepository.findAll();
	
	}
	@RequestMapping("/getdetails/{id}")
	@ResponseBody
	public Optional<personaldetails> getDetailsofid(@PathVariable("id") int id)
	{
		return studentRepository.findById(id);
	}
	
	
	
	
}
