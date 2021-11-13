package com.sunwonders.sentiment.analysis.dto;

public class SentimentRequest {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public SentimentRequest(String message) {
		super();
		this.message = message;
	}

	public SentimentRequest() {
		super();
	}
	
	
	
}
