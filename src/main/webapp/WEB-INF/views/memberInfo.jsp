<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div class="jcce">
	<div>
		<p>${info.userid }</p>
		<p>${info.userpw }</p>	
		<p>${info.username }</p>	
		<p>${info.email }</p>	
		<p>${info.gender }</p>
		<p><a href="${cpath }/modify"><button>수정</button></a></p>	
	</div>
</div>

</body>
</html>