package com.Controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Service.UserService;
import com.pojo.User;

@Controller
@RequestMapping("/users")
public class UserController {
	//注入
	@Autowired
	private UserService userService;
	//显示页面跳转
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	//显示所有的用户
	@RequestMapping("/all")
	public String showAllUsers(Model model) {
		List<User> users=userService.showAllUsers();
		model.addAttribute("users", users);
		return "users.html";
	}
	//添加新用户的请求
	@RequestMapping("/adduser")
	public String addUser(@RequestParam(value="uname") String uname,@RequestParam(value="uage") int uage) {
		System.out.println("测试");
		userService.addUser(uname, uage);
		return  "success.html";
	}
}
