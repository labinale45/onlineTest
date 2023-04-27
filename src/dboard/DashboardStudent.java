package dboard;

import javax.swing.*;
import java.awt.*;

public class DashboardStudent extends JMenuBar {
    JMenuItem Examdetails,Report;
    JMenu Home,Test,View,Logout;
   public DashboardStudent(){

           Home=new JMenu("Home");
           Test=new JMenu("Test");
           View=new JMenu("View");
           Logout=new JMenu("Logout");
           Examdetails=new JMenuItem("Exam Details");
           Report=new JMenuItem("Report");

           View.add(Examdetails);
           View.add(Report);
           this.add(Home);
           this.add(Test);
           this.add(View);
           this.add(Logout);

           Dimension display= Toolkit.getDefaultToolkit().getScreenSize();
           setBackground(new Color(232,226,232));
           Home.setForeground(Color.BLACK);
           Test.setForeground(Color.BLACK);
           View.setForeground(Color.BLACK);
           Logout.setForeground(Color.BLACK);
           setPreferredSize(new Dimension(display.width,30));
       }
    public JMenuItem getExamdetails(){return Examdetails;}
    public JMenuItem getReport(){return Report;}
    public JMenu getHome(){return Home;}
    public JMenu getTest(){return Test;}
    public JMenu getView(){return View;}
    public JMenu getLogout(){return Logout;}
}

