package com.springibatis.myspringboot.service;

import com.springibatis.myspringboot.entity.User;

public interface UserService {
	public User getUserById(int userId);

    boolean addUser(User record);

}
