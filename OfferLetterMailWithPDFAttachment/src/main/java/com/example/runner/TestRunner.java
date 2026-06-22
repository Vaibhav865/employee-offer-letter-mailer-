package com.example.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.entity.Employee;
import com.example.service.MailService;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	MailService mailService;
	@Override
	public void run(String... args) throws Exception {
		IO.println("TestRunner method started ");
		mailService.sendOfferLetter(new Employee("Vaibhav","vaibhavpekhale8657@gmail.com", "HR"));
		IO.println("TestRunner method ended ");
	}

}
