package com.wzj.demo.controller;

import com.wzj.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wzj on 2018/3/18.
 */
@RestController
public class TeacherController
{
    /**
     * 注入服务
     */
    @Autowired
    private TeacherService teacherService;

    /**
     * 查询老师信息
     * @param id id
     * @return 信息
     */
    @RequestMapping(value = "/teacher")
    public String getTeacherMessage(String id)
    {
        return teacherService.queryTeacher(id).toString();
    }
}
