<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
  colorsList集合（指定迭代范围和步长）<br />
	<c:forEach items="${colorsList}" var="colors" begin="1" end="5" step="2">
	${colors }<br>
	</c:forEach>
</body>
</html>
