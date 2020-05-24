package lsc.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@GeneratedValue
	@Id
	int id;
	
	String name;
}
