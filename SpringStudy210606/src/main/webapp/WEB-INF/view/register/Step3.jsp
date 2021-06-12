<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<P><strong>${RegisterRequest.name}님</strong>
		회원 가입을(회원 번호 : ${memberNum}) 완료했습니다</P>
	<P>
		<a href="SpringStudy210606/Main">
			[첫 화면 이동]
		</a>
</body>
</html>