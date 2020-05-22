package de.runds.arbeitsprobe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phone {
	
	@Id
	int id;
	
	String type;
	
	String value;

}
