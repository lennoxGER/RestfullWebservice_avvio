package lsc.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;

import lsc.springboot.app.model.Address;

public interface AdressRepository extends CrudRepository<Address, Long> {

}
