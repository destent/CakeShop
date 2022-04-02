<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext对象</title>
</head>
<body>
作用1：:通过pageContext获得其他对象
作用2：保存数据
<%
pageContext.getRequest();
pageContext.getSession();
pageContext.getResponse();
pageContext.getServletConfig();
pageContext.getServletContext();
pageContext.getOut();
pageContext.getException();
pageContext.getPage();
%>
<hr>
pageContext的findAttribute方法使用
<%
pageContext.setAttribute("name1", "孤傲苍狼");
request.setAttribute("name2", "白虎神皇");
session.setAttribute("name3", "玄天邪帝");
application.setAttribute("name4", "灭世魔尊");
%>

<%
//使用pageContext的findAttribute方法查找属性，由于取得的值为Object类型，因此必须使用String强制向下转型，转换成String类型
//查找name1属性，按照顺序"page→request→session→application"在这四个对象中去查找
String refName1 = (String)pageContext.findAttribute("name1");
String refName2 = (String)pageContext.findAttribute("name2");
String refName3 = (String)pageContext.findAttribute("name3");
String refName4 = (String)pageContext.findAttribute("name4");
String refName5 = (String)pageContext.findAttribute("name5");//查找一个不存在的属性
%>

<h1>pageContext.findAttribute方法查找到的属性值：</h1>
<h3>pageContext对象的name1属性：<%=refName1%></h3>
 <h3>request对象的name2属性：<%=refName2%></h3>
<h3>session对象的name3属性：<%=refName3%></h3>
<h3>application对象的name4属性：<%=refName4%></h3>
<h3>查找不存在的name5属性：<%=refName5%></h3>
<hr/>
</body>
</html>