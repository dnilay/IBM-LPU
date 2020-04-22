package comm.example.dao;

import java.util.List;

import comm.example.entity.Customer;

public interface CustomerDAO {

	
	  public List<Customer> getCustomers();
	  
		/*
		 * public void saveCustomer(Customer theCustomer);
		 * 
		 * public Customer getCustomer(int theId);
		 * 
		 * public void deleteCustomer(int theId);
		 */
}
