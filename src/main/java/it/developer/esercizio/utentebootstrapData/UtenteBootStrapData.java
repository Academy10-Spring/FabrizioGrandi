package it.developer.esercizio.utentebootstrapData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.developer.esercizio.model.Utente;
import it.developer.esercizio.repository.utenteRepository;

@Component
public class UtenteBootStrapData implements CommandLineRunner {


	@Autowired
	private utenteRepository utenteRepository;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Utente utenteMario= new Utente("Mario", "Rossi");
		Utente  utenteGiorgio= new Utente("Giorgio", "Bianchi");
		
		
		
		
		
		utenteRepository.save(utenteMario);
		utenteRepository.save(utenteGiorgio);
		
		
		
	}
	

}

