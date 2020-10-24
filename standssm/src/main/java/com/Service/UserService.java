package com.Service;

import java.util.*;
import com.pojo.User;

public interface UserService {
		public List<User> showAllUsers();
		public void addUser(String uname,int uage);
}
