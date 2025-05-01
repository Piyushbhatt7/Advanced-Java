
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class Transaction {
    
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
            conn.setAutoCommit(false);

            Statement stm = conn.createStatement();
        }
         catch (Exception e) {

        }
    }
}
