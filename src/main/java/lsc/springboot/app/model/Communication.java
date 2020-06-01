package lsc.springboot.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="COMMUNICATION")
public class Communication extends AbstractEntity{

	@OneToMany(targetEntity = Phone.class, cascade = CascadeType.ALL)
	@JoinColumn (name= "communication_fk", referencedColumnName = "id")
	List<Phone> phones;

	String email;
	
	public Communication() {
		
	}

	public Communication(List<Phone> phones, String email) {
		super();
		this.phones = phones;
		this.email = email;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
