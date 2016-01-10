package com.tuoppi.boot.config;


import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 *
 * @author Tuoppi
 * 
 * Registers the DelegatingFilterProxy to use the springSecurityFilterChain
 * before any other registered Filter. Bootsrapped by servlet container
 */
public class WebSecurityInitializer extends
        AbstractSecurityWebApplicationInitializer {
    
}