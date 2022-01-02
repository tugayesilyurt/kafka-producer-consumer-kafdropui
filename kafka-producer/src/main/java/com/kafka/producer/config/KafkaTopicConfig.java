package com.kafka.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class KafkaTopicConfig {
	
	 @Bean
	  public NewTopic product() {
	    return TopicBuilder.name("product-topic").partitions(10).replicas(2).build();
	  }


}
