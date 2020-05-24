package lsc.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adress {
	
	@GeneratedValue
	@Id
	int id;
	
	String street;
	
	int streetNumber;
	
	String postalCode;

}