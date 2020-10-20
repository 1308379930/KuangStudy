package com.lee.lesson01;

import java.awt.*;

//GUI的第一个界面
public class TestFrame {
    public static void main(String[] args) {
        //使用时要学会点进去看源码
        Frame frame = new Frame("我的第一个Java图像界面");

        //需要设置可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400,400);

        //设置背景颜色
        //new Color(1,1,1);//自定义颜色
        frame.setBackground(Color.BLACK);

        //弹出的初始位置，（0，0）在左上角
        frame.setLocation(200,200);

        //设置大小固定
        frame.setResizable(false);

    }
}
