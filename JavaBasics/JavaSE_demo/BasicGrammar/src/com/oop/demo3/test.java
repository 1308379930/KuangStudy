package com.oop.demo3;

public class test {
    {
        System.out.println("匿名代码块");
    }

    static{
        System.out.println("静态代码块");
    }

    public test(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        test a = new test();
        System.out.println("=========");
        test b = new test();

    }
}
