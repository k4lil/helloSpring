<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<c:url value="${request.getContextPath()}" var="root"></c:url>
	<c:url value="${root}/add" var="addUrl"></c:url>
	<a href='${addUrl}'><c:out value="Add Product"/></a>
	<table>
		<tr>
			<th>#ID</th>
			<th>Desc</th>
			<th>Quantity</th>
			<th>Actions</th>
		</tr>
		<c:forEach items="${products}" var="p">
			<tr>
				<td><c:out value="${p.id}" /></td>
				<td><c:out value="${p.desc}" /></td>
				<td><c:out value="${p.quantity}" /></td>
				<td>
					<c:url value="${root}/editProduct" var="editUrl">
						<c:param name="id" value="${p.id}" />
					</c:url>
					<a href="${editUrl}"><c:out value="Edit" /></a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>