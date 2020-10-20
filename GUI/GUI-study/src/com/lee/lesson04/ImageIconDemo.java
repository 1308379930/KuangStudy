package com.lee.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {
    public ImageIconDemo() throws HeadlessException {
        JLabel label = new JLabel("ImageIcon");
        //获取图片的地址
        //通过类来获取类路径当前目录下的资源
        URL url = ImageIconDemo.class.getResource("1.jpeg");//找的是src下的

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,200,200);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}