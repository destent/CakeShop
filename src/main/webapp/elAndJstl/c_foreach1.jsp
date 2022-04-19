<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" import="java.util.*" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>

	String数组中的元素：<br>
	<c:forEach items="${fruitsinfo}" begin="1" var="fruit" >
	  ${fruit}<br>
    </c:forEach>
	<br />
	<hr/>
	HashMap集合中的元素：
	<br />
	<c:forEach items="${userMapInfo}" var="map">
	${map.key}----${map.value}<br />
	</c:forEach>
	
	
    
</body>
</html>
