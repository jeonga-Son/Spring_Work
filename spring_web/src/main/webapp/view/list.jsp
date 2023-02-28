<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- �±� ���̺귯�� ������, jstl ����  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
			<%-- <td><a href="show_board_detail?seq=${board.seq}">${board.title}</a></td> --%>
			<td><a href="show_board_detail/${board.seq}">${board.title}</a></td>
			<td>${board.writer}</td>
			<td>
				<fmt:parseDate var="dt" value="${board.regdate}" pattern="yyyy-MM-dd"></fmt:parseDate>
				<fmt:formatDate value="${dt}" pattern="yyyy/MM/dd"/>
			</td>
			<td>${board.hitcount}</td>
		</tr>
		</c:forEach>
	</table>
	
	<br><br>
	
	<form action="board_list" method="GET">
		<input type="checkbox" name="area" value="title">����
		<input type="checkbox" name="area" value="writer">�ۼ���
		<input type="text" name="searchKey" size="10">
		<input type="submit" value="�˻�">
	</form>
</body>
</html>