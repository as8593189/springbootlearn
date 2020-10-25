package com.Mapper;

import java.util.*;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.pojo.User;

public interface UserMapper {
		@Select("select * from mysql.users")
		public List<User> showAllUser();
		@Insert("insert into mysql.users values(default,#{uname},#{uage})")
		public void addUser(String uname,int uage);
}
