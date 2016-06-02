package cn.edu.buaa.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.edu.buaa.common.RandomValidateCode;
import cn.edu.buaa.constant.Constants;

@Controller
public class ToolController {
	
	@RequestMapping("topage")
	public String toPage(@RequestParam String pagename) {
		
		// return "/WEB-INF/jsp/" + pagename + ".jsp";
		return pagename;
	}
	
	@Resource
	RandomValidateCode code;
	@RequestMapping("vcode")
	public void vcode(HttpServletRequest request, HttpServletResponse response) {
		code.getRandcode(request, response);
	}
	
	@RequestMapping("doLogin")
	public String doLogin(HttpServletRequest request, HttpServletResponse response, @RequestParam String vcode){
		
		String sessionCode = (String)request.getSession().getAttribute(Constants.RANDOM_CODE_KEY);
		if (vcode.equals(sessionCode)) {
			return "redirect:http://localhost:8080/uploadAndDownload";
		}else {
			request.setAttribute("error", "验证码错误");
			return "login";
		}
	}	
}
