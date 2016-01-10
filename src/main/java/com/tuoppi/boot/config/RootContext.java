package com.tuoppi.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 * @author Tuoppi
 */
@Configuration
@ComponentScan(basePackages = {
    "com.tuoppi.boot.service",
    "com.tuoppi.boot.dao"
})
@Import({
    PersistenceContext.class,
    SecurityConfig.class
})
@EnableScheduling
public class RootContext {
    
}