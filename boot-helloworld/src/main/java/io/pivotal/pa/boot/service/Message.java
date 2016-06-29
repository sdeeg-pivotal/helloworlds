package io.pivotal.pa.boot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Message {

	@Value("${app.message:default}")
	private String message;
	
	public String getMessage() { return message; }
	public void setMessage(String message) { this.message = message; }
}
