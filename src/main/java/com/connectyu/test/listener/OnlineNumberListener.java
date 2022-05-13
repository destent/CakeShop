package com.connectyu.test.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class OnlineNumberListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //在线人数初始化为0，并存入ServletContext对象中
        //获取ServletContext对象
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("onlineNumber",0);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext servletContext = se.getSession().getServletContext();
        int onlineNumber = (int) servletContext.getAttribute("onlineNumber");
        onlineNumber--;
        servletContext.setAttribute("onlineNumber",onlineNumber);
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        String name = event.getName();
        if ("user".equals(name)) {
            ServletContext servletContext = event.getSession().getServletContext();
            int onlineNumber = (int) servletContext.getAttribute("onlineNumber");
            onlineNumber++;
            servletContext.setAttribute("onlineNumber",onlineNumber);
        }
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {

    }
}
