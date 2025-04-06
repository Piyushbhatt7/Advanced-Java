import java.util.LinkedList;

public class LinkedList_Search {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        int index = list.indexOf(7);
        
        if(index != -1)
        {
            System.out.println("Element found at index: " + index);
        }
        else
        {
            System.out.println("Element is not in the list");
        }
    }
}
