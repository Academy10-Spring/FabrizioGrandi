package it.developer.esercizio.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.developer.esercizio.model.Utente;
import it.developer.esercizio.repository.utenteRepository;


@Controller
public class WebController {
	
	@Autowired
	private utenteRepository utenteRepository;
	
	
	
	@GetMapping("/utente")
	public String getHome(Model model) {
		
	List<Utente> userList= (List<Utente>)	utenteRepository.findAll();
	model.addAttribute("utente", userList);
		
		return "home";
		
		
	}
	
	
	
	
	

}
 
