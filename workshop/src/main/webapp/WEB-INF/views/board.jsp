<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td> 글 번호 </td>
		<td> 글쓴이 </td>
		<td> 제목 </td>
	</tr>
	<c:forEach items="${board}" var="list">
	<tr>
		<td> ${list._number} </td>
		<td> ${list._id} </td>
		<td> <a href="">${list._title}</a> </td>
	</tr>
	</c:forEach>
</table>
</body>
</html>