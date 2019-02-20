package com.bjpowernode.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	@RequestMapping(value="addStudent.do")
	public ModelAndView addStudent(Student student){
		ModelAndView mv=new ModelAndView();
		int result=studentService.addStudent(student);
		if(result>0){
			mv.addObject("msg","注册成功");
			mv.setViewName("success");
		}else{
			mv.addObject("msg","注册成功");
			mv.setViewName("fail");
		}
		return mv;
	}
	@RequestMapping(value="findStudent.do")
	@ResponseBody
	public List<Student> queryStudent(){
		System.out.println("1");
		List<Student> stuList=studentService.findStudent();
		if(stuList!=null&&stuList.size()<1){
			stuList= new ArrayList<>();
		}
		System.out.println(stuList);
		return stuList;
	}
}
