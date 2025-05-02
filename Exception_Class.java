
import java.util.Scanner;

public class Exception_Class extends Exception{
    
    @Override
    public String toString()
    {
        return super.toString() + "I am string";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "I am get message";
    }

    
    
    public static void main(String[] args) {
        
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99){
            throw new Exception_Class();
        }
    }
}
