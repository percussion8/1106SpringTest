<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.Spring1106.domain.JuminVO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주민 수정</title>
</head>
<body>
<form action="update" method="post">
 <input type="hidden" name="mpno" value="${juminSelect.mpno}"><br>
이름 : <input type="text" name="sname" value="${juminSelect.sname }"><br>
비밀번호 : <input type="text" name="spassword" value="${juminSelect.spassword }"><br>
부 : <input type="text" name="fname" value="${juminSelect.fname }"><br>
모 : <input type="text" name="mname" value="${juminSelect.mname }"><br>
자녀 : <input type="text" name="cname" value="${juminSelect.cname }"><br>
주소 : <input type="text" name="paddress" value="${juminSelect.paddress }"><br>
전화번호 : <input type="text" name="pnumber" value="${juminSelect.pnumber }"><br>
가족 수 : <input type="number" name="pfamilycount" value="${juminSelect.pfamilycount }"><br>
<input type="submit" value="추가">
<input type="reset" value="취소">
</form>

</body>
</html>