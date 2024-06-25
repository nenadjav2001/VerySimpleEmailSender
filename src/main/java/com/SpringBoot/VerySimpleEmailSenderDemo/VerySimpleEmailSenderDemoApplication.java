package com.SpringBoot.VerySimpleEmailSenderDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class VerySimpleEmailSenderDemoApplication {

	@Autowired
	private  EmailSenderService emailSenderService;
	public static void main(String[] args) {
		SpringApplication.run(VerySimpleEmailSenderDemoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMail(){
		emailSenderService.sendEmail("pohlitzlisa7@gmail.com" ,
				"This is Subject",
				"This is Body of Email");
	}


}
