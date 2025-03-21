
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading{

    public static void main(String[] args) {
        
        File obj = new File("wite.txt");

        try{     
            Scanner sc = new Scanner(obj); 
            while(sc.hasNext()) 
            {
                String line = sc.next();
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("error to read a file");
        }
       

    }
}