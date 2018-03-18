package com.wzj.demo.service;

import com.wzj.demo.entity.TeacherBean;
import com.wzj.demo.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wzj on 2018/3/18.
 */
@Service
public class TeacherService
{
    /**
     * 注入服务
     */
    @Autowired
    private TeacherMapper teacherMapper;

    public TeacherBean queryTeacher(String id)
    {
        return teacherMapper.getTeacherById(id);
    }
}
