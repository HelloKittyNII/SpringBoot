package com.nii.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  //开启定时任务注解
@MapperScan("com.nii.cloud.mapper")
public class FrameworkApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(FrameworkApplication.class, args);
    }

}
