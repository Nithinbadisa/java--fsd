package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.myaadhar;
import com.example.demo.service.AppService;

@RestController
@RequestMapping("/aadhar")
public class AppController {
	
	private final AppService appservice;
	
	public AppController(AppService appservice) {
		this.appservice=appservice;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<myaadhar>> getrecords(){
		List<myaadhar> records=appservice.findallRecords();
		return new ResponseEntity<>(records,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<myaadhar> getaadharById(@PathVariable("id") int id){
		myaadhar x=appservice.findmyaadharById(id);
		return new ResponseEntity<>(x,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	ResponseEntity<myaadhar> addRequest(@RequestBody  myaadhar x){
		myaadhar y=appservice.add(x);
		return new ResponseEntity<>(y,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	ResponseEntity<myaadhar> updateRequest(@RequestBody  myaadhar x){
		myaadhar y=appservice.update(x);
		return new ResponseEntity<>(y,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<?> deleteRequest(@PathVariable("id") int id){
		appservice.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	

}
