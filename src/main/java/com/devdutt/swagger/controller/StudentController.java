package com.devdutt.swagger.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.devdutt.swagger.model.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "StudentRestController", description = "REST APIs related to Student Entity!!!!")
@RestController
public class StudentController {

	List<Student> students = new ArrayList<>();
	{
		students.add(new Student("Sajal", "CS", "India"));
		students.add(new Student("Lokesh", "EC", "India"));
		students.add(new Student("Kajal", "CS", "USA"));
		students.add(new Student("Sukesh", "Mechnical", "USA"));
	}

	@ApiOperation(value = "Get list of all the students",tags = "getStudents")
	@ApiResponses(value = { 
		      @ApiResponse(code = 200, message = "Success|OK"),
		      @ApiResponse(code = 401, message = "not authorized!"), 
		      @ApiResponse(code = 403, message = "forbidden!!!"),
		      @ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping(value = "/getStudents")
	public List<Student> getStudents() {
		return students;
	}

	@ApiOperation(value = "Get specific Student in the System ", response = Student.class, tags = "getStudent")
	@GetMapping(value = "/getStudentByName/{name}")
	public Student getStudentByName(@PathVariable(value = "name") String name) {
		return students.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
	}

	@ApiOperation(value = "Get specific Student By Country in the System ", response = Student.class, tags = "getStudentByCountry")
	@GetMapping(value = "/getStudentByCountry/{country}")
	public List<Student> getStudentByCountry(@PathVariable(value = "country") String country) {
		return students.stream().filter(x -> x.getCountry().equalsIgnoreCase(country)).collect(Collectors.toList());
	}

	@ApiOperation(value = "Get specific Student By Courses in the System ",response = Student.class,tags="getStudentByCourse")
	@GetMapping(value = "/getStudentByCourse/{course}")
	public List<Student> getStudentByCourse(@PathVariable(value = "course") String course) {
		return students.stream().filter(x -> x.getCourse().equalsIgnoreCase(course)).collect(Collectors.toList());
	}

}
