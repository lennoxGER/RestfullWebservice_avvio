package de.runds.arbeitsprobe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adress {

	@Id
	int id;
	
	String type;
	
	String street;
	
	int number;
	
	String postal;
	
	String city;
	
	
}
