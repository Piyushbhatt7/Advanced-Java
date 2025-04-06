
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListEx {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter number between 1-50");
        Scanner sc = new Scanner(System.in);
        int num;
        
        while (true) { 
            
            num = sc.nextInt();

            if(num == 0)
            {
                break;
            }

            if(num < 1 || num > 50)
            {
                System.out.println("Please enter a number between 1-50 or exit");
                continue;
            }
            list.add(num);
        }


       
        

    }
}
