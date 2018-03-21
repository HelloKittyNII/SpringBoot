package com.wzj.demo.entity;

/**
 * Created by wzj on 2018/3/17.
 */
public class TeacherBean
{
    private String tecId;

    private String tecName;

    private int tecAge;

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

    @Override
    public String toString()
    {
        return "TeacherBean{" + "tecId='" + tecId + '\'' + ", tecName='" + tecName + '\'' + ", tecAge=" + tecAge + ", tecDesc='" + tecDesc + '\'' + '}';
    }
}
