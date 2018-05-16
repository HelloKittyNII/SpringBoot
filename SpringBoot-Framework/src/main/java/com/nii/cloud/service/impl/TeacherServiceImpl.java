package com.nii.cloud.service.impl;

import com.nii.cloud.bean.TeacherBean;
import com.nii.cloud.dao.TeacherDao;
import com.nii.cloud.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzj on 2018/4/15.
 */
@Service
public class TeacherServiceImpl implements TeacherService
{
    /**
     * 注入
     */
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public TeacherBean queryTeacher(String id)
    {


        return teacherDao.getTeacherById(id);
    }



}
