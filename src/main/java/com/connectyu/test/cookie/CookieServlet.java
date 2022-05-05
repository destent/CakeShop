package com.connectyu.test.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/cookieServlet")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 = new Cookie("city","wuhan");
        //设置cookie 的有效时长
        //>0 设置为30 代表30秒后失效
        //<0 浏览器关闭时失效
        //=0 立即失效
        cookie1.setMaxAge(30);

        Cookie cookie2 = new Cookie("address","hxut");
        Cookie cookie3 = new Cookie(URLEncoder.encode("城市", StandardCharsets.UTF_8),URLEncoder.encode("武汉", StandardCharsets.UTF_8));

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        resp.addCookie(cookie3);
}
}
