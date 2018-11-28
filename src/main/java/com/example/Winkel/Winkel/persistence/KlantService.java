package com.example.Winkel.Winkel.persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Winkel.Winkel.Domain.Klant;

@Service
@Transactional		//Mag operaties op de database doen.
public class KlantService {
	@Autowired		//Verbinding tussen repository en service. Zorgt ervoor dat je een object van ZiekenhuisRepository tot beschikking hebt (eigenlijk interface)
	private KlantRepository klantRepository;

	
	public Klant save(Klant klant) {
		return klantRepository.save(klant);
	}


	public Iterable<Klant> findAll() {					//Iterable is een verzameling op het hoogste niveau. Doorheenloopbaar.
		
		Iterable<Klant> result = klantRepository.findAll();
		return result;
	}
	
	
}

