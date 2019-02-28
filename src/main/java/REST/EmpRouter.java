package com.journaldev;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;

@Path("/value")
public class EmpRouter {

	@GET
	public String getEmp() {
		System.out.println("Sain kätte!");
		//return Response.ok("TERE!!!").build();
		return "TERE!!!!";
	}
}