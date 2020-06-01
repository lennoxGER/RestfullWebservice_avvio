package lsc.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;

import lsc.springboot.app.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	

}
