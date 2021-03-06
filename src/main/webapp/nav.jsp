<%--
  Created by IntelliJ IDEA.
  User: 30401
  Date: 2022/4/1
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 导航条 -->
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">CakeShop</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">

                <li class="dropdown">
                    <a class="dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"
                       href="#">商品分类<span class="caret"></span></a>

                    <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                        <li><a href="${pageContext.request.contextPath}/categoryServlet?typeId=0">全部分类</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="${pageContext.request.contextPath}/categoryServlet?typeId=1">冰淇淋系列</a></li>
                        <li><a href="${pageContext.request.contextPath}/categoryServlet?typeId=2">零食系列</a></li>
                        <li><a href="${pageContext.request.contextPath}/categoryServlet?typeId=3">儿童系列</a></li>
                        <li><a href="${pageContext.request.contextPath}/categoryServlet?typeId=4">法式系列</a></li>
                        <li><a href="${pageContext.request.contextPath}/categoryServlet?typeId=5">经典系列</a></li>
                        <li><a href="${pageContext.request.contextPath}/categoryServlet?typeId=8">节日系列</a></li>
                        <li><a href="${pageContext.request.contextPath}/categoryServlet?typeId=11">买不起系列</a></li>
                    </ul>
                </li>
                <li><a href="goodsListServlet">热销</a></li>
                <li><a href="#">新品</a></li>
                <li><a href="good_cart.jsp">购物车</a></li>
                <li><a href="#">后台管理</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
<%--                未登录--%>
                <c:if test="${empty sessionScope.user}">
                    <li><a href="login.jsp">登录 <span class="sr-only">(current)</span></a></li>
                    <li><a href="register.jsp">注册</a></li>
                </c:if>

<%--                登录成功，显示个人中心--%>
                <c:if test="${!empty sessionScope.user}">
                    <li><a href="me.jsp">个人中心</a></li>
                    <li><a href="/test/quitServlet">退出</a></li>
                </c:if>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
