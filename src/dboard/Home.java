package dboard;

import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
    JLabel h,Th,im;
    ImageIcon img;
    public Home(){
        Dimension dh=Toolkit.getDefaultToolkit().getScreenSize();
        JPanel Homepane =new JPanel();
        Th=new JLabel("Let's Ace Your Exam");
        Th.setFont(new Font("Times New Roman",Font.ITALIC,50));
        Th.setBounds(300,120,500,500);

        h=new JLabel();

        img=new ImageIcon(getClass().getResource("OT_Logo.png"));
        im=new JLabel(img);
        Homepane.add(h);
        Homepane.add(im);
        Homepane.add(Th,BorderLayout.CENTER);
        this.add(Homepane);
        this.setVisible(true);
        this.setPreferredSize(new Dimension(dh.width,dh.height));
        Homepane.setLayout(new GridLayout(0,1));
    }

}
