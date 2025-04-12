
import java.util.Stack;

public class Stack_Recursion {
    
    public static void pushAtButtom(int data, Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            stack.push(data);
            return;
        }
       int top = stack.pop();
       pushAtButtom(data, stack);
       stack.push(top);
    }          
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);    
        stack.push(3); 
        Stack_Recursion.pushAtButtom(4, stack);

        while(!stack.isEmpty()) 
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
