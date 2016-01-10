package com.tuoppi.boot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledPrinter {
    
    @Scheduled(fixedRate = 100)
    public void print() {
        System.out.println("SCHEDULING TEST");
    }
}