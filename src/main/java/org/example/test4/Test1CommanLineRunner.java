package org.example.test4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhangcb
 * @ClassName Test1Runner.java
 * @Description TODO
 * @createTime 2020年06月02日 07:39:00
 */
@Order(1)
@Component
public class Test1CommanLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=================Test1CommanLineRunner======run");
    }
}

