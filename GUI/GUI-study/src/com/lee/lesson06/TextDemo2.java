package com.lee.lesson06;

import javax.swing.*;
import java.awt.*;

public class TextDemo2 extends JFrame{
    public TextDemo2() throws HeadlessException {
        Container contentPane = this.getContentPane();

        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setEchoChar('*');
        contentPane.add(jPasswordField);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextDemo2();
    }
}
