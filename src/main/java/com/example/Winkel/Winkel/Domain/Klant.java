package com.example.Winkel.Winkel.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.example.Winkel.Winkel.Winkel;

@Entity
public class Klant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long klantId;
	
	@ManyToOne
	private Winkel winkel;
	
	private String naam;

	public long getKlantId() {
		return klantId;
	}

	public void setKlantId(long klantId) {
		this.klantId = klantId;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
}
