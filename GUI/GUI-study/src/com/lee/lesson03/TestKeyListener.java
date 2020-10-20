package com.lee.lesson03;

import javafx.scene.input.KeyCode;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}
class  KeyFrame extends Frame{
    public KeyFrame(){

        setBounds(1,1,200,200);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            //键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                //获得按下的键是哪一个,当前的码
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                //可以根据不同的操作，产生不同的结果
                if(keyCode == KeyEvent.VK_ENTER){
                    System.out.println("Enter");
                }
            }
        });
    }
}
