package com.example.project01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lishuai
 * @date 2022/6/20
 */


@RestController
@RequestMapping("/index")
public class hellocontroller {

    @RequestMapping("/one")
    public String sayhello(){
        return "hello";
    }
}
