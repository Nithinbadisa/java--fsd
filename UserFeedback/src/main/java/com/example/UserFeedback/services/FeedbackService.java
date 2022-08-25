package com.example.UserFeedback.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserFeedback.entities.Feedback;
import com.example.UserFeedback.repositories.*;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public Iterable<Feedback> GetAllFeedback() {
		return feedbackRepository.findAll();
	}
	

}