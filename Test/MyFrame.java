import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Mydialog extends JDialog{
    public Mydialog(MyFrame frame){
        super(frame,"确定？",true);
        Container container = getContentPane();
        container.add(new JLabel("没了"));
        setBounds(120,120,100,100);
    }
}
public class MyFrame extends JFrame {
    public MyFrame(){
        Container container = getContentPane();
        container.setLayout(null);
        JButton jb = new JButton("确定");
        jb.setBounds(100,100,100,20);
        container.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mydialog my = new Mydialog(MyFrame.this);
                my.setVisible(true);
            }
        });
        setSize(1000,1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
