package com.nii.cloud.bean;

/**
 * Created by wzj on 2018/4/15.
 */
public class TeacherBean
{
    /**
     * 主键id
     */
    private String tecId;

    /**
     * 老师名字
     */
    private String tecName;

    /**
     * 老师名字
     */
    private int tecAge;

    /**
     * 老师描述
     */
    private String tecDesc;

    public String getTecId()
    {
        return tecId;
    }

    public void setTecId(String tecId)
    {
        this.tecId = tecId;
    }

    public String getTecName()
    {
        return tecName;
    }

    public void setTecName(String tecName)
    {
        this.tecName = tecName;
    }

    public int getTecAge()
    {
        return tecAge;
    }

    public void setTecAge(int tecAge)
    {
        this.tecAge = tecAge;
    }

    public String getTecDesc()
    {
        return tecDesc;
    }

    public void setTecDesc(String tecDesc)
    {
        this.tecDesc = tecDesc;
    }
}
