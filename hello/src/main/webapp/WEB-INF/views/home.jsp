<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<table>
		<tr>
			<th>#ID</th>
			<th>Desc</th>
			<th>Quantity</th>
		</tr>
		<c:forEach items="${products}" var="p">
			<tr>
			<td><c:out value="${p.id}"/></td>
			<td><c:out value="${p.desc}"/></td>
			<td><c:out value="${p.quantity}"/></td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>