package lsc.springboot.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import lsc.springboot.app.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

	@Query(value = "SELECT PERSON_ID FROM CUSTOMER WHERE ID = ?1", nativeQuery = true)
	Long findCorrespondingCustomer(String id);
}
