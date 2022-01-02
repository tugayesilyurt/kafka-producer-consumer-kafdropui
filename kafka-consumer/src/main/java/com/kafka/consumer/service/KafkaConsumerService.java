package com.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.kafka.consumer.dto.Product;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "product-topic", containerFactory = "kafkaListenerContainerFactoryProduct", groupId = "consumerFactoryProduct")
    public void consumer(@Payload Product message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
                 @Header(KafkaHeaders.OFFSET) String offset) {
          System.out.println("CONSUME message partition : " + partition + " " + message.getProductName());
    }
	
}
