package com.wcj.sa_wiki.service.impl;

import com.wcj.sa_wiki.entity.Test;
import com.wcj.sa_wiki.mapper.TestMapper;
import com.wcj.sa_wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 翁丞健
 * @Date 2021/12/22 15:48
 * @Version 1.0.0
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> list(){
        return testMapper.list();
    }
}
