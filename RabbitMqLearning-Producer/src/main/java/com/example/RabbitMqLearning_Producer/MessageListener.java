package com.example.RabbitMqLearning_Producer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
	
	@RabbitListener(queues = MQConfig.QUEUE)
	public void listner(CustomMessage message) {
		System.out.println(message);
	}

}
