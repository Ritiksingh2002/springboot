//package com.Springboot.kafka;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//
//
//@Service
//public class KakfaConsumer {
//	//we are hoig  to create subscriber method that will subscrbe the topic
//	private static final Logger logger= LoggerFactory.getLogger(KakfaConsumer.class);
//	@KafkaListener(topics="myTopic", groupId = "myGroup")
//	public void consume(String message){
//
//logger.info(String.format("messageReceived->%s",message));
//	}
//
//
//}
