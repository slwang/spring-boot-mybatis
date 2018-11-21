package com.springibatis.myspringboot.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springibatis.myspringboot.entity.TestUser;


@RestController
@SpringBootApplication
@RequestMapping("/")
public class TestUserController {

	@RequestMapping("getuser")
	public TestUser getTestUser() {
		TestUser user = new TestUser();
		user.setName("test");
		return user;
	}

}
