
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    
    public static void main(String[] args) {
        
        try(FileInputStream is = new FileInputStream("ex.txt"))
        {
            int i;
            while((i = is.read()) != -1)
            {
                System.out.println((char)i);
            } 

        }   

        catch(IOException e)
        {
            System.out.println(e.getMessage());

        }
    }
}
