package com.wcj.sa_wiki.controller;

import com.wcj.sa_wiki.entity.Ebook;
import com.wcj.sa_wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author 翁丞健
 * @Date 2021/12/22 14:12
 * @Version 1.0.0
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {
    

    @Autowired
    private EbookService ebookService;

    @GetMapping("/list")
    public List<Ebook> list(){
        return ebookService.list();
    }
}
