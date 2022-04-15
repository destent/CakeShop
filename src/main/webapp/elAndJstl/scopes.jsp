<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web域相关对象使用</title>
</head>

<body>
	<% pageContext.setAttribute("pageData", "Web域相关对象使用");
	   pageContext.setAttribute("varTest", "页面作用域");
	%>
	
	表达式\${pageScope.pageData}的值为：${pageScope.pageData} <br /> 
	表达式\${requestScope.requestData}的值为：${requestScope.requestData} <br /> 
	表达式\${sessionScope.sessionData}的值为：${sessionScope.sessionData} <br />
	表达式\${applicationScope.applicationData}的值为：${applicationScope.applicationData} 
     <br /> 
    <hr /> 
       <h2>域的作用范围（从小到大）：pageContext----request----session---application</h2>
     <br /> 
	      表达式\${varTest}的值为：${varTest}<br /> 
	   <hr /> 
	   <h2> 对象的属性名取得一样,怎么取值呢？</h2>
	      可以通过域对象.属性名去对应的值<br /> 
	 表达式\${pageScope.varTest}的值为：${pageScope.varTest} <br /> 
	 表达式\${requestScope.varTest}的值为：${requestScope.varTest} <br /> 
	 表达式\${sessionScope.varTest}的值为：${sessionScope.varTest} <br />
	 表达式\${applicationScope.varTest}的值为：${applicationScope.varTest} 
</body>
</html>
