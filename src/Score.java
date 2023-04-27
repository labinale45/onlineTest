import dboard.DashboardStudent;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import Frame.Myframe;
import dboard.sHome;

public class Score extends JFrame {
    //STest
    sHome sHo=new sHome();
    JButton sstart=sHo.getStart();
    DashboardStudent dashboardStudent=new DashboardStudent();
    JMenu shome= dashboardStudent.getHome();
    JMenu stest= dashboardStudent.getTest();
    JMenu sview= dashboardStudent.getView();
    JMenu slogout= dashboardStudent.getLogout();
    JMenuItem sdetails=dashboardStudent.getExamdetails();
    JMenuItem sreport=dashboardStudent.getReport();
    Myframe df=new Myframe("Online Test");
    JButton b1;
    ImageIcon logo;
    public Score(int score) {

        logo = new ImageIcon(getClass().getResource("OT_Logo.png"));
        setIconImage(logo.getImage());

        setBounds(0, 0, 550, 550);
        setBackground(Color.WHITE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);


        JLabel l2 = new JLabel("Thank you for giving the Online Test");
        l2.setBounds(45, 30, 700, 30);
        l2.setFont(new Font("", Font.PLAIN, 26));
        add(l2);

        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(180, 200, 300, 30);
        l3.setFont(new Font("", Font.PLAIN, 26));
        l3.setForeground(new Color(65, 45, 64));
        add(l3);

        b1 = new JButton("Home");
        b1.setBackground(new Color(65, 45, 64));
        b1.setForeground(Color.WHITE);

        b1.setBounds(200, 270, 120, 30);
        add(b1);

        //AnswerButton
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                df.setVisible(true);
                df.setLocationRelativeTo(null);
                df.setSize(900,800);
                df.getContentPane().removeAll();
                df.getContentPane().add(dashboardStudent,BorderLayout.NORTH);
                df.getContentPane().add(l3,BorderLayout.CENTER);
                df.getContentPane().revalidate();
                df.getContentPane().repaint();
            }
        });
        //S_Test
        stest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                df.getContentPane().removeAll();
                df.getContentPane().add(dashboardStudent, BorderLayout.NORTH);
                df.getContentPane().add(sHo, BorderLayout.CENTER);
                df.getContentPane().revalidate();
                df.getContentPane().repaint();}
            });
        //Start_test
        sstart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Test();}

                catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                df.setVisible(false);
            }
        });

    }
//    public static void main(String[] args)
  //      new Score(0).setVisible(true);
    //}
}