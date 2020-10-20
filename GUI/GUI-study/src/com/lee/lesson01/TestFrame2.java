package com.lee.lesson01;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {

        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.BLUE);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.CYAN);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.GREEN);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.ORANGE);


    }


}

class MyFrame extends Frame{
    //可能存在多个窗口，我们需要一个计数器
    static int count = 0;

    public MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame"+(++count));

        setBounds(x, y, w, h);
        setVisible(true);
        setBackground(color);
    }
}
