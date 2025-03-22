import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferInputStream {
    
    public static void main(String[] args) {
        
        try(BufferInputStream bis = new BufferInputStream(new FileInputStream("ex.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("ex.txt");)
        )
        {
            int i;
            
        }
    }
}
