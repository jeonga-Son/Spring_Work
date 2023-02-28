<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 태그 라이브러리 지시자, jstl 선언  -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>글목록</h1>
	<a href="board_insert"></a>
	<table border="1" width = "800">
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>등록일</td>
			<td>조회수</td>
		</tr>
		<!-- board객체의 숫자만큼 반복한다. -->
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