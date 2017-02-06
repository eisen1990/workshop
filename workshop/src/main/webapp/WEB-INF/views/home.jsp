<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*,com.eisen.mybatis.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function del(del_name)
{
	document.txForm.name.value = del_name;
	txForm.action = "/workshop/delete";
}
function upd(upd_name)
{
	document.txForm.name.value = upd_name;
	document.txForm.action = "/workshop/update";
	//document.txForm.phone_tmp.value = document.txForm.phone.value;
	document.txForm.submit();
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>main</title>
</head
>
<body>
<form name="txForm" method="post" action="/workshop/insert">
	<table border="1">
		<tr>
			<td>이름</td>
			<td>이메일</td>
			<td>전화번호</td>
			<td></td>
		</tr>

		<tr>
			<td><input type="text" name="name" id="name"></td>
			<td><input type="text" name="email" id="email"></td>
			<td><input type="text" name="phone" id="phone"></td>
			<td colspan="2" align="center">
			<input type="submit" value="추가">
			</td>

		</tr>
		<c:forEach items="${result1}" var="member">
			<tr>
				<td>${member._id}</td>
				<td>${member._password}</td>
				<td>${member._name}</td>
				<td><input type="button" value="수정" onclick="upd('${member._name}')"> 
					<input type="submit" value="삭제" onclick="del('${member._name}')"></td>
			</tr>
		</c:forEach>
	</table>

</form>
</body>
</html>
