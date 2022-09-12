package com.springboot.first.app;

import java.util.ArrayList;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	//localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Satish","Reddy" ,1);
	}
	
	@GetMapping("/students")  
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student("Satish", "		", 1));
		students.add(new Student("Reddy", "Satish", 2));
		students.add(new Student("srinu", "redy", 3));
		students.add(new Student("vishnu", "Redy", 4));
		students.add(new Student("siddamuthi", "sirisha", 5));
		
		return students;
		}
	
	@GetMapping("/student/{firstname}/{lastname}/{id}")
	public Student studentPathVariable(@PathVariable("firstname")String firstname,@PathVariable("lastname")String lastname,
			@PathVariable("id")long id) {
		return new Student(firstname,lastname,id);
	}
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam (name="firstname")String firstname,
			@RequestParam( name="lastname")String lastname,
			@RequestParam(name="id") long id) {
		return new Student(firstname,lastname,id);
	}
}
