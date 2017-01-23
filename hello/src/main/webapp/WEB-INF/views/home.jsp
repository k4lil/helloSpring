<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${pageTitle}</title>
</head>
<body>
	<fieldset>
		<legend>Add product</legend>
	
	<f:form modelAttribute="product" method="post" action="saveProduct">
		<table>
			<tr>
				<td>#ID</td>
				<td><f:input path="id" /></td>
			</tr>
			<tr>
				<td>description</td>
				<td><f:input path="desc" /></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><f:input path="quantity" /></td>
			</tr>
			<tr><td><input type="submit" value="add" /></td></tr>
		</table>
	</f:form>
	</fieldset>
	<fieldset>
		<legend>message</legend>
		<c:out value="${pageMessage}"></c:out>
	</fieldset>
	<table>
		<tr>
			<th>#ID</th>
			<th>Desc</th>
			<th>Quantity</th>
			<th>Actions</th>
		</tr>
		<c:forEach items="${products}" var="p">
			<tr>
			<td><c:out value="${p.id}"/></td>
			<td><c:out value="${p.desc}"/></td>
			<td><c:out value="${p.quantity}"/></td>
			<td><input type="submit" value="edit" /></td>
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>