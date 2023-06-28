package com.example.demo01;

import com.example.demo01.model.ITest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class Demo01ApplicationTests {
    @Autowired
    Map<String, ITest> testMap;

    @Test
    void contextLoads() {
    }

    @Test
    void testMapAutowired() {
        ITest test1 = testMap.get("test1");
        System.out.println(test1.hello());
        ITest test2 = testMap.get("test2");
        System.out.println(test2.hello());
        ITest test3 = testMap.get("test3");
        System.out.println(test3.hello());
    }
}