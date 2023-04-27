package Frame;

import javax.swing.*;

public class Myframe extends JFrame{
    ImageIcon logo;
       public Myframe(String onlineTest){

           logo = new ImageIcon(getClass().getResource("OT_Logo.png"));
           setIconImage(logo.getImage());
           setSize(900,800);
           setLocationRelativeTo(null);
           setResizable(true);
}
}
