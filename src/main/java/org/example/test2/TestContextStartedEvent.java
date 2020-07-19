package org.example.test2;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author zhangcb
 * @ClassName TestContextStartedEvent.java
 * @Description TODO
 * @createTime 2020年06月01日 20:38:00
 */
//@Configuration
public class TestContextStartedEvent  implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("************TestContextStartedEvent***************");
    }
}
