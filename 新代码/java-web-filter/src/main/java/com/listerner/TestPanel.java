package com.listerner;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame=new Frame("中秋节快乐");//新建窗体
        Panel panel=new Panel(null);//面板
        frame.setLayout(null);//设置窗体的布局
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(0,0,255));//设置背景颜色
        panel.setBounds(50,50,300,300);
        panel.setBackground(new Color(0,255,0));
        frame.add(panel);
        frame.setVisible(true);
        //监听事件，监听关闭事件
        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                System.out.println("打开");
            }

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            public void windowClosed(WindowEvent e) {

            }

            public void windowIconified(WindowEvent e) {

            }

            public void windowDeiconified(WindowEvent e) {

            }

            public void windowActivated(WindowEvent e) {

            }

            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}
