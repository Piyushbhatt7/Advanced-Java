import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Collection_LinkedList_Reverse {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        //list = sc.nextInt();
        while(sc.hasNext())
        {
            list.add(sc.nextInt());
        }

        System.out.println("Original List: " + list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
