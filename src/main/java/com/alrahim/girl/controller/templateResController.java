package com.alrahim.girl.controller;

import com.alrahim.girl.GirlProties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@EnableAutoConfiguration

public class templateResController {
    @Autowired
    private GirlProties girlProties; // error here because have no @Component or not yet add dependency

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String say() {
       return "index";
    }
}

