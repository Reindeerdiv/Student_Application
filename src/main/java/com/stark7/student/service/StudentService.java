package com.stark7.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.stark7.student.entity.Student;
import com.stark7.student.exception.StudentException;
import com.stark7.student.repository.StudentRepository;

@Service
public class StudentService {

	// private static final Logger LOGGER =
	// LogManager.getLogger(StudentService.class);

	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		List<Student> students = (List<Student>) studentRepository.findAll();
		return students;
	}

	public Student getStudent(Integer rollnumber) {
		Optional<Student> student = studentRepository.findById(rollnumber);
		if (student.isPresent()) {
			return student.get();
		} else {
			throw new StudentException("Student not found", HttpStatus.NOT_FOUND);
		}
	}

	public Boolean deleteStudent(Integer rollnumber) {
		Optional<Student> student = studentRepository.findById(rollnumber);
		if (student.isPresent()) {
			studentRepository.deleteById(rollnumber);
			return true;
		} else {
			throw new StudentException("Student not found", HttpStatus.NOT_FOUND);
		}
	}

	public Student addStudent(Student studentEntity) {
		Optional<Student> student = studentRepository.findById(studentEntity.getRollnumber());
		if (student.isPresent()) {
			throw new StudentException("Student already present, try different roll number", HttpStatus.CONFLICT);
		} else {
			Student studentSaved = studentRepository.save(studentEntity);
			return studentSaved;
		}
	}

	public Student updateStudent(Student studentEntity) {
		Optional<Student> student = studentRepository.findById(studentEntity.getRollnumber());
		if (student.isPresent()) {
			Student studentUpdated = studentRepository.save(studentEntity);
			return studentUpdated;
		} else {
			throw new StudentException("Student not found", HttpStatus.NOT_FOUND);
		}
	}

}
