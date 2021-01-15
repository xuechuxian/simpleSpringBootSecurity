package com.wyy.simplespringboot.controller;

import com.wyy.simplespringboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping("index")
    public String index(){
        return "Hello SpringBoot!";
    }

    /**
     * 数据库查询测试，需正确配置数据库及修改mapper
     * @return
     */
    @RequestMapping("select")
    public Integer select(){
        return testService.testselect();
    }
}
