<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- �±� ���̺귯�� ������, jstl ����  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�۸��</h1>
	<a href="board_insert"></a>
	<table border="1" width = "800">
		<tr>
			<td>�۹�ȣ</td>
			<td>����</td>
			<td>�ۼ���</td>
			<td>�����</td>
			<td>��ȸ��</td>
		</tr>
		<!-- board��ü�� ���ڸ�ŭ �ݺ��Ѵ�. -->
		<c:forEach var="board" items="${list}">
		<tr>
			<td>${board.seq}</td>
			<td>${board.title}</td>
			<td>${board.writer}</td>
			<td>${board.regdate}</td>
			<td>${board.hitcount}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>