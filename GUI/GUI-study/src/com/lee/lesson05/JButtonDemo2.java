package com.lee.lesson05;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo2 extends JFrame {
    public JButtonDemo2() throws HeadlessException {
        Container container = this.getContentPane();

        //单选框，三个不能同时选择
        JRadioButton jRadioButton1 = new JRadioButton("01");
        JRadioButton jRadioButton2 = new JRadioButton("02");
        JRadioButton jRadioButton3 = new JRadioButton("03");

        //分组，组里只能选一个，三个选一个
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);

        container.add(jRadioButton1,BorderLayout.CENTER);
        container.add(jRadioButton2,BorderLayout.NORTH);
        container.add(jRadioButton3,BorderLayout.SOUTH);

        this.setSize(500,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemo2();
    }
}
