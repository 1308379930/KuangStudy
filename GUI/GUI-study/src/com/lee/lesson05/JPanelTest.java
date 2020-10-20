package com.lee.lesson05;

import javax.swing.*;
import java.awt.*;

public class JPanelTest extends JFrame {
    public JPanelTest() throws HeadlessException {
        Container container = this.getContentPane();
        //后面参数 间距
        container.setLayout(new GridLayout(2,1,10,10));
        JPanel panel1 = new JPanel(new GridLayout(1,3));
        JPanel panel2 = new JPanel(new GridLayout(1,3));
        JPanel panel3 = new JPanel(new GridLayout(1,3));
        JPanel panel4 = new JPanel(new GridLayout(1,3));

        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));
        panel1.add(new JButton("1"));
        panel2.add(new JButton("1"));
        panel2.add(new JButton("1"));
        panel2.add(new JButton("1"));
        panel3.add(new JButton("1"));
        panel3.add(new JButton("1"));
        panel3.add(new JButton("1"));
        panel4.add(new JButton("1"));
        panel4.add(new JButton("1"));
        panel4.add(new JButton("1"));

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);
    }

    public static void main(String[] args) {
        new JPanelTest();
    }
}
