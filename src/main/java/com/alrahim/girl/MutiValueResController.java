package com.alrahim.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RestController==@Controller+@ResponseBody
@EnableAutoConfiguration
@RequestMapping("/about")
// add prefix to hole class
public class MutiValueResController {
    @Autowired
    private GirlProties girlProties;
    // 配置url映射
    @RequestMapping(value = {"/gir","/boy"}, method = RequestMethod.GET)
    public String say(){
        return girlProties.getName() + "gir|boy";
    }
}
