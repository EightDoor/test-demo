package com.example.demo01.model;

import org.springframework.stereotype.Component;

@Component("test3")
public class Test3 implements  ITest {
    @Override
    public String hello() {
        return "test3";
    }
}