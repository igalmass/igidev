package com.example.ddd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DddApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DddApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hellloooooooo");
	}
}
