package lsc.springboot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lsc.springboot.app.model.Person;
import lsc.springboot.app.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepo;
	
	public Iterable<Person> findAllPersons() {
		return personRepo.findAll();
	}
	
	public Person addPerson(Person person) {
		return personRepo.save(person);
	}

}
