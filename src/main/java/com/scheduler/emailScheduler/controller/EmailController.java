package com.scheduler.emailScheduler.controller;

import com.scheduler.emailScheduler.service.SchedulingEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class EmailController {
    @Autowired
    private SchedulingEmail sendEmail;

    @Scheduled(cron = "*/5 * * * * * ")
    public void email(){
        System.out.println("controller");
        sendEmail.schedulingEmail();
    }
}
