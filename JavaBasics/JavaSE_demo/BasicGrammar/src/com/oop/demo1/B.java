package com.oop.demo1;

public class B extends A{
    public static void test_static(){
        System.out.println("B=>test_static");
    }

    @Override
    public void test(){
        System.out.println("B=>test");
    }
}
