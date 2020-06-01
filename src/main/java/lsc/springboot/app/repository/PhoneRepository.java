package lsc.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;

import lsc.springboot.app.model.Phone;

public interface PhoneRepository extends CrudRepository<Phone, Long> {

}
