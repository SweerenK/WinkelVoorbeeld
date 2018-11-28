package com.example.Winkel.Winkel.config;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import com.example.Winkel.Winkel.api.WinkelEndpoint;


@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{
	public JerseyConfig(){
		register(WinkelEndpoint.class);
	}
}
