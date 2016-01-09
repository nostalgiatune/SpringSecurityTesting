package com.tuoppi.boot.controller;

import com.tuoppi.boot.service.ProductService;
import com.tuoppi.boot.service.ProductStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Tuoppi
 */
@Controller
@RequestMapping("/")
public class TestController {
    
    @Autowired
    private ProductService productService;
    
    @Autowired
    private ProductStorageService storageService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String test() {
        productService.init();
        return "test";
    }
    
}