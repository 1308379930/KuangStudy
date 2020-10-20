package com.lee.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Panel可以看出是一个空间，但不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //布局的概念
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(96, 255, 29, 255));

        //Panel设置坐标，相对于frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(0, 82, 255));

        //放进frame
        frame.add(panel);
        frame.setVisible(true);

        //监听事件，监听窗口关闭事件 System.exit(0);
        //适配器模式 不去new WindowListener 实现太全部的接口
        //而是去继承它的一个子类，子类有默认的实现，我们只写我们需要的那个功能

        //这是AWT的解决方式，后面还有swing的解决方式
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭的时候需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
            }
        });

    }
}
