package org.studyeasy.messageBodyWriters;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import org.studyeasy.Name;

@Provider  // to register this class
@Produces(MediaType.TEXT_PLAIN) // restricting to this media type
public class MessageBodyWriterForName implements MessageBodyWriter<Name>{

	// if this returns true then only writeTo method will get executed
	// in this method we will check whether the object is of type name or not
	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		
		return Name.class == type;
	}

	// have business logic
	@Override
	public void writeTo(Name t, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
			throws IOException, WebApplicationException {
		
		// entityStream contain the final data which we will write
		// we also need to convert the data into byte string
		entityStream.write(t.toString().getBytes());
		
	}
	
	

}
