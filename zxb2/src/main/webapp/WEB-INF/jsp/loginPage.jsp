<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<form action="loginSubmit.do" method="post">
			账号:<input type="text" name="userAccount" /><br/>
			密码:<input type="password" name="userPwd" /><br/>
			<span style="color: red;">
				${error}
			</span><br/>
			<input type="submit" value="登录" />
		</form>
	</body>
</html>