package com.kafka.producer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.dto.Product;
import com.kafka.producer.service.KafkaProducerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class SendKafkaController {
	
	private final KafkaProducerService kafkaProducerService;
	
	@PostMapping("/send/kafka")
	public ResponseEntity<?> get(@RequestBody Product product)
	{
		kafkaProducerService.send(product);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}

}
