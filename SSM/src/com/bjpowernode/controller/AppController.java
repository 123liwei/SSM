/**
 * 
 */
package com.bjpowernode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("app")
public class AppController {

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
}
