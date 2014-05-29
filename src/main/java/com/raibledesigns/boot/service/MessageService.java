package com.raibledesigns.boot.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import org.springframework.stereotype.Component;

@Singleton
@Component
public class MessageService {
	public List<Message> getInjectedMessages(){
		List<Message> messages = new ArrayList<Message>();
		messages.add(new Message("Injected Message 1"));
		messages.add(new Message("Injected Message 2"));
		messages.add(new Message("Injected Message 3"));
		return messages;
	}
}
