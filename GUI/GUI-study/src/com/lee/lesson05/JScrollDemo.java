package com.lee.lesson05;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {

    public JScrollDemo() throws HeadlessException {
        Container container = this.getContentPane();

        //文本域
        JTextArea area = new JTextArea(20, 50);
        area.setText("welcome");

        //scroll面板
        JScrollPane scrollPane = new JScrollPane(area);
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,300,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
