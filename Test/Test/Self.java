package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Locale;


public class Self extends JFrame{
    public static void main(String[] args) {
            Self frame = new Self();
            frame.setVisible(true);
        }

	public Self(){
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowOpened(WindowEvent e) {
                    do_this_windowOpened(e);
                }
            });
            setTitle("根据桌面的大小调整窗体的大小");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
        }

        protected void do_this_windowOpened(WindowEvent e) {
            Toolkit toolkit = getToolkit();// 获得窗体工具包
            Dimension screenSize = toolkit.getScreenSize();// 获取屏幕大小
            int width = (int) (screenSize.width * 0.8);// 窗体宽度是屏幕宽度的0.8倍
            int height = (int) (screenSize.height * 0.8);// 窗体高度是屏幕高度的0.8倍
            setSize(width, height);// 设置窗体大小
        }
}
