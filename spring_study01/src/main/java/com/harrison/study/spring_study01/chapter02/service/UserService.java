package com.harrison.study.spring_study01.chapter02.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserService(){
        System.out.println("加载到UserService类");
    }
}
