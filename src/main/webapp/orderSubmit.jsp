<%--
  Created by IntelliJ IDEA.
  User: 30401
  Date: 2022/5/5
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>确认订单</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
    <jsp:include page="nav.jsp"/>
    <div class="container">
        <h2>确认收货地址</h2>
        <form class="form-horizontal" action="orderServlet">
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">收货人</label>
                <div class="col-sm-10">
                    <input type="text" name="name" required class="form-control" id="name" placeholder="${sessionScope.user.name}">
                </div>
            </div>
            <div class="form-group">
                <label for="address" class="col-sm-2 control-label">收货地址</label>
                <div class="col-sm-10">
                    <input type="text" name="address" required class="form-control" id="address" placeholder="${sessionScope.user.address}">
                </div>
            </div>
            <div class="form-group">
                <label for="phone" class="col-sm-2 control-label">电话</label>
                <div class="col-sm-10">
                    <input type="text" name="phone" required class="form-control" id="phone" placeholder="${sessionScope.user.phone}">
                </div>
            </div>
            <h2>选择支付方式</h2>
            <p>支付金额：${sessionScope.cart.sumMoney}</p>
            <label><input type="radio" name="paytype" value="1">微信<img src=""></label>
            <label><input type="radio" name="paytype" value="2">支付宝<img src=""></label>
            <div class="row">
                <button class="btn btn-primary" type="submit">提交</button>
            </div>
        </form>
    </div>
</body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="js/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="js/bootstrap.min.js"></script>
</html>
