package org.studyeasy.showroom.resources;


import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// if we want to check the header value passed in the postman use headerParam
// to get cookie information use @cookieParam

@Path("/")
public class Demo {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String usefulAnnotations(@HeaderParam("headerValue") String headerAttribute,
			@CookieParam("_xsrf") String xsrf) {
		
		return "header value: "+headerAttribute+ "cookie value"+xsrf;
	}

}
