package org.test.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class MessageRestService {

	@GET
	public Response dummyGet() {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
		}
		String result = "Restful example";

		return Response.status(200).entity(result).build();

	}

	@DELETE
    @Path("/delete")
    public void delete() {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
		}
	}

	@PUT
	@Path("/put")
	public Response dummyPut(@FormParam("name") String name) {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
		}
			
		return Response.status(200)
			.entity("addUser is called, name : " + name)	
			.build();
	}		

	@POST
	@Path("/post")
	public Response dummyPost(@FormParam("name") String name) {
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
		}
			
		return Response.status(200)
			.entity("addUser is called, name : " + name)	
			.build();
	}	

}