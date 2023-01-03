package it.developer.esercizio.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.developer.esercizio.model.Utente;

import it.developer.esercizio.repository.utenteRepository;


@RestController
@RequestMapping("api")
public class ApiController {
	
	@Autowired private utenteRepository utenteRepository;
	

	
	@PostMapping(value="/addUtente")
	
	public Boolean addUtente(@RequestParam Map<String, String> params) {
		
		try {
		Utente utente= new Utente (params.get("nome"), params.get("cognome"));
		
		
		utenteRepository.save(utente);
		return true;
		}
		
		
		
		
		
		
		
	 catch (NumberFormatException e) {
		e.printStackTrace();
		
	}
return false;
}

}

