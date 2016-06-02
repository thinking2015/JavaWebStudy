package cn.edu.buaa.springmvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.buaa.springmvc.bean.User;
import cn.edu.buaa.springmvc.constant.Global;
import cn.edu.buaa.springmvc.exception.MyException;
import cn.edu.buaa.springmvc.service.LoginService;


/**
 * 这个例子讲解了如何定义MVC三层注解，使用@Resource进行注入，以及使用@RequestMapping、@RequestParam 、@SessionAttributes
 */

@Controller
public class LoginController extends BaseController {

	@Resource
	private LoginService service;
	
	@Resource
	private HttpServletRequest request;
	
	// 定义一个方法，用来触发异常
	@RequestMapping("/exception")
	public void Exception() throws Exception {
		throw new MyException("!!这是一个触发异常的测试！！");
	}
	
	@RequestMapping("/loginpage")
	public String toLoginPage(){
		return "/WEB-INF/jsp/login.jsp";
	}
	
	@RequestMapping("/user/home")
	public String toUserHome(){
		return "/WEB-INF/jsp/userhome.jsp";
	}
	
	@RequestMapping("/logout")
	public String logout(){
		request.getSession().removeAttribute(Global.USER_SESSION_KEY);
		return "redirect:/";
	}
	
	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String doLogin(@RequestParam String userName, @RequestParam String password){
		
		try {
			User user = service.doLogin(userName, password);
			request.getSession().setAttribute(Global.USER_SESSION_KEY, user);
			return "redirect:/user/home.html";
		} catch (Exception e) {
			return "/WEB-INF/jsp/login.jsp";
		}
		
	}
	
}
