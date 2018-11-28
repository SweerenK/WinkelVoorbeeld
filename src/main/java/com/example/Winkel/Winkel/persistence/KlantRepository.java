package com.example.Winkel.Winkel.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.Winkel.Winkel.Domain.Klant;


@Component
public interface KlantRepository extends CrudRepository<Klant, Long> {

}
