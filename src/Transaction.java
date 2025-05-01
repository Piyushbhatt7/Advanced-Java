
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Transaction {
    
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO accounts VALUES (1, 'John', 5000)");
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 1000 WHERE id = 1");

        }
         catch (Exception e) {

        }
    }
}
