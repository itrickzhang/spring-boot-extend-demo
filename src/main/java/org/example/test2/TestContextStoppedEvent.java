package org.example.test2;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author zhangcb
 * @ClassName TestContextStartedEvent.java
 * @Description TODO
 * @createTime 2020年06月01日 20:38:00
 */
//@Configuration
public class TestContextStoppedEvent implements ApplicationListener<ContextStoppedEvent> {
    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("************TestContextStoppedEvent***************");
    }
}
