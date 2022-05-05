<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${requestScope.goods.name}</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" type="text/css" href="css/single-good.css" />
</head>
<body>
<jsp:include page="nav.jsp"/>
<div class="container">
    <div class="sigle-grids">
        <div class="sigle-grid">
            <div id="carousel" class="carousel slide" data-ride="carousel">
                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="${pageContext.request.contextPath}/${requestScope.goods.cover}">
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/${requestScope.goods.image1}">
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/${requestScope.goods.image2}">
                    </div>
                </div>
            </div>
            <div class="img-contral">
                <ol class="img-contral-list">
                    <li data-target="#carousel" data-slide-to="0" class="active"><img src="${pageContext.request.contextPath}/${requestScope.goods.cover}">
                    </li>
                    <li data-target="#carousel" data-slide-to="1"><img src="${pageContext.request.contextPath}/${requestScope.goods.image1}"></li>
                    <li data-target="#carousel" data-slide-to="2"><img src="${pageContext.request.contextPath}/${requestScope.goods.image2}"></li>
                </ol>
            </div>
        </div>
        <div class="sigle-grid">
            <h3>${requestScope.goods.name}</h3>
            <div class="tag">
                <p>分类 : <a href="#">${requestScope.type.name}</a></p>
            </div>
            <p>${requestScope.goods.intro}</p>
            <div class="galry">
                <div class="prices">
                    <h5 class="item_price">¥ ${requestScope.goods.price}</h5>
                </div>
                <div class="clearfix"></div>
            </div>
            <div class="btn_form">
                <a href="${pageContext.request.contextPath}/addGoodsToCartServlet">加入购物车</a>
            </div>
        </div>
        <div class="single-grid1">
            <ul style="list-style:none;">
                <li><a href="#">全部系列</a></li>
                <li><a href="#">冰淇淋系列</a></li>
                <li><a href="#">零食系列</a></li>
                <li><a href="#">儿童系列</a></li>
                <li><a href="#">法式系列</a></li>
                <li><a href="#">经典系列</a></li>
                <li><a href="#">节日系列</a></li>
                <li><a href="#">买不起系列</a></li>
            </ul>
        </div>
    </div>
</div>
</body>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</html>
</html>