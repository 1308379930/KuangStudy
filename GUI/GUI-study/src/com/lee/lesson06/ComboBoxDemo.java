package com.lee.lesson06;

import javax.swing.*;
import java.awt.*;

public class ComboBoxDemo extends JFrame {
    public ComboBoxDemo() throws HeadlessException {
        Container contentPane = this.getContentPane();

        JComboBox comboBox = new JComboBox();

        comboBox.addItem(null);
        comboBox.addItem("正在热映");
        comboBox.addItem("下架");
        comboBox.addItem("即将上映");

        contentPane.add(comboBox);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}
