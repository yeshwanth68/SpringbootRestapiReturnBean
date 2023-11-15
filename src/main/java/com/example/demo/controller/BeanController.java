package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
public class BeanController {
	
	    // http://localhost:8080/student
		@GetMapping("/student")
		public Student getStudent() {
			return new Student("Yeshwanth", "Kumar");
		}
		
		// http://localhost:8080/student1
		@RequestMapping(path="/student1",method=RequestMethod.GET)
		public Student getStudent1() {
			return new Student("Vishal", "Raj");
		}

}
