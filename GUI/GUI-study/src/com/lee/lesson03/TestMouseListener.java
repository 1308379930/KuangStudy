package com.lee.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}
class MyFrame extends Frame{
    //画画需要画笔，需要监听鼠标当前的位置，需要集合来存储这个点
    private ArrayList points;

    public MyFrame(String title){
        super(title);
        setBounds(200,200,400,300);
        setVisible(true);
        //存鼠标点击的点
        points = new ArrayList<>();

        //鼠标监听器，针对这个窗口
        this.addMouseListener(new MyMouseListener());
    }

    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标事件
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){
            Point point = (Point) iterator.next();//返回当前并指向下一个
            g.setColor(Color.BLUE);
            //点表示出来是实心圆形
            g.fillOval(point.x,point.y,10,10);
        }

    }
    //添加一个点到界面上
    public void addPoint(Point point){
        points.add(point);
    }

    //适配器模式，不去实现MouseListener的所有接口
    //而是去继承一个实现好的类，只重写我们需要的
    private class MyMouseListener extends MouseAdapter{
        //鼠标有三种状态 按下 弹起 按住不放

        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame) e.getSource();
            //这里我们点击的时候就会在界面上产生一个点
            //这个点就是鼠标的点
            myFrame.addPoint(new Point(e.getX(),e.getY()));

            //每次点击鼠标都需要重新画一次
            myFrame.repaint();
        }
    }


}