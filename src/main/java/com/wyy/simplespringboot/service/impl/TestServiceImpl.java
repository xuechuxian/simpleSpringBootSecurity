package com.wyy.simplespringboot.service.impl;

import com.wyy.simplespringboot.mapper.TestMapper;
import com.wyy.simplespringboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;

    @Override
    public Integer testselect() {
        Integer num = testMapper.testselect();
        return num;
    }
}
