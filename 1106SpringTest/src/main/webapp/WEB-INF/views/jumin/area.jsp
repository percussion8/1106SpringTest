<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.Spring1106.domain.JuminVO" %>
<%@ page import = "java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>지역 주민 검색</title>
</head>
<body>
<p>현재 검색 지역: ${areaName }</p>
<table border="1px" bordercolor="#960229">
<thead>
	<td></td>
	<td>이름</td>
	<td>비밀번호</td>
	<td>부</td>
	<td>모</td>
	<td>자녀</td>
	<td>주소</td>
	<td>전화번호</td>
	<td>가족 수</td>
	<td></td>
</thead>
<c:forEach var="jumin" items="${areaJumin }">
<tr>
	<td><a href="update?no=${jumin.mpno }">[수정]</a></td>
	<td>${jumin.sname }</td>
	<td>${jumin.spassword }</td>
	<td>${jumin.fname }</td>
	<td>${jumin.mname }</td>
	<td>${jumin.cname }</td>
	<td>${jumin.paddress }</td>
	<td>${jumin.pnumber }</td>
	<td>${jumin.pfamilycount }</td>
	<td><a href="delete?no=${jumin.mpno }">[삭제]</a></td>
</tr>
</c:forEach>
<tfoot>
	<td></td>
	<td>이름</td>
	<td>비밀번호</td>
	<td>부</td>
	<td>모</td>
	<td>자녀</td>
	<td>주소</td>
	<td>전화번호</td>
	<td>가족 수</td>
	<td></td>
</tfoot>
</table>
<p><a href="list">메인으로</a></p>

</body>
</html>