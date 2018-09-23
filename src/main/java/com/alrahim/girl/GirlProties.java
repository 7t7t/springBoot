package com.alrahim.girl;

import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

//@PropertySource("application.yml")
@ConfigurationProperties(prefix = "girl")
@Component
public class GirlProties {
    private String name;
    private Integer age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Integer getAge(){
        return age;
    }
    public  void setAge(Integer age){
        this.age = age;
    }
}


