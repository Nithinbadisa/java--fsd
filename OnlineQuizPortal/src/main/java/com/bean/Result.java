package com.bean;

public class Result implements Comparable<Result>{
	 
	private int resid;
	private String email;
	private Integer marks;
	public Result()
	{

	}
	public Result(String email2, int mark) {
	// TODO Auto-generated constructor stub]
	this.email=email2;this.marks=mark;
	}
	 public int getResid() {
		return resid;
	}
	 public void setResid(int resid) {
	this.resid = resid;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public Integer getMarks() {
	return marks;
	}
	public void setMarks(Integer marks) {
	this.marks = marks;
	}
	@Override
	public String toString() {
	return "Result [email=" + email + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Result r) {
		return marks;
	// TODO Auto-generated method stub int comparemarks= r.getMarks(); return comparemarks-this.marks;
	}



	}
