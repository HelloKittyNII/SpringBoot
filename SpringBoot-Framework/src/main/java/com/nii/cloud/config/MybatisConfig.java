package com.nii.cloud.config;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by wzj on 2018/4/15.
 */
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class MybatisConfig
{
    /**
     * url
     */
    private String url;

    /**
     * 驱动名称
     */
    private String driverClassName;

    /**
     * 数据库名
     */
    private String username;

    /**
     * 数据库密码
     */
    private String password;

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getDriverClassName()
    {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName)
    {
        this.driverClassName = driverClassName;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "MybatisConfig{" + "url='" + url + '\'' + ", driverClassName='" + driverClassName + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + '}';
    }

    @Bean
    public PageHelper pageHelper()
    {
        System.out.println("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
