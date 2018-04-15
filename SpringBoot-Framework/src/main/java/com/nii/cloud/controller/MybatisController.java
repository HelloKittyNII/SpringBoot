package com.nii.cloud.controller;

import com.nii.cloud.bean.TeacherBean;
import com.nii.cloud.service.TeacherService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wzj on 2018/4/15.
 */
@RestController
public class MybatisController
{
    /**
     * 注入
     */
    @Autowired
    private TeacherService teacherService;

    /**
     *
     * @param id id
     * @return 信息
     */
    @RequestMapping(value = "/mybatis")
    public String mybatis(String id)
    {
        if (StringUtils.isEmpty(id))
        {
            return "Id is null";
        }

        TeacherBean teacherBean = teacherService.queryTeacher(id);
        if (teacherBean == null)
        {
            return "Id is incorrect";
        }
        return teacherBean.toString();
    }
}
