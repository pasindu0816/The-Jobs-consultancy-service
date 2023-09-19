package com.codewithpasi.jobconsultants.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codewithpasi.jobconsultants.dao.LoginDao;
import com.codewithpasi.jobconsultants.model.LoginBean;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String userName = request.getParameter("username");
	String password = request.getParameter("password");
	
	LoginBean loginBean = new LoginBean();
	
	loginBean.setUserName(userName);
	loginBean.setPassword(password);
	
	LoginDao loginDao = new LoginDao();
	
	try {
		String validateUser = loginDao.authenticateUser(loginBean);
		
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
			
			request.getRequestDispatcher("User.jsp").forward(request, response);

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

}
