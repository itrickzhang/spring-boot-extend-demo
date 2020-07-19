package org.example.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangcb
 * @ClassName Test1Application.java
 * @Description TODO
 * @createTime 2020年07月08日 07:32:00
 */
@SpringBootApplication(scanBasePackages = {"org.example.test1"})
public class Test1Application{
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Test1Application.class);
        springApplication.addInitializers(new FirstApplicationContextInitializer());
        springApplication.addInitializers(new SecondApplicationContextInitializer());
        springApplication.run(args);
    }
}
