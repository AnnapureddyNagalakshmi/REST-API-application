package com.api.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {
	@GetMapping("/book/{name}")
	//http://localhost:8080/book/spring
	public ResponseEntity<String> getBookPrice(@PathVariable("name") String name){
	String respBody=name+"Price is $400";
	return new ResponseEntity<>(respBody,HttpStatus.OK);
	}
	
	@GetMapping("/books/{bname}/{aname}")
	//http://localhost:8080/books/spring/james
	public ResponseEntity<String> getBook(@PathVariable("bname") String bname,@PathVariable("aname") String aname){
		String respBody=bname+" By "+aname+" is out of stock";
		return new ResponseEntity<>(respBody,HttpStatus.OK);
	
	}
	@GetMapping("/books/name/{bname}/author/{aname}")
	//http://localhost:8080/books/name/spring/author/james
	public ResponseEntity<String> getBooks(@PathVariable("bname") String bname,@PathVariable("aname") String aname){
		String respBody=bname+" By "+aname+" is out of stock";
		return new ResponseEntity<>(respBody,HttpStatus.OK);
	
	}
}
