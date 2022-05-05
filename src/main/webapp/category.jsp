<%--
  Created by IntelliJ IDEA.
  User: 30401
  Date: 2022/4/15
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css" />
    <link rel="stylesheet" type="text/css" href="css/good-list.css"/>

    <title>热销商品</title>
</head>
<body>
<!-- 顶部 -->
<jsp:include page="nav.jsp"/>
<!--products-->
<div class="products">
    <div class="container">
        <h2>${requestScope.type.name}</h2>
        <div class="product-model-sec">

            <c:forEach items="${requestScope.page.goodsList}" var="goods">
                <div class="product-grid">
                    <a href="${pageContext.request.contextPath}/detailServlet?id=${goods.id}">
                        <div class="more-product"><span> </span></div>
                        <div class="product-img">
                            <img src="${pageContext.request.contextPath}/${goods.image1}"
                                 class="img-responsive" alt="${goods.name}" width="240" height="240">
                        </div>
                    </a>
                    <div class="product-info ">
                        <div class="product-info-cust">
                            <h4>${goods.name}</h4>
                            <span class="item_price">¥ ${goods.price}</span>
                            <a href="${pageContext.request.contextPath}/addGoodsToCartServlet?id=${goods.id}" class="item_add items">加入购物车</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div style="margin: 0 auto;width: 500px">

            <form action="categoryServlet" class="pagination">
                <div class="btn ${requestScope.status1}" style="padding: 0">
                    <a class="btn " href="categoryServlet?pageNo=${requestScope.page.pageNo}&typeId=${requestScope.type.id}"
                       onclick="return ${requestScope.link1}" aria-label="Previous">
                        <span aria-hidden="true">上一页</span>
                    </a>
                </div>
                <input style="display: none" name="typeId" value="${requestScope.type.id}">
                <label>跳转至：<input style="width: 40px" type="number"
                                  max="${requestScope.page.pageNum}" min="1"
                                  name="pageNo" value="${requestScope.page.pageNo+1}"
                                  placeholder="${requestScope.page.pageNo+1}"/></label>
                共${requestScope.page.pageNum}页
                <input type="submit" class="btn" style="line-height: 24px">
                <div class="btn ${requestScope.status2}" style="padding: 0">
                    <a class="btn" href="categoryServlet?pageNo=${requestScope.page.pageNo+2}&typeId=${requestScope.type.id}"
                       aria-label="Next" onclick="return ${requestScope.link2}">
                        <span >下一页</span>
                    </a>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="js/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="js/bootstrap.min.js"></script>
</html>
