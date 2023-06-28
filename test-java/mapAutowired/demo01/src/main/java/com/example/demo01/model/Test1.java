package com.example.demo01.model;

import org.springframework.stereotype.Component;

@Component("test1")
public class Test1 implements  ITest {
    @Override
    public String hello() {
        return "test1";
    }
}