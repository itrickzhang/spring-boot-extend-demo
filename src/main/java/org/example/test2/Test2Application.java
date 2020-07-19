package org.example.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangcb
 * @ClassName Test2Application.java
 * @Description TODO
 * @createTime 2020年07月08日 07:32:00
 */
@SpringBootApplication(scanBasePackages = {"org.example.test2"})
public class Test2Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Test2Application.class);
        springApplication.addListeners(new TestContextClosedEvent());
        springApplication.addListeners(new TestContextRefreshedEvent());
        springApplication.addListeners(new TestContextStartedEvent());
        springApplication.addListeners(new TestContextStoppedEvent());
        springApplication.addListeners(new TestRequestHandledEvent());
        springApplication.run(args);
    }

}
