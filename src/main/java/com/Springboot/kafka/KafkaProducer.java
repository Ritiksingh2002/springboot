//package com.Springboot.kafka;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaProducer {
//	private static  final Logger logger=LoggerFactory.getLogger(KafkaProducer.class);
//	@Autowired
//	private KafkaTemplate <String ,String > kafkaTemplate;  //constructor based dependency injection
//
//	//if we dont use spring boot then we've to manuaally configure kafkatemplate
//	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//		this.kafkaTemplate = kafkaTemplate;
//	}
//
//
//	public void sendMessage(String message){
//		logger.info((String.format("message send %s",message)));
//	kafkaTemplate.send("myTopic",message);
//	}
//	//1.. we have used kafka template to send the message to the kafka topic
//	//2.. Now we will create a Rest API to send the messsage t0 the kafka producer and then kafka producer will send the message to the kafka topic
//}
