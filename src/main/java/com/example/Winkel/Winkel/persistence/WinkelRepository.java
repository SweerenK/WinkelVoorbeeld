package com.example.Winkel.Winkel.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.Winkel.Winkel.Winkel;

@Component
public interface WinkelRepository extends CrudRepository<Winkel, Long> {

}
