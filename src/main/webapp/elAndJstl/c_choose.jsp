<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8" import="java.util.*" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body>
<c:set var="score" scope="session" value="${80}"/>
    <p>你的分数为 : ${score}</p>
<c:choose>
    <c:when test="${score>=90}">
             你的成绩很优秀,1多小红花送给你！
    </c:when>
    <c:when test="${ score>=80 && score<90}">
          你的成绩良好，给你点赞！
    </c:when>
    <c:when test="${ score>=70 && score<80}">
          你的成绩中等，你可以做的更好！
    </c:when>
    <c:when test="${ score>=60 && score<70}">
          你的成绩合格，继续努力，更上一层楼！
    </c:when>
    <c:otherwise>
           你没有及格，需要加油哦！
    </c:otherwise>
</c:choose>

</body>
</html>
