
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Transaction {
    
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "password");
        try {
           
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO accounts VALUES (1, 'John', 5000)");
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 1000 WHERE id = 1");
            conn.commit();
            

        }
         catch (SQLException e) {
           conn.rollback();
           System.out.println("Transcation failed");
        }
    }
}
