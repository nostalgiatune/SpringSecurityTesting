package com.tuoppi.boot.controller;

import com.tuoppi.boot.model.BindingTester;
import com.tuoppi.boot.service.ProductService;
import com.tuoppi.boot.service.ProductStorageService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Tuoppi
 */
@Controller
@RequestMapping("/")
public class TestController {
    
    @ModelAttribute("bindingtester")
    public BindingTester dummy() {
        return new BindingTester();
    }
    
    @Autowired
    private ProductService productService;
    
    @Autowired
    private ProductStorageService storageService;
    
    @RequestMapping(method = GET)
    public String test() {
        //productService.init();
        return "test";
    }
    
    @RequestMapping(method = POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody BindingTester bind(@Valid BindingTester dummy,
            Errors errors) {
        if (errors.hasErrors())
            return null;
        else
            return dummy;
    }
    
//    @RequestMapping(method = POST,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody Product submit(Product product) {
//        return product;
//    }
    
}