<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请注册</title>
</head>
<body>

	<div style="margin:0 auto; padding-top: 100px;" align="center">
		<form action="doRegister.html" method="post">
			<p>
				${ERR_username }
				<span>用户名：</span><input type="text" name="username">
			</p>
			<p>
				${ERR_password }
				<span>密  码：</span><input type="password" name="password">
			</p>
			<p>
				${ERR_age }
				<span>年  龄：</span><input type="text" name="age">
			</p>
			<p>
				${ERR_realName }
				<span>真实姓名：</span><input type="text" name="realName">
			</p>
			<p>
				${ERR_email }
				<span>电子邮件：</span><input type="text" name="email">
			</p>
			<p>
				<input type="submit" value="登录">
			</p>		
		</form>
	</div>

</body>
</html>