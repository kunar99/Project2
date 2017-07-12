package com.johnclayton;

import javax.swing.*;

public class Gui extends JFrame {

    static final int WIDTH = 300, HEIGHT = 300;

    public Gui() {
        super("ATM");
        setFrame(WIDTH, HEIGHT);
    }

    public Gui(String title) {

        super(title);
        setFrame(WIDTH, HEIGHT);
    }

    public void display() {
        setVisible(true);
    }

    private void setFrame(int width, int height) {
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public BorderFrame(){
        super("Border Frame", 300, 200);

    }

}
















//
//public class HelloWorldApplication extends Gui {
//    HelloWorldApplication() {
//        super("Hello World", 270, 180);
//    }
//    public void paint(Graphics g){
//        g.drawString("HelloWorld!", 100, 100);
//    }
//    static public void main(String[] args)  {
//        HelloWorldApplication hwApp = new HelloWorldApplication();
//        hwApp.display();
//    }
//}
