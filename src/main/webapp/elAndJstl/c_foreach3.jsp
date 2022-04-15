<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body style="text-align: center;">
	<table border="1">
		<tr>
			<td>序号</td>
			<td>循环索引值</td>
			<td>是否为第一个元素</td>
			<td>是否为最后一个元素</td>
			<td>元素的用户名</td>
			<td>元素的密码</td>
		</tr>
		<c:forEach items="${users}"  var="user" varStatus="stauts" >
		
		<tr>
			<td>${stauts.count}</td>
			<td>${stauts.index}</td>
			<td>${stauts.first}</td>
			<td>${stauts.last}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>
