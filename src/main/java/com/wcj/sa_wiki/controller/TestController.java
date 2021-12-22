package com.wcj.sa_wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 翁丞健
 * @Date 2021/12/22 14:12
 * @Version 1.0.0
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }

    @PostMapping("/hellopost")
    public String Hellopost(String  name,String password){
        return "hello,post"+ name + password;
    }
}
