package com.restapi.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent
	 * to the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got it in plain!";
	}

	@Path("/html")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHtml() {
		return "<html>" + "<h2>" +"Got it in Html!" + "</h2>" + "</html>";
	}

	@Path("/xml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getXml() {
		return "<xml>" + "Got it in Xml!" + "</xml>";
	}
}
