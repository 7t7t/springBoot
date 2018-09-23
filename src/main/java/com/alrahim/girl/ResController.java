package com.alrahim.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@EnableAutoConfiguration

public class ResController {
    @Autowired
    private GirlProties girlProties; // error here because have no @Component or not yet add dependency

    @Value("${name}")
    private String name;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        return "Hello SpringBoot!" + name + girlProties.getName();
//        return "Hello SpringBoot!" + name;
    }
}

