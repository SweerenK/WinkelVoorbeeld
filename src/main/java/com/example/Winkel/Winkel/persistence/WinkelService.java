package com.example.Winkel.Winkel.persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Winkel.Winkel.Winkel;
import com.example.Winkel.Winkel.persistence.*;

@Service
@Transactional		//Mag operaties op de database doen.
public class WinkelService {
	@Autowired		//Verbinding tussen repository en service. Zorgt ervoor dat je een object van ZiekenhuisRepository tot beschikking hebt (eigenlijk interface)
	private WinkelRepository winkelRepository;

	
	public Winkel save(Winkel wi) {
		return winkelRepository.save(wi);
	}


	public Iterable<Winkel> findAll() {					//Iterable is een verzameling op het hoogste niveau. Doorheenloopbaar.
		//Winkel winkel = new Winkel(12, "Winkel van Javiel");
		//save(winkel);
		
		Iterable<Winkel> result = winkelRepository.findAll();
		return result;
	}
	
	
}

