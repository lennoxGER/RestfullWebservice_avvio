package de.runds.arbeitsprobe.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Communication {
	
	@Id
	int id;
	
	List<Phone> phones;
	
	String email;
	
	

}
