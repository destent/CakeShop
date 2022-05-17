package com.connectyu.test.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;

@WebListener()
public class MyListener implements ServletContextListener,
        HttpSessionListener,  ServletRequestListener {

    // Public constructor is required by servlet spec
    public MyListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */
//        System.out.println("ServletContest 初始化");
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
//        System.out.println("ServletContest 销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
//        System.out.println("request 销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
//        System.out.println("request 初始化");
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
//        System.out.println("session 创建");
    }

    public void sessionDestroyed(HttpSessionEvent se) {

//        System.out.println("session 销毁");
    }

}
