package de.runds.arbeitsprobe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	int id;
	
	String name;
	
	String firstname;
	
	String dateofbirth;
	
	

	public Person(int id, String name, String firstname, String dateofbirth) {
		super();
		this.id = id;
		this.name = name;
		this.firstname = firstname;
		this.dateofbirth = dateofbirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	
	
	

}
