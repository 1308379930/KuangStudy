package com.lee.base;

public class Demo {
    public static void main(String[] args) {
        int i = 0b1;
        int i2 = 2;
        int i3 = 010;
        int i4 = 0x10;

        System.out.println(i );
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        System.out.println("=================================");
        //银行面试题  业务里的钱怎么表示？
        //使用BigDecimal 数学工具类
        //浮点数拓展
        float f = 0.1F;   //0.1
        double d = 0.1;//0.1

        System.out.println(f==d); //false
        System.out.println(f);    //0.1
        System.out.println(f);    //0.1

        float f1 = 2323232323232323F;
        float f2 = f1 + 1;
        System.out.println(f1==f2); //true

        System.out.println("=================================");
        //字符拓展
        char A = 'a';
        char B = '中';
        System.out.println(A);
        System.out.println((int)A);
        System.out.println(B);
        System.out.println((int)B);

        System.out.println("=================================");
        //类
        String sa = new String("hello world");
        String sb = new String("hello world");

        String sc = "hello world";
        String sd = "hello world";

        System.out.println(sa == sb);
        System.out.println(sc == sd);
    }
}
