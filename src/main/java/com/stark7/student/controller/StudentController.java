package com.stark7.student.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stark7.student.entity.Student;
import com.stark7.student.service.StudentService;

@RestController
@RequestMapping(path = "/students")
public class StudentController {

	private static final Logger LOGGER = LogManager.getLogger(StudentController.class);

	@Autowired
	StudentService studentService;

	@RequestMapping(path = "", method = RequestMethod.GET)
	public ResponseEntity<?> getAllStudents() {
		LOGGER.info("GET /students");
		List<Student> students = studentService.getAllStudents();
		return new ResponseEntity<>(students, HttpStatus.OK);
	}

	@RequestMapping(path = "/{rollnumber}", method = RequestMethod.GET)
	public ResponseEntity<?> getStudent(@RequestParam(name = "rollnumber") Integer rollnumber) {
		LOGGER.info("GET /students/{rollnumber}");
		Student student = studentService.getStudent(rollnumber);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@RequestMapping(path = "", method = RequestMethod.POST)
	public ResponseEntity<?> addStudent(@RequestBody(required = true) Student student) {
		LOGGER.info("POST /students");
		Student studentAdded = studentService.addStudent(student);
		return new ResponseEntity<>(studentAdded, HttpStatus.CREATED);
	}

	@RequestMapping(path = "/{rollnumber}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateStudent(@RequestParam(name = "rollnumber") Integer rollnumber,
			@RequestBody(required = true) Student student) {
		LOGGER.info("PUT /students/{rollnumber}");
		Student studentAdded = studentService.updateStudent(student);
		return new ResponseEntity<>(studentAdded, HttpStatus.OK);
	}

	@RequestMapping(path = "/{rollnumber}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteStudent(@RequestParam(name = "rollnumber") Integer rollnumber) {
		LOGGER.info("DELETE /students/{rollnumber}");
		Boolean flag = studentService.deleteStudent(rollnumber);
		return new ResponseEntity<>(flag, HttpStatus.OK);
	}

}
