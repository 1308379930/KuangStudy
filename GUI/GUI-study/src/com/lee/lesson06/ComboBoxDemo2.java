package com.lee.lesson06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class ComboBoxDemo2 extends JFrame {
    public ComboBoxDemo2() throws HeadlessException {
        Container contentPane = this.getContentPane();

        //生成列表的内容
        //String[] contents = {"1","2","3"};
        Vector contents = new Vector();
        //列表中需要放入内容
        JList jList = new JList(contents);

        contents.add("zhang");
        contents.add("li");
        contents.add("wu");

        contentPane.add(jList);

        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBoxDemo2();
    }
}