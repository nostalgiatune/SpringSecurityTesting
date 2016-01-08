package com.tuoppi.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

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
public class RootContext {
    
}