package com.harrison.study.spring_study01.controller;

import com.harrison.study.spring_study01.bean.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Constant constant;

    @Autowired
    public void setConstant(Constant constant) {
        this.constant = constant;
    }

    @GetMapping("/hello")
    public Constant hello(){
        return constant;
    }
}
