package com.nii.cloud.dao.impl;

import com.nii.cloud.bean.TeacherBean;
import com.nii.cloud.dao.TeacherDao;
import com.nii.cloud.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by wzj on 2018/4/15.
 */
@Component
public class TeacherDaoImpl implements TeacherDao
{
    /**
     * 注入服务
     */
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public TeacherBean getTeacherById(String id)
    {
        return teacherMapper.getTeacherById(id);
    }
}
