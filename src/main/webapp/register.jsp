<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!doctype html>
<html lang="zh-CN">

<head>
    
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/mystyle.css">
</head>

<body>
    <div class="cont">
        <jsp:include page="nav.jsp"/>
        <div class="container main">
            <h1 class="text-center">注册新用户</h1>
            <!-- 注册表单 -->
            <form action="/test/registerServlet" method="post">
                <div class="row">
                    <span class="col-sm-2"></span>
                    <div class="form-group center-block col-sm-offset-2 col-sm-8 ">
                        <label for="username">用户名<span style="color: red">*</span> </label>
                        <input type="text" required class="form-control" name="username" id="username" placeholder="username">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group  col-sm-8 col-sm-offset-2">
                        <label for="email">邮箱<span style="color: red">*</span> </label>
                        <input type="email" required name="email" class="form-control" id="email" placeholder="email">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group  col-sm-8 col-sm-offset-2">
                        <label for="password">密码<span style="color: red">*</span> </label>
                        <input type="password" name="password" required class="form-control" id="password" placeholder="Password">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group  col-sm-8 col-sm-offset-2">
                        <label for="name">收货人</label>
                        <input type="text" name="name" class="form-control" id="name" placeholder="请输入收货人">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group  col-sm-8 col-sm-offset-2">
                        <label for="phone">收货电话</label>
                        <input type="tel" pattern="[0-9]{11}" inputmode="numeric" name="phone" class="form-control" id="phone" placeholder="请输入11位电话号码">
                    </div>
                </div>
                <div class="row">
                    <div class="form-group  col-sm-8 col-sm-offset-2">
                        <label for="address">收货地址</label>
                        <input type="text" name="address" class="form-control" id="address" placeholder="请输入收货地址">
                    </div>
                </div>
                <div class="center-block ">
                    <div class="alert col-sm-8 col-sm-offset-2 alert-danger ${requestScope.status}" style="display: none" role="alert">
                        ${requestScope.info}
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2">
                        <button type="submit" class="btn btn-default ">注册</button>
                        <button type="reset" class="btn btn-default">重置</button>
                    </div>
                </div>
            </form>
        </div>
        <jsp:include page="footer.jsp"/>
    </div>

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="js/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="js/bootstrap.min.js"></script>
</body>

</html>