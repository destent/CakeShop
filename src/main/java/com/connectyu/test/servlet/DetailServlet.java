package com.connectyu.test.servlet;

import com.connectyu.test.dao.GoodsDao;
import com.connectyu.test.dao.TypeDao;
import com.connectyu.test.model.Goods;
import com.connectyu.test.model.CakeType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "DetailServlet",urlPatterns = "/detailServlet")
public class DetailServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Goods goods = null;
        CakeType type = null;
        GoodsDao goodsDao= new GoodsDao();
        TypeDao typeDao = new TypeDao();
        try {
            goods = goodsDao.findById(Integer.parseInt(id));
            type = typeDao.findTypeById(goods.getType_id());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.setAttribute("goods",goods);
        request.setAttribute("type",type);
        request.getRequestDispatcher("detail.jsp").forward(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
