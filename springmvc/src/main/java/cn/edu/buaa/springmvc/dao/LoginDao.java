package cn.edu.buaa.springmvc.dao;

import org.springframework.stereotype.Repository;

import cn.edu.buaa.springmvc.bean.User;


@Repository
public class LoginDao {

	public User selectByUserName(String username) {
		if (!"admin".equals(username)) {
			return null;
		}
		User user = new User();
		user.setUsername("admin");
		user.setPassword("123");
		return user;
	}

}
