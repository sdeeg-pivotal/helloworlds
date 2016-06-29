package io.pivotal.pa.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private Message message;
	
	@RequestMapping({"/","/message"})
	public Message getMessage() {
		return message;
	}
}
