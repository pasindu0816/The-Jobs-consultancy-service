package com.codewithpasi.jobconsultants.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codewithpasi.jobconsultants.dao.UserManager;
import com.codewithpasi.jobconsultants.dao.UserManagerImpl;
import com.codewithpasi.jobconsultants.model.Appointment;
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
		
    	String actionType= request.getParameter("actiontype");
		
		if(actionType.equals("allConsultants")) {
			fetchAllConsultants(request, response);		
		} 
		else if(actionType.equals("myProfile")){
			getUserProfile(request, response);		

		}
		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String actionType = request.getParameter("actiontype");
		
		if (actionType.equals ("login")) {
			loginUser(request, response);
		}
		else if (actionType.equals ("register")) {
			registerUser(request, response);
		}
		else if (actionType.equals("setAppointment")) {
			setAppointment(request, response);
		}

	}
	
	private void loginUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	clearMessage();
	
	String userName = request.getParameter("username");
	String password = request.getParameter("password");
	
	LoginBean loginBean = new LoginBean();
	
	loginBean.setUserName(userName);
	loginBean.setPassword(password);
	
	HttpSession session = request.getSession();    //Creating a session
	session.setMaxInactiveInterval(10*60);
	session.setAttribute("sessionName", userName);	   //setting session attribute
		
	try {
		String validateUser = getUserService().loginUser(loginBean);
		
		if(validateUser.equals("Admin_Role")) {
			System.out.println("Admin Home");
			
			/*HttpSession session = request.getSession();    
			session.setAttribute("Admin", userName);	   
			request.setAttribute(userName, userName);*/
			
			request.getRequestDispatcher("AdminHome.jsp").forward(request, response);
		}
		
		else if(validateUser.equals("Consultant_Role")) {
			System.out.println("Consultant Home");
			
			 /*HttpSession session = request.getSession();   
			session.setAttribute("Consultant", userName);	   
			request.setAttribute(userName, userName);*/
			
			request.getRequestDispatcher("ConsultantHome.jsp").forward(request, response);

		}
		
		else if(validateUser.equals("User_Role")) {
			System.out.println("User Home");
			
			/*HttpSession session = request.getSession();    
			session.setMaxInactiveInterval(10*60);
			session.setAttribute("User", userName);	   
			request.setAttribute(userName, userName);*/
			
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
			
			message ="Operation failed! " +e.getMessage();
		}
		
		request.setAttribute("feedbackmessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("UserHome.jsp");
		rd.forward(request, response);

	}
	
	private void fetchAllConsultants(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<LoginBean> consultantList = new ArrayList<LoginBean>();
		
		try {
			consultantList =getUserService().fetchAllConsultants();
					
			if(!(consultantList.size() > 0)) {
				message = "No record found!";
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			message ="Operation failed! "+ e.getMessage();
		}
		
		request.setAttribute("consultantList" , consultantList);
		request.setAttribute("feedbackMessage", message);
		
		RequestDispatcher rd = request.getRequestDispatcher("Consultants.jsp");
		rd.forward(request, response);
		
	} 
	
	
	/*private void fetchConsultantData(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Map<String, Object>> combinedData = new ArrayList<>();		
		try {
			combinedData =getUserService().fetchConsultantData();
					
			if(!(combinedData.size() > 0)) {
				message = "No record found!";
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			message = e.getMessage();
		}
		
		request.setAttribute("combinedData" , combinedData);
		request.setAttribute("feedbackMessage", message);
		
		RequestDispatcher rd = request.getRequestDispatcher("Consultants.jsp");
		rd.forward(request, response);
		
	} */
	
	
	/*public void getUserProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		clearMessage();
		
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("userName");
		
		if (userName != null) {

			LoginBean loginBean = new LoginBean();
			try {
				loginBean = getUserService().getUserProfile(userName);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            if (loginBean != null) {
                request.setAttribute("MyProfile", loginBean);
                request.getRequestDispatcher("MyProfile.jsp").forward(request, response);
            } else {
            	message = "user not found";   }
        } else {
            // Handle unauthenticated user
        }
    }*/

	
	public void getUserProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		HttpSession session = request.getSession();
		LoginBean loginBean = (LoginBean) session.getAttribute("loginBean");
		
		request.setAttribute("loginBean", loginBean);
		
		request.getRequestDispatcher("MyProfile.jsp").forward(request, response);
		
	}
	
	private void setAppointment(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		clearMessage();
		
		Appointment appointment = new Appointment();
		appointment.setFullName(request.getParameter("name"));
		appointment.setEmail(request.getParameter("email"));
		appointment.setConsulName(request.getParameter("consulName"));
		appointment.setDate(request.getParameter("date"));
		appointment.setTime(request.getParameter("time"));
		appointment.setComment(request.getParameter("comment"));
	
		
		try {
			if(getUserService().setAppointment(appointment)) {
				
				message = "The appointment request has been successfully sent!";
			}
			else {
				message = "Failed to request the appointment!";
			}
		} catch (ClassNotFoundException | SQLException e) {
			
			message = "Operation failed! " +e.getMessage();
		}
		
		request.setAttribute("feedbackmessage", message);
		RequestDispatcher rd = request.getRequestDispatcher("Appointments.jsp");
		rd.forward(request, response);
		
	}

	
	private void clearMessage() {
		
		message = "";
		
	}

}
