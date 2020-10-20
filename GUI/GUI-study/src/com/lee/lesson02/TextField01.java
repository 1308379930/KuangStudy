package com.lee.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField01 {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

    }
}

class MyFrame extends Frame{
    public MyFrame(){
        //new TextArea();//多行文本
        TextField textField = new TextField();//单行文本
        add(textField);

        //监听这个文本框输入的文字
        MyActionListener myActionListener = new MyActionListener();
        //按下Enter 触发输入框的事件
        textField.addActionListener(myActionListener);
        //设置替换编码
        textField.setEchoChar('*');

        pack();
        setVisible(true);

    }

    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //获得一些资源，返回的一个对象Object 监听谁就转为谁
            TextField field = (TextField) e.getSource();
            System.out.println(field.getText());//  获得输入框中的文本
            field.setText("");//Enter后清空输入框
        }
    }

}
