package org.studyeasy;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



@Path("app")

public class App {

	// for primitive data type conversion was automatic,  but for custom dataTypes converters needs to be provided by the 
	// user itself, jersey can not convert these variables to specific type
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo(@QueryParam("code") Currency currency) {
		
		return "The value of x is :"+currency ;
	}

}
