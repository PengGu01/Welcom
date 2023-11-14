package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class CustomerControllerWeb {
	@Autowired
    CustomerService customerService;
	

	
	
	@RequestMapping("/")
	public String home(Model model)
	{
		List<Customer> customers = customerService.findAll();
		model.addAttribute("customers", customers);
		return "index";
	}
	
	
	@RequestMapping("/addcustomerpage")
    public String addCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "addcustomerpage";
    }

	
	@RequestMapping("/editcustomerpage")
    public String editCustomerForm(Model model,@RequestParam("customerid") int customerid) {
		Customer cust = customerService.getCustomer(customerid);
        model.addAttribute("customer", cust);
        return "addcustomerpage";
    }
}
