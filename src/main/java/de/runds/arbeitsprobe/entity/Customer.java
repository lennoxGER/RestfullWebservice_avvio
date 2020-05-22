package de.runds.arbeitsprobe.entity;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Customer {
	
	@Id
	int id;
	
	Person person;
	
	List <Adress> adresses;
	
	List <Communication> communications;
	
	

	public Customer(int id, Person person, List<Adress> adresses, List<Communication> communications) {
		super();
		this.id = id;
		this.person = person;
		this.adresses = adresses;
		this.communications = communications;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Adress> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adress> adresses) {
		this.adresses = adresses;
	}

	public List<Communication> getCommunications() {
		return communications;
	}

	public void setCommunications(List<Communication> communications) {
		this.communications = communications;
	}
	
	
	
	

}
