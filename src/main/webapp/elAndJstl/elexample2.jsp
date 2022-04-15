<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.connectyu.test.model.User" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>El运算符</title>
</head>
<body>
 <h1>El运算符的使用</h1>
 	<%
 	User user =new User();
 	user.setUsername("admin");
 	user.setPassword("123456");
 	request.setAttribute("user", user);
 	Map<String , String> map=new HashMap<String, String>();
 	map.put("user-name", "wangwu");
 	request.setAttribute("result", map);
 	%>
 	
 	点运算符（.）:用户名：${user.username}；密码${user.password}<br />
 	方括号运算符（[]）:用户名：${user[username]}；密码${user["password"]}<br />
 	方括号运算符（[]）属性中有特殊字符：${result["user-name"]}---<br />
 	算术运算符:${3*4}<br />
 	比较运算符:${3>4}<br />
 	逻辑运算符:${3>4 && 4>5}<br />
 	empty运算符${empty user}<br />
 	条件运算符:${3>4?"3大于4":"3小于4"}<br />
</body>
</html>