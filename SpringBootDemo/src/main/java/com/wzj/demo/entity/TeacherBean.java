package com.wzj.demo.entity;

/**
 * Created by wzj on 2018/3/17.
 */
public class TeacherBean
{
    private String tec_id;

    private String tec_name;

    private int tec_age;

    private String tec_desc;


    public String getTec_id()
    {
        return tec_id;
    }

    public void setTec_id(String tec_id)
    {
        this.tec_id = tec_id;
    }

    public String getTec_name()
    {
        return tec_name;
    }

    public void setTec_name(String tec_name)
    {
        this.tec_name = tec_name;
    }

    public int getTec_age()
    {
        return tec_age;
    }

    public void setTec_age(int tec_age)
    {
        this.tec_age = tec_age;
    }

    public String getTec_desc()
    {
        return tec_desc;
    }

    public void setTec_desc(String tec_desc)
    {
        this.tec_desc = tec_desc;
    }

    @Override
    public String toString()
    {
        return "TeacherBean{" + "tec_id='" + tec_id + '\'' + ", tec_name='" + tec_name + '\'' + ", tec_age=" + tec_age + ", tec_desc='" + tec_desc + '\'' + '}';
    }
}
