package com.src.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/status/")
public class Status {
	
	public  static final String api_version = "00.1.0";
	
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

}
