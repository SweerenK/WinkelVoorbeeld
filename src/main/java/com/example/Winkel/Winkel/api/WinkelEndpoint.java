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

import com.example.Winkel.WinkelApplication;
import com.example.Winkel.Winkel.Winkel;
import com.example.Winkel.Winkel.persistence.WinkelService;

@Path("Winkel")
@Component
public class WinkelEndpoint {

	@Autowired
	private WinkelService winkelService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listGroep(){
		Iterable <Winkel> winkels = winkelService.findAll();
		return Response.ok(winkels).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response postWinkel(Winkel wi){
		Winkel result = winkelService.save(wi);
		return Response.accepted(result.getId()).build();	
	}
	

}