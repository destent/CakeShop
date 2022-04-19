package com.connectyu.test.elandjstl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForEach1Servlet
 */
@WebServlet("/ForEach1Servlet")
public class ForEach1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForEach1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] fruits = { "apple", "orange", "grape", "banana" };
		request.setAttribute("fruitsinfo", fruits);
		
		Map userMap = new HashMap();
		userMap.put("Tom", "123");
		userMap.put("Make", "123");
		userMap.put("Lina", "123");
		
		request.setAttribute("userMapInfo", userMap);
		request.getRequestDispatcher("elAndJstl/c_foreach1.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
