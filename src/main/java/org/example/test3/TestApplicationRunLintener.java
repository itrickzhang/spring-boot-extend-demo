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
public class TestApplicationRunLintener implements SpringApplicationRunListener {


    public TestApplicationRunLintener(SpringApplication application,String [] args){
        System.out.println("///////////TestApplicationRunLintener   constructor");
    }
    @Override
    public void starting() {
        System.out.println("///////////TestApplicationRunLintener starting");
    }
    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("///////////TestApplicationRunLintener environmentPrepared");
    }
    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("///////////TestApplicationRunLintener contextPrepared");
    }
    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("///////////TestApplicationRunLintener contextLoaded");
    }
    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("///////////TestApplicationRunLintener started");
    }
    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("///////////TestApplicationRunLintener running");
    }
    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("///////////TestApplicationRunLintener failed");
    }
}
