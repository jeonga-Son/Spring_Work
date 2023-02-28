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
	<h1>글 세부내용</h1>
	<a href="board_insert"></a>
	<table border="1" width = "800">
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>내용</td>
			<td>등록일</td>
			<td>조회수</td>
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
	
	<a href="">이전</a>
</body>
</html>