package com.bjpowernode.service;

import java.util.List;

import com.bjpowernode.domain.Student;

public interface StudentService {

	int addStudent(Student student);
	List<Student> findStudent();
}
