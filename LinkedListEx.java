
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEx {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num != 0)
        {
            if(num < 1 || num < 50)
            {
                System.out.println("Enter number between 1-50");
            }
        }

    }
}
