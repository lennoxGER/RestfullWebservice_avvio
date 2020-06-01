package lsc.springboot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lsc.springboot.app.model.Customer;
import lsc.springboot.app.repository.CustomerRepository;
import lsc.springboot.app.repository.PersonRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private AdressService adressService;

	@Autowired
	private CommunicationService communicationService;

	@Autowired
	private PhoneService phoneService;

	@Autowired
	private PersonRepository personenRepo;

	public Iterable<Customer> findAllCustomer() {
		return customerRepo.findAll();
	}

	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

	public Customer saveCustomerWithoutPerson(Customer customer) {
		return customerRepo.save(customer);
	}

	public Customer updateCustomer(Customer customer) {
		
		Long result = customerRepo.findCorrespondingCustomer(customer.getCustomerId());

		customer.getPerson().setId(result);

		return customerRepo.save(customer);
	}

}
