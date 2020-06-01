package lsc.springboot.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lsc.springboot.app.idgenerator.PrefixedSequenceIdGenerator;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_gen")
	@GenericGenerator(name = "customer_gen", strategy = "lsc.springboot.app.idgenerator.PrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = PrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name = PrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER1, value = "DE-1234-5678-0001-"),
			@Parameter(name = PrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	@Column(name = "id")
	String customerId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "person_id", referencedColumnName = "id")
	Person person;

	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_fk", referencedColumnName = "id")
	List<Address> addresses;

	@OneToMany(targetEntity = Communication.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_fk", referencedColumnName = "id")
	List<Communication> communications;

	public Customer() {

	}

	public Customer(String customerId, Person person, List<Address> addresses, List<Communication> communications) {
		super();
		this.customerId = customerId;
		this.person = person;
		this.addresses = addresses;
		this.communications = communications;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Communication> getCommunications() {
		return communications;
	}

	public void setCommunications(List<Communication> communications) {
		this.communications = communications;
	}

}
