package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

	public void addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		 customerRepository.save(cust);
	}

	public Customer getCustomer(int customerid) {
		// TODO Auto-generated method stub
		return customerRepository.findByCustomerid(customerid);
	}

	public void updateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		customerRepository.save(cust);
	}

	public void deleteCustomer(int customerid) {
		// TODO Auto-generated method stub
		Customer cust = customerRepository.findByCustomerid(customerid);
		customerRepository.delete(cust);
	}

	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}


   
}
