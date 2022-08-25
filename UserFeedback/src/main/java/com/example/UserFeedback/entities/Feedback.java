package com.example.UserFeedback.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Feedback {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String comments;
	private int rating;
	private String user;
	
	public Feedback()
	{
		
	}
	public Feedback(Integer id, String comments, int rating, String user)
	{
		this.id = id;
		this.comments = comments;
		this.rating = rating;
		this.user = user;
	}
	
	@Override
	public String toString()
	{
		return "<br><h3>" + user + " [" + id + "]" + " commented:</h3><h4>\"" + comments + "\"  and rated: " + rating + "</h4><br>";
	}
}