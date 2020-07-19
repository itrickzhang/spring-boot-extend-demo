package org.example.test2;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextClosedEvent;

/**
 * @author zhangcb
 * @ClassName TestContextStartedEvent.java
 * @Description TODO
 * @createTime 2020年06月01日 20:38:00
 */
//@Configuration
public class TestContextClosedEvent implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("************TestContextClosedEvent***************");
    }

}
