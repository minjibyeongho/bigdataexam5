<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="input.do">
	아이디 : <input type="text" name="id"><br>
	곡명 : <input type="text" name="name"><br>
	가격 : <input type="text" name="price"><br>
	가수명 : <input type="text" name="singer"><br>
	<input type="submit" value="삽입!">
</form>

<hr size="3" color="red">

<form action="update.do">
	아이디 : <input type="text" name="id"><br>	
	가격 : <input type="text" name="price"><br>
	<input type="submit" value="수정!!">
</form>

<hr size="3" color="red">

<form action="delete.do">
	아이디 : <input type="text" name="id"><br>	
	<input type="submit" value="삭제!!!">
</form>

<hr size="3" color="red">

<form action="select.do">
	아이디 : <input type="text" name="id"><br>	
	<input type="submit" value="검색!!">
</form>

<hr size="3" color="red">

<a href="selectAll.do">전체 검색!</a>

<hr size="3" color="red">

</body>
</html>