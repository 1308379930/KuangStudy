package com.lee.lesson05;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo3 extends JFrame {
    public JButtonDemo3() throws HeadlessException {
        Container container = this.getContentPane();

        JCheckBox jCheckBox1 = new JCheckBox("jCheckBox1");
        JCheckBox jCheckBox2 = new JCheckBox("jCheckBox2");

        container.add(jCheckBox1,BorderLayout.SOUTH);
        container.add(jCheckBox2,BorderLayout.NORTH);

        this.setSize(500,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonDemo3();
    }
}
