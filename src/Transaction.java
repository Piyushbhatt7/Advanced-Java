
import java.sql.Connection;
import java.sql.DriverManager;


public class Transaction {
    
    public static void main(String[] args) {
        
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
        } catch (Exception e) {
        }
    }
}
