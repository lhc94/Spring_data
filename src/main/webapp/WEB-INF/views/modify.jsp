<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<div class="jcce">
<form method="POST">
	<p><input type="text" name="userid" value="${modify.userid }" readonly></p>
	<p><input type="password" name="userpw" value="${modify.userpw }" required></p>
	<p><input type="text" name="username" value="${modify.username }" required></p>
	<p><input type="text" name="email" value="${modify.email }" required></p>
	<p>
		<label><input type="radio" name="gender" value="남성" ${'gender' eq '남성' ? 'checked' : '' }>남성</label>
		<label><input type="radio" name="gender" value="여성" ${'gender' eq '여성' ? 'checked' : '' }>여성</label>
	</p>
	<p><input type="submit" value="수정"></p>
</form>
</div>

</body>
</html>