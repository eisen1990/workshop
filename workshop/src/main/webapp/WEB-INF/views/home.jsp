<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  test
</h1>

<c:forEach var="result" items="${member}">
	${result._id}
	${result._name}
</c:forEach> 
</body>
</html>
