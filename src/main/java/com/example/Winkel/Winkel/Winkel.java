package com.example.Winkel.Winkel;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.example.Winkel.Winkel.Domain.Klant;

@Entity
public class Winkel {
	@Id
	@GeneratedValue
	private long id;
	
	@OneToMany
	@JoinColumn(name="winkel_id")
	private List<Klant> klanten = new ArrayList<>();
	
	private String name;
	private int aantalPersoneel;

	public Winkel() {
		
	}
	
	public Winkel(int aantalPersoneel, String name) {
		this.aantalPersoneel = aantalPersoneel;
		this.name = name;
	}
	
	public int getAantalPersoneel() {
		return aantalPersoneel;
	}

	public void setAantalPersoneel(int aantalPersoneel) {
		this.aantalPersoneel = aantalPersoneel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
