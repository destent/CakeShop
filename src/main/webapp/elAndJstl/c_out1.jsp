<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 1.没有标签体 -->
<c:out value="${param.username}" default="zhangsan"/>

<!-- 2.有标签体 --><br>
<c:out value="${param.username}" >
zhangsan
</c:out>


</body>
</html>