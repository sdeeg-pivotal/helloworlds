package io.pivotal.pa.boot.hw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootHelloworldCliApplication implements CommandLineRunner {

	@Value("${message:default}")
	private String message;
	
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(message);
	}

	public static void main(String[] args) {
		SpringApplication.run(BootHelloworldCliApplication.class, args);
	}
}
