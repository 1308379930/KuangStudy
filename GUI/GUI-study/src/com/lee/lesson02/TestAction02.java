package com.lee.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestAction02 {
    public static void main(String[] args) {
        //两个按钮实现同一个监听
        //开始    结束
        Frame frame = new Frame();

        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        //可以显示地定义触发返回的命令
        //设置行为命令前button2参数为stop，设置后变更
        button2.setActionCommand("button-2-stop");
        MyMonitor myMonitor = new MyMonitor();

        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

    }
}
class MyMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {

        //System.out.println("按钮被点击了：msg=> "+e.getActionCommand());
        if(e.getActionCommand().equals("start")){
            System.out.println("开始");
        }else{
            System.out.println("停止");
        }
    }
}