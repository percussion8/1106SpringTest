<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
이름 : <input type="text" name="sname"><br>
비밀번호 : <input type="text" name="spassword"><br>
부 : <input type="text" name="fname"><br>
모 : <input type="text" name="mname"><br>
자녀 : <input type="text" name="cname"><br>
주소 : <input type="text" name="paddress"><br>
전화번호 : <input type="text" name="pnumber"><br>
가족 수 : <input type="number" name="pfamilycount"><br>
<input type="submit" value="추가">
<input type="reset" value="취소">
</form>

</body>
</html>