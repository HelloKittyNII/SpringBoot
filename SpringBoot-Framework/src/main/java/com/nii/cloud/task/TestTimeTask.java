package com.nii.cloud.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 定时任务
 * Created by wzj on 2018/4/14.
 */
@Component
public class TestTimeTask
{
    /**
     * 首次延时1s，然后每200秒执行一次
     *
     *  @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
        @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
        @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
        也可以通过cron表达式
     */
    @Scheduled(initialDelay = 1000,fixedRate = 200000)
    public void logTask()
    {
        System.out.println("logTaskTag:" + new Date());
    }
}
