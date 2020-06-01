package lsc.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lsc.springboot.app.model.Communication;
import lsc.springboot.app.service.CommunicationService;

@RestController
public class CommunicationController {
	
	@Autowired
	CommunicationService communicationService;
	
	
	@PostMapping("/communication")
	private Communication addCommunication(@RequestBody Communication communication){
		return communicationService.addCommunication(communication);
		
	}
	
	@GetMapping("/communication/{id}")
	private Communication getCommunicationById(@PathVariable Long id) {
		return communicationService.findCommunicationById(id);
	}
	

}
