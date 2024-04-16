//package com.Springboot.Controlers;
//
//import com.Springboot.kafka.KafkaProducer;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/v1/kafka")
//public class MessageController {
//
//// Spring bean has only one parameterized contructor so we can ingnore autowise annotation
//	private KafkaProducer kafkaProducer;//injected kafkaproducer
//
//	public MessageController(KafkaProducer kafkaProducer) {
//		this.kafkaProducer = kafkaProducer;
//	}
//	//localhost:8080/api/v1/kafka/publish?message=hello
//	@GetMapping("/publish")
//	public ResponseEntity<String> publish(@RequestParam("message") String message){
//		kafkaProducer.sendMessage(message);
//		return ResponseEntity.ok("messageSend to the topic");
//	}
//}
