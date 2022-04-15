<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL常量</title>
</head>
<body>
<h1>EL常量:</h1>
<br />
 	boolean常量：${true}<br />
 	整型常量：${30}<br />
 	浮点常量：${12e-5}<br />
 	字符串常量：${"el表达式"}：<br />
 	字符串常量中有"号：${"\"el\"表达式"}<br />
 	字符串常量中有\：${"\\el\\表达式"}<br />
 	null常量：${null}<br />
</body>
</html>