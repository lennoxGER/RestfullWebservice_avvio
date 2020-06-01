package lsc.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lsc.springboot.app.model.Address;
import lsc.springboot.app.model.Person;
import lsc.springboot.app.service.AdressService;
import lsc.springboot.app.service.PersonService;

@RestController
public class PersonController {
	
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private AdressService asercie;
	
	@PostMapping(value = "/person")
	public Person addPerson(@RequestBody Person newPerson) {
		return personService.addPerson(newPerson);
		
	}
	
	
	@PostMapping(value = "/adress")
	public Address addPerson(@RequestBody Address newPerson) {
		return asercie.addAdress(newPerson);
		
	}

}
