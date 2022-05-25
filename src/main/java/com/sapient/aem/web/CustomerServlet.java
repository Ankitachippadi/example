package com.sapient.aem.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.sapient.aem.exception.CustomerException;
import com.sapient.aem.model.Customer;
import com.sapient.aem.service.CustomerService;
import com.sapient.aem.service.CustomerServiceImpl;



@WebServlet("/customer-servlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private CustomerService customerService= new CustomerServiceImpl();
	
	private Logger logger= Logger.getLogger(CustomerServlet.class);
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		try {
			Integer customerId=Integer.parseInt(request.getParameter("customerId"));
			String customerName=request.getParameter("customerName");
			String birthdate=request.getParameter("birthdate");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			Long mobile=Long.parseLong(request.getParameter("mobile"));
			
			Customer customer=new Customer();
			List<Customer> count= customerService.getAllCustomers();
			if( count!=null) {
				
				request.setAttribute("customer", customer);
				logger.info(customer);
			
				

				out.println("data  present successfully");
			}

			
		}catch(CustomerException e) {
			e.printStackTrace();
		}catch(Exception e) {
			logger.error(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
