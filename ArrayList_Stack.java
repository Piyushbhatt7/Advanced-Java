import java.util.ArrayList;
import java.util.List;

public class ArrayList_Stack {
    
    class Stack {
       static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
          return  list.size() == 0;
        }
        
        // push
        public static void push(int data)
        {
            list.add(data);
        }

        // pop
        public static int pop()
        {
            int top = list.get(List.size()-1);
            list.remove(list.size()-1);
            return top;
        }
    }
}
