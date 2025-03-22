import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    
    public static void main(String[] args) {
        
        try(FileOutputStream os = new FileOutputStream("ex.txt"))
        {
            String name = "hello";
            os.write(name.getBytes());
            System.out.println("Successfull");
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
