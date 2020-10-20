package com.lee.lesson03;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        //我们只调用了loadFrame，但是子类重写父类的方法也被执行了
        new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame {

    public void loadFrame(){

        setBounds(200,200,600,500);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g){
        //画笔可以有颜色，可以画画
        g.setColor(Color.red);
        //空心圆
        g.drawOval(100,100,100,100);
        //实心圆
        g.fillOval(100,100,100,100);
        g.setColor(Color.BLUE);
        g.fillRect(150,200,200,200);
        //养成习惯画笔用完，将它还原到最初的颜色 黑色
        g.setColor(Color.BLACK);

    }
}
