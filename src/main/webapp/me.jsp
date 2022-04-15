<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>个人中心</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/mystyle.css">
</head>
<body>
<!-- 导航条 -->
<jsp:include page="nav.jsp"/>
<div class="container">
    <div class="row">
        <ul class="mylist list-unstyled col-sm-2">
            <li><a href="#">我的购物车</a></li>
            <li><a href="#">历史足迹</a></li>
            <li><a href="#">我的收藏</a></li>
            <li><a href="#">我的发票</a></li>
            <li><a href="#">退款维权</a></li>
        </ul>
        <div class="col-sm-8 myinfo">
            <div class="ontop">
                <div>
                    <img src="img/touxiang.jpg" class="img-circle" alt="">
                    <span style="margin-left: 10px">${sessionScope.user.username}</span>
                </div>
            </div>
            <div class="onbottom">
                <ul class="list-inline">
                    <li>待付款</li>
                    <li>|</li>
                    <li>待发货</li>
                    <li>|</li>
                    <li>待收货</li>
                    <li>|</li>
                    <li>待评价</li>
                    <li>|</li>
                    <li>退款</li>
                </ul>
            </div>
        </div>
        <div class="col-sm-8 wuliu" style="margin-bottom: 20px">
            收件人信息
        </div>
    </div>

    <div class="row">
        <form action="" method="post">
            <div class="row">
                <span class="col-sm-2"></span>
                <div class="form-group center-block col-sm-8">
                    <label for="username">收件人</label>
                    <input type="text" class="form-control" name="username" id="username" value="${sessionScope.user.name}">
                </div>
            </div>

            <div class="row">
                <span class="col-sm-2"></span>
                <div class="form-group  col-sm-8">
                    <label for="phone">电话</label>
                    <input type="text" name="phone" class="form-control" id="phone" value="${sessionScope.user.phone}">
                </div>
            </div>
            <div class="row">
                <span class="col-sm-2"></span>
                <div class="form-group  col-sm-8">
                    <label for="address">收货地址</label>
                    <input type="text" name="address" class="form-control" id="address" value="${sessionScope.user.address}">
                </div>
            </div>
        </form>
    </div>
</div>


<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="js/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ"
        crossorigin="anonymous"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>
