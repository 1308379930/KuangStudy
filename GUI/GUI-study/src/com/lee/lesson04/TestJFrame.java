package com.lee.lesson04;

import javax.swing.*;
import java.awt.*;

public class TestJFrame {
    public void init(){
        //JFrame是一个顶级窗口
        JFrame jFrame = new JFrame("这是一个JFrame窗口");
        jFrame.setVisible(true);
        jFrame.setBounds(100,100,200,200);
        //直接设置没有颜色，需要一个容器
        //jFrame.setBackground(Color.CYAN);
        //设置文字
        JLabel label = new JLabel("欢迎来到英雄联盟",SwingConstants.CENTER);
        //让文本标签居中，设置水平对齐,上面已经做过了
        //label.setHorizontalAlignment(SwingConstants.CENTER);
        jFrame.add(label);
        //容器实例化
        jFrame.getContentPane().setBackground(Color.CYAN);
        //关闭事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        //建立一个窗口
        new TestJFrame().init();
    }
}
