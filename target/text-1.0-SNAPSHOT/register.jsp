<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    request.setAttribute("status","hidden");
    if(request.getAttribute("flag")=="error")
        request.setAttribute("status","show");
%>
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

</head>

<body>
<jsp:include page="nav.jsp"></jsp:include>
    <div class="container">
        <!-- 注册表单 -->
        <form action="/test/registerServlet" method="post">
            <div class="row">
                <span class="col-sm-2"></span>
                <div class="form-group center-block col-sm-8">
                    <label for="username">用户名</label>
                    <input type="text" class="form-control" name="username" id="username" placeholder="username">
                </div>
            </div>
            
            <div class="row">
                <span class="col-sm-2"></span>
                <div class="form-group  col-sm-8">
                    <label for="password">密码</label>
                    <input type="password" name="password" class="form-control" id="password" placeholder="Password">
                </div>
            </div>
            <div class="center-block ">
                <div class="alert col-sm-8 col-sm-offset-2 alert-danger <%= request.getAttribute("status")%> " role="alert">
                    用户名或密码错误！
                </div>
            </div>
            <div class="row">
                <div class="form-group col-sm-8 col-sm-offset-2">
                    <span>性别：</span>
                    <div class="radio ">
                        <label>
                            <input type="radio" name="sex" value="male"> 男
                        </label>
                        <label>
                            <input type="radio" name="sex" value="female"> 女
                        </label>
                    </div>
                </div>
            </div>
         
            <div class="row">
                <div class="form-group col-sm-offset-2 col-sm-8">
                    <span>爱好：</span>
                    <div class="checkbox ">
                        <label>
                            <input name="hobby" value="篮球" type="checkbox"> 篮球
                        </label>
                        <label>
                            <input name="hobby" value="围棋" type="checkbox"> 围棋
                        </label>
                        <label>
                            <input name="hobby" value="射击" type="checkbox"> 射击
                        </label>
                    </div>
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


    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="js/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="js/bootstrap.min.js"></script>
</body>

</html>