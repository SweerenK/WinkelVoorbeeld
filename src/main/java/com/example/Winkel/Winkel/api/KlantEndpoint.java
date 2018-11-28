package com.example.Winkel.Winkel.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Winkel.Winkel.Domain.Klant;
import com.example.Winkel.Winkel.persistence.KlantService;

@Path("Klant")
@Component
public class KlantEndpoint {

	@Autowired
	private KlantService klantService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroep(){
		Iterable <Klant> klanten = klantService.findAll();
		return Response.ok(klanten).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postKlant(Klant klant){
		Klant result = klantService.save(klant);
		return Response.accepted(result.getKlantId()).build();	
	}
	

}