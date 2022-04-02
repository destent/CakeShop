<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext访问其它域</title>
</head>
<body>
pageContext访问其它域
<hr>
<%
pageContext.setAttribute("name", "孤傲苍狼");
request.setAttribute("name", "白虎神皇");
session.setAttribute("name", "玄天邪帝");
application.setAttribute("name", "灭世魔尊");
%>
<%
//使用pageContext的getAttributee方法查找属性，由于取得的值为Object类型，因此必须使用String强制向下转型，转换成String类型

String refName4 = (String)pageContext.getAttribute("name",pageContext.PAGE_SCOPE);
String refName1 = (String)pageContext.getAttribute("name",pageContext.REQUEST_SCOPE);
String refName2 = (String)pageContext.getAttribute("name",pageContext.SESSION_SCOPE);
String refName3 = (String)pageContext.getAttribute("name",pageContext.APPLICATION_SCOPE);
//查找name属性，按照顺序"page→request→session→application"在这四个对象中去查找
String refName5 = (String)pageContext.findAttribute("name");
%>

<h1>pageContext.getAttribute方法按照域查找到的属性值：</h1>
<h3>PAGE_SCOPE域对象的name属性：<%=refName1%></h3>
 <h3>REQUEST_SCOPE域对象的name属性：<%=refName2%></h3>
<h3>SESSION_SCOPE域对象的name属性：<%=refName3%></h3>
<h3>APPLICATION_SCOPE对象的name1属性：<%=refName4%></h3>
<hr/>
<h1>pageContext.findAttribute方法查找属性值：<%=refName5%></h1>

</body>
</html>