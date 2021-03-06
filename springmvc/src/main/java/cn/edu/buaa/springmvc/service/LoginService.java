package cn.edu.buaa.springmvc.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.edu.buaa.springmvc.bean.User;
import cn.edu.buaa.springmvc.dao.LoginDao;



@Service
public class LoginService {

	@Resource
	LoginDao dao ;

	public User doLogin(String username, String password) throws Exception {
		
		if (username == null || "".equals(username)) {
			throw new Exception("用户名不能为空");
		}
		
		if (password == null || "".equals(password)) {
			throw new Exception("密码不能为空");
		}
		
		User user = dao.selectByUserName(username);
		if (user == null) {
			throw new Exception("账号不存在");
		}
		
		if (!user.getPassword().equals(password)) {
			throw new Exception("密码不正确");
		}
		
		return user;
	}
	
}
