package com.connectyu.test.servlet;

import com.connectyu.test.dao.GoodsDao;
import com.connectyu.test.model.ShoppingCart;
import com.connectyu.test.model.Goods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "UpdateNumServlet",urlPatterns = "/updateNumServlet")
public class UpdateNumServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int num = Integer.parseInt(request.getParameter("num"));
        Goods good = new Goods();
        GoodsDao goodsDao = new GoodsDao();
        try {
            good = goodsDao.findById(id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if(cart==null)
            cart = new ShoppingCart();
        cart.updateProductNumber(good,num);
        session.setAttribute("cart",cart);
        response.sendRedirect(request.getContextPath()+"/good_cart.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
