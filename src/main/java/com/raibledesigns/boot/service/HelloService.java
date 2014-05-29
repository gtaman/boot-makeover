package com.raibledesigns.boot.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/hello")
@XmlRootElement
public class HelloService {
	@Autowired
	MessageService messageService;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
   	public Message message() {
   		return new Message("Hello World");
   	}
    
    @GET
    @Path("/message")
	public List<Message> returnSpringInjectedMessages(){
    	return messageService.getInjectedMessages();
    }
}
