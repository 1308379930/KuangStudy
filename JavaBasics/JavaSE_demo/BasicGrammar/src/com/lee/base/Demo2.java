package com.lee.base;

public class Demo2 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i; //内存溢出 byte -128~127

        //强制类型转换
        System.out.println(i);
        System.out.println(b);
    }
}
