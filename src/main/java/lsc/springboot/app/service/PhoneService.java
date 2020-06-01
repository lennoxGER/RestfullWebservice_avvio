package lsc.springboot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lsc.springboot.app.model.Phone;
import lsc.springboot.app.repository.PhoneRepository;

@Service
public class PhoneService {
	
	@Autowired
	private PhoneRepository phoneRepo;
	
	public Phone addPhone(Phone phone) {
		return phoneRepo.save(phone);
	}

}
