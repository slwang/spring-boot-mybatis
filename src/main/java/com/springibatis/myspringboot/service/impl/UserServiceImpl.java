package com.springibatis.myspringboot.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springibatis.myspringboot.dao.UserDao;
import com.springibatis.myspringboot.entity.User;
import com.springibatis.myspringboot.service.UserService;

@Service("userService")
public class UserServiceImpl  implements UserService{
	@Resource
	private UserDao userDao;

	@Override
	public User getUserById(int userId) {

		 return userDao.selectByPrimaryKey(userId);
	}

	@Override
	public boolean addUser(User record) {

		boolean result = false;
        try {
            userDao.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
	}

}
