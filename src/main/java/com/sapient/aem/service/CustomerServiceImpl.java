package com.sapient.aem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sapient.aem.DAO.CustomerDAO;
import com.sapient.aem.DAO.CustomerDAOImpl;

import com.sapient.aem.exception.CustomerException;

import com.sapient.aem.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDAO = new CustomerDAOImpl();
	List<Customer> customerList= new ArrayList<>();
	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
		
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() throws CustomerException {
		
		return null;
	}

	@Override
	public List<String> getAllCustomerNames() throws CustomerException {
		return customerList.stream()
		.map((a)->a.getCustomerName())	
		.collect(Collectors.toList());
		
	}

	@Override
	public Map<String, Integer> getCityCount() throws CustomerException {
		
		return null;
	}

}
