<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8" import="java.util.*" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
	<c:set var="salary" scope="session" value="2000"/>
	<!-- 1.没有标签体 -->
	<c:if test="${ salary>2000}" var ="result" scope="session"/>
	    表达式的值为：${result}<br>
	   -------------------------
	<!-- 2.有标签体 --><br>
	<c:if test="${ salary>2000}"  var ="result" scope="session" >
        我的工资为${salary}<br>
        表达式的值为：${result}
	</c:if>
	<br>
    
	<a href="c_if_scope.jsp">c_if_scope.jsp</a>
</body>
</html>
