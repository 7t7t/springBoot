package com.alrahim.girl;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

/**
 * two ways to get Params
 * add default value
 * or use GetMapping
 * or use PostMapping
 */

@RestController
@RequestMapping("/about")
public class PathVariableController {
//    @RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
    @RequestMapping(value = "/say", method = RequestMethod.GET)
//    public String say(@PathVariable("id") Integer id){
//    @GetMapping(value = "id")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id){
        return ("id:" + id);
    }
}
