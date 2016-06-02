package cn.edu.buaa.springmvc.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import cn.edu.buaa.springmvc.annotation.Between;

public class User {
	
	@NotNull(message = "{NotNull.username}")
	private String username;
	
	@Pattern(regexp = "[0-9a-zA-Z_]{6,30}", message = "{Pattern.password}")
	private String password;
	
	@Length(min = 2, max = 10, message = "真实姓名长度在2-10之间")
	private String realName;
	
	@Between(min = 18, max = 45)
	@NotNull(message = "年龄不能为空")
	private Integer age;
	
	@Email(message = "邮件格式不正确")
	private String email;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
