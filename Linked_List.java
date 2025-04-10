
import java.util.LinkedList;  // collection framework

public class Linked_List {
    
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addFirst("this");
        list.add("linked list"); // no need to specify the addLast because it automatically store in last
        System.out.println(list);

        System.out.println(list.size());

        for(int i = 0; i<list.size(); i++)
        {
            System.out.print(list.get(i) + " -> ");

        }
        System.out.println("null");

        // list.removeFirst();
        // System.out.println(list);        

        // list.removeLast();
        // System.out.println(list);

        list.remove(2);
        System.out.println(list);


    }
}
