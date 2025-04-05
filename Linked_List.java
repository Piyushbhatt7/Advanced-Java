
import java.util.LinkedList;

public class Linked_List {
    
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addFirst("this");
        list.addLast("linked list");
        System.out.println(list);
    }
}
