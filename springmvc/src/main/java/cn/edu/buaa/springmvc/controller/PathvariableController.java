package cn.edu.buaa.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.buaa.springmvc.bean.User;

@Controller
public class PathvariableController {
	
	// 测试： http://localhost:8080/springmvc/pathvariable/zhanshan.html
	@ResponseBody
	@RequestMapping("/pathvariable/{username}")
	public User test1(@PathVariable String username) {
		User user  = new User();
		user.setUsername(username);
		return user;
	}
	
	// 测试：http://localhost:8080/springmvc/pathvariable/123456.html
	@ResponseBody
	@RequestMapping("/pathvariable2/{intval}")
	public User test1(@PathVariable Integer intval) {
		User user = new User();
		user.setUsername(intval + "");
		return user;
	}
	
}
