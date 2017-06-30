package com.restapi.service;

import java.util.ArrayList;
import java.util.List;

import com.restapi.model.Message;

public class MessageService {

	public MessageService() {}


	public List<Message> getAllMessages() {

		List<Message> list = new ArrayList<>();

		list.add(new Message(1, "Hello from Chi", "Chi"));
		list.add(new Message(2, "Hello from John", "John"));
		list.add(new Message(3, "Hello from Jane", "Jane"));

		return list;
	}

	public Message getMessageById(int id) {
		// hard code 3 messages
		return getAllMessages().get(id - 1);
	}

}
