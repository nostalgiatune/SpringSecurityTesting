package com.tuoppi.boot.controller;

import com.tuoppi.boot.model.BindingTester;
import com.tuoppi.boot.model.Product;
import com.tuoppi.boot.service.ProductService;
import com.tuoppi.boot.service.ProductStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String test(@ModelAttribute("bindingtester") BindingTester dummy) {
        //productService.init();
        return "test";
    }
    
    @RequestMapping(method = POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Product submit(Product product) {
        return product;
    }
    
}