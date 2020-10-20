package com.lee.lesson06;

import javax.swing.*;
import java.awt.*;

public class TextDemo extends JFrame {
    public TextDemo() throws HeadlessException {
        Container contentPane = this.getContentPane();

        JTextField jTextField1 = new JTextField("hello",20);
        JTextField jTextField2 = new JTextField("world",20);

        contentPane.add(jTextField1,BorderLayout.NORTH);
        contentPane.add(jTextField2,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextDemo();
    }
}
