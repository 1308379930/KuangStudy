package com.lee.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//简易计算器
public class Calculator {
    public static void main(String[] args) {
        new Calc().loadFrame();
    }
}
//计算器类
class Calc extends Frame{
    //属性
    TextField textField1,textField2,textField3;
    //方法
    public void loadFrame(){
        //三个文本框
        textField1 = new TextField(10);//最多写多少字符
        textField2 = new TextField(10);
        textField3 = new TextField(20);//比前两个长
        //一个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener());
        //一个标签 展示+
        Label label = new Label("+");
        //布局 流式
        setLayout(new FlowLayout());

        add(textField1);
        add(label);
        add(textField2);
        add(button);
        add(textField3);

        pack();
        setVisible(true);
    }

    //内部类最大的好处就是可以畅通无阻地访问外部类的属性和方法
    private class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //获得加数和被加数
            int i1 = Integer.parseInt(textField1.getText());
            int i2 = Integer.parseInt(textField2.getText());
            //相加后，放到第三个框
            textField3.setText(""+(i1+i2));
            //清除前两个框
            textField1.setText("");
            textField2.setText("");
        }
    }
}