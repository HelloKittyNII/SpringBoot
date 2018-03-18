package com.wzj.demo.mapper;

import com.wzj.demo.entity.TeacherBean;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wzj on 2018/3/18.
 */
public interface TeacherMapper
{
    /**
     * 通过id查询老师信息
     * @param id id
     * @return teacher信息
     */
    TeacherBean getTeacherById(@Param("id") String id);
}
