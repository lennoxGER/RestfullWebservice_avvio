package lsc.springboot.app.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person extends AbstractEntity {

	String name;

	String firstname;

	String dateofbirth;

	@OneToOne(mappedBy = "person")
	Customer customer;

	public Person() {

	}

	public Person(String name, String firstname, String dateofbirth) {
		super();
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

	public void setDateofbirth(String dateOfBirth) {
		this.dateofbirth = dateOfBirth;
	}

}
