package com.connectyu.test.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "JspObjectServlet")
public class JspObjectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过request对象传递值
        request.setAttribute("name1","Java语言程序设计");
        //通过session对象传递值
        HttpSession session = request.getSession();
        session.setAttribute("name2","Java Web应用开发");
        //通过application（ServletContext）对象传递值
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("name3","Java EE企业级框架");

        //请求转发
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/show.jsp");
        requestDispatcher.forward(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
