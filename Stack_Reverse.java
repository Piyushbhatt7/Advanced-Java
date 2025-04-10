
import java.util.Stack;

public class Stack_Reverse{

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

    public static void reverse(Stack<Integer> stack)
    {
        
    }
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
       

        while(!stack.isEmpty()) 
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}