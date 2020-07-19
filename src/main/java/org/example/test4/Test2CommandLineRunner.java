package org.example.test4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhangcb
 * @ClassName TestRunner.java
 * @Description TODO
 * @createTime 2020年06月02日 07:39:00
 */
@Order(2)
@Component
public class Test2CommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=================Test2CommandLineRunner======run");
    }
}
