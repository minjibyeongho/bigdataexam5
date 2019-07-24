<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>update page</h1>

<center>
	<table border="1" bordercolor="blue" background="gray">
		<tr bordercolor="green">
			<th width="80">아이디</th>
			<th width="120">수정된 가격</th>
		</tr>
		<tr bordercolor="red">
			<td>${dto.id }</td>
			<td>${dto.price }</td>
		</tr>
	</table>
</center>

</body>
</html>