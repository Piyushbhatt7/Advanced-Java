import java.io.FileOutputStream;

public class OutputStream {
    
    public static void main(String[] args) {
        
        try(FileOutputStream os = new FileOutputStream("ex.txt"))
        {
            String name = "hello";
            System.out.println();
        }
    }
}
