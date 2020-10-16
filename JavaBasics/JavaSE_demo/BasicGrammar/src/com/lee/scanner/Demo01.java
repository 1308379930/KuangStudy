package com.lee.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        if(s.hasNext()){
            String str = s.next();
            System.out.println(str);
        }
        //凡是属于IO流的类，如果使用完不关闭会一直占用资源
        int i = 0;
        float f = 0.0F;

        if(s.hasNextInt()){
            i = s.nextInt();
            System.out.println(i);
        }

        s.close();
    }
}
