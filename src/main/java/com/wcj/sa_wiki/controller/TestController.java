package com.wcj.sa_wiki.controller;

import com.wcj.sa_wiki.entity.Test;
import com.wcj.sa_wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 翁丞健
 * @Date 2021/12/22 14:12
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${hello.world:Test}")
    private String hello;

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public String Hello(){
        return hello + "145687";
    }

    @PostMapping("/hellopost")
    public String Hellopost(String  name,String password){
        return "hello,post"+ name + password;
    }

    @GetMapping("/list")
    public List<Test> list(){
        return testService.list();
    }
}
