<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>多文件上传结果 </title>
</head>
<body>

	<div style="margin: 0 auto;margin-top: 100px; ">
	
		<%
		List<String> fileList = (List<String>)request.getAttribute("files");
		for(String url : fileList){
			%>
			<a href="<%=url %>">
				<img alt="" src="<%=url %>">
			</a>
			<%
		}
		%>
	
	</div>

</body>
</html>