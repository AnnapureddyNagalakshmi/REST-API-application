package com.api.rest;
//I want to make this class as a Distributed Component

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
//http://localhost:8080/welcome	
@GetMapping("/welcome")
	public ResponseEntity<String> getWelcome(){		//what type of reponse we have to send by client
		String resp="Welcome to Infosys";
		return new ResponseEntity<>(resp,HttpStatus.OK); //we are constructing http obj with  resp and status code
	}

//http://localhost:8080/greet
@GetMapping("/greet")
public String greetMsg() {
	String resp="GoodMorning!..";
	return resp;					//here we are just giving the resp they will construct the response obj
}
}
