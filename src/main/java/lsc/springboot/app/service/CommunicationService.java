package lsc.springboot.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lsc.springboot.app.model.Communication;
import lsc.springboot.app.repository.CommunicationRepository;

@Service
public class CommunicationService {
	
	@Autowired
	private CommunicationRepository communicationRepo;
	
	public Communication addCommunication(Communication communication) {
		return communicationRepo.save(communication);
	}
	
	public Communication findCommunicationById(Long id) {
		 return communicationRepo.findById(id).get();
	}

}
