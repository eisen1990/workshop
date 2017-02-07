<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>main</title>
</head
>
<body>

<p><a href="/workshop/logout"> 로그아웃 </a></p>
<p><a href="/workshop/members"> 멤버 </a></p>
<p>
<form action="/workshop/fileupload" method="POST" enctype="multipart/form-data">
<input type="file" name="file">
<input type="submit" value="파일전송">
</form>
</p>

</body>
</html>
