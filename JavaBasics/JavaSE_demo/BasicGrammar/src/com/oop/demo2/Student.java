package com.oop.demo2;

public class Student extends Person{
    public void eat(){
        System.out.println("eat");
    }

    @Override
    public void run() {
        System.out.println("sonRun");;
    }
}
