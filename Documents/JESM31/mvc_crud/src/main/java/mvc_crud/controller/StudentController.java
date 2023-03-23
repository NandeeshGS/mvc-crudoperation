package mvc_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import mvc_crud.dto.Student;
import mvc_crud.service.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	StudentService service;
	
	
	@RequestMapping("load")
	public ModelAndView load(){
		return service.load();
	}

	@PostMapping("create")
	public ModelAndView create(@ModelAttribute Student student,@RequestParam("x") String dob){
		return service.create(student,dob);
	}
	
	@GetMapping("fetch")
	public ModelAndView fetch(){
		return service.fetch();
		
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(@RequestParam int id){
		return service.delete(id);
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam int id){
		return service.edit(id);
	}
	
	@PostMapping("update")
	public ModelAndView update(@ModelAttribute Student student,@RequestParam("x") String dob){
		return service.update(student,dob);
	}
}
