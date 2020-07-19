package org.example.test2;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.RequestHandledEvent;

/**
 * @author zhangcb
 * @ClassName TestContextStartedEvent.java
 * @Description TODO
 * @createTime 2020年06月01日 20:38:00
 */
//@Configuration
public class TestRequestHandledEvent implements ApplicationListener<RequestHandledEvent> {
    @Override
    public void onApplicationEvent(RequestHandledEvent event) {
        System.out.println("************TestRequestHandledEvent***************");
    }
}
