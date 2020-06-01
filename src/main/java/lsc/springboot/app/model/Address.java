package lsc.springboot.app.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address extends AbstractEntity {

	String type;

	String street;

	int number;

	String postal;

	String city;

	public Address() {
		
	}
	
	public Address(String type, String street, int number, String postal, String city) {
		super();
		this.type = type;
		this.street = street;
		this.number = number;
		this.postal = postal;
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}