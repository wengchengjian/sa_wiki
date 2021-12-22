package com.wcj.sa_wiki.service.impl;

import com.wcj.sa_wiki.entity.Ebook;
import com.wcj.sa_wiki.mapper.EbookMapper;
import com.wcj.sa_wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 翁丞健
 * @Date 2021/12/22 15:48
 * @Version 1.0.0
 */
@Service
public class EbookServiceImpl implements EbookService {
    @Autowired
    private EbookMapper ebookMapper;

    @Override
    public List<Ebook> list(){
        return ebookMapper.list();
    }
}
