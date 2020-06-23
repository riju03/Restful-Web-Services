package org.studyeasy.showroom.exceptions;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.studyeasy.showroom.model.ErrorPayload;

public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {

	@Override
	public Response toResponse(NotFoundException exception) {
		ErrorPayload error = new ErrorPayload(404,"Element not foung");
		return Response.status(Status.NOT_FOUND).entity(error).build();
		
	}
}
