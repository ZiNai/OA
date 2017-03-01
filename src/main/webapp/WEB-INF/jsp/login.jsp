<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div align="center">用户登陆</div>
		<form action="login" method="post">

			<p>
				登录名：<input type="text" name="paramUser.name" class="input_text"/><span class="error_message" id="username_error"></span>
			</p>
			<p>
				密码：<input type="password" name="paramUser.passWord"  class="input_text" />
			</p>

			<input type="submit" value="登陆" />
			<button onclick="register()" name="submit">注册</button>
			${errorMessage}
		</form>
	</div>
</body>
</html>