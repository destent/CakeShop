package com.connectyu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] hobbies = req.getParameterValues("hobby");
        String sex = req.getParameter("sex");
        //请求转发
        //用户名为空的情况下，跳转到注册页面，否则就跳转到登录页面
        RequestDispatcher dispatcher;
        if (username==null || username.isEmpty() || password==null || password.isEmpty()){
            //request对象传递数据
            req.setAttribute("flag","error");
            dispatcher = req.getRequestDispatcher("/register.jsp");
        }else{
            dispatcher = req.getRequestDispatcher("/login.jsp");
        }
        dispatcher.forward(req,resp);
    }
    
    
}
