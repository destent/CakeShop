package com.connectyu.test.servlet;

import com.connectyu.test.dao.UserDao;
import com.connectyu.test.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String isSave = req.getParameter("save");
        Cookie cookie = new Cookie("username", URLEncoder.encode(username, "UTF-8"));
        Cookie cookie2 = new Cookie("password","");
        if("true".equals(isSave))
            cookie2 = new Cookie("password",password);
        resp.addCookie(cookie);
        resp.addCookie(cookie2);

        RequestDispatcher dispatcher;
        UserDao userDao = new UserDao();
        User user = null;
        try {
            user = userDao.login(username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (user!=null) {//登陆成功前往个人中心并发送用户信息
            HttpSession session = req.getSession();
            //session传递数据
            session.setAttribute("user", user);
            //重定向至个人中心
            resp.sendRedirect(req.getContextPath() + "/me.jsp");
        } else {
            //登录失败留在登录页面并返回错误信息
            req.setAttribute("status", "show");
            req.setAttribute("info", "用户名或密码错误!");
            dispatcher = req.getRequestDispatcher("/login.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
