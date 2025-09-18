package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
      @GetMapping("/get")
	  public ResponseEntity<String> addmsg(){
		  return new ResponseEntity<String>("hello ok tested",HttpStatus.OK);
	  }
}
