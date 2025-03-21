
import java.io.File;
import java.io.IOException;

public class FileHandling {
    
    public static void main(String[] args) {
        
        // code to crete a new file
        
        try {
            File myFile = new File("file.txt");
            myFile.createNewFile();
        } 
        catch (IOException ex) {
            System.out.println("Enable to cretye file");
        }
    }
}
