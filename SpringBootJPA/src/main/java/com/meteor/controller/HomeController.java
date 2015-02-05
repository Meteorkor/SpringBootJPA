package com.meteor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meteor.jpa.Customer;
import com.meteor.jpa.CustomerRepository;

@RestController
public class HomeController {

	@Autowired
	CustomerRepository repository;
	
	@RequestMapping(value="", method=RequestMethod.GET  )
	public String Home(){
		
		
		return "Home Page";
	}
	@RequestMapping(value="testing", method=RequestMethod.GET  )
	public String Testing(){
		
		
		/////////////
		 repository.save(new Customer("Jack", "Bauer"));
	        repository.save(new Customer("Chloe", "O'Brian"));
	        repository.save(new Customer("Kim", "Bauer"));
	        repository.save(new Customer("David", "Palmer"));
	        repository.save(new Customer("Michelle", "Dessler"));

	        // fetch all customers
	        Iterable<Customer> customers = repository.findAll();
	        System.out.println("Customers found with findAll():");
	        System.out.println("-------------------------------");
	        for (Customer customer : customers) {
	            System.out.println(customer);
	        }
	        System.out.println();

	        // fetch an individual customer by ID
	        Customer customer = repository.findOne(1L);
	        System.out.println("Customer found with findOne(1L):");
	        System.out.println("--------------------------------");
	        System.out.println(customer);
	        System.out.println();

	        // fetch customers by last name
	        List<Customer> bauers = repository.findByLastName("Bauer");
	        System.out.println("Customer found with findByLastName('Bauer'):");
	        System.out.println("--------------------------------------------");
	        for (Customer bauer : bauers) {
	            System.out.println(bauer);
	        }
		
		
		/////////////
		
		return "Testing Page";
	}
	
	
}
