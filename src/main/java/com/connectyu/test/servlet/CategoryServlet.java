package com.connectyu.test.servlet;

import com.connectyu.test.dao.GoodsDao;
import com.connectyu.test.dao.TypeDao;
import com.connectyu.test.model.CakeType;
import com.connectyu.test.model.Page;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/categoryServlet")
public class CategoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req
            , HttpServletResponse resp)
            throws ServletException, IOException {
        TypeDao typeDao = new TypeDao();
        GoodsDao goodsDao = new GoodsDao();
        Page page = new Page();
        CakeType type = null;
        int typeId = Integer.parseInt(req.getParameter("typeId"));
        String pageNo = req.getParameter("pageNo");
        if (pageNo != null) {
            page.setPageNo(Integer.parseInt(pageNo)-1);
        }
        try {
            type = typeDao.findTypeById(typeId);
            int num = goodsDao.countGoodsRow(typeId)%page.getGoodsNum()>0
                    ?goodsDao.countGoodsRow(typeId)/page.getGoodsNum()+1
                    :goodsDao.countGoodsRow(typeId)/page.getGoodsNum();
            page.setPageNum(num);
            page.setGoodsList(goodsDao.findPageGoods(page,typeId));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        req.setAttribute("page",page);
        String status1=page.getPageNo()<=0?"disabled":" ";
        String status2=page.getPageNo()>=page.getPageNum()-1?"disabled":" ";
        String link1=page.getPageNo()<=0?"false":" ";
        String link2=page.getPageNo()>=page.getPageNum()-1?"false":" ";
        req.setAttribute("status1",status1);
        req.setAttribute("status2",status2);
        req.setAttribute("link1",link1);
        req.setAttribute("link2",link2);
        req.setAttribute("type",type);
        req.getRequestDispatcher("category.jsp").forward(req,resp);
    }
}
