import java.io.File;
import java.util.Scanner;

public class FileHandling {
    
    public static void main(String[] args) {
        
        
            // code to crete a new file
            
            //     try {
            //         File myFile = new File("file.txt");
            //         myFile.createNewFile();
            //     }
            //     catch (IOException ex) {
            //         System.out.println("Enable to cretye file");
            //     }
            
            
            // code to write to file

        //     try {

        //     FileWriter myFileWriter = new FileWriter("file.txt");
        //     myFileWriter.write("This is the prcatice to learn file writer \n OK now bye");
        //     myFileWriter.close();
        //     } 
        //     catch (IOException ex) {
        //         ex.printStackTrace();
        // }

        // reading a file

        File myFile = new File("file.txt");
        try {
            
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } 
        catch (Exception e) 
        {

        }

        
    }
}
