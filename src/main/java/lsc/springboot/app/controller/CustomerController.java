package lsc.springboot.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lsc.springboot.app.model.Customer;
import lsc.springboot.app.service.AdressService;
import lsc.springboot.app.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService service;

	@Autowired
	AdressService adressService;

	@GetMapping(value = "/allCustomer")
	public ResponseEntity<Iterable<Customer>> getRouteById() {
		Iterable<Customer> result = service.findAllCustomer();

		return new ResponseEntity<Iterable<Customer>>(result, HttpStatus.OK);

	}

	@PutMapping(value = "customer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer newCustomer) {
		return new ResponseEntity<Customer>(service.updateCustomer(newCustomer), HttpStatus.CREATED);
	}
	
	@PostMapping(value = "customer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer newCustomer) {
		return new ResponseEntity<Customer>(service.saveCustomer(newCustomer), HttpStatus.CREATED);
	}

	@PostMapping(value = "customers")
	public ResponseEntity<List<String>> addCustomers(@RequestBody List<Customer> newCustomers) {
		List<String> persistedCustomerIds = new ArrayList<>();

		try {
			for (Customer customer : newCustomers) {
				persistedCustomerIds.add(service.saveCustomer(customer).getCustomerId());
			}
			return new ResponseEntity<List<String>>(persistedCustomerIds, HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<List<String>>(persistedCustomerIds, HttpStatus.CREATED);
		}

	}

}
