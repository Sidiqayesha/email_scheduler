package com.scheduler.emailScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootApplication
public class EmailSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSchedulerApplication.class, args);
	}

}
