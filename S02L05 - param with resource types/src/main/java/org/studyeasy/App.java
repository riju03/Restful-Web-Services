package org.studyeasy;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



@Path("app/{demo}")

public class App {

	// Now this variable is now available for any method inside class, these are class level variables.
	//when we pass parameter the value is passed later,these are temporary variables where new value is passed and method 
	//will work.
	//when we have class level variable these needs to be initialized before hand, we cannot mark class as singleton.
	
	@QueryParam("x") String x;
	@PathParam("demo") String demo;
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		
		return "The value of x is :"+x + "and the value of demo path param is :"+demo;
	}

}
