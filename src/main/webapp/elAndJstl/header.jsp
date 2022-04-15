<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>header和headerValues对象的使用</h2>
${header["user-agent"]}<br>
${headerValues["Accept-Language"][0]}
</body>
</html>