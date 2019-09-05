package com.deloitte;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deloitte.hire_table;
import com.deloitte.hire_table_dao;
 


 
public class hire_table_servlet extends HttpServlet {
	static SessionFactory sessionFactoryObj;
     
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  response.sendRedirect("ENTRY.jsp");
    	 }
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
        String Hire_category = request.getParameter("Hire_category");
        String p1= request.getParameter("p1");
        int P1=Integer.parseInt(p1);
        String p2 = request.getParameter("p2");
        int P2=Integer.parseInt(p2);
        String p3 = request.getParameter("p3");
        int P3=Integer.parseInt(p3);
 
        HttpSession session = request.getSession(true);
        try {
        	
        	sessionFactoryObj = HibernateUtil.buildSessionFactory();
        	Session session1 = HibernateUtil.getSession();
        	System.out.println("Session Is Opened :: " + session1.isOpen());
        	hire_table_dao userDAO = new hire_table_dao();
            hire_table ht=new hire_table(Hire_category,P1,P2,P3);
            HibernateUtil.beginTransaction();
			userDAO.persist(ht);
			System.out.println("First Entry done and saved succesfully");
            System.out.println("SUCCESS");
        } 
        catch (Exception e) {
 
            e.printStackTrace();}
        
 
    }
}

