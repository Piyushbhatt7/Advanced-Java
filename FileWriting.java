import java.io.File;
import java.io.FileWriter;

public class FileWriting {
    
    public static void main(String[] args) {
        
        File obj = new File("wite.txt");
        try {
            
            FileWriter writer = new FileWriter(obj);
            writer.write("Pussy boy");
        } 
        catch (Exception e) {
            System.out.println("An error occured");
        }
    }
}
