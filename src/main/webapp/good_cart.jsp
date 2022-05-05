<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Cart</title>
</head>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/cart.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<body>
<jsp:include page="nav.jsp"/>
<div class="title">
    <h2>我的购物车</h2>
</div>
<div class="cartContainer">
    <c:forEach items="${sessionScope.cart.items}" var="item">
        <div class="cart-heard">
            <div class="cart-img"><img src="${pageContext.request.contextPath}/${item.goods.image1}" alt=""></div>
            <div class="cart-item">
                <h2>${item.goods.name}</h2>
                <h3><span>单价:￥${item.goods.price}</span></h3>
                <h3><span>数量:${item.number}</span></h3>
                <a href="${pageContext.request.contextPath}/updateNumServlet?id=${item.goods.id}&num=1" class="info">增加</a>
                <a href="${pageContext.request.contextPath}/updateNumServlet?id=${item.goods.id}&num=-1" class="sub">减少</a>
                <a href="${pageContext.request.contextPath}/removeGoodServlet?id=${item.goods.id}" class="delete">删除</a>
            </div>
        </div>
    </c:forEach>


    <div class="cart-price">
        <h3>订单总金额:￥${sessionScope.cart.sumMoney}</h3>
        <a href="#" class="submit">提交订单</a>
    </div>
</div>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="js/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>