package com.connectyu.servlet;

import com.connectyu.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        RequestDispatcher dispatcher;
        if(username.equals("admin") && password.equals("123456")){
            HttpSession session = req.getSession();
            //模拟用户
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setName("测试");
            user.setPhone("1342567908");
            user.setAddress("武汉华夏理工学院");
            session.setAttribute("user",user);
            //用户名密码符合进入个人中心
            resp.sendRedirect(req.getContextPath()+"/me.jsp");
        }else{
            //request对象传递数据
            req.setAttribute("flag","error");
            req.setAttribute("info","用户名或密码错误!");
            dispatcher = req.getRequestDispatcher("/login.jsp");
            dispatcher.forward(req,resp);
        }
    }
}
