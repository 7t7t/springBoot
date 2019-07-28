package com.alrahim.girl.controller;

import com.alrahim.girl.databse.Girl;

import com.alrahim.girl.api.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    /**
     * query list
     *
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    /**
     * add || update to database
     */

    @PostMapping(value = "/girls/add")
    public Girl girlAdd(@RequestParam(name="id", required=false, defaultValue="0") Integer id,
                        @RequestParam("name") String name,
                        @RequestParam("age") Integer age,
                        @RequestParam("tel") Integer tel) {
        Girl girl = new Girl();
        girl.setId(id);
        girl.setName(name);
        girl.setAge(age);
        girl.setTel(tel);

        return girlRepository.save(girl);
    }

    /**
     * findOne
     */

//    @GetMapping(value = "/girls/find/${id}")
//    public List findOne(@PathVariable("id") Integer id) {
//        return girlRepository.findOne(id);
//    }


    /**
     * delete
     */
//    @DeleteMapping(value = "/girls/del/${id}")
//    public String delGirl(@PathVariable("id") Integer id){
//        girlRepository.delete(id);
//        return "redirect:/girls";
//    }

    /**
     * findByAge
     */

    @GetMapping(value = "/girls/age/${age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }
}
