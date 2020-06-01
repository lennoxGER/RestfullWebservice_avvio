package lsc.springboot.app.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lsc.springboot.app.model.Address;
import lsc.springboot.app.model.Communication;
import lsc.springboot.app.model.Customer;
import lsc.springboot.app.model.Person;
import lsc.springboot.app.model.Phone;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CustomerControllerTest {
	
	@Autowired
	TestRestTemplate restTemplate;
	
	@Test
	public void postCustomer() {
		Person testPerson = new Person("Brot", "Bernd", "11-03-1999");
		List<Address> testAddresses = Arrays.asList(
				new Address("billing", "Bergstrasse", 3, "94244", "Teisnach"),
				new Address("billing", "Bergweg", 4, "94493", "Teststadt")
				);
		List<Phone> testPhones = Arrays.asList(
				new Phone("mobile", "123123"), 
				new Phone("mobile", "12253423")
				);
		List<Communication> testCommunications = Arrays.asList(
				 new Communication(testPhones, "bernd@bernd.de")
			);
		

		Customer customerTest = new Customer(null,testPerson,testAddresses, testCommunications);


		ResponseEntity<Customer> result = restTemplate.postForEntity("/customer", customerTest, Customer.class);

		Assert.assertEquals(HttpStatus.CREATED, result.getStatusCode());
		Assert.assertNotNull(result.getBody());
		Assert.assertEquals("bernd@bernd.de", result.getBody().getCommunications().get(0).getEmail());

	}

}
