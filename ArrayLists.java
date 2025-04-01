import java.util.ArrayList;

public class ArrayLists {
    
    public static void main(String[] args) {

       //  Integer | Float | Boolean class
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list1 = new ArrayList<String>();
        // ArrayList<Boolean> list2 = new ArrayList<Boolean>();

        // add element

        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        // get
        int element = list.get(2);
        System.out.println(element);

        // add element in between
        
        list.add(1, 8);
        System.out.println(list);

        // set element // replace the existed element

        list.set(1, 5);
        System.out.println(list);

        // delete element

        list.remove(1);
        System.out.println(list); // need to pass the arry index


    }
}
