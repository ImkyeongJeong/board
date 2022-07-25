<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList</title>
</head>
<body>
	<h3>게시글목록</h3>
	<table style="text-align: center">
		<thead>
			<th width="50">글번호</th>
			<th width="150">제목</th>
			<th width="100">작성자</th>
			<th width="100">작성일자</th>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardList}">
				<tr>
					<td>${board.bno}</td>
					<td><a href="board/${board.bno}">${board.title}</td>
					<td>${board.writer}</td>
					<td>${board.regDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="boardInsert"><button>글쓰기</button></a>
</body>
</html>