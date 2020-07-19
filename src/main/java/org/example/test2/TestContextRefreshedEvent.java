package org.example.test2;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author zhangcb
 * @ClassName TestContextRefreshedEvent.java
 * @Description TODO
 * @createTime 2020年06月01日 20:36:00
 */
//@Configuration
public class TestContextRefreshedEvent implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("************TestContextRefreshedEvent***************");
    }
}
