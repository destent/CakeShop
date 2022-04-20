package com.connectyu.test.elandjstl;

import com.connectyu.test.model.User;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ForEach1Servlet
 */
@WebServlet("/ForEach3Servlet")
public class ForEach3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForEach3Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<User> users =new ArrayList<User>();
		User user1=new User();
		user1.setUsername("admin");
		user1.setPassword("12346");
		users.add(user1);
		User user2=new User();
		user2.setUsername("jack");
		user2.setPassword("12346");
		users.add(user2);
		User user3=new User();
		user3.setUsername("tom");
		user3.setPassword("12346");
		users.add(user3);
		
		request.setAttribute("users", users);
		request.getRequestDispatcher("elAndJstl/c_foreach3.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
