import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import dboard.DashboardTeacher;
import dboard.DashboardStudent;
import dboard.sHome;
import dboard.Create;
import db.Connector;
import dboard.Home;
import Frame.Myframe;
import dboard.View;

public class Main extends Connector{

    public Main() throws SQLException {
        //Registration Form

        JFrame f=new JFrame();
        JLabel l1=new JLabel("C R E A T E  A C C O U N T");
        l1.setBounds(180,10,300,30);
        f.add(l1);
        JLabel l2 =new JLabel("Full Name");
        l2.setBounds(180,80,200,20);
        f.add(l2);

        JTextField b=new JTextField();

        b.setBounds(180,120,100,20);  f.add(b);

        JTextField b1=new JTextField();
        b1.setBounds(300,120,100,20);   f.add(b1);


        JLabel l3=new JLabel("Email");
        l3.setBounds(180,140,100,20); f.add(l3);
        JTextField t3=new JTextField();
        t3.setBounds(180,170,225,20);  f.add(t3);

        JLabel l4=new JLabel("Gender");
        l4.setBounds(180,190,100,20);  f.add(l4);
        JTextField t4=new JTextField();   f.add(t4);
        t4.setBounds(180,210,100,20);
        JLabel l5=new JLabel("Contact no."); f.add(l5);
        l5.setBounds(180,240,100,20);
        JTextField t5=new JTextField();
        t5.setBounds(180,260,100,20);  f.add(t5);
        JLabel l6=new JLabel("Address");    f.add(l6);
        l6.setBounds(300,240,100,20);
        JTextField t6=new JTextField();
        t6.setBounds(300,260,100,20);  f.add(t6);

        JLabel l7=new JLabel("Password");
        l7.setBounds(180,290,100,20);  f.add(l7);
        JPasswordField p7=new JPasswordField();
        p7.setBounds(180,310,100,20);  f.add(p7);


        JButton l8=new JButton("Already have account"); f.add(l8);
        l8.setBounds(200,400,200,20);
        l8.setContentAreaFilled(false);
        l8.setBorderPainted(false);
        JButton b8=new JButton("create");
        f.add(b8);
        b8.setBounds(400,400,80,20);

        JPanel p=new JPanel();
        p.setLayout(new BorderLayout());
        f.setTitle("sign up");
        p.setBounds(0,0,175,500);
        p.setBackground(new Color(65,45,64));
        p.setVisible(true);
        f.add(p);
        JPanel p1=new JPanel();
        p1.setBounds(0,20,20,20);
        f.add(p1);

        //Logo
        ImageIcon logo;
        logo = new ImageIcon(getClass().getResource("OT_Logo.png"));
        f.setIconImage(logo.getImage());
        JLabel l =new JLabel(logo);
        p.add(l);

        //Dashboard_Frame
        Myframe df=new Myframe("Online Test");

        //View_student
        View vs=new View();


        //Teacher Dashboard
        DashboardTeacher dashboardTeacher=new DashboardTeacher();
        JMenu mhome= dashboardTeacher.getHome();
        JMenu mcreate=dashboardTeacher.getCreate();
        JMenu mview=dashboardTeacher.getView();
        JMenu mlogout=dashboardTeacher.getLogout();
        JMenuItem mstudentdetails=dashboardTeacher.getStudentdetails();
        JMenuItem mexam=dashboardTeacher.getExamdetails();
        JMenuItem mreport=dashboardTeacher.getReport();

        //Student Dashboard
        DashboardStudent dashboardStudent=new DashboardStudent();
        JMenu shome= dashboardStudent.getHome();
        JMenu stest= dashboardStudent.getTest();
        JMenu sview= dashboardStudent.getView();
        JMenu slogout= dashboardStudent.getLogout();
        JMenuItem sdetails=dashboardStudent.getExamdetails();
        JMenuItem sreport=dashboardStudent.getReport();

        //CreateDb
       Create Cr =new Create();
        JButton create=Cr.getCreate();
        JTextField que=Cr.getQue();
        JTextField ans=Cr.getAns();
        JTextField o1=Cr.getO1();
        JTextField o2=Cr.getO2();
        JTextField o3=Cr.getO3();
        JTextField o4=Cr.getO4();

        //HomeDb
        Home Ho=new Home();

        //STest
        sHome sHo=new sHome();
        JButton sstart=sHo.getStart();


        //Login Page
        JFrame fl =new JFrame("Login");
        JLabel l_l1 = new JLabel("L O G I N");
        l_l1.setBounds(270, 10, 300, 60);
        l_l1.setFont(new Font(l_l1.getFont().getName(), l_l1.getFont().getStyle(), 30));
        fl.add(l_l1);

        //Login_Field
       JLabel l_l2 = new JLabel("Email :");
        l_l2.setBounds(180, 120, 100, 20);
        fl.add(l_l2);
        JTextField l_t = new JTextField();
        l_t.setBounds(250, 120, 200, 20);
        fl.add(l_t);

        JLabel l_l3 = new JLabel("Password :");
        l_l3.setBounds(180, 170, 100, 20);
        fl.add(l_l3);
        JPasswordField l_t3 = new JPasswordField();
        l_t3.setBounds(250, 170, 200, 20);
        fl.add(l_t3);

        JButton l_l5 = new JButton("Create Account");
        l_l5.setBounds(250, 410, 150, 20);
        l_l5.setContentAreaFilled(false);
        l_l5.setBorderPainted(false);

        fl.add(l_l5);
        JButton l_b2 = new JButton("Login");
        l_b2.setBounds(305, 220, 80, 20);
        fl.add(l_b2);


        JPanel l_p = new JPanel();
        fl.setTitle("L o g i n");

        l_p.setBounds(0, 0, 175, 500);
        l_p.setBackground(new Color(65,45,64));
        fl.setIconImage(logo.getImage());
        JLabel Logo_l =new JLabel(logo);
        l_p.setLayout(new BorderLayout());


        l_p.add(Logo_l);
        l_p.setVisible(true);
        fl.add(l_p);


        JPanel l_p1 = new JPanel();
        l_p1.setBounds(0, 20, 20, 20);
        fl.add(l_p1);


        //Create Account Button
        l_l5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    fl.setVisible(false);
                    f.setVisible(true);
                    System.out.println("Directed to Registration form");
                }catch(Exception e2){
                    System.out.println(e2);
                    System.out.println("Filed to direct to registration form");
                }
            }
        });


        //Already have account button
        l8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    f.setVisible(false);
                    fl.setVisible(true);
                    System.out.println("Directed to Login page");

                }
                catch(Exception e1){
                    System.out.println(e1);
                    System.out.println("failed to direct to login page");
                }
            }
        });

        //Create_Button
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Firstname = b.getText();
                String Lastname = b1.getText();
                String Gender = t4.getText();
                String Email = t3.getText();
                String Password =String.valueOf(p7.getPassword());
                String Address = t6.getText();
                String Contact =t5.getText();
                //Email Validation
                String email_v ="^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
                 Pattern pattern = Pattern.compile(email_v);
                 Matcher match= pattern.matcher(Email);
                 if(Firstname.equals("")||Lastname.equals("")||Gender.equals("")||Email.equals("")||Password.equals("")||Address.equals("")||Contact.equals("")){
                     JOptionPane.showMessageDialog(f,"Please Fill Up the Empty Fields.","Details Missing",JOptionPane.WARNING_MESSAGE );
                 }else {

                 if(match.matches()){
                try {
                    String sql="INSERT INTO USR(First_Name,Last_Name,Gender,Email,Password,Address,Phone)"+"VALUES(?,?,?,?,?,?,?)";
                    PreparedStatement statement = getConnector().prepareStatement(sql);
                    statement.setString(1,Firstname);
                    statement.setString(2,Lastname);
                    statement.setString(3,Gender);
                    statement.setString(4,Email);
                    statement.setString(5,Password);
                    statement.setString(6,Address);
                    statement.setString(7,Contact);
                    int row=statement.executeUpdate();
                    b.setText(null);
                    b1.setText(null);
                    t3.setText(null);
                    t4.setText(null);
                    t5.setText(null);
                    t6.setText(null);
                    p7.setText(null);
                    f.setVisible(false);
                    fl.setVisible(true);
                    System.out.println("Details Processed");
                    JOptionPane.showMessageDialog(f,"Details Processed Successfully","Details Saved",JOptionPane.INFORMATION_MESSAGE);

                } catch (SQLException ex) {
                    System.out.println("Details Failed to Processed");
                    throw new RuntimeException(ex);
                }
            }else{
                     JOptionPane.showMessageDialog(f, "Invalid email.", "Invalid", JOptionPane.ERROR_MESSAGE);
                 }
                 }
                 }
                 });

        // LOGIN button
        l_b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String First_Name=null;
                String Last_Name=null;
                String Gender=null;
                String Email=null;
                String Password=null;
                String Address=null;
                String Phone=null;
                String Status=null;

                try{
                    String sql="SELECT * FROM usr";
                    Statement stmt=getConnector().createStatement();
                    ResultSet rs= stmt.executeQuery(sql);
                    int ID=0;
                    boolean Match=false;
                    while (rs.next()){
                        ID=Integer.parseInt(rs.getString("ID"));
                        First_Name=rs.getString("First_Name");
                        Last_Name=rs.getString("Last_Name");
                        Gender=rs.getString("Gender");
                        Email=rs.getString("Email");
                        Password=rs.getString("Password");
                        Address=rs.getString("Address");
                        Phone=rs.getString("Phone");
                        Status=rs.getString("Status");
                        //cover
                        JLabel c =new JLabel("Welcome "+ First_Name +" "+ Last_Name);
                        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
                        JPanel cov=new JPanel();
                        c.setForeground(new Color(65,45,64));
                        c.setFont(new Font("Times New Roman",Font.BOLD,30));
                        cov.setPreferredSize(new Dimension(d.width,40));
                        cov.add(c,BorderLayout.CENTER);

                        String password = new String(l_t3.getPassword());
                        String username = l_t.getText();
                        if (Objects.equals(Email,username) && Objects.equals(Password,password)&& Objects.equals(Status,"teacher"))
                        {
                            fl.setVisible(false);
                            df.setVisible(true);
                            df.getContentPane().removeAll();
                            df.getContentPane().add(dashboardTeacher,BorderLayout.NORTH);
                            df.add(cov);
                            df.getContentPane().revalidate();
                            df.getContentPane().repaint();
                            System.out.println("Welcome "+ First_Name +" "+Last_Name );
                            l_t.setText(null);
                            l_t3.setText(null);
                            Match=true;
                        } else if (Objects.equals(Email,username) && Objects.equals(Password,password)&& Objects.equals(Status,"student")) {
                            fl.setVisible(false);
                            df.setVisible(true);
                            df.getContentPane().removeAll();
                            df.getContentPane().add(dashboardStudent,BorderLayout.NORTH);
                            df.add(cov);
                            df.getContentPane().revalidate();
                            df.getContentPane().repaint();
                            System.out.println("Welcome "+ First_Name +" "+Last_Name );
                            l_t.setText(null);
                            l_t3.setText(null);
                            Match=true;

                        }
                    }
                    if(!Match){
                        JOptionPane.showMessageDialog(fl,"Email OR Password Incorrect","Error Massage", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        //S_Home
        shome.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                df.getContentPane().removeAll();
                df.getContentPane().add(dashboardStudent, BorderLayout.NORTH);
                df.getContentPane().add(Ho, BorderLayout.CENTER);
                df.getContentPane().revalidate();
                df.getContentPane().repaint();
            }
        });
        //S_Logout
        slogout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                df.setVisible(false);
                fl.setVisible(true);

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
                df.getContentPane().repaint();
            }
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



                //T_HOme menu
                mhome.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        df.getContentPane().removeAll();
                        df.getContentPane().add(dashboardTeacher, BorderLayout.NORTH);
                        //df.getContentPane().add(cov);
                        df.getContentPane().add(Ho, BorderLayout.CENTER);
                        df.getContentPane().revalidate();
                        df.getContentPane().repaint();
                    }
                });

                //T_Create menu
                mcreate.addMouseListener(new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        df.getContentPane().removeAll();
                        df.getContentPane().add(dashboardTeacher, BorderLayout.NORTH);
                        df.getContentPane().add(Cr, BorderLayout.CENTER);
                        df.getContentPane().revalidate();
                        df.getContentPane().repaint();
                    }
                });

                //T_Create button question
                create.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String Qust = que.getText();
                        String answ = ans.getText();
                        String option1 = o1.getText();
                        String option2 = o2.getText();
                        String option3 = o3.getText();
                        String option4 = o4.getText();

                        if (que.equals("") || ans.equals("") || o1.equals("") || o2.equals("") || o3.equals("") || o4.equals(""))
                        {
                            JOptionPane.showMessageDialog(df,"Please Fill Up the Empty Fields.", "Details Missing", JOptionPane.WARNING_MESSAGE);
                        }else{
                            try {
                                String csql = "INSERT INTO questions(question,answer,option1,option2,option3,option4)" + "VALUES(?,?,?,?,?,?)";
                                PreparedStatement statement = getConnector().prepareStatement(csql);
                                statement.setString(1, Qust);
                                statement.setString(2, answ);
                                statement.setString(3, option1);
                                statement.setString(4, option2);
                                statement.setString(5, option3);
                                statement.setString(6, option4);
                                int row1 = statement.executeUpdate();
                                que.setText(null);
                                ans.setText(null);
                                o1.setText(null);
                                o2.setText(null);
                                o3.setText(null);
                                o4.setText(null);

                                String sql1 = "SELECT * FROM questions";
                                Statement stmt = getConnector().createStatement();
                                ResultSet rs = stmt.executeQuery(sql1);
                                while (rs.next()) {
                                    String quest = rs.getString("question");
                                    System.out.println(quest);
                                }
                                System.out.println("Question submitted");
                            } catch (Exception ec) {
                                System.out.println(ec);
                                System.out.println("failed to create");
                            }
                        }
                    }

                });


                //T_Logout menu
                mlogout.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        df.setVisible(false);
                        fl.setVisible(true);
                    }
                });

                //Teacher View Studentdetails
        DefaultTableModel tm= vs.getTableModel();
        JTable table=vs.getTable();
        Statement stmt=null;
        Statement stmt2=null;
        try{
            String sql="SELECT * FROM usr";
            stmt =getConnector().createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                int ID=rs.getInt("ID");
                String name=rs.getString("First_Name");
                String lastname=rs.getString("Last_Name");
                String phone=rs.getString("Phone");
                String email=rs.getString("Email");
                String address=rs.getString("Address");
                String[] vals = {String.valueOf(ID),name,lastname,phone,email,address};
                tm.addRow(vals);
            }
            rs.close();
            stmt.close();

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        //T_Student details
        mstudentdetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                df.getContentPane().removeAll();
                df.getContentPane().add(dashboardTeacher,BorderLayout.NORTH);
                df.getContentPane().add(vs,BorderLayout.CENTER);
                df.getContentPane().revalidate();
                df.getContentPane().repaint();
            }
        });

                fl.setSize(500, 500);
                fl.setLayout(new BorderLayout());
                fl.setLocationRelativeTo(null);
                fl.setVisible(true);
                fl.setResizable(false);

                f.setSize(500, 500);
                f.setLayout(null);
                f.setLocationRelativeTo(null);
                f.setVisible(false);

            }
            public static void main(String[] args) throws SQLException {
                Main Acc = new Main();
            }
        }