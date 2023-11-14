package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
    CustomerService customerService;
	
	@RequestMapping(value = "/addcustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void addCustomer(@RequestBody Customer cust) throws Exception {
		customerService.addCustomer(cust);
    }

	
    @RequestMapping(value = "/getcustomer/{customerid}", method = RequestMethod.GET)
    Customer getEmployee(@PathVariable("customerid") int customerid) throws Exception {
        return customerService.getCustomer(customerid);
    }
    
    @RequestMapping(value = "/putcustomer/{customerid}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    void updateCustomer(@PathVariable("customerid") int customerid, @RequestBody Customer cust) throws Exception {
    	cust.setCustomerid(customerid);
        customerService.updateCustomer(cust);
    }

    @RequestMapping(value = "/deletecustomer/{customerid}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    void deleteCustomer(@PathVariable("customerid") int customerid) throws Exception {
    	customerService.deleteCustomer(customerid);
    }
    
}
