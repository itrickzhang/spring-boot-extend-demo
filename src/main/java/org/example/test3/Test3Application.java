package org.example.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangcb
 * @ClassName TestApplication.java
 * @Description TODO
 * @createTime 2020年05月31日 10:59:00
 */
@SpringBootApplication(scanBasePackages = {"org.example.test3"})
public class Test3Application {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Test3Application.class);
        springApplication.run(args);
    }

}
