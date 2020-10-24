package com.Mapper;

import java.util.*;


import org.apache.ibatis.annotations.Select;

import com.pojo.User;

public interface UserMapper {
		@Select("select * from mysql.users")
		public List<User> showAllUser();
}
