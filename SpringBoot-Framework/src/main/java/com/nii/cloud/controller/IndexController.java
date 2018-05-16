package com.nii.cloud.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wzj on 2018/4/14.
 */

@RestController
public class IndexController
{
    /**
     * 主页
     * @param modelAndView  modelAndView
     * @return 主页地址
     */
    @RequestMapping(value = "/index")
    public ModelAndView index(ModelAndView modelAndView)
    {
        //返回index.jsp页面
        modelAndView.setViewName("index");

        return modelAndView;
    }

    /**
     * websocket测试页面
     * @param modelAndView modelAndView
     * @return modelAndView页面
     */
    @RequestMapping(value = "/websocket")
    public ModelAndView webSocket(ModelAndView modelAndView)
    {
        modelAndView.setViewName("websocket");

        return modelAndView;
    }

    /**
     * 测试welcome
     * @return 字符串
     */
    @RequestMapping("/welcome")
    public String welcome()
    {
        return "Welcome";
    }
}
