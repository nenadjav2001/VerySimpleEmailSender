package com.SpringBoot.VerySimpleEmailSenderDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {


@Autowired
private JavaMailSender mailSender;

public void sendEmail(String toEmail , String subject , String body){
    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
    simpleMailMessage.setFrom("bewerbungnenad@gmail.com");
    simpleMailMessage.setTo(toEmail);
    simpleMailMessage.setText(body);
    simpleMailMessage.setSubject(subject);

    mailSender.send(simpleMailMessage);

    System.out.println("Mail Sent succsessfully....");
}








}
