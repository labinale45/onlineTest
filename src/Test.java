import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import db.Connector;
import dboard.DashboardStudent;
import Frame.Myframe;
public class Test implements ActionListener{
    NumberOfQuestions numberOfQuestions = new NumberOfQuestions();
    public int numberofQuestion = numberOfQuestions.getCount();
    JFrame frame;
    JLabel question,im;
    JRadioButton option1, option2, option3, option4;
    JButton save,submit;
    String Questions[][] = new String[numberofQuestion][5];
    String Answers[][]   = new String[numberofQuestion][1];
    String pa[][] = new String[numberofQuestion][1];
    String Username;
    ButtonGroup options;
    public static int i=0;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public  int score = 0;
    ImageIcon img;
    public Test() throws SQLException {

        frame = new JFrame();
        question = new JLabel();
        option1 = new JRadioButton();
        option2 = new JRadioButton();
        option3 = new JRadioButton();
        option4 = new JRadioButton();
        save = new JButton("Next");
        submit = new JButton("Submit");
        question.setBounds(10, 10, 850, 50);
        option1.setBounds(10, 60, 200, 50);
        option2.setBounds(10, 110, 200, 50);
        option3.setBounds(10, 160, 200, 50);
        option4.setBounds(10, 210, 200, 50);
        save.setBounds(40, 260, 150, 40);
        submit.setBounds(200, 260, 80, 40);
        options = new ButtonGroup();
        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);
        Connection con = Connector.getConnector();
        try {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM questions");

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.print("i " +i);
                Questions[i][0] = rs.getString("question");
                Questions[i][1] = rs.getString("option1");
                Questions[i][2] = rs.getString("option2");
                Questions[i][3] = rs.getString("option3");
                Questions[i][4] = rs.getString("option4");
                Answers[i][0] = rs.getString("answer");

                i = i+1;
            }

        } catch (Exception ex) {

            System.out.println(ex);

        }
        save.addActionListener(this);
        submit.addActionListener(this);
        img=new ImageIcon(getClass().getResource("OT_Logo.png"));
        frame.setIconImage(img.getImage());
        im=new JLabel(img);

        frame.add(question);
        frame.add(option1);
        frame.add(option2);
        frame.add(option3);
        frame.add(option4);
        frame.add(save);
        frame.add(submit);


        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.add(im,BorderLayout.SOUTH);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true) ;
        frame.setTitle("Test is Running");
        start(0);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == save){

            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);

            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            if(count == (numberofQuestion-2)){
                save.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] ="";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int ii =0 ; ii < pa.length ; ii++){
                System.out.println(ii);
                if(pa[ii][0].equals(Answers[ii][0])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            System.out.println(score);
            frame.setVisible(false);
            new Score(score).setVisible(true);

        }
    }

    public void start(int count){

        question.setText(Questions[count][0]);
        option1.setText(Questions[count][1]);
        option1.setActionCommand(Questions[count][1]);
        option2.setText(Questions[count][2]);
        option2.setActionCommand(Questions[count][2]);
        option3.setText(Questions[count][3]);
        option3.setActionCommand(Questions[count][3]);
        option4.setText(Questions[count][4]);
        option4.setActionCommand(Questions[count][4]);
        options.clearSelection();
    }
    public JButton getSubmit(){ return submit;}
    public String[][] getQuestions() {
        return Questions;
    }

    public String[][] getAnswers() {
        return Answers;
    }

    public JFrame getFrame() {
        return frame;
    }
}
