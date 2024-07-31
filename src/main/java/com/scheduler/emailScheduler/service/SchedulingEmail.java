package com.scheduler.emailScheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

@Service
@EnableScheduling
public class SchedulingEmail {
    @Autowired
    private MailSender emailSender;

    public void schedulingEmail() {

//        final String taskName = "POC on spring scheduler";
        final String taskName = "POC on SMTP";
        System.out.println("service");

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo("maheshgn58@gmail.com", "ayesha.m@inspironlabs.com"); //send to
        message.setText("HI,\n" + "Just a friendly reminder about "
                + taskName + " that needs your attention:\n" +
                "Please make sure to complete " + taskName + "" +
                " by TODAY to avoid any delays.\n\n\n" + "Thank You");// body of the mail
        message.setSubject(" Automated mail using scheduled cron job"); //subject

        emailSender.send(message);
        System.out.println("Email sent successfully");
    }
}

//            public void SendEmail(JavaMailSender emailSender) {
//            this.emailSender = emailSender;
//
//            emailSender.send();
//        }








