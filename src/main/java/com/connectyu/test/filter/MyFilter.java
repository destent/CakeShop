package com.connectyu.test.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
import java.io.PrintWriter;

// /* 拦截所有请求
@WebFilter(filterName = "MyFilter",urlPatterns = "/jspObjectServlet*",initParams = {@WebInitParam(name = "encoding",value = "UTF-8")})
public class MyFilter implements Filter {
    public void destroy() {
//        System.out.println("过滤器销毁");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        chain.doFilter(req,resp);
    }

    public void init(FilterConfig config) throws ServletException {
//        System.out.println("过滤器初始化");
//        String encoding = config.getInitParameter("encoding");
//        System.out.println(encoding);
    }

}