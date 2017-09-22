package org.raj.restapi.messanger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.raj.restapi.messanger.service.MessageService;
import org.raj.restapi.messanger.model.Message;

@Path("/messages-xml")
public class MessageResourceXML {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages(){
		return messageService.getAllMessagesXML();
	}
	
	
}