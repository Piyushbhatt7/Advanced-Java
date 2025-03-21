
import java.io.File;

public class FileHandling {
    
    public static void main(String[] args) {
        
        File myFile = new File("file.txt");
        myFile.createNewFile();
    }
}
