package lsc.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;

import lsc.springboot.app.model.Communication;

public interface CommunicationRepository extends CrudRepository<Communication, Long>{

}
