package com.lti.exam;

import java.util.List;

public class Question {
	//Variables
	private String question;
	private List<Option> option;
	
	//Constructors
	public Question(){
		
	}
	public Question(String question) {
		//super();
		this.question = question;
	}
	
	//Getters & Setters
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Option> getOption() {
		return option;
	}
	public void setOption(List<Option> option) {
		this.option = option;
	}
	
	
	
	

}
