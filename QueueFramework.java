import java.util.*;
public class QueueFramework {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty()
    
    public static void main(String[] args) {
        
       // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);  
        q.add(3);   
        q.add(4);       
        q.add(4);          
        q.add(5); 

        while(!q.isEmpty())
        {
            System.out.println(q.peek());                   
            q.remove(); 
        }
    }
}
