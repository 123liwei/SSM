package com.bjpowernode.dao;

import java.util.List;

import com.bjpowernode.domain.Student;

public interface StudentDao {

	int insertStudent(Student student);
	List<Student> selectStudent();
}
