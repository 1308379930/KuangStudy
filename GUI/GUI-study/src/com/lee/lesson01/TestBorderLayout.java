package com.lee.lesson01;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout");

        Button button1 = new Button("East");
        Button button2 = new Button("West");
        Button button3 = new Button("South");
        Button button4 = new Button("North");
        Button button5 = new Button("Center");

        frame.add(button1,BorderLayout.EAST);
        frame.add(button2,BorderLayout.WEST);
        frame.add(button3,BorderLayout.SOUTH);
        frame.add(button4,BorderLayout.NORTH);
        frame.add(button5,BorderLayout.CENTER);

        frame.setSize(200,200);
        frame.setVisible(true);

    }
}
