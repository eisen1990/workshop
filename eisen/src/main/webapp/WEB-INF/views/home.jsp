<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" >
<title>Eisen's work shop</title>
</head>
<body>
	<div id="topbar">
		<P> 안녕하세요 </P>
	</div>
	<div id="loginform">
	<form action="login" method="post">
	<table>
		<tr>
		<td><input type="text" name="id"></td>
		</tr>
		<tr>
		<td><input type="text" name="password"></td>
		<td><input type="submit" value="로그인"></td>
		</tr>
	</table>
	</form>
	</div>
</body>
</html>