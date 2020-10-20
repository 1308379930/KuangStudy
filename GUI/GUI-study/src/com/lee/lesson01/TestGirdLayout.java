package com.lee.lesson01;

import java.awt.*;

public class TestGirdLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");

        frame.setLayout(new GridLayout(3,2));

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        frame.pack(); // Java方法，自动选择最优布局 也无需设计大小
        //frame.setSize(200,200);
        frame.setVisible(true);

    }
}
