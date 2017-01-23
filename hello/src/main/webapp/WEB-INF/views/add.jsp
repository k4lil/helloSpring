<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href='<c:url value="/resources/css/style.css" />' rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>add product</title>
</head>
<body>
<fieldset>
		<legend>Add product</legend>

		<f:form modelAttribute="product" method="post" action="saveProduct">
			<table>
				<tr>
					<td>#ID</td>
					<td><f:input path="id" />
						<f:errors path="id" cssClass="inputError"></f:errors></td>
				</tr>
				<tr>
					<td>description</td>
					<td><f:input path="desc" />
						<f:errors path="desc"></f:errors></td>
				</tr>
				<tr>
					<td>Quantity</td>
					<td><f:input path="quantity" />
						<f:errors path="quantity"></f:errors></td>
				</tr>
				<tr>
					<td><input type="submit" value="add" /></td>
				</tr>
			</table>
		</f:form>
	</fieldset>
</body>
</html>