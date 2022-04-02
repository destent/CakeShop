<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
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
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">XX商城</a>
        </div>
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="#">个人中心</a></li>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">退出登录</a> </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="container">
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
                <span>username</span>
            </div>
            <span>我的收货地址</span>
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
    <div class="col-sm-8 wuliu">
        我的物流
    </div>
</div>


<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="js/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ"
        crossorigin="anonymous"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>
