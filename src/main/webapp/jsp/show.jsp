<%--
  Created by IntelliJ IDEA.
  User: 30401
  Date: 2022/4/8
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
</head>
<body>
    <%=request.getAttribute("name1")%>
    <%=session.getAttribute("name2")%>
    <%=application.getAttribute("name3")%>
</body>
</html>
