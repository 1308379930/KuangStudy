package com.lee.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//主窗口
public class DialogDemo extends JFrame {

    public DialogDemo(){
        super("title");
        this.setVisible(true);
        this.setSize(700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JFrame放东西需要一个容器
        Container contentPane = getContentPane();
        //绝对布局,自己去决定放在什么位置
        contentPane.setLayout(null);
        //按钮
        JButton button = new JButton("欢迎来到王者荣耀");//创建
        button.setBounds(30,30,200,50);

        contentPane.add(button);
        //点击这个按钮的时候弹出一个弹窗
        button.addActionListener(new ActionListener() {//匿名内部类 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹窗
                MyDialog myDialog = new MyDialog();
                myDialog.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new DialogDemo();
    }
}

//弹出的窗口
class MyDialog extends JDialog{
    public MyDialog() {
        this.setTitle("Dialog");
        this.setBounds(100,100,500,500);
        //无需，默认可关
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(new JButton("敌军还有30秒到达战场"));
        //还是不能显示，不知为何
        this.setVisible(true);
    }
}