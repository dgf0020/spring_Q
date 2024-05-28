<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<form method="POST">
		<p><input name="title" placeholder="제목"></p>
		<p><input name="nick" placeholder="작성자"></p>
		<p><input name="userid" placeholder="아이디"></p>
		<p><textarea name="contents" placeholder="내용"></textarea></p>
		
		<button>작성</button>
	</form>
	
</body>
</html>