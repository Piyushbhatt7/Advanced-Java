
import java.util.Stack;

public class Stack_Recursion {
    
    public static void pushAtButtom(int data)
    {

    }
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
