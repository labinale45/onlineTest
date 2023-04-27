package dboard;

import javax.swing.*;
import java.awt.*;

public class sHome extends JPanel {
    JLabel h,Th,im;
    ImageIcon img;
    JButton Start;
    public sHome(){
        Dimension dh=Toolkit.getDefaultToolkit().getScreenSize();
        JPanel Homepane =new JPanel();
        this.setLayout(new BorderLayout());

        Start =new JButton("Start Test");
       // Start.setBounds(120,30,500,30);

        Th=new JLabel("Let's Ace Your Exam");
        Th.setFont(new Font("Times New Roman",Font.ITALIC,50));
        Th.setBounds(300,120,500,500);

        h=new JLabel();

        img=new ImageIcon(getClass().getResource("OT_Logo.png"));
        im=new JLabel(img);
        Homepane.add(h);
        Homepane.add(im);
        this.add(Start,BorderLayout.NORTH);
        Homepane.add(Th,BorderLayout.SOUTH);
        this.add(Homepane);
        this.setVisible(true);
        Homepane.setPreferredSize(new Dimension(dh.width,dh.height));
    }

    public JButton getStart() {
        return Start;
    }
}
