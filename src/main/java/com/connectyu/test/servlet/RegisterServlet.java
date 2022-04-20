package com.connectyu.test.servlet;

import com.connectyu.test.dao.UserDao;
import com.connectyu.test.model.User;

import java.io.IOException;
import java.sql.SQLException;

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
        RequestDispatcher dispatcher = null;
        User user = new User();
        user.setUsername(req.getParameter("username"));
        user.setName(req.getParameter("name"));
        user.setEmail(req.getParameter("email"));
        user.setPhone(req.getParameter("phone"));
        user.setAddress(req.getParameter("address"));
        user.setPassword(req.getParameter("password"));
        user.setIsadmin((byte) 0);
        user.setIsvalidate((byte) 0);
        UserDao userDao = new UserDao();
        try {
            int i = userDao.addUser(user);
            if(i == 1){
                dispatcher = req.getRequestDispatcher("/login.jsp");
            }else if(i==2){
                req.setAttribute("status","show");
                req.setAttribute("info","用户名已存在！");
                dispatcher = req.getRequestDispatcher("/register.jsp");
            }else {
                req.setAttribute("status","show");
                req.setAttribute("info","邮箱已被使用！");
                dispatcher = req.getRequestDispatcher("/register.jsp");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            assert dispatcher != null;
            dispatcher.forward(req,resp);
        }
    }
    
    
}
