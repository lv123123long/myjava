package com.test;

public interface A {
    public default void test(){
        System.out.println("我是接口的实现");
    }
}
