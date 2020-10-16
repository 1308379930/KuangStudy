package com.lee.struct;

public class Lable {
    public static void main(String[] args) {

        //输出101 到 150 之间的所有素数
        outer: for (int i =101;i<150;i++){
            for (int j=2;j<i/2;j++){
                if(i%j==0)
                    continue outer;
            }
            System.out.println(i + " ");
        }
    }
}
