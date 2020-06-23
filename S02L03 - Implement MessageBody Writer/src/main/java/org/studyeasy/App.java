package org.studyeasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("app")
public class App {

	/*
	 * this will give error because there is no conversion provided by JAX-RS.
	 * So we will create custom message body writer
	 */
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Name demo() {
		System.out.println();
		return new Name("Riju","Prakash");
	}

}
