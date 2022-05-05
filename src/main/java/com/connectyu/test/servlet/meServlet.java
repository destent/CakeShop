package com.connectyu.test.servlet;


import com.connectyu.test.dao.UserDao;
import com.connectyu.test.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "meServlet")
public class meServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldpassword = request.getParameter("oldpassword");
        String newpassword = request.getParameter("newpassword");
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        if (user.getEmail().equals(oldpassword)&&newpassword!=null){
            UserDao userDao = new UserDao();
            try {
                userDao.update(newpassword,user.getId());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
