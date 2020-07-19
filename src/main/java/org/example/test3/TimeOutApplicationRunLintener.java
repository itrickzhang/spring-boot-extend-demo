package org.example.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author zhangcb
 * @ClassName TestApplicationRunLintener.java
 * @Description TODO
 * @createTime 2020年06月02日 06:51:00
 */
public class TimeOutApplicationRunLintener implements SpringApplicationRunListener {

    private long beginTime;

    public TimeOutApplicationRunLintener(SpringApplication application, String [] args){
        beginTime = System.currentTimeMillis();
        System.out.println("初始化时间:"+beginTime);
    }
    @Override
    public void starting() {
        long current = System.currentTimeMillis();
        System.out.println("耗时："+(current-beginTime));
    }
    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        long current = System.currentTimeMillis();
        System.out.println("耗时："+(current-beginTime));
    }
    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        long current = System.currentTimeMillis();
        System.out.println("耗时："+(current-beginTime));
    }
    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        long current = System.currentTimeMillis();
        System.out.println("耗时："+(current-beginTime));
    }
    @Override
    public void started(ConfigurableApplicationContext context) {
        long current = System.currentTimeMillis();
        System.out.println("耗时："+(current-beginTime));
    }
    @Override
    public void running(ConfigurableApplicationContext context) {
        long current = System.currentTimeMillis();
        System.out.println("耗时："+(current-beginTime));
    }
    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        long current = System.currentTimeMillis();
        System.out.println("耗时："+(current-beginTime));
    }
}
