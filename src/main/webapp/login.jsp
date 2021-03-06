<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>登录</title>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/mystyle.css">
</head>
<body>

<div class="cont">
    <jsp:include page="nav.jsp" />
    <div class="container main">

        <div class="row">
            <img src="img/welcom.png" alt="welcom" class="col-sm-offset-2 col-sm-8 img-responsive">
        </div>
        <!-- 登录表单 -->
        <form action="/test/loginServlet" method="post" class="form-horizontal">
            <div class="form-group">
                <label for="username" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-8">
                    <input type="text" name="username" value="${cookie.username.value}" class="form-control" id="username" placeholder="username">
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-8">
                    <input type="password" name="password" value="${cookie.password.value}" class="form-control" id="password" placeholder="Password">
                </div>
            </div>
            <div class="center-block ">
                <div class="col-sm-offset-2 col-sm-8 alert alert-danger ${requestScope.status} " style="display: none" role="alert">
                    ${requestScope.info}
                </div>
            </div>
            <div class="col-sm-offset-2 col-sm-4">
                <label> <input type="checkbox" checked name="save" value="true">记住密码</label>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">登录 </button>
                    <a class="btn btn-default" href="register.jsp">注册</a>
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