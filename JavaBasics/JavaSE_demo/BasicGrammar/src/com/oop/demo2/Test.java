package com.oop.demo2;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student();
        Person s2 = new Student();

        s1.run();//两个类型都有run方法且子类重写，执行子类的
        s2.run();

        s1.eat();//eat方法是子类独有的，父类无法调用
        //s2.eat();//报错
    }
}
