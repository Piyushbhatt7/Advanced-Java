
import com.sun.net.httpserver.Headers;

public class StackClass {
    
    static class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            next = null;
        }

        static class Stack{
             public static Node head;
             public static boolean isEmpty()
             {
                return head == null;
             }
             public static void push(int data) {
             Node newNode = new Node(data);
                if(isEmpty())
                {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
             }

              public static int pop()
              {
                if(isEmpty())
                {
                    return -1;
                }
                int top = head.next;
                head = head.next;
                return top;
              }
              public static int peek()
              {
                if(isEmpty())
                {
                    return -1;
                }
                return head.data;
              }
             
        }


    }
}
