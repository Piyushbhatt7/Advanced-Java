import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Collection_LinkedList_Reverse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        System.out.println("Enter the numbers: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers: ");
        
        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            list.add(value);
        }

        System.out.println("Original List: " + list);

        Collections.reverse(list);
        System.out.println(list);
        sc.close();
    }
}
