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
            setTitle("��������Ĵ�С��������Ĵ�С");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 300);
        }

        protected void do_this_windowOpened(WindowEvent e) {
            Toolkit toolkit = getToolkit();// ��ô��幤�߰�
            Dimension screenSize = toolkit.getScreenSize();// ��ȡ��Ļ��С
            int width = (int) (screenSize.width * 0.8);// ����������Ļ��ȵ�0.8��
            int height = (int) (screenSize.height * 0.8);// ����߶�����Ļ�߶ȵ�0.8��
            setSize(width, height);// ���ô����С
        }
}
