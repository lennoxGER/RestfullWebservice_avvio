package lsc.springboot.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lsc.springboot.app.model.Address;
import lsc.springboot.app.repository.AdressRepository;

@Service
public class AdressService {
	
	@Autowired
	private AdressRepository adressRepo;
	
	public Address addAdress(Address adress) {
		return adressRepo.save(adress);
	}

}
