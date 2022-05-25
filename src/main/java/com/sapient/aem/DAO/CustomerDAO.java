package com.sapient.aem.DAO;

import java.sql.SQLException;
import java.util.List;

import com.sapient.aem.model.Customer;

public interface CustomerDAO {
	public abstract Customer getCustomerById(Integer customerId) throws SQLException;
	public abstract List<Customer> getAllCustomers() throws SQLException;
}
