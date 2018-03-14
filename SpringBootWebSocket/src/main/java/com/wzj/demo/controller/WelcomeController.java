package com.wzj.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wzj on 2018/3/14.
 */
@RestController
public class WelcomeController
{
    /**
     * 首页
     * @return 测试
     */
    @RequestMapping(value = "/index")
    @ResponseBody
    public String welcome()
    {
        return "Hello World";
    }
}
