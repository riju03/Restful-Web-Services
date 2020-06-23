package org.studyeasy;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*
 * Per request new object is created in the background
 * once the object serve the request it will die, this is why value of x is not increasing
 * For every request new variable is created and soon as the its serve its purpose it will be released from the memory
 * 
 * 
 * There could be scenarios where we would like to contain object for longer period of time. use @singleton
 * this object will serve multiple user over period of time till we restart server.
 * 
 * So two type of resources:
 * 1) Default : object will get destroyed automatically after serving the request.
 * 2) Singleton : where resource will be there for longer period of time and the same object will be used for diff users.
 */

@Path("app")
@Singleton
public class App {

	private int x = 0;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String demo() {
		
		return "The value of x is :"+(++x) ;
	}

}
