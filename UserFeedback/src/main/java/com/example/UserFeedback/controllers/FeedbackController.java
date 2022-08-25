package com.example.UserFeedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.UserFeedback.entities.Feedback;
import com.example.UserFeedback.repositories.FeedbackRepository;
import com.example.UserFeedback.services.FeedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	FeedbackService feedbackService;
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	@GetMapping(value="/")
    public String showIndexPage(ModelMap model){   
		 return "<html>\n"
		 		+ "<head>\n"
		 		+ "	<style>\n"
		 		+ "		.center {\n"
		 		+ "	  		text-align: center;\n"
		 		+ "	  	}\n"
		 		+ "	  	\n"
		 		+ "	</style>\n"
		 		+ "</head>\n"
		 		+ "<body style=\"background-color:lightblue;\">\n"
		 		+ "	<div class=\"center\">\n"
		 		+ "		<h1>User Feedback Page</h1>\n"
		 		+ "		\n"
		 		+ "		<h2 class=\"hello-title\">View and Send User Feedback</h2>\n"
		 		+ "		\n"
		 		+ "		<a href=\"/feedback\">View all feedback</a>\n"
		 		+ "		<br><br>\n"
				+ "     <form method=\"get\" action=\"update\">\n"
				+ "			<br><h3>Enter your feedback below:</h3>\n"
				+ "			<input type=\"text\" id=\"comment\" name=\"comment\" placeholder=\"Comment Here\" required>\n"
				+ "			<input type=\"number\" id=\"rating\" name=\"rating\" placeholder=\"Rating Here\" required>\n"
				+ "			<input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Name Here\" required>	\n"
				+ "			<input type=\"submit\" value=\"Enter\" />\n"
				+ "		</form>"
		 		+ "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }
	
	@GetMapping("/feedback")
	public @ResponseBody String getAllFeedbacks() {
        // This returns a JSON or XML with the Feedbacks
        Iterable<Feedback> allFB = feedbackRepository.findAll();
		return "<html>\n"
		 		+ "<head>\n"
		 		+ "	<style>\n"
		 		+ "		.center {\n"
		 		+ "	  		text-align: center;\n"
		 		+ "	  	}\n"
		 		+ "	  	\n"
		 		+ "	</style>\n"
		 		+ "</head>\n"
		 		+ "<body style=\"background-color:lightblue;\">\n"
		 		+ "	<div class=\"center\">\n"
		 		+ "<h1>Feedback Table</h1>\n"
        		+ allFB.toString()
		        + "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";
    }
	

}

