package org.studyeasy.showroom.resources;


import javax.servlet.ServletContext;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.studyeasy.showroom.model.ErrorPayload;

//there will be scenarios where we do not know the name of header and cookies
//context represents entire environment so context is based on entire application
// using this we extract entire set of information.


@Path("/")

public class DemoResource {
	
	@Context
	private UriInfo uriInfo;
	
	@Context
	private ServletContext servletContext;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String usefulAnnotations() {
		
		return "Hello Jas-rs";
				
	}

	// This way of handling exception will cause complexity to business logic,better way to map exception type to 
	//different exception layer
	@GET
	@Path("demo")
	@Produces({MediaType.TEXT_PLAIN,MediaType.APPLICATION_JSON})
	public String contextDemo(@HeaderParam("header") String header) throws Exception {
		
		if(header==null) {
			throw new NotFoundException();
		}
		return "The value of header is: " +header;
		
	}
}
