package com.example.demo01.model;

import org.springframework.stereotype.Component;

@Component("test2")
public class Test2 implements  ITest {
    @Override
    public String hello() {
        return "test2";
    }
}