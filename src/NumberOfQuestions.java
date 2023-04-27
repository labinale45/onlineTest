import db.Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NumberOfQuestions {
    public static int count;
    public  int getCount() {
        return count;
    }
    public NumberOfQuestions() throws SQLException {
        Connection con = Connector.getConnector();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM questions ");

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                count = rs.getInt(1);
            }

        } catch (Exception ex) {

            System.out.println(ex);

        }
    }

    public static void main(String args[]) throws SQLException {
        new NumberOfQuestions();
         System.out.print("Count "+count);
    }

}
