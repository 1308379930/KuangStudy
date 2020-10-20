package com.lee.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}
class WindowFrame extends Frame{
    public WindowFrame(){
        setBackground(Color.BLUE);
        setBounds(100,100,200,200);
        setVisible(true);
        this.addWindowListener(
                //匿名内部类
                new WindowAdapter() {
                    //其中的关闭窗口激活窗口较为常用
                    @Override
                    public void windowOpened(WindowEvent e) {
                        System.out.println("windowOpened");
                    }

                    @Override
                    public void windowClosed(WindowEvent e) {
                        System.out.println("windowClosed");
                    }

                    @Override
                    public void windowActivated(WindowEvent e) {
                        System.out.println("windowActivated");
                    }

                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.out.println("关闭");
                        System.exit(0);
            }
        });
    }
}