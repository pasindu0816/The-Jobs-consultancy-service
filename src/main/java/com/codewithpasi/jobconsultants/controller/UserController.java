package com.codewithpasi.jobconsultants.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codewithpasi.jobconsultants.dao.UserManager;
import com.codewithpasi.jobconsultants.dao.UserManagerImpl;
import com.codewithpasi.jobconsultants.model.LoginBean;
import com.codewithpasi.jobconsultants.service.UserService;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String message = "";
	
	private UserService getUserService() {
		return UserService.getUserService();
	}
      
	
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		


	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String actionType = request.getParameter("actiontype");
		
		if (actionType.equals ("login")) {
			loginUser(request, response);
		}
		else if (actionType.equals ("register")) {
			registerUser(request, response);
		}

	}
	
	private void loginUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	clearMessage();
	
	String userName = request.getParameter("username");
	String password = request.getParameter("password");
	
	LoginBean loginBean = new LoginBean();
	
	loginBean.setUserName(userName);
	loginBean.setPassword(password);
		
	try {
		String validateUser = getUserService().loginUser(loginBean);
		
		if(validateUser.equals("Admin_Role")) {
			System.out.println("Admin Home");
			
			HttpSession session = request.getSession();    //Creating a session
			session.setAttribute("Admin", userName);	   //setting session attribute
			request.setAttribute(userName, userName);
			
			request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
		}
		
		else if(validateUser.equals("Consultant_Role")) {
			System.out.println("Consultant Home");
			
			HttpSession session = request.getSession();    
			session.setAttribute("Consultant", userName);	   
			request.setAttribute(userName, userName);
			
			request.getRequestDispatcher("ConsultantHome.jsp").forward(request, response);

		}
		
		else if(validateUser.equals("User_Role")) {
			System.out.println("User Home");
			
			HttpSession session = request.getSession();    
			session.setMaxInactiveInterval(10*60);
			session.setAttribute("User", userName);	   
			request.setAttribute(userName, userName);
			
			request.getRequestDispatcher("UserHome.jsp").forward(request, response);

		}
		else {
			System.out.println("Error message = "+validateUser);
			request.setAttribute("errMessage", validateUser);
			
			request.getRequestDispatcher("Login.jsp").forward(request, response);

		}		
	}
	
	catch (IOException e1){
		e1.printStackTrace();
	}
	catch (Exception e2) {
		e2.printStackTrace();
	}
	
	}
	
	private void registerUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		clearMessage();
		
		LoginBean loginBean = new LoginBean();
		loginBean.setfullName(request.getParameter("fullname"));
		loginBean.setEmail(request.getParameter("email"));
		loginBean.setUserName(request.getParameter("username"));
		loginBean.setPassword(request.getParameter("password"));

		try {
			if(getUserService().registerUser(loginBean)) {
				
				message = "Registration Successful!";
			}
			else {
				message = "Failed to register the user!";
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			message = "Operation failed! " +e.getMessage();
		}
		
		request.setAttribute("feedbackmessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("UserHome.jsp");
		rd.forward(request, response);

	}
	
	
	private void clearMessage() {
		
		message = "";
		
	}

}
