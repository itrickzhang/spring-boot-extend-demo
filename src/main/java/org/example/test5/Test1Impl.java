package org.example.test5;

import org.springframework.context.annotation.Configuration;

/**
 * @author zhangcb
 * @ClassName Test1Impl.java
 * @Description TODO
 * @createTime 2020年07月18日 12:37:00
 */

public class Test1Impl implements TestInteface
{
    @Override
    public void print() {
        System.out.println("Test1Impl");
    }
}
