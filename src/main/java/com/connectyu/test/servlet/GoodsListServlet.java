package com.connectyu.test.servlet;

import com.connectyu.test.dao.GoodsDao;
import com.connectyu.test.model.Goods;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "GoodsListServlet" ,urlPatterns = "/goodsListServlet")
public class GoodsListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GoodsDao goodsDao = new GoodsDao();
        List<Goods> allGoods = null;
        try {
            allGoods = goodsDao.findAllGoods();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.setAttribute("goodsList",allGoods);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("good_list.jsp");
        dispatcher.forward(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
