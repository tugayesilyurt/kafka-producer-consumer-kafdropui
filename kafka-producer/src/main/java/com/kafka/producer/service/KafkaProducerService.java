package com.kafka.producer.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.kafka.producer.dto.Product;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaProducerService{

	private final KafkaTemplate<String, Object> kafkaTemplate;

	public void send(Product product) {

		ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send("product-topic", product);

		future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {

			@Override
			public void onSuccess(SendResult<String, Object> result) {
				System.out.println("Sent message : " + result.getRecordMetadata().offset());
			}

			@Override
			public void onFailure(Throwable ex) {
				System.out.println("Unable to Send message : " + ex.getMessage());
			}
		});

	}

}
