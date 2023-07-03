package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses()
	{
		return Arrays.asList(new Course(1,"AWS","Ram"),
				new Course(2,"Devops","Abhisek")
				,new Course(3,"JAVA","Prakhar"));
	}
	
	
}