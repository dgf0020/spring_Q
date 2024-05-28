<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<form method="POST">
		<p><input name="title" value="${row.title }" placeholder="제목"></p>
		<p><input name="nick" value="${row.nick }" placeholder="작성자"></p>
		<p><input name="userid" value="${row.userid }" placeholder="아이디"></p>
		<p><textarea name="contents" placeholder="내용">${row.contents }</textarea></p>
		
		<button>수정</button>
	</form>

</body>
</html>