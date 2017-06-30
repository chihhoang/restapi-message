package com.restapi.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.restapi.model.Message;
import com.restapi.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();

	@Path("/plain")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlainMessages() {
		return messageService.getAllMessages().toString();
	}

	@Path("/xml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getXmlMessages() {
		return "<xml>" + messageService.getAllMessages().toString() + "</xml>";
	}

	@Path("/html")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHtmlMessages() {
		return "<html><h2>" + messageService.getAllMessages().toString() + "</h2></html>";
	}

	@Path("/json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getJsonMessages() {
		return messageService.getAllMessages();
	}

	@Path("/json/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message getJsonMessageById(@PathParam("id") int id) {
		return messageService.getMessageById(id);
	}

}
