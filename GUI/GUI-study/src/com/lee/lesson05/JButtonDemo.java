package com.lee.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtonDemo extends JFrame {
    public JButtonDemo() throws HeadlessException {
        Container container = this.getContentPane();
        //将一个图片变成图标
        URL url = JButtonDemo.class.getResource("1.jpeg");
        Icon icon = new ImageIcon(url);
        //将图片放在按钮上
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");

        container.add(button);

        this.setSize(500,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemo();
    }
}
