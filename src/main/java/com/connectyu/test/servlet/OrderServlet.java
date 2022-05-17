package com.connectyu.test.servlet;

import com.connectyu.test.dao.OrderDao;
import com.connectyu.test.model.Order;
import com.connectyu.test.model.ShoppingCart;
import com.connectyu.test.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "OrderServlet",urlPatterns = "/orderServlet")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Order order = new Order();
        HttpSession session = request.getSession();
        ShoppingCart cart =(ShoppingCart) session.getAttribute("cart");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        int paytype = Integer.parseInt(request.getParameter("paytype"));
        User user = (User)session.getAttribute("user");
        order.setPhone(phone);
        order.setName(name);
        order.setAddress(address);
        order.setPaytype(paytype);
        order.setTotal(cart.getSumMoney());
        order.setUserId(user.getId());
        order.setAmount(cart.getItems().size());
        order.setStatus(4);
        order.setDatetime(new Date());
        OrderDao orderDao = new OrderDao();
        orderDao.insert(order);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
