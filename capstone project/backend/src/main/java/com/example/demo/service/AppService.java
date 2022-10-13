package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.myaadhar;
import com.example.demo.exceptions.UserNotFoundException;
import com.example.demo.repository.MyAadharRepository;

@Service
public class AppService {

	private final MyAadharRepository repo;

	@Autowired
	public AppService(MyAadharRepository repo) {
		this.repo = repo;
	}
	
	public List<myaadhar> findallRecords(){
		return repo.findAll();
	}

	public myaadhar add(myaadhar x) {
		return repo.save(x);
	}

	public myaadhar update(myaadhar x) {
		return repo.save(x);
	}

	public myaadhar findmyaadharById(int id) {
		return repo.findById(id)
				.orElseThrow(() -> new UserNotFoundException("User by id " + id + " not found"));

	}

	public void delete(int id) {
		repo.deleteById(id);
	}

}
