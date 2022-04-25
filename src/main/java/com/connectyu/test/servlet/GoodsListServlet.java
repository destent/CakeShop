package com.connectyu.test.servlet;

import com.connectyu.test.dao.GoodsDao;
import com.connectyu.test.model.Page;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "GoodsListServlet" ,urlPatterns = "/goodsListServlet")
public class GoodsListServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GoodsDao goodsDao = new GoodsDao();
        Page page = new Page();
        String pageNo = request.getParameter("pageNo");
        if (pageNo != null) {
            page.setPageNo(Integer.parseInt(pageNo)-1);
        }
        try {
            int num = goodsDao.countGoodsRow()%page.getGoodsNum()>0?goodsDao.countGoodsRow()/page.getGoodsNum()+1:goodsDao.countGoodsRow()/page.getGoodsNum();
            page.setPageNum(num);
            page.setGoodsList(goodsDao.findPageGoods(page));

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        request.setAttribute("page",page);
        String status1=page.getPageNo()<=0?"disabled":" ";
        String status2=page.getPageNo()>=page.getPageNum()-1?"disabled":" ";
        String link1=page.getPageNo()<=0?"false":" ";
        String link2=page.getPageNo()>=page.getPageNum()-1?"false":" ";
        request.setAttribute("status1",status1);
        request.setAttribute("status2",status2);
        request.setAttribute("link1",link1);
        request.setAttribute("link2",link2);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("good_list.jsp");
        dispatcher.forward(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
