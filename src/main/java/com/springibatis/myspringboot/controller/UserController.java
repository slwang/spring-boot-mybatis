package com.springibatis.myspringboot.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springibatis.myspringboot.entity.User;
import com.springibatis.myspringboot.service.UserService;


@RestController
@SpringBootApplication
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/showUser")
	@ResponseBody
	public User toIndex(HttpServletRequest request, Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		return user;	
		
	}

}
