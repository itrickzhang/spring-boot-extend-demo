package org.example.test1;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * @author zhangcb
 * @ClassName MyApplicationContextInitializer.java
 * @Description TODO
 * @createTime 2020年07月09日 07:28:00
 */
@Order(2)
public class SecondApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("实现SecondApplicationContextInitializer");
    }
}
