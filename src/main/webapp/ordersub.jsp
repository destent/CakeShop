<%--
  Created by IntelliJ IDEA.
  User: 30401
  Date: 2022/5/5
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>确认订单</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
    <jsp:include page="nav.jsp"/>
    <div class="container">
        <h2>确认收货地址</h2>
        <form class="form-horizontal">
            <div class="form-group">
                <label for="name" class="col-sm-2 control-label">收货人</label>
                <div class="col-sm-10">
                    <input type="text" name="name" required class="form-control" id="name" placeholder="请输入收货人姓名">
                </div>
            </div>
            <div class="form-group">
                <label for="address" class="col-sm-2 control-label">收货地址</label>
                <div class="col-sm-10">
                    <input type="text" name="address" required class="form-control" id="address" placeholder="请输入收货地址">
                </div>
            </div>
            <div class="form-group">
                <label for="phone" class="col-sm-2 control-label">电话</label>
                <div class="col-sm-10">
                    <input type="text" name="phone" required class="form-control" id="phone" placeholder="请输入收件人电话">
                </div>
            </div>
            <h2>选择支付方式</h2>
            <p>支付金额：</p>
            <label><input type="radio" name="paytype"><img src=""></label>
            <label><input type="radio" name="paytype"><img src=""></label>
            <button type="submit">提交</button>
        </form>
    </div>
</body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="js/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="js/bootstrap.min.js"></script>
</html>
