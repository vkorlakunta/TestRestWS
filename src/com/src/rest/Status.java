package com.src.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.src.dao.TestDAO;

@Path("/v1/status/")
public class Status {
	
	public  static final String api_version = "00.1.0";
	
	private TestDAO dao = new TestDAO();
	
	@Path("/status")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getStatus() {
		return "</p> Hello... Restful Webservices..!!! </p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getVersion() {
		return "</p> Version is :: </p>" + api_version;
	}
	

	@Path("/date")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getCurrentDate() {
		return "</p> Current Time Stamp is :: </p>" + dao.getDate();
	}
	
	@Path("/getBooks")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getBooks() {
		Response response = null;
		response = Response.ok(dao.getBookList()).build();
		return response; 
	}

}
