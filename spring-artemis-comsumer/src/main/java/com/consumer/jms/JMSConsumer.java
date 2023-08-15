package com.consumer.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMSConsumer {
	
	@JmsListener(destination = "Card.insert::Card.insert")
	public void consume(String message) {
		System.out.println(message);
	}

}
