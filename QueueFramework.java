import java.util.*;
public class QueueFramework {

    static class Queue{

    
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty()
    {
       return s1.isEmpty();
    }
    public static void add(int data)
    {
        if(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        s1.push(data);
        
    }
}
    
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
