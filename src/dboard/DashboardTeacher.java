package dboard;

import javax.swing.*;
import java.awt.*;

public class  DashboardTeacher extends JMenuBar {
    JMenuItem Studentdetails,Examdetails,Report;
    JMenu Home,Create,View,Logout;
    public DashboardTeacher(){
        Home=new JMenu("Home");
        Create=new JMenu("Create");
        View=new JMenu("View");
        Logout=new JMenu("Logout");
        Studentdetails =new JMenuItem("Students Details");
        Examdetails=new JMenuItem("Exam Details");
        Report=new JMenuItem("Report");

        View.add(Studentdetails);
        View.add(Examdetails);
        View.add(Report);
        this.add(Home);
        this.add(Create);
        this.add(View);
        this.add(Logout);

        Dimension display= Toolkit.getDefaultToolkit().getScreenSize();
        setBackground(new Color(232,226,232));
        Home.setForeground(Color.BLACK);
        Create.setForeground(Color.BLACK);
        View.setForeground(Color.BLACK);
        Logout.setForeground(Color.BLACK);
        setPreferredSize(new Dimension(display.width,30));

    }

    public JMenuItem getStudentdetails(){return Studentdetails;}
    public JMenuItem getExamdetails(){return Examdetails;}
    public JMenuItem getReport(){return Report;}
    public JMenu getHome(){return Home;}
    public JMenu getCreate(){return Create;}
    public JMenu getView(){return View;}
    public JMenu getLogout(){return Logout;}
}
