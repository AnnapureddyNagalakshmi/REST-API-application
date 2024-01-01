package com.api.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouseRestController {

	@GetMapping("/course")
	//http://localhost:8080/couses?cname=SBMS&tname=ashok
	public ResponseEntity<String> getCouseFee(@RequestParam("cname") String cname,@RequestParam("tname") String tname) {
		String respBody=cname+" By "+tname+" Fee is 7000 INR ";
		return new ResponseEntity<>(respBody,HttpStatus.OK);
	}
}
