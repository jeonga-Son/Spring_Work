<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�� ���γ���</h1>
	<a href="board_insert"></a>
	<table border="1" width = "800">
		<tr>
			<td>�۹�ȣ</td>
			<td>����</td>
			<td>�ۼ���</td>
			<td>����</td>
			<td>�����</td>
			<td>��ȸ��</td>
		</tr>
		
		<tr>
			<td>${detail.seq}</td>
			<td>${detail.title}</td>
			<td>${detail.writer}</td>
			<td>${detail.contents}</td>
			<td>
				<fmt:parseDate var="dt" value="${detail.regdate}" pattern="yyyy-MM-dd"></fmt:parseDate>
				<fmt:formatDate value="${dt}" pattern="yyyy/MM/dd"/>
			</td>
			<td>${detail.hitcount}</td>
		</tr>
	</table>
	
	<a href="">����</a>
</body>
</html>