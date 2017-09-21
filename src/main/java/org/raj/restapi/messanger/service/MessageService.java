package org.raj.restapi.messanger.service;

import java.util.ArrayList;
import java.util.List;

import org.raj.restapi.messanger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "First Message Hello ", "Shailesh Singh");
		Message m2 = new Message(2L, "Second Message Hello Jersey", "Shailesh Singh");
		
		List<Message> m_list = new ArrayList<>();
		
		m_list.add(m1);
		m_list.add(m2);
		
		return m_list;
				
	}
}
