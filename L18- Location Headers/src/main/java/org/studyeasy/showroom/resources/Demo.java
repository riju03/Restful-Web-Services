package org.studyeasy.showroom.resources;


import javax.servlet.ServletContext;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

//there will be scenarios where we do not know the name of header and cookies
//context represents entire environment so context is based on entire application
// using this we extract entire set of information.


@Path("/")
@Produces(MediaType.TEXT_PLAIN)
public class Demo {
	
	@Context
	private UriInfo uriInfo;
	
	@Context
	private ServletContext servletContext;
	
	@GET
	
	public String usefulAnnotations(@HeaderParam("headerValue") String headerAttribute,
			@CookieParam("_xsrf") String xsrf) {
		
		return "header value: "+headerAttribute+ "cookie value"+xsrf;
	}

	@GET
	@Path("demo")
	public String contextDemo(@Context HttpHeaders headers) {
		
		return headers.getRequestHeaders().keySet().toString();
		//return "Absolute Path:"+uriInfo.getAbsolutePath().toString();
	}
}
