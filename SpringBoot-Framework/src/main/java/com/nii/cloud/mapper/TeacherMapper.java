package com.nii.cloud.mapper;

import com.nii.cloud.bean.TeacherBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created by wzj on 2018/4/15.
 */
@Component
public interface TeacherMapper
{
    /**
     * 通过id查询老师信息
     * @param id id
     * @return teacher信息
     */
    TeacherBean getTeacherById(@Param("id") String id);
}
