package org.raj.restapi.messanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



import org.raj.restapi.messanger.database.DatabaseClass;
import org.raj.restapi.messanger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessagesXML(){
		Message m1 = new Message(1L, "First Message Hello ", "Shailesh Singh");
		Message m2 = new Message(2L, "Second Message Hello Jersey", "Shailesh Singh");
		
		List<Message> m_list = new ArrayList<>();
		
		m_list.add(m1);
		m_list.add(m2);
		
		return m_list;
				
	}
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	
	public MessageService() {
		messages.put(1L, new Message(1,"hello world", "Shailesh Singh"));
		messages.put(2L, new Message(2,"hello world second jersey msg", "Shailesh Singh"));
		
	}
	
	
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message UpdateMessage(Message message) {
		if(message.getId()<=0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
