package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jump")
public class JumpController {

	@RequestMapping("to.do")
	
	public String Jumpto(String target){
		System.out.println(target);
		return target;
	}
}
