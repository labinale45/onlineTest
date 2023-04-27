package dboard;
import db.Connector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create extends JPanel {
    JLabel title,question,answer,opt1,opt2,opt3,opt4;
    JTextField que,ans,o1,o2,o3,o4;
    JButton create,edit;
    public Create(){
        Dimension Dc=Toolkit.getDefaultToolkit().getScreenSize();
        JPanel p1,ph,p2;
        this.setLayout(new BorderLayout());
        p1=new JPanel();
        ph=new JPanel();
        p2=new JPanel();

        title =new JLabel("     C  r  e  a  t  e  ");
      //  title.setBounds(20,0,500,30);
        title.setFont(new Font("Times New Roman",Font.BOLD,30));

        question=new JLabel("Enter Question : ");
        p1.add(question);
//        question.setBounds(300,120,100,20);
        que =new JTextField(80);
       // que.setFont(new Font("Times New Roman",Font.BOLD,26));
        p1.add(que);
  //      que.setBounds(300,140,300,20);


       answer=new JLabel("Enter Answer : ");
       p1.add(answer);
//    answer.setBounds(300,160,100,20);
       ans=new JTextField(80);
        p1.add(ans);

//       ans.setBounds(300,180,300,20);
       opt1=new JLabel("Option 1 : ");
        p1.add(opt1);

//        opt1.setBounds(300,200,100,20);
       o1=new JTextField(80);
        p1.add(o1);

//        ans.setBounds(200,220,300,20);


       opt2=new JLabel("Option 2 : ");
        p1.add(opt2);

//        ans.setBounds(200,240,100,20);
       o2=new JTextField(80);
        p1.add(o2);

//        ans.setBounds(200,260,300,20);


       opt3=new JLabel("Option 3 : ");
        p1.add(opt3);

//        ans.setBounds(200,280,100,20);
       o3=new JTextField(80);
        p1.add(o3);
//        ans.setBounds(300,300,300,20);

        opt4=new JLabel("Option 4 : ");
        p1.add(opt4);
        o4=new JTextField(80);
        p1.add(o4);


       create=new JButton("Create");
        p1.add(create);
//        create.setBounds(300,320,100,20);

//       p2.setSize(0,0);

       this.add(title,BorderLayout.NORTH);

       // p1.setLayout(new GridLayout(6,2));

//        ph.setPreferredSize(new Dimension(Dc.width,Dc.height));
        this.add(p1,BorderLayout.CENTER);
    }

    public JButton getCreate() {
        return create;
    }
    public JTextField getAns() {
        return ans;
    }

    public JTextField getQue() {
        return que;
    }

    public JTextField getO1() {
        return o1;
    }

    public JTextField getO2() {
        return o2;
    }

    public JTextField getO3() {
        return o3;
    }
    public JTextField getO4(){return o4;}
}
