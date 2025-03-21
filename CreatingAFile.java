
import java.io.File;
import java.io.IOException;

public class CreatingAFile {
    
    public static void main(String[] args) {
        
        File myfile = new File("hii.txt");
        try {
            myfile.createNewFile();
            System.out.println("File created successfully");
        } 
        catch (IOException ex) {
            ex.printStackTrace();
        }
      
    }
}
