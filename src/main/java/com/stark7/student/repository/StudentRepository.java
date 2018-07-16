package com.stark7.student.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stark7.student.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
