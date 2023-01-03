package it.developer.esercizio.repository;

import org.springframework.data.repository.CrudRepository;

import it.developer.esercizio.model.Utente;

public interface utenteRepository extends CrudRepository <Utente, String> {

}
