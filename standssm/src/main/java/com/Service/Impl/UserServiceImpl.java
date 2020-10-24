package com.Service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Mapper.UserMapper;
import com.Service.UserService;
import com.pojo.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserMapper usermapper;
	@Override
	public List<User> showAllUsers() {
		return usermapper.showAllUser();
	}
	@Override
	public void addUser(String uname, int uage) {
		// 添加新用户
		usermapper.addUser(uname, uage);
		
	}

}
