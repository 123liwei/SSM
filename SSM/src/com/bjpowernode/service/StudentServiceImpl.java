package com.bjpowernode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;

@Service(value="studentService")
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.insertStudent(student);
	}

	@Override
	public List<Student> findStudent() {
		// TODO Auto-generated method stub
		return studentDao.selectStudent();
	}

	
}
