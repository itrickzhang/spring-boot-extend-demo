package org.example.test5;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.util.ClassUtils;

import java.util.List;

/**
 * @author zhangcb
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年07月18日 12:38:00
 */
public class Test {
    public static void main(String[] args) {
        List<TestInteface> testIntefaces = SpringFactoriesLoader.loadFactories(TestInteface.class, ClassUtils.getDefaultClassLoader());
        testIntefaces.forEach(test->{
            test.print();
        });
    }
}
