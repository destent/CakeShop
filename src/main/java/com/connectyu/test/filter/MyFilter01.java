package com.connectyu.test.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "MyFilter01",urlPatterns = "/jspObjectServlet")
public class MyFilter01 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("MyFilter01 before");
        chain.doFilter(req, resp);
        out.println("MyFilter01 after");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
