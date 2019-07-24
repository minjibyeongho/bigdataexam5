<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>selectAll page</h1>
<center>
	<table border="1" bordercolor="blue" background="lime">
		<tr bordercolor="green">
			<th width="80">아이디</th>
			<th width="80">곡명</th>
			<th width="80">가격</th>
			<th width="80">가수명</th>
		</tr>
		<c:forEach var="dto" items="${list}">
			<tr bordercolor="red">
				<td>${dto.id }</td>
				<td>${dto.name }</td>
				<td>${dto.price }</td>
				<td>${dto.singer }</td>
			</tr>
		</c:forEach>
	</table>
</center>
</body>
</html>